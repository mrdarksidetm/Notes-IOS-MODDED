package n0;

import a2.a0;
import a2.n1;
import a2.o1;
import a2.q;
import ae.r;
import ae.s;
import androidx.compose.ui.e;
import g2.v;
import g2.x;
import i2.d0;
import i2.g0;
import i2.m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l1.b0;
import l1.j0;
import l1.m0;
import l1.s1;
import l1.z;
import md.i0;
import n2.t;
import t0.k1;
import t0.k3;
import w2.p;
import y1.f0;
import y1.n;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends e.c implements a0, q, n1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f15700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private g0 f15701o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private t.b f15702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f15703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f15704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f15705s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f15706t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private m0 f15707u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Map<y1.a, Integer> f15708v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private n0.f f15709w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private zd.l<? super List<d0>, Boolean> f15710x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final k1 f15711y;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f15713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f15714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n0.f f15715d;

        public a(String str, String str2, boolean z10, n0.f fVar) {
            this.f15712a = str;
            this.f15713b = str2;
            this.f15714c = z10;
            this.f15715d = fVar;
        }

        public /* synthetic */ a(String str, String str2, boolean z10, n0.f fVar, int i10, ae.j jVar) {
            this(str, str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : fVar);
        }

        public final n0.f a() {
            return this.f15715d;
        }

        public final String b() {
            return this.f15713b;
        }

        public final boolean c() {
            return this.f15714c;
        }

        public final void d(n0.f fVar) {
            this.f15715d = fVar;
        }

        public final void e(boolean z10) {
            this.f15714c = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return r.b(this.f15712a, aVar.f15712a) && r.b(this.f15713b, aVar.f15713b) && this.f15714c == aVar.f15714c && r.b(this.f15715d, aVar.f15715d);
        }

        public final void f(String str) {
            this.f15713b = str;
        }

        public int hashCode() {
            int iHashCode = ((((this.f15712a.hashCode() * 31) + this.f15713b.hashCode()) * 31) + Boolean.hashCode(this.f15714c)) * 31;
            n0.f fVar = this.f15715d;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + this.f15712a + ", substitution=" + this.f15713b + ", isShowingSubstitution=" + this.f15714c + ", layoutCache=" + this.f15715d + ')';
        }
    }

    static final class b extends s implements zd.l<List<d0>, Boolean> {
        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<d0> list) {
            n0.f fVarI2 = l.this.i2();
            g0 g0Var = l.this.f15701o;
            m0 m0Var = l.this.f15707u;
            d0 d0VarO = fVarI2.o(g0Var.L((16609104 & 1) != 0 ? j0.f14524b.j() : m0Var != null ? m0Var.a() : j0.f14524b.j(), (16609104 & 2) != 0 ? w2.t.f22428b.a() : 0L, (16609104 & 4) != 0 ? null : null, (16609104 & 8) != 0 ? null : null, (16609104 & 16) != 0 ? null : null, (16609104 & 32) != 0 ? null : null, (16609104 & 64) != 0 ? null : null, (16609104 & 128) != 0 ? w2.t.f22428b.a() : 0L, (16609104 & 256) != 0 ? null : null, (16609104 & 512) != 0 ? null : null, (16609104 & 1024) != 0 ? null : null, (16609104 & 2048) != 0 ? j0.f14524b.j() : 0L, (16609104 & 4096) != 0 ? null : null, (16609104 & 8192) != 0 ? null : null, (16609104 & 16384) != 0 ? null : null, (16609104 & 32768) != 0 ? u2.i.f21560b.g() : 0, (16609104 & 65536) != 0 ? u2.k.f21574b.f() : 0, (16609104 & 131072) != 0 ? w2.t.f22428b.a() : 0L, (16609104 & 262144) != 0 ? null : null, (16609104 & 524288) != 0 ? null : null, (16609104 & 1048576) != 0 ? u2.e.f21523a.b() : 0, (16609104 & 2097152) != 0 ? u2.d.f21519a.c() : 0, (16609104 & 4194304) != 0 ? null : null, (16609104 & 8388608) != 0 ? null : null));
            if (d0VarO != null) {
                list.add(d0VarO);
            } else {
                d0VarO = null;
            }
            return Boolean.valueOf(d0VarO != null);
        }
    }

    static final class c extends s implements zd.l<i2.d, Boolean> {
        c() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i2.d dVar) {
            l.this.l2(dVar.j());
            o1.b(l.this);
            return Boolean.TRUE;
        }
    }

    static final class d extends s implements zd.l<Boolean, Boolean> {
        d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            if (l.this.k2() == null) {
                return Boolean.FALSE;
            }
            a aVarK2 = l.this.k2();
            if (aVarK2 != null) {
                aVarK2.e(z10);
            }
            o1.b(l.this);
            a2.d0.b(l.this);
            a2.r.a(l.this);
            return Boolean.TRUE;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    static final class e extends s implements zd.a<Boolean> {
        e() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            l.this.g2();
            o1.b(l.this);
            a2.d0.b(l.this);
            a2.r.a(l.this);
            return Boolean.TRUE;
        }
    }

    static final class f extends s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f15720a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(t0 t0Var) {
            super(1);
            this.f15720a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.f(aVar, this.f15720a, 0, 0, 0.0f, 4, null);
        }
    }

    private l(String str, g0 g0Var, t.b bVar, int i10, boolean z10, int i11, int i12, m0 m0Var) {
        this.f15700n = str;
        this.f15701o = g0Var;
        this.f15702p = bVar;
        this.f15703q = i10;
        this.f15704r = z10;
        this.f15705s = i11;
        this.f15706t = i12;
        this.f15707u = m0Var;
        this.f15711y = k3.e(null, null, 2, null);
    }

    public /* synthetic */ l(String str, g0 g0Var, t.b bVar, int i10, boolean z10, int i11, int i12, m0 m0Var, ae.j jVar) {
        this(str, g0Var, bVar, i10, z10, i11, i12, m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2() {
        m2(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0.f i2() {
        if (this.f15709w == null) {
            this.f15709w = new n0.f(this.f15700n, this.f15701o, this.f15702p, this.f15703q, this.f15704r, this.f15705s, this.f15706t, null);
        }
        n0.f fVar = this.f15709w;
        r.c(fVar);
        return fVar;
    }

    private final n0.f j2(w2.d dVar) {
        n0.f fVarA;
        a aVarK2 = k2();
        if (aVarK2 != null && aVarK2.c() && (fVarA = aVarK2.a()) != null) {
            fVarA.m(dVar);
            return fVarA;
        }
        n0.f fVarI2 = i2();
        fVarI2.m(dVar);
        return fVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final a k2() {
        return (a) this.f15711y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l2(String str) {
        i0 i0Var;
        a aVarK2 = k2();
        if (aVarK2 == null) {
            a aVar = new a(this.f15700n, str, false, null, 12, null);
            n0.f fVar = new n0.f(str, this.f15701o, this.f15702p, this.f15703q, this.f15704r, this.f15705s, this.f15706t, null);
            fVar.m(i2().a());
            aVar.d(fVar);
            m2(aVar);
            return true;
        }
        if (r.b(str, aVarK2.b())) {
            return false;
        }
        aVarK2.f(str);
        n0.f fVarA = aVarK2.a();
        if (fVarA != null) {
            fVarA.p(str, this.f15701o, this.f15702p, this.f15703q, this.f15704r, this.f15705s, this.f15706t);
            i0Var = i0.f15558a;
        } else {
            i0Var = null;
        }
        return i0Var != null;
    }

    private final void m2(a aVar) {
        this.f15711y.setValue(aVar);
    }

    @Override // a2.q
    public void A(n1.c cVar) {
        if (H1()) {
            m mVarE = i2().e();
            if (mVarE == null) {
                throw new IllegalArgumentException("no paragraph".toString());
            }
            b0 b0VarD = cVar.M0().d();
            boolean zB = i2().b();
            if (zB) {
                k1.h hVarA = k1.i.a(k1.f.f14338b.c(), k1.m.a(p.g(i2().c()), p.f(i2().c())));
                b0VarD.h();
                b0.r(b0VarD, hVarA, 0, 2, null);
            }
            try {
                u2.j jVarC = this.f15701o.C();
                if (jVarC == null) {
                    jVarC = u2.j.f21569b.b();
                }
                u2.j jVar = jVarC;
                s1 s1VarZ = this.f15701o.z();
                if (s1VarZ == null) {
                    s1VarZ = s1.f14570d.a();
                }
                s1 s1Var = s1VarZ;
                n1.g gVarK = this.f15701o.k();
                if (gVarK == null) {
                    gVarK = n1.j.f15736a;
                }
                n1.g gVar = gVarK;
                z zVarI = this.f15701o.i();
                if (zVarI != null) {
                    m.u(mVarE, b0VarD, zVarI, this.f15701o.f(), s1Var, jVar, gVar, 0, 64, null);
                } else {
                    m0 m0Var = this.f15707u;
                    long jA = m0Var != null ? m0Var.a() : j0.f14524b.j();
                    j0.a aVar = j0.f14524b;
                    if (!(jA != aVar.j())) {
                        jA = this.f15701o.j() != aVar.j() ? this.f15701o.j() : aVar.a();
                    }
                    m.b(mVarE, b0VarD, jA, s1Var, jVar, gVar, 0, 32, null);
                }
            } finally {
                if (zB) {
                    b0VarD.p();
                }
            }
        }
    }

    @Override // a2.n1
    public void U(x xVar) {
        zd.l bVar = this.f15710x;
        if (bVar == null) {
            bVar = new b();
            this.f15710x = bVar;
        }
        v.C(xVar, new i2.d(this.f15700n, null, null, 6, null));
        a aVarK2 = k2();
        if (aVarK2 != null) {
            v.A(xVar, aVarK2.c());
            v.D(xVar, new i2.d(aVarK2.b(), null, null, 6, null));
        }
        v.F(xVar, null, new c(), 1, null);
        v.J(xVar, null, new d(), 1, null);
        v.d(xVar, null, new e(), 1, null);
        v.h(xVar, null, bVar, 1, null);
    }

    @Override // a2.a0
    public f0 d(y1.g0 g0Var, y1.d0 d0Var, long j10) {
        n0.f fVarJ2 = j2(g0Var);
        boolean zH = fVarJ2.h(j10, g0Var.getLayoutDirection());
        fVarJ2.d();
        m mVarE = fVarJ2.e();
        r.c(mVarE);
        long jC = fVarJ2.c();
        if (zH) {
            a2.d0.a(this);
            Map<y1.a, Integer> linkedHashMap = this.f15708v;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(2);
            }
            linkedHashMap.put(y1.b.a(), Integer.valueOf(ce.c.d(mVarE.i())));
            linkedHashMap.put(y1.b.b(), Integer.valueOf(ce.c.d(mVarE.f())));
            this.f15708v = linkedHashMap;
        }
        t0 t0VarI = d0Var.I(n0.b.d(w2.b.f22395b, p.g(jC), p.f(jC)));
        int iG = p.g(jC);
        int iF = p.f(jC);
        Map<y1.a, Integer> map = this.f15708v;
        r.c(map);
        return g0Var.J0(iG, iF, map, new f(t0VarI));
    }

    public final void h2(boolean z10, boolean z11, boolean z12) {
        if (H1()) {
            if (z11 || (z10 && this.f15710x != null)) {
                o1.b(this);
            }
            if (z11 || z12) {
                i2().p(this.f15700n, this.f15701o, this.f15702p, this.f15703q, this.f15704r, this.f15705s, this.f15706t);
                a2.d0.b(this);
                a2.r.a(this);
            }
            if (z10) {
                a2.r.a(this);
            }
        }
    }

    @Override // a2.a0
    public int j(n nVar, y1.m mVar, int i10) {
        return j2(nVar).f(i10, nVar.getLayoutDirection());
    }

    @Override // a2.a0
    public int k(n nVar, y1.m mVar, int i10) {
        return j2(nVar).k(nVar.getLayoutDirection());
    }

    public final boolean n2(m0 m0Var, g0 g0Var) {
        boolean z10 = !r.b(m0Var, this.f15707u);
        this.f15707u = m0Var;
        return z10 || !g0Var.H(this.f15701o);
    }

    public final boolean o2(g0 g0Var, int i10, int i11, boolean z10, t.b bVar, int i12) {
        boolean z11 = !this.f15701o.I(g0Var);
        this.f15701o = g0Var;
        if (this.f15706t != i10) {
            this.f15706t = i10;
            z11 = true;
        }
        if (this.f15705s != i11) {
            this.f15705s = i11;
            z11 = true;
        }
        if (this.f15704r != z10) {
            this.f15704r = z10;
            z11 = true;
        }
        if (!r.b(this.f15702p, bVar)) {
            this.f15702p = bVar;
            z11 = true;
        }
        if (u2.q.e(this.f15703q, i12)) {
            return z11;
        }
        this.f15703q = i12;
        return true;
    }

    public final boolean p2(String str) {
        if (r.b(this.f15700n, str)) {
            return false;
        }
        this.f15700n = str;
        g2();
        return true;
    }

    @Override // a2.a0
    public int v(n nVar, y1.m mVar, int i10) {
        return j2(nVar).j(nVar.getLayoutDirection());
    }

    @Override // a2.a0
    public int x(n nVar, y1.m mVar, int i10) {
        return j2(nVar).f(i10, nVar.getLayoutDirection());
    }
}
