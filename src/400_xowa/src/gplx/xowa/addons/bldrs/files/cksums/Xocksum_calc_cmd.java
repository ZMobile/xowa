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
package gplx.xowa.addons.bldrs.files.cksums;

import gplx.xowa.Xowe_wiki;
import gplx.xowa.bldrs.Xob_bldr;
import gplx.xowa.bldrs.wkrs.Xob_cmd;
import gplx.xowa.bldrs.wkrs.Xob_cmd__base;
public class Xocksum_calc_cmd extends Xob_cmd__base {
	public Xocksum_calc_cmd(Xob_bldr bldr, Xowe_wiki wiki) {super(bldr, wiki);}
	@Override public void Cmd_run() {
		wiki.Init_assert();
		new Xocksum_calc_mgr().Exec(wiki);
	}

	@Override public String Cmd_key() {return BLDR_CMD_KEY;}  private static final String BLDR_CMD_KEY = "fsdb.cksums.calc";
	public static final    Xob_cmd Prototype = new Xocksum_calc_cmd(null, null);
	@Override public Xob_cmd Cmd_clone(Xob_bldr bldr, Xowe_wiki wiki) {return new Xocksum_calc_cmd(bldr, wiki);}
}
