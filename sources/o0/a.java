package o0;

import b2.x1;
import v1.b0;
import v1.p;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x1 f16210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b0 f16212c;

    public a(x1 x1Var) {
        this.f16210a = x1Var;
    }

    public final int a() {
        return this.f16211b;
    }

    public final boolean b(b0 b0Var, b0 b0Var2) {
        return ((double) k1.f.m(k1.f.s(b0Var2.i(), b0Var.i()))) < 100.0d;
    }

    public final boolean c(b0 b0Var, b0 b0Var2) {
        return b0Var2.p() - b0Var.p() < this.f16210a.a();
    }

    public final void d(p pVar) {
        b0 b0Var = this.f16212c;
        b0 b0Var2 = pVar.c().get(0);
        if (b0Var != null && c(b0Var, b0Var2) && b(b0Var, b0Var2)) {
            this.f16211b++;
        } else {
            this.f16211b = 1;
        }
        this.f16212c = b0Var2;
    }
}
