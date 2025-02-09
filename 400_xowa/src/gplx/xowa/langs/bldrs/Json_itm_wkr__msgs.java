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
package gplx.xowa.langs.bldrs; import gplx.*; import gplx.xowa.*; import gplx.xowa.langs.*;
import gplx.xowa.langs.msgs.*;
class Json_itm_wkr__msgs extends Json_itm_wkr__base {
	private Xol_msg_mgr msg_mgr; private boolean dirty;
	public void Ctor(boolean dirty, Xol_msg_mgr msg_mgr) {this.dirty = dirty; this.msg_mgr = msg_mgr;}
	@Override public void Read_kv_sub(byte[] key, byte[] val) {
		Xol_msg_itm msg_itm = msg_mgr.Itm_by_key_or_new(key);
		Xol_msg_itm_.update_val_(msg_itm, val);
		if (dirty)	// bldr needs to dirty message to generate lang.gfs; DATE:2014-08-05
			msg_itm.Dirty_(true);
	}
}
