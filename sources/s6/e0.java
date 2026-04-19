package s6;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 extends u6.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f20053i = f1.a("53211961AA266D488A10545A36");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u6.k f20054h;

    public e0(h3 h3Var, u6.k kVar) {
        super(h3Var);
        this.f20054h = kVar;
    }

    public void v(n0 n0Var) {
        k(this.f20054h.b(), 128);
        u6.k kVar = this.f20054h;
        kVar.a(kVar.a().l());
        i(f1.a("53211961AA266D488A10545A36"), n0Var);
        if (n0Var.d()) {
            o(f1.b(f1.c("53211961AA266D488A10545A36")), this.f20054h.a().l());
        }
        if (n0Var.c()) {
            u6.k kVar2 = this.f20054h;
            kVar2.c(kVar2.a().l(), f1.b(f1.c("53211961AA266D488A10545A36")));
        }
    }
}
