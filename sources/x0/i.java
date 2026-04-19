package x0;

/* JADX INFO: loaded from: classes.dex */
public final class i<E> extends a<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f22931c;

    public i(E e10, int i10) {
        super(i10, 1);
        this.f22931c = e10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        c();
        g(e() + 1);
        return this.f22931c;
    }

    @Override // java.util.ListIterator
    public E previous() {
        d();
        g(e() - 1);
        return this.f22931c;
    }
}
