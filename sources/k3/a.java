package k3;

import ae.r;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14370a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14374e;

    /* JADX INFO: renamed from: k3.a$a, reason: collision with other inner class name */
    private static final class C0334a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0334a f14375a = new C0334a();

        private C0334a() {
        }

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f14371b = i10 >= 30 ? C0334a.f14375a.a(30) : 0;
        f14372c = i10 >= 30 ? C0334a.f14375a.a(31) : 0;
        f14373d = i10 >= 30 ? C0334a.f14375a.a(33) : 0;
        f14374e = i10 >= 30 ? C0334a.f14375a.a(UtilsKt.MICROS_MULTIPLIER) : 0;
    }

    private a() {
    }

    public static final boolean a(String str, String str2) {
        r.f(str, "codename");
        r.f(str2, "buildCodename");
        if (r.b("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        r.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        r.e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 >= 32) {
                String str = Build.VERSION.CODENAME;
                r.e(str, "CODENAME");
                if (a("Tiramisu", str)) {
                }
            }
            return false;
        }
        return true;
    }
}
