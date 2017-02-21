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
package gplx.xowa.langs.kwds; import gplx.*; import gplx.xowa.*; import gplx.xowa.langs.*;
import gplx.core.primitives.*;
public class Xol_kwd_grp_ {
public static final int
  Id_redirect = 0
, Id_notoc = 1
, Id_nogallery = 2
, Id_forcetoc = 3
, Id_toc = 4
, Id_noeditsection = 5
, Id_noheader = 6
, Id_utc_month_int_len2 = 7
, Id_utc_month_int = 8
, Id_utc_month_name = 9
, Id_utc_month_gen = 10
, Id_utc_month_abrv = 11
, Id_utc_day_int = 12
, Id_utc_day_int_len2 = 13
, Id_utc_day_name = 14
, Id_utc_year = 15
, Id_utc_time = 16
, Id_utc_hour = 17
, Id_lcl_month_int_len2 = 18
, Id_lcl_month_int = 19
, Id_lcl_month_name = 20
, Id_lcl_month_gen = 21
, Id_lcl_month_abrv = 22
, Id_lcl_day_int = 23
, Id_lcl_day_int_len2 = 24
, Id_lcl_day_name = 25
, Id_lcl_year = 26
, Id_lcl_time = 27
, Id_lcl_hour = 28
, Id_num_pages = 29
, Id_num_articles = 30
, Id_num_files = 31
, Id_num_users = 32
, Id_num_users_active = 33
, Id_num_edits = 34
, Id_num_views = 35
, Id_ttl_page_txt = 36
, Id_ttl_page_url = 37
, Id_ns_txt = 38
, Id_ns_url = 39
, Id_ns_talk_txt = 40
, Id_ns_talk_url = 41
, Id_ns_subj_txt = 42
, Id_ns_subj_url = 43
, Id_ttl_full_txt = 44
, Id_ttl_full_url = 45
, Id_ttl_leaf_txt = 46
, Id_ttl_leaf_url = 47
, Id_ttl_base_txt = 48
, Id_ttl_base_url = 49
, Id_ttl_talk_txt = 50
, Id_ttl_talk_url = 51
, Id_ttl_subj_txt = 52
, Id_ttl_subj_url = 53
, Id_msg = 54
, Id_subst = 55
, Id_safesubst = 56
, Id_msgnw = 57
, Id_img_thumbnail = 58
, Id_img_manualthumb = 59
, Id_img_framed = 60
, Id_img_frameless = 61
, Id_img_upright = 62
, Id_img_upright_factor = 63
, Id_img_border = 64
, Id_img_align = 65
, Id_img_valign = 66
, Id_img_alt = 67
, Id_img_class = 68
, Id_img_caption = 69
, Id_img_link_url = 70
, Id_img_link_title = 71
, Id_img_link_target = 72
, Id_img_link_none = 73
, Id_img_width = 74
, Id_img_page = 75
, Id_img_none = 76
, Id_img_right = 77
, Id_img_center = 78
, Id_img_left = 79
, Id_img_baseline = 80
, Id_img_sub = 81
, Id_img_super = 82
, Id_img_top = 83
, Id_img_text_top = 84
, Id_img_middle = 85
, Id_img_bottom = 86
, Id_img_text_bottom = 87
, Id_img_link = 88
, Id_i18n_int = 89
, Id_site_sitename = 90
, Id_url_ns = 91
, Id_url_nse = 92
, Id_url_localurl = 93
, Id_url_localurle = 94
, Id_site_articlepath = 95
, Id_site_server = 96
, Id_site_servername = 97
, Id_site_scriptpath = 98
, Id_site_stylepath = 99
, Id_i18n_grammar = 100
, Id_i18n_gender = 101
, Id_notitleconvert = 102
, Id_nocontentconvert = 103
, Id_utc_week = 104
, Id_utc_dow = 105
, Id_lcl_week = 106
, Id_lcl_dow = 107
, Id_rev_id = 108
, Id_rev_day_int = 109
, Id_rev_day_int_len2 = 110
, Id_rev_month_int_len2 = 111
, Id_rev_month_int = 112
, Id_rev_year = 113
, Id_rev_timestamp = 114
, Id_rev_user = 115
, Id_i18n_plural = 116
, Id_url_fullurl = 117
, Id_url_fullurle = 118
, Id_str_lcfirst = 119
, Id_str_ucfirst = 120
, Id_str_lc = 121
, Id_str_uc = 122
, Id_raw = 123
, Id_page_displaytitle = 124
, Id_str_rawsuffix = 125
, Id_newsectionlink = 126
, Id_nonewsectionlink = 127
, Id_site_currentversion = 128
, Id_url_urlencode = 129
, Id_url_anchorencode = 130
, Id_utc_timestamp = 131
, Id_lcl_timestamp = 132
, Id_site_directionmark = 133
, Id_i18n_language = 134
, Id_site_contentlanguage = 135
, Id_site_pagesinnamespace = 136
, Id_num_admins = 137
, Id_str_formatnum = 138
, Id_str_padleft = 139
, Id_str_padright = 140
, Id_misc_special = 141
, Id_page_defaultsort = 142
, Id_url_filepath = 143
, Id_misc_tag = 144
, Id_hiddencat = 145
, Id_site_pagesincategory = 146
, Id_rev_pagesize = 147
, Id_index = 148
, Id_noindex = 149
, Id_site_numberingroup = 150
, Id_staticredirect = 151
, Id_rev_protectionlevel = 152
, Id_str_formatdate = 153
, Id_url_path = 154
, Id_url_wiki = 155
, Id_url_query = 156
, Id_xtn_expr = 157
, Id_xtn_if = 158
, Id_xtn_ifeq = 159
, Id_xtn_ifexpr = 160
, Id_xtn_iferror = 161
, Id_xtn_switch = 162
, Id_xtn_default = 163
, Id_xtn_ifexist = 164
, Id_xtn_time = 165
, Id_xtn_timel = 166
, Id_xtn_rel2abs = 167
, Id_xtn_titleparts = 168
, Id_xowa_dbg = 169
, Id_ogg_noplayer = 170
, Id_ogg_noicon = 171
, Id_ogg_thumbtime = 172
, Id_xtn_geodata_coordinates = 173
, Id_url_canonicalurl = 174
, Id_url_canonicalurle = 175
, Id_lst = 176
, Id_lstx = 177
, Id_invoke = 178
, Id_property = 179
, Id_noexternallanglinks = 180
, Id_ns_num = 181
, Id_page_id = 182
, Id_disambig = 183
, Id_nocommafysuffix = 184
, Id_xowa = 185
, Id_mapSources_deg2dd = 186
, Id_mapSources_dd2dms = 187
, Id_mapSources_geoLink = 188
, Id_geoCrumbs_isin = 189
, Id_relatedArticles = 190
, Id_insider = 191
, Id_massMessage_target = 192
, Id_cascadingSources = 193
, Id_pendingChangeLevel = 194
, Id_pagesUsingPendingChanges = 195
, Id_bang = 196
, Id_wbreponame = 197
, Id_strx_len = 198
, Id_strx_pos = 199
, Id_strx_rpos = 200
, Id_strx_sub = 201
, Id_strx_count = 202
, Id_strx_replace = 203
, Id_strx_explode = 204
, Id_strx_urldecode = 205
, Id_pagesincategory_pages = 206
, Id_pagesincategory_subcats = 207
, Id_pagesincategory_files = 208
, Id_rev_revisionsize = 209
, Id_pagebanner = 210
, Id_rev_protectionexpiry = 211
, Id_new_window_link = 212
, Id_categorytree = 213
, Id_lsth = 214
, Id_assessment = 215
, Id_ttl_root_txt = 216
, Id_ttl_root_url = 217
;
public static final int Id__max = 218;

