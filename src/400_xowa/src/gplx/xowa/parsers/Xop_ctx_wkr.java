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
package gplx.xowa.parsers;

public interface Xop_ctx_wkr {
	void Ctor_ctx(Xop_ctx ctx);
	void Page_bgn(Xop_ctx ctx, Xop_root_tkn root);
	void Page_end(Xop_ctx ctx, Xop_root_tkn root, byte[] src, int src_len);
}
