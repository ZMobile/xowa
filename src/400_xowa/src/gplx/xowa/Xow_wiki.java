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
package gplx.xowa;

import gplx.Gfo_invk;
import gplx.core.brys.Bry_bfr_mkr;
import gplx.core.ios.Io_stream_zip_mgr;
import gplx.fsdb.Fsdb_db_mgr;
import gplx.fsdb.meta.Fsm_mnt_mgr;
import gplx.xowa.addons.Xoax_addon_mgr;
import gplx.xowa.addons.wikis.ctgs.htmls.catpages.Xoctg_catpage_mgr;
import gplx.xowa.addons.wikis.ctgs.htmls.pageboxs.Xoctg_pagebox_wtr;
import gplx.xowa.apps.urls.Xow_url_parser;
import gplx.xowa.files.Xof_fsdb_mode;
import gplx.xowa.files.bins.Xof_bin_mgr;
import gplx.xowa.files.origs.Xof_orig_mgr;
import gplx.xowa.files.repos.Xow_repo_mgr;
import gplx.xowa.htmls.Xoh_page_wtr_mgr;
import gplx.xowa.htmls.core.Xow_hdump_mgr;
import gplx.xowa.htmls.core.htmls.utls.Xoh_lnki_bldr;
import gplx.xowa.htmls.hrefs.Xoh_href_wtr;
import gplx.xowa.htmls.hxtns.pages.Hxtn_page_mgr;
import gplx.xowa.langs.Xol_lang_itm;
import gplx.xowa.langs.cases.Xol_case_mgr;
import gplx.xowa.langs.msgs.Xow_msg_mgr;
import gplx.xowa.parsers.Xow_mw_parser_mgr;
import gplx.xowa.wikis.data.Xow_db_mgr;
import gplx.xowa.wikis.data.site_stats.Xowd_site_stats_mgr;
import gplx.xowa.wikis.domains.Xow_domain_itm;
import gplx.xowa.wikis.fsys.Xow_fsys_mgr;
import gplx.xowa.wikis.metas.Xow_wiki_props;
import gplx.xowa.wikis.ttls.Xow_ttl_parser;
import gplx.xowa.wikis.xwikis.Xow_xwiki_mgr;
public interface Xow_wiki extends Xow_ttl_parser, Gfo_invk {
	boolean						Type_is_edit();
	Xoa_app						App();
	Xol_lang_itm				Lang();
	Xol_case_mgr				Case_mgr();
	byte[]						Domain_bry();			// EX: en.wikipedia.org
	String						Domain_str();
	int							Domain_tid();			// Xow_domain_tid_.Tid__wikipedia
	byte[]						Domain_abrv();			// enwiki
	Xow_domain_itm				Domain_itm();
	Xow_fsys_mgr				Fsys_mgr();
	Xow_db_mgr					Data__core_mgr();
	Xof_fsdb_mode				File__fsdb_mode();
	Fsdb_db_mgr					File__fsdb_core();
	Xow_repo_mgr				File__repo_mgr();
	Xof_orig_mgr				File__orig_mgr();
	Xof_bin_mgr					File__bin_mgr();
	Fsm_mnt_mgr					File__mnt_mgr();
	boolean						Html__hdump_enabled();
	Xow_hdump_mgr				Html__hdump_mgr();
	Xoh_page_wtr_mgr			Html__wtr_mgr();
	Xoh_href_wtr				Html__href_wtr();
	Xoh_lnki_bldr				Html__lnki_bldr();
	Xoctg_pagebox_wtr			Ctg__pagebox_wtr();
	Xoctg_catpage_mgr			Ctg__catpage_mgr();
	boolean						Html__css_installing(); void Html__css_installing_(boolean v);
	Xow_msg_mgr					Msg_mgr();
	byte[]						Wtxt__expand_tmpl(byte[] src);
	Xow_mw_parser_mgr			Mw_parser_mgr();
	Xow_xwiki_mgr				Xwiki_mgr();
	Xow_wiki_props				Props();
	Xowd_site_stats_mgr			Stats();
	void						Init_by_wiki();
	void						Init_by_wiki__force();	// HACK: force init for drd wiki
	Bry_bfr_mkr					Utl__bfr_mkr();
	Io_stream_zip_mgr			Utl__zip_mgr();
	Xow_url_parser				Utl__url_parser();
	Xoax_addon_mgr				Addon_mgr();
	boolean                     Embeddable_enabled(); void Embeddable_enabled_(boolean v);
	void						Init_needed_y_();
        Hxtn_page_mgr               Hxtn_mgr();
	void						Rls();
}
