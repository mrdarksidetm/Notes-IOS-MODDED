package androidx.compose.ui.graphics;

import ae.j;
import ae.l;
import l1.z1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2806b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f2807c = z1.a(0.5f, 0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f2808a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final long a() {
            return g.f2807c;
        }
    }

    private /* synthetic */ g(long j10) {
        this.f2808a = j10;
    }

    public static final /* synthetic */ g b(long j10) {
        return new g(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof g) && j10 == ((g) obj).j();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        l lVar = l.f718a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float g(long j10) {
        l lVar = l.f718a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f2808a, obj);
    }

    public int hashCode() {
        return h(this.f2808a);
    }

    public final /* synthetic */ long j() {
        return this.f2808a;
    }

    public String toString() {
        return i(this.f2808a);
    }
}
