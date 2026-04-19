package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k1;

/* JADX INFO: loaded from: classes.dex */
public class g0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<K, V> f3573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f3574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V f3575c;

    static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k1.b f3576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f3577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k1.b f3578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f3579d;

        public a(k1.b bVar, K k10, k1.b bVar2, V v10) {
            this.f3576a = bVar;
            this.f3577b = k10;
            this.f3578c = bVar2;
            this.f3579d = v10;
        }
    }

    private g0(k1.b bVar, K k10, k1.b bVar2, V v10) {
        this.f3573a = new a<>(bVar, k10, bVar2, v10);
        this.f3574b = k10;
        this.f3575c = v10;
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return t.d(aVar.f3576a, 1, k10) + t.d(aVar.f3578c, 2, v10);
    }

    public static <K, V> g0<K, V> d(k1.b bVar, K k10, k1.b bVar2, V v10) {
        return new g0<>(bVar, k10, bVar2, v10);
    }

    static <K, V> void e(j jVar, a<K, V> aVar, K k10, V v10) {
        t.z(jVar, aVar.f3576a, 1, k10);
        t.z(jVar, aVar.f3578c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return j.V(i10) + j.C(b(this.f3573a, k10, v10));
    }

    a<K, V> c() {
        return this.f3573a;
    }
}
