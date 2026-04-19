package p0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f17826a = w2.h.m(10);

    public static final float a(w2.d dVar, boolean z10, long j10) {
        float fM = k1.f.m(k1.g.a(k1.l.i(j10), k1.l.g(j10))) / 2.0f;
        return z10 ? fM + dVar.G0(f17826a) : fM;
    }

    public static final float b(long j10) {
        return Math.max(k1.l.i(j10), k1.l.g(j10)) * 0.3f;
    }
}
