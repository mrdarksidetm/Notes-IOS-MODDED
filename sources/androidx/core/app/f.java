package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    static class a {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static LocaleList b(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    public static androidx.core.os.c a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return androidx.core.os.c.b(d3.d.a(context));
        }
        Object objB = b(context);
        return objB != null ? androidx.core.os.c.j(a.a(objB)) : androidx.core.os.c.e();
    }

    private static Object b(Context context) {
        return context.getSystemService("locale");
    }
}
