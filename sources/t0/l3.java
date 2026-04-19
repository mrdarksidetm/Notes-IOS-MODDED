package t0;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class l3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<b1.g> f20819a = new AtomicReference<>(b1.h.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20820b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f20821c;

    public final T a() {
        return Thread.currentThread().getId() == b.e() ? this.f20821c : (T) this.f20819a.get().b(Thread.currentThread().getId());
    }

    public final void b(T t10) {
        long id2 = Thread.currentThread().getId();
        if (id2 == b.e()) {
            this.f20821c = t10;
            return;
        }
        synchronized (this.f20820b) {
            b1.g gVar = this.f20819a.get();
            if (gVar.d(id2, t10)) {
                return;
            }
            this.f20819a.set(gVar.c(id2, t10));
            md.i0 i0Var = md.i0.f15558a;
        }
    }
}
