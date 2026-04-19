package s6;

import s6.s2;

/* JADX INFO: loaded from: classes.dex */
public abstract class m1 extends u6.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f20217j = f1.a("452B007C");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f20218k = f1.b(f1.c("4736067EA02F4A4681107C5732680F21"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w2 f20219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u6.k f20220i;

    public m1(h3 h3Var, w2 w2Var, u6.k kVar) {
        super(h3Var);
        this.f20219h = w2Var;
        this.f20220i = kVar;
    }

    @Override // s6.j1
    public boolean c() {
        return m(this.f20220i.a().c());
    }

    public void v(n0 n0Var) {
        k(this.f20220i.b(), 1);
        u6.k kVar = this.f20220i;
        kVar.a(kVar.a().c());
        w(n0Var.c());
        i(f1.a("4736067EA02F4A4681107C5732680F21"), n0Var);
        if (n0Var.d()) {
            c(f1.b(f1.c("4736067EA02F4A4681107C5732680F21")), this.f20220i.a().c());
        }
        if (n0Var.c()) {
            u6.k kVar2 = this.f20220i;
            kVar2.c(kVar2.a().c(), f1.b(f1.c("452B007C")));
        }
    }

    public final void w(boolean z10) {
        this.f20219h.c(s2.a.f20299c, z10);
    }
}
