package t0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import t0.p0;
import t0.u1;

/* JADX INFO: loaded from: classes.dex */
public final class m implements l {
    private int B;
    private int C;
    private boolean D;
    private boolean G;
    private boolean H;
    private r2 I;
    private s2 J;
    private v2 K;
    private boolean L;
    private u1 M;
    private u0.a N;
    private final u0.b O;
    private t0.d P;
    private u0.c Q;
    private boolean R;
    private int S;
    private boolean T;
    private final r0 U;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.e<?> f20822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f20823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s2 f20824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<k2> f20825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u0.a f20826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u0.a f20827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f20828h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t1 f20830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20831k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20833m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f20835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private z.p f20836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f20837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f20838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f20839s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private v0.c<u1> f20843w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f20844x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f20846z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o3<t1> f20829i = new o3<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r0 f20832l = new r0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private r0 f20834n = new r0();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<t0> f20840t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final r0 f20841u = new r0();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private u1 f20842v = b1.f.a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final r0 f20845y = new r0();
    private int A = -1;
    private final c E = new c();
    private final o3<d2> F = new o3<>();

    private static final class a implements n2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f20847a;

        public a(b bVar) {
            this.f20847a = bVar;
        }

        public final b a() {
            return this.f20847a;
        }

        @Override // t0.k2
        public void b() {
            this.f20847a.t();
        }

        @Override // t0.k2
        public void c() {
            this.f20847a.t();
        }

