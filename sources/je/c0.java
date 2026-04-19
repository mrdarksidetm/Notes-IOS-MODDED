package je;

import md.f0;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {
    public static final byte a(String str) {
        ae.r.f(str, "<this>");
        md.y yVarB = b(str);
        if (yVarB != null) {
            return yVarB.l();
        }
        u.k(str);
        throw new md.i();
    }

    public static final md.y b(String str) {
        ae.r.f(str, "<this>");
        return c(str, 10);
    }

    public static final md.y c(String str, int i10) {
        ae.r.f(str, "<this>");
        md.a0 a0VarF = f(str, i10);
        if (a0VarF == null) {
            return null;
        }
        int iL = a0VarF.l();
        if (Integer.compare(iL ^ Integer.MIN_VALUE, md.a0.b(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return md.y.a(md.y.b((byte) iL));
    }

    public static final int d(String str) {
        ae.r.f(str, "<this>");
        md.a0 a0VarE = e(str);
        if (a0VarE != null) {
            return a0VarE.l();
        }
        u.k(str);
        throw new md.i();
    }

    public static final md.a0 e(String str) {
        ae.r.f(str, "<this>");
        return f(str, 10);
    }

    public static final md.a0 f(String str, int i10) {
        ae.r.f(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int i12 = 1;
        if (ae.r.g(cCharAt, 48) >= 0) {
            i12 = 0;
        } else if (length == 1 || cCharAt != '+') {
            return null;
        }
        int iB = md.a0.b(i10);
        int iA = 119304647;
        while (i12 < length) {
            int iB2 = b.b(str.charAt(i12), i10);
            if (iB2 < 0) {
                return null;
            }
            if (Integer.compare(i11 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                if (iA == 119304647) {
                    iA = b0.a(-1, iB);
                    if (Integer.compare(i11 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iB3 = md.a0.b(i11 * iB);
            int iB4 = md.a0.b(md.a0.b(iB2) + iB3);
            if (Integer.compare(iB4 ^ Integer.MIN_VALUE, iB3 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i12++;
            i11 = iB4;
        }
        return md.a0.a(i11);
    }

    public static final long g(String str) {
        ae.r.f(str, "<this>");
        md.c0 c0VarH = h(str);
        if (c0VarH != null) {
            return c0VarH.m();
        }
        u.k(str);
        throw new md.i();
    }

    public static final md.c0 h(String str) {
        ae.r.f(str, "<this>");
        return i(str, 10);
    }

    public static final md.c0 i(String str, int i10) {
        ae.r.f(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        long j10 = -1;
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (ae.r.g(cCharAt, 48) < 0) {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i11 = 1;
        }
        long jB = md.c0.b(i10);
        long j11 = 0;
        long jA = 512409557603043100L;
        while (i11 < length) {
            int iB = b.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if (Long.compare(j11 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                if (jA == 512409557603043100L) {
                    jA = a0.a(j10, jB);
                    if (Long.compare(j11 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jB2 = md.c0.b(j11 * jB);
            long jB3 = md.c0.b(md.c0.b(((long) md.a0.b(iB)) & 4294967295L) + jB2);
            if (Long.compare(jB3 ^ Long.MIN_VALUE, jB2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            j11 = jB3;
            j10 = -1;
        }
        return md.c0.a(j11);
    }

    public static final short j(String str) {
        ae.r.f(str, "<this>");
        f0 f0VarK = k(str);
        if (f0VarK != null) {
            return f0VarK.l();
        }
        u.k(str);
        throw new md.i();
    }

    public static final f0 k(String str) {
        ae.r.f(str, "<this>");
        return l(str, 10);
    }

    public static final f0 l(String str, int i10) {
        ae.r.f(str, "<this>");
        md.a0 a0VarF = f(str, i10);
        if (a0VarF == null) {
            return null;
        }
        int iL = a0VarF.l();
        if (Integer.compare(iL ^ Integer.MIN_VALUE, md.a0.b(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return f0.a(f0.b((short) iL));
    }
}
