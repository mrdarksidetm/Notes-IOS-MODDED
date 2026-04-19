package t0;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final md.l f20626a = md.n.b(a.f20628a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f20627b;

    static final class a extends ae.s implements zd.a<c1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20628a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return Looper.getMainLooper() != null ? d0.f20639a : p2.f20900a;
        }
    }

    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f20627b = id2;
    }

    public static final h1 a(float f10) {
        return new o1(f10);
    }

    public static final i1 b(int i10) {
        return new p1(i10);
    }

    public static final j1 c(long j10) {
        return new q1(j10);
    }

    public static final <T> d1.u<T> d(T t10, e3<T> e3Var) {
        return new r1(t10, e3Var);
    }

    public static final long e() {
        return f20627b;
    }

    public static final void f(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }
}
