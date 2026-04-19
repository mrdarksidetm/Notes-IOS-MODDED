package s6;

import s6.s2;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 implements j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20326c = f1.a("7F13306AA8204444802B5651287E083DED07");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2 f20327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u6.k f20328b;

    public u0(w2 w2Var, u6.k kVar) {
        this.f20327a = w2Var;
        this.f20328b = kVar;
    }

    public void b(boolean z10) {
        u6.k kVar = this.f20328b;
        kVar.a(kVar.a().m());
        c(z10);
        if (z10) {
            return;
        }
        u6.k kVar2 = this.f20328b;
        kVar2.c(kVar2.a().m(), f1.a("7F13306AA8204444802B5651287E083DED07"));
    }

    public final void c(boolean z10) {
        this.f20327a.c(s2.a.f20306j, z10);
    }

    @Override // s6.j1
    public boolean c() {
        return false;
    }
}
