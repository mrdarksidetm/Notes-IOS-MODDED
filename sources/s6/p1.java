package s6;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a2 f20254b;

    public enum a {
        f20255a,
        f20256b,
        f20257c,
        f20258d
    }

    public p1(Context context) {
        this.f20253a = context;
    }

    public a a() {
        if (Build.VERSION.SDK_INT >= 28 && d()) {
            return a.f20255a;
        }
        try {
            return c() ? a.f20256b : a.f20257c;
        } catch (l1 unused) {
            return a.f20258d;
        }
    }

    public final a2 b() {
        return x2.a();
    }

    public final boolean c() {
        synchronized (this) {
            if (this.f20254b == null) {
                this.f20254b = b();
            }
        }
        if (!this.f20254b.e()) {
            this.f20254b.b();
        }
        return this.f20254b.d();
    }

    public final boolean d() {
        return this.f20253a.getPackageManager().hasSystemFeature(f1.a("562A0B7AA62A4B0F8C154F50266C0E37B1115E5D731E356A5FA144716D8FFF7B58360A"));
    }
}
