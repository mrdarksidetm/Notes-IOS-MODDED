package okhttp3.internal.concurrent;

import ae.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import md.i0;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class TaskQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskRunner f17134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Task f17137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Task> f17138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17139f;

    private static final class AwaitIdleTask extends Task {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final CountDownLatch f17140e;

        public AwaitIdleTask() {
            super(r.m(Util.f17029i, " awaitIdle"), false);
            this.f17140e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long f() {
            this.f17140e.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
        r.f(taskRunner, "taskRunner");
        r.f(str, "name");
        this.f17134a = taskRunner;
        this.f17135b = str;
        this.f17138e = new ArrayList();
    }

    public static /* synthetic */ void j(TaskQueue taskQueue, Task task, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        taskQueue.i(task, j10);
    }

    public final void a() {
        if (Util.f17028h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f17134a) {
            if (b()) {
                h().h(this);
            }
            i0 i0Var = i0.f15558a;
        }
    }

    public final boolean b() {
        Task task = this.f17137d;
        if (task != null) {
            r.c(task);
            if (task.a()) {
                this.f17139f = true;
            }
        }
        boolean z10 = false;
        int size = this.f17138e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                if (this.f17138e.get(size).a()) {
                    Task task2 = this.f17138e.get(size);
                    if (TaskRunner.f17145h.a().isLoggable(Level.FINE)) {
                        TaskLoggerKt.c(task2, this, "canceled");
                    }
                    this.f17138e.remove(size);
                    z10 = true;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        return z10;
    }

    public final Task c() {
        return this.f17137d;
    }

    public final boolean d() {
        return this.f17139f;
    }

    public final List<Task> e() {
        return this.f17138e;
    }

    public final String f() {
        return this.f17135b;
    }

    public final boolean g() {
        return this.f17136c;
    }

    public final TaskRunner h() {
        return this.f17134a;
    }

    public final void i(Task task, long j10) {
        r.f(task, "task");
        synchronized (this.f17134a) {
            if (!g()) {
                if (k(task, j10, false)) {
                    h().h(this);
                }
                i0 i0Var = i0.f15558a;
            } else if (task.a()) {
                if (TaskRunner.f17145h.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (TaskRunner.f17145h.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(Task task, long j10, boolean z10) {
        String strB;
        String str;
        r.f(task, "task");
        task.e(this);
        long jC = this.f17134a.g().c();
        long j11 = jC + j10;
        int iIndexOf = this.f17138e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.c() <= j11) {
                if (TaskRunner.f17145h.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f17138e.remove(iIndexOf);
        }
        task.g(j11);
        if (TaskRunner.f17145h.a().isLoggable(Level.FINE)) {
            long j12 = j11 - jC;
            if (z10) {
                strB = TaskLoggerKt.b(j12);
                str = "run again after ";
            } else {
                strB = TaskLoggerKt.b(j12);
                str = "scheduled after ";
            }
            TaskLoggerKt.c(task, this, r.m(str, strB));
        }
        Iterator<Task> it = this.f17138e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().c() - jC > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f17138e.size();
        }
        this.f17138e.add(size, task);
        return size == 0;
    }

    public final void l(Task task) {
        this.f17137d = task;
    }

    public final void m(boolean z10) {
        this.f17139f = z10;
    }

    public final void n(boolean z10) {
        this.f17136c = z10;
    }

    public final void o() {
        if (Util.f17028h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f17134a) {
            n(true);
            if (b()) {
                h().h(this);
            }
            i0 i0Var = i0.f15558a;
        }
    }

    public String toString() {
        return this.f17135b;
    }
}
