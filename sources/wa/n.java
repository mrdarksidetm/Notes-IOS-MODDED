package wa;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import wa.a;

/* JADX INFO: loaded from: classes2.dex */
final class n extends PhantomReference implements a.InterfaceC0472a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f22730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f22731b;

    /* synthetic */ n(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, m mVar) {
        super(obj, referenceQueue);
        this.f22730a = set;
        this.f22731b = runnable;
    }

    @Override // wa.a.InterfaceC0472a
    public final void a() {
        if (this.f22730a.remove(this)) {
            clear();
            this.f22731b.run();
        }
    }
}
