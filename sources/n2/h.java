package n2;

import n2.i0;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final i0 a(i0.a aVar) {
        return aVar.l();
    }

    public static final int b(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static final int c(i0 i0Var, int i10) {
        return b(i0Var.compareTo(a(i0.f15808b)) >= 0, e0.f(i10, e0.f15784b.a()));
    }
}
