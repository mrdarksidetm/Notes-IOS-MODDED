package f5;

import android.webkit.WebSettings;
import androidx.webkit.internal.a;
import g5.k0;
import g5.l0;
import g5.x;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class p {
    private static k0 a(WebSettings webSettings) {
        return l0.c().f(webSettings);
    }

    public static int b(WebSettings webSettings) {
        a.c cVar = androidx.webkit.internal.m.f4967d;
        if (cVar.c()) {
            return g5.c.f(webSettings);
        }
        if (cVar.d()) {
            return a(webSettings).a();
        }
        throw androidx.webkit.internal.m.a();
    }

    public static boolean c(WebSettings webSettings) {
        if (androidx.webkit.internal.m.Y.d()) {
            return a(webSettings).b();
        }
        throw androidx.webkit.internal.m.a();
    }

    @Deprecated
    public static int d(WebSettings webSettings) {
        a.h hVar = androidx.webkit.internal.m.S;
        if (hVar.c()) {
            return x.a(webSettings);
        }
        if (hVar.d()) {
            return a(webSettings).c();
        }
        throw androidx.webkit.internal.m.a();
    }

    @Deprecated
    public static int e(WebSettings webSettings) {
        if (androidx.webkit.internal.m.T.d()) {
            return a(webSettings).c();
        }
        throw androidx.webkit.internal.m.a();
    }

    public static boolean f(WebSettings webSettings) {
        a.b bVar = androidx.webkit.internal.m.f4963b;
        if (bVar.c()) {
            return g5.b.g(webSettings);
        }
        if (bVar.d()) {
            return a(webSettings).d();
        }
        throw androidx.webkit.internal.m.a();
    }

    public static Set<String> g(WebSettings webSettings) {
        if (androidx.webkit.internal.m.f4962a0.d()) {
            return a(webSettings).e();
        }
        throw androidx.webkit.internal.m.a();
    }

    public static boolean h(WebSettings webSettings) {
        a.e eVar = androidx.webkit.internal.m.f4965c;
        if (eVar.c()) {
            return g5.i.b(webSettings);
        }
        if (eVar.d()) {
            return a(webSettings).f();
        }
        throw androidx.webkit.internal.m.a();
    }

    public static boolean i(WebSettings webSettings) {
        if (androidx.webkit.internal.m.P.d()) {
            return a(webSettings).g();
        }
        throw androidx.webkit.internal.m.a();
    }

    public static void j(WebSettings webSettings, boolean z10) {
        if (!androidx.webkit.internal.m.P.d()) {
            throw androidx.webkit.internal.m.a();
        }
        a(webSettings).h(z10);
    }

    public static void k(WebSettings webSettings, int i10) {
        a.c cVar = androidx.webkit.internal.m.f4967d;
        if (cVar.c()) {
            g5.c.o(webSettings, i10);
        } else {
            if (!cVar.d()) {
                throw androidx.webkit.internal.m.a();
            }
            a(webSettings).i(i10);
        }
    }

    public static void l(WebSettings webSettings, boolean z10) {
        if (!androidx.webkit.internal.m.Y.d()) {
            throw androidx.webkit.internal.m.a();
        }
        a(webSettings).j(z10);
    }

    @Deprecated
    public static void m(WebSettings webSettings, int i10) {
        a.h hVar = androidx.webkit.internal.m.S;
        if (hVar.c()) {
            x.d(webSettings, i10);
        } else {
            if (!hVar.d()) {
                throw androidx.webkit.internal.m.a();
            }
            a(webSettings).k(i10);
        }
    }

    @Deprecated
    public static void n(WebSettings webSettings, int i10) {
        if (!androidx.webkit.internal.m.T.d()) {
            throw androidx.webkit.internal.m.a();
        }
        a(webSettings).l(i10);
    }

    public static void o(WebSettings webSettings, boolean z10) {
        a.b bVar = androidx.webkit.internal.m.f4963b;
        if (bVar.c()) {
            g5.b.k(webSettings, z10);
        } else {
            if (!bVar.d()) {
                throw androidx.webkit.internal.m.a();
            }
            a(webSettings).m(z10);
        }
    }

    public static void p(WebSettings webSettings, Set<String> set) {
        if (!androidx.webkit.internal.m.f4962a0.d()) {
            throw androidx.webkit.internal.m.a();
        }
        a(webSettings).n(set);
    }

    public static void q(WebSettings webSettings, boolean z10) {
        a.e eVar = androidx.webkit.internal.m.f4965c;
        if (eVar.c()) {
            g5.i.e(webSettings, z10);
        } else {
            if (!eVar.d()) {
                throw androidx.webkit.internal.m.a();
            }
            a(webSettings).o(z10);
        }
    }
}
