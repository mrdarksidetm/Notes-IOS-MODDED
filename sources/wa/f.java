package wa;

import android.content.Context;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f22684b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static f f22685c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private da.n f22686a;

    private f() {
    }

    public static f c() {
        f fVar;
        synchronized (f22684b) {
            w8.m.o(f22685c != null, "MlKitContext has not been initialized");
            fVar = (f) w8.m.k(f22685c);
        }
        return fVar;
    }

    public static f d(Context context) {
        f fVar;
        synchronized (f22684b) {
            w8.m.o(f22685c == null, "MlKitContext is already initialized");
            f fVar2 = new f();
            f22685c = fVar2;
            Context contextE = e(context);
            da.n nVarE = da.n.k(TaskExecutors.MAIN_THREAD).d(da.f.c(contextE, MlKitComponentDiscoveryService.class).b()).b(da.c.s(contextE, Context.class, new Class[0])).b(da.c.s(fVar2, f.class, new Class[0])).e();
            fVar2.f22686a = nVarE;
            nVarE.n(true);
            fVar = f22685c;
        }
        return fVar;
    }

    private static Context e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public <T> T a(Class<T> cls) {
        w8.m.o(f22685c == this, "MlKitContext has been deleted");
        w8.m.k(this.f22686a);
        return (T) this.f22686a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
