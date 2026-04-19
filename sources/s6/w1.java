package s6;

/* JADX INFO: loaded from: classes.dex */
public abstract class w1 extends u6.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f20360i = f1.a("443D1C7CAC2E7971AA");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u6.k f20361h;

    public w1(h3 h3Var, u6.k kVar) {
        super(h3Var);
        this.f20361h = kVar;
    }

    public void v(n0 n0Var) {
        u6.k kVar = this.f20361h;
        kVar.a(kVar.a().f());
        i(f1.a("443D1C7CAC2E7971AA"), n0Var);
        if (n0Var.d()) {
            c(f1.b(f1.c("443D1C7CAC2E7971AA")), this.f20361h.a().f());
        }
        if (n0Var.c()) {
            u6.k kVar2 = this.f20361h;
            kVar2.c(kVar2.a().f(), f1.b(f1.c("443D1C7CAC2E7971AA")));
        }
    }
}
