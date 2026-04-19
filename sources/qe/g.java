package qe;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collection<le.k0> f19055a = ie.o.v(ie.m.c(ServiceLoader.load(le.k0.class, le.k0.class.getClassLoader()).iterator()));

    public static final Collection<le.k0> a() {
        return f19055a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
