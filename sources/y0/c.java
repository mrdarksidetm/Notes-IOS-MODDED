package y0;

import be.e;

/* JADX INFO: loaded from: classes.dex */
final class c<K, V> extends b<K, V> implements e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i<K, V> f23154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V f23155d;

    public c(i<K, V> iVar, K k10, V v10) {
        super(k10, v10);
        this.f23154c = iVar;
        this.f23155d = v10;
    }

    public void a(V v10) {
        this.f23155d = v10;
    }

    @Override // y0.b, java.util.Map.Entry
    public V getValue() {
        return this.f23155d;
    }

    @Override // y0.b, java.util.Map.Entry
    public V setValue(V v10) {
        V value = getValue();
        a(v10);
        this.f23154c.d(getKey(), v10);
        return value;
    }
}
