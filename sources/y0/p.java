package y0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p<K, V> extends nd.i<K> implements w0.d<K> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d<K, V> f23179b;

    public p(d<K, V> dVar) {
        this.f23179b = dVar;
    }

    @Override // nd.a
    public int a() {
        return this.f23179b.size();
    }

    @Override // nd.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f23179b.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new q(this.f23179b.r());
    }
}
