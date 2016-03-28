/*
XOWA: the XOWA Offline Wiki Application
Copyright (C) 2012 gnosygnu@gmail.com

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package gplx.dbs.engines.tdbs; import gplx.*; import gplx.dbs.*; import gplx.dbs.engines.*;
import gplx.core.gfo_ndes.*; import gplx.core.stores.*;
import gplx.core.lists.*; import gplx.dbs.qrys.*; import gplx.dbs.sqls.*; import gplx.dbs.sqls.itms.*;
class TdbInsertWkr implements Db_qryWkr {
	public Object Exec(Db_engine engineObj, Db_qry cmdObj) {
		TdbEngine engine = TdbEngine.cast(engineObj); Db_qry_insert cmd = (Db_qry_insert)cmdObj;

		TdbTable tbl = engine.FetchTbl(cmd.Base_table());
		tbl.IsDirty_set(true);
		return cmd.Select() == null
			? InsertRowsByVals(engine, tbl, cmd)
			: InsertRowsBySelect(engine, tbl, cmd);
	}
	int InsertRowsBySelect(TdbEngine engine, TdbTable tbl, Db_qry_insert insert) {
		int count = 0;
		DataRdr rdr = (DataRdr)TdbSelectWkr.Instance.Exec(engine, insert.Select());
		Sql_select_fld_list insertFlds = insert.Cols(); int insertFldsCount = insertFlds.Len();
		GfoFldList selectFldsForNewRow = null;
		try {selectFldsForNewRow = TdbSelectWkr.To_GfoFldLst(tbl, insertFlds);}
		catch (Exception e) {throw Err_.new_exc(e, "db", "failed to generate flds for new row");}
		if (insertFldsCount > selectFldsForNewRow.Count()) throw Err_.new_wo_type("insert flds cannot exceed selectFlds", "insertFlds", To_str(insertFlds), "selectFlds", selectFldsForNewRow.To_str());
		while (rdr.MoveNextPeer()) {
			count++;
			GfoNde row = GfoNde_.vals_(selectFldsForNewRow, new Object[insertFldsCount]);
			for (int i = 0; i < insertFldsCount; i++) {
				row.WriteAt(i, rdr.ReadAt(i));	// NOTE: SELECT and INSERT flds are in same order; ex: INSERT INTO (a, b) SELECT (b, a)
			}
			tbl.Rows().Add(row);
		}
		return count;
	}
	int InsertRowsByVals(TdbEngine engine, TdbTable tbl, Db_qry_insert insert) {
		GfoNde row = GfoNde_.vals_(tbl.Flds(), new Object[tbl.Flds().Count()]);
		for (int i = 0; i < insert.Args().Count(); i++) {
			Keyval kv = insert.Args().Get_at(i);
			Db_arg arg = (Db_arg)kv.Val();
			row.Write(kv.Key(), arg.Val);
		}
		tbl.Rows().Add(row);
		return 1;
	}
	private String To_str(Sql_select_fld_list flds) {
		Bry_bfr bfr = Bry_bfr.new_();
		for (int i = 0; i < flds.Len(); i++) {
			Sql_select_fld fld = flds.Get_at(i);
			bfr.Add_str_u8(String_.Format("{0},{1}|", fld.Fld, fld.Alias));
		}
		return bfr.To_str();
	}
	public static TdbInsertWkr new_() {TdbInsertWkr rv = new TdbInsertWkr(); return rv;}
}
