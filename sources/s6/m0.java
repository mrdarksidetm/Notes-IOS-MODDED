package s6;

import s6.s2;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends u6.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f20214j = f1.a("5F2B0063BA");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w2 f20215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u6.k f20216i;

    public m0(h3 h3Var, w2 w2Var, u6.k kVar) {
        super(h3Var);
        this.f20215h = w2Var;
        this.f20216i = kVar;
    }

    public void v(n0 n0Var) {
        k(this.f20216i.b(), 8);
        u6.k kVar = this.f20216i;
        kVar.a(kVar.a().o());
        w(n0Var.c());
        i(f1.a("5F2B0063BA"), n0Var);
        if (n0Var.d()) {
            d(f1.b(f1.c("5F2B0063BA")), this.f20216i.a().o(), false);
        }
        if (n0Var.c()) {
            u6.k kVar2 = this.f20216i;
            kVar2.c(kVar2.a().o(), f1.b(f1.c("5F2B0063BA")));
        }
    }

    public final void w(boolean z10) {
        this.f20215h.c(s2.a.f20305i, z10);
    }
}
