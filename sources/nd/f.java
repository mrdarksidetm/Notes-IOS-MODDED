package nd;

import java.util.AbstractList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f<E> extends AbstractList<E> implements be.d {
    protected f() {
    }

    public abstract int a();

    public abstract E d(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return d(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
