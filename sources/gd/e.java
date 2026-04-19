package gd;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements AutoCloseable {
    private e(String str) {
        a(str);
    }

    public static void a(String str) {
        b5.a.c(l(str));
    }

    public static void b(String str, int i10) {
        b5.a.a(l(str), i10);
    }

    private static String l(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, R.styleable.AppCompatTheme_windowMinWidthMajor) + "...";
    }

    public static void o() {
        b5.a.f();
    }

    public static void w(String str, int i10) {
        b5.a.d(l(str), i10);
    }

    public static e y(String str) {
        return new e(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        o();
    }
}
