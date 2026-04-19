package b2;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class c2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0.d<Reference<T>> f5206a = new v0.d<>(new Reference[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<T> f5207b = new ReferenceQueue<>();

    private final void a() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.f5207b.poll();
            if (referencePoll != null) {
                this.f5206a.v(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final T b() {
        a();
        while (this.f5206a.s()) {
            T t10 = this.f5206a.x(r0.o() - 1).get();
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public final void c(T t10) {
        a();
        this.f5206a.b(new WeakReference(t10, this.f5207b));
    }
}
