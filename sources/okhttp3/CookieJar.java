package okhttp3;

import ae.r;
import java.util.List;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
public interface CookieJar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f16799a = Companion.f16801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CookieJar f16800b = new Companion.NoCookies();

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16801a = new Companion();

        private static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public void a(HttpUrl httpUrl, List<Cookie> list) {
                r.f(httpUrl, "url");
                r.f(list, "cookies");
            }

            @Override // okhttp3.CookieJar
            public List<Cookie> b(HttpUrl httpUrl) {
                r.f(httpUrl, "url");
                return u.m();
            }
        }

        private Companion() {
        }
    }

    void a(HttpUrl httpUrl, List<Cookie> list);

    List<Cookie> b(HttpUrl httpUrl);
}
