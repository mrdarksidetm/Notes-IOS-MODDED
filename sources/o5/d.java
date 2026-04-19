package o5;

import ae.o;
import ae.r;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import i5.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import m5.k;
import md.i0;
import nd.u;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class d implements n5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowLayoutComponent f16363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i5.d f16364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReentrantLock f16365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Context, MulticastConsumer> f16366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<n3.a<k>, Context> f16367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<MulticastConsumer, d.b> f16368f;

    /* synthetic */ class a extends o implements l<WindowLayoutInfo, i0> {
        a(Object obj) {
            super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        public final void d(WindowLayoutInfo windowLayoutInfo) {
            r.f(windowLayoutInfo, "p0");
            ((MulticastConsumer) this.receiver).accept(windowLayoutInfo);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(WindowLayoutInfo windowLayoutInfo) {
            d(windowLayoutInfo);
            return i0.f15558a;
        }
    }

    public d(WindowLayoutComponent windowLayoutComponent, i5.d dVar) {
        r.f(windowLayoutComponent, "component");
        r.f(dVar, "consumerAdapter");
        this.f16363a = windowLayoutComponent;
        this.f16364b = dVar;
        this.f16365c = new ReentrantLock();
        this.f16366d = new LinkedHashMap();
        this.f16367e = new LinkedHashMap();
        this.f16368f = new LinkedHashMap();
    }

    @Override // n5.a
    public void a(n3.a<k> aVar) {
        r.f(aVar, "callback");
        ReentrantLock reentrantLock = this.f16365c;
        reentrantLock.lock();
        try {
            Context context = this.f16367e.get(aVar);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = this.f16366d.get(context);
            if (multicastConsumer == null) {
                return;
            }
            multicastConsumer.c(aVar);
            this.f16367e.remove(aVar);
            if (multicastConsumer.b()) {
                this.f16366d.remove(context);
                d.b bVarRemove = this.f16368f.remove(multicastConsumer);
                if (bVarRemove != null) {
                    bVarRemove.dispose();
                }
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
        ReentrantLock reentrantLock = this.f16365c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.f16366d.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(aVar);
                this.f16367e.put(aVar, context);
                i0Var = i0.f15558a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.f16366d.put(context, multicastConsumer2);
                this.f16367e.put(aVar, context);
                multicastConsumer2.a(aVar);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(u.m()));
                    return;
                } else {
                    this.f16368f.put(multicastConsumer2, this.f16364b.c(this.f16363a, ae.i0.b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new a(multicastConsumer2)));
                }
            }
            i0 i0Var2 = i0.f15558a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
