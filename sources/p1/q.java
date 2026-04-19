package p1;

import l1.k0;
import md.i0;
import t0.i1;
import t0.k1;
import t0.k3;
import t0.w2;

/* JADX INFO: loaded from: classes.dex */
public final class q extends o1.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f18052n = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k1 f18053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k1 f18054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m f18055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i1 f18056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f18057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private k0 f18058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18059m;

    static final class a extends ae.s implements zd.a<i0> {
        a() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (q.this.f18059m == q.this.r()) {
                q qVar = q.this;
                qVar.v(qVar.r() + 1);
            }
        }
    }

    public q() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public q(c cVar) {
        this.f18053g = k3.e(k1.l.c(k1.l.f14359b.b()), null, 2, null);
        this.f18054h = k3.e(Boolean.FALSE, null, 2, null);
        m mVar = new m(cVar);
        mVar.o(new a());
        this.f18055i = mVar;
        this.f18056j = w2.a(0);
        this.f18057k = 1.0f;
        this.f18059m = -1;
    }

    public /* synthetic */ q(c cVar, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? new c() : cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r() {
        return this.f18056j.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int i10) {
        this.f18056j.k(i10);
    }

    @Override // o1.c
    protected boolean a(float f10) {
        this.f18057k = f10;
        return true;
    }

    @Override // o1.c
    protected boolean e(k0 k0Var) {
        this.f18058l = k0Var;
        return true;
    }

    @Override // o1.c
    public long k() {
        return s();
    }

    @Override // o1.c
    protected void m(n1.f fVar) {
        m mVar = this.f18055i;
        k0 k0VarK = this.f18058l;
        if (k0VarK == null) {
            k0VarK = mVar.k();
        }
        if (q() && fVar.getLayoutDirection() == w2.r.Rtl) {
            long jH1 = fVar.h1();
            n1.d dVarM0 = fVar.M0();
            long jC = dVarM0.c();
            dVarM0.d().h();
            dVarM0.a().f(-1.0f, 1.0f, jH1);
            mVar.i(fVar, this.f18057k, k0VarK);
            dVarM0.d().p();
            dVarM0.b(jC);
        } else {
            mVar.i(fVar, this.f18057k, k0VarK);
        }
        this.f18059m = r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q() {
        return ((Boolean) this.f18054h.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long s() {
        return ((k1.l) this.f18053g.getValue()).m();
    }

    public final void t(boolean z10) {
        this.f18054h.setValue(Boolean.valueOf(z10));
    }

    public final void u(k0 k0Var) {
        this.f18055i.n(k0Var);
    }

    public final void w(String str) {
        this.f18055i.p(str);
    }

    public final void x(long j10) {
        this.f18053g.setValue(k1.l.c(j10));
    }

    public final void y(long j10) {
        this.f18055i.q(j10);
    }
}
