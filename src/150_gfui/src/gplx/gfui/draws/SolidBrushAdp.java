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
package gplx.gfui.draws;

public class SolidBrushAdp  {
	public ColorAdp Color() {return color;} ColorAdp color;
			@Override public String toString() {return color.XtoHexStr();}
	public boolean Eq(Object obj) {
		SolidBrushAdp comp = SolidBrushAdp_.as_(obj); if (comp == null) return false;
		return color.Eq(comp.color);
	}
	@gplx.Internal protected static SolidBrushAdp new_(ColorAdp color) {
		SolidBrushAdp rv = new SolidBrushAdp();
		rv.color = color;
		return rv;
	}
}
