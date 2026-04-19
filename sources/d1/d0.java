package d1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class d0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x<K, V> f9345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterator<Map.Entry<K, V>> f9346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map.Entry<? extends K, ? extends V> f9348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map.Entry<? extends K, ? extends V> f9349e;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(x<K, V> xVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.f9345a = xVar;
        this.f9346b = it;
        this.f9347c = xVar.d();
        e();
    }

    protected final void e() {
        this.f9348d = this.f9349e;
        this.f9349e = this.f9346b.hasNext() ? this.f9346b.next() : null;
    }

    protected final Map.Entry<K, V> f() {
        return this.f9348d;
    }

    public final x<K, V> g() {
        return this.f9345a;
    }

    public final boolean hasNext() {
        return this.f9349e != null;
    }

    protected final Map.Entry<K, V> i() {
        return this.f9349e;
    }

    public final void remove() {
        if (g().d() != this.f9347c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.f9348d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.f9345a.remove(entry.getKey());
        this.f9348d = null;
        md.i0 i0Var = md.i0.f15558a;
        this.f9347c = g().d();
    }
}
