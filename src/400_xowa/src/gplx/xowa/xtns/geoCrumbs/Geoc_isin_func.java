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
package gplx.xowa.xtns.geoCrumbs;

import gplx.Bry_;
import gplx.Bry_bfr;
import gplx.xowa.Xoa_ttl;
import gplx.xowa.Xowe_wiki;
import gplx.xowa.langs.kwds.Xol_kwd_grp_;
import gplx.xowa.parsers.Xop_ctx;
import gplx.xowa.parsers.tmpls.Xop_tkn_;
import gplx.xowa.parsers.tmpls.Xot_invk;
import gplx.xowa.xtns.pfuncs.Pf_func;
import gplx.xowa.xtns.pfuncs.Pf_func_base;
public class Geoc_isin_func extends Pf_func_base {
	@Override public int Id() {return Xol_kwd_grp_.Id_geoCrumbs_isin;}
	@Override public Pf_func New(int id, byte[] name) {return new Geoc_isin_func().Name_(name);}
	@Override public void Func_evaluate(Bry_bfr bfr, Xop_ctx ctx, Xot_invk caller, Xot_invk self, byte[] src) {
		byte[] ttl_bry = Eval_argx(ctx, src, caller, self);
		Xowe_wiki wiki = ctx.Wiki();
		Xoa_ttl ttl = Xoa_ttl.Parse(wiki, ttl_bry); if (ttl == null) return;
		byte[] lnki_ttl = Bry_.Add(Xop_tkn_.Lnki_bgn, ttl_bry, Xop_tkn_.Lnki_end);		// make "[[ttl]]"
		Bry_bfr tmp_bfr = wiki.Utl__bfr_mkr().Get_b128();
		wiki.Parser_mgr().Main().Parse_text_to_html(tmp_bfr, ctx, ctx.Page(), false, lnki_ttl);
		ctx.Page().Html_data().Content_sub_(tmp_bfr.To_bry_and_rls());
	}
	public static final    Geoc_isin_func Instance = new Geoc_isin_func();
}
