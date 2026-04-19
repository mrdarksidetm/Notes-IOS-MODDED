package q0;

import c0.a1;
import l1.v1;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f18511a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f18512b = s0.a.f19588a.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f18513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f18514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f18515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a1<Float> f18516f;

    static {
        v1.a aVar = v1.f14620a;
        f18513c = aVar.a();
        f18514d = aVar.a();
        f18515e = aVar.c();
        f18516f = new a1<>(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    private c0() {
    }

    public final long a(t0.l lVar, int i10) {
        lVar.e(1803349725);
        if (t0.o.I()) {
            t0.o.U(1803349725, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:601)");
        }
        long jF = i.f(s0.a.f19588a.a(), lVar, 6);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return jF;
    }

    public final int b() {
        return f18515e;
    }

    public final float c() {
        return f18512b;
    }

    public final long d(t0.l lVar, int i10) {
        lVar.e(-404222247);
        if (t0.o.I()) {
            t0.o.U(-404222247, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:608)");
        }
        long jI = l1.j0.f14524b.i();
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return jI;
    }
}
