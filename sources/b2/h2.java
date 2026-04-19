package b2;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import le.a2;

/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2 f5270a = new h2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference<g2> f5271b = new AtomicReference<>(g2.f5262a.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5272c = 8;

    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ le.a2 f5273a;

        a(le.a2 a2Var) {
            this.f5273a = a2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            a2.a.b(this.f5273a, null, 1, null);
        }
    }

    @sd.d(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {233}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f5274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0.g2 f5275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f5276c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t0.g2 g2Var, View view, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f5275b = g2Var;
            this.f5276c = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return new b(this.f5275b, this.f5276c, dVar);
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            View view;
            Object objE = rd.d.e();
            int i10 = this.f5274a;
            try {
                if (i10 == 0) {
                    md.u.b(obj);
                    t0.g2 g2Var = this.f5275b;
                    this.f5274a = 1;
                    if (g2Var.k0(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    md.u.b(obj);
                }
                if (i2.f(view) == this.f5275b) {
                    i2.i(this.f5276c, null);
                }
                return md.i0.f15558a;
            } finally {
                if (i2.f(this.f5276c) == this.f5275b) {
                    i2.i(this.f5276c, null);
                }
            }
        }
    }

    private h2() {
    }

    public final t0.g2 a(View view) {
        t0.g2 g2VarA = f5271b.get().a(view);
        i2.i(view, g2VarA);
        view.addOnAttachStateChangeListener(new a(le.k.d(le.s1.f15112a, me.f.b(view.getHandler(), "windowRecomposer cleanup").m0(), null, new b(g2VarA, view, null), 2, null)));
        return g2VarA;
    }
}
