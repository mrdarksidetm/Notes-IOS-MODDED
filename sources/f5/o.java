package f5;

import android.webkit.WebResourceRequest;
import androidx.webkit.internal.a;
import g5.j0;
import g5.l0;

/* JADX INFO: loaded from: classes.dex */
public class o {
    private static j0 a(WebResourceRequest webResourceRequest) {
        return l0.c().k(webResourceRequest);
    }

    public static boolean b(WebResourceRequest webResourceRequest) {
        a.c cVar = androidx.webkit.internal.m.f4987u;
        if (cVar.c()) {
            return g5.c.j(webResourceRequest);
        }
        if (cVar.d()) {
            return a(webResourceRequest).a();
        }
        throw androidx.webkit.internal.m.a();
    }
}
