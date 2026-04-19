package okhttp3.internal.concurrent;

import ae.j;
import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TaskQueue f17132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17133d;

    public Task(String str, boolean z10) {
        r.f(str, "name");
        this.f17130a = str;
        this.f17131b = z10;
        this.f17133d = -1L;
    }

    public /* synthetic */ Task(String str, boolean z10, int i10, j jVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }

    public final boolean a() {
        return this.f17131b;
    }

    public final String b() {
        return this.f17130a;
    }

    public final long c() {
        return this.f17133d;
    }

    public final TaskQueue d() {
        return this.f17132c;
    }

    public final void e(TaskQueue taskQueue) {
        r.f(taskQueue, "queue");
        TaskQueue taskQueue2 = this.f17132c;
        if (taskQueue2 == taskQueue) {
            return;
        }
        if (!(taskQueue2 == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f17132c = taskQueue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f17133d = j10;
    }

    public String toString() {
        return this.f17130a;
    }
}
