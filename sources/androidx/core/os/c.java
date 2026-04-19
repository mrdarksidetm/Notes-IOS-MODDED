package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f3328b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f3329a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Locale[] f3330a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : f3330a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String strA = androidx.core.text.a.a(locale);
            if (!strA.isEmpty()) {
                return strA.equals(androidx.core.text.a.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private c(d dVar) {
        this.f3329a = dVar;
    }

    public static c a(Locale... localeArr) {
        return j(b.a(localeArr));
    }

    public static c b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f7478a, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public static c d() {
        return j(b.c());
    }

    public static c e() {
        return f3328b;
    }

    public static c j(LocaleList localeList) {
        return new c(new e(localeList));
    }

    public Locale c(int i10) {
        return this.f3329a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f3329a.equals(((c) obj).f3329a);
    }

    public boolean f() {
        return this.f3329a.isEmpty();
    }

    public int g() {
        return this.f3329a.size();
    }

    public String h() {
        return this.f3329a.a();
    }

    public int hashCode() {
        return this.f3329a.hashCode();
    }

    public Object i() {
        return this.f3329a.b();
    }

    public String toString() {
        return this.f3329a.toString();
    }
}
