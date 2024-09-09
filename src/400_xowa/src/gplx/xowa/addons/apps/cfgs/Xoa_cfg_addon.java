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
package gplx.xowa.addons.apps.cfgs;

import gplx.xowa.addons.Xoax_addon_itm;
import gplx.xowa.addons.Xoax_addon_itm__json;
import gplx.xowa.addons.Xoax_addon_itm__special;
import gplx.xowa.addons.apps.cfgs.specials.edits.pages.Xocfg_edit_special;
import gplx.xowa.addons.apps.cfgs.specials.edits.services.Xocfg_edit_bridge;
import gplx.xowa.addons.apps.cfgs.specials.maints.pages.Xocfg_maint_special;
import gplx.xowa.addons.apps.cfgs.specials.maints.services.Xocfg_maint_bridge;
import gplx.xowa.htmls.bridges.Bridge_cmd_itm;
import gplx.xowa.specials.Xow_special_page;
public class Xoa_cfg_addon implements Xoax_addon_itm, Xoax_addon_itm__special, Xoax_addon_itm__json {
	public Xow_special_page[] Special_pages() {
		return new Xow_special_page[]
		{ Xocfg_maint_special.Prototype
		, Xocfg_edit_special.Prototype
		};
	}
	public Bridge_cmd_itm[] Json_cmds() {
		return new Bridge_cmd_itm[]
		{ Xocfg_maint_bridge.Prototype
		, Xocfg_edit_bridge.Prototype
		};
	}

	public String Addon__key() {return ADDON__KEY;} private static final String ADDON__KEY = "xowa.app.cfg";
}
