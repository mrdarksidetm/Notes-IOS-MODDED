package w2;

import w2.v;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22428b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v[] f22429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f22430d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22431a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return t.f22430d;
        }
    }

    static {
        v.a aVar = v.f22432b;
        f22429c = new v[]{v.d(aVar.c()), v.d(aVar.b()), v.d(aVar.a())};
        f22430d = u.g(0L, Float.NaN);
    }

    private /* synthetic */ t(long j10) {
        this.f22431a = j10;
    }

    public static final /* synthetic */ t b(long j10) {
        return new t(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof t) && j10 == ((t) obj).k();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final long f(long j10) {
        return j10 & 1095216660480L;
    }

    public static final long g(long j10) {
        return f22429c[(int) (f(j10) >>> 32)].j();
    }

    public static final float h(long j10) {
        ae.l lVar = ae.l.f718a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        StringBuilder sb2;
        String str;
        long jG = g(j10);
        v.a aVar = v.f22432b;
        if (v.g(jG, aVar.c())) {
            return "Unspecified";
        }
        if (v.g(jG, aVar.b())) {
            sb2 = new StringBuilder();
            sb2.append(h(j10));
            str = ".sp";
        } else {
            if (!v.g(jG, aVar.a())) {
                return "Invalid";
            }
            sb2 = new StringBuilder();
            sb2.append(h(j10));
            str = ".em";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        return d(this.f22431a, obj);
    }

    public int hashCode() {
        return i(this.f22431a);
    }

    public final /* synthetic */ long k() {
        return this.f22431a;
    }

    public String toString() {
        return j(this.f22431a);
    }
}
