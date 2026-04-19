package w2;

import w2.h;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22414a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f22415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f22416c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return k.f22416c;
        }

        public final long b() {
            return k.f22415b;
        }
    }

    static {
        float f10 = 0;
        f22415b = i.b(h.m(f10), h.m(f10));
        h.a aVar = h.f22405b;
        f22416c = i.b(aVar.c(), aVar.c());
    }

    public static long c(long j10) {
        return j10;
    }

    public static final float d(long j10) {
        if (!(j10 != f22416c)) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        ae.l lVar = ae.l.f718a;
        return h.m(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static final float e(long j10) {
        if (!(j10 != f22416c)) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        ae.l lVar = ae.l.f718a;
        return h.m(Float.intBitsToFloat((int) (j10 >> 32)));
    }
}
