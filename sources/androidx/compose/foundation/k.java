package androidx.compose.foundation;

import a2.n1;
import a2.o1;
import a2.s;
import a2.z;
import d0.u;
import g2.x;
import le.n0;
import md.i0;
import y1.r;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
final class k extends a2.l implements j1.c, z, n1, s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j1.n f2414p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final j f2416r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final k0.d f2419u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final k0.g f2420v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final m f2415q = (m) a2(new m());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final l f2417s = (l) a2(new l());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final u f2418t = (u) a2(new u());

    @sd.d(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", l = {238}, m = "invokeSuspend")
    static final class a extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2421a;

        a(qd.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return k.this.new a(dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f2421a;
            if (i10 == 0) {
                md.u.b(obj);
                k0.d dVar = k.this.f2419u;
                this.f2421a = 1;
                if (k0.d.b(dVar, null, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return i0.f15558a;
        }
    }

    public k(g0.m mVar) {
        this.f2416r = (j) a2(new j(mVar));
        k0.d dVarA = k0.f.a();
        this.f2419u = dVarA;
        this.f2420v = (k0.g) a2(new k0.g(dVarA));
    }

    @Override // a2.z
    public void B(r rVar) {
        this.f2420v.B(rVar);
    }

    @Override // a2.n1
    public void U(x xVar) {
        this.f2415q.U(xVar);
    }

    public final void g2(g0.m mVar) {
        this.f2416r.d2(mVar);
    }

    @Override // a2.s
    public void l(r rVar) {
        this.f2418t.l(rVar);
    }

    @Override // j1.c
    public void s(j1.n nVar) {
        if (ae.r.b(this.f2414p, nVar)) {
            return;
        }
        boolean zA = nVar.a();
        if (zA) {
            le.k.d(A1(), null, null, new a(null), 3, null);
        }
        if (H1()) {
            o1.b(this);
        }
        this.f2416r.c2(zA);
        this.f2418t.c2(zA);
        this.f2417s.b2(zA);
        this.f2415q.a2(zA);
        this.f2414p = nVar;
    }
}
