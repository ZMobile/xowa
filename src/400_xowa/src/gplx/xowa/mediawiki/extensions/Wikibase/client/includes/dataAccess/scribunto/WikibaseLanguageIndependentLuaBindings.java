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
package gplx.xowa.mediawiki.extensions.Wikibase.client.includes.dataAccess.scribunto;

import gplx.xowa.mediawiki.extensions.Wikibase.client.config.WikibaseClientDefault;
import gplx.xowa.mediawiki.extensions.Wikibase.lib.includes.Store.XomwEntityRetrievingTermLookup;
import gplx.xowa.xtns.wbases.stores.Wbase_doc_mgr;
public class WikibaseLanguageIndependentLuaBindings {
	private final    XomwEntityRetrievingTermLookup termLookup;
	private final    WikibaseClientDefault settings;
	public WikibaseLanguageIndependentLuaBindings(Wbase_doc_mgr entity_mgr, byte[] wiki_abrv_wm) {
		this.termLookup = new XomwEntityRetrievingTermLookup(entity_mgr);
		this.settings = WikibaseClientDefault.New(wiki_abrv_wm);
	}
	public byte[] getLabelByLanguage_or_null(byte[] prefixedEntityId, byte[] languageCode) {
		return termLookup.getLabel_or_null(prefixedEntityId, languageCode);
	}
	public Object getSetting(byte[] key) {
		return settings.getSetting(key);
	}
}
