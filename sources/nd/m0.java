package nd;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0 implements Iterator<Long>, be.a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
