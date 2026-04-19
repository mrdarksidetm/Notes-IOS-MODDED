package k7;

import ae.r;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import sc.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14439c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Handler f14440d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ExecutorService f14441e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j.d f14442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14443b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final ExecutorService a() {
            return g.f14441e;
        }
    }

    static {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(8);
        r.e(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        f14441e = executorServiceNewFixedThreadPool;
    }

    public g(j.d dVar) {
        this.f14442a = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(j.d dVar, Object obj) {
        if (dVar != null) {
            dVar.success(obj);
        }
    }

    public final void c(final Object obj) {
        if (this.f14443b) {
            return;
        }
        this.f14443b = true;
        final j.d dVar = this.f14442a;
        this.f14442a = null;
        f14440d.post(new Runnable() { // from class: k7.f
            @Override // java.lang.Runnable
            public final void run() {
                g.d(dVar, obj);
            }
        });
    }
}
