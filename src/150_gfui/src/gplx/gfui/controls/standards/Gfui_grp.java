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
package gplx.gfui.controls.standards;

import gplx.Keyval_hash;
import gplx.gfui.controls.elems.GfuiElemBase;
import gplx.gfui.controls.gxws.GxwElem;
import gplx.gfui.kits.core.Gfui_kit;
public class Gfui_grp extends GfuiElemBase {
	public static Gfui_grp kit_(Gfui_kit kit, String key, GxwElem under, Keyval_hash ctor_args) {
		Gfui_grp rv = new Gfui_grp();
		rv.ctor_kit_GfuiElemBase(kit, key, under, ctor_args);
		return rv;
	}
}
