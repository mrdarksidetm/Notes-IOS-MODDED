package oe;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f16528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p f16529b;

        public a(e eVar, zd.p pVar) {
            this.f16528a = eVar;
            this.f16529b = pVar;
        }

        @Override // oe.e
        public Object a(f<? super T> fVar, qd.d<? super md.i0> dVar) {
            Object objA = this.f16528a.a(new b(new ae.d0(), fVar, this.f16529b), dVar);
            return objA == rd.d.e() ? objA : md.i0.f15558a;
        }
    }

    static final class b<T> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ae.d0 f16530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f<T> f16531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.p<T, qd.d<? super Boolean>, Object> f16532c;

        @sd.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {R.styleable.AppCompatTheme_alertDialogStyle, R.styleable.AppCompatTheme_alertDialogTheme, R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "emit")
        static final class a extends kotlin.coroutines.jvm.internal.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f16533a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f16534b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f16535c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b<T> f16536d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f16537e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, qd.d<? super a> dVar) {
                super(dVar);
                this.f16536d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f16535c = obj;
                this.f16537e |= Integer.MIN_VALUE;
                return this.f16536d.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(ae.d0 d0Var, f<? super T> fVar, zd.p<? super T, ? super qd.d<? super Boolean>, ? extends Object> pVar) {
            this.f16530a = d0Var;
            this.f16531b = fVar;
            this.f16532c = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
        @Override // oe.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(T r7, qd.d<? super md.i0> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof oe.n.b.a
                if (r0 == 0) goto L13
                r0 = r8
                oe.n$b$a r0 = (oe.n.b.a) r0
                int r1 = r0.f16537e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f16537e = r1
                goto L18
            L13:
                oe.n$b$a r0 = new oe.n$b$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f16535c
                java.lang.Object r1 = rd.b.e()
                int r2 = r0.f16537e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                md.u.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f16534b
                java.lang.Object r2 = r0.f16533a
                oe.n$b r2 = (oe.n.b) r2
                md.u.b(r8)
                goto L6c
            L41:
                md.u.b(r8)
                goto L59
            L45:
                md.u.b(r8)
                ae.d0 r8 = r6.f16530a
                boolean r8 = r8.f699a
                if (r8 == 0) goto L5c
                oe.f<T> r8 = r6.f16531b
                r0.f16537e = r5
                java.lang.Object r7 = r8.b(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                md.i0 r7 = md.i0.f15558a
                return r7
            L5c:
                zd.p<T, qd.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f16532c
                r0.f16533a = r6
                r0.f16534b = r7
                r0.f16537e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                ae.d0 r8 = r2.f16530a
                r8.f699a = r5
                oe.f<T> r8 = r2.f16531b
                r2 = 0
                r0.f16533a = r2
                r0.f16534b = r2
                r0.f16537e = r3
                java.lang.Object r7 = r8.b(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                md.i0 r7 = md.i0.f15558a
                return r7
            L8b:
                md.i0 r7 = md.i0.f15558a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.n.b.b(java.lang.Object, qd.d):java.lang.Object");
        }
    }

    public static final <T> e<T> a(e<? extends T> eVar, zd.p<? super T, ? super qd.d<? super Boolean>, ? extends Object> pVar) {
        return new a(eVar, pVar);
    }
}
