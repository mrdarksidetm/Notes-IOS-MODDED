package e;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f10078e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f10079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f10080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f10081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10082d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public b(float f10, float f11, float f12, int i10) {
        this.f10079a = f10;
        this.f10080b = f11;
        this.f10081c = f12;
        this.f10082d = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(BackEvent backEvent) {
        ae.r.f(backEvent, "backEvent");
        e.a aVar = e.a.f10077a;
        this(aVar.d(backEvent), aVar.e(backEvent), aVar.b(backEvent), aVar.c(backEvent));
    }

    public final float a() {
        return this.f10081c;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f10079a + ", touchY=" + this.f10080b + ", progress=" + this.f10081c + ", swipeEdge=" + this.f10082d + '}';
    }
}
