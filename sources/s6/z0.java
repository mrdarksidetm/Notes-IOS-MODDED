package s6;

import s6.s2;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0 implements j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20418c = f1.a("47251C7BAA2C4B44BB075840");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20419d = f1.b(f1.c("47251C7BAA2C4B44BB1755553F6A1936"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2 f20420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u6.k f20421b;

    public z0(w2 w2Var, u6.k kVar) {
        this.f20420a = w2Var;
        this.f20421b = kVar;
    }

    public boolean b(boolean z10) {
        d(z10);
        if (z10) {
            u6.k kVar = this.f20421b;
            kVar.c(kVar.a().a(), f1.a("47251C7BAA2C4B44BB1755553F6A1936"));
        }
        return z10;
    }

    public boolean c(boolean z10) {
        u6.k kVar = this.f20421b;
        kVar.a(kVar.a().k());
        e(z10);
        if (!z10) {
            u6.k kVar2 = this.f20421b;
            kVar2.c(kVar2.a().k(), f1.a("47251C7BAA2C4B44BB075840"));
        }
        return z10;
    }

    public final void d(boolean z10) {
        this.f20420a.c(s2.a.f20308l, z10);
    }

    public final void e(boolean z10) {
        this.f20420a.c(s2.a.f20307k, z10);
    }
}
