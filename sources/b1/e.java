package b1;

import ae.j;
import ae.r;
import t0.p3;
import t0.u;
import t0.u1;
import t0.x;
import y0.t;

/* JADX INFO: loaded from: classes.dex */
public final class e extends y0.d<u<Object>, p3<? extends Object>> implements u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f5168g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final e f5169h;

    public static final class a extends y0.f<u<Object>, p3<? extends Object>> implements u1.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e f5170g;

        public a(e eVar) {
            super(eVar);
            this.f5170g = eVar;
        }

        @Override // y0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof u) {
                return r((u) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof p3) {
                return s((p3) obj);
            }
            return false;
        }

        @Override // y0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof u) {
                return t((u) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof u) ? obj2 : u((u) obj, (p3) obj2);
        }

        @Override // y0.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public e build() {
            e eVar;
            if (i() == this.f5170g.r()) {
                eVar = this.f5170g;
            } else {
                n(new a1.e());
                eVar = new e(i(), size());
            }
            this.f5170g = eVar;
            return eVar;
        }

        public /* bridge */ boolean r(u<Object> uVar) {
            return super.containsKey(uVar);
        }

        @Override // y0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof u) {
                return v((u) obj);
            }
            return null;
        }

        public /* bridge */ boolean s(p3<? extends Object> p3Var) {
            return super.containsValue(p3Var);
        }

        public /* bridge */ p3<Object> t(u<Object> uVar) {
            return (p3) super.get(uVar);
        }

        public /* bridge */ p3<Object> u(u<Object> uVar, p3<? extends Object> p3Var) {
            return (p3) super.getOrDefault(uVar, p3Var);
        }

        public /* bridge */ p3<Object> v(u<Object> uVar) {
            return (p3) super.remove(uVar);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(j jVar) {
            this();
        }

        public final e a() {
            return e.f5169h;
        }
    }

    static {
        t tVarA = t.f23181e.a();
        r.d(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        f5169h = new e(tVarA, 0);
    }

    public e(t<u<Object>, p3<Object>> tVar, int i10) {
        super(tVar, i10);
    }

    public /* bridge */ p3<Object> A(u<Object> uVar, p3<? extends Object> p3Var) {
        return (p3) super.getOrDefault(uVar, p3Var);
    }

    @Override // t0.w
    public <T> T a(u<T> uVar) {
        return (T) x.c(this, uVar);
    }

    @Override // y0.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof u) {
            return x((u) obj);
        }
        return false;
    }

    @Override // nd.d, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof p3) {
            return y((p3) obj);
        }
        return false;
    }

    @Override // y0.d, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof u) {
            return z((u) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof u) ? obj2 : A((u) obj, (p3) obj2);
    }

    @Override // t0.u1
    public u1 k(u<Object> uVar, p3<? extends Object> p3Var) {
        t.b<u<Object>, p3<? extends Object>> bVarP = r().P(uVar.hashCode(), uVar, p3Var, 0);
        return bVarP == null ? this : new e(bVarP.a(), size() + bVarP.b());
    }

    @Override // y0.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a n() {
        return new a(this);
    }

    public /* bridge */ boolean x(u<Object> uVar) {
        return super.containsKey(uVar);
    }

    public /* bridge */ boolean y(p3<? extends Object> p3Var) {
        return super.containsValue(p3Var);
    }

    public /* bridge */ p3<Object> z(u<Object> uVar) {
        return (p3) super.get(uVar);
    }
}
