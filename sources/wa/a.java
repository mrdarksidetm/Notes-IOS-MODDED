package wa;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f22676a = new ReferenceQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f22677b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: wa.a$a, reason: collision with other inner class name */
    public interface InterfaceC0472a {
        void a();
    }

    private a() {
    }

    public static a a() {
        a aVar = new a();
        aVar.b(aVar, new Runnable() { // from class: wa.k
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = aVar.f22676a;
        final Set set = aVar.f22677b;
        Thread thread = new Thread(new Runnable() { // from class: wa.l
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((n) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    public InterfaceC0472a b(Object obj, Runnable runnable) {
        n nVar = new n(obj, this.f22676a, this.f22677b, runnable, null);
        this.f22677b.add(nVar);
        return nVar;
    }
}
