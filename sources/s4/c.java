package s4;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
abstract class c<Result> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Handler f19948e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile e f19950b = e.PENDING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f19951c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f19952d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FutureTask<Result> f19949a = new b(new a());

    class a implements Callable<Result> {
        a() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() {
            c.this.f19952d.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.b();
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    class b extends FutureTask<Result> {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c.this.j(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: s4.c$c, reason: collision with other inner class name */
    class RunnableC0412c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19955a;

        RunnableC0412c(Object obj) {
            this.f19955a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            c.this.d(this.f19955a);
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19957a;

        static {
            int[] iArr = new int[e.values().length];
            f19957a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19957a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    c() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (c.class) {
            if (f19948e == null) {
                f19948e = new Handler(Looper.getMainLooper());
            }
            handler = f19948e;
        }
        return handler;
    }

    public final boolean a(boolean z10) {
        this.f19951c.set(true);
        return this.f19949a.cancel(z10);
    }

    protected abstract Result b();

    public final void c(Executor executor) {
        if (this.f19950b == e.PENDING) {
            this.f19950b = e.RUNNING;
            executor.execute(this.f19949a);
            return;
        }
        int i10 = d.f19957a[this.f19950b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    void d(Result result) {
        if (f()) {
            g(result);
        } else {
            h(result);
        }
        this.f19950b = e.FINISHED;
    }

    public final boolean f() {
        return this.f19951c.get();
    }

    protected void g(Result result) {
    }

    protected void h(Result result) {
    }

    void i(Result result) {
        e().post(new RunnableC0412c(result));
    }

    void j(Result result) {
        if (this.f19952d.get()) {
            return;
        }
        i(result);
    }
}
