package f5;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f11132a = new androidx.webkit.internal.d();
    }

    public static d b() {
        if (s.a("PROXY_OVERRIDE")) {
            return a.f11132a;
        }
        throw new UnsupportedOperationException("Proxy override not supported");
    }

    public abstract void a(Executor executor, Runnable runnable);

    public abstract void c(c cVar, Executor executor, Runnable runnable);
}
