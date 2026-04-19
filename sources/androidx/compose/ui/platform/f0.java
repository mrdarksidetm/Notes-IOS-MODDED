package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.i;
import androidx.lifecycle.g;
import b2.j0;
import java.util.Set;
import le.n0;
import md.i0;
import t0.l0;

/* JADX INFO: loaded from: classes.dex */
final class f0 implements t0.p, androidx.lifecycle.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f2905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.p f2906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.lifecycle.g f2908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zd.p<? super t0.l, ? super Integer, i0> f2909e = j0.f5308a.a();

    static final class a extends ae.s implements zd.l<i.c, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, i0> f2911b;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.f0$a$a, reason: collision with other inner class name */
        static final class C0061a extends ae.s implements zd.p<t0.l, Integer, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f0 f2912a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ zd.p<t0.l, Integer, i0> f2913b;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.f0$a$a$a, reason: collision with other inner class name */
            @sd.d(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {136}, m = "invokeSuspend")
            static final class C0062a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f2914a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f0 f2915b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0062a(f0 f0Var, qd.d<? super C0062a> dVar) {
                    super(2, dVar);
                    this.f2915b = f0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new C0062a(this.f2915b, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((C0062a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f2914a;
                    if (i10 == 0) {
                        md.u.b(obj);
                        i iVarB = this.f2915b.B();
                        this.f2914a = 1;
                        if (iVarB.Q(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        md.u.b(obj);
                    }
                    return i0.f15558a;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.f0$a$a$b */
            static final class b extends ae.s implements zd.p<t0.l, Integer, i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ f0 f2916a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ zd.p<t0.l, Integer, i0> f2917b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(f0 f0Var, zd.p<? super t0.l, ? super Integer, i0> pVar) {
                    super(2);
                    this.f2916a = f0Var;
                    this.f2917b = pVar;
                }

                @Override // zd.p
                public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
                    invoke(lVar, num.intValue());
                    return i0.f15558a;
                }

                public final void invoke(t0.l lVar, int i10) {
                    if ((i10 & 11) == 2 && lVar.s()) {
                        lVar.x();
                        return;
                    }
                    if (t0.o.I()) {
                        t0.o.U(-1193460702, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:138)");
                    }
                    r.a(this.f2916a.B(), this.f2917b, lVar, 8);
                    if (t0.o.I()) {
                        t0.o.T();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0061a(f0 f0Var, zd.p<? super t0.l, ? super Integer, i0> pVar) {
                super(2);
                this.f2912a = f0Var;
                this.f2913b = pVar;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
                invoke(lVar, num.intValue());
                return i0.f15558a;
            }

            public final void invoke(t0.l lVar, int i10) {
                if ((i10 & 11) == 2 && lVar.s()) {
                    lVar.x();
                    return;
                }
                if (t0.o.I()) {
                    t0.o.U(-2000640158, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:124)");
                }
                i iVarB = this.f2912a.B();
                int i11 = f1.e.K;
                Object tag = iVarB.getTag(i11);
                Set<e1.a> set = ae.n0.m(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f2912a.B().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(i11) : null;
                    set = ae.n0.m(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(lVar.j());
                    lVar.a();
                }
                l0.d(this.f2912a.B(), new C0062a(this.f2912a, null), lVar, 72);
                t0.v.a(e1.d.a().c(set), b1.c.b(lVar, -1193460702, true, new b(this.f2912a, this.f2913b)), lVar, 56);
                if (t0.o.I()) {
                    t0.o.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zd.p<? super t0.l, ? super Integer, i0> pVar) {
            super(1);
            this.f2911b = pVar;
        }

        public final void a(i.c cVar) {
            if (f0.this.f2907c) {
                return;
            }
            androidx.lifecycle.g lifecycle = cVar.a().getLifecycle();
            f0.this.f2909e = this.f2911b;
            if (f0.this.f2908d == null) {
                f0.this.f2908d = lifecycle;
                lifecycle.a(f0.this);
            } else if (lifecycle.b().b(g.b.CREATED)) {
                f0.this.A().b(b1.c.c(-2000640158, true, new C0061a(f0.this, this.f2911b)));
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(i.c cVar) {
            a(cVar);
            return i0.f15558a;
        }
    }

    public f0(i iVar, t0.p pVar) {
        this.f2905a = iVar;
        this.f2906b = pVar;
    }

    public final t0.p A() {
        return this.f2906b;
    }

    public final i B() {
        return this.f2905a;
    }

    @Override // t0.p
    public void b(zd.p<? super t0.l, ? super Integer, i0> pVar) {
        this.f2905a.setOnViewTreeOwnersAvailable(new a(pVar));
    }

    @Override // t0.p
    public void dispose() {
        if (!this.f2907c) {
            this.f2907c = true;
            this.f2905a.getView().setTag(f1.e.L, null);
            androidx.lifecycle.g gVar = this.f2908d;
            if (gVar != null) {
                gVar.c(this);
            }
        }
        this.f2906b.dispose();
    }

    @Override // androidx.lifecycle.i
    public void s(o4.e eVar, g.a aVar) {
        if (aVar == g.a.ON_DESTROY) {
            dispose();
        } else {
            if (aVar != g.a.ON_CREATE || this.f2907c) {
                return;
            }
            b(this.f2909e);
        }
    }
}
