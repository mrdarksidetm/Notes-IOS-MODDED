package y1;

import a2.f0;
import a2.k0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t0.k1;
import t0.k3;
import t0.m2;
import y1.c1;
import y1.e1;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class x implements t0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a2.f0 f23303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t0.q f23304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e1 f23305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23307e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23316n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23317o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<a2.f0, a> f23308f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<Object, a2.f0> f23309g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f23310h = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f23311i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final HashMap<Object, a2.f0> f23312j = new HashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e1.a f23313k = new e1.a(null, 1, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<Object, c1.a> f23314l = new LinkedHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final v0.d<Object> f23315m = new v0.d<>(new Object[16], 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f23318p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f23319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private zd.p<? super t0.l, ? super Integer, md.i0> f23320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m2 f23321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f23322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f23323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private k1<Boolean> f23324f;

        public a(Object obj, zd.p<? super t0.l, ? super Integer, md.i0> pVar, m2 m2Var) {
            this.f23319a = obj;
            this.f23320b = pVar;
            this.f23321c = m2Var;
            this.f23324f = k3.e(Boolean.TRUE, null, 2, null);
        }

        public /* synthetic */ a(Object obj, zd.p pVar, m2 m2Var, int i10, ae.j jVar) {
            this(obj, pVar, (i10 & 4) != 0 ? null : m2Var);
        }

        public final boolean a() {
            return this.f23324f.getValue().booleanValue();
        }

        public final m2 b() {
            return this.f23321c;
        }

        public final zd.p<t0.l, Integer, md.i0> c() {
            return this.f23320b;
        }

        public final boolean d() {
            return this.f23322d;
        }

        public final boolean e() {
            return this.f23323e;
        }

        public final Object f() {
            return this.f23319a;
        }

        public final void g(boolean z10) {
            this.f23324f.setValue(Boolean.valueOf(z10));
        }

        public final void h(k1<Boolean> k1Var) {
            this.f23324f = k1Var;
        }

        public final void i(m2 m2Var) {
            this.f23321c = m2Var;
        }

        public final void j(zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
            this.f23320b = pVar;
        }

        public final void k(boolean z10) {
            this.f23322d = z10;
        }

        public final void l(boolean z10) {
            this.f23323e = z10;
        }

        public final void m(Object obj) {
            this.f23319a = obj;
        }
    }

    private final class b implements d1, g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ c f23325a;

        public b() {
            this.f23325a = x.this.f23310h;
        }

        @Override // y1.n
        public boolean C0() {
            return this.f23325a.C0();
        }

        @Override // y1.d1
        public List<d0> F0(Object obj, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
            a2.f0 f0Var = (a2.f0) x.this.f23309g.get(obj);
            List<d0> listE = f0Var != null ? f0Var.E() : null;
            return listE != null ? listE : x.this.F(obj, pVar);
        }

        @Override // w2.d
        public float G0(float f10) {
            return this.f23325a.G0(f10);
        }

        @Override // y1.g0
        public f0 J0(int i10, int i11, Map<y1.a, Integer> map, zd.l<? super t0.a, md.i0> lVar) {
            return this.f23325a.J0(i10, i11, map, lVar);
        }

        @Override // w2.d
        public long N(long j10) {
            return this.f23325a.N(j10);
        }

        @Override // w2.l
        public float Q(long j10) {
            return this.f23325a.Q(j10);
        }

        @Override // w2.d
        public int a1(float f10) {
            return this.f23325a.a1(f10);
        }

        @Override // w2.l
        public long g(float f10) {
            return this.f23325a.g(f10);
        }

        @Override // w2.d
        public float getDensity() {
            return this.f23325a.getDensity();
        }

        @Override // y1.n
        public w2.r getLayoutDirection() {
            return this.f23325a.getLayoutDirection();
        }

        @Override // w2.d
        public float l0(int i10) {
            return this.f23325a.l0(i10);
        }

        @Override // w2.d
        public float n0(float f10) {
            return this.f23325a.n0(f10);
        }

        @Override // w2.d
        public float o1(long j10) {
            return this.f23325a.o1(j10);
        }

        @Override // w2.d
        public long q(float f10) {
            return this.f23325a.q(f10);
        }

        @Override // w2.d
        public long w(long j10) {
            return this.f23325a.w(j10);
        }

        @Override // w2.l
        public float y0() {
            return this.f23325a.y0();
        }
    }

    private final class c implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w2.r f23327a = w2.r.Rtl;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f23328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f23329c;

        public static final class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f23331a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f23332b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map<y1.a, Integer> f23333c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f23334d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ x f23335e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ zd.l<t0.a, md.i0> f23336f;

            /* JADX WARN: Multi-variable type inference failed */
            a(int i10, int i11, Map<y1.a, Integer> map, c cVar, x xVar, zd.l<? super t0.a, md.i0> lVar) {
                this.f23331a = i10;
                this.f23332b = i11;
                this.f23333c = map;
                this.f23334d = cVar;
                this.f23335e = xVar;
                this.f23336f = lVar;
            }

            @Override // y1.f0
            public void a() {
                a2.p0 p0VarZ1;
                if (!this.f23334d.C0() || (p0VarZ1 = this.f23335e.f23303a.N().Z1()) == null) {
                    this.f23336f.invoke(this.f23335e.f23303a.N().R0());
                } else {
                    this.f23336f.invoke(p0VarZ1.R0());
                }
            }

            @Override // y1.f0
            public Map<y1.a, Integer> d() {
                return this.f23333c;
            }

            @Override // y1.f0
            public int getHeight() {
                return this.f23332b;
            }

            @Override // y1.f0
            public int getWidth() {
                return this.f23331a;
            }
        }

        public c() {
        }

        @Override // y1.n
        public boolean C0() {
            return x.this.f23303a.U() == f0.e.LookaheadLayingOut || x.this.f23303a.U() == f0.e.LookaheadMeasuring;
        }

        @Override // y1.d1
        public List<d0> F0(Object obj, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
            return x.this.K(obj, pVar);
        }

        @Override // y1.g0
        public f0 J0(int i10, int i11, Map<y1.a, Integer> map, zd.l<? super t0.a, md.i0> lVar) {
            if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
                return new a(i10, i11, map, this, x.this, lVar);
            }
            throw new IllegalStateException(("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }

        public void d(float f10) {
            this.f23328b = f10;
        }

        public void f(float f10) {
            this.f23329c = f10;
        }

        @Override // w2.d
        public float getDensity() {
            return this.f23328b;
        }

        @Override // y1.n
        public w2.r getLayoutDirection() {
            return this.f23327a;
        }

        public void j(w2.r rVar) {
            this.f23327a = rVar;
        }

        @Override // w2.l
        public float y0() {
            return this.f23329c;
        }
    }

    public static final class d extends f0.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.p<d1, w2.b, f0> f23338c;

        public static final class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ f0 f23339a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f23340b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f23341c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f0 f23342d;

            public a(f0 f0Var, x xVar, int i10, f0 f0Var2) {
                this.f23340b = xVar;
                this.f23341c = i10;
                this.f23342d = f0Var2;
                this.f23339a = f0Var;
            }

            @Override // y1.f0
            public void a() {
                this.f23340b.f23307e = this.f23341c;
                this.f23342d.a();
                this.f23340b.y();
            }

            @Override // y1.f0
            public Map<y1.a, Integer> d() {
                return this.f23339a.d();
            }

            @Override // y1.f0
            public int getHeight() {
                return this.f23339a.getHeight();
            }

            @Override // y1.f0
            public int getWidth() {
                return this.f23339a.getWidth();
            }
        }

        public static final class b implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ f0 f23343a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f23344b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f23345c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f0 f23346d;

            public b(f0 f0Var, x xVar, int i10, f0 f0Var2) {
                this.f23344b = xVar;
                this.f23345c = i10;
                this.f23346d = f0Var2;
                this.f23343a = f0Var;
            }

            @Override // y1.f0
            public void a() {
                this.f23344b.f23306d = this.f23345c;
                this.f23346d.a();
                x xVar = this.f23344b;
                xVar.x(xVar.f23306d);
            }

            @Override // y1.f0
            public Map<y1.a, Integer> d() {
                return this.f23343a.d();
            }

            @Override // y1.f0
            public int getHeight() {
                return this.f23343a.getHeight();
            }

            @Override // y1.f0
            public int getWidth() {
                return this.f23343a.getWidth();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(zd.p<? super d1, ? super w2.b, ? extends f0> pVar, String str) {
            super(str);
            this.f23338c = pVar;
        }

        @Override // y1.e0
        public f0 a(g0 g0Var, List<? extends d0> list, long j10) {
            x.this.f23310h.j(g0Var.getLayoutDirection());
            x.this.f23310h.d(g0Var.getDensity());
            x.this.f23310h.f(g0Var.y0());
            if (g0Var.C0() || x.this.f23303a.Y() == null) {
                x.this.f23306d = 0;
                f0 f0VarInvoke = this.f23338c.invoke(x.this.f23310h, w2.b.b(j10));
                return new b(f0VarInvoke, x.this, x.this.f23306d, f0VarInvoke);
            }
            x.this.f23307e = 0;
            f0 f0VarInvoke2 = this.f23338c.invoke(x.this.f23311i, w2.b.b(j10));
            return new a(f0VarInvoke2, x.this, x.this.f23307e, f0VarInvoke2);
        }
    }

    static final class e extends ae.s implements zd.l<Map.Entry<Object, c1.a>, Boolean> {
        e() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry<Object, c1.a> entry) {
            boolean z10;
            Object key = entry.getKey();
            c1.a value = entry.getValue();
            int iQ = x.this.f23315m.q(key);
            if (iQ < 0 || iQ >= x.this.f23307e) {
                value.dispose();
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class f implements c1.a {
        f() {
        }

        @Override // y1.c1.a
        public void dispose() {
        }
    }

    public static final class g implements c1.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f23349b;

        g(Object obj) {
            this.f23349b = obj;
        }

        @Override // y1.c1.a
        public int a() {
            List<a2.f0> listF;
            a2.f0 f0Var = (a2.f0) x.this.f23312j.get(this.f23349b);
            if (f0Var == null || (listF = f0Var.F()) == null) {
                return 0;
            }
            return listF.size();
        }

        @Override // y1.c1.a
        public void b(int i10, long j10) {
            a2.f0 f0Var = (a2.f0) x.this.f23312j.get(this.f23349b);
            if (f0Var == null || !f0Var.G0()) {
                return;
            }
            int size = f0Var.F().size();
            if (i10 < 0 || i10 >= size) {
                throw new IndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + size + ')');
            }
            if (!(!f0Var.j())) {
                throw new IllegalArgumentException("Pre-measure called on node that is not placed".toString());
            }
            a2.f0 f0Var2 = x.this.f23303a;
            f0Var2.f84n = true;
            a2.j0.b(f0Var).l(f0Var.F().get(i10), j10);
            f0Var2.f84n = false;
        }

        @Override // y1.c1.a
        public void dispose() {
            x.this.B();
            a2.f0 f0Var = (a2.f0) x.this.f23312j.remove(this.f23349b);
            if (f0Var != null) {
                if (!(x.this.f23317o > 0)) {
                    throw new IllegalStateException("No pre-composed items to dispose".toString());
                }
                int iIndexOf = x.this.f23303a.K().indexOf(f0Var);
                if (!(iIndexOf >= x.this.f23303a.K().size() - x.this.f23317o)) {
                    throw new IllegalStateException("Item is not in pre-composed item range".toString());
                }
                x.this.f23316n++;
                x xVar = x.this;
                xVar.f23317o--;
                int size = (x.this.f23303a.K().size() - x.this.f23317o) - x.this.f23316n;
                x.this.D(iIndexOf, size, 1);
                x.this.x(size);
            }
        }
    }

    static final class h extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f23350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f23351b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(a aVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
            super(2);
            this.f23350a = aVar;
            this.f23351b = pVar;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (t0.o.I()) {
                t0.o.U(-1750409193, i10, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:477)");
            }
            boolean zA = this.f23350a.a();
            zd.p<t0.l, Integer, md.i0> pVar = this.f23351b;
            lVar.u(207, Boolean.valueOf(zA));
            boolean zC = lVar.c(zA);
            if (zA) {
                pVar.invoke(lVar, 0);
            } else {
                lVar.n(zC);
            }
            lVar.d();
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    public x(a2.f0 f0Var, e1 e1Var) {
        this.f23303a = f0Var;
        this.f23305c = e1Var;
    }

    private final Object A(int i10) {
        a aVar = this.f23308f.get(this.f23303a.K().get(i10));
        ae.r.c(aVar);
        return aVar.f();
    }

    private final void C(boolean z10) {
        this.f23317o = 0;
        this.f23312j.clear();
        int size = this.f23303a.K().size();
        if (this.f23316n != size) {
            this.f23316n = size;
            d1.k kVarC = d1.k.f9368e.c();
            try {
                d1.k kVarL = kVarC.l();
                for (int i10 = 0; i10 < size; i10++) {
                    try {
                        a2.f0 f0Var = this.f23303a.K().get(i10);
                        a aVar = this.f23308f.get(f0Var);
                        if (aVar != null && aVar.a()) {
                            H(f0Var);
                            if (z10) {
                                m2 m2VarB = aVar.b();
                                if (m2VarB != null) {
                                    m2VarB.deactivate();
                                }
                                aVar.h(k3.e(Boolean.FALSE, null, 2, null));
                            } else {
                                aVar.g(false);
                            }
                            aVar.m(b1.f23202a);
                        }
                    } finally {
                        kVarC.s(kVarL);
                    }
                }
                md.i0 i0Var = md.i0.f15558a;
                kVarC.d();
                this.f23309g.clear();
            } catch (Throwable th) {
                kVarC.d();
                throw th;
            }
        }
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i10, int i11, int i12) {
        a2.f0 f0Var = this.f23303a;
        f0Var.f84n = true;
        this.f23303a.S0(i10, i11, i12);
        f0Var.f84n = false;
    }

    static /* synthetic */ void E(x xVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        xVar.D(i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<d0> F(Object obj, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
        if (!(this.f23315m.o() >= this.f23307e)) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
        }
        int iO = this.f23315m.o();
        int i10 = this.f23307e;
        if (iO == i10) {
            this.f23315m.b(obj);
        } else {
            this.f23315m.A(i10, obj);
        }
        this.f23307e++;
        if (!this.f23312j.containsKey(obj)) {
            this.f23314l.put(obj, G(obj, pVar));
            if (this.f23303a.U() == f0.e.LayingOut) {
                this.f23303a.d1(true);
            } else {
                a2.f0.g1(this.f23303a, true, false, 2, null);
            }
        }
        a2.f0 f0Var = this.f23312j.get(obj);
        if (f0Var == null) {
            return nd.u.m();
        }
        List<k0.b> listZ0 = f0Var.a0().Z0();
        int size = listZ0.size();
        for (int i11 = 0; i11 < size; i11++) {
            listZ0.get(i11).x1();
        }
        return listZ0;
    }

    private final void H(a2.f0 f0Var) {
        k0.b bVarA0 = f0Var.a0();
        f0.g gVar = f0.g.NotUsed;
        bVarA0.J1(gVar);
        k0.a aVarX = f0Var.X();
        if (aVarX != null) {
            aVarX.D1(gVar);
        }
    }

    private final void L(a2.f0 f0Var, Object obj, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
        HashMap<a2.f0, a> map = this.f23308f;
        a aVar = map.get(f0Var);
        if (aVar == null) {
            aVar = new a(obj, y1.e.f23233a.a(), null, 4, null);
            map.put(f0Var, aVar);
        }
        a aVar2 = aVar;
        m2 m2VarB = aVar2.b();
        boolean zQ = m2VarB != null ? m2VarB.q() : true;
        if (aVar2.c() != pVar || zQ || aVar2.d()) {
            aVar2.j(pVar);
            M(f0Var, aVar2);
            aVar2.k(false);
        }
    }

    private final void M(a2.f0 f0Var, a aVar) {
        d1.k kVarC = d1.k.f9368e.c();
        try {
            d1.k kVarL = kVarC.l();
            try {
                a2.f0 f0Var2 = this.f23303a;
                f0Var2.f84n = true;
                zd.p<t0.l, Integer, md.i0> pVarC = aVar.c();
                m2 m2VarB = aVar.b();
                t0.q qVar = this.f23304b;
                if (qVar == null) {
                    throw new IllegalStateException("parent composition reference not set".toString());
                }
                aVar.i(N(m2VarB, f0Var, aVar.e(), qVar, b1.c.c(-1750409193, true, new h(aVar, pVarC))));
                aVar.l(false);
                f0Var2.f84n = false;
                md.i0 i0Var = md.i0.f15558a;
            } finally {
                kVarC.s(kVarL);
            }
        } finally {
            kVarC.d();
        }
    }

    private final m2 N(m2 m2Var, a2.f0 f0Var, boolean z10, t0.q qVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
        if (m2Var == null || m2Var.h()) {
            m2Var = androidx.compose.ui.platform.g0.a(f0Var, qVar);
        }
        if (z10) {
            m2Var.c(pVar);
        } else {
            m2Var.b(pVar);
        }
        return m2Var;
    }

    private final a2.f0 O(Object obj) {
        int i10;
        if (this.f23316n == 0) {
            return null;
        }
        int size = this.f23303a.K().size() - this.f23317o;
        int i11 = size - this.f23316n;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < i11) {
                i10 = -1;
                break;
            }
            if (ae.r.b(A(i13), obj)) {
                i10 = i13;
                break;
            }
            i13--;
        }
        if (i10 == -1) {
            while (i12 >= i11) {
                a aVar = this.f23308f.get(this.f23303a.K().get(i12));
                ae.r.c(aVar);
                a aVar2 = aVar;
                if (aVar2.f() == b1.f23202a || this.f23305c.a(obj, aVar2.f())) {
                    aVar2.m(obj);
                    i13 = i12;
                    i10 = i13;
                    break;
                }
                i12--;
            }
            i13 = i12;
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            D(i13, i11, 1);
        }
        this.f23316n--;
        a2.f0 f0Var = this.f23303a.K().get(i11);
        a aVar3 = this.f23308f.get(f0Var);
        ae.r.c(aVar3);
        a aVar4 = aVar3;
        aVar4.h(k3.e(Boolean.TRUE, null, 2, null));
        aVar4.l(true);
        aVar4.k(true);
        return f0Var;
    }

    private final a2.f0 v(int i10) {
        a2.f0 f0Var = new a2.f0(true, 0, 2, null);
        a2.f0 f0Var2 = this.f23303a;
        f0Var2.f84n = true;
        this.f23303a.x0(i10, f0Var);
        f0Var2.f84n = false;
        return f0Var;
    }

    private final void w() {
        a2.f0 f0Var = this.f23303a;
        f0Var.f84n = true;
        Iterator<T> it = this.f23308f.values().iterator();
        while (it.hasNext()) {
            m2 m2VarB = ((a) it.next()).b();
            if (m2VarB != null) {
                m2VarB.dispose();
            }
        }
        this.f23303a.a1();
        f0Var.f84n = false;
        this.f23308f.clear();
        this.f23309g.clear();
        this.f23317o = 0;
        this.f23316n = 0;
        this.f23312j.clear();
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        nd.z.H(this.f23314l.entrySet(), new e());
    }

    public final void B() {
        int size = this.f23303a.K().size();
        if (!(this.f23308f.size() == size)) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f23308f.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.f23316n) - this.f23317o >= 0) {
            if (this.f23312j.size() == this.f23317o) {
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f23317o + ". Map size " + this.f23312j.size()).toString());
        }
        throw new IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.f23316n + ". Precomposed children " + this.f23317o).toString());
    }

    public final c1.a G(Object obj, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
        if (!this.f23303a.G0()) {
            return new f();
        }
        B();
        if (!this.f23309g.containsKey(obj)) {
            this.f23314l.remove(obj);
            HashMap<Object, a2.f0> map = this.f23312j;
            a2.f0 f0VarO = map.get(obj);
            if (f0VarO == null) {
                f0VarO = O(obj);
                if (f0VarO != null) {
                    D(this.f23303a.K().indexOf(f0VarO), this.f23303a.K().size(), 1);
                } else {
                    f0VarO = v(this.f23303a.K().size());
                }
                this.f23317o++;
                map.put(obj, f0VarO);
            }
            L(f0VarO, obj, pVar);
        }
        return new g(obj);
    }

    public final void I(t0.q qVar) {
        this.f23304b = qVar;
    }

    public final void J(e1 e1Var) {
        if (this.f23305c != e1Var) {
            this.f23305c = e1Var;
            C(false);
            a2.f0.k1(this.f23303a, false, false, 3, null);
        }
    }

    public final List<d0> K(Object obj, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
        B();
        f0.e eVarU = this.f23303a.U();
        f0.e eVar = f0.e.Measuring;
        if (!(eVarU == eVar || eVarU == f0.e.LayingOut || eVarU == f0.e.LookaheadMeasuring || eVarU == f0.e.LookaheadLayingOut)) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }
        HashMap<Object, a2.f0> map = this.f23309g;
        a2.f0 f0VarRemove = map.get(obj);
        if (f0VarRemove == null) {
            f0VarRemove = this.f23312j.remove(obj);
            if (f0VarRemove != null) {
                int i10 = this.f23317o;
                if (!(i10 > 0)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                this.f23317o = i10 - 1;
            } else {
                f0VarRemove = O(obj);
                if (f0VarRemove == null) {
                    f0VarRemove = v(this.f23306d);
                }
            }
            map.put(obj, f0VarRemove);
        }
        a2.f0 f0Var = f0VarRemove;
        if (nd.c0.b0(this.f23303a.K(), this.f23306d) != f0Var) {
            int iIndexOf = this.f23303a.K().indexOf(f0Var);
            int i11 = this.f23306d;
            if (!(iIndexOf >= i11)) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i11 != iIndexOf) {
                E(this, iIndexOf, i11, 0, 4, null);
            }
        }
        this.f23306d++;
        L(f0Var, obj, pVar);
        return (eVarU == eVar || eVarU == f0.e.LayingOut) ? f0Var.E() : f0Var.D();
    }

    @Override // t0.j
    public void f() {
        w();
    }

    @Override // t0.j
    public void k() {
        C(true);
    }

    @Override // t0.j
    public void m() {
        C(false);
    }

    public final e0 u(zd.p<? super d1, ? super w2.b, ? extends f0> pVar) {
        return new d(pVar, this.f23318p);
    }

    public final void x(int i10) {
        boolean z10 = false;
        this.f23316n = 0;
        int size = (this.f23303a.K().size() - this.f23317o) - 1;
        if (i10 <= size) {
            this.f23313k.clear();
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    this.f23313k.add(A(i11));
                    if (i11 == size) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f23305c.b(this.f23313k);
            d1.k kVarC = d1.k.f9368e.c();
            try {
                d1.k kVarL = kVarC.l();
                boolean z11 = false;
                while (size >= i10) {
                    try {
                        a2.f0 f0Var = this.f23303a.K().get(size);
                        a aVar = this.f23308f.get(f0Var);
                        ae.r.c(aVar);
                        a aVar2 = aVar;
                        Object objF = aVar2.f();
                        if (this.f23313k.contains(objF)) {
                            this.f23316n++;
                            if (aVar2.a()) {
                                H(f0Var);
                                aVar2.g(false);
                                z11 = true;
                            }
                        } else {
                            a2.f0 f0Var2 = this.f23303a;
                            f0Var2.f84n = true;
                            this.f23308f.remove(f0Var);
                            m2 m2VarB = aVar2.b();
                            if (m2VarB != null) {
                                m2VarB.dispose();
                            }
                            this.f23303a.b1(size, 1);
                            f0Var2.f84n = false;
                        }
                        this.f23309g.remove(objF);
                        size--;
                    } finally {
                        kVarC.s(kVarL);
                    }
                }
                md.i0 i0Var = md.i0.f15558a;
                kVarC.d();
                z10 = z11;
            } catch (Throwable th) {
                kVarC.d();
                throw th;
            }
        }
        if (z10) {
            d1.k.f9368e.k();
        }
        B();
    }

    public final void z() {
        if (this.f23316n != this.f23303a.K().size()) {
            Iterator<Map.Entry<a2.f0, a>> it = this.f23308f.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().k(true);
            }
            if (this.f23303a.b0()) {
                return;
            }
            a2.f0.k1(this.f23303a, false, false, 3, null);
        }
    }
}
