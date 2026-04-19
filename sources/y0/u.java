package y0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class u<K, V, T> implements Iterator<T>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f23190a = t.f23181e.a().p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23192c;

    public final K c() {
        a1.a.a(g());
        return (K) this.f23190a[this.f23192c];
    }

    public final t<? extends K, ? extends V> d() {
        a1.a.a(i());
        Object obj = this.f23190a[this.f23192c];
        ae.r.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    protected final Object[] e() {
        return this.f23190a;
    }

    protected final int f() {
        return this.f23192c;
    }

    public final boolean g() {
        return this.f23192c < this.f23191b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return g();
    }

    public final boolean i() {
        a1.a.a(this.f23192c >= this.f23191b);
        return this.f23192c < this.f23190a.length;
    }

    public final void j() {
        a1.a.a(g());
        this.f23192c += 2;
    }

    public final void l() {
        a1.a.a(i());
        this.f23192c++;
    }

    public final void m(Object[] objArr, int i10) {
        n(objArr, i10, 0);
    }

    public final void n(Object[] objArr, int i10, int i11) {
        this.f23190a = objArr;
        this.f23191b = i10;
        this.f23192c = i11;
    }

    protected final void o(int i10) {
        this.f23192c = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
