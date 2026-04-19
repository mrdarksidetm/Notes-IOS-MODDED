package s6;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends u6.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f20183i = f1.a("56200D4DA7224D4D8110");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u6.k f20184h;

    public l(h3 h3Var, u6.k kVar) {
        super(h3Var);
        this.f20184h = kVar;
    }

    public void v(n0 n0Var) {
        u6.k kVar = this.f20184h;
        kVar.a(kVar.a().b());
        i(f1.a("56200D4DA7224D4D8110"), n0Var);
        if (n0Var.d()) {
            c(f1.b(f1.c("56200D4DA7224D4D8110")), this.f20184h.a().b());
        }
        if (n0Var.c()) {
            u6.k kVar2 = this.f20184h;
            kVar2.c(kVar2.a().b(), f1.b(f1.c("56200D4DA7224D4D8110")));
        }
    }
}
