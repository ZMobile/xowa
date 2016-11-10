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
package gplx.xowa.addons.parsers.mediawikis; import gplx.*; import gplx.xowa.*; import gplx.xowa.addons.*; import gplx.xowa.addons.parsers.*;
import gplx.xowa.wikis.*; import gplx.xowa.parsers.*; import gplx.xowa.wikis.pages.*; import gplx.xowa.htmls.core.htmls.*;
import gplx.xowa.wikis.caches.*;
public class Xop_mediawiki_wkr {
	private final    Xowe_wiki wiki;
	private final    Bry_bfr tmp_bfr = Bry_bfr_.New();
	public Xop_mediawiki_wkr(Xowe_wiki wiki, Xop_mediawiki_loader loader) {
		this.wiki = wiki;
		this.Loader_(loader);
	}
	public void Loader_(Xop_mediawiki_loader loader) {
		if (loader != null)
			wiki.Cache_mgr().Page_cache().Load_wkr_(new Xow_page_cache_wkr__embeddable(loader));
	}
	public String Parse(String page, String wikitext) {
		Xoa_ttl ttl = wiki.Ttl_parse(Bry_.new_u8(page));

		byte[] wtxt = Bry_.new_u8(wikitext);
		Xoae_page wpg = Xoae_page.New(wiki, ttl);
		wpg.Db().Text().Text_bry_(wtxt);

		Xow_parser_mgr parser_mgr = wiki.Parser_mgr();

		// parse page
		Xop_ctx pctx = parser_mgr.Ctx();
		pctx.Clear_all();
		parser_mgr.Parse(wpg, true);

		// write to html
		boolean is_wikitext = Xow_page_tid.Identify(wpg.Wiki().Domain_tid(), ttl.Ns().Id(), ttl.Page_db()) == Xow_page_tid.Tid_wikitext;
		byte[] orig_bry = Bry_.Empty;
		if (is_wikitext) {
			wiki.Html_mgr().Page_wtr_mgr().Wkr(Xopg_page_.Tid_read).Write_hdump(tmp_bfr, pctx, Xoh_wtr_ctx.Hdump, wpg);
			orig_bry = tmp_bfr.To_bry_and_clear();
			wpg.Db().Html().Html_bry_(orig_bry);
		}
		else {	// not wikitext; EX: pages in MediaWiki: ns; DATE:2016-09-12
			wpg.Db().Html().Html_bry_(wpg.Db().Text().Text_bry());
		}

		return String_.new_u8(orig_bry);
	}
}
