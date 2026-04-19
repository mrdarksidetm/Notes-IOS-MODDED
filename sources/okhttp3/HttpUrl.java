package okhttp3;

import ae.j;
import ae.r;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import ge.g;
import ge.o;
import hf.c;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.v;
import je.w;
import je.y;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpUrl {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Companion f16833k = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f16834l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f16840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f16841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f16842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f16843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f16844j;

    public static final class Builder {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Companion f16845i = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f16846a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f16849d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<String> f16851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<String> f16852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f16853h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f16847b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f16848c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f16850e = -1;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i10, int i11) {
                try {
                    int i12 = Integer.parseInt(Companion.b(HttpUrl.f16833k, str, i10, i11, "", false, false, false, false, null, 248, null));
                    boolean z10 = false;
                    if (1 <= i12 && i12 < 65536) {
                        z10 = true;
                    }
                    if (z10) {
                        return i12;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 < i11) {
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((r.g(cCharAt, 97) < 0 || r.g(cCharAt, R.styleable.AppCompatTheme_windowFixedWidthMajor) > 0) && (r.g(cCharAt, 65) < 0 || r.g(cCharAt, 90) > 0)) {
                    return -1;
                }
                int i12 = i10 + 1;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    char cCharAt2 = str.charAt(i12);
                    if (!(((((('a' <= cCharAt2 && cCharAt2 < '{') || ('A' <= cCharAt2 && cCharAt2 < '[')) || ('0' <= cCharAt2 && cCharAt2 < ':')) || cCharAt2 == '+') || cCharAt2 == '-') || cCharAt2 == '.')) {
                        if (cCharAt2 == ':') {
                            return i12;
                        }
                        return -1;
                    }
                    i12 = i13;
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    int i13 = i10 + 1;
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10 = i13;
                }
                return i12;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f16851f = arrayList;
            arrayList.add("");
        }

        private final int b() {
            int i10 = this.f16850e;
            if (i10 != -1) {
                return i10;
            }
            Companion companion = HttpUrl.f16833k;
            String str = this.f16846a;
            r.c(str);
            return companion.c(str);
        }

        private final boolean m(String str) {
            return r.b(str, ".") || v.t(str, "%2e", true);
        }

        private final boolean n(String str) {
            return r.b(str, "..") || v.t(str, "%2e.", true) || v.t(str, ".%2e", true) || v.t(str, "%2e%2e", true);
        }

        private final void q() {
            List<String> list = this.f16851f;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.f16851f.isEmpty())) {
                this.f16851f.add("");
            } else {
                List<String> list2 = this.f16851f;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void s(String str, int i10, int i11, boolean z10, boolean z11) {
            String strB = Companion.b(HttpUrl.f16833k, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, null, 240, null);
            if (m(strB)) {
                return;
            }
            if (n(strB)) {
                q();
                return;
            }
            List<String> list = this.f16851f;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.f16851f;
                list2.set(list2.size() - 1, strB);
            } else {
                this.f16851f.add(strB);
            }
            if (z10) {
                this.f16851f.add("");
            }
        }

        private final void u(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f16851f.clear();
                this.f16851f.add("");
                i10++;
            } else {
                List<String> list = this.f16851f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i12 = i10;
                while (i12 < i11) {
                    i10 = Util.p(str, "/\\", i12, i11);
                    boolean z10 = i10 < i11;
                    s(str, i12, i10, z10, true);
                    if (z10) {
                        i12 = i10 + 1;
                    }
                }
                return;
            }
        }

        public final void A(String str) {
            this.f16849d = str;
        }

        public final void B(int i10) {
            this.f16850e = i10;
        }

        public final void C(String str) {
            this.f16846a = str;
        }

        public final Builder D(String str) {
            r.f(str, URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME);
            z(Companion.b(HttpUrl.f16833k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final HttpUrl a() {
            ArrayList arrayList;
            String str = this.f16846a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.f16833k;
            String strH = Companion.h(companion, this.f16847b, 0, 0, false, 7, null);
            String strH2 = Companion.h(companion, this.f16848c, 0, 0, false, 7, null);
            String str2 = this.f16849d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            List<String> list = this.f16851f;
            ArrayList arrayList2 = new ArrayList(nd.v.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.h(HttpUrl.f16833k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f16852g;
            if (list2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(nd.v.x(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 == null ? null : Companion.h(HttpUrl.f16833k, str3, 0, 0, true, 3, null));
                }
            }
            String str4 = this.f16853h;
            return new HttpUrl(str, strH, strH2, str2, iB, arrayList2, arrayList, str4 == null ? null : Companion.h(HttpUrl.f16833k, str4, 0, 0, false, 7, null), toString());
        }

        public final Builder c(String str) {
            List<String> listJ = null;
            if (str != null) {
                Companion companion = HttpUrl.f16833k;
                String strB = Companion.b(companion, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (strB != null) {
                    listJ = companion.j(strB);
                }
            }
            y(listJ);
            return this;
        }

        public final String d() {
            return this.f16853h;
        }

        public final String e() {
            return this.f16848c;
        }

        public final List<String> f() {
            return this.f16851f;
        }

        public final List<String> g() {
            return this.f16852g;
        }

        public final String h() {
            return this.f16847b;
        }

        public final String i() {
            return this.f16849d;
        }

        public final int j() {
            return this.f16850e;
        }

        public final String k() {
            return this.f16846a;
        }

        public final Builder l(String str) {
            r.f(str, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
            String strE = HostnamesKt.e(Companion.h(HttpUrl.f16833k, str, 0, 0, false, 7, null));
            if (strE == null) {
                throw new IllegalArgumentException(r.m("unexpected host: ", str));
            }
            A(strE);
            return this;
        }

        public final Builder o(HttpUrl httpUrl, String str) {
            int iP;
            int i10;
            int i11;
            String str2;
            boolean z10;
            int i12;
            String str3;
            int i13;
            boolean z11;
            String strM = str;
            r.f(strM, "input");
            int iZ = Util.z(strM, 0, 0, 3, null);
            int iB = Util.B(strM, iZ, 0, 2, null);
            Companion companion = f16845i;
            int iG = companion.g(strM, iZ, iB);
            String str4 = "this as java.lang.String…ing(startIndex, endIndex)";
            byte b10 = -1;
            boolean z12 = true;
            if (iG != -1) {
                if (v.D(strM, "https:", iZ, true)) {
                    this.f16846a = "https";
                    iZ += 6;
                } else {
                    if (!v.D(strM, "http:", iZ, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = strM.substring(0, iG);
                        r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f16846a = "http";
                    iZ += 5;
                }
            } else {
                if (httpUrl == null) {
                    if (str.length() > 6) {
                        strM = r.m(y.c1(strM, 6), "...");
                    }
                    throw new IllegalArgumentException(r.m("Expected URL scheme 'http' or 'https' but no scheme was found for ", strM));
                }
                this.f16846a = httpUrl.p();
            }
            int iH = companion.h(strM, iZ, iB);
            byte b11 = 63;
            byte b12 = 35;
            if (iH >= 2 || httpUrl == null || !r.b(httpUrl.p(), this.f16846a)) {
                int i14 = iZ + iH;
                boolean z13 = false;
                boolean z14 = false;
                while (true) {
                    iP = Util.p(strM, "@/\\?#", i14, iB);
                    byte bCharAt = iP != iB ? strM.charAt(iP) : b10;
                    if (bCharAt == b10 || bCharAt == b12 || bCharAt == 47 || bCharAt == 92 || bCharAt == b11) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z13) {
                            z10 = z12;
                            i12 = iB;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f16848c);
                            sb3.append("%40");
                            str3 = str4;
                            i13 = iP;
                            sb3.append(Companion.b(HttpUrl.f16833k, str, i14, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f16848c = sb3.toString();
                        } else {
                            int iO = Util.o(strM, ':', i14, iP);
                            Companion companion2 = HttpUrl.f16833k;
                            z10 = z12;
                            i12 = iB;
                            String str5 = str4;
                            String strB = Companion.b(companion2, str, i14, iO, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z14) {
                                strB = this.f16847b + "%40" + strB;
                            }
                            this.f16847b = strB;
                            if (iO != iP) {
                                this.f16848c = Companion.b(companion2, str, iO + 1, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z10;
                            } else {
                                z11 = z13;
                            }
                            z13 = z11;
                            str3 = str5;
                            z14 = z10;
                            i13 = iP;
                        }
                        i14 = i13 + 1;
                        str4 = str3;
                        z12 = z10;
                        iB = i12;
                        b12 = 35;
                        b11 = 63;
                        b10 = -1;
                    }
                }
                boolean z15 = z12;
                String str6 = str4;
                i10 = iB;
                Companion companion3 = f16845i;
                int iF = companion3.f(strM, i14, iP);
                int i15 = iF + 1;
                if (i15 < iP) {
                    i11 = i14;
                    this.f16849d = HostnamesKt.e(Companion.h(HttpUrl.f16833k, str, i14, iF, false, 4, null));
                    int iE = companion3.e(strM, i15, iP);
                    this.f16850e = iE;
                    if (!(iE != -1 ? z15 : false)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = strM.substring(i15, iP);
                        r.e(strSubstring2, str6);
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str2 = str6;
                } else {
                    i11 = i14;
                    str2 = str6;
                    Companion companion4 = HttpUrl.f16833k;
                    this.f16849d = HostnamesKt.e(Companion.h(companion4, str, i11, iF, false, 4, null));
                    String str7 = this.f16846a;
                    r.c(str7);
                    this.f16850e = companion4.c(str7);
                }
                if (!(this.f16849d != null ? z15 : false)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = strM.substring(i11, iF);
                    r.e(strSubstring3, str2);
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iZ = iP;
            } else {
                this.f16847b = httpUrl.g();
                this.f16848c = httpUrl.c();
                this.f16849d = httpUrl.h();
                this.f16850e = httpUrl.l();
                this.f16851f.clear();
                this.f16851f.addAll(httpUrl.e());
                if (iZ == iB || strM.charAt(iZ) == '#') {
                    c(httpUrl.f());
                }
                i10 = iB;
            }
            int i16 = i10;
            int iP2 = Util.p(strM, "?#", iZ, i16);
            u(strM, iZ, iP2);
            if (iP2 < i16 && strM.charAt(iP2) == '?') {
                int iO2 = Util.o(strM, '#', iP2, i16);
                Companion companion5 = HttpUrl.f16833k;
                this.f16852g = companion5.j(Companion.b(companion5, str, iP2 + 1, iO2, " \"'<>#", true, false, true, false, null, 208, null));
                iP2 = iO2;
            }
            if (iP2 < i16 && strM.charAt(iP2) == '#') {
                this.f16853h = Companion.b(HttpUrl.f16833k, str, iP2 + 1, i16, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder p(String str) {
            r.f(str, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD);
            x(Companion.b(HttpUrl.f16833k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final Builder r(int i10) {
            boolean z10 = false;
            if (1 <= i10 && i10 < 65536) {
                z10 = true;
            }
            if (!z10) {
                throw new IllegalArgumentException(r.m("unexpected port: ", Integer.valueOf(i10)).toString());
            }
            B(i10);
            return this;
        }

        public final Builder t() {
            String strI = i();
            A(strI == null ? null : new je.j("[\"<>^`{|}]").f(strI, ""));
            int size = f().size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                f().set(i11, Companion.b(HttpUrl.f16833k, f().get(i11), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> listG = g();
            if (listG != null) {
                int size2 = listG.size();
                while (i10 < size2) {
                    int i12 = i10 + 1;
                    String str = listG.get(i10);
                    listG.set(i10, str == null ? null : Companion.b(HttpUrl.f16833k, str, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null));
                    i10 = i12;
                }
            }
            String strD = d();
            w(strD != null ? Companion.b(HttpUrl.f16833k, strD, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instruction units count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder v(String str) {
            r.f(str, "scheme");
            String str2 = "http";
            if (!v.t(str, "http", true)) {
                str2 = "https";
                if (!v.t(str, "https", true)) {
                    throw new IllegalArgumentException(r.m("unexpected scheme: ", str));
                }
            }
            C(str2);
            return this;
        }

        public final void w(String str) {
            this.f16853h = str;
        }

        public final void x(String str) {
            r.f(str, "<set-?>");
            this.f16848c = str;
        }

        public final void y(List<String> list) {
            this.f16852g = list;
        }

        public final void z(String str) {
            r.f(str, "<set-?>");
            this.f16847b = str;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ String b(Companion companion, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            return companion.a(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && Util.H(str.charAt(i10 + 1)) != -1 && Util.H(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String h(Companion companion, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return companion.g(str, i10, i11, z10);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0090 A[LOOP:1: B:49:0x008a->B:51:0x0090, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void l(hf.c r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lb9
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L28
                r8 = 9
                if (r7 == r8) goto L23
                r8 = 10
                if (r7 == r8) goto L23
                r8 = 12
                if (r7 == r8) goto L23
                r8 = 13
                if (r7 != r8) goto L28
            L23:
                r8 = r14
                r12 = r19
                goto Lb2
            L28:
                r8 = 43
                if (r7 != r8) goto L39
                if (r22 == 0) goto L39
                if (r20 == 0) goto L33
                java.lang.String r8 = "+"
                goto L35
            L33:
                java.lang.String r8 = "%2B"
            L35:
                r15.z(r8)
                goto L23
            L39:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L69
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L69
                r8 = 128(0x80, float:1.8E-43)
                if (r7 < r8) goto L49
                if (r23 == 0) goto L69
            L49:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = je.m.K(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L67
                if (r7 != r9) goto L62
                if (r20 == 0) goto L67
                if (r21 == 0) goto L62
                r8 = r14
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L63
                goto L6c
            L62:
                r8 = r14
            L63:
                r15.D0(r7)
                goto Lb2
            L67:
                r8 = r14
                goto L6c
            L69:
                r8 = r14
                r12 = r19
            L6c:
                if (r6 != 0) goto L73
                hf.c r6 = new hf.c
                r6.<init>()
            L73:
                if (r3 == 0) goto L87
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = ae.r.b(r3, r10)
                if (r10 == 0) goto L7e
                goto L87
            L7e:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.A0(r1, r5, r10, r3)
                goto L8a
            L87:
                r6.D0(r7)
            L8a:
                boolean r10 = r6.q()
                if (r10 != 0) goto Lb2
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = okhttp3.HttpUrl.a()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.a()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L8a
            Lb2:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lb9:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.l(hf.c, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void m(c cVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int iH = Util.H(str.charAt(i10 + 1));
                    int iH2 = Util.H(str.charAt(i12));
                    if (iH == -1 || iH2 == -1) {
                        cVar.D0(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        cVar.writeByte((iH << 4) + iH2);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z10) {
                    cVar.writeByte(32);
                    i10++;
                } else {
                    cVar.D0(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(java.lang.String r14, int r15, int r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, java.nio.charset.Charset r22) {
            /*
                r13 = this;
                r2 = r14
                r4 = r16
                r5 = r17
                java.lang.String r0 = "<this>"
                ae.r.f(r14, r0)
                java.lang.String r0 = "encodeSet"
                ae.r.f(r5, r0)
                r3 = r15
            L10:
                if (r3 >= r4) goto L6f
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L4c
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L4c
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L24
                if (r21 == 0) goto L4c
            L24:
                char r1 = (char) r0
                r6 = 0
                r7 = 2
                r8 = 0
                boolean r1 = je.m.K(r5, r1, r6, r7, r8)
                if (r1 != 0) goto L4c
                r1 = 37
                if (r0 != r1) goto L3e
                if (r18 == 0) goto L4c
                if (r19 == 0) goto L3e
                r11 = r13
                boolean r1 = r13.e(r14, r3, r4)
                if (r1 == 0) goto L4d
                goto L3f
            L3e:
                r11 = r13
            L3f:
                r1 = 43
                if (r0 != r1) goto L46
                if (r20 == 0) goto L46
                goto L4d
            L46:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L10
            L4c:
                r11 = r13
            L4d:
                hf.c r12 = new hf.c
                r12.<init>()
                r0 = r15
                r12.C0(r14, r15, r3)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.m0()
                return r0
            L6f:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
                ae.r.e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        public final int c(String str) {
            r.f(str, "scheme");
            if (r.b(str, "http")) {
                return 80;
            }
            return r.b(str, "https") ? 443 : -1;
        }

        public final HttpUrl d(String str) {
            r.f(str, "<this>");
            return new Builder().o(null, str).a();
        }

        public final HttpUrl f(String str) {
            r.f(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z10) {
            r.f(str, "<this>");
            int i12 = i10;
            while (i12 < i11) {
                int i13 = i12 + 1;
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    c cVar = new c();
                    cVar.C0(str, i10, i12);
                    m(cVar, str, i12, i11, z10);
                    return cVar.m0();
                }
                i12 = i13;
            }
            String strSubstring = str.substring(i10, i11);
            r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void i(List<String> list, StringBuilder sb2) {
            r.f(list, "<this>");
            r.f(sb2, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append(list.get(i10));
            }
        }

        public final List<String> j(String str) {
            String strSubstring;
            r.f(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int iX = w.X(str, '&', i10, false, 4, null);
                if (iX == -1) {
                    iX = str.length();
                }
                int i11 = iX;
                int iX2 = w.X(str, '=', i10, false, 4, null);
                if (iX2 == -1 || iX2 > i11) {
                    String strSubstring2 = str.substring(i10, i11);
                    r.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    strSubstring = null;
                } else {
                    String strSubstring3 = str.substring(i10, iX2);
                    r.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                    strSubstring = str.substring(iX2 + 1, i11);
                    r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strSubstring);
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void k(List<String> list, StringBuilder sb2) {
            r.f(list, "<this>");
            r.f(sb2, "out");
            g gVarS = o.s(o.t(0, list.size()), 2);
            int iL = gVarS.l();
            int iN = gVarS.n();
            int iO = gVarS.o();
            if ((iO <= 0 || iL > iN) && (iO >= 0 || iN > iL)) {
                return;
            }
            while (true) {
                int i10 = iL + iO;
                String str = list.get(iL);
                String str2 = list.get(iL + 1);
                if (iL > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (iL == iN) {
                    return;
                } else {
                    iL = i10;
                }
            }
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        r.f(str, "scheme");
        r.f(str2, URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME);
        r.f(str3, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD);
        r.f(str4, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
        r.f(list, "pathSegments");
        r.f(str6, "url");
        this.f16835a = str;
        this.f16836b = str2;
        this.f16837c = str3;
        this.f16838d = str4;
        this.f16839e = i10;
        this.f16840f = list;
        this.f16841g = list2;
        this.f16842h = str5;
        this.f16843i = str6;
        this.f16844j = r.b(str, "https");
    }

    public final String b() {
        if (this.f16842h == null) {
            return null;
        }
        String strSubstring = this.f16843i.substring(w.X(this.f16843i, '#', 0, false, 6, null) + 1);
        r.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.f16837c.length() == 0) {
            return "";
        }
        String strSubstring = this.f16843i.substring(w.X(this.f16843i, ':', this.f16835a.length() + 3, false, 4, null) + 1, w.X(this.f16843i, '@', 0, false, 6, null));
        r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iX = w.X(this.f16843i, '/', this.f16835a.length() + 3, false, 4, null);
        String str = this.f16843i;
        String strSubstring = this.f16843i.substring(iX, Util.p(str, "?#", iX, str.length()));
        r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List<String> e() {
        int iX = w.X(this.f16843i, '/', this.f16835a.length() + 3, false, 4, null);
        String str = this.f16843i;
        int iP = Util.p(str, "?#", iX, str.length());
        ArrayList arrayList = new ArrayList();
        while (iX < iP) {
            int i10 = iX + 1;
            int iO = Util.o(this.f16843i, '/', i10, iP);
            String strSubstring = this.f16843i.substring(i10, iO);
            r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iX = iO;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && r.b(((HttpUrl) obj).f16843i, this.f16843i);
    }

    public final String f() {
        if (this.f16841g == null) {
            return null;
        }
        int iX = w.X(this.f16843i, '?', 0, false, 6, null) + 1;
        String str = this.f16843i;
        String strSubstring = this.f16843i.substring(iX, Util.o(str, '#', iX, str.length()));
        r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        if (this.f16836b.length() == 0) {
            return "";
        }
        int length = this.f16835a.length() + 3;
        String str = this.f16843i;
        String strSubstring = this.f16843i.substring(length, Util.p(str, ":@", length, str.length()));
        r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String h() {
        return this.f16838d;
    }

    public int hashCode() {
        return this.f16843i.hashCode();
    }

    public final boolean i() {
        return this.f16844j;
    }

    public final Builder j() {
        Builder builder = new Builder();
        builder.C(this.f16835a);
        builder.z(g());
        builder.x(c());
        builder.A(this.f16838d);
        builder.B(this.f16839e != f16833k.c(this.f16835a) ? this.f16839e : -1);
        builder.f().clear();
        builder.f().addAll(e());
        builder.c(f());
        builder.w(b());
        return builder;
    }

    public final Builder k(String str) {
        r.f(str, "link");
        try {
            return new Builder().o(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int l() {
        return this.f16839e;
    }

    public final String m() {
        if (this.f16841g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f16833k.k(this.f16841g, sb2);
        return sb2.toString();
    }

    public final String n() {
        Builder builderK = k("/...");
        r.c(builderK);
        return builderK.D("").p("").a().toString();
    }

    public final HttpUrl o(String str) {
        r.f(str, "link");
        Builder builderK = k(str);
        if (builderK == null) {
            return null;
        }
        return builderK.a();
    }

    public final String p() {
        return this.f16835a;
    }

    public final URI q() {
        String string = j().t().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new je.j("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").f(string, ""));
                r.e(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL r() {
        try {
            return new URL(this.f16843i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f16843i;
    }
}
