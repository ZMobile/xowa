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
package gplx.xowa.mediawiki.includes.parsers; import gplx.*; import gplx.xowa.*; import gplx.xowa.mediawiki.*; import gplx.xowa.mediawiki.includes.*;
import org.junit.*; import gplx.core.tests.*;
public class Xomw_strip_state__tst {
	private final    Xomw_strip_state__fxt fxt = new Xomw_strip_state__fxt();
	@Test   public void Basic() {
		fxt.Init__add    (Xomw_strip_state.Tid__general, "\u007f'\"`UNIQ-key-1-QINU`\"'\u007f", "val-1");
		fxt.Test__nostrip(Xomw_strip_state.Tid__nowiki , "a \u007f'\"`UNIQ-key-1-QINU`\"'\u007f b");
		fxt.Test__unstrip(Xomw_strip_state.Tid__general, "a \u007f'\"`UNIQ-key-1-QINU`\"'\u007f b", "a val-1 b");
		fxt.Test__unstrip(Xomw_strip_state.Tid__both   , "a \u007f'\"`UNIQ-key-1-QINU`\"'\u007f b", "a val-1 b");
	}
	@Test   public void Recurse() {
		fxt.Init__add    (Xomw_strip_state.Tid__general, "\u007f'\"`UNIQ-key-1-QINU`\"'\u007f", "val-1");
		fxt.Init__add    (Xomw_strip_state.Tid__general, "\u007f'\"`UNIQ-key-2-QINU`\"'\u007f", "\u007f'\"`UNIQ-key-1-QINU`\"'\u007f");
		fxt.Test__unstrip(Xomw_strip_state.Tid__general, "a \u007f'\"`UNIQ-key-2-QINU`\"'\u007f b", "a val-1 b");
	}
}
class Xomw_strip_state__fxt {
	private final    Xomw_strip_state strip_state = new Xomw_strip_state();
	public void Init__add(byte tid, String marker, String val) {
		strip_state.Add_item(tid, Bry_.new_u8(marker), Bry_.new_u8(val));
	}
	public void Test__nostrip(byte tid, String src) {Test__unstrip(tid, src, src);}
	public void Test__unstrip(byte tid, String src, String expd) {
		byte[] actl = strip_state.Unstrip(tid, Bry_.new_u8(src));
		Gftest.Eq__str(expd, String_.new_u8(actl));
	}
}
