package a2;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class u1<E> extends TreeSet<E> {
    public u1(Comparator<? super E> comparator) {
        super(comparator);
    }

    public /* bridge */ int b() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
