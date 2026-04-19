package da;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
class x<T> implements ma.b<Set<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set<T> f9924b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set<ma.b<T>> f9923a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection<ma.b<T>> collection) {
        this.f9923a.addAll(collection);
    }

    static x<?> b(Collection<ma.b<?>> collection) {
        return new x<>((Set) collection);
    }

    private synchronized void d() {
        Iterator<ma.b<T>> it = this.f9923a.iterator();
        while (it.hasNext()) {
            this.f9924b.add(it.next().get());
        }
        this.f9923a = null;
    }

    synchronized void a(ma.b<T> bVar) {
        Set set;
        if (this.f9924b == null) {
            set = this.f9923a;
        } else {
            set = this.f9924b;
            bVar = (ma.b<T>) bVar.get();
        }
        set.add(bVar);
    }

    @Override // ma.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f9924b == null) {
            synchronized (this) {
                if (this.f9924b == null) {
                    this.f9924b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f9924b);
    }
}
