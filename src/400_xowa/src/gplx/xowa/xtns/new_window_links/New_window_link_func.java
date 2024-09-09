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
package gplx.xowa.xtns.new_window_links;

import gplx.Bry_bfr;
import gplx.core.net.Gfo_protocol_itm;
import gplx.core.net.Gfo_url;
import gplx.core.net.Gfo_url_parser;
import gplx.xowa.langs.kwds.Xol_kwd_grp_;
import gplx.xowa.parsers.Xop_ctx;
import gplx.xowa.parsers.tmpls.Xot_invk;
import gplx.xowa.xtns.pfuncs.Pf_func;
import gplx.xowa.xtns.pfuncs.Pf_func_;
import gplx.xowa.xtns.pfuncs.Pf_func_base;
public class New_window_link_func extends Pf_func_base {
	@Override public int Id() {return Xol_kwd_grp_.Id_new_window_link;}
	@Override public boolean Func_require_colon_arg() {return true;}
	@Override public Pf_func New(int id, byte[] name) {return new New_window_link_func().Name_(name);}
	@Override public void Func_evaluate(Bry_bfr bfr, Xop_ctx ctx, Xot_invk caller, Xot_invk self, byte[] src) {
		byte[] title = Eval_argx(ctx, src, caller, self);
		int self_args_len = self.Args_len();
		byte[] caption = Pf_func_.Eval_arg_or(ctx, src, caller, self, self_args_len, 0, null);
		Gfo_url url = url_parser.Parse(title);
		if (url.Protocol_tid() == Gfo_protocol_itm.Tid_unknown) {
			bfr.Add_str_a7("[[");
			bfr.Add(title);
			if (caption != null) {
				bfr.Add_byte_pipe();
				bfr.Add(caption);
			}
//				bfr.Add_str_a7("|target=_blank");
			bfr.Add_str_a7("]]");
		}
		else {
			if (caption == null)
				bfr.Add(title);
			else {
				bfr.Add_str_a7("[");
				bfr.Add(title);
				bfr.Add_byte_space();
				bfr.Add(caption);
				bfr.Add_str_a7("]");
			}
		}
	}
	private static final Gfo_url_parser url_parser = new Gfo_url_parser();
}
