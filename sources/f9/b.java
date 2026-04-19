package f9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f11166b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadFactory f11167c = Executors.defaultThreadFactory();

    public b(String str) {
        m.l(str, "Name must not be null");
        this.f11165a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f11167c.newThread(new c(runnable, 0));
        threadNewThread.setName(this.f11165a + "[" + this.f11166b.getAndIncrement() + "]");
        return threadNewThread;
    }
}
