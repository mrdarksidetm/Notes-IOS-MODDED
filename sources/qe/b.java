package qe;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f19045a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f19044a;

    private final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19045a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = a.f19044a;
        return obj2 != obj3 ? obj2 : b3.b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qe.a0
    public final Object a(Object obj) {
        Object objC = f19045a.get(this);
        if (objC == a.f19044a) {
            objC = c(d(obj));
        }
        b(obj, objC);
        return objC;
    }

    public abstract void b(T t10, Object obj);

    public abstract Object d(T t10);
}
