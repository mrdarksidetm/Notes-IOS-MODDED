package y0;

import java.util.Map;
import java.util.Set;
import y0.t;

/* JADX INFO: loaded from: classes.dex */
public class d<K, V> extends nd.d<K, V> implements w0.f<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f23156d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23157e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f23158f = new d(t.f23181e.a(), 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t<K, V> f23159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23160c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final <K, V> d<K, V> a() {
            d<K, V> dVar = d.f23158f;
            ae.r.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }
    }

    public d(t<K, V> tVar, int i10) {
        this.f23159b = tVar;
        this.f23160c = i10;
    }

    private final w0.d<Map.Entry<K, V>> o() {
        return new n(this);
    }

    @Override // java.util.Map
    public boolean containsKey(K k10) {
        return this.f23159b.k(k10 != null ? k10.hashCode() : 0, k10, 0);
    }

    @Override // nd.d
    public final Set<Map.Entry<K, V>> e() {
        return o();
    }

    @Override // nd.d
    public int g() {
        return this.f23160c;
    }

    @Override // java.util.Map
    public V get(K k10) {
        return this.f23159b.o(k10 != null ? k10.hashCode() : 0, k10, 0);
    }

    @Override // w0.f, t0.u1
    public f<K, V> n() {
        return new f<>(this);
    }

    @Override // nd.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public w0.d<K> f() {
        return new p(this);
    }

    public final t<K, V> r() {
        return this.f23159b;
    }

    @Override // nd.d
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public w0.b<V> i() {
        return new r(this);
    }

    public d<K, V> t(K k10, V v10) {
        t.b<K, V> bVarP = this.f23159b.P(k10 != null ? k10.hashCode() : 0, k10, v10, 0);
        return bVarP == null ? this : new d<>(bVarP.a(), size() + bVarP.b());
    }

    public d<K, V> u(K k10) {
        t<K, V> tVarQ = this.f23159b.Q(k10 != null ? k10.hashCode() : 0, k10, 0);
        return this.f23159b == tVarQ ? this : tVarQ == null ? f23156d.a() : new d<>(tVarQ, size() - 1);
    }
}
