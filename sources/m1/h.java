package m1;

import java.util.Arrays;
import l1.l0;
import m1.b;
import m1.m;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f15222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final h f15223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final h f15224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h f15225j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f15226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f15227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f15228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f15229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f15230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f15231f;

    public static final class a {

        /* JADX INFO: renamed from: m1.h$a$a, reason: collision with other inner class name */
        public static final class C0348a extends h {
            C0348a(c cVar, int i10) {
                super(cVar, cVar, i10, null);
            }

            @Override // m1.h
            public long e(float f10, float f11, float f12, float f13) {
                return l0.a(f10, f11, f12, f13, d());
            }
        }

        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(c cVar, c cVar2, int i10) {
            if (!m.e(i10, m.f15252a.a())) {
                return null;
            }
            long jG = cVar.g();
            b.a aVar = m1.b.f15189a;
            boolean zE = m1.b.e(jG, aVar.b());
            boolean zE2 = m1.b.e(cVar2.g(), aVar.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                cVar = cVar2;
            }
            ae.r.d(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            w wVar = (w) cVar;
            float[] fArrC = zE ? wVar.R().c() : j.f15235a.c();
            float[] fArrC2 = zE2 ? wVar.R().c() : j.f15235a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final h c() {
            return h.f15225j;
        }

        public final h d() {
            return h.f15223h;
        }

        public final h e() {
            return h.f15224i;
        }

        public final h f(c cVar) {
            return new C0348a(cVar, m.f15252a.c());
        }
    }

    public static final class b extends h {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final w f15232k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final w f15233l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final float[] f15234m;

        private b(w wVar, w wVar2, int i10) {
            super(wVar, wVar2, wVar, wVar2, i10, null, null);
            this.f15232k = wVar;
            this.f15233l = wVar2;
            this.f15234m = f(wVar, wVar2, i10);
        }

        public /* synthetic */ b(w wVar, w wVar2, int i10, ae.j jVar) {
            this(wVar, wVar2, i10);
        }

        private final float[] f(w wVar, w wVar2, int i10) {
            if (d.f(wVar.R(), wVar2.R())) {
                return d.k(wVar2.K(), wVar.Q());
            }
            float[] fArrQ = wVar.Q();
            float[] fArrK = wVar2.K();
            float[] fArrC = wVar.R().c();
            float[] fArrC2 = wVar2.R().c();
            y yVarR = wVar.R();
            j jVar = j.f15235a;
            if (!d.f(yVarR, jVar.b())) {
                float[] fArrB = m1.a.f15184b.a().b();
                float[] fArrC3 = jVar.c();
                float[] fArrCopyOf = Arrays.copyOf(fArrC3, fArrC3.length);
                ae.r.e(fArrCopyOf, "copyOf(this, size)");
                fArrQ = d.k(d.e(fArrB, fArrC, fArrCopyOf), wVar.Q());
            }
            if (!d.f(wVar2.R(), jVar.b())) {
                float[] fArrB2 = m1.a.f15184b.a().b();
                float[] fArrC4 = jVar.c();
                float[] fArrCopyOf2 = Arrays.copyOf(fArrC4, fArrC4.length);
                ae.r.e(fArrCopyOf2, "copyOf(this, size)");
                fArrK = d.j(d.k(d.e(fArrB2, fArrC2, fArrCopyOf2), wVar2.Q()));
            }
            if (m.e(i10, m.f15252a.a())) {
                fArrQ = d.l(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, fArrQ);
            }
            return d.k(fArrK, fArrQ);
        }

        @Override // m1.h
        public long e(float f10, float f11, float f12, float f13) {
            float fA = (float) this.f15232k.I().a(f10);
            float fA2 = (float) this.f15232k.I().a(f11);
            float fA3 = (float) this.f15232k.I().a(f12);
            return l0.a((float) this.f15233l.M().a(d.n(this.f15234m, fA, fA2, fA3)), (float) this.f15233l.M().a(d.o(this.f15234m, fA, fA2, fA3)), (float) this.f15233l.M().a(d.p(this.f15234m, fA, fA2, fA3)), f13, this.f15233l);
        }
    }

    static {
        ae.j jVar = null;
        a aVar = new a(jVar);
        f15222g = aVar;
        g gVar = g.f15198a;
        f15223h = aVar.f(gVar.w());
        w wVarW = gVar.w();
        c cVarT = gVar.t();
        m.a aVar2 = m.f15252a;
        f15224i = new h(wVarW, cVarT, aVar2.b(), jVar);
        f15225j = new h(gVar.t(), gVar.w(), aVar2.b(), jVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private h(c cVar, c cVar2, int i10) {
        long jG = cVar.g();
        b.a aVar = m1.b.f15189a;
        this(cVar, cVar2, m1.b.e(jG, aVar.b()) ? d.d(cVar, j.f15235a.b(), null, 2, null) : cVar, m1.b.e(cVar2.g(), aVar.b()) ? d.d(cVar2, j.f15235a.b(), null, 2, null) : cVar2, i10, f15222g.b(cVar, cVar2, i10), null);
    }

    public /* synthetic */ h(c cVar, c cVar2, int i10, ae.j jVar) {
        this(cVar, cVar2, i10);
    }

    private h(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr) {
        this.f15226a = cVar;
        this.f15227b = cVar2;
        this.f15228c = cVar3;
        this.f15229d = cVar4;
        this.f15230e = i10;
        this.f15231f = fArr;
    }

    public /* synthetic */ h(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr, ae.j jVar) {
        this(cVar, cVar2, cVar3, cVar4, i10, fArr);
    }

    public final c d() {
        return this.f15227b;
    }

    public long e(float f10, float f11, float f12, float f13) {
        long j10 = this.f15228c.j(f10, f11, f12);
        ae.l lVar = ae.l.f718a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float fM = this.f15228c.m(f10, f11, f12);
        float[] fArr = this.f15231f;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fM *= fArr[2];
        }
        float f14 = fIntBitsToFloat2;
        float f15 = fIntBitsToFloat;
        return this.f15229d.n(f15, f14, fM, f13, this.f15227b);
    }
}