	private static byte[] ary_itm_(int id) {
		switch (id) {
case Xol_kwd_grp_.Id_redirect: return Bry_.new_a7("redirect");
case Xol_kwd_grp_.Id_notoc: return Bry_.new_a7("notoc");
case Xol_kwd_grp_.Id_nogallery: return Bry_.new_a7("nogallery");
case Xol_kwd_grp_.Id_forcetoc: return Bry_.new_a7("forcetoc");
case Xol_kwd_grp_.Id_toc: return Bry_.new_a7("toc");
case Xol_kwd_grp_.Id_noeditsection: return Bry_.new_a7("noeditsection");
case Xol_kwd_grp_.Id_noheader: return Bry_.new_a7("noheader");
case Xol_kwd_grp_.Id_utc_month_int_len2: return Bry_.new_a7("currentmonth");
case Xol_kwd_grp_.Id_utc_month_int: return Bry_.new_a7("currentmonth1");
case Xol_kwd_grp_.Id_utc_month_name: return Bry_.new_a7("currentmonthname");
case Xol_kwd_grp_.Id_utc_month_gen: return Bry_.new_a7("currentmonthnamegen");
case Xol_kwd_grp_.Id_utc_month_abrv: return Bry_.new_a7("currentmonthabbrev");
case Xol_kwd_grp_.Id_utc_day_int: return Bry_.new_a7("currentday");
case Xol_kwd_grp_.Id_utc_day_int_len2: return Bry_.new_a7("currentday2");
case Xol_kwd_grp_.Id_utc_day_name: return Bry_.new_a7("currentdayname");
case Xol_kwd_grp_.Id_utc_year: return Bry_.new_a7("currentyear");
case Xol_kwd_grp_.Id_utc_time: return Bry_.new_a7("currenttime");
case Xol_kwd_grp_.Id_utc_hour: return Bry_.new_a7("currenthour");
case Xol_kwd_grp_.Id_lcl_month_int_len2: return Bry_.new_a7("localmonth");
case Xol_kwd_grp_.Id_lcl_month_int: return Bry_.new_a7("localmonth1");
case Xol_kwd_grp_.Id_lcl_month_name: return Bry_.new_a7("localmonthname");
case Xol_kwd_grp_.Id_lcl_month_gen: return Bry_.new_a7("localmonthnamegen");
case Xol_kwd_grp_.Id_lcl_month_abrv: return Bry_.new_a7("localmonthabbrev");
case Xol_kwd_grp_.Id_lcl_day_int: return Bry_.new_a7("localday");
case Xol_kwd_grp_.Id_lcl_day_int_len2: return Bry_.new_a7("localday2");
case Xol_kwd_grp_.Id_lcl_day_name: return Bry_.new_a7("localdayname");
case Xol_kwd_grp_.Id_lcl_year: return Bry_.new_a7("localyear");
case Xol_kwd_grp_.Id_lcl_time: return Bry_.new_a7("localtime");
case Xol_kwd_grp_.Id_lcl_hour: return Bry_.new_a7("localhour");
case Xol_kwd_grp_.Id_num_pages: return Bry_.new_a7("numberofpages");
case Xol_kwd_grp_.Id_num_articles: return Bry_.new_a7("numberofarticles");
case Xol_kwd_grp_.Id_num_files: return Bry_.new_a7("numberoffiles");
case Xol_kwd_grp_.Id_num_users: return Bry_.new_a7("numberofusers");
case Xol_kwd_grp_.Id_num_users_active: return Bry_.new_a7("numberofactiveusers");
case Xol_kwd_grp_.Id_num_edits: return Bry_.new_a7("numberofedits");
case Xol_kwd_grp_.Id_num_views: return Bry_.new_a7("numberofviews");
case Xol_kwd_grp_.Id_ttl_page_txt: return Bry_.new_a7("pagename");
case Xol_kwd_grp_.Id_ttl_page_url: return Bry_.new_a7("pagenamee");
case Xol_kwd_grp_.Id_ns_txt: return Bry_.new_a7("namespace");
case Xol_kwd_grp_.Id_ns_url: return Bry_.new_a7("namespacee");
case Xol_kwd_grp_.Id_ns_talk_txt: return Bry_.new_a7("talkspace");
case Xol_kwd_grp_.Id_ns_talk_url: return Bry_.new_a7("talkspacee");
case Xol_kwd_grp_.Id_ns_subj_txt: return Bry_.new_a7("subjectspace");
case Xol_kwd_grp_.Id_ns_subj_url: return Bry_.new_a7("subjectspacee");
case Xol_kwd_grp_.Id_ttl_full_txt: return Bry_.new_a7("fullpagename");
case Xol_kwd_grp_.Id_ttl_full_url: return Bry_.new_a7("fullpagenamee");
case Xol_kwd_grp_.Id_ttl_leaf_txt: return Bry_.new_a7("subpagename");
case Xol_kwd_grp_.Id_ttl_leaf_url: return Bry_.new_a7("subpagenamee");
case Xol_kwd_grp_.Id_ttl_base_txt: return Bry_.new_a7("basepagename");
case Xol_kwd_grp_.Id_ttl_base_url: return Bry_.new_a7("basepagenamee");
case Xol_kwd_grp_.Id_ttl_talk_txt: return Bry_.new_a7("talkpagename");
case Xol_kwd_grp_.Id_ttl_talk_url: return Bry_.new_a7("talkpagenamee");
case Xol_kwd_grp_.Id_ttl_subj_txt: return Bry_.new_a7("subjectpagename");
case Xol_kwd_grp_.Id_ttl_subj_url: return Bry_.new_a7("subjectpagenamee");
case Xol_kwd_grp_.Id_ttl_root_txt: return Bry_.new_u8("rootpagename");
case Xol_kwd_grp_.Id_ttl_root_url: return Bry_.new_u8("rootpagenamee");
case Xol_kwd_grp_.Id_msg: return Bry_.new_a7("msg");
case Xol_kwd_grp_.Id_subst: return Bry_.new_a7("subst");
case Xol_kwd_grp_.Id_safesubst: return Bry_.new_a7("safesubst");
case Xol_kwd_grp_.Id_msgnw: return Bry_.new_a7("msgnw");
case Xol_kwd_grp_.Id_img_thumbnail: return Bry_.new_a7("img_thumbnail");
case Xol_kwd_grp_.Id_img_manualthumb: return Bry_.new_a7("img_manualthumb");
case Xol_kwd_grp_.Id_img_framed: return Bry_.new_a7("img_framed");
case Xol_kwd_grp_.Id_img_frameless: return Bry_.new_a7("img_frameless");
case Xol_kwd_grp_.Id_img_upright: return Bry_.new_a7("img_upright");
case Xol_kwd_grp_.Id_img_upright_factor: return Bry_.new_a7("img_upright_factor");
case Xol_kwd_grp_.Id_img_border: return Bry_.new_a7("img_border");
case Xol_kwd_grp_.Id_img_align: return Bry_.new_a7("img_align");
case Xol_kwd_grp_.Id_img_valign: return Bry_.new_a7("img_valign");
case Xol_kwd_grp_.Id_img_alt: return Bry_.new_a7("img_alt");
case Xol_kwd_grp_.Id_img_class: return Bry_.new_a7("img_class");
case Xol_kwd_grp_.Id_img_caption: return Bry_.new_a7("img_caption");
case Xol_kwd_grp_.Id_img_link_url: return Bry_.new_a7("img_link_url");
case Xol_kwd_grp_.Id_img_link_title: return Bry_.new_a7("img_link_title");
case Xol_kwd_grp_.Id_img_link_target: return Bry_.new_a7("img_link_target");
case Xol_kwd_grp_.Id_img_link_none: return Bry_.new_a7("img_link_none");
case Xol_kwd_grp_.Id_img_width: return Bry_.new_a7("img_width");
case Xol_kwd_grp_.Id_img_page: return Bry_.new_a7("img_page");
case Xol_kwd_grp_.Id_img_none: return Bry_.new_a7("img_none");
case Xol_kwd_grp_.Id_img_right: return Bry_.new_a7("img_right");
case Xol_kwd_grp_.Id_img_center: return Bry_.new_a7("img_center");
case Xol_kwd_grp_.Id_img_left: return Bry_.new_a7("img_left");
case Xol_kwd_grp_.Id_img_baseline: return Bry_.new_a7("img_baseline");
case Xol_kwd_grp_.Id_img_sub: return Bry_.new_a7("img_sub");
case Xol_kwd_grp_.Id_img_super: return Bry_.new_a7("img_super");
case Xol_kwd_grp_.Id_img_top: return Bry_.new_a7("img_top");
case Xol_kwd_grp_.Id_img_text_top: return Bry_.new_a7("img_text_top");
case Xol_kwd_grp_.Id_img_middle: return Bry_.new_a7("img_middle");
case Xol_kwd_grp_.Id_img_bottom: return Bry_.new_a7("img_bottom");
case Xol_kwd_grp_.Id_img_text_bottom: return Bry_.new_a7("img_text_bottom");
case Xol_kwd_grp_.Id_img_link: return Bry_.new_a7("img_link");
case Xol_kwd_grp_.Id_i18n_int: return Bry_.new_a7("int");
case Xol_kwd_grp_.Id_site_sitename: return Bry_.new_a7("sitename");
case Xol_kwd_grp_.Id_url_ns: return Bry_.new_a7("ns");
case Xol_kwd_grp_.Id_url_nse: return Bry_.new_a7("nse");
case Xol_kwd_grp_.Id_url_localurl: return Bry_.new_a7("localurl");
case Xol_kwd_grp_.Id_url_localurle: return Bry_.new_a7("localurle");
case Xol_kwd_grp_.Id_site_articlepath: return Bry_.new_a7("articlepath");
case Xol_kwd_grp_.Id_site_server: return Bry_.new_a7("server");
case Xol_kwd_grp_.Id_site_servername: return Bry_.new_a7("servername");
case Xol_kwd_grp_.Id_site_scriptpath: return Bry_.new_a7("scriptpath");
case Xol_kwd_grp_.Id_site_stylepath: return Bry_.new_a7("stylepath");
case Xol_kwd_grp_.Id_i18n_grammar: return Bry_.new_a7("grammar");
case Xol_kwd_grp_.Id_i18n_gender: return Bry_.new_a7("gender");
case Xol_kwd_grp_.Id_notitleconvert: return Bry_.new_a7("notitleconvert");
case Xol_kwd_grp_.Id_nocontentconvert: return Bry_.new_a7("nocontentconvert");
case Xol_kwd_grp_.Id_utc_week: return Bry_.new_a7("currentweek");
case Xol_kwd_grp_.Id_utc_dow: return Bry_.new_a7("currentdow");
case Xol_kwd_grp_.Id_lcl_week: return Bry_.new_a7("localweek");
case Xol_kwd_grp_.Id_lcl_dow: return Bry_.new_a7("localdow");
case Xol_kwd_grp_.Id_rev_id: return Bry_.new_a7("revisionid");
case Xol_kwd_grp_.Id_rev_day_int: return Bry_.new_a7("revisionday");
case Xol_kwd_grp_.Id_rev_day_int_len2: return Bry_.new_a7("revisionday2");
case Xol_kwd_grp_.Id_rev_month_int_len2: return Bry_.new_a7("revisionmonth");
case Xol_kwd_grp_.Id_rev_month_int: return Bry_.new_a7("revisionmonth1");
case Xol_kwd_grp_.Id_rev_year: return Bry_.new_a7("revisionyear");
case Xol_kwd_grp_.Id_rev_timestamp: return Bry_.new_a7("revisiontimestamp");
case Xol_kwd_grp_.Id_rev_user: return Bry_.new_a7("revisionuser");
case Xol_kwd_grp_.Id_i18n_plural: return Bry_.new_a7("plural");
case Xol_kwd_grp_.Id_url_fullurl: return Bry_.new_a7("fullurl");
case Xol_kwd_grp_.Id_url_fullurle: return Bry_.new_a7("fullurle");
case Xol_kwd_grp_.Id_str_lcfirst: return Bry_.new_a7("lcfirst");
case Xol_kwd_grp_.Id_str_ucfirst: return Bry_.new_a7("ucfirst");
case Xol_kwd_grp_.Id_str_lc: return Bry_.new_a7("lc");
case Xol_kwd_grp_.Id_str_uc: return Bry_.new_a7("uc");
case Xol_kwd_grp_.Id_raw: return Bry_.new_a7("raw");
case Xol_kwd_grp_.Id_page_displaytitle: return Bry_.new_a7("displaytitle");
case Xol_kwd_grp_.Id_str_rawsuffix: return Bry_.new_a7("rawsuffix");
case Xol_kwd_grp_.Id_newsectionlink: return Bry_.new_a7("newsectionlink");
case Xol_kwd_grp_.Id_nonewsectionlink: return Bry_.new_a7("nonewsectionlink");
case Xol_kwd_grp_.Id_site_currentversion: return Bry_.new_a7("currentversion");
case Xol_kwd_grp_.Id_url_urlencode: return Bry_.new_a7("urlencode");
case Xol_kwd_grp_.Id_url_anchorencode: return Bry_.new_a7("anchorencode");
case Xol_kwd_grp_.Id_utc_timestamp: return Bry_.new_a7("currenttimestamp");
case Xol_kwd_grp_.Id_lcl_timestamp: return Bry_.new_a7("localtimestamp");
case Xol_kwd_grp_.Id_site_directionmark: return Bry_.new_a7("directionmark");
case Xol_kwd_grp_.Id_i18n_language: return Bry_.new_a7("language");
case Xol_kwd_grp_.Id_site_contentlanguage: return Bry_.new_a7("contentlanguage");
case Xol_kwd_grp_.Id_site_pagesinnamespace: return Bry_.new_a7("pagesinnamespace");
case Xol_kwd_grp_.Id_num_admins: return Bry_.new_a7("numberofadmins");
case Xol_kwd_grp_.Id_str_formatnum: return Bry_.new_a7("formatnum");
case Xol_kwd_grp_.Id_str_padleft: return Bry_.new_a7("padleft");
case Xol_kwd_grp_.Id_str_padright: return Bry_.new_a7("padright");
case Xol_kwd_grp_.Id_misc_special: return Bry_.new_a7("special");
case Xol_kwd_grp_.Id_page_defaultsort: return Bry_.new_a7("defaultsort");
case Xol_kwd_grp_.Id_url_filepath: return Bry_.new_a7("filepath");
case Xol_kwd_grp_.Id_misc_tag: return Bry_.new_a7("tag");
case Xol_kwd_grp_.Id_hiddencat: return Bry_.new_a7("hiddencat");
case Xol_kwd_grp_.Id_site_pagesincategory: return Bry_.new_a7("pagesincategory");
case Xol_kwd_grp_.Id_rev_pagesize: return Bry_.new_a7("pagesize");
case Xol_kwd_grp_.Id_index: return Bry_.new_a7("index");
case Xol_kwd_grp_.Id_noindex: return Bry_.new_a7("noindex");
case Xol_kwd_grp_.Id_site_numberingroup: return Bry_.new_a7("numberingroup");
case Xol_kwd_grp_.Id_staticredirect: return Bry_.new_a7("staticredirect");
case Xol_kwd_grp_.Id_rev_protectionlevel: return Bry_.new_a7("protectionlevel");
case Xol_kwd_grp_.Id_str_formatdate: return Bry_.new_a7("formatdate");
case Xol_kwd_grp_.Id_url_path: return Bry_.new_a7("url_path");
case Xol_kwd_grp_.Id_url_wiki: return Bry_.new_a7("url_wiki");
case Xol_kwd_grp_.Id_url_query: return Bry_.new_a7("url_query");
case Xol_kwd_grp_.Id_xtn_expr: return Bry_.new_a7("expr");
case Xol_kwd_grp_.Id_xtn_if: return Bry_.new_a7("if");
case Xol_kwd_grp_.Id_xtn_ifeq: return Bry_.new_a7("ifeq");
case Xol_kwd_grp_.Id_xtn_ifexpr: return Bry_.new_a7("ifexpr");
case Xol_kwd_grp_.Id_xtn_iferror: return Bry_.new_a7("iferror");
case Xol_kwd_grp_.Id_xtn_switch: return Bry_.new_a7("switch");
case Xol_kwd_grp_.Id_xtn_default: return Bry_.new_a7("default");
case Xol_kwd_grp_.Id_xtn_ifexist: return Bry_.new_a7("ifexist");
case Xol_kwd_grp_.Id_xtn_time: return Bry_.new_a7("time");
case Xol_kwd_grp_.Id_xtn_timel: return Bry_.new_a7("timel");
case Xol_kwd_grp_.Id_xtn_rel2abs: return Bry_.new_a7("rel2abs");
case Xol_kwd_grp_.Id_xtn_titleparts: return Bry_.new_a7("titleparts");
case Xol_kwd_grp_.Id_xowa_dbg: return Bry_.new_a7("xowa_dbg");
case Xol_kwd_grp_.Id_ogg_noplayer: return Bry_.new_a7("noplayer");
case Xol_kwd_grp_.Id_ogg_noicon: return Bry_.new_a7("noicon");
case Xol_kwd_grp_.Id_ogg_thumbtime: return Bry_.new_a7("thumbtime");
case Xol_kwd_grp_.Id_xtn_geodata_coordinates: return Bry_.new_a7("coordinates");
case Xol_kwd_grp_.Id_url_canonicalurl: return Bry_.new_a7("canonicalurl");
case Xol_kwd_grp_.Id_url_canonicalurle: return Bry_.new_a7("canonicalurle");
case Xol_kwd_grp_.Id_lst: return Bry_.new_a7("lst");
case Xol_kwd_grp_.Id_lstx: return Bry_.new_a7("lstx");
case Xol_kwd_grp_.Id_lsth: return Bry_.new_u8("lsth");
case Xol_kwd_grp_.Id_invoke: return Bry_.new_a7("invoke");
case Xol_kwd_grp_.Id_property: return Bry_.new_a7("property");
case Xol_kwd_grp_.Id_noexternallanglinks: return Bry_.new_a7("noexternallanglinks");
case Xol_kwd_grp_.Id_ns_num: return Bry_.new_a7("namespacenumber");
case Xol_kwd_grp_.Id_page_id: return Bry_.new_a7("pageid");
case Xol_kwd_grp_.Id_disambig: return Bry_.new_a7("disambiguation");
case Xol_kwd_grp_.Id_nocommafysuffix: return Bry_.new_a7("nosep");
case Xol_kwd_grp_.Id_xowa: return Bry_.new_a7("xowa");
case Xol_kwd_grp_.Id_mapSources_deg2dd: return Bry_.new_a7("deg2dd");
case Xol_kwd_grp_.Id_mapSources_dd2dms: return Bry_.new_a7("dd2dms");
case Xol_kwd_grp_.Id_mapSources_geoLink: return Bry_.new_a7("geolink");
case Xol_kwd_grp_.Id_geoCrumbs_isin: return Bry_.new_a7("isin");
case Xol_kwd_grp_.Id_relatedArticles: return Bry_.new_a7("relatedArticles");
case Xol_kwd_grp_.Id_insider: return Bry_.new_a7("insider");
case Xol_kwd_grp_.Id_massMessage_target: return Bry_.new_a7("target");
case Xol_kwd_grp_.Id_cascadingSources: return Bry_.new_a7("cascadingSources");
case Xol_kwd_grp_.Id_pendingChangeLevel: return Bry_.new_a7("pendingChangeLevel");
case Xol_kwd_grp_.Id_pagesUsingPendingChanges: return Bry_.new_a7("pagesUsingPendingChanges");
case Xol_kwd_grp_.Id_bang: return Bry_.new_a7("!");
case Xol_kwd_grp_.Id_wbreponame: return Bry_.new_a7("wbreponame");
case Xol_kwd_grp_.Id_strx_len: return Bry_.new_a7("len");
case Xol_kwd_grp_.Id_strx_pos: return Bry_.new_a7("pos");
case Xol_kwd_grp_.Id_strx_rpos: return Bry_.new_a7("rpos");
case Xol_kwd_grp_.Id_strx_sub: return Bry_.new_a7("sub");
case Xol_kwd_grp_.Id_strx_count: return Bry_.new_a7("count");
case Xol_kwd_grp_.Id_strx_replace: return Bry_.new_a7("replace");
case Xol_kwd_grp_.Id_strx_explode: return Bry_.new_a7("explode");
case Xol_kwd_grp_.Id_strx_urldecode: return Bry_.new_a7("urldecode");
case Xol_kwd_grp_.Id_pagesincategory_pages: return Bry_.new_u8("pagesincategory_pages");
case Xol_kwd_grp_.Id_pagesincategory_subcats: return Bry_.new_u8("pagesincategory_subcats");
case Xol_kwd_grp_.Id_pagesincategory_files: return Bry_.new_u8("pagesincategory_files");
case Xol_kwd_grp_.Id_rev_revisionsize: return Bry_.new_u8("revisionsize");
case Xol_kwd_grp_.Id_pagebanner: return Bry_.new_u8("pagebanner");
case Xol_kwd_grp_.Id_rev_protectionexpiry: return Bry_.new_u8("protectionexpiry");
case Xol_kwd_grp_.Id_new_window_link: return Bry_.new_u8("newwindowlink");
case Xol_kwd_grp_.Id_categorytree: return Bry_.new_u8("categorytree");
case Xol_kwd_grp_.Id_assessment: return Bry_.new_u8("assessment");
default: throw Err_.new_unhandled(id);
		}
	}
	public static byte[] Bry_by_id(int id) {
		if (Bry__ == null) Bry_init();
		return Bry__[id];
	}	private static byte[][] Bry__;
	public static int Id_by_bry(byte[] find) {
		if (hash == null) {
			hash = Hash_adp_bry.ci_a7();	// ASCII: all MW kwds appear to be ASCII; EX: "redirect", "toc", "currentmont", etc.
			if (Bry__ == null) Bry_init();
			int len = Bry__.length;
			for (int i = 0; i < len; i++) {
				byte[] bry = Bry__[i];
				hash.Add(bry, new Int_obj_val(i));
			}
		}
		Object o = hash.Get_by_bry(find);
		return o == null? Int_.Neg1 : ((Int_obj_val)o).Val();
	}	private static Hash_adp_bry hash;
	private static void Bry_init() {
		Bry__ = new byte[Id__max][];
		for (int i = 0; i < Id__max; i++)
			Bry__[i] = ary_itm_(i);
	}
}

