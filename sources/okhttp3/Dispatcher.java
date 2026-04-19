package okhttp3;

import ae.r;
import com.google.android.gms.common.api.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import md.i0;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
public final class Dispatcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f16805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f16806d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16803a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16804b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque<RealCall.AsyncCall> f16807e = new ArrayDeque<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<RealCall.AsyncCall> f16808f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<RealCall> f16809g = new ArrayDeque<>();

    private final RealCall.AsyncCall d(String str) {
        for (RealCall.AsyncCall asyncCall : this.f16808f) {
            if (r.b(asyncCall.d(), str)) {
                return asyncCall;
            }
        }
        for (RealCall.AsyncCall asyncCall2 : this.f16807e) {
            if (r.b(asyncCall2.d(), str)) {
                return asyncCall2;
            }
        }
        return null;
    }

    private final <T> void e(Deque<T> deque, T t10) {
        Runnable runnableH;
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnableH = h();
            i0 i0Var = i0.f15558a;
        }
        if (k() || runnableH == null) {
            return;
        }
        runnableH.run();
    }

    private final boolean k() {
        int i10;
        boolean z10;
        if (Util.f17028h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.f16807e.iterator();
            r.e(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                RealCall.AsyncCall next = it.next();
                if (this.f16808f.size() >= i()) {
                    break;
                }
                if (next.c().get() < j()) {
                    it.remove();
                    next.c().incrementAndGet();
                    r.e(next, "asyncCall");
                    arrayList.add(next);
                    this.f16808f.add(next);
                }
            }
            z10 = l() > 0;
            i0 i0Var = i0.f15558a;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((RealCall.AsyncCall) arrayList.get(i10)).a(c());
        }
        return z10;
    }

    public final void a(RealCall.AsyncCall asyncCall) {
        RealCall.AsyncCall asyncCallD;
        r.f(asyncCall, "call");
        synchronized (this) {
            this.f16807e.add(asyncCall);
            if (!asyncCall.b().p() && (asyncCallD = d(asyncCall.d())) != null) {
                asyncCall.e(asyncCallD);
            }
            i0 i0Var = i0.f15558a;
        }
        k();
    }

    public final synchronized void b(RealCall realCall) {
        r.f(realCall, "call");
        this.f16809g.add(realCall);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        if (this.f16806d == null) {
            this.f16806d = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.M(r.m(Util.f17029i, " Dispatcher"), false));
        }
        executorService = this.f16806d;
        r.c(executorService);
        return executorService;
    }

    public final void f(RealCall.AsyncCall asyncCall) {
        r.f(asyncCall, "call");
        asyncCall.c().decrementAndGet();
        e(this.f16808f, asyncCall);
    }

    public final void g(RealCall realCall) {
        r.f(realCall, "call");
        e(this.f16809g, realCall);
    }

    public final synchronized Runnable h() {
        return this.f16805c;
    }

    public final synchronized int i() {
        return this.f16803a;
    }

    public final synchronized int j() {
        return this.f16804b;
    }

    public final synchronized int l() {
        return this.f16808f.size() + this.f16809g.size();
    }
}