        @Override // t0.k2
        public void d() {
        }
    }

    private final class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f20848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f20849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f20850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final y f20851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set<Set<e1.a>> f20852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Set<m> f20853f = new LinkedHashSet();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final k1 f20854g = f3.i(b1.f.a(), f3.n());

        public b(int i10, boolean z10, boolean z11, y yVar) {
            this.f20848a = i10;
            this.f20849b = z10;
            this.f20850c = z11;
            this.f20851d = yVar;
        }

        private final u1 v() {
            return (u1) this.f20854g.getValue();
        }

        private final void w(u1 u1Var) {
            this.f20854g.setValue(u1Var);
        }

        @Override // t0.q
        public void a(c0 c0Var, zd.p<? super l, ? super Integer, md.i0> pVar) {
            m.this.f20823c.a(c0Var, pVar);
        }

        @Override // t0.q
        public void b(g1 g1Var) {
            m.this.f20823c.b(g1Var);
        }

        @Override // t0.q
        public void c() {
            m mVar = m.this;
            mVar.B--;
        }

        @Override // t0.q
        public boolean d() {
            return this.f20849b;
        }

        @Override // t0.q
        public boolean e() {
            return this.f20850c;
        }

        @Override // t0.q
        public u1 f() {
            return v();
        }

        @Override // t0.q
        public int g() {
            return this.f20848a;
        }

        @Override // t0.q
        public qd.g h() {
            return m.this.f20823c.h();
        }

        @Override // t0.q
        public y i() {
            return this.f20851d;
        }

        @Override // t0.q
        public void j(g1 g1Var) {
            m.this.f20823c.j(g1Var);
        }

        @Override // t0.q
        public void k(c0 c0Var) {
            m.this.f20823c.k(m.this.y0());
            m.this.f20823c.k(c0Var);
        }

        @Override // t0.q
        public void l(g1 g1Var, f1 f1Var) {
            m.this.f20823c.l(g1Var, f1Var);
        }

        @Override // t0.q
        public f1 m(g1 g1Var) {
            return m.this.f20823c.m(g1Var);
        }

        @Override // t0.q
        public void n(Set<e1.a> set) {
            Set hashSet = this.f20852e;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f20852e = hashSet;
            }
            hashSet.add(set);
        }

        @Override // t0.q
        public void o(l lVar) {
            ae.r.d(lVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.o((m) lVar);
            this.f20853f.add(lVar);
        }

        @Override // t0.q
        public void p(c0 c0Var) {
            m.this.f20823c.p(c0Var);
        }

        @Override // t0.q
        public void q() {
            m.this.B++;
        }

        @Override // t0.q
        public void r(l lVar) {
            Set<Set<e1.a>> set = this.f20852e;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    ae.r.d(lVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((m) lVar).f20824d);
                }
            }
            ae.n0.a(this.f20853f).remove(lVar);
        }

        @Override // t0.q
        public void s(c0 c0Var) {
            m.this.f20823c.s(c0Var);
        }

        public final void t() {
            if (!this.f20853f.isEmpty()) {
                Set<Set<e1.a>> set = this.f20852e;
                if (set != null) {
                    for (m mVar : this.f20853f) {
                        Iterator<Set<e1.a>> it = set.iterator();
                        while (it.hasNext()) {
                            it.next().remove(mVar.f20824d);
                        }
                    }
                }
                this.f20853f.clear();
            }
        }

        public final Set<m> u() {
            return this.f20853f;
        }

        public final void x(u1 u1Var) {
            w(u1Var);
        }
    }

    public static final class c implements g0 {
        c() {
        }

        @Override // t0.g0
        public void a(f0<?> f0Var) {
            m.this.B++;
        }

        @Override // t0.g0
        public void b(f0<?> f0Var) {
            m mVar = m.this;
            mVar.B--;
        }
    }

    static final class d extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0.a f20858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r2 f20859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g1 f20860d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(u0.a aVar, r2 r2Var, g1 g1Var) {
            super(0);
            this.f20858b = aVar;
            this.f20859c = r2Var;
            this.f20860d = g1Var;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            u0.b bVar = m.this.O;
            u0.a aVar = this.f20858b;
            m mVar = m.this;
            r2 r2Var = this.f20859c;
            g1 g1Var = this.f20860d;
            u0.a aVarN = bVar.n();
            try {
                bVar.R(aVar);
                r2 r2VarC0 = mVar.C0();
                int[] iArr = mVar.f20835o;
                v0.c cVar = mVar.f20843w;
                mVar.f20835o = null;
                mVar.f20843w = null;
                try {
                    mVar.Z0(r2Var);
                    u0.b bVar2 = mVar.O;
                    boolean zO = bVar2.o();
                    try {
                        bVar2.S(false);
                        mVar.H0(g1Var.c(), g1Var.e(), g1Var.f(), true);
                        bVar2.S(zO);
                        md.i0 i0Var = md.i0.f15558a;
                    } catch (Throwable th) {
                        bVar2.S(zO);
                        throw th;
                    }
                } finally {
                    mVar.Z0(r2VarC0);
                    mVar.f20835o = iArr;
                    mVar.f20843w = cVar;
                }
            } finally {
                bVar.R(aVarN);
            }
        }
    }

    static final class e extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g1 f20862b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g1 g1Var) {
            super(0);
            this.f20862b = g1Var;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            m.this.H0(this.f20862b.c(), this.f20862b.e(), this.f20862b.f(), true);
        }
    }

    static final class f extends ae.s implements zd.p<l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e1<Object> f20863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f20864b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(e1<Object> e1Var, Object obj) {
            super(2);
            this.f20863a = e1Var;
            this.f20864b = obj;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (o.I()) {
                o.U(316014703, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3004)");
            }
            this.f20863a.a().invoke(this.f20864b, lVar, 8);
            if (o.I()) {
                o.T();
            }
        }
    }

    public m(t0.e<?> eVar, q qVar, s2 s2Var, Set<k2> set, u0.a aVar, u0.a aVar2, c0 c0Var) {
        this.f20822b = eVar;
        this.f20823c = qVar;
        this.f20824d = s2Var;
        this.f20825e = set;
        this.f20826f = aVar;
        this.f20827g = aVar2;
        this.f20828h = c0Var;
        r2 r2VarZ = s2Var.z();
        r2VarZ.d();
        this.I = r2VarZ;
        s2 s2Var2 = new s2();
        this.J = s2Var2;
        v2 v2VarA = s2Var2.A();
        v2VarA.L();
        this.K = v2VarA;
        this.O = new u0.b(this, this.f20826f);
        r2 r2VarZ2 = this.J.z();
        try {
            t0.d dVarA = r2VarZ2.a(0);
            r2VarZ2.d();
            this.P = dVarA;
            this.Q = new u0.c();
            this.T = true;
            this.U = new r0();
        } catch (Throwable th) {
            r2VarZ2.d();
            throw th;
        }
    }

    private final Object B0(r2 r2Var) {
        return r2Var.I(r2Var.s());
    }

    private final int D0(r2 r2Var, int i10) {
        Object objW;
        if (!r2Var.D(i10)) {
            int iZ = r2Var.z(i10);
            if (iZ == 207 && (objW = r2Var.w(i10)) != null && !ae.r.b(objW, l.f20813a.a())) {
                iZ = objW.hashCode();
            }
            return iZ;
        }
        Object objA = r2Var.A(i10);
        if (objA == null) {
            return 0;
        }
        if (objA instanceof Enum) {
            return ((Enum) objA).ordinal();
        }
        if (objA instanceof e1) {
            return 126665345;
        }
        return objA.hashCode();
    }

    private final void E0(List<md.s<g1, g1>> list) throws Throwable {
        u0.b bVar;
        u0.a aVar;
        s2 s2VarG;
        t0.d dVarA;
        r2 r2Var;
        v0.c cVar;
        r2 r2Var2;
        int[] iArr;
        u0.a aVar2;
        u0.b bVar2;
        u0.b bVar3;
        int i10;
        c0 c0VarB;
        c0 c0VarB2;
        Integer numValueOf;
        u0.a aVar3;
        int i11;
        s2 s2VarA;
        r2 r2Var3;
        u0.a aVar4;
        u0.b bVar4 = this.O;
        u0.a aVar5 = this.f20827g;
        u0.a aVarN = bVar4.n();
        try {
            bVar4.R(aVar5);
            this.O.P();
            int size = list.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                md.s<g1, g1> sVar = list.get(i13);
                g1 g1VarA = sVar.a();
                g1 g1VarB = sVar.b();
                t0.d dVarA2 = g1VarA.a();
                int iD = g1VarA.g().d(dVarA2);
                b1.d dVar = new b1.d(i12, 1, null);
                this.O.d(dVar, dVarA2);
                if (g1VarB == null) {
                    if (ae.r.b(g1VarA.g(), this.J)) {
                        i0();
                    }
                    r2 r2VarZ = g1VarA.g().z();
                    try {
                        r2VarZ.N(iD);
                        this.O.x(iD);
                        aVar4 = new u0.a();
                        r2Var3 = r2VarZ;
                    } catch (Throwable th) {
                        th = th;
                        r2Var3 = r2VarZ;
                    }
                    try {
                        Q0(this, null, null, null, null, new d(aVar4, r2VarZ, g1VarA), 15, null);
                        this.O.q(aVar4, dVar);
                        md.i0 i0Var = md.i0.f15558a;
                        r2Var3.d();
                        i10 = size;
                        bVar3 = bVar4;
                        aVar3 = aVarN;
                        i11 = i13;
                    } catch (Throwable th2) {
                        th = th2;
                        r2Var3.d();
                        throw th;
                    }
                } else {
                    f1 f1VarM = this.f20823c.m(g1VarB);
                    if (f1VarM == null || (s2VarG = f1VarM.a()) == null) {
                        s2VarG = g1VarB.g();
                    }
                    if (f1VarM == null || (s2VarA = f1VarM.a()) == null || (dVarA = s2VarA.a(0)) == null) {
                        dVarA = g1VarB.a();
                    }
                    List<? extends Object> listS = o.s(s2VarG, dVarA);
                    if (!listS.isEmpty()) {
                        this.O.a(listS, dVar);
                        if (ae.r.b(g1VarA.g(), this.f20824d)) {
                            int iD2 = this.f20824d.d(dVarA2);
                            p1(iD2, u1(iD2) + listS.size());
                        }
                    }
                    this.O.b(f1VarM, this.f20823c, g1VarB, g1VarA);
                    r2 r2VarZ2 = s2VarG.z();
                    try {
                        r2 r2VarC0 = C0();
                        int[] iArr2 = this.f20835o;
                        v0.c cVar2 = this.f20843w;
                        this.f20835o = null;
                        this.f20843w = null;
                        try {
                            Z0(r2VarZ2);
                            int iD3 = s2VarG.d(dVarA);
                            r2VarZ2.N(iD3);
                            this.O.x(iD3);
                            u0.a aVar6 = new u0.a();
                            u0.b bVar5 = this.O;
                            u0.a aVarN2 = bVar5.n();
                            try {
                                bVar5.R(aVar6);
                                bVar2 = this.O;
                                bVar3 = bVar4;
                            } catch (Throwable th3) {
                                th = th3;
                                cVar = cVar2;
                                r2Var2 = r2VarC0;
                            }
                            try {
                                boolean zO = bVar2.o();
                                i10 = size;
                                try {
                                    bVar2.S(false);
                                    c0VarB = g1VarB.b();
                                    c0VarB2 = g1VarA.b();
                                    numValueOf = Integer.valueOf(r2VarZ2.k());
                                    aVar3 = aVarN;
                                    aVar2 = aVarN2;
                                    i11 = i13;
                                    r2Var = r2VarZ2;
                                    iArr = iArr2;
                                    r2Var2 = r2VarC0;
                                } catch (Throwable th4) {
                                    th = th4;
                                    cVar = cVar2;
                                    r2Var2 = r2VarC0;
                                    r2Var = r2VarZ2;
                                    aVar2 = aVarN2;
                                    iArr = iArr2;
                                }
                                try {
                                    P0(c0VarB, c0VarB2, numValueOf, g1VarB.d(), new e(g1VarA));
                                    try {
                                        bVar2.S(zO);
                                        try {
                                            bVar5.R(aVar2);
                                            this.O.q(aVar6, dVar);
                                            md.i0 i0Var2 = md.i0.f15558a;
                                            try {
                                                Z0(r2Var2);
                                                this.f20835o = iArr;
                                                this.f20843w = cVar2;
                                                try {
                                                    r2Var.d();
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    bVar = bVar3;
                                                    aVar = aVar3;
                                                    bVar.R(aVar);
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                r2Var.d();
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            cVar = cVar2;
                                            Z0(r2Var2);
                                            this.f20835o = iArr;
                                            this.f20843w = cVar;
                                            throw th;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        cVar = cVar2;
                                        try {
                                            bVar5.R(aVar2);
                                            throw th;
                                        } catch (Throwable th9) {
                                            th = th9;
                                            Z0(r2Var2);
                                            this.f20835o = iArr;
                                            this.f20843w = cVar;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    cVar = cVar2;
                                    try {
                                        bVar2.S(zO);
                                        throw th;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        bVar5.R(aVar2);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                cVar = cVar2;
                                r2Var2 = r2VarC0;
                                r2Var = r2VarZ2;
                                aVar2 = aVarN2;
                                iArr = iArr2;
                                bVar5.R(aVar2);
                                throw th;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            cVar = cVar2;
                            r2Var2 = r2VarC0;
                            r2Var = r2VarZ2;
                            iArr = iArr2;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        r2Var = r2VarZ2;
                    }
                }
                this.O.U();
                i13 = i11 + 1;
                bVar4 = bVar3;
                size = i10;
                aVarN = aVar3;
                i12 = 0;
            }
            u0.b bVar6 = bVar4;
            u0.a aVar7 = aVarN;
            this.O.g();
            this.O.x(0);
            bVar6.R(aVar7);
        } catch (Throwable th15) {
            th = th15;
            bVar = bVar4;
            aVar = aVarN;
        }
    }

    private final int G0(int i10) {
        return (-2) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(e1<Object> e1Var, u1 u1Var, Object obj, boolean z10) {
        q(126665345, e1Var);
        s1(obj);
        int iG = G();
        try {
            this.S = 126665345;
            boolean z11 = false;
            if (l()) {
                v2.t0(this.K, 0, 1, null);
            }
            if (!l() && !ae.r.b(this.I.l(), u1Var)) {
                z11 = true;
            }
            if (z11) {
                U0(u1Var);
            }
            d1(202, o.B(), p0.f20895a.a(), u1Var);
            this.M = null;
            if (!l() || z10) {
                boolean z12 = this.f20844x;
                this.f20844x = z11;
                t0.c.d(this, b1.c.c(316014703, true, new f(e1Var, obj)));
                this.f20844x = z12;
            } else {
                this.L = true;
                v2 v2Var = this.K;
                this.f20823c.j(new g1(e1Var, obj, y0(), this.J, v2Var.F(v2Var.F0(v2Var.c0())), nd.u.m(), j0()));
            }
        } finally {
            q0();
            this.M = null;
            this.S = iG;
            I();
        }
    }

    private final Object L0(r2 r2Var, int i10) {
        return r2Var.I(i10);
    }

    private final int M0(int i10, int i11, int i12, int i13) {
        int iM = this.I.M(i11);
        while (iM != i12 && !this.I.G(iM)) {
            iM = this.I.M(iM);
        }
        if (this.I.G(iM)) {
            i13 = 0;
        }
        if (iM == i11) {
            return i13;
        }
        int iU1 = (u1(iM) - this.I.K(i11)) + i13;
        loop1: while (i13 < iU1 && iM != i10) {
            iM++;
            while (iM < i10) {
                int iB = this.I.B(iM) + iM;
                if (i10 >= iB) {
                    i13 += u1(iM);
                    iM = iB;
                }
            }
            break loop1;
        }
        return i13;
    }

    private final <R> R P0(c0 c0Var, c0 c0Var2, Integer num, List<md.s<d2, v0.b<Object>>> list, zd.a<? extends R> aVar) {
        R rInvoke;
        boolean z10 = this.G;
        int i10 = this.f20831k;
        try {
            this.G = true;
            this.f20831k = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                md.s<d2, v0.b<Object>> sVar = list.get(i11);
                d2 d2VarA = sVar.a();
                v0.b<Object> bVarB = sVar.b();
                if (bVarB != null) {
                    Object[] objArrN = bVarB.n();
                    int size2 = bVarB.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        Object obj = objArrN[i12];
                        ae.r.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        j1(d2VarA, obj);
                    }
                } else {
                    j1(d2VarA, null);
                }
            }
            if (c0Var != null) {
                rInvoke = (R) c0Var.j(c0Var2, num != null ? num.intValue() : -1, aVar);
                if (rInvoke == null) {
                }
                return rInvoke;
            }
            rInvoke = aVar.invoke();
            return rInvoke;
        } finally {
            this.G = z10;
            this.f20831k = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object Q0(m mVar, c0 c0Var, c0 c0Var2, Integer num, List list, zd.a aVar, int i10, Object obj) {
        c0 c0Var3 = (i10 & 1) != 0 ? null : c0Var;
        c0 c0Var4 = (i10 & 2) != 0 ? null : c0Var2;
        Integer num2 = (i10 & 4) != 0 ? null : num;
        if ((i10 & 8) != 0) {
            list = nd.u.m();
        }
        return mVar.P0(c0Var3, c0Var4, num2, list, aVar);
    }

    private final void R() {
        e0();
        this.f20829i.a();
        this.f20832l.a();
        this.f20834n.a();
        this.f20841u.a();
        this.f20845y.a();
        this.f20843w = null;
        if (!this.I.i()) {
            this.I.d();
        }
        if (!this.K.Z()) {
            this.K.L();
        }
        this.Q.a();
        i0();
        this.S = 0;
        this.B = 0;
        this.f20839s = false;
        this.R = false;
        this.f20846z = false;
        this.G = false;
        this.f20838r = false;
        this.A = -1;
    }

    private final void R0() {
        boolean z10 = this.G;
        this.G = true;
        int iS = this.I.s();
        int iB = this.I.B(iS) + iS;
        int i10 = this.f20831k;
        int iG = G();
        int i11 = this.f20833m;
        t0 t0VarA = o.A(this.f20840t, this.I.k(), iB);
        boolean z11 = false;
        int i12 = iS;
        while (t0VarA != null) {
            int iB2 = t0VarA.b();
            o.Q(this.f20840t, iB2);
            if (t0VarA.d()) {
                this.I.N(iB2);
                int iK = this.I.k();
                V0(i12, iK, iS);
                this.f20831k = M0(iB2, iK, iS, i10);
                this.S = h0(this.I.M(iK), iS, iG);
                this.M = null;
                t0VarA.c().h(this);
                this.M = null;
                this.I.O(iS);
                i12 = iK;
                z11 = true;
            } else {
                this.F.h(t0VarA.c());
                t0VarA.c().y();
                this.F.g();
            }
            t0VarA = o.A(this.f20840t, this.I.k(), iB);
        }
        if (z11) {
            V0(i12, iS, iS);
            this.I.Q();
            int iU1 = u1(iS);
            this.f20831k = i10 + iU1;
            this.f20833m = i11 + iU1;
        } else {
            c1();
        }
        this.S = iG;
        this.G = z10;
    }

    private final void S0() {
        X0(this.I.k());
        this.O.N();
    }

    private final void T0(t0.d dVar) {
        if (this.Q.e()) {
            this.O.r(dVar, this.J);
        } else {
            this.O.s(dVar, this.J, this.Q);
            this.Q = new u0.c();
        }
    }

    private final void U0(u1 u1Var) {
        v0.c<u1> cVar = this.f20843w;
        if (cVar == null) {
            cVar = new v0.c<>(0, 1, null);
            this.f20843w = cVar;
        }
        cVar.b(this.I.k(), u1Var);
    }

    private final void V0(int i10, int i11, int i12) {
        r2 r2Var = this.I;
        int iK = o.K(r2Var, i10, i11, i12);
        while (i10 > 0 && i10 != iK) {
            if (r2Var.G(i10)) {
                this.O.y();
            }
            i10 = r2Var.M(i10);
        }
        o0(i11, iK);
    }

    private final void W0() {
        if (this.f20824d.n()) {
            u0.a aVar = new u0.a();
            this.N = aVar;
            r2 r2VarZ = this.f20824d.z();
            try {
                this.I = r2VarZ;
                u0.b bVar = this.O;
                u0.a aVarN = bVar.n();
                try {
                    bVar.R(aVar);
                    X0(0);
                    this.O.K();
                    bVar.R(aVarN);
                    md.i0 i0Var = md.i0.f15558a;
                } catch (Throwable th) {
                    bVar.R(aVarN);
                    throw th;
                }
            } finally {
                r2VarZ.d();
            }
        }
    }

    private final void X0(int i10) {
        Y0(this, i10, false, 0);
        this.O.h();
    }

    private static final int Y0(m mVar, int i10, boolean z10, int i11) {
        r2 r2Var = mVar.I;
        if (r2Var.C(i10)) {
            int iZ = r2Var.z(i10);
            Object objA = r2Var.A(i10);
            if (iZ == 126665345 && (objA instanceof e1)) {
                e1 e1Var = (e1) objA;
                Object objY = r2Var.y(i10, 0);
                t0.d dVarA = r2Var.a(i10);
                List listX = o.x(mVar.f20840t, i10, r2Var.B(i10) + i10);
                ArrayList arrayList = new ArrayList(listX.size());
                int size = listX.size();
                for (int i12 = 0; i12 < size; i12++) {
                    t0 t0Var = (t0) listX.get(i12);
                    arrayList.add(md.x.a(t0Var.c(), t0Var.a()));
                }
                g1 g1Var = new g1(e1Var, objY, mVar.y0(), mVar.f20824d, dVarA, arrayList, mVar.k0(i10));
                mVar.f20823c.b(g1Var);
                mVar.O.J();
                mVar.O.L(mVar.y0(), mVar.f20823c, g1Var);
                if (z10) {
                    mVar.O.i(i11, i10);
                    return 0;
                }
            } else if (iZ == 206 && ae.r.b(objA, o.G())) {
                Object objY2 = r2Var.y(i10, 0);
                a aVar = objY2 instanceof a ? (a) objY2 : null;
                if (aVar != null) {
                    for (m mVar2 : aVar.a().u()) {
                        mVar2.W0();
                        mVar.f20823c.p(mVar2.y0());
                    }
                }
            } else if (r2Var.G(i10)) {
                return 1;
            }
        } else {
            if (r2Var.e(i10)) {
                int iB = r2Var.B(i10) + i10;
                int iY0 = 0;
                for (int iB2 = i10 + 1; iB2 < iB; iB2 += r2Var.B(iB2)) {
                    boolean zG = r2Var.G(iB2);
                    if (zG) {
                        mVar.O.h();
                        mVar.O.u(r2Var.I(iB2));
                    }
                    iY0 += Y0(mVar, iB2, zG || z10, zG ? 0 : i11 + iY0);
                    if (zG) {
                        mVar.O.h();
                        mVar.O.y();
                    }
                }
                if (r2Var.G(i10)) {
                    return 1;
                }
                return iY0;
            }
            if (r2Var.G(i10)) {
                return 1;
            }
        }
        return r2Var.K(i10);
    }

    private final void b1() {
        this.f20833m += this.I.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c0() {
        /*
            r4 = this;
            boolean r0 = r4.l()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L24
            t0.d2 r0 = new t0.d2
            t0.c0 r2 = r4.y0()
            ae.r.d(r2, r1)
            t0.s r2 = (t0.s) r2
            r0.<init>(r2)
            t0.o3<t0.d2> r1 = r4.F
            r1.h(r0)
            r4.t1(r0)
            int r1 = r4.C
            r0.I(r1)
            goto L77
        L24:
            java.util.List<t0.t0> r0 = r4.f20840t
            t0.r2 r2 = r4.I
            int r2 = r2.s()
            t0.t0 r0 = t0.o.o(r0, r2)
            t0.r2 r2 = r4.I
            java.lang.Object r2 = r2.H()
            t0.l$a r3 = t0.l.f20813a
            java.lang.Object r3 = r3.a()
            boolean r3 = ae.r.b(r2, r3)
            if (r3 == 0) goto L54
            t0.d2 r2 = new t0.d2
            t0.c0 r3 = r4.y0()
            ae.r.d(r3, r1)
            t0.s r3 = (t0.s) r3
            r2.<init>(r3)
            r4.t1(r2)
            goto L5b
        L54:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            ae.r.d(r2, r1)
            t0.d2 r2 = (t0.d2) r2
        L5b:
            r1 = 0
            if (r0 != 0) goto L69
            boolean r0 = r2.n()
            if (r0 == 0) goto L67
            r2.D(r1)
        L67:
            if (r0 == 0) goto L6a
        L69:
            r1 = 1
        L6a:
            r2.E(r1)
            t0.o3<t0.d2> r0 = r4.F
            r0.h(r2)
            int r0 = r4.C
            r2.I(r0)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.m.c0():void");
    }

    private final void c1() {
        this.f20833m = this.I.t();
        this.I.Q();
    }

    private final void d1(int i10, Object obj, int i11, Object obj2) {
        Object objA = obj;
        w1();
        l1(i10, obj, obj2);
        p0.a aVar = p0.f20895a;
        boolean z10 = i11 != aVar.a();
        t1 t1Var = null;
        if (l()) {
            this.I.c();
            int iA0 = this.K.a0();
            if (z10) {
                this.K.f1(i10, l.f20813a.a());
            } else if (obj2 != null) {
                v2 v2Var = this.K;
                if (objA == null) {
                    objA = l.f20813a.a();
                }
                v2Var.b1(i10, objA, obj2);
            } else {
                v2 v2Var2 = this.K;
                if (objA == null) {
                    objA = l.f20813a.a();
                }
                v2Var2.d1(i10, objA);
            }
            t1 t1Var2 = this.f20830j;
            if (t1Var2 != null) {
                w0 w0Var = new w0(i10, -1, G0(iA0), -1, 0);
                t1Var2.i(w0Var, this.f20831k - t1Var2.e());
                t1Var2.h(w0Var);
            }
            u0(z10, null);
            return;
        }
        boolean z11 = !(i11 != aVar.b()) && this.f20846z;
        if (this.f20830j == null) {
            int iN = this.I.n();
            if (!z11 && iN == i10 && ae.r.b(obj, this.I.o())) {
                g1(z10, obj2);
            } else {
                this.f20830j = new t1(this.I.h(), this.f20831k);
            }
        }
        t1 t1Var3 = this.f20830j;
        if (t1Var3 != null) {
            w0 w0VarD = t1Var3.d(i10, obj);
            if (z11 || w0VarD == null) {
                this.I.c();
                this.R = true;
                this.M = null;
                t0();
                this.K.I();
                int iA02 = this.K.a0();
                if (z10) {
                    this.K.f1(i10, l.f20813a.a());
                } else if (obj2 != null) {
                    v2 v2Var3 = this.K;
                    if (objA == null) {
                        objA = l.f20813a.a();
                    }
                    v2Var3.b1(i10, objA, obj2);
                } else {
                    v2 v2Var4 = this.K;
                    if (objA == null) {
                        objA = l.f20813a.a();
                    }
                    v2Var4.d1(i10, objA);
                }
                this.P = this.K.F(iA02);
                w0 w0Var2 = new w0(i10, -1, G0(iA02), -1, 0);
                t1Var3.i(w0Var2, this.f20831k - t1Var3.e());
                t1Var3.h(w0Var2);
                t1Var = new t1(new ArrayList(), z10 ? 0 : this.f20831k);
            } else {
                t1Var3.h(w0VarD);
                int iB = w0VarD.b();
                this.f20831k = t1Var3.g(w0VarD) + t1Var3.e();
                int iM = t1Var3.m(w0VarD);
                int iA = iM - t1Var3.a();
                t1Var3.k(iM, t1Var3.a());
                this.O.w(iB);
                this.I.N(iB);
                if (iA > 0) {
                    this.O.t(iA);
                }
                g1(z10, obj2);
            }
        }
        u0(z10, t1Var);
    }

    private final void e0() {
        this.f20830j = null;
        this.f20831k = 0;
        this.f20833m = 0;
        this.S = 0;
        this.f20839s = false;
        this.O.Q();
        this.F.a();
        f0();
    }

    private final void e1(int i10) {
        d1(i10, null, p0.f20895a.a(), null);
    }

    private final void f0() {
        this.f20835o = null;
        this.f20836p = null;
    }

    private final void f1(int i10, Object obj) {
        d1(i10, obj, p0.f20895a.a(), null);
    }

    private final void g1(boolean z10, Object obj) {
        if (z10) {
            this.I.S();
            return;
        }
        if (obj != null && this.I.l() != obj) {
            this.O.V(obj);
        }
        this.I.R();
    }

    private final int h0(int i10, int i11, int i12) {
        if (i10 == i11) {
            return i12;
        }
        int iD0 = D0(this.I, i10);
        return iD0 == 126665345 ? iD0 : Integer.rotateLeft(h0(this.I.M(i10), i11, i12), 3) ^ iD0;
    }

    private final void i0() {
        o.S(this.K.Z());
        s2 s2Var = new s2();
        this.J = s2Var;
        v2 v2VarA = s2Var.A();
        v2VarA.L();
        this.K = v2VarA;
    }

    private final void i1() {
        this.I = this.f20824d.z();
        e1(100);
        this.f20823c.q();
        this.f20842v = this.f20823c.f();
        this.f20845y.i(o.r(this.f20844x));
        this.f20844x = N(this.f20842v);
        this.M = null;
        if (!this.f20837q) {
            this.f20837q = this.f20823c.d();
        }
        if (!this.D) {
            this.D = this.f20823c.e();
        }
        Set<e1.a> set = (Set) x.c(this.f20842v, e1.d.a());
        if (set != null) {
            set.add(this.f20824d);
            this.f20823c.n(set);
        }
        e1(this.f20823c.g());
    }

    private final u1 j0() {
        u1 u1Var = this.M;
        return u1Var != null ? u1Var : k0(this.I.s());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[ADDED_TO_REGION, LOOP:1: B:18:0x004b->B:30:0x0080, LOOP_START, PHI: r6
  0x004b: PHI (r6v2 int) = (r6v0 int), (r6v3 int) binds: [B:17:0x0049, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final t0.u1 k0(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.l()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            r2 = 202(0xca, float:2.83E-43)
            if (r0 == 0) goto L43
            boolean r0 = r5.L
            if (r0 == 0) goto L43
            t0.v2 r0 = r5.K
            int r0 = r0.c0()
        L14:
            if (r0 <= 0) goto L43
            t0.v2 r3 = r5.K
            int r3 = r3.h0(r0)
            if (r3 != r2) goto L3c
            t0.v2 r3 = r5.K
            java.lang.Object r3 = r3.i0(r0)
            java.lang.Object r4 = t0.o.B()
            boolean r3 = ae.r.b(r3, r4)
            if (r3 == 0) goto L3c
            t0.v2 r6 = r5.K
            java.lang.Object r6 = r6.f0(r0)
            ae.r.d(r6, r1)
            t0.u1 r6 = (t0.u1) r6
        L39:
            r5.M = r6
            return r6
        L3c:
            t0.v2 r3 = r5.K
            int r0 = r3.F0(r0)
            goto L14
        L43:
            t0.r2 r0 = r5.I
            int r0 = r0.u()
            if (r0 <= 0) goto L87
        L4b:
            if (r6 <= 0) goto L87
            t0.r2 r0 = r5.I
            int r0 = r0.z(r6)
            if (r0 != r2) goto L80
            t0.r2 r0 = r5.I
            java.lang.Object r0 = r0.A(r6)
            java.lang.Object r3 = t0.o.B()
            boolean r0 = ae.r.b(r0, r3)
            if (r0 == 0) goto L80
            v0.c<t0.u1> r0 = r5.f20843w
            if (r0 == 0) goto L71
            java.lang.Object r0 = r0.a(r6)
            t0.u1 r0 = (t0.u1) r0
            if (r0 != 0) goto L7d
        L71:
            t0.r2 r0 = r5.I
            java.lang.Object r6 = r0.w(r6)
            ae.r.d(r6, r1)
            r0 = r6
            t0.u1 r0 = (t0.u1) r0
        L7d:
            r5.M = r0
            return r0
        L80:
            t0.r2 r0 = r5.I
            int r6 = r0.M(r6)
            goto L4b
        L87:
            t0.u1 r6 = r5.f20842v
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.m.k0(int):t0.u1");
    }

    private final void l1(int i10, Object obj, Object obj2) {
        if (obj != null) {
            i10 = obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode();
        } else if (obj2 != null && i10 == 207 && !ae.r.b(obj2, l.f20813a.a())) {
            i10 = obj2.hashCode();
        }
        m1(i10);
    }

    private final void m1(int i10) {
        this.S = i10 ^ Integer.rotateLeft(G(), 3);
    }

    private final void n0(v0.a<d2, v0.b<Object>> aVar, zd.p<? super l, ? super Integer, md.i0> pVar) {
        if (!(!this.G)) {
            o.u("Reentrant composition is not supported".toString());
            throw new md.i();
        }
        Object objA = t3.f20985a.a("Compose:recompose");
        try {
            this.C = d1.p.H().f();
            this.f20843w = null;
            int iH = aVar.h();
            for (int i10 = 0; i10 < iH; i10++) {
                Object obj = aVar.g()[i10];
                ae.r.d(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                v0.b bVar = (v0.b) aVar.i()[i10];
                d2 d2Var = (d2) obj;
                t0.d dVarJ = d2Var.j();
                if (dVarJ == null) {
                    return;
                }
                this.f20840t.add(new t0(d2Var, dVarJ.a(), bVar));
            }
            nd.y.B(this.f20840t, o.f20888h);
            this.f20831k = 0;
            this.G = true;
            try {
                i1();
                Object objJ0 = J0();
                if (objJ0 != pVar && pVar != null) {
                    t1(pVar);
                }
                c cVar = this.E;
                v0.d<g0> dVarC = f3.c();
                try {
                    dVarC.b(cVar);
                    if (pVar != null) {
                        f1(200, o.C());
                        t0.c.d(this, pVar);
                    } else {
                        if ((!this.f20838r && !this.f20844x) || objJ0 == null || ae.r.b(objJ0, l.f20813a.a())) {
                            a1();
                            dVarC.x(dVarC.o() - 1);
                            s0();
                            this.G = false;
                            this.f20840t.clear();
                            i0();
                            md.i0 i0Var = md.i0.f15558a;
                        }
                        f1(200, o.C());
                        t0.c.d(this, (zd.p) ae.n0.e(objJ0, 2));
                    }
                    q0();
                    dVarC.x(dVarC.o() - 1);
                    s0();
                    this.G = false;
                    this.f20840t.clear();
                    i0();
                    md.i0 i0Var2 = md.i0.f15558a;
                } catch (Throwable th) {
                    dVarC.x(dVarC.o() - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.G = false;
                this.f20840t.clear();
                R();
                i0();
                throw th2;
            }
        } finally {
            t3.f20985a.b(objA);
        }
    }

    private final void n1(int i10, Object obj, Object obj2) {
        if (obj != null) {
            i10 = obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode();
        } else if (obj2 != null && i10 == 207 && !ae.r.b(obj2, l.f20813a.a())) {
            i10 = obj2.hashCode();
        }
        o1(i10);
    }

    private final void o0(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        o0(this.I.M(i10), i11);
        if (this.I.G(i10)) {
            this.O.u(L0(this.I, i10));
        }
    }

    private final void o1(int i10) {
        this.S = Integer.rotateRight(Integer.hashCode(i10) ^ G(), 3);
    }

    private final void p0(boolean z10) {
        int iZ;
        Object objA;
        Object objW;
        Set set;
        List<w0> list;
        if (l()) {
            int iC0 = this.K.c0();
            iZ = this.K.h0(iC0);
            objA = this.K.i0(iC0);
            objW = this.K.f0(iC0);
        } else {
            int iS = this.I.s();
            iZ = this.I.z(iS);
            objA = this.I.A(iS);
            objW = this.I.w(iS);
        }
        n1(iZ, objA, objW);
        int i10 = this.f20833m;
        t1 t1Var = this.f20830j;
        if (t1Var != null && t1Var.b().size() > 0) {
            List<w0> listB = t1Var.b();
            List<w0> listF = t1Var.f();
            Set setE = d1.b.e(listF);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listF.size();
            int size2 = listB.size();
            int i11 = 0;
            int i12 = 0;
            int iO = 0;
            while (i11 < size2) {
                w0 w0Var = listB.get(i11);
                if (setE.contains(w0Var)) {
                    set = setE;
                    if (!linkedHashSet.contains(w0Var)) {
                        if (i12 < size) {
                            w0 w0Var2 = listF.get(i12);
                            if (w0Var2 != w0Var) {
                                int iG = t1Var.g(w0Var2);
                                linkedHashSet.add(w0Var2);
                                if (iG != iO) {
                                    int iO2 = t1Var.o(w0Var2);
                                    list = listF;
                                    this.O.v(t1Var.e() + iG, iO + t1Var.e(), iO2);
                                    t1Var.j(iG, iO, iO2);
                                } else {
                                    list = listF;
                                }
                            } else {
                                list = listF;
                                i11++;
                            }
                            i12++;
                            iO += t1Var.o(w0Var2);
                            setE = set;
                            listF = list;
                        } else {
                            setE = set;
                        }
                    }
                } else {
                    this.O.O(t1Var.g(w0Var) + t1Var.e(), w0Var.c());
                    t1Var.n(w0Var.b(), 0);
                    this.O.w(w0Var.b());
                    this.I.N(w0Var.b());
                    S0();
                    this.I.P();
                    set = setE;
                    o.R(this.f20840t, w0Var.b(), w0Var.b() + this.I.B(w0Var.b()));
                }
                i11++;
                setE = set;
            }
            this.O.h();
            if (listB.size() > 0) {
                this.O.w(this.I.m());
                this.I.Q();
            }
        }
        int i13 = this.f20831k;
        while (!this.I.E()) {
            int iK = this.I.k();
            S0();
            this.O.O(i13, this.I.P());
            o.R(this.f20840t, iK, this.I.k());
        }
        boolean zL = l();
        if (zL) {
            if (z10) {
                this.Q.c();
                i10 = 1;
            }
            this.I.f();
            int iC02 = this.K.c0();
            this.K.T();
            if (!this.I.r()) {
                int iG0 = G0(iC02);
                this.K.U();
                this.K.L();
                T0(this.P);
                this.R = false;
                if (!this.f20824d.isEmpty()) {
                    p1(iG0, 0);
                    q1(iG0, i10);
                }
            }
        } else {
            if (z10) {
                this.O.y();
            }
            this.O.f();
            int iS2 = this.I.s();
            if (i10 != u1(iS2)) {
                q1(iS2, i10);
            }
            if (z10) {
                i10 = 1;
            }
            this.I.g();
            this.O.h();
        }
        v0(i10, zL);
    }

    private final void p1(int i10, int i11) {
        if (u1(i10) != i11) {
            if (i10 < 0) {
                z.p pVar = this.f20836p;
                if (pVar == null) {
                    pVar = new z.p(0, 1, null);
                    this.f20836p = pVar;
                }
                pVar.n(i10, i11);
                return;
            }
            int[] iArr = this.f20835o;
            if (iArr == null) {
                iArr = new int[this.I.u()];
                nd.o.r(iArr, -1, 0, 0, 6, null);
                this.f20835o = iArr;
            }
            iArr[i10] = i11;
        }
    }

    private final void q0() {
        p0(false);
    }

    private final void q1(int i10, int i11) {
        int iU1 = u1(i10);
        if (iU1 != i11) {
            int i12 = i11 - iU1;
            int iB = this.f20829i.b() - 1;
            while (i10 != -1) {
                int iU12 = u1(i10) + i12;
                p1(i10, iU12);
                int i13 = iB;
                while (true) {
                    if (-1 < i13) {
                        t1 t1VarF = this.f20829i.f(i13);
                        if (t1VarF != null && t1VarF.n(i10, iU12)) {
                            iB = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.I.s();
                } else if (this.I.G(i10)) {
                    return;
                } else {
                    i10 = this.I.M(i10);
                }
            }
        }
    }

    private final u1 r1(u1 u1Var, u1 u1Var2) {
        u1.a aVarN = u1Var.n();
        aVarN.putAll(u1Var2);
        u1 u1VarBuild = aVarN.build();
        f1(204, o.F());
        s1(u1VarBuild);
        s1(u1Var2);
        q0();
        return u1VarBuild;
    }

    private final void s0() {
        q0();
        this.f20823c.c();
        q0();
        this.O.j();
        w0();
        this.I.d();
        this.f20838r = false;
    }

    private final void s1(Object obj) {
        J0();
        t1(obj);
    }

    private final void t0() {
        if (this.K.Z()) {
            v2 v2VarA = this.J.A();
            this.K = v2VarA;
            v2VarA.W0();
            this.L = false;
            this.M = null;
        }
    }

    private final void u0(boolean z10, t1 t1Var) {
        this.f20829i.h(this.f20830j);
        this.f20830j = t1Var;
        this.f20832l.i(this.f20831k);
        if (z10) {
            this.f20831k = 0;
        }
        this.f20834n.i(this.f20833m);
        this.f20833m = 0;
    }

    private final int u1(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f20835o;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.I.K(i10) : i11;
        }
        z.p pVar = this.f20836p;
        if (pVar == null || !pVar.a(i10)) {
            return 0;
        }
        return pVar.c(i10);
    }

    private final void v0(int i10, boolean z10) {
        t1 t1VarG = this.f20829i.g();
        if (t1VarG != null && !z10) {
            t1VarG.l(t1VarG.a() + 1);
        }
        this.f20830j = t1VarG;
        this.f20831k = this.f20832l.h() + i10;
        this.f20833m = this.f20834n.h() + i10;
    }

    private final void v1() {
        if (this.f20839s) {
            this.f20839s = false;
        } else {
            o.u("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new md.i();
        }
    }

    private final void w0() {
        this.O.m();
        if (this.f20829i.c()) {
            e0();
        } else {
            o.u("Start/end imbalance".toString());
            throw new md.i();
        }
    }

    private final void w1() {
        if (!this.f20839s) {
            return;
        }
        o.u("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new md.i();
    }

    @Override // t0.l
    public void A() {
        q0();
        q0();
        this.f20844x = o.q(this.f20845y.h());
        this.M = null;
    }

    public final u0.a A0() {
        return this.N;
    }

    @Override // t0.l
    public w B() {
        return j0();
    }

    @Override // t0.l
    public boolean C() {
        if (s() && !this.f20844x) {
            d2 d2VarZ0 = z0();
            if (!(d2VarZ0 != null && d2VarZ0.m())) {
                return false;
            }
        }
        return true;
    }

    public final r2 C0() {
        return this.I;
    }

    @Override // t0.l
    public void D() {
        v1();
        if (!(!l())) {
            o.u("useNode() called while inserting".toString());
            throw new md.i();
        }
        Object objB0 = B0(this.I);
        this.O.u(objB0);
        if (this.f20846z && (objB0 instanceof j)) {
            this.O.Y(objB0);
        }
    }

    @Override // t0.l
    public void E(Object obj) {
        k1(obj);
    }

    @Override // t0.l
    public void F(b2<?>[] b2VarArr) {
        u1 u1VarR1;
        u1 u1VarJ0 = j0();
        f1(RCHTTPStatusCodes.CREATED, o.E());
        boolean z10 = true;
        boolean z11 = false;
        if (l()) {
            u1VarR1 = r1(u1VarJ0, x.e(b2VarArr, u1VarJ0, null, 4, null));
            this.L = true;
        } else {
            Object objX = this.I.x(0);
            ae.r.d(objX, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            u1 u1Var = (u1) objX;
            Object objX2 = this.I.x(1);
            ae.r.d(objX2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            u1 u1Var2 = (u1) objX2;
            u1 u1VarD = x.d(b2VarArr, u1VarJ0, u1Var2);
            if (s() && !this.f20846z && ae.r.b(u1Var2, u1VarD)) {
                b1();
                u1VarR1 = u1Var;
            } else {
                u1VarR1 = r1(u1VarJ0, u1VarD);
                if (!this.f20846z && ae.r.b(u1VarR1, u1Var)) {
                    z10 = false;
                }
                z11 = z10;
            }
        }
        if (z11 && !l()) {
            U0(u1VarR1);
        }
        this.f20845y.i(o.r(this.f20844x));
        this.f20844x = z11;
        this.M = u1VarR1;
        d1(202, o.B(), p0.f20895a.a(), u1VarR1);
    }

    public void F0(List<md.s<g1, g1>> list) {
        try {
            E0(list);
            e0();
        } catch (Throwable th) {
            R();
            throw th;
        }
    }

    @Override // t0.l
    public int G() {
        return this.S;
    }

    @Override // t0.l
    public q H() {
        f1(206, o.G());
        if (l()) {
            v2.t0(this.K, 0, 1, null);
        }
        Object objJ0 = J0();
        a aVar = objJ0 instanceof a ? (a) objJ0 : null;
        if (aVar == null) {
            int iG = G();
            boolean z10 = this.f20837q;
            boolean z11 = this.D;
            c0 c0VarY0 = y0();
            s sVar = c0VarY0 instanceof s ? (s) c0VarY0 : null;
            aVar = new a(new b(iG, z10, z11, sVar != null ? sVar.G() : null));
            t1(aVar);
        }
        aVar.a().x(j0());
        q0();
        return aVar.a();
    }

    @Override // t0.l
    public void I() {
        q0();
    }

    public final boolean I0() {
        return this.G;
    }

    @Override // t0.l
    public void J() {
        q0();
        q0();
        this.f20844x = o.q(this.f20845y.h());
        this.M = null;
    }

    public final Object J0() {
        if (l()) {
            w1();
        } else {
            Object objH = this.I.H();
            if (!this.f20846z || (objH instanceof n2)) {
                return objH;
            }
        }
        return l.f20813a.a();
    }

    @Override // t0.l
    public void K() {
        q0();
    }

    public final Object K0() {
        if (l()) {
            w1();
        } else {
            Object objH = this.I.H();
            if (!this.f20846z || (objH instanceof n2)) {
                return objH instanceof l2 ? ((l2) objH).a() : objH;
            }
        }
        return l.f20813a.a();
    }

    @Override // t0.l
    public void L() {
        p0(true);
    }

    @Override // t0.l
    public void M() {
        q0();
        d2 d2VarZ0 = z0();
        if (d2VarZ0 == null || !d2VarZ0.r()) {
            return;
        }
        d2VarZ0.B(true);
    }

    @Override // t0.l
    public boolean N(Object obj) {
        if (ae.r.b(J0(), obj)) {
            return false;
        }
        t1(obj);
        return true;
    }

    public final void N0(zd.a<md.i0> aVar) {
        if (!(!this.G)) {
            o.u("Preparing a composition while composing is not supported".toString());
            throw new md.i();
        }
        this.G = true;
        try {
            aVar.invoke();
        } finally {
            this.G = false;
        }
    }

    @Override // t0.l
    public <T> void O(zd.a<? extends T> aVar) {
        v1();
        if (!l()) {
            o.u("createNode() can only be called when inserting".toString());
            throw new md.i();
        }
        int iE = this.f20832l.e();
        v2 v2Var = this.K;
        t0.d dVarF = v2Var.F(v2Var.c0());
        this.f20833m++;
        this.Q.b(aVar, iE, dVarF);
    }

    public final boolean O0(v0.a<d2, v0.b<Object>> aVar) {
        if (!this.f20826f.c()) {
            o.u("Expected applyChanges() to have been called".toString());
            throw new md.i();
        }
        if (!aVar.k() && !(!this.f20840t.isEmpty()) && !this.f20838r) {
            return false;
        }
        n0(aVar, null);
        return this.f20826f.d();
    }

    @Override // t0.l
    public <T> T P(u<T> uVar) {
        return (T) x.c(j0(), uVar);
    }

    @Override // t0.l
    public <V, T> void Q(V v10, zd.p<? super T, ? super V, md.i0> pVar) {
        if (l()) {
            this.Q.f(v10, pVar);
        } else {
            this.O.W(v10, pVar);
        }
    }

    public final void Z0(r2 r2Var) {
        this.I = r2Var;
    }

    @Override // t0.l
    public void a() {
        this.f20837q = true;
        this.D = true;
    }

    public void a1() {
        if (this.f20840t.isEmpty()) {
            b1();
            return;
        }
        r2 r2Var = this.I;
        int iN = r2Var.n();
        Object objO = r2Var.o();
        Object objL = r2Var.l();
        l1(iN, objO, objL);
        g1(r2Var.F(), null);
        R0();
        r2Var.g();
        n1(iN, objO, objL);
    }

    @Override // t0.l
    public c2 b() {
        return z0();
    }

    @Override // t0.l
    public boolean c(boolean z10) {
        Object objJ0 = J0();
        if ((objJ0 instanceof Boolean) && z10 == ((Boolean) objJ0).booleanValue()) {
            return false;
        }
        t1(Boolean.valueOf(z10));
        return true;
    }

    @Override // t0.l
    public void d() {
        if (this.f20846z && this.I.s() == this.A) {
            this.A = -1;
            this.f20846z = false;
        }
        p0(false);
    }

    public final void d0() {
        this.f20843w = null;
    }

    @Override // t0.l
    public void e(int i10) {
        d1(i10, null, p0.f20895a.a(), null);
    }

    @Override // t0.l
    public Object f() {
        return K0();
    }

    @Override // t0.l
    public boolean g(float f10) {
        Object objJ0 = J0();
        if (objJ0 instanceof Float) {
            if (f10 == ((Number) objJ0).floatValue()) {
                return false;
            }
        }
        t1(Float.valueOf(f10));
        return true;
    }

    public final void g0(v0.a<d2, v0.b<Object>> aVar, zd.p<? super l, ? super Integer, md.i0> pVar) {
        if (this.f20826f.c()) {
            n0(aVar, pVar);
        } else {
            o.u("Expected applyChanges() to have been called".toString());
            throw new md.i();
        }
    }

    @Override // t0.l
    public boolean h(int i10) {
        Object objJ0 = J0();
        if ((objJ0 instanceof Integer) && i10 == ((Number) objJ0).intValue()) {
            return false;
        }
        t1(Integer.valueOf(i10));
        return true;
    }

    public final void h1() {
        this.A = 100;
        this.f20846z = true;
    }

    @Override // t0.l
    public boolean i(long j10) {
        Object objJ0 = J0();
        if ((objJ0 instanceof Long) && j10 == ((Number) objJ0).longValue()) {
            return false;
        }
        t1(Long.valueOf(j10));
        return true;
    }

    @Override // t0.l
    public e1.a j() {
        return this.f20824d;
    }

    public final boolean j1(d2 d2Var, Object obj) {
        t0.d dVarJ = d2Var.j();
        if (dVarJ == null) {
            return false;
        }
        int iD = dVarJ.d(this.I.v());
        if (!this.G || iD < this.I.k()) {
            return false;
        }
        o.H(this.f20840t, iD, d2Var, obj);
        return true;
    }

    @Override // t0.l
    public boolean k(Object obj) {
        if (J0() == obj) {
            return false;
        }
        t1(obj);
        return true;
    }

    public final void k1(Object obj) {
        if (obj instanceof k2) {
            if (l()) {
                this.O.M((k2) obj);
            }
            this.f20825e.add(obj);
            obj = new l2((k2) obj);
        }
        t1(obj);
    }

    @Override // t0.l
    public boolean l() {
        return this.R;
    }

    public final void l0() {
        this.F.a();
        this.f20840t.clear();
        this.f20826f.a();
        this.f20843w = null;
    }

    @Override // t0.l
    public void m(c2 c2Var) {
        d2 d2Var = c2Var instanceof d2 ? (d2) c2Var : null;
        if (d2Var == null) {
            return;
        }
        d2Var.H(true);
    }

    public final void m0() {
        t3 t3Var = t3.f20985a;
        Object objA = t3Var.a("Compose:Composer.dispose");
        try {
            this.f20823c.r(this);
            l0();
            t().clear();
            this.H = true;
            md.i0 i0Var = md.i0.f15558a;
            t3Var.b(objA);
        } catch (Throwable th) {
            t3.f20985a.b(objA);
            throw th;
        }
    }

    @Override // t0.l
    public void n(boolean z10) {
        if (!(this.f20833m == 0)) {
            o.u("No nodes can be emitted before calling dactivateToEndGroup".toString());
            throw new md.i();
        }
        if (l()) {
            return;
        }
        if (!z10) {
            c1();
            return;
        }
        int iK = this.I.k();
        int iJ = this.I.j();
        this.O.c();
        o.R(this.f20840t, iK, iJ);
        this.I.Q();
    }

    @Override // t0.l
    public void o() {
        d1(-127, null, p0.f20895a.a(), null);
    }

    @Override // t0.l
    public l p(int i10) {
        d1(i10, null, p0.f20895a.a(), null);
        c0();
        return this;
    }

    @Override // t0.l
    public void q(int i10, Object obj) {
        d1(i10, obj, p0.f20895a.a(), null);
    }

    @Override // t0.l
    public void r() {
        d1(R.styleable.AppCompatTheme_windowMinWidthMinor, null, p0.f20895a.c(), null);
        this.f20839s = true;
    }

    public final void r0() {
        if (!(!this.G && this.A == 100)) {
            throw new IllegalArgumentException("Cannot disable reuse from root if it was caused by other groups".toString());
        }
        this.A = -1;
        this.f20846z = false;
    }

    @Override // t0.l
    public boolean s() {
        if (!l() && !this.f20846z && !this.f20844x) {
            d2 d2VarZ0 = z0();
            if (((d2VarZ0 == null || d2VarZ0.o()) ? false : true) && !this.f20838r) {
                return true;
            }
        }
        return false;
    }

    @Override // t0.l
    public t0.e<?> t() {
        return this.f20822b;
    }

    public final void t1(Object obj) {
        if (l()) {
            this.K.h1(obj);
        } else {
            this.O.X(obj, this.I.q() - 1);
        }
    }

    @Override // t0.l
    public void u(int i10, Object obj) {
        if (!l() && this.I.n() == i10 && !ae.r.b(this.I.l(), obj) && this.A < 0) {
            this.A = this.I.k();
            this.f20846z = true;
        }
        d1(i10, null, p0.f20895a.a(), obj);
    }

    @Override // t0.l
    public o2 v() {
        t0.d dVarA;
        zd.l<p, md.i0> lVarI;
        d2 d2Var = null;
        d2 d2VarG = this.F.d() ? this.F.g() : null;
        if (d2VarG != null) {
            d2VarG.E(false);
        }
        if (d2VarG != null && (lVarI = d2VarG.i(this.C)) != null) {
            this.O.e(lVarI, y0());
        }
        if (d2VarG != null && !d2VarG.q() && (d2VarG.r() || this.f20837q)) {
            if (d2VarG.j() == null) {
                if (l()) {
                    v2 v2Var = this.K;
                    dVarA = v2Var.F(v2Var.c0());
                } else {
                    r2 r2Var = this.I;
                    dVarA = r2Var.a(r2Var.s());
                }
                d2VarG.A(dVarA);
            }
            d2VarG.C(false);
            d2Var = d2VarG;
        }
        p0(false);
        return d2Var;
    }

    @Override // t0.l
    public void w(zd.a<md.i0> aVar) {
        this.O.T(aVar);
    }

    @Override // t0.l
    public void x() {
        if (!(this.f20833m == 0)) {
            o.u("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw new md.i();
        }
        d2 d2VarZ0 = z0();
        if (d2VarZ0 != null) {
            d2VarZ0.z();
        }
        if (this.f20840t.isEmpty()) {
            c1();
        } else {
            R0();
        }
    }

    public final boolean x0() {
        return this.B > 0;
    }

    @Override // t0.l
    public void y(b2<?> b2Var) {
        p3<? extends Object> p3Var;
        u1 u1VarK;
        u1 u1VarJ0 = j0();
        f1(RCHTTPStatusCodes.CREATED, o.E());
        Object objF = f();
        if (ae.r.b(objF, l.f20813a.a())) {
            p3Var = null;
        } else {
            ae.r.d(objF, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Any?>");
            p3Var = (p3) objF;
        }
        u<?> uVarB = b2Var.b();
        ae.r.d(uVarB, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        p3<?> p3VarB = uVarB.b(b2Var.c(), p3Var);
        boolean z10 = true;
        boolean z11 = !ae.r.b(p3VarB, p3Var);
        if (z11) {
            E(p3VarB);
        }
        boolean z12 = false;
        if (l()) {
            u1VarK = u1VarJ0.k(uVarB, p3VarB);
            this.L = true;
        } else {
            r2 r2Var = this.I;
            Object objW = r2Var.w(r2Var.k());
            ae.r.d(objW, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            u1 u1Var = (u1) objW;
            u1VarK = ((!s() || z11) && (b2Var.a() || !x.a(u1VarJ0, uVarB))) ? u1VarJ0.k(uVarB, p3VarB) : u1Var;
            if (!this.f20846z && u1Var == u1VarK) {
                z10 = false;
            }
            z12 = z10;
        }
        if (z12 && !l()) {
            U0(u1VarK);
        }
        this.f20845y.i(o.r(this.f20844x));
        this.f20844x = z12;
        this.M = u1VarK;
        d1(202, o.B(), p0.f20895a.a(), u1VarK);
    }

    public c0 y0() {
        return this.f20828h;
    }

    @Override // t0.l
    public qd.g z() {
        return this.f20823c.h();
    }

    public final d2 z0() {
        o3<d2> o3Var = this.F;
        if (this.B == 0 && o3Var.d()) {
            return o3Var.e();
        }
        return null;
    }
}
