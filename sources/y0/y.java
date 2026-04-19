package y0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i<K, V> f23193d;

    public y(i<K, V> iVar) {
        this.f23193d = iVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        a1.a.a(g());
        o(f() + 2);
        return new c(this.f23193d, e()[f() - 2], e()[f() - 1]);
    }
}
