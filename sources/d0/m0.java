package d0;

import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.ui.e;
import b2.u0;
import b2.w0;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    static final class a extends ae.s implements zd.a<n0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f9238a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(0);
            this.f9238a = i10;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            return new n0(this.f9238a);
        }
    }

    public static final class b extends ae.s implements zd.l<w0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0 f9239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0.p f9241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9243e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n0 n0Var, boolean z10, e0.p pVar, boolean z11, boolean z12) {
            super(1);
            this.f9239a = n0Var;
            this.f9240b = z10;
            this.f9241c = pVar;
            this.f9242d = z11;
            this.f9243e = z12;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("scroll");
            w0Var.a().c("state", this.f9239a);
            w0Var.a().c("reverseScrolling", Boolean.valueOf(this.f9240b));
            w0Var.a().c("flingBehavior", this.f9241c);
            w0Var.a().c("isScrollable", Boolean.valueOf(this.f9242d));
            w0Var.a().c("isVertical", Boolean.valueOf(this.f9243e));
        }
    }

    static final class c extends ae.s implements zd.q<androidx.compose.ui.e, t0.l, Integer, androidx.compose.ui.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f9246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e0.p f9248e;

        static final class a extends ae.s implements zd.l<g2.x, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f9249a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f9250b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f9251c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ n0 f9252d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ le.n0 f9253e;

            /* JADX INFO: renamed from: d0.m0$c$a$a, reason: collision with other inner class name */
            static final class C0220a extends ae.s implements zd.p<Float, Float, Boolean> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ le.n0 f9254a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f9255b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ n0 f9256c;

                /* JADX INFO: renamed from: d0.m0$c$a$a$a, reason: collision with other inner class name */
                @sd.d(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {293, 295}, m = "invokeSuspend")
                static final class C0221a extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f9257a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ boolean f9258b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ n0 f9259c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ float f9260d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ float f9261e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0221a(boolean z10, n0 n0Var, float f10, float f11, qd.d<? super C0221a> dVar) {
                        super(2, dVar);
                        this.f9258b = z10;
                        this.f9259c = n0Var;
                        this.f9260d = f10;
                        this.f9261e = f11;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                        return new C0221a(this.f9258b, this.f9259c, this.f9260d, this.f9261e, dVar);
                    }

                    @Override // zd.p
                    public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
                        return ((C0221a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objE = rd.d.e();
                        int i10 = this.f9257a;
                        if (i10 == 0) {
                            md.u.b(obj);
                            if (this.f9258b) {
                                n0 n0Var = this.f9259c;
                                ae.r.d(n0Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                float f10 = this.f9260d;
                                this.f9257a = 1;
                                if (e0.w.b(n0Var, f10, null, this, 2, null) == objE) {
                                    return objE;
                                }
                            } else {
                                n0 n0Var2 = this.f9259c;
                                ae.r.d(n0Var2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                float f11 = this.f9261e;
                                this.f9257a = 2;
                                if (e0.w.b(n0Var2, f11, null, this, 2, null) == objE) {
                                    return objE;
                                }
                            }
                        } else {
                            if (i10 != 1 && i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            md.u.b(obj);
                        }
                        return md.i0.f15558a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0220a(le.n0 n0Var, boolean z10, n0 n0Var2) {
                    super(2);
                    this.f9254a = n0Var;
                    this.f9255b = z10;
                    this.f9256c = n0Var2;
                }

                public final Boolean a(float f10, float f11) {
                    le.k.d(this.f9254a, null, null, new C0221a(this.f9255b, this.f9256c, f11, f10, null), 3, null);
                    return Boolean.TRUE;
                }

                @Override // zd.p
                public /* bridge */ /* synthetic */ Boolean invoke(Float f10, Float f11) {
                    return a(f10.floatValue(), f11.floatValue());
                }
            }

            static final class b extends ae.s implements zd.a<Float> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ n0 f9262a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(n0 n0Var) {
                    super(0);
                    this.f9262a = n0Var;
                }

                @Override // zd.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Float invoke() {
                    return Float.valueOf(this.f9262a.m());
                }
            }

            /* JADX INFO: renamed from: d0.m0$c$a$c, reason: collision with other inner class name */
            static final class C0222c extends ae.s implements zd.a<Float> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ n0 f9263a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0222c(n0 n0Var) {
                    super(0);
                    this.f9263a = n0Var;
                }

                @Override // zd.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Float invoke() {
                    return Float.valueOf(this.f9263a.l());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z10, boolean z11, boolean z12, n0 n0Var, le.n0 n0Var2) {
                super(1);
                this.f9249a = z10;
                this.f9250b = z11;
                this.f9251c = z12;
                this.f9252d = n0Var;
                this.f9253e = n0Var2;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(g2.x xVar) {
                invoke2(xVar);
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(g2.x xVar) {
                g2.v.G(xVar, true);
                g2.j jVar = new g2.j(new b(this.f9252d), new C0222c(this.f9252d), this.f9249a);
                if (this.f9250b) {
                    g2.v.H(xVar, jVar);
                } else {
                    g2.v.v(xVar, jVar);
                }
                if (this.f9251c) {
                    g2.v.o(xVar, null, new C0220a(this.f9253e, this.f9250b, this.f9252d), 1, null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, boolean z11, n0 n0Var, boolean z12, e0.p pVar) {
            super(3);
            this.f9244a = z10;
            this.f9245b = z11;
            this.f9246c = n0Var;
            this.f9247d = z12;
            this.f9248e = pVar;
        }

        public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, t0.l lVar, int i10) {
            lVar.e(1478351300);
            if (t0.o.I()) {
                t0.o.U(1478351300, i10, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:272)");
            }
            e0.y yVar = e0.y.f10461a;
            j0 j0VarC = yVar.c(lVar, 6);
            lVar.e(773894976);
            lVar.e(-492369756);
            Object objF = lVar.f();
            if (objF == t0.l.f20813a.a()) {
                t0.z zVar = new t0.z(t0.l0.g(qd.h.f19040a, lVar));
                lVar.E(zVar);
                objF = zVar;
            }
            lVar.K();
            le.n0 n0VarA = ((t0.z) objF).a();
            lVar.K();
            e.a aVar = androidx.compose.ui.e.f2662a;
            androidx.compose.ui.e eVarD = g2.o.d(aVar, false, new a(this.f9245b, this.f9244a, this.f9247d, this.f9246c, n0VarA), 1, null);
            e0.r rVar = this.f9244a ? e0.r.Vertical : e0.r.Horizontal;
            androidx.compose.ui.e eVarH = k0.a(n.a(eVarD, rVar), j0VarC).h(androidx.compose.foundation.gestures.e.i(aVar, this.f9246c, rVar, j0VarC, (128 & 8) != 0 ? true : this.f9247d, (128 & 16) != 0 ? false : yVar.d((w2.r) lVar.P(b2.k0.f()), rVar, this.f9245b), (128 & 32) != 0 ? null : this.f9248e, (128 & 64) != 0 ? null : this.f9246c.k(), (128 & 128) != 0 ? e0.y.f10461a.a() : null)).h(new ScrollingLayoutElement(this.f9246c, this.f9245b, this.f9244a));
            if (t0.o.I()) {
                t0.o.T();
            }
            lVar.K();
            return eVarH;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, t0.l lVar, Integer num) {
            return invoke(eVar, lVar, num.intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, n0 n0Var, boolean z10, e0.p pVar, boolean z11) {
        return d(eVar, n0Var, z11, pVar, z10, false);
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, n0 n0Var, boolean z10, e0.p pVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            pVar = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return a(eVar, n0Var, z10, pVar, z11);
    }

    public static final n0 c(int i10, t0.l lVar, int i11, int i12) {
        lVar.e(-1464256199);
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (t0.o.I()) {
            t0.o.U(-1464256199, i11, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:73)");
        }
        Object[] objArr = new Object[0];
        c1.j<n0, ?> jVarA = n0.f9267i.a();
        lVar.e(-699453458);
        boolean zH = lVar.h(i10);
        Object objF = lVar.f();
        if (zH || objF == t0.l.f20813a.a()) {
            objF = new a(i10);
            lVar.E(objF);
        }
        lVar.K();
        n0 n0Var = (n0) c1.b.b(objArr, jVarA, null, (zd.a) objF, lVar, 72, 4);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return n0Var;
    }

    private static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, n0 n0Var, boolean z10, e0.p pVar, boolean z11, boolean z12) {
        return androidx.compose.ui.c.a(eVar, u0.c() ? new b(n0Var, z10, pVar, z11, z12) : u0.a(), new c(z12, z10, n0Var, z11, pVar));
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, n0 n0Var, boolean z10, e0.p pVar, boolean z11) {
        return d(eVar, n0Var, z11, pVar, z10, true);
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, n0 n0Var, boolean z10, e0.p pVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            pVar = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return e(eVar, n0Var, z10, pVar, z11);
    }
}
