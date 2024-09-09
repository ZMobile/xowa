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
package gplx.xowa.xtns.pfuncs.stringutils;

import gplx.Bry_;
import gplx.Bry_bfr;
import gplx.Bry_find_;
import gplx.Byte_ascii;
import gplx.xowa.langs.kwds.Xol_kwd_grp_;
import gplx.xowa.parsers.Xop_ctx;
import gplx.xowa.parsers.tmpls.Xot_invk;
import gplx.xowa.xtns.pfuncs.Pf_func;
import gplx.xowa.xtns.pfuncs.Pf_func_;
import gplx.xowa.xtns.pfuncs.Pf_func_base;
public class Pfunc_pos extends Pf_func_base {
	@Override public int Id() {return Xol_kwd_grp_.Id_strx_pos;}
	@Override public Pf_func New(int id, byte[] name) {return new Pfunc_pos().Name_(name);}
	@Override public boolean Func_require_colon_arg() {return true;}
	@Override public void Func_evaluate(Bry_bfr bfr, Xop_ctx ctx, Xot_invk caller, Xot_invk self, byte[] src) {
		byte[] argx = Eval_argx(ctx, src, caller, self);
		int self_args_len = self.Args_len();
		byte[] find = Pf_func_.Eval_arg_or(ctx, src, caller, self, self_args_len, 0, Byte_ascii.Space_bry);	// MW: use " " if find is missing
		byte[] offset_bry = Pf_func_.Eval_arg_or(ctx, src, caller, self, self_args_len, 1, null);
		int offset = offset_bry == null ? 0 : Bry_.To_int_or_neg1(offset_bry);
		int pos = Bry_find_.Find_fwd(argx, find, offset);
		if (pos != Bry_find_.Not_found)
			bfr.Add_int_variable(pos);
	}
}	
