package w0;

import java.util.Collection;
import java.util.List;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public interface e<E> extends c<E>, b {

    public interface a<E> extends List<E>, Collection, be.b, be.d {
        e<E> build();
    }

    @Override // java.util.List
    e<E> add(int i10, E e10);

    @Override // java.util.List, java.util.Collection
    e<E> add(E e10);

    @Override // java.util.List, java.util.Collection
    e<E> addAll(Collection<? extends E> collection);

    a<E> builder();

    e<E> h(int i10);

    e<E> q(l<? super E, Boolean> lVar);

    @Override // java.util.List, java.util.Collection
    e<E> remove(E e10);

    @Override // java.util.List, java.util.Collection
    e<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    e<E> set(int i10, E e10);
}
