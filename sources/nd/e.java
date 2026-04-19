package nd;

import java.util.AbstractCollection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e<E> extends AbstractCollection<E> implements be.b {
    protected e() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
