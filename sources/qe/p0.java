package qe;

import le.x2;

/* JADX INFO: loaded from: classes2.dex */
final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd.g f19088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f19089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x2<Object>[] f19090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19091d;

    public p0(qd.g gVar, int i10) {
        this.f19088a = gVar;
        this.f19089b = new Object[i10];
        this.f19090c = new x2[i10];
    }

    public final void a(x2<?> x2Var, Object obj) {
        Object[] objArr = this.f19089b;
        int i10 = this.f19091d;
        objArr[i10] = obj;
        x2<Object>[] x2VarArr = this.f19090c;
        this.f19091d = i10 + 1;
        ae.r.d(x2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        x2VarArr[i10] = x2Var;
    }

    public final void b(qd.g gVar) {
        int length = this.f19090c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            x2<Object> x2Var = this.f19090c[length];
            ae.r.c(x2Var);
            x2Var.Z(gVar, this.f19089b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
