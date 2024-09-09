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
package gplx.xowa.addons.wikis.searchs.searchers.rslts;

import gplx.xowa.addons.wikis.searchs.searchers.Srch_search_ctx;
import gplx.xowa.addons.wikis.searchs.searchers.Srch_search_qry;
public interface Srch_rslt_cbk {
	void On_rslts_found(Srch_search_ctx ctx, Srch_search_qry qry, Srch_rslt_list rslts_list, int rslts_bgn, int rslts_end);
	void On_cancel();
}
