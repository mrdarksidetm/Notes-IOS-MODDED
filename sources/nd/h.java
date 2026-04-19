package nd;

import java.util.AbstractSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h<E> extends AbstractSet<E> implements be.f {
    protected h() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
