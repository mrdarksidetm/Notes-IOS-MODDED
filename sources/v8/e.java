package v8;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22228a;

    public e(Activity activity) {
        w8.m.l(activity, "Activity must not be null");
        this.f22228a = activity;
    }

    public final Activity a() {
        return (Activity) this.f22228a;
    }

    public final androidx.fragment.app.o b() {
        return (androidx.fragment.app.o) this.f22228a;
    }

    public final boolean c() {
        return this.f22228a instanceof Activity;
    }

    public final boolean d() {
        return this.f22228a instanceof androidx.fragment.app.o;
    }
}
