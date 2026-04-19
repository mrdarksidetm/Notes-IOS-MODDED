package oe;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class p {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements oe.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ae.h0 f16543a;

        public a(ae.h0 h0Var) {
            this.f16543a = h0Var;
        }

        @Override // oe.f
        public Object b(T t10, qd.d<? super md.i0> dVar) {
            this.f16543a.f712a = t10;
            throw new pe.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements oe.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.p f16544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ae.h0 f16545b;

        @sd.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
        public static final class a extends kotlin.coroutines.jvm.internal.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f16546a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f16547b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f16548c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f16550e;

            public a(qd.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f16547b = obj;
                this.f16548c |= Integer.MIN_VALUE;
                return b.this.b(null, this);
            }
        }

        public b(zd.p pVar, ae.h0 h0Var) {
            this.f16544a = pVar;
            this.f16545b = h0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oe.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(T r5, qd.d<? super md.i0> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof oe.p.b.a
                if (r0 == 0) goto L13
                r0 = r6
                oe.p$b$a r0 = (oe.p.b.a) r0
                int r1 = r0.f16548c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f16548c = r1
                goto L18
            L13:
                oe.p$b$a r0 = new oe.p$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f16547b
                java.lang.Object r1 = rd.b.e()
                int r2 = r0.f16548c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f16550e
                java.lang.Object r0 = r0.f16546a
                oe.p$b r0 = (oe.p.b) r0
                md.u.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                md.u.b(r6)
                zd.p r6 = r4.f16544a
                r0.f16546a = r4
                r0.f16550e = r5
                r0.f16548c = r3
                r2 = 6
                ae.p.a(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                ae.p.a(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                ae.h0 r6 = r0.f16545b
                r6.f712a = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                md.i0 r5 = md.i0.f15558a
                return r5
            L64:
                pe.a r5 = new pe.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.p.b.b(java.lang.Object, qd.d):java.lang.Object");
        }
    }

    @sd.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    static final class c<T> extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16554d;

        c(qd.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16553c = obj;
            this.f16554d |= Integer.MIN_VALUE;
            return g.l(null, this);
        }
    }

    @sd.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    static final class d<T> extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f16557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f16558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16559e;

        d(qd.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16558d = obj;
            this.f16559e |= Integer.MIN_VALUE;
            return g.m(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class e<T> implements oe.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ae.h0 f16560a;

        public e(ae.h0 h0Var) {
            this.f16560a = h0Var;
        }

        @Override // oe.f
        public Object b(T t10, qd.d<? super md.i0> dVar) {
            this.f16560a.f712a = t10;
            throw new pe.a(this);
        }
    }

    @sd.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "firstOrNull")
    static final class f<T> extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16564d;

        f(qd.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16563c = obj;
            this.f16564d |= Integer.MIN_VALUE;
            return g.n(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(oe.e<? extends T> r4, qd.d<? super T> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof oe.p.c
            if (r0 == 0) goto L13
            r0 = r5
            oe.p$c r0 = (oe.p.c) r0
            int r1 = r0.f16554d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16554d = r1
            goto L18
        L13:
            oe.p$c r0 = new oe.p$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16553c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f16554d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f16552b
            oe.p$a r4 = (oe.p.a) r4
            java.lang.Object r0 = r0.f16551a
            ae.h0 r0 = (ae.h0) r0
            md.u.b(r5)     // Catch: pe.a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            md.u.b(r5)
            ae.h0 r5 = new ae.h0
            r5.<init>()
            qe.h0 r2 = pe.p.f18356a
            r5.f712a = r2
            oe.p$a r2 = new oe.p$a
            r2.<init>(r5)
            r0.f16551a = r5     // Catch: pe.a -> L5b
            r0.f16552b = r2     // Catch: pe.a -> L5b
            r0.f16554d = r3     // Catch: pe.a -> L5b
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: pe.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            pe.l.a(r5, r4)
        L62:
            T r4 = r0.f712a
            qe.h0 r5 = pe.p.f18356a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.p.a(oe.e, qd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(oe.e<? extends T> r4, zd.p<? super T, ? super qd.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, qd.d<? super T> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof oe.p.d
            if (r0 == 0) goto L13
            r0 = r6
            oe.p$d r0 = (oe.p.d) r0
            int r1 = r0.f16559e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16559e = r1
            goto L18
        L13:
            oe.p$d r0 = new oe.p$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16558d
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f16559e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f16557c
            oe.p$b r4 = (oe.p.b) r4
            java.lang.Object r5 = r0.f16556b
            ae.h0 r5 = (ae.h0) r5
            java.lang.Object r0 = r0.f16555a
            zd.p r0 = (zd.p) r0
            md.u.b(r6)     // Catch: pe.a -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            md.u.b(r6)
            ae.h0 r6 = new ae.h0
            r6.<init>()
            qe.h0 r2 = pe.p.f18356a
            r6.f712a = r2
            oe.p$b r2 = new oe.p$b
            r2.<init>(r5, r6)
            r0.f16555a = r5     // Catch: pe.a -> L62
            r0.f16556b = r6     // Catch: pe.a -> L62
            r0.f16557c = r2     // Catch: pe.a -> L62
            r0.f16559e = r3     // Catch: pe.a -> L62
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: pe.a -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            pe.l.a(r6, r4)
        L6a:
            T r4 = r5.f712a
            qe.h0 r5 = pe.p.f18356a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.p.b(oe.e, zd.p, qd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(oe.e<? extends T> r4, qd.d<? super T> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof oe.p.f
            if (r0 == 0) goto L13
            r0 = r5
            oe.p$f r0 = (oe.p.f) r0
            int r1 = r0.f16564d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16564d = r1
            goto L18
        L13:
            oe.p$f r0 = new oe.p$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16563c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f16564d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f16562b
            oe.p$e r4 = (oe.p.e) r4
            java.lang.Object r0 = r0.f16561a
            ae.h0 r0 = (ae.h0) r0
            md.u.b(r5)     // Catch: pe.a -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            md.u.b(r5)
            ae.h0 r5 = new ae.h0
            r5.<init>()
            oe.p$e r2 = new oe.p$e
            r2.<init>(r5)
            r0.f16561a = r5     // Catch: pe.a -> L57
            r0.f16562b = r2     // Catch: pe.a -> L57
            r0.f16564d = r3     // Catch: pe.a -> L57
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: pe.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            pe.l.a(r5, r4)
        L5e:
            T r4 = r0.f712a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.p.c(oe.e, qd.d):java.lang.Object");
    }
}
