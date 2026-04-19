package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, c cVar) {
            configuration.setLocales((LocaleList) cVar.i());
        }
    }

    public static c a(Configuration configuration) {
        return c.j(a.a(configuration));
    }

    public static void b(Configuration configuration, c cVar) {
        a.b(configuration, cVar);
    }
}
