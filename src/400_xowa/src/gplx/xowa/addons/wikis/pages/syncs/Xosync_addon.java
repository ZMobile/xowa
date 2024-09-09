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
package gplx.xowa.addons.wikis.pages.syncs;

import gplx.xowa.Xow_wiki;
import gplx.xowa.addons.Xoax_addon_itm;
import gplx.xowa.addons.Xoax_addon_itm__special;
import gplx.xowa.addons.wikis.pages.syncs.specials.Sync_html_special;
import gplx.xowa.specials.Xow_special_page;
public class Xosync_addon implements Xoax_addon_itm, Xoax_addon_itm__special {
	public Xow_special_page[] Special_pages() {
		return new Xow_special_page[] 
		{ Sync_html_special.Prototype
		};
	}

	public static Xosync_addon Get(Xow_wiki wiki) {
		Xosync_addon rv = (Xosync_addon)wiki.Addon_mgr().Itms__get_or_null(ADDON_KEY);
		if (rv == null) {
			rv = new Xosync_addon();
			wiki.Addon_mgr().Itms__add(rv);
		}
		return rv;
	}

	public String Addon__key() {return ADDON_KEY;} private static final String ADDON_KEY = "xowa.pages.syncs";
}
