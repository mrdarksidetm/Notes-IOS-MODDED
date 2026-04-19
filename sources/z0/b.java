package z0;

import ae.j;
import ae.r;
import java.util.Iterator;
import nd.i;
import w0.g;
import y0.d;

/* JADX INFO: loaded from: classes.dex */
public final class b<E> extends i<E> implements g<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f24121e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24122f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f24123g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f24124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f24125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d<E, z0.a> f24126d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final <E> g<E> a() {
            return b.f24123g;
        }
    }

    static {
        a1.c cVar = a1.c.f19a;
        f24123g = new b(cVar, cVar, d.f23156d.a());
    }

    public b(Object obj, Object obj2, d<E, z0.a> dVar) {
        this.f24124b = obj;
        this.f24125c = obj2;
        this.f24126d = dVar;
    }

    @Override // nd.a
    public int a() {
        return this.f24126d.size();
    }

    @Override // java.util.Collection, java.util.Set, w0.g
    public g<E> add(E e10) {
        if (this.f24126d.containsKey(e10)) {
            return this;
        }
        if (isEmpty()) {
            return new b(e10, e10, this.f24126d.t(e10, new z0.a()));
        }
        Object obj = this.f24125c;
        z0.a aVar = this.f24126d.get((E) obj);
        r.c(aVar);
        return new b(this.f24124b, e10, this.f24126d.t((E) obj, aVar.e(e10)).t(e10, new z0.a(obj)));
    }

    @Override // nd.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f24126d.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new c(this.f24124b, this.f24126d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, w0.g
    public g<E> remove(E e10) {
        z0.a aVar = this.f24126d.get(e10);
        if (aVar == null) {
            return this;
        }
        d dVarU = this.f24126d.u(e10);
        if (aVar.b()) {
            V v10 = dVarU.get(aVar.d());
            r.c(v10);
            dVarU = dVarU.t(aVar.d(), ((z0.a) v10).e(aVar.c()));
        }
        if (aVar.a()) {
            V v11 = dVarU.get(aVar.c());
            r.c(v11);
            dVarU = dVarU.t(aVar.c(), ((z0.a) v11).f(aVar.d()));
        }
        return new b(!aVar.b() ? aVar.c() : this.f24124b, !aVar.a() ? aVar.d() : this.f24125c, dVarU);
    }
}
