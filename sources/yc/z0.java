package yc;

import yc.a1;

/* JADX INFO: loaded from: classes2.dex */
public class z0 implements a1.l {
    @Override // yc.a1.l
    public void d(String str, String str2, a1.g0 g0Var) {
        y0.f23951a.get(str).h(str2);
        g0Var.b();
    }

    @Override // yc.a1.l
    public void e(String str, String str2, String str3, a1.f0<String> f0Var) {
        ba.y0 y0Var = y0.f23951a.get(str);
        f0Var.success((str2 == null || str3 == null) ? y0Var.e() : y0Var.d(str2, str3));
    }
}
