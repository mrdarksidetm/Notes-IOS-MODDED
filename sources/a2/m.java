package a2;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final md.l f236b = md.n.a(md.p.f15571c, b.f239a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Comparator<f0> f237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u1<f0> f238d;

    public static final class a implements Comparator<f0> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f0 f0Var, f0 f0Var2) {
            int iG = ae.r.g(f0Var.J(), f0Var2.J());
            return iG != 0 ? iG : ae.r.g(f0Var.hashCode(), f0Var2.hashCode());
        }
    }

    static final class b extends ae.s implements zd.a<Map<f0, Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f239a = new b();

        b() {
            super(0);
        }

        @Override // zd.a
        public final Map<f0, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    public m(boolean z10) {
        this.f235a = z10;
        a aVar = new a();
        this.f237c = aVar;
        this.f238d = new u1<>(aVar);
    }

    private final Map<f0, Integer> c() {
        return (Map) this.f236b.getValue();
    }

    public final void a(f0 f0Var) {
        if (!f0Var.G0()) {
            throw new IllegalStateException("DepthSortedSet.add called on an unattached node".toString());
        }
        if (this.f235a) {
            Integer num = c().get(f0Var);
            if (num == null) {
                c().put(f0Var, Integer.valueOf(f0Var.J()));
            } else {
                if (!(num.intValue() == f0Var.J())) {
                    throw new IllegalStateException("invalid node depth".toString());
                }
            }
        }
        this.f238d.add(f0Var);
    }

    public final boolean b(f0 f0Var) {
        boolean zContains = this.f238d.contains(f0Var);
        if (this.f235a) {
            if (!(zContains == c().containsKey(f0Var))) {
                throw new IllegalStateException("inconsistency in TreeSet".toString());
            }
        }
        return zContains;
    }

    public final boolean d() {
        return this.f238d.isEmpty();
    }

    public final f0 e() {
        f0 f0VarFirst = this.f238d.first();
        f(f0VarFirst);
        return f0VarFirst;
    }

    public final boolean f(f0 f0Var) {
        if (!f0Var.G0()) {
            throw new IllegalStateException("DepthSortedSet.remove called on an unattached node".toString());
        }
        boolean zRemove = this.f238d.remove(f0Var);
        if (this.f235a) {
            if (!ae.r.b(c().remove(f0Var), zRemove ? Integer.valueOf(f0Var.J()) : null)) {
                throw new IllegalStateException("invalid node depth".toString());
            }
        }
        return zRemove;
    }

    public String toString() {
        return this.f238d.toString();
    }
}
