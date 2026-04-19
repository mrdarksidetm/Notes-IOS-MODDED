package g7;

import ae.h0;
import ae.r;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import md.t;
import md.u;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f11491a = Executors.newCachedThreadPool();

    public static final <T> Object b(long j10, final zd.a<? extends T> aVar) {
        Object objA;
        Future<?> futureSubmit;
        r.f(aVar, "block");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final h0 h0Var = new h0();
        try {
            futureSubmit = f11491a.submit(new Runnable() { // from class: g7.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.c(h0Var, aVar, countDownLatch);
                }
            });
        } catch (RejectedExecutionException e10) {
            e = e10;
            t.a aVar2 = t.f15576b;
        }
        if (countDownLatch.await(j10, TimeUnit.MILLISECONDS)) {
            t.a aVar3 = t.f15576b;
            objA = h0Var.f712a;
            return t.b(objA);
        }
        futureSubmit.cancel(true);
        t.a aVar4 = t.f15576b;
        e = new TimeoutException();
        objA = u.a(e);
        return t.b(objA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    public static final void c(h0 h0Var, zd.a aVar, CountDownLatch countDownLatch) {
        r.f(h0Var, "$res");
        r.f(aVar, "$block");
        r.f(countDownLatch, "$countDownLatch");
        h0Var.f712a = aVar.invoke();
        countDownLatch.countDown();
    }
}
