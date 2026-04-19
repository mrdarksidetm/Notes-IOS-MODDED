package d1;

import be.e;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class c0<K, V> extends d0<K, V> implements Iterator<Map.Entry<K, V>>, be.a {

    public static final class a implements Map.Entry<K, V>, e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f9340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V f9341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0<K, V> f9342c;

        a(c0<K, V> c0Var) {
            this.f9342c = c0Var;
            Map.Entry<K, V> entryF = c0Var.f();
            ae.r.c(entryF);
            this.f9340a = entryF.getKey();
            Map.Entry<K, V> entryF2 = c0Var.f();
            ae.r.c(entryF2);
            this.f9341b = entryF2.getValue();
        }

        public void a(V v10) {
            this.f9341b = v10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f9340a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f9341b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            c0<K, V> c0Var = this.f9342c;
            if (c0Var.g().d() != ((d0) c0Var).f9347c) {
                throw new ConcurrentModificationException();
            }
            V v11 = (V) getValue();
            c0Var.g().put(getKey(), v10);
            a(v10);
            return v11;
        }
    }

    public c0(x<K, V> xVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(xVar, it);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        e();
        if (f() != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}
