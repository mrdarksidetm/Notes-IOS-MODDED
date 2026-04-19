package oe;

/* JADX INFO: loaded from: classes2.dex */
final class d0 implements b0 {

    @sd.d(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<f<? super z>, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f16481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0<Integer> f16482c;

        /* JADX INFO: renamed from: oe.d0$a$a, reason: collision with other inner class name */
        static final class C0373a<T> implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ae.d0 f16483a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f<z> f16484b;

            /* JADX INFO: renamed from: oe.d0$a$a$a, reason: collision with other inner class name */
            @sd.d(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
            static final class C0374a extends kotlin.coroutines.jvm.internal.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f16485a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ C0373a<T> f16486b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f16487c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0374a(C0373a<? super T> c0373a, qd.d<? super C0374a> dVar) {
                    super(dVar);
                    this.f16486b = c0373a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f16485a = obj;
                    this.f16487c |= Integer.MIN_VALUE;
                    return this.f16486b.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0373a(ae.d0 d0Var, f<? super z> fVar) {
                this.f16483a = d0Var;
                this.f16484b = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(int r5, qd.d<? super md.i0> r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof oe.d0.a.C0373a.C0374a
                    if (r0 == 0) goto L13
                    r0 = r6
                    oe.d0$a$a$a r0 = (oe.d0.a.C0373a.C0374a) r0
                    int r1 = r0.f16487c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f16487c = r1
                    goto L18
                L13:
                    oe.d0$a$a$a r0 = new oe.d0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f16485a
                    java.lang.Object r1 = rd.b.e()
                    int r2 = r0.f16487c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    md.u.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    md.u.b(r6)
                    if (r5 <= 0) goto L4e
                    ae.d0 r5 = r4.f16483a
                    boolean r6 = r5.f699a
                    if (r6 != 0) goto L4e
                    r5.f699a = r3
                    oe.f<oe.z> r5 = r4.f16484b
                    oe.z r6 = oe.z.START
                    r0.f16487c = r3
                    java.lang.Object r5 = r5.b(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    md.i0 r5 = md.i0.f15558a
                    return r5
                L4e:
                    md.i0 r5 = md.i0.f15558a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: oe.d0.a.C0373a.a(int, qd.d):java.lang.Object");
            }

            @Override // oe.f
            public /* bridge */ /* synthetic */ Object b(Object obj, qd.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0<Integer> f0Var, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f16482c = f0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            a aVar = new a(this.f16482c, dVar);
            aVar.f16481b = obj;
            return aVar;
        }

        @Override // zd.p
        public final Object invoke(f<? super z> fVar, qd.d<? super md.i0> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f16480a;
            if (i10 == 0) {
                md.u.b(obj);
                f fVar = (f) this.f16481b;
                ae.d0 d0Var = new ae.d0();
                f0<Integer> f0Var = this.f16482c;
                C0373a c0373a = new C0373a(d0Var, fVar);
                this.f16480a = 1;
                if (f0Var.a(c0373a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            throw new md.i();
        }
    }

    @Override // oe.b0
    public e<z> a(f0<Integer> f0Var) {
        return g.o(new a(f0Var, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
