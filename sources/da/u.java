package da;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
class u implements ka.d, ka.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<ka.b<Object>, Executor>> f9917a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue<ka.a<?>> f9918b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f9919c;

    u(Executor executor) {
        this.f9919c = executor;
    }

    private synchronized Set<Map.Entry<ka.b<Object>, Executor>> d(ka.a<?> aVar) {
        ConcurrentHashMap<ka.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f9917a.get(aVar.a());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Map.Entry entry, ka.a aVar) {
        ((ka.b) entry.getKey()).a(aVar);
    }

    @Override // ka.c
    public void a(final ka.a<?> aVar) {
        c0.b(aVar);
        synchronized (this) {
            Queue<ka.a<?>> queue = this.f9918b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<ka.b<Object>, Executor> entry : d(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: da.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.e(entry, aVar);
                    }
                });
            }
        }
    }

    void c() {
        Queue<ka.a<?>> queue;
        synchronized (this) {
            queue = this.f9918b;
            if (queue != null) {
                this.f9918b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<ka.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }
}
