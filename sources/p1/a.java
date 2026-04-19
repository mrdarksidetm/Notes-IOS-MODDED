package p1;

import l1.b0;
import l1.d0;
import l1.j0;
import l1.k0;
import l1.v;
import l1.v0;
import l1.w0;
import l1.x0;
import md.i0;
import n1.a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v0 f17871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f17872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w2.d f17873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w2.r f17874d = w2.r.Ltr;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17875e = w2.p.f22421b.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17876f = w0.f14626b.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n1.a f17877g = new n1.a();

    private final void a(n1.f fVar) {
        n1.f.r0(fVar, j0.f14524b.a(), 0L, 0L, 0.0f, null, null, v.f14592a.a(), 62, null);
    }

    public final void b(int i10, long j10, w2.d dVar, w2.r rVar, zd.l<? super n1.f, i0> lVar) {
        this.f17873c = dVar;
        this.f17874d = rVar;
        v0 v0VarB = this.f17871a;
        b0 b0VarA = this.f17872b;
        if (v0VarB == null || b0VarA == null || w2.p.g(j10) > v0VarB.getWidth() || w2.p.f(j10) > v0VarB.getHeight() || !w0.i(this.f17876f, i10)) {
            v0VarB = x0.b(w2.p.g(j10), w2.p.f(j10), i10, false, null, 24, null);
            b0VarA = d0.a(v0VarB);
            this.f17871a = v0VarB;
            this.f17872b = b0VarA;
            this.f17876f = i10;
        }
        this.f17875e = j10;
        n1.a aVar = this.f17877g;
        long jC = w2.q.c(j10);
        a.C0358a c0358aR = aVar.r();
        w2.d dVarA = c0358aR.a();
        w2.r rVarB = c0358aR.b();
        b0 b0VarC = c0358aR.c();
        long jD = c0358aR.d();
        a.C0358a c0358aR2 = aVar.r();
        c0358aR2.j(dVar);
        c0358aR2.k(rVar);
        c0358aR2.i(b0VarA);
        c0358aR2.l(jC);
        b0VarA.h();
        a(aVar);
        lVar.invoke(aVar);
        b0VarA.p();
        a.C0358a c0358aR3 = aVar.r();
        c0358aR3.j(dVarA);
        c0358aR3.k(rVarB);
        c0358aR3.i(b0VarC);
        c0358aR3.l(jD);
        v0VarB.a();
    }

    public final void c(n1.f fVar, float f10, k0 k0Var) {
        v0 v0Var = this.f17871a;
        if (!(v0Var != null)) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
        }
        n1.f.Y0(fVar, v0Var, 0L, this.f17875e, 0L, 0L, f10, null, k0Var, 0, 0, 858, null);
    }

    public final v0 d() {
        return this.f17871a;
    }
}
