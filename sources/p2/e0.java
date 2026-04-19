package p2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f18112d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c1.j<e0, Object> f18113e = c1.k.a(a.f18117a, b.f18118a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i2.d f18114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i2.e0 f18116c;

    static final class a extends ae.s implements zd.p<c1.l, e0, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18117a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, e0 e0Var) {
            return nd.u.g(i2.z.v(e0Var.a(), i2.z.f(), lVar), i2.z.v(i2.e0.b(e0Var.c()), i2.z.h(i2.e0.f12353b), lVar));
        }
    }

    static final class b extends ae.s implements zd.l<Object, e0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f18118a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            c1.j<i2.d, Object> jVarF = i2.z.f();
            Boolean bool = Boolean.FALSE;
            i2.e0 e0VarB = null;
            i2.d dVarB = ((!ae.r.b(obj2, bool) || (jVarF instanceof i2.l)) && obj2 != null) ? jVarF.b(obj2) : null;
            ae.r.c(dVarB);
            Object obj3 = list.get(1);
            c1.j<i2.e0, Object> jVarH = i2.z.h(i2.e0.f12353b);
            if ((!ae.r.b(obj3, bool) || (jVarH instanceof i2.l)) && obj3 != null) {
                e0VarB = jVarH.b(obj3);
            }
            ae.r.c(e0VarB);
            return new e0(dVarB, e0VarB.n(), (i2.e0) null, 4, (ae.j) null);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(ae.j jVar) {
            this();
        }
    }

    private e0(i2.d dVar, long j10, i2.e0 e0Var) {
        this.f18114a = dVar;
        this.f18115b = i2.f0.c(j10, 0, d().length());
        this.f18116c = e0Var != null ? i2.e0.b(i2.f0.c(e0Var.n(), 0, d().length())) : null;
    }

    public /* synthetic */ e0(i2.d dVar, long j10, i2.e0 e0Var, int i10, ae.j jVar) {
        this(dVar, (i10 & 2) != 0 ? i2.e0.f12353b.a() : j10, (i10 & 4) != 0 ? null : e0Var, (ae.j) null);
    }

    public /* synthetic */ e0(i2.d dVar, long j10, i2.e0 e0Var, ae.j jVar) {
        this(dVar, j10, e0Var);
    }

    private e0(String str, long j10, i2.e0 e0Var) {
        this(new i2.d(str, null, null, 6, null), j10, e0Var, (ae.j) null);
    }

    public /* synthetic */ e0(String str, long j10, i2.e0 e0Var, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? i2.e0.f12353b.a() : j10, (i10 & 4) != 0 ? null : e0Var, (ae.j) null);
    }

    public /* synthetic */ e0(String str, long j10, i2.e0 e0Var, ae.j jVar) {
        this(str, j10, e0Var);
    }

    public final i2.d a() {
        return this.f18114a;
    }

    public final i2.e0 b() {
        return this.f18116c;
    }

    public final long c() {
        return this.f18115b;
    }

    public final String d() {
        return this.f18114a.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return i2.e0.e(this.f18115b, e0Var.f18115b) && ae.r.b(this.f18116c, e0Var.f18116c) && ae.r.b(this.f18114a, e0Var.f18114a);
    }

    public int hashCode() {
        int iHashCode = ((this.f18114a.hashCode() * 31) + i2.e0.l(this.f18115b)) * 31;
        i2.e0 e0Var = this.f18116c;
        return iHashCode + (e0Var != null ? i2.e0.l(e0Var.n()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f18114a) + "', selection=" + ((Object) i2.e0.m(this.f18115b)) + ", composition=" + this.f18116c + ')';
    }
}
