package s6;

import android.content.Context;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public class x0 extends q0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f20380m = f1.a("542B0226A82D4B538B1D591A27681236F60C4D");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f20381n = f1.b(f1.c("542B0226A1364E56811D1355217D1133ED094F5B"));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k3 f20382l;

    public x0(h3 h3Var, w2 w2Var, u6.k kVar, k3 k3Var) {
        super(h3Var, w2Var, kVar);
        this.f20382l = k3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n0 A(Context context) {
        boolean zD = D();
        w(zD);
        return new n0(zD, y(context), true);
    }

    public final boolean B(String str) {
        if (str == null) {
            str = f1.a("56200D");
        }
        boolean zC = C(str, f1.a("542B0226A82D4B538B1D591A27681236F60C4D"));
        boolean zC2 = C(str, f1.b(f1.c("542B0226A1364E56811D1355217D1133ED094F5B")));
        boolean zC3 = false;
        for (String str2 : this.f20382l.c()) {
            zC3 |= C(str, str2);
        }
        boolean z10 = zC2 || zC || zC3;
        if (!z10) {
            t(f1.b(f1.c("422A006EAF2A4C488518745A22791D3EF3035E46731E016745AB787F")), str);
        }
        return z10;
    }

    public final boolean C(String str, String str2) {
        return str.startsWith(str2);
    }

    public final boolean D() {
        return B(this.f20382l.g());
    }

    @Override // s6.j1
    public void a(Context context) {
        z(context);
    }

    @Override // s6.q0, s6.j1
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    public final boolean y(Context context) {
        String strC = t3.c(context, this.f20382l.c());
        if (strC == null) {
            return true;
        }
        t(f1.a("422A006EAF2A4C488518745A22791D3EF3035E46731E016745AB787F4697F8664121"), strC);
        return false;
    }

    public void z(final Context context) {
        super.v(b(new c.a() { // from class: s6.w0
            @Override // u6.c.a
            public final n0 run() {
                return this.f20358a.A(context);
            }
        }));
    }
}
