package okhttp3.internal.concurrent;

import ae.j;
import ae.r;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import md.i0;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class TaskRunner {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Companion f17145h = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final TaskRunner f17146i = new TaskRunner(new RealBackend(Util.M(r.m(Util.f17029i, " TaskRunner"), true)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f17147j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Backend f17148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<TaskQueue> f17152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<TaskQueue> f17153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f17154g;

    public interface Backend {
        void a(TaskRunner taskRunner);

        void b(TaskRunner taskRunner, long j10);

        long c();

        void execute(Runnable runnable);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Logger a() {
            return TaskRunner.f17147j;
        }
    }

    public static final class RealBackend implements Backend {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f17155a;

        public RealBackend(ThreadFactory threadFactory) {
            r.f(threadFactory, "threadFactory");
            this.f17155a = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void a(TaskRunner taskRunner) {
            r.f(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void b(TaskRunner taskRunner, long j10) throws InterruptedException {
            r.f(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long c() {
            return System.nanoTime();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(Runnable runnable) {
            r.f(runnable, "runnable");
            this.f17155a.execute(runnable);
        }
    }

    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        r.e(logger, "getLogger(TaskRunner::class.java.name)");
        f17147j = logger;
    }

    public TaskRunner(Backend backend) {
        r.f(backend, "backend");
        this.f17148a = backend;
        this.f17149b = 10000;
        this.f17152e = new ArrayList();
        this.f17153f = new ArrayList();
        this.f17154g = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Task taskD;
                while (true) {
                    TaskRunner taskRunner = this.f17156a;
                    synchronized (taskRunner) {
                        taskD = taskRunner.d();
                    }
                    if (taskD == null) {
                        return;
                    }
                    TaskQueue taskQueueD = taskD.d();
                    r.c(taskQueueD);
                    TaskRunner taskRunner2 = this.f17156a;
                    long jC = -1;
                    boolean zIsLoggable = TaskRunner.f17145h.a().isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jC = taskQueueD.h().g().c();
                        TaskLoggerKt.c(taskD, taskQueueD, "starting");
                    }
                    try {
                        try {
                            taskRunner2.j(taskD);
                            i0 i0Var = i0.f15558a;
                            if (zIsLoggable) {
                                TaskLoggerKt.c(taskD, taskQueueD, r.m("finished run in ", TaskLoggerKt.b(taskQueueD.h().g().c() - jC)));
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (zIsLoggable) {
                            TaskLoggerKt.c(taskD, taskQueueD, r.m("failed a run in ", TaskLoggerKt.b(taskQueueD.h().g().c() - jC)));
                        }
                        throw th;
                    }
                }
            }
        };
    }

    private final void c(Task task, long j10) {
        if (Util.f17028h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        TaskQueue taskQueueD = task.d();
        r.c(taskQueueD);
        if (!(taskQueueD.c() == task)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zD = taskQueueD.d();
        taskQueueD.m(false);
        taskQueueD.l(null);
        this.f17152e.remove(taskQueueD);
        if (j10 != -1 && !zD && !taskQueueD.g()) {
            taskQueueD.k(task, j10, true);
        }
        if (!taskQueueD.e().isEmpty()) {
            this.f17153f.add(taskQueueD);
        }
    }

    private final void e(Task task) {
        if (Util.f17028h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        task.g(-1L);
        TaskQueue taskQueueD = task.d();
        r.c(taskQueueD);
        taskQueueD.e().remove(task);
        this.f17153f.remove(taskQueueD);
        taskQueueD.l(task);
        this.f17152e.add(taskQueueD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Task task) {
        if (Util.f17028h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.b());
        try {
            long jF = task.f();
            synchronized (this) {
                c(task, jF);
                i0 i0Var = i0.f15558a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                c(task, -1L);
                i0 i0Var2 = i0.f15558a;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final Task d() {
        boolean z10;
        if (Util.f17028h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        while (!this.f17153f.isEmpty()) {
            long jC = this.f17148a.c();
            long jMin = Long.MAX_VALUE;
            Iterator<TaskQueue> it = this.f17153f.iterator();
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                Task task2 = it.next().e().get(0);
                long jMax = Math.max(0L, task2.c() - jC);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task != null) {
                        z10 = true;
                        break;
                    }
                    task = task2;
                }
            }
            if (task != null) {
                e(task);
                if (z10 || (!this.f17150c && (!this.f17153f.isEmpty()))) {
                    this.f17148a.execute(this.f17154g);
                }
                return task;
            }
            if (this.f17150c) {
                if (jMin < this.f17151d - jC) {
                    this.f17148a.a(this);
                }
                return null;
            }
            this.f17150c = true;
            this.f17151d = jC + jMin;
            try {
                try {
                    this.f17148a.b(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
            } finally {
                this.f17150c = false;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.f17152e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                this.f17152e.get(size).b();
                if (i10 < 0) {
                    break;
                } else {
                    size = i10;
                }
            }
        }
        int size2 = this.f17153f.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            TaskQueue taskQueue = this.f17153f.get(size2);
            taskQueue.b();
            if (taskQueue.e().isEmpty()) {
                this.f17153f.remove(size2);
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }

    public final Backend g() {
        return this.f17148a;
    }

    public final void h(TaskQueue taskQueue) {
        r.f(taskQueue, "taskQueue");
        if (Util.f17028h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (!taskQueue.e().isEmpty()) {
                Util.c(this.f17153f, taskQueue);
            } else {
                this.f17153f.remove(taskQueue);
            }
        }
        if (this.f17150c) {
            this.f17148a.a(this);
        } else {
            this.f17148a.execute(this.f17154g);
        }
    }

    public final TaskQueue i() {
        int i10;
        synchronized (this) {
            i10 = this.f17149b;
            this.f17149b = i10 + 1;
        }
        return new TaskQueue(this, r.m("Q", Integer.valueOf(i10)));
    }
}
