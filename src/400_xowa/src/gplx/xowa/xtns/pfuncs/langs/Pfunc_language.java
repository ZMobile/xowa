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
package gplx.xowa.xtns.pfuncs.langs;

import gplx.Bry_bfr;
import gplx.Hash_adp_bry;
import gplx.xowa.langs.Xol_lang_stub;
import gplx.xowa.langs.Xol_lang_stub_;
import gplx.xowa.langs.kwds.Xol_kwd_grp_;
import gplx.xowa.parsers.Xop_ctx;
import gplx.xowa.parsers.tmpls.Xot_invk;
import gplx.xowa.xtns.pfuncs.Pf_func;
import gplx.xowa.xtns.pfuncs.Pf_func_base;
public class Pfunc_language extends Pf_func_base {
	@Override public int Id() {return Xol_kwd_grp_.Id_i18n_language;}
	@Override public Pf_func New(int id, byte[] name) {return new Pfunc_language().Name_(name);}
	@Override public void Func_evaluate(Bry_bfr bfr, Xop_ctx ctx, Xot_invk caller, Xot_invk self, byte[] src) {
		byte[] argx = Eval_argx(ctx, src, caller, self);
		Hash_adp_bry regy = Xol_lang_stub_.Regy();
		if (argx.length == 0) return;	// {{#language:}} should return ""; note that byte[0] will fail in Match_exact
		Object o = regy.Get_by_bry(argx);
		if (o == null)
			bfr.Add(argx);
		else {
			Xol_lang_stub lang_itm = (Xol_lang_stub)o;
			bfr.Add(lang_itm.Canonical_name());
		}
	}
}	
