package je;

import ae.m0;
import java.util.Comparator;
import nd.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class v extends u {
    public static final String A(String str, String str2, String str3, boolean z10) {
        ae.r.f(str, "<this>");
        ae.r.f(str2, "oldValue");
        ae.r.f(str3, "newValue");
        int i10 = 0;
        int iU = w.U(str, str2, 0, z10);
        if (iU < 0) {
            return str;
        }
        int length = str2.length();
        int iD = ge.o.d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iU);
            sb2.append(str3);
            i10 = iU + length;
            if (iU >= str.length()) {
                break;
            }
            iU = w.U(str, str2, iU + iD, z10);
        } while (iU > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        ae.r.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String B(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return z(str, c10, c11, z10);
    }

    public static /* synthetic */ String C(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return A(str, str2, str3, z10);
    }

    public static boolean D(String str, String str2, int i10, boolean z10) {
        ae.r.f(str, "<this>");
        ae.r.f(str2, "prefix");
        return !z10 ? str.startsWith(str2, i10) : w(str, i10, str2, 0, str2.length(), z10);
    }

    public static boolean E(String str, String str2, boolean z10) {
        ae.r.f(str, "<this>");
        ae.r.f(str2, "prefix");
        return !z10 ? str.startsWith(str2) : w(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean F(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return D(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean G(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return E(str, str2, z10);
    }

    public static String p(char[] cArr) {
        ae.r.f(cArr, "<this>");
        return new String(cArr);
    }

    public static String q(char[] cArr, int i10, int i11) {
        ae.r.f(cArr, "<this>");
        nd.c.f16106a.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static boolean r(String str, String str2, boolean z10) {
        ae.r.f(str, "<this>");
        ae.r.f(str2, "suffix");
        return !z10 ? str.endsWith(str2) : w(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean s(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return r(str, str2, z10);
    }

    public static boolean t(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator<String> u(m0 m0Var) {
        ae.r.f(m0Var, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        ae.r.e(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean v(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            ae.r.f(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3e
            ge.i r0 = je.w.R(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L20
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L20
        L1e:
            r4 = r2
            goto L3c
        L20:
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1e
            r3 = r0
            nd.l0 r3 = (nd.l0) r3
            int r3 = r3.nextInt()
            char r3 = r4.charAt(r3)
            boolean r3 = je.a.c(r3)
            if (r3 != 0) goto L24
            r4 = r1
        L3c:
            if (r4 == 0) goto L3f
        L3e:
            r1 = r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: je.v.v(java.lang.CharSequence):boolean");
    }

    public static boolean w(String str, int i10, String str2, int i11, int i12, boolean z10) {
        ae.r.f(str, "<this>");
        ae.r.f(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static /* synthetic */ boolean x(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return w(str, i10, str2, i11, i12, z10);
    }

    public static String y(CharSequence charSequence, int i10) {
        ae.r.f(charSequence, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + com.amazon.a.a.o.c.a.b.f7490a).toString());
        }
        if (i10 == 0) {
            return "";
        }
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cArr[i11] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        l0 l0VarR = new ge.i(1, i10).iterator();
        while (l0VarR.hasNext()) {
            l0VarR.nextInt();
            sb2.append(charSequence);
        }
        String string = sb2.toString();
        ae.r.c(string);
        return string;
    }

    public static final String z(String str, char c10, char c11, boolean z10) {
        String string;
        String str2;
        ae.r.f(str, "<this>");
        if (z10) {
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (c.d(cCharAt, c10, z10)) {
                    cCharAt = c11;
                }
                sb2.append(cCharAt);
            }
            string = sb2.toString();
            str2 = "toString(...)";
        } else {
            string = str.replace(c10, c11);
            str2 = "replace(...)";
        }
        ae.r.e(string, str2);
        return string;
    }
}
