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
package gplx.xowa.htmls.core.wkrs.lnkis;

import gplx.Bry_bfr;
import gplx.core.brys.Bry_rdr;
import gplx.xowa.htmls.core.wkrs.Xoh_hzip_bfr;
public class Xoh_lnki_dict_ {
	public static void Ns_encode(Xoh_hzip_bfr bfr, int ns_id) {bfr.Add_hzip_int(1, ns_id + 2);}
	public static void Ns_encode(Bry_bfr bfr, int ns_id) {
		gplx.core.encoders.Gfo_hzip_int_.Encode(1, bfr, ns_id + 2);
	}
	public static int Ns_decode(Bry_rdr rdr) {
		return rdr.Read_hzip_int(1) - 2;
	}
}
