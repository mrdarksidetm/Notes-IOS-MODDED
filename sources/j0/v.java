package j0;

import java.util.List;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public interface v extends y1.g0 {
    @Override // w2.l
    default long g(float f10) {
        return w2.u.d(f10 / y0());
    }

    List<t0> m0(int i10, long j10);

    @Override // w2.d
    default long q(float f10) {
        return w2.u.d(f10 / (y0() * getDensity()));
    }

    @Override // w2.d
    default long w(long j10) {
        return (j10 > w2.k.f22414a.a() ? 1 : (j10 == w2.k.f22414a.a() ? 0 : -1)) != 0 ? k1.m.a(G0(w2.k.e(j10)), G0(w2.k.d(j10))) : k1.l.f14359b.a();
    }
}
