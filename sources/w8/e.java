package w8;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22623b;

    public e(String str) {
        this(str, null);
    }

    public e(String str, String str2) {
        m.l(str, "log tag cannot be null");
        m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f22622a = str;
        this.f22623b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    private final String g(String str) {
        String str2 = this.f22623b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f22622a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, g(str2));
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, g(str2));
        }
    }

    public void d(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, g(str2), th);
        }
    }

    public void e(String str, String str2) {
        if (a(2)) {
            Log.v(str, g(str2));
        }
    }

    public void f(String str, String str2) {
        if (a(5)) {
            Log.w(str, g(str2));
        }
    }
}
