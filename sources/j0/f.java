package j0;

import c0.a1;
import c0.l1;
import com.google.android.gms.common.api.a;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import le.n0;
import t0.h1;
import t0.k1;
import t0.k3;
import t0.v1;
import w2.n;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f13639m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f13640n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f13641o = w2.o.a(a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f13642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c0.e0<Float> f13643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c0.e0<w2.n> f13644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k1 f13645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k1 f13646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f13647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0.a<w2.n, c0.n> f13648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0.a<Float, c0.m> f13649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k1 f13650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h1 f13651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final zd.l<androidx.compose.ui.graphics.d, md.i0> f13652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f13653l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return f.f13641o;
        }
    }

    @sd.d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1", f = "LazyLayoutAnimation.kt", l = {127, 133}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f13654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13655b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0.e0<w2.n> f13657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f13658e;

        static final class a extends ae.s implements zd.l<c0.a<w2.n, c0.n>, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f13659a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f13660b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, long j10) {
                super(1);
                this.f13659a = fVar;
                this.f13660b = j10;
            }

            public final void a(c0.a<w2.n, c0.n> aVar) {
                f fVar = this.f13659a;
                long jN = aVar.m().n();
                long j10 = this.f13660b;
                fVar.p(w2.o.a(w2.n.j(jN) - w2.n.j(j10), w2.n.k(jN) - w2.n.k(j10)));
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(c0.a<w2.n, c0.n> aVar) {
                a(aVar);
                return md.i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c0.e0<w2.n> e0Var, long j10, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f13657d = e0Var;
            this.f13658e = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return f.this.new b(this.f13657d, this.f13658e, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            c0.e0 e0Var;
            c0.e0 e0Var2;
            Object objE = rd.d.e();
            int i10 = this.f13655b;
            if (i10 == 0) {
                md.u.b(obj);
                if (f.this.f13648g.p()) {
                    c0.e0<w2.n> e0Var3 = this.f13657d;
                    e0Var = e0Var3 instanceof a1 ? (a1) e0Var3 : g.f13689a;
                } else {
                    e0Var = this.f13657d;
                }
                e0Var2 = e0Var;
                if (!f.this.f13648g.p()) {
                    c0.a aVar = f.this.f13648g;
                    w2.n nVarB = w2.n.b(this.f13658e);
                    this.f13654a = e0Var2;
                    this.f13655b = 1;
                    if (aVar.t(nVarB, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    md.u.b(obj);
                    f.this.o(false);
                    return md.i0.f15558a;
                }
                e0Var2 = (c0.e0) this.f13654a;
                md.u.b(obj);
            }
            c0.e0 e0Var4 = e0Var2;
            long jN = ((w2.n) f.this.f13648g.m()).n();
            long j10 = this.f13658e;
            long jA = w2.o.a(w2.n.j(jN) - w2.n.j(j10), w2.n.k(jN) - w2.n.k(j10));
            c0.a aVar2 = f.this.f13648g;
            w2.n nVarB2 = w2.n.b(jA);
            a aVar3 = new a(f.this, jA);
            this.f13654a = null;
            this.f13655b = 2;
            if (c0.a.f(aVar2, nVarB2, e0Var4, null, aVar3, this, 4, null) == objE) {
                return objE;
            }
            f.this.o(false);
            return md.i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$cancelPlacementAnimation$1", f = "LazyLayoutAnimation.kt", l = {R.styleable.AppCompatTheme_ratingBarStyle}, m = "invokeSuspend")
    static final class c extends sd.j implements zd.p<n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13661a;

        c(qd.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return f.this.new c(dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((c) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f13661a;
            if (i10 == 0) {
                md.u.b(obj);
                c0.a aVar = f.this.f13648g;
                w2.n nVarB = w2.n.b(w2.n.f22418b.a());
                this.f13661a = 1;
                if (aVar.t(nVarB, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            f.this.p(w2.n.f22418b.a());
            f.this.o(false);
            return md.i0.f15558a;
        }
    }

    static final class d extends ae.s implements zd.l<androidx.compose.ui.graphics.d, md.i0> {
        d() {
            super(1);
        }

        public final void a(androidx.compose.ui.graphics.d dVar) {
            dVar.b(f.this.j());
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(androidx.compose.ui.graphics.d dVar) {
            a(dVar);
            return md.i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$stopAnimations$1", f = "LazyLayoutAnimation.kt", l = {169}, m = "invokeSuspend")
    static final class e extends sd.j implements zd.p<n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13664a;

        e(qd.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return f.this.new e(dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((e) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f13664a;
            if (i10 == 0) {
                md.u.b(obj);
                c0.a aVar = f.this.f13648g;
                this.f13664a = 1;
                if (aVar.u(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return md.i0.f15558a;
        }
    }

    /* JADX INFO: renamed from: j0.f$f, reason: collision with other inner class name */
    @sd.d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$stopAnimations$2", f = "LazyLayoutAnimation.kt", l = {175}, m = "invokeSuspend")
    static final class C0319f extends sd.j implements zd.p<n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13666a;

        C0319f(qd.d<? super C0319f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return f.this.new C0319f(dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((C0319f) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f13666a;
            if (i10 == 0) {
                md.u.b(obj);
                c0.a aVar = f.this.f13649h;
                this.f13666a = 1;
                if (aVar.u(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return md.i0.f15558a;
        }
    }

    public f(n0 n0Var) {
        this.f13642a = n0Var;
        Boolean bool = Boolean.FALSE;
        this.f13645d = k3.e(bool, null, 2, null);
        this.f13646e = k3.e(bool, null, 2, null);
        long j10 = f13641o;
        this.f13647f = j10;
        n.a aVar = w2.n.f22418b;
        this.f13648g = new c0.a<>(w2.n.b(aVar.a()), l1.i(aVar), null, null, 12, null);
        this.f13649h = new c0.a<>(Float.valueOf(1.0f), l1.b(ae.l.f718a), null, null, 12, null);
        this.f13650i = k3.e(w2.n.b(aVar.a()), null, 2, null);
        this.f13651j = v1.a(1.0f);
        this.f13652k = new d();
        this.f13653l = j10;
    }

    private final void m(boolean z10) {
        this.f13646e.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z10) {
        this.f13645d.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(long j10) {
        this.f13650i.setValue(w2.n.b(j10));
    }

    private final void s(float f10) {
        this.f13651j.h(f10);
    }

    public final void f(long j10) {
        c0.e0<w2.n> e0Var = this.f13644c;
        if (e0Var == null) {
            return;
        }
        long jH = h();
        long jA = w2.o.a(w2.n.j(jH) - w2.n.j(j10), w2.n.k(jH) - w2.n.k(j10));
        p(jA);
        o(true);
        le.k.d(this.f13642a, null, null, new b(e0Var, jA, null), 3, null);
    }

    public final void g() {
        if (l()) {
            le.k.d(this.f13642a, null, null, new c(null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long h() {
        return ((w2.n) this.f13650i.getValue()).n();
    }

    public final long i() {
        return this.f13647f;
    }

    public final float j() {
        return this.f13651j.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k() {
        return ((Boolean) this.f13646e.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l() {
        return ((Boolean) this.f13645d.getValue()).booleanValue();
    }

    public final void n(c0.e0<Float> e0Var) {
        this.f13643b = e0Var;
    }

    public final void q(c0.e0<w2.n> e0Var) {
        this.f13644c = e0Var;
    }

    public final void r(long j10) {
        this.f13647f = j10;
    }

    public final void t() {
        if (l()) {
            o(false);
            le.k.d(this.f13642a, null, null, new e(null), 3, null);
        }
        if (k()) {
            m(false);
            le.k.d(this.f13642a, null, null, new C0319f(null), 3, null);
        }
        p(w2.n.f22418b.a());
        this.f13647f = f13641o;
        s(1.0f);
    }
}
