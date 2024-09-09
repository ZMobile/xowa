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
package gplx.xowa.mediawiki.xml;

import gplx.langs.xmls.XmlDoc;
import gplx.langs.xmls.XmlDoc_;
import gplx.langs.xmls.XmlNdeList;
public class XophpDOMDocument {
	private XmlDoc xdoc;
	public void loadXML(String xml) {
		this.xdoc = XmlDoc_.parse(xml);
	}
	public XophpDOMNodeList getElementsByTagName(String tagName) {
		XmlNdeList list = XmlDoc_.Select_tags(xdoc.Root(), tagName);
		return new XophpDOMNodeList(list);
	}
}