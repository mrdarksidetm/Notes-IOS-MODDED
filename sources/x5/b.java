package x5;

import a6.g;
import ae.j;
import ae.r;
import d6.i;
import j6.m;
import java.util.List;
import md.s;
import md.x;
import nd.c0;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e6.b> f22979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<s<g6.d<? extends Object, ? extends Object>, Class<? extends Object>>> f22980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<s<f6.b<? extends Object>, Class<? extends Object>>> f22981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<s<i.a<? extends Object>, Class<? extends Object>>> f22982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<g.a> f22983e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<e6.b> f22984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<s<g6.d<? extends Object, ?>, Class<? extends Object>>> f22985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<s<f6.b<? extends Object>, Class<? extends Object>>> f22986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<s<i.a<? extends Object>, Class<? extends Object>>> f22987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<g.a> f22988e;

        public a(b bVar) {
            this.f22984a = c0.F0(bVar.c());
            this.f22985b = c0.F0(bVar.e());
            this.f22986c = c0.F0(bVar.d());
            this.f22987d = c0.F0(bVar.b());
            this.f22988e = c0.F0(bVar.a());
        }

        public final a a(g.a aVar) {
            this.f22988e.add(aVar);
            return this;
        }

        public final <T> a b(i.a<T> aVar, Class<T> cls) {
            this.f22987d.add(x.a(aVar, cls));
            return this;
        }

        public final <T> a c(f6.b<T> bVar, Class<T> cls) {
            this.f22986c.add(x.a(bVar, cls));
            return this;
        }

        public final <T> a d(g6.d<T, ?> dVar, Class<T> cls) {
            this.f22985b.add(x.a(dVar, cls));
            return this;
        }

        public final b e() {
            return new b(o6.c.a(this.f22984a), o6.c.a(this.f22985b), o6.c.a(this.f22986c), o6.c.a(this.f22987d), o6.c.a(this.f22988e), null);
        }

        public final List<g.a> f() {
            return this.f22988e;
        }

        public final List<s<i.a<? extends Object>, Class<? extends Object>>> g() {
            return this.f22987d;
        }
    }

    public b() {
        this(u.m(), u.m(), u.m(), u.m(), u.m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(List<? extends e6.b> list, List<? extends s<? extends g6.d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends s<? extends f6.b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends s<? extends i.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends g.a> list5) {
        this.f22979a = list;
        this.f22980b = list2;
        this.f22981c = list3;
        this.f22982d = list4;
        this.f22983e = list5;
    }

    public /* synthetic */ b(List list, List list2, List list3, List list4, List list5, j jVar) {
        this(list, list2, list3, list4, list5);
    }

    public final List<g.a> a() {
        return this.f22983e;
    }

    public final List<s<i.a<? extends Object>, Class<? extends Object>>> b() {
        return this.f22982d;
    }

    public final List<e6.b> c() {
        return this.f22979a;
    }

    public final List<s<f6.b<? extends Object>, Class<? extends Object>>> d() {
        return this.f22981c;
    }

    public final List<s<g6.d<? extends Object, ? extends Object>, Class<? extends Object>>> e() {
        return this.f22980b;
    }

    public final String f(Object obj, m mVar) {
        List<s<f6.b<? extends Object>, Class<? extends Object>>> list = this.f22981c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            s<f6.b<? extends Object>, Class<? extends Object>> sVar = list.get(i10);
            f6.b<? extends Object> bVarA = sVar.a();
            if (sVar.b().isAssignableFrom(obj.getClass())) {
                r.d(bVarA, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String strA = bVarA.a(obj, mVar);
                if (strA != null) {
                    return strA;
                }
            }
        }
        return null;
    }

    public final Object g(Object obj, m mVar) {
        List<s<g6.d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f22980b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            s<g6.d<? extends Object, ? extends Object>, Class<? extends Object>> sVar = list.get(i10);
            g6.d<? extends Object, ? extends Object> dVarA = sVar.a();
            if (sVar.b().isAssignableFrom(obj.getClass())) {
                r.d(dVarA, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object objA = dVarA.a(obj, mVar);
                if (objA != null) {
                    obj = objA;
                }
            }
        }
        return obj;
    }

    public final a h() {
        return new a(this);
    }

    public final s<a6.g, Integer> i(d6.m mVar, m mVar2, e eVar, int i10) {
        int size = this.f22983e.size();
        while (i10 < size) {
            a6.g gVarA = this.f22983e.get(i10).a(mVar, mVar2, eVar);
            if (gVarA != null) {
                return x.a(gVarA, Integer.valueOf(i10));
            }
            i10++;
        }
        return null;
    }

    public final s<i, Integer> j(Object obj, m mVar, e eVar, int i10) {
        int size = this.f22982d.size();
        while (i10 < size) {
            s<i.a<? extends Object>, Class<? extends Object>> sVar = this.f22982d.get(i10);
            i.a<? extends Object> aVarA = sVar.a();
            if (sVar.b().isAssignableFrom(obj.getClass())) {
                r.d(aVarA, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                i iVarA = aVarA.a(obj, mVar, eVar);
                if (iVarA != null) {
                    return x.a(iVarA, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }
}
