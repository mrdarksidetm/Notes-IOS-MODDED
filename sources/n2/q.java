package n2;

import n2.h0;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final s a(String str, i0 i0Var, int i10, h0.d dVar) {
        return new p(str, i0Var, i10, dVar, null);
    }

    public static /* synthetic */ s b(String str, i0 i0Var, int i10, h0.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i0Var = i0.f15808b.g();
        }
        if ((i11 & 4) != 0) {
            i10 = e0.f15784b.b();
        }
        if ((i11 & 8) != 0) {
            dVar = new h0.d(new h0.a[0]);
        }
        return a(str, i0Var, i10, dVar);
    }
}
