package j0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import le.n0;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    static final class a extends ae.s implements zd.l<g2.x, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<Object, Integer> f13668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g2.j f13670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<Float, Float, Boolean> f13671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.l<Integer, Boolean> f13672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g2.b f13673f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zd.l<Object, Integer> lVar, boolean z10, g2.j jVar, zd.p<? super Float, ? super Float, Boolean> pVar, zd.l<? super Integer, Boolean> lVar2, g2.b bVar) {
            super(1);
            this.f13668a = lVar;
            this.f13669b = z10;
            this.f13670c = jVar;
            this.f13671d = pVar;
            this.f13672e = lVar2;
            this.f13673f = bVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(g2.x xVar) {
            invoke2(xVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g2.x xVar) {
            g2.v.G(xVar, true);
            g2.v.i(xVar, this.f13668a);
            if (this.f13669b) {
                g2.v.H(xVar, this.f13670c);
            } else {
                g2.v.v(xVar, this.f13670c);
            }
            zd.p<Float, Float, Boolean> pVar = this.f13671d;
            if (pVar != null) {
                g2.v.o(xVar, null, pVar, 1, null);
            }
            zd.l<Integer, Boolean> lVar = this.f13672e;
            if (lVar != null) {
                g2.v.q(xVar, null, lVar, 1, null);
            }
            g2.v.r(xVar, this.f13673f);
        }
    }

    static final class b extends ae.s implements zd.a<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0 f13674a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e0 e0Var) {
            super(0);
            this.f13674a = e0Var;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f13674a.b());
        }
    }

    static final class c extends ae.s implements zd.a<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0 f13675a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e0 e0Var) {
            super(0);
            this.f13675a = e0Var;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f13675a.e());
        }
    }

    static final class d extends ae.s implements zd.l<Object, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a<q> f13676a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(zd.a<? extends q> aVar) {
            super(1);
            this.f13676a = aVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj) {
            q qVarInvoke = this.f13676a.invoke();
            int iC = qVarInvoke.c();
            int i10 = 0;
            while (true) {
                if (i10 >= iC) {
                    i10 = -1;
                    break;
                }
                if (ae.r.b(qVarInvoke.a(i10), obj)) {
                    break;
                }
                i10++;
            }
            return Integer.valueOf(i10);
        }
    }

    static final class e extends ae.s implements zd.p<Float, Float, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f13678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0 f13679c;

        @sd.d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", f = "LazyLayoutSemantics.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingLeft}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<n0, qd.d<? super md.i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f13680a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0 f13681b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f13682c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, float f10, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f13681b = e0Var;
                this.f13682c = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                return new a(this.f13681b, this.f13682c, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super md.i0> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f13680a;
                if (i10 == 0) {
                    md.u.b(obj);
                    e0 e0Var = this.f13681b;
                    float f10 = this.f13682c;
                    this.f13680a = 1;
                    if (e0Var.h(f10, this) == objE) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, n0 n0Var, e0 e0Var) {
            super(2);
            this.f13677a = z10;
            this.f13678b = n0Var;
            this.f13679c = e0Var;
        }

        public final Boolean a(float f10, float f11) {
            if (this.f13677a) {
                f10 = f11;
            }
            le.k.d(this.f13678b, null, null, new a(this.f13679c, f10, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Boolean invoke(Float f10, Float f11) {
            return a(f10.floatValue(), f11.floatValue());
        }
    }

    static final class f extends ae.s implements zd.l<Integer, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a<q> f13683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f13684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0 f13685c;

        @sd.d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", f = "LazyLayoutSemantics.kt", l = {100}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<n0, qd.d<? super md.i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f13686a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0 f13687b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f13688c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, int i10, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f13687b = e0Var;
                this.f13688c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                return new a(this.f13687b, this.f13688c, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super md.i0> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f13686a;
                if (i10 == 0) {
                    md.u.b(obj);
                    e0 e0Var = this.f13687b;
                    int i11 = this.f13688c;
                    this.f13686a = 1;
                    if (e0Var.f(i11, this) == objE) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(zd.a<? extends q> aVar, n0 n0Var, e0 e0Var) {
            super(1);
            this.f13683a = aVar;
            this.f13684b = n0Var;
            this.f13685c = e0Var;
        }

        public final Boolean a(int i10) {
            q qVarInvoke = this.f13683a.invoke();
            if (i10 >= 0 && i10 < qVarInvoke.c()) {
                le.k.d(this.f13684b, null, null, new a(this.f13685c, i10, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i10 + ", it is out of bounds [0, " + qVarInvoke.c() + ')').toString());
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, zd.a<? extends q> aVar, e0 e0Var, e0.r rVar, boolean z10, boolean z11, t0.l lVar, int i10) {
        lVar.e(1070136913);
        if (t0.o.I()) {
            t0.o.U(1070136913, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        lVar.e(773894976);
        lVar.e(-492369756);
        Object objF = lVar.f();
        if (objF == t0.l.f20813a.a()) {
            t0.z zVar = new t0.z(t0.l0.g(qd.h.f19040a, lVar));
            lVar.E(zVar);
            objF = zVar;
        }
        lVar.K();
        n0 n0VarA = ((t0.z) objF).a();
        lVar.K();
        Object[] objArr = {aVar, e0Var, rVar, Boolean.valueOf(z10)};
        lVar.e(-568225417);
        boolean zN = false;
        for (int i11 = 0; i11 < 4; i11++) {
            zN |= lVar.N(objArr[i11]);
        }
        Object objF2 = lVar.f();
        if (zN || objF2 == t0.l.f20813a.a()) {
            boolean z12 = rVar == e0.r.Vertical;
            objF2 = g2.o.d(androidx.compose.ui.e.f2662a, false, new a(new d(aVar), z12, new g2.j(new b(e0Var), new c(e0Var), z11), z10 ? new e(z12, n0VarA, e0Var) : null, z10 ? new f(aVar, n0VarA, e0Var) : null, e0Var.d()), 1, null);
            lVar.E(objF2);
        }
        lVar.K();
        androidx.compose.ui.e eVarH = eVar.h((androidx.compose.ui.e) objF2);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return eVarH;
    }
}
