package y0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r<K, V> extends nd.a<V> implements w0.b<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<K, V> f23180a;

    public r(d<K, V> dVar) {
        this.f23180a = dVar;
    }

    @Override // nd.a
    public int a() {
        return this.f23180a.size();
    }

    @Override // nd.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f23180a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new s(this.f23180a.r());
    }
}
