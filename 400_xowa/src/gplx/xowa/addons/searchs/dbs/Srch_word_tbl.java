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
package gplx.xowa.addons.searchs.dbs; import gplx.*; import gplx.xowa.*; import gplx.xowa.addons.*; import gplx.xowa.addons.searchs.*;
import gplx.dbs.*;
public class Srch_word_tbl implements Rls_able {
	public final    String tbl_name;
	public final    Dbmeta_fld_list flds = Dbmeta_fld_list.new_();
	public final    String fld_id, fld_text, fld_link_count, fld_link_count_score, fld_link_score_min, fld_link_score_max;
	public final    Db_conn conn; private Db_stmt stmt_insert, stmt_select_by;
	public Srch_word_tbl(Db_conn conn, boolean schema_is_1) {
		this.conn = conn;
		String fld_prefix = "", fld_text_name = "word_text";
		if (schema_is_1)			{tbl_name = "search_title_word"; fld_prefix = "stw_"; fld_text_name = "stw_word";}
		else						{tbl_name = "search_word";}
		this.fld_id					= flds.Add_int_pkey(fld_prefix + "word_id");
		this.fld_text				= flds.Add_str(fld_text_name, 255);
		this.fld_link_count			= flds.Add_int("link_count");
		this.fld_link_count_score	= Dbmeta_fld_itm.Make_or_null(conn, flds, tbl_name, Dbmeta_fld_tid.Tid__int, 0, "link_count_score");
		this.fld_link_score_min		= Dbmeta_fld_itm.Make_or_null(conn, flds, tbl_name, Dbmeta_fld_tid.Tid__int, Int_.Max_value__31, "link_score_min");
		this.fld_link_score_max		= Dbmeta_fld_itm.Make_or_null(conn, flds, tbl_name, Dbmeta_fld_tid.Tid__int, 0, "link_score_max");
		conn.Rls_reg(this);
	}
	public void Create_tbl() {conn.Meta_tbl_create(Dbmeta_tbl_itm.New(tbl_name, flds));}
	public void Create_idx() {
		// idx for rng_bgn, rng_end
		conn.Meta_idx_create(Dbmeta_idx_itm.new_normal_by_tbl(tbl_name, "word_text__link_score_max__link_score_min", fld_text, Fld_link_score_max, Fld_link_score_min));

		// idx for like
		conn.Meta_idx_create(Dbmeta_idx_itm.new_normal_by_tbl(tbl_name, "link_score_max__link_score_min", Fld_link_score_max, Fld_link_score_min));
	}
	public void Insert_bgn() {conn.Txn_bgn("schema__search_word__insert"); stmt_insert = conn.Stmt_insert(tbl_name, flds);}
	public void Insert_end() {conn.Txn_end(); stmt_insert = Db_stmt_.Rls(stmt_insert);}
	public void Insert_cmd_by_batch(int id, byte[] word, int page_count) {stmt_insert.Clear().Val_int(fld_id, id).Val_bry_as_str(fld_text, word).Val_int(fld_link_count, page_count).Exec_insert();}
	public Srch_word_row Select_or_empty(byte[] word) {
		if (stmt_select_by == null) stmt_select_by = conn.Stmt_select(tbl_name, flds, fld_text);
		Db_rdr rdr = stmt_select_by.Clear().Crt_bry_as_str(fld_text, word).Exec_select__rls_manual();
		try		{return rdr.Move_next() ? New_row(rdr) : Srch_word_row.Empty;}
		finally {rdr.Rls();}
	}
	public Srch_word_row New_row(Db_rdr rdr) {
		int page_count		= fld_link_count	 == Dbmeta_fld_itm.Key_null ? 0 : rdr.Read_int(fld_link_count);
		int link_score_min	= fld_link_score_min == Dbmeta_fld_itm.Key_null ? page_count : rdr.Read_int(fld_link_score_min);
		int link_score_max	= fld_link_score_max == Dbmeta_fld_itm.Key_null ? page_count : rdr.Read_int(fld_link_score_max);
		return new Srch_word_row(rdr.Read_int(fld_id), rdr.Read_bry_by_str(fld_text), page_count, link_score_min, link_score_max);
	}
	public void Rls() {
		stmt_insert				= Db_stmt_.Rls(stmt_insert);
		stmt_select_by			= Db_stmt_.Rls(stmt_select_by);
	}
	public static final String Fld_link_score_min = "link_score_min", Fld_link_score_max = "link_score_max";
}
