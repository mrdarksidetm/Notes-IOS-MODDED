package ie;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<g<T>> f12672a;

    public a(g<? extends T> gVar) {
        ae.r.f(gVar, "sequence");
        this.f12672a = new AtomicReference<>(gVar);
    }

    @Override // ie.g
    public Iterator<T> iterator() {
        g<T> andSet = this.f12672a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
