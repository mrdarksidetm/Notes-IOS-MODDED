package s6;

import s6.s2;

/* JADX INFO: loaded from: classes.dex */
public abstract class r1 extends u6.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f20285j = f1.a("43250278AC31");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f20286k = f1.b(f1.c("56341F41A7374A46961D494D"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w2 f20287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u6.k f20288i;

    public r1(h3 h3Var, w2 w2Var, u6.k kVar) {
        super(h3Var);
        this.f20287h = w2Var;
        this.f20288i = kVar;
    }

    @Override // s6.j1
    public boolean c() {
        return m(this.f20288i.a().h());
    }

    public void v(n0 n0Var) {
        k(this.f20288i.b(), 16);
        u6.k kVar = this.f20288i;
        kVar.a(kVar.a().h());
        i(f1.a("56341F41A7374A46961D494D"), n0Var);
        if (n0Var.d()) {
            p(f1.b(f1.c("56341F41A7374A46961D494D")), this.f20288i.a().h(), false);
        }
        if (n0Var.c()) {
            u6.k kVar2 = this.f20288i;
            kVar2.c(kVar2.a().h(), f1.b(f1.c("43250278AC31")));
        }
    }

    public void w(boolean z10) {
        this.f20287h.c(s2.a.f20304h, z10);
    }

    public void x(boolean z10) {
        this.f20287h.c(s2.a.f20303g, z10);
    }
}
