package n0;

import com.google.android.gms.common.api.a;
import ge.o;
import u2.q;
import w2.b;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final long a(long j10, boolean z10, int i10, float f10) {
        return w2.c.b(0, c(j10, z10, i10, f10), 0, w2.b.m(j10), 5, null);
    }

    public static final int b(boolean z10, int i10, int i11) {
        if (!z10 && q.e(i10, q.f21604a.b())) {
            return 1;
        }
        return o.d(i11, 1);
    }

    public static final int c(long j10, boolean z10, int i10, float f10) {
        int iN = ((z10 || q.e(i10, q.f21604a.b())) && w2.b.j(j10)) ? w2.b.n(j10) : a.e.API_PRIORITY_OTHER;
        return w2.b.p(j10) == iN ? iN : o.l(m0.g.a(f10), w2.b.p(j10), iN);
    }

    public static final long d(b.a aVar, int i10, int i11) {
        int iMin = Math.min(i10, 262142);
        return aVar.c(iMin, Math.min(i11, iMin >= 8191 ? iMin < 32767 ? 65534 : iMin < 65535 ? 32766 : 8190 : 262142));
    }
}
