package s6;

import s6.s2;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 extends u6.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f20262j = f1.a("422A1B7ABC305B44803D5347256C103EFE16434072233D7D42BA7E");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f20263k = f1.b(f1.c("422A006EAF2A4C4885186E403E7F19"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w2 f20264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u6.k f20265i;

    public q0(h3 h3Var, w2 w2Var, u6.k kVar) {
        super(h3Var);
        this.f20264h = w2Var;
        this.f20265i = kVar;
    }

    @Override // s6.j1
    public boolean c() {
        return m(this.f20265i.a().g());
    }

    public void v(n0 n0Var) {
        k(this.f20265i.b(), 32);
        u6.k kVar = this.f20265i;
        kVar.a(kVar.a().g());
        i(f1.a("422A006EAF2A4C4885186E403E7F19"), n0Var);
        if (n0Var.d()) {
            o(f1.b(f1.c("422A006EAF2A4C4885186E403E7F19")), this.f20265i.a().g());
        }
        if (n0Var.c()) {
            u6.k kVar2 = this.f20265i;
            kVar2.c(kVar2.a().g(), f1.b(f1.c("422A1B7ABC305B44803D5347256C103EFE16434072233D7D42BA7E")));
        }
    }

    public void w(boolean z10) {
        this.f20264h.c(s2.a.f20302f, z10);
    }
}
