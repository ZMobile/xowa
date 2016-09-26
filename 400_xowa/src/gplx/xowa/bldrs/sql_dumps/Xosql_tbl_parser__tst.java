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
package gplx.xowa.bldrs.sql_dumps; import gplx.*; import gplx.xowa.*; import gplx.xowa.bldrs.*;
import org.junit.*; import gplx.core.tests.*;
public class Xosql_tbl_parser__tst {
	private final    Xosql_tbl_parser__fxt fxt = new Xosql_tbl_parser__fxt();
	@Test  public void Basic() {
		fxt.Exec__parse(String_.Concat_lines_nl
		( "ignore"
		, "CREATE TABLE tbl_0 ("	
		, "  `fld_2` int,"
		, "  `fld_1` int,"
		, "  `fld_0` int,"
		, "  UNIQUE KEY idx_0 (fld_2)"
		, ");"
		));
		fxt.Test__count(3);
		fxt.Test__get("fld_0",  2);
		fxt.Test__get("fld_1",  1);
		fxt.Test__get("fld_2",  0);
		fxt.Test__get("fld_3", -1);
	}
	@Test  public void Primary_key() {
		fxt.Exec__parse(String_.Concat_lines_nl
		( "ignore"
		, "CREATE TABLE tbl_0 ("	
		, "  `fld_2` int,"
		, "  `fld_1` int,"
		, "  `fld_0` int,"
		, "  PRIMARY KEY idx_0 (fld_2)"
		, ");"
		));
		fxt.Test__count(3);
		fxt.Test__get("fld_0",  2);
		fxt.Test__get("fld_1",  1);
		fxt.Test__get("fld_2",  0);
		fxt.Test__get("fld_3", -1);
	}
}
class Xosql_tbl_parser__fxt {
	private final    Xosql_tbl_parser parser = new Xosql_tbl_parser();
	private Ordered_hash tbl_flds;
	public void Exec__parse(String v) {this.tbl_flds = parser.Parse(Bry_.new_a7(v));}
	public void Test__count(int expd) {Gftest.Eq__int(expd, tbl_flds.Len());}
	public void Test__get(String key, int expd) {
		Xosql_fld_itm actl_itm = (Xosql_fld_itm)tbl_flds.Get_by(Bry_.new_u8(key));
		Gftest.Eq__int(expd, actl_itm == null ? Bry_find_.Not_found : actl_itm.Idx());
	}
}
