package nd;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j0<T> implements Iterable<i0<? extends T>>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.a<Iterator<T>> f16125a;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(zd.a<? extends Iterator<? extends T>> aVar) {
        ae.r.f(aVar, "iteratorFactory");
        this.f16125a = aVar;
    }

    @Override // java.lang.Iterable
    public Iterator<i0<T>> iterator() {
        return new k0(this.f16125a.invoke());
    }
}
