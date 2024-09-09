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
package gplx.xowa.xtns.xowa_cmds;

import gplx.Bry_;
import gplx.Bry_bfr;
import gplx.Object_;
import gplx.String_;
import gplx.xowa.langs.kwds.Xol_kwd_grp_;
import gplx.xowa.parsers.Xop_ctx;
import gplx.xowa.parsers.tmpls.Xot_invk;
import gplx.xowa.xtns.pfuncs.Pf_func;
import gplx.xowa.xtns.pfuncs.Pf_func_;
import gplx.xowa.xtns.pfuncs.Pf_func_base;
public class Xop_xowa_func extends Pf_func_base {
	@Override public int Id() {return Xol_kwd_grp_.Id_xowa;}
	@Override public Pf_func New(int id, byte[] name) {return new Xop_xowa_func().Name_(name);}
	@Override public void Func_evaluate(Bry_bfr bfr, Xop_ctx ctx, Xot_invk caller, Xot_invk self, byte[] src) {			
		if (ctx.Wiki().Sys_cfg().Xowa_cmd_enabled()) {	// only exec if enabled for wiki
			int args_len = self.Args_len();
			byte[] arg_0 = Pf_func_.Eval_arg_or_empty(ctx, src, caller, self, args_len, 0);
			Object rslt = ctx.App().Gfs_mgr().Run_str(String_.new_u8(arg_0));
			bfr.Add(Bry_.new_u8(Object_.Xto_str_strict_or_null_mark(rslt)));
		}
		else {
			bfr.Add_mid(src, self.Src_bgn(), self.Src_end());
		}
	}
}
