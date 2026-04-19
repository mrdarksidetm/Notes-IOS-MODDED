package s;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f19578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f19579d = new Executor() { // from class: s.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f19580e = new Executor() { // from class: s.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f19581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f19582b;

    private c() {
        d dVar = new d();
        this.f19582b = dVar;
        this.f19581a = dVar;
    }

    public static c f() {
        if (f19578c != null) {
            return f19578c;
        }
        synchronized (c.class) {
            if (f19578c == null) {
                f19578c = new c();
            }
        }
        return f19578c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Runnable runnable) {
        f().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Runnable runnable) {
        f().a(runnable);
    }

    @Override // s.f
    public void a(Runnable runnable) {
        this.f19581a.a(runnable);
    }

    @Override // s.f
    public boolean b() {
        return this.f19581a.b();
    }

    @Override // s.f
    public void c(Runnable runnable) {
        this.f19581a.c(runnable);
    }
}
