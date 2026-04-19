package ke;

import ae.r;
import com.revenuecat.purchases.common.UtilsKt;
import ge.l;
import ge.o;
import je.v;
import je.w;
import je.y;
import ke.a;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j10, int i10) {
        return a.n((j10 << 1) + ((long) i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10) {
        return a.n((j10 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10) {
        return new l(-4611686018426L, 4611686018426L).r(j10) ? l(n(j10)) : j(o.m(j10, -4611686018427387903L, 4611686018427387903L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return a.n(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10) {
        return new l(-4611686018426999999L, 4611686018426999999L).r(j10) ? l(j10) : j(o(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 * ((long) UtilsKt.MICROS_MULTIPLIER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j10) {
        return j10 / ((long) UtilsKt.MICROS_MULTIPLIER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(String str, boolean z10) {
        long jH;
        String str2;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        a.C0337a c0337a = a.f14459b;
        long jB = c0337a.b();
        char cCharAt = str.charAt(0);
        boolean z11 = true;
        int length2 = (cCharAt == '+' || cCharAt == '-') ? 1 : 0;
        boolean z12 = length2 > 0;
        boolean z13 = z12 && w.H0(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        String str3 = "Unexpected order of duration components";
        char c10 = '9';
        char c11 = '0';
        if (str.charAt(length2) == 'P') {
            int i10 = length2 + 1;
            if (i10 == length) {
                throw new IllegalArgumentException();
            }
            d dVar = null;
            boolean z14 = false;
            while (i10 < length) {
                if (str.charAt(i10) != 'T') {
                    int i11 = i10;
                    while (i11 < str.length()) {
                        char cCharAt2 = str.charAt(i11);
                        if (!(new ge.c(c11, c10).r(cCharAt2) || w.K("+-.", cCharAt2, false, 2, null))) {
                            break;
                        }
                        i11++;
                        c10 = '9';
                        c11 = '0';
                    }
                    r.d(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i10, i11);
                    r.e(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i10 + strSubstring.length();
                    if (length3 < 0 || length3 > w.S(str)) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt3 = str.charAt(length3);
                    i10 = length3 + 1;
                    d dVarD = f.d(cCharAt3, z14);
                    if (dVar != null && dVar.compareTo(dVarD) <= 0) {
                        throw new IllegalArgumentException(str3);
                    }
                    int iX = w.X(strSubstring, com.amazon.a.a.o.c.a.b.f7490a, 0, false, 6, null);
                    if (dVarD != d.f14469e || iX <= 0) {
                        str2 = str3;
                        jB = a.H(jB, t(q(strSubstring), dVarD));
                    } else {
                        r.d(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iX);
                        r.e(strSubstring2, "substring(...)");
                        str2 = str3;
                        long jH2 = a.H(jB, t(q(strSubstring2), dVarD));
                        r.d(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iX);
                        r.e(strSubstring3, "substring(...)");
                        jB = a.H(jH2, r(Double.parseDouble(strSubstring3), dVarD));
                    }
                    dVar = dVarD;
                    str3 = str2;
                    c10 = '9';
                    c11 = '0';
                    z11 = true;
                } else {
                    if (z14 || (i10 = i10 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z14 = z11;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            char c12 = '0';
            if (v.w(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jB = c0337a.a();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(length2) == '(' && y.a1(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    jH = jB;
                    z15 = true;
                } else {
                    jH = jB;
                }
                d dVar2 = null;
                boolean z16 = false;
                while (length2 < length) {
                    if (z16 && z15) {
                        while (length2 < str.length()) {
                            if (!(str.charAt(length2) == ' ')) {
                                break;
                            }
                            length2++;
                        }
                    }
                    int i12 = length2;
                    while (i12 < str.length()) {
                        char cCharAt4 = str.charAt(i12);
                        if (!(new ge.c(c12, '9').r(cCharAt4) || cCharAt4 == '.')) {
                            break;
                        }
                        i12++;
                    }
                    r.d(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i12);
                    r.e(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i13 = length4;
                    while (i13 < str.length()) {
                        if (!new ge.c('a', 'z').r(str.charAt(i13))) {
                            break;
                        }
                        i13++;
                    }
                    r.d(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i13);
                    r.e(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    d dVarE = f.e(strSubstring5);
                    if (dVar2 != null && dVar2.compareTo(dVarE) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iX2 = w.X(strSubstring4, com.amazon.a.a.o.c.a.b.f7490a, 0, false, 6, null);
                    if (iX2 > 0) {
                        r.d(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iX2);
                        r.e(strSubstring6, "substring(...)");
                        long jH3 = a.H(jH, t(Long.parseLong(strSubstring6), dVarE));
                        r.d(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iX2);
                        r.e(strSubstring7, "substring(...)");
                        jH = a.H(jH3, r(Double.parseDouble(strSubstring7), dVarE));
                        if (length2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jH = a.H(jH, t(Long.parseLong(strSubstring4), dVarE));
                    }
                    dVar2 = dVarE;
                    z16 = true;
                    c12 = '0';
                }
                jB = jH;
            }
        }
        return z13 ? a.M(jB) : jB;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final long q(java.lang.String r9) {
        /*
            int r0 = r9.length()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 <= 0) goto L18
            char r5 = r9.charAt(r4)
            java.lang.String r6 = "+-"
            boolean r5 = je.m.K(r6, r5, r4, r2, r1)
            if (r5 == 0) goto L18
            r5 = r3
            goto L19
        L18:
            r5 = r4
        L19:
            int r0 = r0 - r5
            r6 = 16
            if (r0 <= r6) goto L6e
            ge.i r0 = new ge.i
            int r6 = je.m.S(r9)
            r0.<init>(r5, r6)
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L36
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L36
        L34:
            r0 = r3
            goto L5b
        L36:
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L34
            r5 = r0
            nd.l0 r5 = (nd.l0) r5
            int r5 = r5.nextInt()
            ge.c r6 = new ge.c
            r7 = 48
            r8 = 57
            r6.<init>(r7, r8)
            char r5 = r9.charAt(r5)
            boolean r5 = r6.r(r5)
            if (r5 != 0) goto L3a
            r0 = r4
        L5b:
            if (r0 == 0) goto L6e
            char r9 = r9.charAt(r4)
            r0 = 45
            if (r9 != r0) goto L68
            r0 = -9223372036854775808
            goto L6d
        L68:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6d:
            return r0
        L6e:
            java.lang.String r0 = "+"
            boolean r0 = je.m.G(r9, r0, r4, r2, r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = je.m.X0(r9, r3)
        L7a:
            long r0 = java.lang.Long.parseLong(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.c.q(java.lang.String):long");
    }

    public static final long r(double d10, d dVar) {
        r.f(dVar, "unit");
        double dA = e.a(d10, dVar, d.f14466b);
        if (!(!Double.isNaN(dA))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jE = ce.c.e(dA);
        return new l(-4611686018426999999L, 4611686018426999999L).r(jE) ? l(jE) : k(ce.c.e(e.a(d10, dVar, d.f14468d)));
    }

    public static final long s(int i10, d dVar) {
        r.f(dVar, "unit");
        return dVar.compareTo(d.f14469e) <= 0 ? l(e.c(i10, dVar, d.f14466b)) : t(i10, dVar);
    }

    public static final long t(long j10, d dVar) {
        r.f(dVar, "unit");
        d dVar2 = d.f14466b;
        long jC = e.c(4611686018426999999L, dVar2, dVar);
        return new l(-jC, jC).r(j10) ? l(e.c(j10, dVar, dVar2)) : j(o.m(e.b(j10, dVar, d.f14468d), -4611686018427387903L, 4611686018427387903L));
    }
}
