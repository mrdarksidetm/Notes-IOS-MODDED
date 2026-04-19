package c0;

import java.util.Map;
import k1.f;
import k1.h;
import k1.l;
import w2.h;
import w2.n;
import w2.p;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k1.h f6246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<j1<?, ?>, Float> f6247b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f6246a = new k1.h(0.5f, 0.5f, 0.5f, 0.5f);
        j1<Integer, m> j1VarC = l1.c(ae.q.f721a);
        Float fValueOf2 = Float.valueOf(1.0f);
        j1<w2.h, m> j1VarG = l1.g(w2.h.f22405b);
        Float fValueOf3 = Float.valueOf(0.1f);
        f6247b = nd.r0.h(md.x.a(j1VarC, fValueOf2), md.x.a(l1.j(w2.p.f22421b), fValueOf2), md.x.a(l1.i(w2.n.f22418b), fValueOf2), md.x.a(l1.b(ae.l.f718a), Float.valueOf(0.01f)), md.x.a(l1.e(k1.h.f14343e), fValueOf), md.x.a(l1.f(k1.l.f14359b), fValueOf), md.x.a(l1.d(k1.f.f14338b), fValueOf), md.x.a(j1VarG, fValueOf3), md.x.a(l1.h(w2.j.f22410b), fValueOf3));
    }

    public static final float a(h.a aVar) {
        return w2.h.m(0.1f);
    }

    public static final int b(ae.q qVar) {
        return 1;
    }

    public static final long c(f.a aVar) {
        return k1.g.a(0.5f, 0.5f);
    }

    public static final long d(l.a aVar) {
        return k1.m.a(0.5f, 0.5f);
    }

    public static final long e(n.a aVar) {
        return w2.o.a(1, 1);
    }

    public static final long f(p.a aVar) {
        return w2.q.a(1, 1);
    }

    public static final k1.h g(h.a aVar) {
        return f6246a;
    }

    public static final Map<j1<?, ?>, Float> h() {
        return f6247b;
    }
}
