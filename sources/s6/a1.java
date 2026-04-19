package s6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a1 extends u6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u6.k f19992h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f19991j = f1.a("5A25037FA8314A");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f19990i = new a();

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(h3 h3Var, u6.k kVar) {
        super(h3Var);
        ae.r.f(h3Var, f1.a("5B2B086FAC31"));
        ae.r.f(kVar, f1.a("45210E6BBD2A404F"));
        this.f19992h = kVar;
    }

    @Override // s6.j1
    public boolean c() {
        return false;
    }

    public final void v(n0 n0Var, ArrayList<t6.b> arrayList) {
        ae.r.f(n0Var, f1.a("45211C7DA537"));
        ae.r.f(arrayList, f1.b(f1.c("53251B69")));
        i(f1.b(f1.c("5A25037FA8314A")), n0Var);
        if (n0Var.d()) {
            c(f1.b(f1.c("5A25037FA8314A")), 1);
        }
        if (n0Var.c()) {
            this.f19992h.b(f1.b(f1.c("5A25037FA8314A")), arrayList);
        }
    }
}
