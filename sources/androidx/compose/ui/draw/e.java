package androidx.compose.ui.draw;

import a2.a0;
import a2.q;
import ae.s;
import androidx.compose.ui.e;
import k1.m;
import l1.k0;
import md.i0;
import y1.d0;
import y1.f;
import y1.f0;
import y1.g0;
import y1.n;
import y1.t0;
import y1.z0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class e extends e.c implements a0, q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o1.c f2655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private f1.b f2657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private f f2658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f2659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private k0 f2660s;

    static final class a extends s implements l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f2661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0 t0Var) {
            super(1);
            this.f2661a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.j(aVar, this.f2661a, 0, 0, 0.0f, 4, null);
        }
    }

    public e(o1.c cVar, boolean z10, f1.b bVar, f fVar, float f10, k0 k0Var) {
        this.f2655n = cVar;
        this.f2656o = z10;
        this.f2657p = bVar;
        this.f2658q = fVar;
        this.f2659r = f10;
        this.f2660s = k0Var;
    }

    private final long a2(long j10) {
        if (!d2()) {
            return j10;
        }
        long jA = m.a(!f2(this.f2655n.k()) ? k1.l.i(j10) : k1.l.i(this.f2655n.k()), !e2(this.f2655n.k()) ? k1.l.g(j10) : k1.l.g(this.f2655n.k()));
        if (!(k1.l.i(j10) == 0.0f)) {
            if (!(k1.l.g(j10) == 0.0f)) {
                return z0.b(jA, this.f2658q.a(jA, j10));
            }
        }
        return k1.l.f14359b.b();
    }

    private final boolean d2() {
        if (this.f2656o) {
            if (this.f2655n.k() != k1.l.f14359b.a()) {
                return true;
            }
        }
        return false;
    }

    private final boolean e2(long j10) {
        if (!k1.l.f(j10, k1.l.f14359b.a())) {
            float fG = k1.l.g(j10);
            if ((Float.isInfinite(fG) || Float.isNaN(fG)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private final boolean f2(long j10) {
        if (!k1.l.f(j10, k1.l.f14359b.a())) {
            float fI = k1.l.i(j10);
            if ((Float.isInfinite(fI) || Float.isNaN(fI)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private final long g2(long j10) {
        int iG;
        int iF;
        int i10;
        boolean z10 = w2.b.j(j10) && w2.b.i(j10);
        boolean z11 = w2.b.l(j10) && w2.b.k(j10);
        if ((d2() || !z10) && !z11) {
            long jK = this.f2655n.k();
            long jA2 = a2(m.a(w2.c.g(j10, f2(jK) ? ce.c.d(k1.l.i(jK)) : w2.b.p(j10)), w2.c.f(j10, e2(jK) ? ce.c.d(k1.l.g(jK)) : w2.b.o(j10))));
            iG = w2.c.g(j10, ce.c.d(k1.l.i(jA2)));
            iF = w2.c.f(j10, ce.c.d(k1.l.g(jA2)));
            i10 = 0;
        } else {
            iG = w2.b.n(j10);
            i10 = 0;
            iF = w2.b.m(j10);
        }
        return w2.b.e(j10, iG, i10, iF, 0, 10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    @Override // a2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A(n1.c r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draw.e.A(n1.c):void");
    }

    @Override // androidx.compose.ui.e.c
    public boolean F1() {
        return false;
    }

    public final void b(float f10) {
        this.f2659r = f10;
    }

    public final o1.c b2() {
        return this.f2655n;
    }

    public final boolean c2() {
        return this.f2656o;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        t0 t0VarI = d0Var.I(g2(j10));
        return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new a(t0VarI), 4, null);
    }

    public final void h2(f1.b bVar) {
        this.f2657p = bVar;
    }

    public final void i2(k0 k0Var) {
        this.f2660s = k0Var;
    }

    @Override // a2.a0
    public int j(n nVar, y1.m mVar, int i10) {
        if (!d2()) {
            return mVar.W(i10);
        }
        long jG2 = g2(w2.c.b(0, i10, 0, 0, 13, null));
        return Math.max(w2.b.o(jG2), mVar.W(i10));
    }

    public final void j2(f fVar) {
        this.f2658q = fVar;
    }

    @Override // a2.a0
    public int k(n nVar, y1.m mVar, int i10) {
        if (!d2()) {
            return mVar.B(i10);
        }
        long jG2 = g2(w2.c.b(0, 0, 0, i10, 7, null));
        return Math.max(w2.b.p(jG2), mVar.B(i10));
    }

    public final void k2(o1.c cVar) {
        this.f2655n = cVar;
    }

    public final void l2(boolean z10) {
        this.f2656o = z10;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f2655n + ", sizeToIntrinsics=" + this.f2656o + ", alignment=" + this.f2657p + ", alpha=" + this.f2659r + ", colorFilter=" + this.f2660s + ')';
    }

    @Override // a2.a0
    public int v(n nVar, y1.m mVar, int i10) {
        if (!d2()) {
            return mVar.E(i10);
        }
        long jG2 = g2(w2.c.b(0, 0, 0, i10, 7, null));
        return Math.max(w2.b.p(jG2), mVar.E(i10));
    }

    @Override // a2.a0
    public int x(n nVar, y1.m mVar, int i10) {
        if (!d2()) {
            return mVar.k(i10);
        }
        long jG2 = g2(w2.c.b(0, i10, 0, 0, 13, null));
        return Math.max(w2.b.o(jG2), mVar.k(i10));
    }
}
