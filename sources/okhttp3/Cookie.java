package okhttp3;

import ae.j;
import ae.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.v;
import je.w;
import nd.u;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
public final class Cookie {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Companion f16783j = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f16784k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f16785l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f16786m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f16787n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f16792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f16793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f16794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f16795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f16796i;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f16797a = 253402300799999L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f16798b = "/";
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final int a(java.lang.String r6, int r7, int r8, boolean r9) {
            /*
                r5 = this;
            L0:
                if (r7 >= r8) goto L49
                int r0 = r7 + 1
                char r1 = r6.charAt(r7)
                r2 = 32
                r3 = 1
                r4 = 0
                if (r1 >= r2) goto L12
                r2 = 9
                if (r1 != r2) goto L41
            L12:
                r2 = 127(0x7f, float:1.78E-43)
                if (r1 >= r2) goto L41
                r2 = 57
                if (r1 > r2) goto L20
                r2 = 48
                if (r2 > r1) goto L20
                r2 = r3
                goto L21
            L20:
                r2 = r4
            L21:
                if (r2 != 0) goto L41
                r2 = 122(0x7a, float:1.71E-43)
                if (r1 > r2) goto L2d
                r2 = 97
                if (r2 > r1) goto L2d
                r2 = r3
                goto L2e
            L2d:
                r2 = r4
            L2e:
                if (r2 != 0) goto L41
                r2 = 90
                if (r1 > r2) goto L3a
                r2 = 65
                if (r2 > r1) goto L3a
                r2 = r3
                goto L3b
            L3a:
                r2 = r4
            L3b:
                if (r2 != 0) goto L41
                r2 = 58
                if (r1 != r2) goto L42
            L41:
                r4 = r3
            L42:
                r1 = r9 ^ 1
                if (r4 != r1) goto L47
                return r7
            L47:
                r7 = r0
                goto L0
            L49:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.a(java.lang.String, int, int, boolean):int");
        }

        private final boolean b(String str, String str2) {
            if (r.b(str, str2)) {
                return true;
            }
            return v.s(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.i(str);
        }

        private final String f(String str) {
            if (!(!v.s(str, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String strE = HostnamesKt.e(w.r0(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i10, int i11) {
            int iA = a(str, i10, i11, false);
            Matcher matcher = Cookie.f16787n.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iY = -1;
            int i15 = -1;
            int i16 = -1;
            while (iA < i11) {
                int iA2 = a(str, iA + 1, i11, true);
                matcher.region(iA, iA2);
                if (i13 == -1 && matcher.usePattern(Cookie.f16787n).matches()) {
                    String strGroup = matcher.group(1);
                    r.e(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    r.e(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    r.e(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(Cookie.f16786m).matches()) {
                    String strGroup4 = matcher.group(1);
                    r.e(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iY == -1 && matcher.usePattern(Cookie.f16785l).matches()) {
                    String strGroup5 = matcher.group(1);
                    r.e(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    r.e(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    r.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = Cookie.f16785l.pattern();
                    r.e(strPattern, "MONTH_PATTERN.pattern()");
                    iY = w.Y(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(Cookie.f16784k).matches()) {
                    String strGroup6 = matcher.group(1);
                    r.e(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (!(i12 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iY != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i14 && i14 < 32)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i13 >= 0 && i13 < 24)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i15 >= 0 && i15 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i16 >= 0 && i16 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.f17026f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iY - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new je.j("-?\\d+").e(str)) {
                    return v.G(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final Cookie c(HttpUrl httpUrl, String str) {
            r.f(httpUrl, "url");
            r.f(str, "setCookie");
            return d(System.currentTimeMillis(), httpUrl, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00dc A[PHI: r1
  0x00dc: PHI (r1v24 long) = (r1v8 long), (r1v12 long) binds: [B:45:0x00da, B:56:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.Cookie d(long r26, okhttp3.HttpUrl r28, java.lang.String r29) {
            /*
                Method dump skipped, instruction units count: 368
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.d(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        public final List<Cookie> e(HttpUrl httpUrl, Headers headers) {
            r.f(httpUrl, "url");
            r.f(headers, "headers");
            List<String> listO = headers.o("Set-Cookie");
            int size = listO.size();
            ArrayList arrayList = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                Cookie cookieC = c(httpUrl, listO.get(i10));
                if (cookieC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookieC);
                }
                i10 = i11;
            }
            if (arrayList == null) {
                return u.m();
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            r.e(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }
    }

    private Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f16788a = str;
        this.f16789b = str2;
        this.f16790c = j10;
        this.f16791d = str3;
        this.f16792e = str4;
        this.f16793f = z10;
        this.f16794g = z11;
        this.f16795h = z12;
        this.f16796i = z13;
    }

    public /* synthetic */ Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, j jVar) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    public final String e() {
        return this.f16791d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (r.b(cookie.f16788a, this.f16788a) && r.b(cookie.f16789b, this.f16789b) && cookie.f16790c == this.f16790c && r.b(cookie.f16791d, this.f16791d) && r.b(cookie.f16792e, this.f16792e) && cookie.f16793f == this.f16793f && cookie.f16794g == this.f16794g && cookie.f16795h == this.f16795h && cookie.f16796i == this.f16796i) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f16790c;
    }

    public final boolean g() {
        return this.f16796i;
    }

    public final boolean h() {
        return this.f16794g;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f16788a.hashCode()) * 31) + this.f16789b.hashCode()) * 31) + Long.hashCode(this.f16790c)) * 31) + this.f16791d.hashCode()) * 31) + this.f16792e.hashCode()) * 31) + Boolean.hashCode(this.f16793f)) * 31) + Boolean.hashCode(this.f16794g)) * 31) + Boolean.hashCode(this.f16795h)) * 31) + Boolean.hashCode(this.f16796i);
    }

    public final String i() {
        return this.f16788a;
    }

    public final String j() {
        return this.f16792e;
    }

    public final boolean k() {
        return this.f16795h;
    }

    public final boolean l() {
        return this.f16793f;
    }

    public final String m(boolean z10) {
        String strB;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i());
        sb2.append('=');
        sb2.append(n());
        if (k()) {
            if (f() == Long.MIN_VALUE) {
                strB = "; max-age=0";
            } else {
                sb2.append("; expires=");
                strB = DatesKt.b(new Date(f()));
            }
            sb2.append(strB);
        }
        if (!g()) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(e());
        }
        sb2.append("; path=");
        sb2.append(j());
        if (l()) {
            sb2.append("; secure");
        }
        if (h()) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        r.e(string, "toString()");
        return string;
    }

    public final String n() {
        return this.f16789b;
    }

    public String toString() {
        return m(false);
    }
}
