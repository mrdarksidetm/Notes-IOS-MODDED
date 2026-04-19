package u1;

import ae.s;
import k1.f;
import le.n0;
import z1.h;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f21479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zd.a<? extends n0> f21480b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n0 f21481c;

    static final class a extends s implements zd.a<n0> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            return b.this.h();
        }
    }

    /* JADX INFO: renamed from: u1.b$b, reason: collision with other inner class name */
    @sd.d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {221}, m = "dispatchPostFling-RZ2iAVY")
    static final class C0437b extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f21483a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21485c;

        C0437b(qd.d<? super C0437b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21483a = obj;
            this.f21485c |= Integer.MIN_VALUE;
            return b.this.a(0L, 0L, this);
        }
    }

    @sd.d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {206}, m = "dispatchPreFling-QWom1Mo")
    static final class c extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f21486a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21488c;

        c(qd.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21486a = obj;
            this.f21488c |= Integer.MIN_VALUE;
            return b.this.c(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, qd.d<? super w2.w> r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof u1.b.C0437b
            if (r0 == 0) goto L13
            r0 = r12
            u1.b$b r0 = (u1.b.C0437b) r0
            int r1 = r0.f21485c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21485c = r1
            goto L18
        L13:
            u1.b$b r0 = new u1.b$b
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.f21483a
            java.lang.Object r0 = rd.b.e()
            int r1 = r6.f21485c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            md.u.b(r12)
            goto L46
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            md.u.b(r12)
            u1.a r1 = r7.g()
            if (r1 == 0) goto L4d
            r6.f21485c = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.W0(r2, r4, r6)
            if (r12 != r0) goto L46
            return r0
        L46:
            w2.w r12 = (w2.w) r12
            long r8 = r12.o()
            goto L53
        L4d:
            w2.w$a r8 = w2.w.f22437b
            long r8 = r8.a()
        L53:
            w2.w r8 = w2.w.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.b.a(long, long, qd.d):java.lang.Object");
    }

    public final long b(long j10, long j11, int i10) {
        u1.a aVarG = g();
        return aVarG != null ? aVarG.m1(j10, j11, i10) : f.f14338b.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r5, qd.d<? super w2.w> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof u1.b.c
            if (r0 == 0) goto L13
            r0 = r7
            u1.b$c r0 = (u1.b.c) r0
            int r1 = r0.f21488c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21488c = r1
            goto L18
        L13:
            u1.b$c r0 = new u1.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21486a
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f21488c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            md.u.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            md.u.b(r7)
            u1.a r7 = r4.g()
            if (r7 == 0) goto L4a
            r0.f21488c = r3
            java.lang.Object r7 = r7.p1(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            w2.w r7 = (w2.w) r7
            long r5 = r7.o()
            goto L50
        L4a:
            w2.w$a r5 = w2.w.f22437b
            long r5 = r5.a()
        L50:
            w2.w r5 = w2.w.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.b.c(long, qd.d):java.lang.Object");
    }

    public final long d(long j10, int i10) {
        u1.a aVarG = g();
        return aVarG != null ? aVarG.x0(j10, i10) : f.f14338b.c();
    }

    public final n0 e() {
        n0 n0VarInvoke = this.f21480b.invoke();
        if (n0VarInvoke != null) {
            return n0VarInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final h f() {
        return this.f21479a;
    }

    public final u1.a g() {
        h hVar = this.f21479a;
        if (hVar != null) {
            return (u1.c) hVar.p(d.a());
        }
        return null;
    }

    public final n0 h() {
        return this.f21481c;
    }

    public final void i(zd.a<? extends n0> aVar) {
        this.f21480b = aVar;
    }

    public final void j(h hVar) {
        this.f21479a = hVar;
    }

    public final void k(n0 n0Var) {
        this.f21481c = n0Var;
    }
}
