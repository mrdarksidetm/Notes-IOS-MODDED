package i0;

import t0.i1;
import t0.w2;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i1 f12055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i1 f12056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f12058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j0.x f12059e;

    public c0(int i10, int i11) {
        this.f12055a = w2.a(i10);
        this.f12056b = w2.a(i11);
        this.f12059e = new j0.x(i10, 90, 200);
    }

    private final void e(int i10) {
        this.f12055a.k(i10);
    }

    private final void f(int i10) {
        this.f12056b.k(i10);
    }

    private final void g(int i10, int i11) {
        if (((float) i10) >= 0.0f) {
            e(i10);
            this.f12059e.i(i10);
            f(i11);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
        }
    }

    public final int a() {
        return this.f12055a.e();
    }

    public final j0.x b() {
        return this.f12059e;
    }

    public final int c() {
        return this.f12056b.e();
    }

    public final void d(int i10, int i11) {
        g(i10, i11);
        this.f12058d = null;
    }

    public final void h(w wVar) {
        x[] xVarArrB;
        x xVar;
        x[] xVarArrB2;
        x xVar2;
        z zVarH = wVar.h();
        this.f12058d = (zVarH == null || (xVarArrB2 = zVarH.b()) == null || (xVar2 = (x) nd.p.M(xVarArrB2)) == null) ? null : xVar2.g();
        if (this.f12057c || wVar.b() > 0) {
            this.f12057c = true;
            int i10 = wVar.i();
            int index = 0;
            if (!(((float) i10) >= 0.0f)) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i10 + ')').toString());
            }
            z zVarH2 = wVar.h();
            if (zVarH2 != null && (xVarArrB = zVarH2.b()) != null && (xVar = (x) nd.p.M(xVarArrB)) != null) {
                index = xVar.getIndex();
            }
            g(index, i10);
        }
    }

    public final void i(int i10) {
        if (((float) i10) >= 0.0f) {
            f(i10);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + i10 + ')').toString());
    }

    public final int j(n nVar, int i10) {
        int iA = j0.r.a(nVar, this.f12058d, i10);
        if (i10 != iA) {
            e(iA);
            this.f12059e.i(i10);
        }
        return iA;
    }
}
