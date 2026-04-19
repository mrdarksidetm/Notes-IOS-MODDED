package w2;

import w2.h;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22410b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f22411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f22412d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22413a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return j.f22412d;
        }
    }

    static {
        float f10 = 0;
        f22411c = i.a(h.m(f10), h.m(f10));
        h.a aVar = h.f22405b;
        f22412d = i.a(aVar.c(), aVar.c());
    }

    private /* synthetic */ j(long j10) {
        this.f22413a = j10;
    }

    public static final /* synthetic */ j b(long j10) {
        return new j(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof j) && j10 == ((j) obj).i();
    }

    public static final float e(long j10) {
        if (!(j10 != f22412d)) {
            throw new IllegalStateException("DpOffset is unspecified".toString());
        }
        ae.l lVar = ae.l.f718a;
        return h.m(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public static final float f(long j10) {
        if (!(j10 != f22412d)) {
            throw new IllegalStateException("DpOffset is unspecified".toString());
        }
        ae.l lVar = ae.l.f718a;
        return h.m(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        if (!(j10 != f22410b.a())) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) h.q(e(j10))) + ", " + ((Object) h.q(f(j10))) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f22413a, obj);
    }

    public int hashCode() {
        return g(this.f22413a);
    }

    public final /* synthetic */ long i() {
        return this.f22413a;
    }

    public String toString() {
        return h(this.f22413a);
    }
}
