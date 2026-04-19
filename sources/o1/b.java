package o1;

import l1.s0;
import l1.v0;
import w2.n;
import w2.q;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final a a(v0 v0Var, long j10, long j11, int i10) {
        a aVar = new a(v0Var, j10, j11, null);
        aVar.n(i10);
        return aVar;
    }

    public static /* synthetic */ a b(v0 v0Var, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = n.f22418b.a();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = q.a(v0Var.getWidth(), v0Var.getHeight());
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = s0.f14565a.a();
        }
        return a(v0Var, j12, j13, i10);
    }
}
