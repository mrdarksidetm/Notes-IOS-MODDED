package c0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.List;
import t0.e2;
import t0.f3;
import t0.k3;
import t0.o2;
import t0.p3;
import t0.y2;

/* JADX INFO: loaded from: classes.dex */
public final class f1<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h1<S> f5997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0.k1 f5999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0.k1 f6000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t0.j1 f6001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t0.j1 f6002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t0.k1 f6003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d1.v<f1<S>.d<?, ?>> f6004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d1.v<f1<?>> f6005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t0.k1 f6006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f6007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p3 f6008l;

    public final class a<T, V extends q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j1<T, V> f6009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f6010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t0.k1 f6011c = k3.e(null, null, 2, null);

        /* JADX INFO: renamed from: c0.f1$a$a, reason: collision with other inner class name */
        public final class C0145a<T, V extends q> implements p3<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f1<S>.d<T, V> f6013a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private zd.l<? super b<S>, ? extends e0<T>> f6014b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private zd.l<? super S, ? extends T> f6015c;

            public C0145a(f1<S>.d<T, V> dVar, zd.l<? super b<S>, ? extends e0<T>> lVar, zd.l<? super S, ? extends T> lVar2) {
                this.f6013a = dVar;
                this.f6014b = lVar;
                this.f6015c = lVar2;
            }

            public final f1<S>.d<T, V> c() {
                return this.f6013a;
            }

            public final zd.l<S, T> f() {
                return this.f6015c;
            }

            @Override // t0.p3
            public T getValue() {
                m(f1.this.l());
                return this.f6013a.getValue();
            }

            public final zd.l<b<S>, e0<T>> i() {
                return this.f6014b;
            }

            public final void j(zd.l<? super S, ? extends T> lVar) {
                this.f6015c = lVar;
            }

            public final void l(zd.l<? super b<S>, ? extends e0<T>> lVar) {
                this.f6014b = lVar;
            }

            public final void m(b<S> bVar) {
                T tInvoke = this.f6015c.invoke(bVar.c());
                if (!f1.this.r()) {
                    this.f6013a.G(tInvoke, this.f6014b.invoke(bVar));
                } else {
                    this.f6013a.F(this.f6015c.invoke(bVar.a()), tInvoke, this.f6014b.invoke(bVar));
                }
            }
        }

        public a(j1<T, V> j1Var, String str) {
            this.f6009a = j1Var;
            this.f6010b = str;
        }

        public final p3<T> a(zd.l<? super b<S>, ? extends e0<T>> lVar, zd.l<? super S, ? extends T> lVar2) {
            f1<S>.C0145a<T, V>.a<T, V> c0145aB = b();
            if (c0145aB == null) {
                f1<S> f1Var = f1.this;
                c0145aB = new C0145a<>(f1Var.new d(lVar2.invoke(f1Var.h()), l.e(this.f6009a, lVar2.invoke(f1.this.h())), this.f6009a, this.f6010b), lVar, lVar2);
                f1<S> f1Var2 = f1.this;
                c(c0145aB);
                f1Var2.d(c0145aB.c());
            }
            f1<S> f1Var3 = f1.this;
            c0145aB.j(lVar2);
            c0145aB.l(lVar);
            c0145aB.m(f1Var3.l());
            return c0145aB;
        }

        public final f1<S>.C0145a<T, V>.a<T, V> b() {
            return (C0145a) this.f6011c.getValue();
        }

        public final void c(f1<S>.C0145a<T, V>.a<T, V> c0145a) {
            this.f6011c.setValue(c0145a);
        }

        public final void d() {
            f1<S>.C0145a<T, V>.a<T, V> c0145aB = b();
            if (c0145aB != null) {
                f1<S> f1Var = f1.this;
                c0145aB.c().F(c0145aB.f().invoke(f1Var.l().a()), c0145aB.f().invoke(f1Var.l().c()), c0145aB.i().invoke(f1Var.l()));
            }
        }
    }

    public interface b<S> {
        S a();

        default boolean b(S s10, S s11) {
            return ae.r.b(s10, a()) && ae.r.b(s11, c());
        }

        S c();
    }

    private static final class c<S> implements b<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S f6017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final S f6018b;

        public c(S s10, S s11) {
            this.f6017a = s10;
            this.f6018b = s11;
        }

        @Override // c0.f1.b
        public S a() {
            return this.f6017a;
        }

        @Override // c0.f1.b
        public S c() {
            return this.f6018b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (ae.r.b(a(), bVar.a()) && ae.r.b(c(), bVar.c())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            S sA = a();
            int iHashCode = (sA != null ? sA.hashCode() : 0) * 31;
            S sC = c();
            return iHashCode + (sC != null ? sC.hashCode() : 0);
        }
    }

    public final class d<T, V extends q> implements p3<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j1<T, V> f6019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f6020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t0.k1 f6021c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final t0.k1 f6023e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final t0.k1 f6027i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private V f6028j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final e0<T> f6029k;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final t0.k1 f6022d = k3.e(j.g(0.0f, 0.0f, null, 7, null), null, 2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final t0.k1 f6024f = k3.e(Boolean.TRUE, null, 2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final t0.j1 f6025g = y2.a(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final t0.k1 f6026h = k3.e(Boolean.FALSE, null, 2, null);

        public d(T t10, V v10, j1<T, V> j1Var, String str) {
            T tInvoke;
            this.f6019a = j1Var;
            this.f6020b = str;
            this.f6021c = k3.e(t10, null, 2, null);
            this.f6023e = k3.e(new e1(f(), j1Var, t10, m(), v10), null, 2, null);
            this.f6027i = k3.e(t10, null, 2, null);
            this.f6028j = v10;
            Float f10 = x1.h().get(j1Var);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                V vInvoke = j1Var.a().invoke(t10);
                int iB = vInvoke.b();
                for (int i10 = 0; i10 < iB; i10++) {
                    vInvoke.e(i10, fFloatValue);
                }
                tInvoke = this.f6019a.b().invoke(vInvoke);
            } else {
                tInvoke = null;
            }
            this.f6029k = j.g(0.0f, 0.0f, tInvoke, 3, null);
        }

        private final void A(long j10) {
            this.f6025g.o(j10);
        }

        private final void B(T t10) {
            this.f6021c.setValue(t10);
        }

        private final void D(T t10, boolean z10) {
            v(new e1<>((!z10 || (f() instanceof a1)) ? f() : this.f6029k, this.f6019a, t10, m(), this.f6028j));
            f1.this.s();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void E(d dVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dVar.D(obj, z10);
        }

        private final boolean j() {
            return ((Boolean) this.f6026h.getValue()).booleanValue();
        }

        private final long l() {
            return this.f6025g.a();
        }

        private final T m() {
            return this.f6021c.getValue();
        }

        private final void v(e1<T, V> e1Var) {
            this.f6023e.setValue(e1Var);
        }

        private final void x(e0<T> e0Var) {
            this.f6022d.setValue(e0Var);
        }

        private final void z(boolean z10) {
            this.f6026h.setValue(Boolean.valueOf(z10));
        }

        public void C(T t10) {
            this.f6027i.setValue(t10);
        }

        public final void F(T t10, T t11, e0<T> e0Var) {
            B(t11);
            x(e0Var);
            if (ae.r.b(c().h(), t10) && ae.r.b(c().g(), t11)) {
                return;
            }
            E(this, t10, false, 2, null);
        }

        public final void G(T t10, e0<T> e0Var) {
            if (!ae.r.b(m(), t10) || j()) {
                B(t10);
                x(e0Var);
                E(this, null, !n(), 1, null);
                y(false);
                A(f1.this.k());
                z(false);
            }
        }

        public final e1<T, V> c() {
            return (e1) this.f6023e.getValue();
        }

        public final e0<T> f() {
            return (e0) this.f6022d.getValue();
        }

        @Override // t0.p3
        public T getValue() {
            return this.f6027i.getValue();
        }

        public final long i() {
            return c().b();
        }

        public final boolean n() {
            return ((Boolean) this.f6024f.getValue()).booleanValue();
        }

        public final void p(long j10, float f10) {
            long jB;
            if (f10 > 0.0f) {
                float fL = (j10 - l()) / f10;
                if (!(!Float.isNaN(fL))) {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f10 + ",playTimeNanos: " + j10 + ", offsetTimeNanos: " + l()).toString());
                }
                jB = (long) fL;
            } else {
                jB = c().b();
            }
            C(c().f(jB));
            this.f6028j = (V) c().d(jB);
            if (c().e(jB)) {
                y(true);
                A(0L);
            }
        }

        public final void q() {
            z(true);
        }

        public final void s(long j10) {
            C(c().f(j10));
            this.f6028j = (V) c().d(j10);
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + m() + ", spec: " + f();
        }

        public final void y(boolean z10) {
            this.f6024f.setValue(Boolean.valueOf(z10));
        }
    }

    @sd.d(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", l = {649}, m = "invokeSuspend")
    static final class e extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f6032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f1<S> f6033c;

        static final class a extends ae.s implements zd.l<Long, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f1<S> f6034a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f6035b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f1<S> f1Var, float f10) {
                super(1);
                this.f6034a = f1Var;
                this.f6035b = f10;
            }

            public final void a(long j10) {
                if (this.f6034a.r()) {
                    return;
                }
                this.f6034a.t(j10 / 1, this.f6035b);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(Long l10) {
                a(l10.longValue());
                return md.i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f1<S> f1Var, qd.d<? super e> dVar) {
            super(2, dVar);
            this.f6033c = f1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            e eVar = new e(this.f6033c, dVar);
            eVar.f6032b = obj;
            return eVar;
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((e) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            le.n0 n0Var;
            a aVar;
            Object objE = rd.d.e();
            int i10 = this.f6031a;
            if (i10 == 0) {
                md.u.b(obj);
                n0Var = (le.n0) this.f6032b;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n0Var = (le.n0) this.f6032b;
                md.u.b(obj);
            }
            do {
                aVar = new a(this.f6033c, d1.l(n0Var.getCoroutineContext()));
                this.f6032b = n0Var;
                this.f6031a = 1;
            } while (t0.d1.b(aVar, this) != objE);
            return objE;
        }
    }

    static final class f extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<S> f6036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f6037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6038c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(f1<S> f1Var, S s10, int i10) {
            super(2);
            this.f6036a = f1Var;
            this.f6037b = s10;
            this.f6038c = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            this.f6036a.f(this.f6037b, lVar, e2.a(this.f6038c | 1));
        }
    }

    static final class g extends ae.s implements zd.a<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<S> f6039a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(f1<S> f1Var) {
            super(0);
            this.f6039a = f1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            d1.v vVar = ((f1) this.f6039a).f6004h;
            int size = vVar.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                jMax = Math.max(jMax, ((d) vVar.get(i10)).i());
            }
            d1.v vVar2 = ((f1) this.f6039a).f6005i;
            int size2 = vVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                jMax = Math.max(jMax, ((f1) vVar2.get(i11)).o());
            }
            return Long.valueOf(jMax);
        }
    }

    static final class h extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<S> f6040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f6041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6042c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(f1<S> f1Var, S s10, int i10) {
            super(2);
            this.f6040a = f1Var;
            this.f6041b = s10;
            this.f6042c = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            this.f6040a.G(this.f6041b, lVar, e2.a(this.f6042c | 1));
        }
    }

    public f1(h1<S> h1Var, String str) {
        this.f5997a = h1Var;
        this.f5998b = str;
        this.f5999c = k3.e(h(), null, 2, null);
        this.f6000d = k3.e(new c(h(), h()), null, 2, null);
        this.f6001e = y2.a(0L);
        this.f6002f = y2.a(Long.MIN_VALUE);
        this.f6003g = k3.e(Boolean.TRUE, null, 2, null);
        this.f6004h = f3.f();
        this.f6005i = f3.f();
        this.f6006j = k3.e(Boolean.FALSE, null, 2, null);
        this.f6008l = f3.e(new g(this));
        h1Var.d(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f1(r0<S> r0Var, String str) {
        this((h1) r0Var, str);
        ae.r.d(r0Var, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
    }

    public f1(S s10, String str) {
        this(new r0(s10), str);
    }

    private final void C(b<S> bVar) {
        this.f6000d.setValue(bVar);
    }

    private final void D(long j10) {
        this.f6002f.o(j10);
    }

    private final long m() {
        return this.f6002f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        F(true);
        if (r()) {
            long jMax = 0;
            d1.v<f1<S>.d<?, ?>> vVar = this.f6004h;
            int size = vVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                f1<S>.d<?, ?> dVar = vVar.get(i10);
                jMax = Math.max(jMax, dVar.i());
                dVar.s(this.f6007k);
            }
            F(false);
        }
    }

    public final void A(long j10) {
        this.f6001e.o(j10);
    }

    public final void B(boolean z10) {
        this.f6006j.setValue(Boolean.valueOf(z10));
    }

    public final void E(S s10) {
        this.f5999c.setValue(s10);
    }

    public final void F(boolean z10) {
        this.f6003g.setValue(Boolean.valueOf(z10));
    }

    public final void G(S s10, t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(-583974681);
        int i11 = (i10 & 14) == 0 ? (lVarP.N(s10) ? 4 : 2) | i10 : i10;
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.N(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (t0.o.I()) {
                t0.o.U(-583974681, i11, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:608)");
            }
            if (!r() && !ae.r.b(n(), s10)) {
                C(new c(n(), s10));
                if (!ae.r.b(h(), n())) {
                    h1<S> h1Var = this.f5997a;
                    if (!(h1Var instanceof r0)) {
                        throw new IllegalStateException("Can only update the current state with MutableTransitionState".toString());
                    }
                    ((r0) h1Var).e(n());
                }
                E(s10);
                if (!q()) {
                    F(true);
                }
                d1.v<f1<S>.d<?, ?>> vVar = this.f6004h;
                int size = vVar.size();
                for (int i12 = 0; i12 < size; i12++) {
                    vVar.get(i12).q();
                }
            }
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new h(this, s10, i10));
        }
    }

    public final boolean d(f1<S>.d<?, ?> dVar) {
        return this.f6004h.add(dVar);
    }

    public final boolean e(f1<?> f1Var) {
        return this.f6005i.add(f1Var);
    }

    public final void f(S s10, t0.l lVar, int i10) {
        int i11;
        t0.l lVarP = lVar.p(-1493585151);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(s10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.N(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (t0.o.I()) {
                t0.o.U(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:639)");
            }
            if (!r()) {
                G(s10, lVarP, (i11 & 14) | (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                if (!ae.r.b(s10, h()) || q() || p()) {
                    lVarP.e(1951115890);
                    boolean zN = lVarP.N(this);
                    Object objF = lVarP.f();
                    if (zN || objF == t0.l.f20813a.a()) {
                        objF = new e(this, null);
                        lVarP.E(objF);
                    }
                    lVarP.K();
                    t0.l0.d(this, (zd.p) objF, lVarP, ((i11 >> 3) & 14) | 64);
                }
            }
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new f(this, s10, i10));
        }
    }

    public final List<f1<S>.d<?, ?>> g() {
        return this.f6004h;
    }

    public final S h() {
        return this.f5997a.a();
    }

    public final String i() {
        return this.f5998b;
    }

    public final long j() {
        return this.f6007k;
    }

    public final long k() {
        return this.f6001e.a();
    }

    public final b<S> l() {
        return (b) this.f6000d.getValue();
    }

    public final S n() {
        return (S) this.f5999c.getValue();
    }

    public final long o() {
        return ((Number) this.f6008l.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p() {
        return ((Boolean) this.f6003g.getValue()).booleanValue();
    }

    public final boolean q() {
        return m() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        return ((Boolean) this.f6006j.getValue()).booleanValue();
    }

    public final void t(long j10, float f10) {
        if (m() == Long.MIN_VALUE) {
            v(j10);
        }
        F(false);
        A(j10 - m());
        d1.v<f1<S>.d<?, ?>> vVar = this.f6004h;
        int size = vVar.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            f1<S>.d<?, ?> dVar = vVar.get(i10);
            if (!dVar.n()) {
                dVar.p(k(), f10);
            }
            if (!dVar.n()) {
                z10 = false;
            }
        }
        d1.v<f1<?>> vVar2 = this.f6005i;
        int size2 = vVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            f1<?> f1Var = vVar2.get(i11);
            if (!ae.r.b(f1Var.n(), f1Var.h())) {
                f1Var.t(k(), f10);
            }
            if (!ae.r.b(f1Var.n(), f1Var.h())) {
                z10 = false;
            }
        }
        if (z10) {
            u();
        }
    }

    public String toString() {
        List<f1<S>.d<?, ?>> listG = g();
        int size = listG.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + listG.get(i10) + ", ";
        }
        return str;
    }

    public final void u() {
        D(Long.MIN_VALUE);
        h1<S> h1Var = this.f5997a;
        if (h1Var instanceof r0) {
            ((r0) h1Var).e(n());
        }
        A(0L);
        this.f5997a.c(false);
    }

    public final void v(long j10) {
        D(j10);
        this.f5997a.c(true);
    }

    public final void w(f1<S>.a<?, ?> aVar) {
        f1<S>.d<?, ?> dVarC;
        f1<S>.C0145a<?, ?>.a<?, V> c0145aB = aVar.b();
        if (c0145aB == 0 || (dVarC = c0145aB.c()) == null) {
            return;
        }
        x(dVarC);
    }

    public final void x(f1<S>.d<?, ?> dVar) {
        this.f6004h.remove(dVar);
    }

    public final boolean y(f1<?> f1Var) {
        return this.f6005i.remove(f1Var);
    }

    public final void z(S s10, S s11, long j10) {
        D(Long.MIN_VALUE);
        this.f5997a.c(false);
        if (!r() || !ae.r.b(h(), s10) || !ae.r.b(n(), s11)) {
            if (!ae.r.b(h(), s10)) {
                h1<S> h1Var = this.f5997a;
                if (h1Var instanceof r0) {
                    ((r0) h1Var).e(s10);
                }
            }
            E(s11);
            B(true);
            C(new c(s10, s11));
        }
        d1.v<f1<?>> vVar = this.f6005i;
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            f1<?> f1Var = vVar.get(i10);
            ae.r.d(f1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (f1Var.r()) {
                f1Var.z(f1Var.h(), f1Var.n(), j10);
            }
        }
        d1.v<f1<S>.d<?, ?>> vVar2 = this.f6004h;
        int size2 = vVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            vVar2.get(i11).s(j10);
        }
        this.f6007k = j10;
    }
}
