package u6;

import android.content.Context;
import s6.e3;
import s6.k0;
import s6.s2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile g f21718c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f21719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s2 f21720b;

    public g(Context context, t6.e eVar) {
        e3 e3Var = new e3(context);
        s2 s2Var = new s2(e3Var.b());
        this.f21720b = s2Var;
        e eVarB = e.b(eVar);
        this.f21719a = new j(context, s2Var.a(), e3Var.b().o(), k0.c(e3Var, eVar, context, eVarB.i()), eVarB, eVar);
    }

    public static g a(Context context, t6.e eVar) {
        if (f21718c == null) {
            synchronized (g.class) {
                if (f21718c == null) {
                    f21718c = new g(context, eVar);
                }
            }
        }
        return f21718c;
    }
}
