package s6;

/* JADX INFO: loaded from: classes.dex */
public abstract class i1 extends u6.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f20144i = f1.a("5826097DBA204E558D1B537D227E0937EC");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u6.k f20145h;

    public i1(h3 h3Var, u6.k kVar) {
        super(h3Var);
        this.f20145h = kVar;
    }

    @Override // s6.j1
    public boolean c() {
        return m(this.f20145h.a().j());
    }

    public void v(n0 n0Var) {
        k(this.f20145h.b(), 64);
        u6.k kVar = this.f20145h;
        kVar.a(kVar.a().j());
        i(f1.a("5826097DBA204E558D1B537D227E0937EC"), n0Var);
        if (n0Var.d()) {
            c(f1.b(f1.c("5826097DBA204E558D1B537D227E0937EC")), this.f20145h.a().j());
        }
        if (n0Var.c()) {
            u6.k kVar2 = this.f20145h;
            kVar2.c(kVar2.a().j(), f1.b(f1.c("5826097DBA204E558D1B537D227E0937EC")));
        }
    }
}
