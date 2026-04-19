package m1;

import java.util.Arrays;
import l1.l0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends m1.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f15265t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final i f15266u = new i() { // from class: m1.p
        @Override // m1.i
        public final double a(double d10) {
            return w.x(d10);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f15267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f15268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f15269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x f15270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f15271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f15272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f15273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final i f15274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zd.l<Double, Double> f15275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i f15276n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i f15277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final zd.l<Double, Double> f15278p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i f15279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f15280r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f15281s;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        private final float e(float[] fArr) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        private final boolean f(double d10, i iVar, i iVar2) {
            return Math.abs(iVar.a(d10) - iVar2.a(d10)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] g(float[] fArr, y yVar) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float fA = yVar.a();
            float fB = yVar.b();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - fA) / fB;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (fA / fB) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        private final boolean h(float[] fArr, float[] fArr2) {
            float f10 = fArr[0] - fArr2[0];
            float f11 = fArr[1] - fArr2[1];
            float[] fArr3 = {f10, f11, fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            return i(f10, f11, fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) >= 0.0f && i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        private final float i(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float[] fArr, y yVar, i iVar, i iVar2, float f10, float f11, int i10) {
            if (i10 == 0) {
                return true;
            }
            g gVar = g.f15198a;
            if (!d.g(fArr, gVar.x()) || !d.f(yVar, j.f15235a.e())) {
                return false;
            }
            if (!(f10 == 0.0f)) {
                return false;
            }
            if (!(f11 == 1.0f)) {
                return false;
            }
            w wVarW = gVar.w();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!f(d10, iVar, wVarW.N()) || !f(d10, iVar2, wVarW.J())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(float[] fArr, float f10, float f11) {
            float fE = e(fArr);
            g gVar = g.f15198a;
            return (fE / e(gVar.s()) > 0.9f && h(fArr, gVar.x())) || (f10 < 0.0f && f11 > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f10 = fArr[0];
                float f11 = fArr[1];
                float f12 = f10 + f11 + fArr[2];
                fArr2[0] = f10 / f12;
                fArr2[1] = f11 / f12;
                float f13 = fArr[3];
                float f14 = fArr[4];
                float f15 = f13 + f14 + fArr[5];
                fArr2[2] = f13 / f15;
                fArr2[3] = f14 / f15;
                float f16 = fArr[6];
                float f17 = fArr[7];
                float f18 = f16 + f17 + fArr[8];
                fArr2[4] = f16 / f18;
                fArr2[5] = f17 / f18;
            } else {
                nd.o.j(fArr, fArr2, 0, 0, 6, 6, null);
            }
            return fArr2;
        }
    }

    static final class b extends ae.s implements zd.l<Double, Double> {
        b() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(w.this.J().a(ge.o.j(d10, w.this.f15268f, w.this.f15269g)));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    static final class c extends ae.s implements zd.l<Double, Double> {
        c() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(ge.o.j(w.this.N().a(d10), w.this.f15268f, w.this.f15269g));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    public w(String str, float[] fArr, y yVar, final double d10, float f10, float f11, int i10) {
        this(str, fArr, yVar, null, (d10 > 1.0d ? 1 : (d10 == 1.0d ? 0 : -1)) == 0 ? f15266u : new i() { // from class: m1.u
            @Override // m1.i
            public final double a(double d11) {
                return w.y(d10, d11);
            }
        }, d10 == 1.0d ? f15266u : new i() { // from class: m1.v
            @Override // m1.i
            public final double a(double d11) {
                return w.z(d10, d11);
            }
        }, f10, f11, new x(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w(java.lang.String r12, float[] r13, m1.y r14, final m1.x r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            double r0 = r15.e()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r4 = 0
            if (r0 != 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = r4
        L10:
            if (r0 == 0) goto L25
            double r5 = r15.f()
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L1c
            r0 = r1
            goto L1d
        L1c:
            r0 = r4
        L1d:
            if (r0 == 0) goto L25
            m1.q r0 = new m1.q
            r0.<init>()
            goto L2a
        L25:
            m1.r r0 = new m1.r
            r0.<init>()
        L2a:
            r5 = r0
            double r6 = r15.e()
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L35
            r0 = r1
            goto L36
        L35:
            r0 = r4
        L36:
            if (r0 == 0) goto L4a
            double r6 = r15.f()
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L41
            goto L42
        L41:
            r1 = r4
        L42:
            if (r1 == 0) goto L4a
            m1.s r0 = new m1.s
            r0.<init>()
            goto L4f
        L4a:
            m1.t r0 = new m1.t
            r0.<init>()
        L4f:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.w.<init>(java.lang.String, float[], m1.y, m1.x, int):void");
    }

    public w(String str, float[] fArr, y yVar, float[] fArr2, i iVar, i iVar2, float f10, float f11, x xVar, int i10) {
        super(str, m1.b.f15189a.b(), i10, null);
        this.f15267e = yVar;
        this.f15268f = f10;
        this.f15269g = f11;
        this.f15270h = xVar;
        this.f15274l = iVar;
        this.f15275m = new c();
        this.f15276n = new i() { // from class: m1.n
            @Override // m1.i
            public final double a(double d10) {
                return w.S(this.f15257a, d10);
            }
        };
        this.f15277o = iVar2;
        this.f15278p = new b();
        this.f15279q = new i() { // from class: m1.o
            @Override // m1.i
            public final double a(double d10) {
                return w.G(this.f15258a, d10);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        a aVar = f15265t;
        float[] fArrL = aVar.l(fArr);
        this.f15271i = fArrL;
        if (fArr2 == null) {
            this.f15272j = aVar.g(fArrL, yVar);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f15272j = fArr2;
        }
        this.f15273k = d.j(this.f15272j);
        this.f15280r = aVar.k(fArrL, f10, f11);
        this.f15281s = aVar.j(fArrL, yVar, iVar, iVar2, f10, f11, i10);
    }

    public w(w wVar, float[] fArr, y yVar) {
        this(wVar.h(), wVar.f15271i, yVar, fArr, wVar.f15274l, wVar.f15277o, wVar.f15268f, wVar.f15269g, wVar.f15270h, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double A(x xVar, double d10) {
        return d.q(d10, xVar.a(), xVar.b(), xVar.c(), xVar.d(), xVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double B(x xVar, double d10) {
        return d.r(d10, xVar.a(), xVar.b(), xVar.c(), xVar.d(), xVar.e(), xVar.f(), xVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double C(x xVar, double d10) {
        return d.s(d10, xVar.a(), xVar.b(), xVar.c(), xVar.d(), xVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double D(x xVar, double d10) {
        return d.t(d10, xVar.a(), xVar.b(), xVar.c(), xVar.d(), xVar.e(), xVar.f(), xVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double G(w wVar, double d10) {
        return wVar.f15277o.a(ge.o.j(d10, wVar.f15268f, wVar.f15269g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double S(w wVar, double d10) {
        return ge.o.j(wVar.f15274l.a(d10), wVar.f15268f, wVar.f15269g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double x(double d10) {
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double z(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    public final zd.l<Double, Double> H() {
        return this.f15278p;
    }

    public final i I() {
        return this.f15279q;
    }

    public final i J() {
        return this.f15277o;
    }

    public final float[] K() {
        return this.f15273k;
    }

    public final zd.l<Double, Double> L() {
        return this.f15275m;
    }

    public final i M() {
        return this.f15276n;
    }

    public final i N() {
        return this.f15274l;
    }

    public final float[] O() {
        return this.f15271i;
    }

    public final x P() {
        return this.f15270h;
    }

    public final float[] Q() {
        return this.f15272j;
    }

    public final y R() {
        return this.f15267e;
    }

    @Override // m1.c
    public float[] b(float[] fArr) {
        d.m(this.f15273k, fArr);
        fArr[0] = (float) this.f15276n.a(fArr[0]);
        fArr[1] = (float) this.f15276n.a(fArr[1]);
        fArr[2] = (float) this.f15276n.a(fArr[2]);
        return fArr;
    }

    @Override // m1.c
    public float e(int i10) {
        return this.f15269g;
    }

    @Override // m1.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        w wVar = (w) obj;
        if (Float.compare(wVar.f15268f, this.f15268f) != 0 || Float.compare(wVar.f15269g, this.f15269g) != 0 || !ae.r.b(this.f15267e, wVar.f15267e) || !Arrays.equals(this.f15271i, wVar.f15271i)) {
            return false;
        }
        x xVar = this.f15270h;
        if (xVar != null) {
            return ae.r.b(xVar, wVar.f15270h);
        }
        if (wVar.f15270h == null) {
            return true;
        }
        if (ae.r.b(this.f15274l, wVar.f15274l)) {
            return ae.r.b(this.f15277o, wVar.f15277o);
        }
        return false;
    }

    @Override // m1.c
    public float f(int i10) {
        return this.f15268f;
    }

    @Override // m1.c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.f15267e.hashCode()) * 31) + Arrays.hashCode(this.f15271i)) * 31;
        float f10 = this.f15268f;
        int iFloatToIntBits = (iHashCode + (!((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f15269g;
        int iFloatToIntBits2 = (iFloatToIntBits + (!(f11 == 0.0f) ? Float.floatToIntBits(f11) : 0)) * 31;
        x xVar = this.f15270h;
        int iHashCode2 = iFloatToIntBits2 + (xVar != null ? xVar.hashCode() : 0);
        return this.f15270h == null ? (((iHashCode2 * 31) + this.f15274l.hashCode()) * 31) + this.f15277o.hashCode() : iHashCode2;
    }

    @Override // m1.c
    public boolean i() {
        return this.f15281s;
    }

    @Override // m1.c
    public long j(float f10, float f11, float f12) {
        float fA = (float) this.f15279q.a(f10);
        float fA2 = (float) this.f15279q.a(f11);
        float fA3 = (float) this.f15279q.a(f12);
        return (((long) Float.floatToRawIntBits(d.n(this.f15272j, fA, fA2, fA3))) << 32) | (((long) Float.floatToRawIntBits(d.o(this.f15272j, fA, fA2, fA3))) & 4294967295L);
    }

    @Override // m1.c
    public float[] l(float[] fArr) {
        fArr[0] = (float) this.f15279q.a(fArr[0]);
        fArr[1] = (float) this.f15279q.a(fArr[1]);
        fArr[2] = (float) this.f15279q.a(fArr[2]);
        return d.m(this.f15272j, fArr);
    }

    @Override // m1.c
    public float m(float f10, float f11, float f12) {
        return d.p(this.f15272j, (float) this.f15279q.a(f10), (float) this.f15279q.a(f11), (float) this.f15279q.a(f12));
    }

    @Override // m1.c
    public long n(float f10, float f11, float f12, float f13, m1.c cVar) {
        return l0.a((float) this.f15276n.a(d.n(this.f15273k, f10, f11, f12)), (float) this.f15276n.a(d.o(this.f15273k, f10, f11, f12)), (float) this.f15276n.a(d.p(this.f15273k, f10, f11, f12)), f13, cVar);
    }
}
