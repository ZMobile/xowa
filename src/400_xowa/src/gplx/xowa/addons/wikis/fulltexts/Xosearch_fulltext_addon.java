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
package gplx.xowa.addons.wikis.fulltexts;

import gplx.Io_url;
import gplx.xowa.Xoa_app;
import gplx.xowa.Xow_wiki;
import gplx.xowa.addons.Xoax_addon_itm;
import gplx.xowa.addons.Xoax_addon_itm__bldr;
import gplx.xowa.addons.Xoax_addon_itm__json;
import gplx.xowa.addons.Xoax_addon_itm__special;
import gplx.xowa.addons.wikis.fulltexts.searchers.caches.Xofulltext_cache_mgr;
import gplx.xowa.bldrs.wkrs.Xob_cmd;
import gplx.xowa.htmls.bridges.Bridge_cmd_itm;
import gplx.xowa.specials.Xow_special_page;
public class Xosearch_fulltext_addon implements Xoax_addon_itm, Xoax_addon_itm__special, Xoax_addon_itm__json, Xoax_addon_itm__bldr {
	public String Addon__key() {return ADDON__KEY;} private static final String ADDON__KEY = "xowa.wiki.fulltext";
	public Xob_cmd[] Bldr_cmds() {
		return new Xob_cmd[]
		{ gplx.xowa.addons.wikis.fulltexts.indexers.bldrs.Xofulltext_indexer_cmd.Prototype
		};
	}
	public Xow_special_page[] Special_pages() {
		return new Xow_special_page[]
		{ gplx.xowa.addons.wikis.fulltexts.searchers.specials.Xofulltext_searcher_special.Prototype
		, gplx.xowa.addons.wikis.fulltexts.indexers.specials.Xofulltext_indexer_special.Prototype
		};
	}
	public Bridge_cmd_itm[] Json_cmds() {
		return new Bridge_cmd_itm[]
		{ gplx.xowa.addons.wikis.fulltexts.searchers.svcs.Xofulltext_searcher_bridge.Prototype
		, gplx.xowa.addons.wikis.fulltexts.indexers.svcs.Xofulltext_indexer_bridge.Prototype
		};
	}
	public Xofulltext_cache_mgr Cache_mgr() {return cache_mgr;} private final    Xofulltext_cache_mgr cache_mgr = new Xofulltext_cache_mgr();
	public static Xosearch_fulltext_addon Get_by_app(Xoa_app app) {
		return (Xosearch_fulltext_addon)app.Addon_mgr().Itms__get_or_null(ADDON__KEY);
	}

	public static Io_url Get_index_dir(Xow_wiki wiki) {return Get_index_dir(wiki.Fsys_mgr().Root_dir());}
	public static Io_url Get_index_dir(Io_url wiki_dir) {
		return wiki_dir.GenSubDir_nest("data", "search", "java7-v1");
	}
}
