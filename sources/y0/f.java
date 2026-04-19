package y0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import w0.f;

/* JADX INFO: loaded from: classes.dex */
public class f<K, V> extends nd.g<K, V> implements f.a<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d<K, V> f23164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a1.e f23165b = new a1.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t<K, V> f23166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V f23167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23169f;

    public f(d<K, V> dVar) {
        this.f23164a = dVar;
        this.f23166c = this.f23164a.r();
        this.f23169f = this.f23164a.size();
    }

    @Override // nd.g
    public Set<Map.Entry<K, V>> a() {
        return new h(this);
    }

    @Override // nd.g
    public Set<K> c() {
        return new j(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t<K, V> tVarA = t.f23181e.a();
        ae.r.d(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f23166c = tVarA;
        o(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k10) {
        return this.f23166c.k(k10 != null ? k10.hashCode() : 0, k10, 0);
    }

    @Override // nd.g
    public int d() {
        return this.f23169f;
    }

    @Override // nd.g
    public Collection<V> e() {
        return new l(this);
    }

    @Override // w0.f.a, t0.u1.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d<K, V> build() {
        d<K, V> dVar;
        if (this.f23166c == this.f23164a.r()) {
            dVar = this.f23164a;
        } else {
            this.f23165b = new a1.e();
            dVar = new d<>(this.f23166c, size());
        }
        this.f23164a = dVar;
        return dVar;
    }

    public final int g() {
        return this.f23168e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K k10) {
        return this.f23166c.o(k10 != null ? k10.hashCode() : 0, k10, 0);
    }

    public final t<K, V> i() {
        return this.f23166c;
    }

    public final a1.e j() {
        return this.f23165b;
    }

    public final void l(int i10) {
        this.f23168e = i10;
    }

    public final void m(V v10) {
        this.f23167d = v10;
    }

    protected final void n(a1.e eVar) {
        this.f23165b = eVar;
    }

    public void o(int i10) {
        this.f23169f = i10;
        this.f23168e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        this.f23167d = null;
        this.f23166c = this.f23166c.D(k10 != null ? k10.hashCode() : 0, k10, v10, 0, this);
        return this.f23167d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        d<K, V> dVarBuild = map instanceof d ? (d) map : null;
        if (dVarBuild == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVarBuild = fVar != null ? fVar.build() : null;
        }
        if (dVarBuild == null) {
            super.putAll(map);
            return;
        }
        a1.b bVar = new a1.b(0, 1, null);
        int size = size();
        t<K, V> tVar = this.f23166c;
        t<K, V> tVarR = dVarBuild.r();
        ae.r.d(tVarR, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f23166c = tVar.E(tVarR, 0, bVar, this);
        int size2 = (dVarBuild.size() + size) - bVar.a();
        if (size != size2) {
            o(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K k10) {
        this.f23167d = null;
        t tVarG = this.f23166c.G(k10 != null ? k10.hashCode() : 0, k10, 0, this);
        if (tVarG == null) {
            tVarG = t.f23181e.a();
            ae.r.d(tVarG, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f23166c = tVarG;
        return this.f23167d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t tVarH = this.f23166c.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarH == null) {
            tVarH = t.f23181e.a();
            ae.r.d(tVarH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f23166c = tVarH;
        return size != size();
    }
}
