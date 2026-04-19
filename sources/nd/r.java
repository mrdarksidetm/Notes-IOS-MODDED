package nd;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r implements Iterator<Character>, be.a {
    public abstract char c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
