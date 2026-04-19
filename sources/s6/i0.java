package s6;

import s6.s2;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends u6.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f20140j = f1.a("52291A64A8374053");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f20141k = f1.b(f1.c("442D027DA5225B4E96"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w2 f20142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u6.k f20143i;

    public i0(h3 h3Var, w2 w2Var, u6.k kVar) {
        super(h3Var);
        this.f20142h = w2Var;
        this.f20143i = kVar;
    }

    @Override // s6.j1
    public boolean c() {
        return m(this.f20143i.a().n());
    }

    public void v(n0 n0Var) {
        k(this.f20143i.b(), 4);
        u6.k kVar = this.f20143i;
        kVar.a(kVar.a().n());
        w(n0Var.c());
        i(f1.a("442D027DA5225B4E96"), n0Var);
        if (n0Var.d()) {
            o(f1.b(f1.c("442D027DA5225B4E96")), this.f20143i.a().n());
        }
        if (n0Var.c()) {
            u6.k kVar2 = this.f20143i;
            kVar2.c(kVar2.a().n(), f1.b(f1.c("52291A64A8374053")));
        }
    }

    public final void w(boolean z10) {
        this.f20142h.c(s2.a.f20301e, z10);
    }
}
