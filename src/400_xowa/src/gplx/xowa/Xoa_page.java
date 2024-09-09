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

import gplx.Guid_adp;
import gplx.xowa.langs.Xol_lang_itm;
import gplx.xowa.wikis.pages.Xoa_page__commons_mgr;
import gplx.xowa.wikis.pages.dbs.Xopg_db_data;
import gplx.xowa.wikis.pages.hdumps.Xopg_hdump_data;
import gplx.xowa.wikis.pages.htmls.Xopg_html_data;
import gplx.xowa.wikis.pages.redirects.Xopg_redirect_mgr;
import gplx.xowa.wikis.pages.wtxts.Xopg_wtxt_data;
public interface Xoa_page {
	Xow_wiki				Wiki();
	Guid_adp                Page_guid();
	Xoa_url					Url(); byte[] Url_bry_safe();
	Xoa_ttl					Ttl();
	Xopg_db_data			Db();
	Xopg_redirect_mgr		Redirect_trail();
	Xopg_html_data			Html_data();
	Xopg_hdump_data			Hdump_mgr();
	Xopg_wtxt_data			Wtxt();
	Xol_lang_itm			Lang();

	Xoa_page__commons_mgr	Commons_mgr();
	boolean					Xtn__timeline_exists();
	boolean					Xtn__gallery_exists();
}
