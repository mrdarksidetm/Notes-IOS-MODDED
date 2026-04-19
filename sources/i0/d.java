package i0;

import java.util.Arrays;
import le.n0;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j0.f[] f12062c = m.f12170a;

    public d(int i10, int i11) {
        this.f12060a = i10;
        this.f12061b = i11;
    }

    public final j0.f[] a() {
        return this.f12062c;
    }

    public final int b() {
        return this.f12061b;
    }

    public final int c() {
        return this.f12060a;
    }

    public final void d(int i10) {
        this.f12061b = i10;
    }

    public final void e(int i10) {
        this.f12060a = i10;
    }

    public final void f(x xVar, n0 n0Var) {
        int length = this.f12062c.length;
        for (int iN = xVar.n(); iN < length; iN++) {
            j0.f fVar = this.f12062c[iN];
            if (fVar != null) {
                fVar.t();
            }
        }
        if (this.f12062c.length != xVar.n()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f12062c, xVar.n());
            ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f12062c = (j0.f[]) objArrCopyOf;
        }
        int iN2 = xVar.n();
        for (int i10 = 0; i10 < iN2; i10++) {
            j0.h hVarC = m.c(xVar.m(i10));
            if (hVarC == null) {
                j0.f fVar2 = this.f12062c[i10];
                if (fVar2 != null) {
                    fVar2.t();
                }
                this.f12062c[i10] = null;
            } else {
                j0.f fVar3 = this.f12062c[i10];
                if (fVar3 == null) {
                    fVar3 = new j0.f(n0Var);
                    this.f12062c[i10] = fVar3;
                }
                fVar3.n(hVarC.a2());
                fVar3.q(hVarC.b2());
            }
        }
    }
}
