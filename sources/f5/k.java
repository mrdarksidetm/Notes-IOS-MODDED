package f5;

import java.io.OutputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k f11140a = new androidx.webkit.internal.i();
    }

    public static k a() {
        return a.f11140a;
    }

    public abstract boolean b();

    public abstract void c(j jVar);

    public abstract boolean d(OutputStream outputStream, Executor executor);
}
