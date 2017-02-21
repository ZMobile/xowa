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
package gplx.xowa.users.cfgs; import gplx.*; import gplx.xowa.*; import gplx.xowa.users.*;
public class Xocfg_meta_itm {
	public Xocfg_meta_itm(String key, String type, String dflt, String version) {
		this.key = key; this.type = type; this.dflt = dflt; this.version = version;
	}
	public String Key() {return key;} private final    String key;
	public String Type() {return type;} private String type;
	public String Dflt() {return dflt;} private String dflt;
	public String Version() {return version;} private String version;
}
