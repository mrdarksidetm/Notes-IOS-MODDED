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
import i2.d;
import i2.d0;
import i2.g0;
import i2.u;
import java.util.List;
import java.util.Map;
import k1.m;
import l1.b0;
import l1.j0;
import l1.m0;
import l1.s1;
import l1.z;
import md.i0;
import n2.t;
import nd.r0;
import t0.k1;
import t0.k3;
import w2.p;
import y1.f0;
import y1.n;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends e.c implements a0, q, n1 {
    private n0.e A;
    private zd.l<? super List<d0>, Boolean> B;
    private final k1 C;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i2.d f15678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private g0 f15679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private t.b f15680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private zd.l<? super d0, i0> f15681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f15682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f15683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f15684t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f15685u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<d.b<u>> f15686v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private zd.l<? super List<k1.h>, i0> f15687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private h f15688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private m0 f15689y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Map<y1.a, Integer> f15690z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i2.d f15691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i2.d f15692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f15693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n0.e f15694d;

        public a(i2.d dVar, i2.d dVar2, boolean z10, n0.e eVar) {
            this.f15691a = dVar;
            this.f15692b = dVar2;
            this.f15693c = z10;
            this.f15694d = eVar;
        }

        public /* synthetic */ a(i2.d dVar, i2.d dVar2, boolean z10, n0.e eVar, int i10, ae.j jVar) {
            this(dVar, dVar2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : eVar);
        }

        public final n0.e a() {
            return this.f15694d;
        }

        public final i2.d b() {
            return this.f15692b;
        }

        public final boolean c() {
            return this.f15693c;
        }

        public final void d(n0.e eVar) {
            this.f15694d = eVar;
        }

        public final void e(boolean z10) {
            this.f15693c = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return r.b(this.f15691a, aVar.f15691a) && r.b(this.f15692b, aVar.f15692b) && this.f15693c == aVar.f15693c && r.b(this.f15694d, aVar.f15694d);
        }

        public final void f(i2.d dVar) {
            this.f15692b = dVar;
        }

        public int hashCode() {
            int iHashCode = ((((this.f15691a.hashCode() * 31) + this.f15692b.hashCode()) * 31) + Boolean.hashCode(this.f15693c)) * 31;
            n0.e eVar = this.f15694d;
            return iHashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.f15691a) + ", substitution=" + ((Object) this.f15692b) + ", isShowingSubstitution=" + this.f15693c + ", layoutCache=" + this.f15694d + ')';
        }
    }

    static final class b extends s implements zd.l<List<d0>, Boolean> {
        b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00b8  */
        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(java.util.List<i2.d0> r38) {
            /*
                r37 = this;
                r0 = r37
                n0.k r1 = n0.k.this
                n0.e r1 = n0.k.b2(r1)
                i2.d0 r2 = r1.b()
                if (r2 == 0) goto Lb8
                i2.c0 r1 = new i2.c0
                i2.c0 r3 = r2.k()
                i2.d r4 = r3.j()
                n0.k r3 = n0.k.this
                i2.g0 r5 = n0.k.d2(r3)
                n0.k r3 = n0.k.this
                l1.m0 r3 = n0.k.c2(r3)
                if (r3 == 0) goto L2b
                long r6 = r3.a()
                goto L31
            L2b:
                l1.j0$a r3 = l1.j0.f14524b
                long r6 = r3.j()
            L31:
                r8 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r35 = 16777214(0xfffffe, float:2.3509884E-38)
                r36 = 0
                i2.g0 r5 = i2.g0.M(r5, r6, r8, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36)
                i2.c0 r3 = r2.k()
                java.util.List r6 = r3.g()
                i2.c0 r3 = r2.k()
                int r7 = r3.e()
                i2.c0 r3 = r2.k()
                boolean r8 = r3.h()
                i2.c0 r3 = r2.k()
                int r9 = r3.f()
                i2.c0 r3 = r2.k()
                w2.d r10 = r3.b()
                i2.c0 r3 = r2.k()
                w2.r r11 = r3.d()
                i2.c0 r3 = r2.k()
                n2.t$b r12 = r3.c()
                i2.c0 r3 = r2.k()
                long r13 = r3.a()
                r15 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
                r4 = 0
                r6 = 2
                r7 = 0
                i2.d0 r1 = i2.d0.b(r2, r3, r4, r6, r7)
                if (r1 == 0) goto Lb8
                r2 = r38
                r2.add(r1)
                goto Lb9
            Lb8:
                r1 = 0
            Lb9:
                if (r1 == 0) goto Lbd
                r1 = 1
                goto Lbe
            Lbd:
                r1 = 0
            Lbe:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: n0.k.b.invoke(java.util.List):java.lang.Boolean");
        }
    }

    static final class c extends s implements zd.l<i2.d, Boolean> {
        c() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i2.d dVar) {
            k.this.r2(dVar);
            o1.b(k.this);
            return Boolean.TRUE;
        }
    }

    static final class d extends s implements zd.l<Boolean, Boolean> {
        d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            if (k.this.l2() == null) {
                return Boolean.FALSE;
            }
            a aVarL2 = k.this.l2();
            if (aVarL2 != null) {
                aVarL2.e(z10);
            }
            o1.b(k.this);
            a2.d0.b(k.this);
            a2.r.a(k.this);
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
            k.this.g2();
            o1.b(k.this);
            a2.d0.b(k.this);
            a2.r.a(k.this);
            return Boolean.TRUE;
        }
    }

    static final class f extends s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f15699a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(t0 t0Var) {
            super(1);
            this.f15699a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.f(aVar, this.f15699a, 0, 0, 0.0f, 4, null);
        }
    }

    private k(i2.d dVar, g0 g0Var, t.b bVar, zd.l<? super d0, i0> lVar, int i10, boolean z10, int i11, int i12, List<d.b<u>> list, zd.l<? super List<k1.h>, i0> lVar2, h hVar, m0 m0Var) {
        this.f15678n = dVar;
        this.f15679o = g0Var;
        this.f15680p = bVar;
        this.f15681q = lVar;
        this.f15682r = i10;
        this.f15683s = z10;
        this.f15684t = i11;
        this.f15685u = i12;
        this.f15686v = list;
        this.f15687w = lVar2;
        this.f15688x = hVar;
        this.f15689y = m0Var;
        this.C = k3.e(null, null, 2, null);
    }

    public /* synthetic */ k(i2.d dVar, g0 g0Var, t.b bVar, zd.l lVar, int i10, boolean z10, int i11, int i12, List list, zd.l lVar2, h hVar, m0 m0Var, ae.j jVar) {
        this(dVar, g0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, hVar, m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2() {
        s2(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0.e j2() {
        if (this.A == null) {
            this.A = new n0.e(this.f15678n, this.f15679o, this.f15680p, this.f15682r, this.f15683s, this.f15684t, this.f15685u, this.f15686v, null);
        }
        n0.e eVar = this.A;
        r.c(eVar);
        return eVar;
    }

    private final n0.e k2(w2.d dVar) {
        n0.e eVarA;
        a aVarL2 = l2();
        if (aVarL2 != null && aVarL2.c() && (eVarA = aVarL2.a()) != null) {
            eVarA.k(dVar);
            return eVarA;
        }
        n0.e eVarJ2 = j2();
        eVarJ2.k(dVar);
        return eVarJ2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final a l2() {
        return (a) this.C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r2(i2.d dVar) {
        i0 i0Var;
        a aVarL2 = l2();
        if (aVarL2 == null) {
            a aVar = new a(this.f15678n, dVar, false, null, 12, null);
            n0.e eVar = new n0.e(dVar, this.f15679o, this.f15680p, this.f15682r, this.f15683s, this.f15684t, this.f15685u, this.f15686v, null);
            eVar.k(j2().a());
            aVar.d(eVar);
            s2(aVar);
            return true;
        }
        if (r.b(dVar, aVarL2.b())) {
            return false;
        }
        aVarL2.f(dVar);
        n0.e eVarA = aVarL2.a();
        if (eVarA != null) {
            eVarA.n(dVar, this.f15679o, this.f15680p, this.f15682r, this.f15683s, this.f15684t, this.f15685u, this.f15686v);
            i0Var = i0.f15558a;
        } else {
            i0Var = null;
        }
        return i0Var != null;
    }

    private final void s2(a aVar) {
        this.C.setValue(aVar);
    }

    @Override // a2.q
    public void A(n1.c cVar) {
        if (H1()) {
            h hVar = this.f15688x;
            if (hVar != null) {
                hVar.e(cVar);
            }
            b0 b0VarD = cVar.M0().d();
            d0 d0VarC = k2(cVar).c();
            i2.h hVarV = d0VarC.v();
            boolean z10 = true;
            boolean z11 = d0VarC.i() && !u2.q.e(this.f15682r, u2.q.f21604a.c());
            if (z11) {
                k1.h hVarA = k1.i.a(k1.f.f14338b.c(), m.a(p.g(d0VarC.z()), p.f(d0VarC.z())));
                b0VarD.h();
                b0.r(b0VarD, hVarA, 0, 2, null);
            }
            try {
                u2.j jVarC = this.f15679o.C();
                if (jVarC == null) {
                    jVarC = u2.j.f21569b.b();
                }
                u2.j jVar = jVarC;
                s1 s1VarZ = this.f15679o.z();
                if (s1VarZ == null) {
                    s1VarZ = s1.f14570d.a();
                }
                s1 s1Var = s1VarZ;
                n1.g gVarK = this.f15679o.k();
                if (gVarK == null) {
                    gVarK = n1.j.f15736a;
                }
                n1.g gVar = gVarK;
                z zVarI = this.f15679o.i();
                if (zVarI != null) {
                    hVarV.A(b0VarD, zVarI, (64 & 4) != 0 ? Float.NaN : this.f15679o.f(), (64 & 8) != 0 ? null : s1Var, (64 & 16) != 0 ? null : jVar, (64 & 32) != 0 ? null : gVar, (64 & 64) != 0 ? n1.f.S.a() : 0);
                } else {
                    m0 m0Var = this.f15689y;
                    long jA = m0Var != null ? m0Var.a() : j0.f14524b.j();
                    j0.a aVar = j0.f14524b;
                    if (!(jA != aVar.j())) {
                        jA = (this.f15679o.j() > aVar.j() ? 1 : (this.f15679o.j() == aVar.j() ? 0 : -1)) != 0 ? this.f15679o.j() : aVar.a();
                    }
                    hVarV.y(b0VarD, (32 & 2) != 0 ? j0.f14524b.j() : jA, (32 & 4) != 0 ? null : s1Var, (32 & 8) != 0 ? null : jVar, (32 & 16) == 0 ? gVar : null, (32 & 32) != 0 ? n1.f.S.a() : 0);
                }
                List<d.b<u>> list = this.f15686v;
                if (list != null && !list.isEmpty()) {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                cVar.u1();
            } finally {
                if (z11) {
                    b0VarD.p();
                }
            }
        }
    }

    @Override // a2.n1
    public void U(x xVar) {
        zd.l bVar = this.B;
        if (bVar == null) {
            bVar = new b();
            this.B = bVar;
        }
        v.C(xVar, this.f15678n);
        a aVarL2 = l2();
        if (aVarL2 != null) {
            v.D(xVar, aVarL2.b());
            v.A(xVar, aVarL2.c());
        }
        v.F(xVar, null, new c(), 1, null);
        v.J(xVar, null, new d(), 1, null);
        v.d(xVar, null, new e(), 1, null);
        v.h(xVar, null, bVar, 1, null);
    }

    @Override // a2.a0
    public f0 d(y1.g0 g0Var, y1.d0 d0Var, long j10) {
        n0.e eVarK2 = k2(g0Var);
        boolean zF = eVarK2.f(j10, g0Var.getLayoutDirection());
        d0 d0VarC = eVarK2.c();
        d0VarC.v().i().b();
        if (zF) {
            a2.d0.a(this);
            zd.l<? super d0, i0> lVar = this.f15681q;
            if (lVar != null) {
                lVar.invoke(d0VarC);
            }
            h hVar = this.f15688x;
            if (hVar != null) {
                hVar.h(d0VarC);
            }
            this.f15690z = r0.h(md.x.a(y1.b.a(), Integer.valueOf(ce.c.d(d0VarC.h()))), md.x.a(y1.b.b(), Integer.valueOf(ce.c.d(d0VarC.j()))));
        }
        zd.l<? super List<k1.h>, i0> lVar2 = this.f15687w;
        if (lVar2 != null) {
            lVar2.invoke(d0VarC.y());
        }
        t0 t0VarI = d0Var.I(n0.b.d(w2.b.f22395b, p.g(d0VarC.z()), p.f(d0VarC.z())));
        int iG = p.g(d0VarC.z());
        int iF = p.f(d0VarC.z());
        Map<y1.a, Integer> map = this.f15690z;
        r.c(map);
        return g0Var.J0(iG, iF, map, new f(t0VarI));
    }

    public final void h2(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (H1()) {
            if (z11 || (z10 && this.B != null)) {
                o1.b(this);
            }
            if (z11 || z12 || z13) {
                j2().n(this.f15678n, this.f15679o, this.f15680p, this.f15682r, this.f15683s, this.f15684t, this.f15685u, this.f15686v);
                a2.d0.b(this);
                a2.r.a(this);
            }
            if (z10) {
                a2.r.a(this);
            }
        }
    }

    public final void i2(n1.c cVar) {
        A(cVar);
    }

    @Override // a2.a0
    public int j(n nVar, y1.m mVar, int i10) {
        return k2(nVar).d(i10, nVar.getLayoutDirection());
    }

    @Override // a2.a0
    public int k(n nVar, y1.m mVar, int i10) {
        return k2(nVar).i(nVar.getLayoutDirection());
    }

    public final int m2(n nVar, y1.m mVar, int i10) {
        return x(nVar, mVar, i10);
    }

    public final int n2(n nVar, y1.m mVar, int i10) {
        return v(nVar, mVar, i10);
    }

    public final f0 o2(y1.g0 g0Var, y1.d0 d0Var, long j10) {
        return d(g0Var, d0Var, j10);
    }

    public final int p2(n nVar, y1.m mVar, int i10) {
        return j(nVar, mVar, i10);
    }

    public final int q2(n nVar, y1.m mVar, int i10) {
        return k(nVar, mVar, i10);
    }

    public final boolean t2(zd.l<? super d0, i0> lVar, zd.l<? super List<k1.h>, i0> lVar2, h hVar) {
        boolean z10;
        if (r.b(this.f15681q, lVar)) {
            z10 = false;
        } else {
            this.f15681q = lVar;
            z10 = true;
        }
        if (!r.b(this.f15687w, lVar2)) {
            this.f15687w = lVar2;
            z10 = true;
        }
        if (r.b(this.f15688x, hVar)) {
            return z10;
        }
        this.f15688x = hVar;
        return true;
    }

    public final boolean u2(m0 m0Var, g0 g0Var) {
        boolean z10 = !r.b(m0Var, this.f15689y);
        this.f15689y = m0Var;
        return z10 || !g0Var.H(this.f15679o);
    }

    @Override // a2.a0
    public int v(n nVar, y1.m mVar, int i10) {
        return k2(nVar).h(nVar.getLayoutDirection());
    }

    public final boolean v2(g0 g0Var, List<d.b<u>> list, int i10, int i11, boolean z10, t.b bVar, int i12) {
        boolean z11 = !this.f15679o.I(g0Var);
        this.f15679o = g0Var;
        if (!r.b(this.f15686v, list)) {
            this.f15686v = list;
            z11 = true;
        }
        if (this.f15685u != i10) {
            this.f15685u = i10;
            z11 = true;
        }
        if (this.f15684t != i11) {
            this.f15684t = i11;
            z11 = true;
        }
        if (this.f15683s != z10) {
            this.f15683s = z10;
            z11 = true;
        }
        if (!r.b(this.f15680p, bVar)) {
            this.f15680p = bVar;
            z11 = true;
        }
        if (u2.q.e(this.f15682r, i12)) {
            return z11;
        }
        this.f15682r = i12;
        return true;
    }

    public final boolean w2(i2.d dVar) {
        if (r.b(this.f15678n, dVar)) {
            return false;
        }
        this.f15678n = dVar;
        g2();
        return true;
    }

    @Override // a2.a0
    public int x(n nVar, y1.m mVar, int i10) {
        return k2(nVar).d(i10, nVar.getLayoutDirection());
    }
}
