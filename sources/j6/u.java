package j6;

import android.view.View;
import le.a2;
import le.d1;
import le.n0;
import le.s1;
import le.u0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class u implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f14071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f14072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a2 f14073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t f14074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14075e;

    @sd.d(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14076a;

        a(qd.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return u.this.new a(dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f14076a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            md.u.b(obj);
            u.this.c(null);
            return i0.f15558a;
        }
    }

    public u(View view) {
        this.f14071a = view;
    }

    public final synchronized void a() {
        a2 a2Var = this.f14073c;
        if (a2Var != null) {
            a2.a.b(a2Var, null, 1, null);
        }
        this.f14073c = le.k.d(s1.f15112a, d1.c().m0(), null, new a(null), 2, null);
        this.f14072b = null;
    }

    public final synchronized s b(u0<? extends i> u0Var) {
        s sVar = this.f14072b;
        if (sVar != null && o6.j.s() && this.f14075e) {
            this.f14075e = false;
            sVar.a(u0Var);
            return sVar;
        }
        a2 a2Var = this.f14073c;
        if (a2Var != null) {
            a2.a.b(a2Var, null, 1, null);
        }
        this.f14073c = null;
        s sVar2 = new s(this.f14071a, u0Var);
        this.f14072b = sVar2;
        return sVar2;
    }

    public final void c(t tVar) {
        t tVar2 = this.f14074d;
        if (tVar2 != null) {
            tVar2.a();
        }
        this.f14074d = tVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        t tVar = this.f14074d;
        if (tVar == null) {
            return;
        }
        this.f14075e = true;
        tVar.b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        t tVar = this.f14074d;
        if (tVar != null) {
            tVar.a();
        }
    }
}
