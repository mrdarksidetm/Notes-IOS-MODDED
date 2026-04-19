package ke;

import ae.j;
import ae.r;
import com.revenuecat.purchases.common.UtilsKt;
import ge.l;
import ge.o;
import je.w;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0337a f14459b = new C0337a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f14460c = n(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f14461d = c.j(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f14462e = c.j(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14463a;

    /* JADX INFO: renamed from: ke.a$a, reason: collision with other inner class name */
    public static final class C0337a {
        private C0337a() {
        }

        public /* synthetic */ C0337a(j jVar) {
            this();
        }

        public final long a() {
            return a.f14461d;
        }

        public final long b() {
            return a.f14460c;
        }

        public final long c(String str) {
            r.f(str, "value");
            try {
                return c.p(str, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e10);
            }
        }
    }

    private /* synthetic */ a(long j10) {
        this.f14463a = j10;
    }

    private static final long A(long j10) {
        return j10 >> 1;
    }

    public static int B(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean C(long j10) {
        return !F(j10);
    }

    private static final boolean D(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean E(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean F(long j10) {
        return j10 == f14461d || j10 == f14462e;
    }

    public static final boolean G(long j10) {
        return j10 < 0;
    }

    public static final long H(long j10, long j11) {
        if (F(j10)) {
            if (C(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (F(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return D(j10) ? c(j10, A(j10), A(j11)) : c(j10, A(j11), A(j10));
        }
        long jA = A(j10) + A(j11);
        return E(j10) ? c.m(jA) : c.k(jA);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if ((ce.c.b(r1) * ce.c.a(r18)) > 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        if ((ce.c.b(r1) * ce.c.a(r18)) > 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        return ke.a.f14462e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return ke.a.f14461d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long I(long r16, int r18) {
        /*
            r0 = r18
            boolean r1 = F(r16)
            if (r1 == 0) goto L1c
            if (r0 == 0) goto L14
            if (r0 <= 0) goto Lf
            r0 = r16
            goto L13
        Lf:
            long r0 = M(r16)
        L13:
            return r0
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Multiplying infinite duration by zero yields an undefined result."
            r0.<init>(r1)
            throw r0
        L1c:
            if (r0 != 0) goto L21
            long r0 = ke.a.f14460c
            return r0
        L21:
            long r1 = A(r16)
            long r3 = (long) r0
            long r5 = r1 * r3
            boolean r7 = E(r16)
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r10 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r7 == 0) goto L8f
            ge.l r7 = new ge.l
            r12 = -2147483647(0xffffffff80000001, double:NaN)
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r7.<init>(r12, r14)
            boolean r7 = r7.r(r1)
            if (r7 == 0) goto L4e
            long r0 = ke.c.d(r5)
            goto Lb3
        L4e:
            long r12 = r5 / r3
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r7 != 0) goto L59
            long r0 = ke.c.e(r5)
            goto Lb3
        L59:
            long r5 = ke.c.g(r1)
            long r12 = ke.c.f(r5)
            long r12 = r1 - r12
            long r14 = r5 * r3
            long r12 = r12 * r3
            long r12 = ke.c.g(r12)
            long r12 = r12 + r14
            long r3 = r14 / r3
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L83
            long r3 = r12 ^ r14
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L83
            ge.l r0 = new ge.l
            r0.<init>(r10, r8)
            long r0 = ge.m.n(r12, r0)
            goto L9e
        L83:
            int r1 = ce.a.b(r1)
            int r0 = ce.a.a(r18)
            int r1 = r1 * r0
            if (r1 <= 0) goto Lb1
            goto Lae
        L8f:
            long r3 = r5 / r3
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto La3
            ge.l r0 = new ge.l
            r0.<init>(r10, r8)
            long r0 = ge.m.n(r5, r0)
        L9e:
            long r0 = ke.c.b(r0)
            goto Lb3
        La3:
            int r1 = ce.a.b(r1)
            int r0 = ce.a.a(r18)
            int r1 = r1 * r0
            if (r1 <= 0) goto Lb1
        Lae:
            long r0 = ke.a.f14461d
            goto Lb3
        Lb1:
            long r0 = ke.a.f14462e
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.a.I(long, int):long");
    }

    public static final String J(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (G(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jP = p(j10);
        long jS = s(jP);
        int iW = w(jP);
        int iY = y(jP);
        int iX = x(jP);
        if (F(j10)) {
            jS = 9999999999999L;
        }
        boolean z10 = true;
        boolean z11 = jS != 0;
        boolean z12 = (iY == 0 && iX == 0) ? false : true;
        if (iW == 0 && (!z12 || !z11)) {
            z10 = false;
        }
        if (z11) {
            sb2.append(jS);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iW);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            i(j10, sb2, iY, iX, 9, "S", true);
        }
        String string = sb2.toString();
        r.e(string, "toString(...)");
        return string;
    }

    public static final long K(long j10, d dVar) {
        r.f(dVar, "unit");
        if (j10 == f14461d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f14462e) {
            return Long.MIN_VALUE;
        }
        return e.b(A(j10), z(j10), dVar);
    }

    public static String L(long j10) {
        int i10;
        long j11;
        StringBuilder sb2;
        int i11;
        int i12;
        String str;
        boolean z10;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f14461d) {
            return "Infinity";
        }
        if (j10 == f14462e) {
            return "-Infinity";
        }
        boolean zG = G(j10);
        StringBuilder sb3 = new StringBuilder();
        if (zG) {
            sb3.append('-');
        }
        long jP = p(j10);
        long jR = r(jP);
        int iQ = q(jP);
        int iW = w(jP);
        int iY = y(jP);
        int iX = x(jP);
        int i13 = 0;
        boolean z11 = jR != 0;
        boolean z12 = iQ != 0;
        boolean z13 = iW != 0;
        boolean z14 = (iY == 0 && iX == 0) ? false : true;
        if (z11) {
            sb3.append(jR);
            sb3.append('d');
            i13 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i14 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            sb3.append(iQ);
            sb3.append('h');
            i13 = i14;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i15 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            sb3.append(iW);
            sb3.append('m');
            i13 = i15;
        }
        if (z14) {
            int i16 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            if (iY != 0 || z11 || z12 || z13) {
                i10 = 9;
                j11 = j10;
                sb2 = sb3;
                i11 = iY;
                i12 = iX;
                str = "s";
                z10 = false;
            } else {
                if (iX >= 1000000) {
                    i11 = iX / UtilsKt.MICROS_MULTIPLIER;
                    i12 = iX % UtilsKt.MICROS_MULTIPLIER;
                    i10 = 6;
                    z10 = false;
                    str = "ms";
                } else if (iX >= 1000) {
                    i11 = iX / 1000;
                    i12 = iX % 1000;
                    i10 = 3;
                    z10 = false;
                    str = "us";
                } else {
                    sb3.append(iX);
                    sb3.append("ns");
                    i13 = i16;
                }
                j11 = j10;
                sb2 = sb3;
            }
            i(j11, sb2, i11, i12, i10, str, z10);
            i13 = i16;
        }
        if (zG && i13 > 1) {
            sb3.insert(1, '(').append(')');
        }
        String string = sb3.toString();
        r.e(string, "toString(...)");
        return string;
    }

    public static final long M(long j10) {
        return c.i(-A(j10), ((int) j10) & 1);
    }

    private static final long c(long j10, long j11, long j12) {
        long jO = c.o(j12);
        long j13 = j11 + jO;
        if (!new l(-4611686018426L, 4611686018426L).r(j13)) {
            return c.j(o.m(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return c.l(c.n(j13) + (j12 - c.n(jO)));
    }

    private static final void i(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append(com.amazon.a.a.o.c.a.b.f7490a);
            String strL0 = w.l0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strL0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strL0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                i15 = ((i15 + 2) / 3) * 3;
            }
            sb2.append((CharSequence) strL0, 0, i15);
            r.e(sb2, "append(...)");
        }
        sb2.append(str);
    }

    public static final /* synthetic */ a j(long j10) {
        return new a(j10);
    }

    public static int m(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return r.h(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return G(j10) ? -i10 : i10;
    }

    public static long n(long j10) {
        if (b.a()) {
            if (E(j10)) {
                if (!new l(-4611686018426999999L, 4611686018426999999L).r(A(j10))) {
                    throw new AssertionError(A(j10) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new l(-4611686018427387903L, 4611686018427387903L).r(A(j10))) {
                    throw new AssertionError(A(j10) + " ms is out of milliseconds range");
                }
                if (new l(-4611686018426L, 4611686018426L).r(A(j10))) {
                    throw new AssertionError(A(j10) + " ms is denormalized");
                }
            }
        }
        return j10;
    }

    public static boolean o(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).N();
    }

    public static final long p(long j10) {
        return G(j10) ? M(j10) : j10;
    }

    public static final int q(long j10) {
        if (F(j10)) {
            return 0;
        }
        return (int) (s(j10) % ((long) 24));
    }

    public static final long r(long j10) {
        return K(j10, d.f14472h);
    }

    public static final long s(long j10) {
        return K(j10, d.f14471g);
    }

    public static final long t(long j10) {
        return (D(j10) && C(j10)) ? A(j10) : K(j10, d.f14468d);
    }

    public static final long u(long j10) {
        return K(j10, d.f14470f);
    }

    public static final long v(long j10) {
        return K(j10, d.f14469e);
    }

    public static final int w(long j10) {
        if (F(j10)) {
            return 0;
        }
        return (int) (u(j10) % ((long) 60));
    }

    public static final int x(long j10) {
        if (F(j10)) {
            return 0;
        }
        boolean zD = D(j10);
        long jA = A(j10);
        return (int) (zD ? c.n(jA % ((long) 1000)) : jA % ((long) 1000000000));
    }

    public static final int y(long j10) {
        if (F(j10)) {
            return 0;
        }
        return (int) (v(j10) % ((long) 60));
    }

    private static final d z(long j10) {
        return E(j10) ? d.f14466b : d.f14468d;
    }

    public final /* synthetic */ long N() {
        return this.f14463a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a aVar) {
        return l(aVar.N());
    }

    public boolean equals(Object obj) {
        return o(this.f14463a, obj);
    }

    public int hashCode() {
        return B(this.f14463a);
    }

    public int l(long j10) {
        return m(this.f14463a, j10);
    }

    public String toString() {
        return L(this.f14463a);
    }
}
