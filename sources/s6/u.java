package s6;

import s6.s2;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends u6.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f20323j = f1.a("53210D7DAE");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w2 f20324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u6.k f20325i;

    public u(h3 h3Var, w2 w2Var, u6.k kVar) {
        super(h3Var);
        this.f20324h = w2Var;
        this.f20325i = kVar;
    }

    @Override // s6.j1
    public boolean c() {
        return m(this.f20325i.a().e());
    }

    public void v(n0 n0Var) {
        k(this.f20325i.b(), 2);
        u6.k kVar = this.f20325i;
        kVar.a(kVar.a().e());
        w(n0Var.d());
        i(f1.a("53210D7DAE"), n0Var);
        if (n0Var.d()) {
            d(f1.b(f1.c("53210D7DAE")), this.f20325i.a().e(), false);
        }
        if (n0Var.c()) {
            u6.k kVar2 = this.f20325i;
            kVar2.c(kVar2.a().e(), f1.b(f1.c("53210D7DAE")));
        }
    }

    public final void w(boolean z10) {
        this.f20324h.c(s2.a.f20300d, z10);
    }

    public void x(String str) {
        super.t(str, f1.a("43361A6D"));
    }
}
