package e0;

import ue.a;

/* JADX INFO: loaded from: classes.dex */
final class u implements t, w2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ w2.d f10439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ue.a f10442d = ue.c.a(false);

    @sd.d(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {357}, m = com.amazon.device.iap.internal.c.b.au)
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10444b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10446d;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10444b = obj;
            this.f10446d |= Integer.MIN_VALUE;
            return u.this.j(this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {370}, m = "tryAwaitRelease")
    static final class b extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10448b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10450d;

        b(qd.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10448b = obj;
            this.f10450d |= Integer.MIN_VALUE;
            return u.this.t0(this);
        }
    }

    public u(w2.d dVar) {
        this.f10439a = dVar;
    }

    @Override // w2.d
    public float G0(float f10) {
        return this.f10439a.G0(f10);
    }

    @Override // w2.d
    public long N(long j10) {
        return this.f10439a.N(j10);
    }

    @Override // w2.l
    public float Q(long j10) {
        return this.f10439a.Q(j10);
    }

    @Override // w2.d
    public int a1(float f10) {
        return this.f10439a.a1(f10);
    }

    public final void d() {
        this.f10441c = true;
        a.C0444a.b(this.f10442d, null, 1, null);
    }

    public final void f() {
        this.f10440b = true;
        a.C0444a.b(this.f10442d, null, 1, null);
    }

    @Override // w2.l
    public long g(float f10) {
        return this.f10439a.g(f10);
    }

    @Override // w2.d
    public float getDensity() {
        return this.f10439a.getDensity();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(qd.d<? super md.i0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof e0.u.a
            if (r0 == 0) goto L13
            r0 = r5
            e0.u$a r0 = (e0.u.a) r0
            int r1 = r0.f10446d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10446d = r1
            goto L18
        L13:
            e0.u$a r0 = new e0.u$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f10444b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10446d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f10443a
            e0.u r0 = (e0.u) r0
            md.u.b(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            md.u.b(r5)
            ue.a r5 = r4.f10442d
            r0.f10443a = r4
            r0.f10446d = r3
            r2 = 0
            java.lang.Object r5 = ue.a.C0444a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.f10440b = r5
            r0.f10441c = r5
            md.i0 r5 = md.i0.f15558a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.u.j(qd.d):java.lang.Object");
    }

    @Override // w2.d
    public float l0(int i10) {
        return this.f10439a.l0(i10);
    }

    @Override // w2.d
    public float n0(float f10) {
        return this.f10439a.n0(f10);
    }

    @Override // w2.d
    public float o1(long j10) {
        return this.f10439a.o1(j10);
    }

    @Override // w2.d
    public long q(float f10) {
        return this.f10439a.q(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // e0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object t0(qd.d<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof e0.u.b
            if (r0 == 0) goto L13
            r0 = r6
            e0.u$b r0 = (e0.u.b) r0
            int r1 = r0.f10450d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10450d = r1
            goto L18
        L13:
            e0.u$b r0 = new e0.u$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10448b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10450d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f10447a
            e0.u r0 = (e0.u) r0
            md.u.b(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            md.u.b(r6)
            boolean r6 = r5.f10440b
            if (r6 != 0) goto L55
            boolean r6 = r5.f10441c
            if (r6 != 0) goto L55
            ue.a r6 = r5.f10442d
            r0.f10447a = r5
            r0.f10450d = r4
            java.lang.Object r6 = ue.a.C0444a.a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            ue.a r6 = r0.f10442d
            ue.a.C0444a.b(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.f10440b
            java.lang.Boolean r6 = sd.a.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.u.t0(qd.d):java.lang.Object");
    }

    @Override // w2.d
    public long w(long j10) {
        return this.f10439a.w(j10);
    }

    @Override // w2.l
    public float y0() {
        return this.f10439a.y0();
    }
}
