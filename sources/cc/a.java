package cc;

import hc.d;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f6792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f6793f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f6794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gc.a f6795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FlutterJNI.c f6796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f6797d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f6798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private gc.a f6799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private FlutterJNI.c f6800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ExecutorService f6801d;

        /* JADX INFO: renamed from: cc.a$b$a, reason: collision with other inner class name */
        private class ThreadFactoryC0158a implements ThreadFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f6802a;

            private ThreadFactoryC0158a() {
                this.f6802a = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("flutter-worker-");
                int i10 = this.f6802a;
                this.f6802a = i10 + 1;
                sb2.append(i10);
                thread.setName(sb2.toString());
                return thread;
            }
        }

        private void b() {
            if (this.f6800c == null) {
                this.f6800c = new FlutterJNI.c();
            }
            if (this.f6801d == null) {
                this.f6801d = Executors.newCachedThreadPool(new ThreadFactoryC0158a());
            }
            if (this.f6798a == null) {
                this.f6798a = new d(this.f6800c.a(), this.f6801d);
            }
        }

        public a a() {
            b();
            return new a(this.f6798a, this.f6799b, this.f6800c, this.f6801d);
        }
    }

    private a(d dVar, gc.a aVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f6794a = dVar;
        this.f6795b = aVar;
        this.f6796c = cVar;
        this.f6797d = executorService;
    }

    public static a e() {
        f6793f = true;
        if (f6792e == null) {
            f6792e = new b().a();
        }
        return f6792e;
    }

    public gc.a a() {
        return this.f6795b;
    }

    public ExecutorService b() {
        return this.f6797d;
    }

    public d c() {
        return this.f6794a;
    }

    public FlutterJNI.c d() {
        return this.f6796c;
    }
}
