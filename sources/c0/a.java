package c0;

import c0.q;
import java.util.concurrent.CancellationException;
import t0.k3;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class a<T, V extends q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j1<T, V> f5891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f5892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k<T, V> f5894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t0.k1 f5895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t0.k1 f5896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v0 f5897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a1<T> f5898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final V f5899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final V f5900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private V f5901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private V f5902l;

    /* JADX INFO: renamed from: c0.a$a, reason: collision with other inner class name */
    @sd.d(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {312}, m = "invokeSuspend")
    static final class C0143a extends sd.j implements zd.l<qd.d<? super g<T, V>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f5903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f5904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f5905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a<T, V> f5906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f5907e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d<T, V> f5908f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f5909g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ zd.l<a<T, V>, md.i0> f5910h;

        /* JADX INFO: renamed from: c0.a$a$a, reason: collision with other inner class name */
        static final class C0144a extends ae.s implements zd.l<h<T, V>, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a<T, V> f5911a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k<T, V> f5912b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ zd.l<a<T, V>, md.i0> f5913c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ae.d0 f5914d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0144a(a<T, V> aVar, k<T, V> kVar, zd.l<? super a<T, V>, md.i0> lVar, ae.d0 d0Var) {
                super(1);
                this.f5911a = aVar;
                this.f5912b = kVar;
                this.f5913c = lVar;
                this.f5914d = d0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(h<T, V> hVar) {
                d1.m(hVar, this.f5911a.j());
                Object objH = this.f5911a.h(hVar.e());
                if (ae.r.b(objH, hVar.e())) {
                    zd.l<a<T, V>, md.i0> lVar = this.f5913c;
                    if (lVar != null) {
                        lVar.invoke(this.f5911a);
                        return;
                    }
                    return;
                }
                this.f5911a.j().s(objH);
                this.f5912b.s((T) objH);
                zd.l<a<T, V>, md.i0> lVar2 = this.f5913c;
                if (lVar2 != null) {
                    lVar2.invoke(this.f5911a);
                }
                hVar.a();
                this.f5914d.f699a = true;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(Object obj) {
                a((h) obj);
                return md.i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0143a(a<T, V> aVar, T t10, d<T, V> dVar, long j10, zd.l<? super a<T, V>, md.i0> lVar, qd.d<? super C0143a> dVar2) {
            super(1, dVar2);
            this.f5906d = aVar;
            this.f5907e = t10;
            this.f5908f = dVar;
            this.f5909g = j10;
            this.f5910h = lVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(qd.d<? super g<T, V>> dVar) {
            return ((C0143a) create(dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(qd.d<?> dVar) {
            return new C0143a(this.f5906d, this.f5907e, this.f5908f, this.f5909g, this.f5910h, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            k kVar;
            ae.d0 d0Var;
            Object objE = rd.d.e();
            int i10 = this.f5905c;
            try {
                if (i10 == 0) {
                    md.u.b(obj);
                    this.f5906d.j().v(this.f5906d.l().a().invoke(this.f5907e));
                    this.f5906d.s(this.f5908f.g());
                    this.f5906d.r(true);
                    k kVarD = l.d(this.f5906d.j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    ae.d0 d0Var2 = new ae.d0();
                    d<T, V> dVar = this.f5908f;
                    long j10 = this.f5909g;
                    C0144a c0144a = new C0144a(this.f5906d, kVarD, this.f5910h, d0Var2);
                    this.f5903a = kVarD;
                    this.f5904b = d0Var2;
                    this.f5905c = 1;
                    if (d1.c(kVarD, dVar, j10, c0144a, this) == objE) {
                        return objE;
                    }
                    kVar = kVarD;
                    d0Var = d0Var2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d0Var = (ae.d0) this.f5904b;
                    kVar = (k) this.f5903a;
                    md.u.b(obj);
                }
                e eVar = d0Var.f699a ? e.BoundReached : e.Finished;
                this.f5906d.i();
                return new g(kVar, eVar);
            } catch (CancellationException e10) {
                this.f5906d.i();
                throw e10;
            }
        }
    }

    @sd.d(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.l<qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f5915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T, V> f5916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f5917c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<T, V> aVar, T t10, qd.d<? super b> dVar) {
            super(1, dVar);
            this.f5916b = aVar;
            this.f5917c = t10;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(qd.d<? super md.i0> dVar) {
            return ((b) create(dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(qd.d<?> dVar) {
            return new b(this.f5916b, this.f5917c, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f5915a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            md.u.b(obj);
            this.f5916b.i();
            Object objH = this.f5916b.h(this.f5917c);
            this.f5916b.j().s(objH);
            this.f5916b.s(objH);
            return md.i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    static final class c extends sd.j implements zd.l<qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f5918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T, V> f5919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<T, V> aVar, qd.d<? super c> dVar) {
            super(1, dVar);
            this.f5919b = aVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(qd.d<? super md.i0> dVar) {
            return ((c) create(dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(qd.d<?> dVar) {
            return new c(this.f5919b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f5918a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            md.u.b(obj);
            this.f5919b.i();
            return md.i0.f15558a;
        }
    }

    public a(T t10, j1<T, V> j1Var, T t11, String str) {
        this.f5891a = j1Var;
        this.f5892b = t11;
        this.f5893c = str;
        this.f5894d = new k<>(j1Var, t10, null, 0L, 0L, false, 60, null);
        this.f5895e = k3.e(Boolean.FALSE, null, 2, null);
        this.f5896f = k3.e(t10, null, 2, null);
        this.f5897g = new v0();
        this.f5898h = new a1<>(0.0f, 0.0f, t11, 3, null);
        q qVarO = o();
        V v10 = qVarO instanceof m ? c0.b.f5927e : qVarO instanceof n ? c0.b.f5928f : qVarO instanceof o ? c0.b.f5929g : c0.b.f5930h;
        ae.r.d(v10, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f5899i = v10;
        q qVarO2 = o();
        V v11 = qVarO2 instanceof m ? c0.b.f5923a : qVarO2 instanceof n ? c0.b.f5924b : qVarO2 instanceof o ? c0.b.f5925c : c0.b.f5926d;
        ae.r.d(v11, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f5900j = v11;
        this.f5901k = v10;
        this.f5902l = v11;
    }

    public /* synthetic */ a(Object obj, j1 j1Var, Object obj2, String str, int i10, ae.j jVar) {
        this(obj, j1Var, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object f(a aVar, Object obj, i iVar, Object obj2, zd.l lVar, qd.d dVar, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            iVar = aVar.f5898h;
        }
        i iVar2 = iVar;
        if ((i10 & 4) != 0) {
            obj2 = aVar.n();
        }
        Object obj4 = obj2;
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        return aVar.e(obj, iVar2, obj4, lVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T h(T t10) {
        if (ae.r.b(this.f5901k, this.f5899i) && ae.r.b(this.f5902l, this.f5900j)) {
            return t10;
        }
        V vInvoke = this.f5891a.a().invoke(t10);
        int iB = vInvoke.b();
        boolean z10 = false;
        for (int i10 = 0; i10 < iB; i10++) {
            if (vInvoke.a(i10) < this.f5901k.a(i10) || vInvoke.a(i10) > this.f5902l.a(i10)) {
                vInvoke.e(i10, ge.o.k(vInvoke.a(i10), this.f5901k.a(i10), this.f5902l.a(i10)));
                z10 = true;
            }
        }
        return z10 ? this.f5891a.b().invoke(vInvoke) : t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        k<T, V> kVar = this.f5894d;
        kVar.l().d();
        kVar.p(Long.MIN_VALUE);
        r(false);
    }

    private final Object q(d<T, V> dVar, T t10, zd.l<? super a<T, V>, md.i0> lVar, qd.d<? super g<T, V>> dVar2) {
        return v0.e(this.f5897g, null, new C0143a(this, t10, dVar, this.f5894d.f(), lVar, null), dVar2, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean z10) {
        this.f5895e.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(T t10) {
        this.f5896f.setValue(t10);
    }

    public final Object e(T t10, i<T> iVar, T t11, zd.l<? super a<T, V>, md.i0> lVar, qd.d<? super g<T, V>> dVar) {
        return q(f.a(iVar, this.f5891a, m(), t10, t11), t11, lVar, dVar);
    }

    public final p3<T> g() {
        return this.f5894d;
    }

    public final k<T, V> j() {
        return this.f5894d;
    }

    public final T k() {
        return this.f5896f.getValue();
    }

    public final j1<T, V> l() {
        return this.f5891a;
    }

    public final T m() {
        return this.f5894d.getValue();
    }

    public final T n() {
        return (T) this.f5891a.b().invoke(o());
    }

    public final V o() {
        return (V) this.f5894d.l();
    }

    public final boolean p() {
        return ((Boolean) this.f5895e.getValue()).booleanValue();
    }

    public final Object t(T t10, qd.d<? super md.i0> dVar) {
        Object objE = v0.e(this.f5897g, null, new b(this, t10, null), dVar, 1, null);
        return objE == rd.d.e() ? objE : md.i0.f15558a;
    }

    public final Object u(qd.d<? super md.i0> dVar) {
        Object objE = v0.e(this.f5897g, null, new c(this, null), dVar, 1, null);
        return objE == rd.d.e() ? objE : md.i0.f15558a;
    }
}
