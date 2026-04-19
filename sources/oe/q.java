package oe;

import le.a2;
import le.n0;
import le.p0;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class q {

    @sd.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f16566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e<T> f16567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r<T> f16568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f16569e;

        /* JADX INFO: renamed from: oe.q$a$a, reason: collision with other inner class name */
        @sd.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        static final class C0375a extends sd.j implements zd.p<Integer, qd.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f16570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ int f16571b;

            C0375a(qd.d<? super C0375a> dVar) {
                super(2, dVar);
            }

            public final Object a(int i10, qd.d<? super Boolean> dVar) {
                return ((C0375a) create(Integer.valueOf(i10), dVar)).invokeSuspend(md.i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                C0375a c0375a = new C0375a(dVar);
                c0375a.f16571b = ((Number) obj).intValue();
                return c0375a;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, qd.d<? super Boolean> dVar) {
                return a(num.intValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f16570a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
                return sd.a.a(this.f16571b > 0);
            }
        }

        @sd.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
        static final class b extends sd.j implements zd.p<z, qd.d<? super md.i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f16572a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f16573b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e<T> f16574c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ r<T> f16575d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f16576e;

            /* JADX INFO: renamed from: oe.q$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0376a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f16577a;

                static {
                    int[] iArr = new int[z.values().length];
                    try {
                        iArr[z.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[z.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[z.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f16577a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(e<? extends T> eVar, r<T> rVar, T t10, qd.d<? super b> dVar) {
                super(2, dVar);
                this.f16574c = eVar;
                this.f16575d = rVar;
                this.f16576e = t10;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(z zVar, qd.d<? super md.i0> dVar) {
                return ((b) create(zVar, dVar)).invokeSuspend(md.i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                b bVar = new b(this.f16574c, this.f16575d, this.f16576e, dVar);
                bVar.f16573b = obj;
                return bVar;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f16572a;
                if (i10 == 0) {
                    md.u.b(obj);
                    int i11 = C0376a.f16577a[((z) this.f16573b).ordinal()];
                    if (i11 == 1) {
                        e<T> eVar = this.f16574c;
                        Object obj2 = this.f16575d;
                        this.f16572a = 1;
                        if (eVar.a(obj2, this) == objE) {
                            return objE;
                        }
                    } else if (i11 == 3) {
                        T t10 = this.f16576e;
                        if (t10 == x.f16601a) {
                            this.f16575d.h();
                        } else {
                            this.f16575d.i(t10);
                        }
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
        a(b0 b0Var, e<? extends T> eVar, r<T> rVar, T t10, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f16566b = b0Var;
            this.f16567c = eVar;
            this.f16568d = rVar;
            this.f16569e = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f16566b, this.f16567c, this.f16568d, this.f16569e, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r7.f16565a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                md.u.b(r8)
                goto L5c
            L21:
                md.u.b(r8)
                goto L8d
            L25:
                md.u.b(r8)
                oe.b0 r8 = r7.f16566b
                oe.b0$a r1 = oe.b0.f16466a
                oe.b0 r6 = r1.c()
                if (r8 != r6) goto L3f
                oe.e<T> r8 = r7.f16567c
                oe.r<T> r1 = r7.f16568d
                r7.f16565a = r5
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                oe.b0 r8 = r7.f16566b
                oe.b0 r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                oe.r<T> r8 = r7.f16568d
                oe.f0 r8 = r8.k()
                oe.q$a$a r1 = new oe.q$a$a
                r1.<init>(r5)
                r7.f16565a = r4
                java.lang.Object r8 = oe.g.m(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                oe.e<T> r8 = r7.f16567c
                oe.r<T> r1 = r7.f16568d
                r7.f16565a = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                oe.b0 r8 = r7.f16566b
                oe.r<T> r1 = r7.f16568d
                oe.f0 r1 = r1.k()
                oe.e r8 = r8.a(r1)
                oe.e r8 = oe.g.g(r8)
                oe.q$a$b r1 = new oe.q$a$b
                oe.e<T> r3 = r7.f16567c
                oe.r<T> r4 = r7.f16568d
                T r6 = r7.f16569e
                r1.<init>(r3, r4, r6, r5)
                r7.f16565a = r2
                java.lang.Object r8 = oe.g.f(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                md.i0 r8 = md.i0.f15558a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> f0<T> a(s<T> sVar) {
        return new t(sVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> oe.a0<T> b(oe.e<? extends T> r7, int r8) {
        /*
            ne.d$a r0 = ne.d.T
            int r0 = r0.a()
            int r0 = ge.m.d(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof pe.e
            if (r1 == 0) goto L3d
            r1 = r7
            pe.e r1 = (pe.e) r1
            oe.e r2 = r1.l()
            if (r2 == 0) goto L3d
            oe.a0 r7 = new oe.a0
            int r3 = r1.f18319b
            r4 = -3
            r5 = 0
            if (r3 == r4) goto L27
            r4 = -2
            if (r3 == r4) goto L27
            if (r3 == 0) goto L27
            r0 = r3
            goto L35
        L27:
            ne.a r4 = r1.f18320c
            ne.a r6 = ne.a.SUSPEND
            if (r4 != r6) goto L30
            if (r3 != 0) goto L35
            goto L34
        L30:
            if (r8 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = r5
        L35:
            ne.a r8 = r1.f18320c
            qd.g r1 = r1.f18318a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3d:
            oe.a0 r8 = new oe.a0
            ne.a r1 = ne.a.SUSPEND
            qd.h r2 = qd.h.f19040a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.q.b(oe.e, int):oe.a0");
    }

    private static final <T> a2 c(n0 n0Var, qd.g gVar, e<? extends T> eVar, r<T> rVar, b0 b0Var, T t10) {
        return le.i.c(n0Var, gVar, ae.r.b(b0Var, b0.f16466a.c()) ? p0.DEFAULT : p0.UNDISPATCHED, new a(b0Var, eVar, rVar, t10, null));
    }

    public static final <T> f0<T> d(e<? extends T> eVar, n0 n0Var, b0 b0Var, T t10) {
        a0 a0VarB = b(eVar, 1);
        s sVarA = h0.a(t10);
        return new t(sVarA, c(n0Var, a0VarB.f16460d, a0VarB.f16457a, sVarA, b0Var, t10));
    }
}
