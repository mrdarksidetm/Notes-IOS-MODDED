package com.pichillilorenzo.flutter_inappwebview_android;

import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.amazon.a.a.o.b.f;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import f5.a;
import f5.s;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class MyCookieManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "MyCookieManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_cookiemanager";
    public static CookieManager cookieManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyCookieManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new j(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static String getCookieExpirationDate(Long l10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date(l10.longValue()));
    }

    private static CookieManager getCookieManager() throws Exception {
        if (cookieManager == null) {
            try {
                cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e10) {
                if (e10.getMessage() == null || !e10.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    throw e10;
                }
                return null;
            }
        }
        return cookieManager;
    }

    public static void init() {
        if (cookieManager == null) {
            cookieManager = getCookieManager();
        }
    }

    public void deleteAllCookies(final j.d dVar) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            dVar.success(Boolean.FALSE);
        } else {
            cookieManager.removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.3
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    dVar.success(bool);
                }
            });
            cookieManager.flush();
        }
    }

    public void deleteCookie(String str, String str2, String str3, String str4, final j.d dVar) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            dVar.success(Boolean.FALSE);
            return;
        }
        String str5 = str2 + "=; Path=" + str4 + "; Max-Age=-1";
        if (str3 != null) {
            str5 = str5 + "; Domain=" + str3;
        }
        cookieManager.setCookie(str, str5 + ";", new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
                dVar.success(bool);
            }
        });
        cookieManager.flush();
    }

    public void deleteCookies(String str, String str2, String str3, j.d dVar) throws Exception {
        Boolean bool;
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            bool = Boolean.FALSE;
        } else {
            String cookie = cookieManager2.getCookie(str);
            if (cookie != null) {
                for (String str4 : cookie.split(";")) {
                    String str5 = str4.split(f.f7479b, 2)[0].trim() + "=; Path=" + str3 + "; Max-Age=-1";
                    if (str2 != null) {
                        str5 = str5 + "; Domain=" + str2;
                    }
                    cookieManager.setCookie(str, str5 + ";", null);
                }
                cookieManager.flush();
            }
            bool = Boolean.TRUE;
        }
        dVar.success(bool);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public List<Map<String, Object>> getCookies(String str) throws Exception {
        String str2;
        ArrayList arrayList = new ArrayList();
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return arrayList;
        }
        List arrayList2 = new ArrayList();
        String str3 = "GET_COOKIE_INFO";
        String str4 = ";";
        if (s.a("GET_COOKIE_INFO")) {
            arrayList2 = a.b(cookieManager, str);
        } else {
            String cookie = cookieManager.getCookie(str);
            if (cookie != null) {
                arrayList2 = Arrays.asList(cookie.split(";"));
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = ((String) it.next()).split(str4);
            if (strArrSplit.length != 0) {
                String[] strArrSplit2 = strArrSplit[0].split(f.f7479b, 2);
                String strTrim = strArrSplit2[0].trim();
                String strTrim2 = strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "";
                HashMap map = new HashMap();
                map.put("name", strTrim);
                map.put("value", strTrim2);
                map.put("expiresDate", null);
                map.put("isSessionOnly", null);
                map.put("domain", null);
                map.put("sameSite", null);
                map.put("isSecure", null);
                map.put("isHttpOnly", null);
                map.put("path", null);
                if (s.a(str3)) {
                    Boolean bool = Boolean.FALSE;
                    map.put("isSecure", bool);
                    map.put("isHttpOnly", bool);
                    int i10 = 1;
                    while (i10 < strArrSplit.length) {
                        Iterator it2 = it;
                        String[] strArrSplit3 = strArrSplit[i10].split(f.f7479b, 2);
                        String strTrim3 = strArrSplit3[0].trim();
                        String str5 = str3;
                        String[] strArr = strArrSplit;
                        String strTrim4 = strArrSplit3.length > 1 ? strArrSplit3[1].trim() : "";
                        if (strTrim3.equalsIgnoreCase("Expires")) {
                            try {
                                str2 = str4;
                            } catch (ParseException e10) {
                                e = e10;
                                str2 = str4;
                            }
                            try {
                                Date date = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US).parse(strTrim4);
                                if (date != null) {
                                    map.put("expiresDate", Long.valueOf(date.getTime()));
                                }
                            } catch (ParseException e11) {
                                e = e11;
                                Log.e(LOG_TAG, "", e);
                            }
                        } else {
                            str2 = str4;
                            if (strTrim3.equalsIgnoreCase("Max-Age")) {
                                try {
                                    map.put("expiresDate", Long.valueOf(System.currentTimeMillis() + Long.parseLong(strTrim4)));
                                } catch (NumberFormatException e12) {
                                    e = e12;
                                    Log.e(LOG_TAG, "", e);
                                }
                            } else if (strTrim3.equalsIgnoreCase("Domain")) {
                                map.put("domain", strTrim4);
                            } else if (strTrim3.equalsIgnoreCase("SameSite")) {
                                map.put("sameSite", strTrim4);
                            } else if (strTrim3.equalsIgnoreCase("Secure")) {
                                map.put("isSecure", Boolean.TRUE);
                            } else if (strTrim3.equalsIgnoreCase("HttpOnly")) {
                                map.put("isHttpOnly", Boolean.TRUE);
                            } else if (strTrim3.equalsIgnoreCase("Path")) {
                                map.put("path", strTrim4);
                            }
                        }
                        i10++;
                        str3 = str5;
                        it = it2;
                        strArrSplit = strArr;
                        str4 = str2;
                    }
                }
                arrayList.add(map);
                str3 = str3;
                it = it;
                str4 = str4;
            }
        }
        return arrayList;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) throws Exception {
        init();
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "deleteCookie":
                deleteCookie((String) iVar.a("url"), (String) iVar.a("name"), (String) iVar.a("domain"), (String) iVar.a("path"), dVar);
                break;
            case "removeSessionCookies":
                removeSessionCookies(dVar);
                break;
            case "setCookie":
                String str2 = (String) iVar.a("url");
                String str3 = (String) iVar.a("name");
                String str4 = (String) iVar.a("value");
                String str5 = (String) iVar.a("domain");
                String str6 = (String) iVar.a("path");
                String str7 = (String) iVar.a("expiresDate");
                setCookie(str2, str3, str4, str5, str6, str7 != null ? new Long(str7) : null, (Integer) iVar.a("maxAge"), (Boolean) iVar.a("isSecure"), (Boolean) iVar.a("isHttpOnly"), (String) iVar.a("sameSite"), dVar);
                break;
            case "deleteCookies":
                deleteCookies((String) iVar.a("url"), (String) iVar.a("domain"), (String) iVar.a("path"), dVar);
                break;
            case "deleteAllCookies":
                deleteAllCookies(dVar);
                break;
            case "getCookies":
                dVar.success(getCookies((String) iVar.a("url")));
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }

    public void removeSessionCookies(final j.d dVar) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            dVar.success(Boolean.FALSE);
        } else {
            cookieManager.removeSessionCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.4
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    dVar.success(bool);
                }
            });
            cookieManager.flush();
        }
    }

    public void setCookie(String str, String str2, String str3, String str4, String str5, Long l10, Integer num, Boolean bool, Boolean bool2, String str6, final j.d dVar) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            dVar.success(Boolean.FALSE);
            return;
        }
        String str7 = str2 + f.f7479b + str3 + "; Path=" + str5;
        if (str4 != null) {
            str7 = str7 + "; Domain=" + str4;
        }
        if (l10 != null) {
            str7 = str7 + "; Expires=" + getCookieExpirationDate(l10);
        }
        if (num != null) {
            str7 = str7 + "; Max-Age=" + num.toString();
        }
        if (bool != null && bool.booleanValue()) {
            str7 = str7 + "; Secure";
        }
        if (bool2 != null && bool2.booleanValue()) {
            str7 = str7 + "; HttpOnly";
        }
        if (str6 != null) {
            str7 = str7 + "; SameSite=" + str6;
        }
        cookieManager.setCookie(str, str7 + ";", new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool3) {
                dVar.success(bool3);
            }
        });
        cookieManager.flush();
    }
}
