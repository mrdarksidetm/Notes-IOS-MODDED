package y0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<K, V, Map.Entry<K, V>> f23175a;

    public i(f<K, V> fVar) {
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y(this);
        }
        this.f23175a = new g<>(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return this.f23175a.next();
    }

    public final void d(K k10, V v10) {
        this.f23175a.n(k10, v10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23175a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f23175a.remove();
    }
}
