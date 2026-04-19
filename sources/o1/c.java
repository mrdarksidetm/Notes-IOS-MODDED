package o1;

import ae.s;
import k1.h;
import k1.i;
import k1.m;
import l1.b0;
import l1.d1;
import l1.j;
import l1.k0;
import md.i0;
import n1.f;
import w2.r;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d1 f16265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k0 f16267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f16268d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f16269e = r.Ltr;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l<f, i0> f16270f = new a();

    static final class a extends s implements l<f, i0> {
        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(f fVar) {
            invoke2(fVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(f fVar) {
            c.this.m(fVar);
        }
    }

    private final void g(float f10) {
        if (this.f16268d == f10) {
            return;
        }
        if (!a(f10)) {
            if (f10 == 1.0f) {
                d1 d1Var = this.f16265a;
                if (d1Var != null) {
                    d1Var.b(f10);
                }
                this.f16266b = false;
            } else {
                l().b(f10);
                this.f16266b = true;
            }
        }
        this.f16268d = f10;
    }

    private final void h(k0 k0Var) {
        boolean z10;
        if (ae.r.b(this.f16267c, k0Var)) {
            return;
        }
        if (!e(k0Var)) {
            if (k0Var == null) {
                d1 d1Var = this.f16265a;
                if (d1Var != null) {
                    d1Var.h(null);
                }
                z10 = false;
            } else {
                l().h(k0Var);
                z10 = true;
            }
            this.f16266b = z10;
        }
        this.f16267c = k0Var;
    }

    private final void i(r rVar) {
        if (this.f16269e != rVar) {
            f(rVar);
            this.f16269e = rVar;
        }
    }

    private final d1 l() {
        d1 d1Var = this.f16265a;
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1VarA = j.a();
        this.f16265a = d1VarA;
        return d1VarA;
    }

    protected boolean a(float f10) {
        return false;
    }

    protected boolean e(k0 k0Var) {
        return false;
    }

    protected boolean f(r rVar) {
        return false;
    }

    public final void j(f fVar, long j10, float f10, k0 k0Var) {
        g(f10);
        h(k0Var);
        i(fVar.getLayoutDirection());
        float fI = k1.l.i(fVar.c()) - k1.l.i(j10);
        float fG = k1.l.g(fVar.c()) - k1.l.g(j10);
        fVar.M0().a().g(0.0f, 0.0f, fI, fG);
        if (f10 > 0.0f && k1.l.i(j10) > 0.0f && k1.l.g(j10) > 0.0f) {
            if (this.f16266b) {
                h hVarA = i.a(k1.f.f14338b.c(), m.a(k1.l.i(j10), k1.l.g(j10)));
                b0 b0VarD = fVar.M0().d();
                try {
                    b0VarD.n(hVarA, l());
                    m(fVar);
                } finally {
                    b0VarD.p();
                }
            } else {
                m(fVar);
            }
        }
        fVar.M0().a().g(-0.0f, -0.0f, -fI, -fG);
    }

    public abstract long k();

    protected abstract void m(f fVar);
}
