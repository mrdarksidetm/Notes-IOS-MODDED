package w7;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements y7.b<Executor> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f22570a = new k();
    }

    public static k a() {
        return a.f22570a;
    }

    public static Executor b() {
        return (Executor) y7.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ld.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
