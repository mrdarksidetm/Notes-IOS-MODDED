package b2;

import android.graphics.Outline;
import android.os.Build;
import k1.l;
import l1.b1;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w2.d f5220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5221b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Outline f5222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l1.t1 f5224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l1.f1 f5225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l1.f1 f5226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l1.f1 f5229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private k1.j f5230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f5231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private w2.r f5235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private l1.f1 f5236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private l1.f1 f5237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private l1.b1 f5238s;

    public d1(w2.d dVar) {
        this.f5220a = dVar;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f5222c = outline;
        l.a aVar = k1.l.f14359b;
        this.f5223d = aVar.b();
        this.f5224e = l1.m1.a();
        this.f5232m = k1.f.f14338b.c();
        this.f5233n = aVar.b();
        this.f5235p = w2.r.Ltr;
    }

    private final boolean g(k1.j jVar, long j10, long j11, float f10) {
        if (jVar == null || !k1.k.d(jVar)) {
            return false;
        }
        if (!(jVar.e() == k1.f.o(j10))) {
            return false;
        }
        if (!(jVar.g() == k1.f.p(j10))) {
            return false;
        }
        if (!(jVar.f() == k1.f.o(j10) + k1.l.i(j11))) {
            return false;
        }
        if (jVar.a() == k1.f.p(j10) + k1.l.g(j11)) {
            return (k1.a.d(jVar.h()) > f10 ? 1 : (k1.a.d(jVar.h()) == f10 ? 0 : -1)) == 0;
        }
        return false;
    }

    private final void j() {
        if (this.f5227h) {
            this.f5232m = k1.f.f14338b.c();
            long j10 = this.f5223d;
            this.f5233n = j10;
            this.f5231l = 0.0f;
            this.f5226g = null;
            this.f5227h = false;
            this.f5228i = false;
            if (!this.f5234o || k1.l.i(j10) <= 0.0f || k1.l.g(this.f5223d) <= 0.0f) {
                this.f5222c.setEmpty();
                return;
            }
            this.f5221b = true;
            l1.b1 b1VarMo253createOutlinePq9zytI = this.f5224e.mo253createOutlinePq9zytI(this.f5223d, this.f5235p, this.f5220a);
            this.f5238s = b1VarMo253createOutlinePq9zytI;
            if (b1VarMo253createOutlinePq9zytI instanceof b1.b) {
                l(((b1.b) b1VarMo253createOutlinePq9zytI).a());
            } else if (b1VarMo253createOutlinePq9zytI instanceof b1.c) {
                m(((b1.c) b1VarMo253createOutlinePq9zytI).a());
            } else if (b1VarMo253createOutlinePq9zytI instanceof b1.a) {
                k(((b1.a) b1VarMo253createOutlinePq9zytI).a());
            }
        }
    }

    private final void k(l1.f1 f1Var) {
        if (Build.VERSION.SDK_INT > 28 || f1Var.a()) {
            Outline outline = this.f5222c;
            if (!(f1Var instanceof l1.k)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((l1.k) f1Var).s());
            this.f5228i = !this.f5222c.canClip();
        } else {
            this.f5221b = false;
            this.f5222c.setEmpty();
            this.f5228i = true;
        }
        this.f5226g = f1Var;
    }

    private final void l(k1.h hVar) {
        this.f5232m = k1.g.a(hVar.f(), hVar.i());
        this.f5233n = k1.m.a(hVar.k(), hVar.e());
        this.f5222c.setRect(ce.c.d(hVar.f()), ce.c.d(hVar.i()), ce.c.d(hVar.g()), ce.c.d(hVar.c()));
    }

    private final void m(k1.j jVar) {
        float fD = k1.a.d(jVar.h());
        this.f5232m = k1.g.a(jVar.e(), jVar.g());
        this.f5233n = k1.m.a(jVar.j(), jVar.d());
        if (k1.k.d(jVar)) {
            this.f5222c.setRoundRect(ce.c.d(jVar.e()), ce.c.d(jVar.g()), ce.c.d(jVar.f()), ce.c.d(jVar.a()), fD);
            this.f5231l = fD;
            return;
        }
        l1.f1 f1VarA = this.f5225f;
        if (f1VarA == null) {
            f1VarA = l1.p.a();
            this.f5225f = f1VarA;
        }
        f1VarA.reset();
        f1VarA.m(jVar);
        k(f1VarA);
    }

    public final void a(l1.b0 b0Var) {
        l1.f1 f1VarC = c();
        if (f1VarC != null) {
            l1.b0.m(b0Var, f1VarC, 0, 2, null);
            return;
        }
        float f10 = this.f5231l;
        if (f10 <= 0.0f) {
            l1.b0.j(b0Var, k1.f.o(this.f5232m), k1.f.p(this.f5232m), k1.f.o(this.f5232m) + k1.l.i(this.f5233n), k1.f.p(this.f5232m) + k1.l.g(this.f5233n), 0, 16, null);
            return;
        }
        l1.f1 f1VarA = this.f5229j;
        k1.j jVar = this.f5230k;
        if (f1VarA == null || !g(jVar, this.f5232m, this.f5233n, f10)) {
            k1.j jVarC = k1.k.c(k1.f.o(this.f5232m), k1.f.p(this.f5232m), k1.f.o(this.f5232m) + k1.l.i(this.f5233n), k1.f.p(this.f5232m) + k1.l.g(this.f5233n), k1.b.b(this.f5231l, 0.0f, 2, null));
            if (f1VarA == null) {
                f1VarA = l1.p.a();
            } else {
                f1VarA.reset();
            }
            f1VarA.m(jVarC);
            this.f5230k = jVarC;
            this.f5229j = f1VarA;
        }
        l1.b0.m(b0Var, f1VarA, 0, 2, null);
    }

    public final boolean b() {
        return this.f5227h;
    }

    public final l1.f1 c() {
        j();
        return this.f5226g;
    }

    public final Outline d() {
        j();
        if (this.f5234o && this.f5221b) {
            return this.f5222c;
        }
        return null;
    }

    public final boolean e() {
        return !this.f5228i;
    }

    public final boolean f(long j10) {
        l1.b1 b1Var;
        if (this.f5234o && (b1Var = this.f5238s) != null) {
            return o1.b(b1Var, k1.f.o(j10), k1.f.p(j10), this.f5236q, this.f5237r);
        }
        return true;
    }

    public final boolean h(l1.t1 t1Var, float f10, boolean z10, float f11, w2.r rVar, w2.d dVar) {
        this.f5222c.setAlpha(f10);
        boolean z11 = !ae.r.b(this.f5224e, t1Var);
        if (z11) {
            this.f5224e = t1Var;
            this.f5227h = true;
        }
        boolean z12 = z10 || f11 > 0.0f;
        if (this.f5234o != z12) {
            this.f5234o = z12;
            this.f5227h = true;
        }
        if (this.f5235p != rVar) {
            this.f5235p = rVar;
            this.f5227h = true;
        }
        if (!ae.r.b(this.f5220a, dVar)) {
            this.f5220a = dVar;
            this.f5227h = true;
        }
        return z11;
    }

    public final void i(long j10) {
        if (k1.l.f(this.f5223d, j10)) {
            return;
        }
        this.f5223d = j10;
        this.f5227h = true;
    }
}
