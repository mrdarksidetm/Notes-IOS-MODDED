package w2;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public interface d extends l {
    default float G0(float f10) {
        return f10 * getDensity();
    }

    default long N(long j10) {
        return (j10 > k1.l.f14359b.a() ? 1 : (j10 == k1.l.f14359b.a() ? 0 : -1)) != 0 ? i.b(n0(k1.l.i(j10)), n0(k1.l.g(j10))) : k.f22414a.a();
    }

    default int a1(float f10) {
        float fG0 = G0(f10);
        return Float.isInfinite(fG0) ? a.e.API_PRIORITY_OTHER : ce.c.d(fG0);
    }

    float getDensity();

    default float l0(int i10) {
        return h.m(i10 / getDensity());
    }

    default float n0(float f10) {
        return h.m(f10 / getDensity());
    }

    default float o1(long j10) {
        if (v.g(t.g(j10), v.f22432b.b())) {
            return G0(Q(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    default long q(float f10) {
        return g(n0(f10));
    }

    default long w(long j10) {
        return (j10 > k.f22414a.a() ? 1 : (j10 == k.f22414a.a() ? 0 : -1)) != 0 ? k1.m.a(G0(k.e(j10)), G0(k.d(j10))) : k1.l.f14359b.a();
    }
}
