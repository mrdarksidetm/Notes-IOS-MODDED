package x0;

import ae.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import w0.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<E> extends nd.c<E> implements w0.e<E> {

    static final class a extends s implements zd.l<E, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection<E> f22909a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f22909a = collection;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E e10) {
            return Boolean.valueOf(this.f22909a.contains(e10));
        }
    }

    @Override // java.util.Collection, java.util.List, w0.e
    public w0.e<E> addAll(Collection<? extends E> collection) {
        e.a<E> aVarBuilder = builder();
        aVarBuilder.addAll(collection);
        return aVarBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nd.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // nd.a, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // nd.c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // nd.c, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, w0.e
    public w0.e<E> remove(E e10) {
        int iIndexOf = indexOf(e10);
        return iIndexOf != -1 ? h(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, w0.e
    public w0.e<E> removeAll(Collection<? extends E> collection) {
        return q(new a(collection));
    }

    @Override // nd.c, java.util.List
    public w0.c<E> subList(int i10, int i11) {
        return super.subList(i10, i11);
    }
}
