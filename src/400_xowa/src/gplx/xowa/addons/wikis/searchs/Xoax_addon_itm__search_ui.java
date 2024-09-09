/*
XOWA: the XOWA Offline Wiki Application
Copyright (C) 2012-2017 gnosygnu@gmail.com

XOWA is licensed under the terms of the General Public License (GPL) Version 3,
or alternatively under the terms of the Apache License Version 2.0.

You may use XOWA according to either of these licenses as is most appropriate
for your project on a case-by-case basis.

The terms of each license can be found in the source code repository:

GPLv3 License: https://github.com/gnosygnu/xowa/blob/master/LICENSE-GPLv3.txt
Apache License: https://github.com/gnosygnu/xowa/blob/master/LICENSE-APACHE2.txt
*/
package gplx.xowa.addons.wikis.searchs;

import gplx.xowa.addons.Xoax_addon_itm;
import gplx.xowa.addons.Xoax_addon_itm__json;
import gplx.xowa.addons.wikis.searchs.gui.htmlbars.Bridge_cmd_itm__srch_suggest;
import gplx.xowa.htmls.bridges.Bridge_cmd_itm;
public class Xoax_addon_itm__search_ui implements Xoax_addon_itm, Xoax_addon_itm__json {
	public String Addon__key() {return "xowa.search.ui";}
	public Bridge_cmd_itm[] Json_cmds() {
		return new Bridge_cmd_itm[] {new Bridge_cmd_itm__srch_suggest()};
	}
}
