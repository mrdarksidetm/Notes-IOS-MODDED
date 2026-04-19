package androidx.window.layout.adapter.extensions;

import ae.r;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import m5.k;
import md.i0;
import n3.a;
import o5.f;

/* JADX INFO: loaded from: classes.dex */
public final class MulticastConsumer implements a<WindowLayoutInfo>, Consumer<WindowLayoutInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantLock f4999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f5000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<a<k>> f5001d;

    public MulticastConsumer(Context context) {
        r.f(context, "context");
        this.f4998a = context;
        this.f4999b = new ReentrantLock();
        this.f5001d = new LinkedHashSet();
    }

    public final void a(a<k> aVar) {
        r.f(aVar, "listener");
        ReentrantLock reentrantLock = this.f4999b;
        reentrantLock.lock();
        try {
            k kVar = this.f5000c;
            if (kVar != null) {
                aVar.accept(kVar);
            }
            this.f5001d.add(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        r.f(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f4999b;
        reentrantLock.lock();
        try {
            k kVarB = f.f16373a.b(this.f4998a, windowLayoutInfo);
            this.f5000c = kVarB;
            Iterator<T> it = this.f5001d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).accept(kVarB);
            }
            i0 i0Var = i0.f15558a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b() {
        return this.f5001d.isEmpty();
    }

    public final void c(a<k> aVar) {
        r.f(aVar, "listener");
        ReentrantLock reentrantLock = this.f4999b;
        reentrantLock.lock();
        try {
            this.f5001d.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
