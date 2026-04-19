package j0;

import j0.a0;
import t0.i1;
import t0.k1;
import t0.k3;
import t0.w2;
import y1.r0;

/* JADX INFO: loaded from: classes.dex */
final class y implements r0, r0.a, a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f13787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f13788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i1 f13789c = w2.a(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i1 f13790d = w2.a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k1 f13791e = k3.e(null, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k1 f13792f = k3.e(null, null, 2, null);

    public y(Object obj, a0 a0Var) {
        this.f13787a = obj;
        this.f13788b = a0Var;
    }

    private final r0.a b() {
        return (r0.a) this.f13791e.getValue();
    }

    private final int d() {
        return this.f13790d.e();
    }

    private final r0 e() {
        return (r0) this.f13792f.getValue();
    }

    private final void h(r0.a aVar) {
        this.f13791e.setValue(aVar);
    }

    private final void j(int i10) {
        this.f13790d.k(i10);
    }

    private final void k(r0 r0Var) {
        this.f13792f.setValue(r0Var);
    }

    @Override // y1.r0
    public r0.a a() {
        if (d() == 0) {
            this.f13788b.o(this);
            r0 r0VarC = c();
            h(r0VarC != null ? r0VarC.a() : null);
        }
        j(d() + 1);
        return this;
    }

    public final r0 c() {
        return e();
    }

    public final void f() {
        int iD = d();
        for (int i10 = 0; i10 < iD; i10++) {
            release();
        }
    }

    public void g(int i10) {
        this.f13789c.k(i10);
    }

    @Override // j0.a0.a
    public int getIndex() {
        return this.f13789c.e();
    }

    @Override // j0.a0.a
    public Object getKey() {
        return this.f13787a;
    }

    public final void i(r0 r0Var) {
        d1.k kVarC = d1.k.f9368e.c();
        try {
            d1.k kVarL = kVarC.l();
            try {
                if (r0Var != e()) {
                    k(r0Var);
                    if (d() > 0) {
                        r0.a aVarB = b();
                        if (aVarB != null) {
                            aVarB.release();
                        }
                        h(r0Var != null ? r0Var.a() : null);
                    }
                }
                md.i0 i0Var = md.i0.f15558a;
            } finally {
                kVarC.s(kVarL);
            }
        } finally {
            kVarC.d();
        }
    }

    @Override // y1.r0.a
    public void release() {
        if (!(d() > 0)) {
            throw new IllegalStateException("Release should only be called once".toString());
        }
        j(d() - 1);
        if (d() == 0) {
            this.f13788b.r(this);
            r0.a aVarB = b();
            if (aVarB != null) {
                aVarB.release();
            }
            h(null);
        }
    }
}
