package androidx.compose.foundation;

import a2.j1;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import le.n0;
import le.p0;
import md.i0;
import md.u;
import v1.r;
import v1.t;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
final class o extends e.c implements j1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g0.m f2584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private g0.g f2585o;

    @sd.d(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {R.styleable.AppCompatTheme_textAppearanceSearchResultTitle}, m = "emitEnter")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f2586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f2587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f2588c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2590e;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2588c = obj;
            this.f2590e |= Integer.MIN_VALUE;
            return o.this.a2(this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {R.styleable.AppCompatTheme_viewInflaterClass}, m = "emitExit")
    static final class b extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f2591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2592b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2594d;

        b(qd.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2592b = obj;
            this.f2594d |= Integer.MIN_VALUE;
            return o.this.b2(this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {R.styleable.AppCompatTheme_radioButtonStyle}, m = "invokeSuspend")
    static final class c extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2595a;

        c(qd.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return o.this.new c(dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f2595a;
            if (i10 == 0) {
                u.b(obj);
                o oVar = o.this;
                this.f2595a = 1;
                if (oVar.a2(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {R.styleable.AppCompatTheme_ratingBarStyle}, m = "invokeSuspend")
    static final class d extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2597a;

        d(qd.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return o.this.new d(dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((d) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f2597a;
            if (i10 == 0) {
                u.b(obj);
                o oVar = o.this;
                this.f2597a = 1;
                if (oVar.b2(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    public o(g0.m mVar) {
        this.f2584n = mVar;
    }

    @Override // androidx.compose.ui.e.c
    public void L1() {
        c2();
    }

    @Override // a2.j1
    public void Z(v1.p pVar, r rVar, long j10) {
        n0 n0VarA1;
        qd.g gVar;
        p0 p0Var;
        p dVar;
        if (rVar == r.Main) {
            int iE = pVar.e();
            t.a aVar = t.f21997a;
            if (t.i(iE, aVar.a())) {
                n0VarA1 = A1();
                gVar = null;
                p0Var = null;
                dVar = new c(null);
            } else {
                if (!t.i(iE, aVar.b())) {
                    return;
                }
                n0VarA1 = A1();
                gVar = null;
                p0Var = null;
                dVar = new d(null);
            }
            le.k.d(n0VarA1, gVar, p0Var, dVar, 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a2(qd.d<? super md.i0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.o.a
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.o$a r0 = (androidx.compose.foundation.o.a) r0
            int r1 = r0.f2590e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2590e = r1
            goto L18
        L13:
            androidx.compose.foundation.o$a r0 = new androidx.compose.foundation.o$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f2588c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f2590e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f2587b
            g0.g r1 = (g0.g) r1
            java.lang.Object r0 = r0.f2586a
            androidx.compose.foundation.o r0 = (androidx.compose.foundation.o) r0
            md.u.b(r5)
            goto L56
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            md.u.b(r5)
            g0.g r5 = r4.f2585o
            if (r5 != 0) goto L58
            g0.g r5 = new g0.g
            r5.<init>()
            g0.m r2 = r4.f2584n
            r0.f2586a = r4
            r0.f2587b = r5
            r0.f2590e = r3
            java.lang.Object r0 = r2.c(r5, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r4
            r1 = r5
        L56:
            r0.f2585o = r1
        L58:
            md.i0 r5 = md.i0.f15558a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.o.a2(qd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b2(qd.d<? super md.i0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.o.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.o$b r0 = (androidx.compose.foundation.o.b) r0
            int r1 = r0.f2594d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2594d = r1
            goto L18
        L13:
            androidx.compose.foundation.o$b r0 = new androidx.compose.foundation.o$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f2592b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f2594d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f2591a
            androidx.compose.foundation.o r0 = (androidx.compose.foundation.o) r0
            md.u.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            md.u.b(r5)
            g0.g r5 = r4.f2585o
            if (r5 == 0) goto L52
            g0.h r2 = new g0.h
            r2.<init>(r5)
            g0.m r5 = r4.f2584n
            r0.f2591a = r4
            r0.f2594d = r3
            java.lang.Object r5 = r5.c(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            r5 = 0
            r0.f2585o = r5
        L52:
            md.i0 r5 = md.i0.f15558a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.o.b2(qd.d):java.lang.Object");
    }

    @Override // a2.j1
    public void c0() {
        c2();
    }

    public final void c2() {
        g0.g gVar = this.f2585o;
        if (gVar != null) {
            this.f2584n.a(new g0.h(gVar));
            this.f2585o = null;
        }
    }

    public final void d2(g0.m mVar) {
        if (ae.r.b(this.f2584n, mVar)) {
            return;
        }
        c2();
        this.f2584n = mVar;
    }
}
