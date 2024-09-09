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
import gplx.xowa.addons.Xoax_addon_itm__bldr;
import gplx.xowa.addons.wikis.searchs.bldrs.cmds.Xobldr__link__link_score;
import gplx.xowa.addons.wikis.searchs.bldrs.cmds.Xobldr__page__page_score;
import gplx.xowa.addons.wikis.searchs.bldrs.cmds.Xobldr__word__link_count;
import gplx.xowa.bldrs.wkrs.Xob_cmd;
public class Xoax_builds_search_addon implements Xoax_addon_itm, Xoax_addon_itm__bldr {
	public Xob_cmd[] Bldr_cmds() {
		return new Xob_cmd[]
		{ Xobldr__link__link_score.Prototype
		, Xobldr__page__page_score.Prototype
		, Xobldr__word__link_count.Prototype
		};
	}

	public String Addon__key() {return "xowa.builds.search";}
}
