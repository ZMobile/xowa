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
package gplx.xowa.addons.servers.https.utils;

import gplx.xowa.Xoa_app;
import gplx.xowa.addons.Xoax_addon_itm;
import gplx.xowa.addons.Xoax_addon_itm__json;
import gplx.xowa.htmls.bridges.Bridge_cmd_itm;
public class Xoa_util_addon implements Xoax_addon_itm, Xoax_addon_itm__json {
	public String Addon__key() {return ADDON__KEY;} private static final String ADDON__KEY = "xowa.app.util";
	public Bridge_cmd_itm[] Json_cmds() {
		return new Bridge_cmd_itm[]
		{ Xoa_util_bridge.Prototype
		};
	}
	public static Xoa_util_addon Get_by_app(Xoa_app app) {
		return (Xoa_util_addon)app.Addon_mgr().Itms__get_or_null(ADDON__KEY);
	}
}
