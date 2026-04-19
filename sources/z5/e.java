package z5;

import ae.r;
import ae.s;
import b2.u0;
import b2.w0;
import b2.x0;
import k1.m;
import l1.k0;
import md.i0;
import w2.n;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;
import y1.v;
import y1.z0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class e extends x0 implements v, i1.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o1.c f24222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f1.b f24223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y1.f f24224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f24225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k0 f24226g;

    static final class a extends s implements l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f24227a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0 t0Var) {
            super(1);
            this.f24227a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.j(aVar, this.f24227a, 0, 0, 0.0f, 4, null);
        }
    }

    public static final class b extends s implements l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o1.c f24228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1.b f24229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y1.f f24230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f24231d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k0 f24232e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o1.c cVar, f1.b bVar, y1.f fVar, float f10, k0 k0Var) {
            super(1);
            this.f24228a = cVar;
            this.f24229b = bVar;
            this.f24230c = fVar;
            this.f24231d = f10;
            this.f24232e = k0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            r.f(w0Var, "$this$null");
            w0Var.b("content");
            w0Var.a().c("painter", this.f24228a);
            w0Var.a().c("alignment", this.f24229b);
            w0Var.a().c("contentScale", this.f24230c);
            w0Var.a().c("alpha", Float.valueOf(this.f24231d));
            w0Var.a().c("colorFilter", this.f24232e);
        }
    }

    public e(o1.c cVar, f1.b bVar, y1.f fVar, float f10, k0 k0Var) {
        super(u0.c() ? new b(cVar, bVar, fVar, f10, k0Var) : u0.a());
        this.f24222c = cVar;
        this.f24223d = bVar;
        this.f24224e = fVar;
        this.f24225f = f10;
        this.f24226g = k0Var;
    }

    private final long a(long j10) {
        if (k1.l.k(j10)) {
            return k1.l.f14359b.b();
        }
        long jK = this.f24222c.k();
        if (jK == k1.l.f14359b.a()) {
            return j10;
        }
        float fI = k1.l.i(jK);
        if (!((Float.isInfinite(fI) || Float.isNaN(fI)) ? false : true)) {
            fI = k1.l.i(j10);
        }
        float fG = k1.l.g(jK);
        if (!((Float.isInfinite(fG) || Float.isNaN(fG)) ? false : true)) {
            fG = k1.l.g(j10);
        }
        long jA = m.a(fI, fG);
        return z0.b(jA, this.f24224e.a(jA, j10));
    }

    private final long c(long j10) {
        float fB;
        int iO;
        float fA;
        long j11;
        int iN;
        int i10;
        int iM;
        int i11;
        int i12;
        Object obj;
        boolean zL = w2.b.l(j10);
        boolean zK = w2.b.k(j10);
        if (zL && zK) {
            return j10;
        }
        boolean z10 = w2.b.j(j10) && w2.b.i(j10);
        long jK = this.f24222c.k();
        if (!(jK == k1.l.f14359b.a())) {
            if (z10 && (zL || zK)) {
                fB = w2.b.n(j10);
                iO = w2.b.m(j10);
            } else {
                float fI = k1.l.i(jK);
                float fG = k1.l.g(jK);
                fB = !Float.isInfinite(fI) && !Float.isNaN(fI) ? j.b(j10, fI) : w2.b.p(j10);
                if ((Float.isInfinite(fG) || Float.isNaN(fG)) ? false : true) {
                    fA = j.a(j10, fG);
                    long jA = a(m.a(fB, fA));
                    float fI2 = k1.l.i(jA);
                    float fG2 = k1.l.g(jA);
                    int iG = w2.c.g(j10, ce.c.d(fI2));
                    int iF = w2.c.f(j10, ce.c.d(fG2));
                    j11 = j10;
                    iN = iG;
                    i10 = 0;
                    iM = iF;
                    i11 = 0;
                    i12 = 10;
                    obj = null;
                } else {
                    iO = w2.b.o(j10);
                }
            }
            fA = iO;
            long jA2 = a(m.a(fB, fA));
            float fI22 = k1.l.i(jA2);
            float fG22 = k1.l.g(jA2);
            int iG2 = w2.c.g(j10, ce.c.d(fI22));
            int iF2 = w2.c.f(j10, ce.c.d(fG22));
            j11 = j10;
            iN = iG2;
            i10 = 0;
            iM = iF2;
            i11 = 0;
            i12 = 10;
            obj = null;
        } else {
            if (!z10) {
                return j10;
            }
            iN = w2.b.n(j10);
            i10 = 0;
            iM = w2.b.m(j10);
            i11 = 0;
            i12 = 10;
            obj = null;
            j11 = j10;
        }
        return w2.b.e(j11, iN, i10, iM, i11, i12, obj);
    }

    @Override // i1.j
    public void A(n1.c cVar) {
        long jA = a(cVar.c());
        long jA2 = this.f24223d.a(j.f(jA), j.f(cVar.c()), cVar.getLayoutDirection());
        float fC = n.c(jA2);
        float fD = n.d(jA2);
        cVar.M0().a().c(fC, fD);
        this.f24222c.j(cVar, jA, this.f24225f, this.f24226g);
        cVar.M0().a().c(-fC, -fD);
        cVar.u1();
    }

    @Override // y1.v
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        t0 t0VarI = d0Var.I(c(j10));
        return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new a(t0VarI), 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return r.b(this.f24222c, eVar.f24222c) && r.b(this.f24223d, eVar.f24223d) && r.b(this.f24224e, eVar.f24224e) && Float.compare(this.f24225f, eVar.f24225f) == 0 && r.b(this.f24226g, eVar.f24226g);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f24222c.hashCode() * 31) + this.f24223d.hashCode()) * 31) + this.f24224e.hashCode()) * 31) + Float.hashCode(this.f24225f)) * 31;
        k0 k0Var = this.f24226g;
        return iHashCode + (k0Var == null ? 0 : k0Var.hashCode());
    }

    @Override // y1.v
    public int j(y1.n nVar, y1.m mVar, int i10) {
        if (!(this.f24222c.k() != k1.l.f14359b.a())) {
            return mVar.W(i10);
        }
        int iW = mVar.W(w2.b.n(c(w2.c.b(0, i10, 0, 0, 13, null))));
        return Math.max(ce.c.d(k1.l.g(a(m.a(i10, iW)))), iW);
    }

    @Override // y1.v
    public int k(y1.n nVar, y1.m mVar, int i10) {
        if (!(this.f24222c.k() != k1.l.f14359b.a())) {
            return mVar.B(i10);
        }
        int iB = mVar.B(w2.b.m(c(w2.c.b(0, 0, 0, i10, 7, null))));
        return Math.max(ce.c.d(k1.l.i(a(m.a(iB, i10)))), iB);
    }

    public String toString() {
        return "ContentPainterModifier(painter=" + this.f24222c + ", alignment=" + this.f24223d + ", contentScale=" + this.f24224e + ", alpha=" + this.f24225f + ", colorFilter=" + this.f24226g + ')';
    }

    @Override // y1.v
    public int v(y1.n nVar, y1.m mVar, int i10) {
        if (!(this.f24222c.k() != k1.l.f14359b.a())) {
            return mVar.E(i10);
        }
        int iE = mVar.E(w2.b.m(c(w2.c.b(0, 0, 0, i10, 7, null))));
        return Math.max(ce.c.d(k1.l.i(a(m.a(iE, i10)))), iE);
    }

    @Override // y1.v
    public int x(y1.n nVar, y1.m mVar, int i10) {
        if (!(this.f24222c.k() != k1.l.f14359b.a())) {
            return mVar.k(i10);
        }
        int iK = mVar.k(w2.b.n(c(w2.c.b(0, i10, 0, 0, 13, null))));
        return Math.max(ce.c.d(k1.l.g(a(m.a(i10, iK)))), iK);
    }
}
