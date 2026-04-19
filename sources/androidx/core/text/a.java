package androidx.core.text;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    static class C0080a {
        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    public static String a(Locale locale) {
        return C0080a.c(C0080a.a(C0080a.b(locale)));
    }
}
