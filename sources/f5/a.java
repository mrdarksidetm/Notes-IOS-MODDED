package f5;

import android.webkit.CookieManager;
import g5.a0;
import g5.l0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static a0 a(CookieManager cookieManager) {
        return l0.c().a(cookieManager);
    }

    public static List<String> b(CookieManager cookieManager, String str) {
        if (androidx.webkit.internal.m.Z.d()) {
            return a(cookieManager).a(str);
        }
        throw androidx.webkit.internal.m.a();
    }
}
