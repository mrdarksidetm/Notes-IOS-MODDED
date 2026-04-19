package o5;

import ae.r;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import m5.k;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements n5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowLayoutComponent f16369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantLock f16370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Context, MulticastConsumer> f16371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<n3.a<k>, Context> f16372d;

    public e(WindowLayoutComponent windowLayoutComponent) {
        r.f(windowLayoutComponent, "component");
        this.f16369a = windowLayoutComponent;
        this.f16370b = new ReentrantLock();
        this.f16371c = new LinkedHashMap();
        this.f16372d = new LinkedHashMap();
    }

    @Override // n5.a
    public void a(n3.a<k> aVar) {
        r.f(aVar, "callback");
        ReentrantLock reentrantLock = this.f16370b;
        reentrantLock.lock();
        try {
            Context context = this.f16372d.get(aVar);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = this.f16371c.get(context);
            if (multicastConsumer == null) {
                return;
            }
            multicastConsumer.c(aVar);
            this.f16372d.remove(aVar);
            if (multicastConsumer.b()) {
                this.f16371c.remove(context);
                this.f16369a.removeWindowLayoutInfoListener(multicastConsumer);
            }
            i0 i0Var = i0.f15558a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n5.a
    public void b(Context context, Executor executor, n3.a<k> aVar) {
        i0 i0Var;
        r.f(context, "context");
        r.f(executor, "executor");
        r.f(aVar, "callback");
        ReentrantLock reentrantLock = this.f16370b;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.f16371c.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(aVar);
                this.f16372d.put(aVar, context);
                i0Var = i0.f15558a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.f16371c.put(context, multicastConsumer2);
                this.f16372d.put(aVar, context);
                multicastConsumer2.a(aVar);
                this.f16369a.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
            i0 i0Var2 = i0.f15558a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
