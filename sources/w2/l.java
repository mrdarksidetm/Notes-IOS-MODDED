package w2;

/* JADX INFO: loaded from: classes.dex */
public interface l {
    default float Q(long j10) {
        if (!v.g(t.g(j10), v.f22432b.b())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        x2.b bVar = x2.b.f22943a;
        if (!bVar.f(y0()) || m.a()) {
            return h.m(t.h(j10) * y0());
        }
        x2.a aVarB = bVar.b(y0());
        float fH = t.h(j10);
        return h.m(aVarB == null ? fH * y0() : aVarB.b(fH));
    }

    default long g(float f10) {
        x2.b bVar = x2.b.f22943a;
        if (!bVar.f(y0()) || m.a()) {
            return u.d(f10 / y0());
        }
        x2.a aVarB = bVar.b(y0());
        return u.d(aVarB != null ? aVarB.a(f10) : f10 / y0());
    }

    float y0();
}
