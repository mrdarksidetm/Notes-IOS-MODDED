package oe;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes2.dex */
final class d<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e<T> f16471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zd.l<T, Object> f16472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zd.p<Object, Object, Boolean> f16473c;

    static final class a<T> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d<T> f16474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ae.h0<Object> f16475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f<T> f16476c;

        /* JADX INFO: renamed from: oe.d$a$a, reason: collision with other inner class name */
        @sd.d(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "emit")
        static final class C0372a extends kotlin.coroutines.jvm.internal.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f16477a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a<T> f16478b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f16479c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0372a(a<? super T> aVar, qd.d<? super C0372a> dVar) {
                super(dVar);
                this.f16478b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f16477a = obj;
                this.f16479c |= Integer.MIN_VALUE;
                return this.f16478b.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(d<T> dVar, ae.h0<Object> h0Var, f<? super T> fVar) {
            this.f16474a = dVar;
            this.f16475b = h0Var;
            this.f16476c = fVar;
        }

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
        public final java.lang.Object b(T r6, qd.d<? super md.i0> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof oe.d.a.C0372a
                if (r0 == 0) goto L13
                r0 = r7
                oe.d$a$a r0 = (oe.d.a.C0372a) r0
                int r1 = r0.f16479c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f16479c = r1
                goto L18
            L13:
                oe.d$a$a r0 = new oe.d$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f16477a
                java.lang.Object r1 = rd.b.e()
                int r2 = r0.f16479c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                md.u.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                md.u.b(r7)
                oe.d<T> r7 = r5.f16474a
                zd.l<T, java.lang.Object> r7 = r7.f16472b
                java.lang.Object r7 = r7.invoke(r6)
                ae.h0<java.lang.Object> r2 = r5.f16475b
                T r2 = r2.f712a
                qe.h0 r4 = pe.p.f18356a
                if (r2 == r4) goto L58
                oe.d<T> r4 = r5.f16474a
                zd.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f16473c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                md.i0 r6 = md.i0.f15558a
                return r6
            L58:
                ae.h0<java.lang.Object> r2 = r5.f16475b
                r2.f712a = r7
                oe.f<T> r7 = r5.f16476c
                r0.f16479c = r3
                java.lang.Object r6 = r7.b(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                md.i0 r6 = md.i0.f15558a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.d.a.b(java.lang.Object, qd.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(e<? extends T> eVar, zd.l<? super T, ? extends Object> lVar, zd.p<Object, Object, Boolean> pVar) {
        this.f16471a = eVar;
        this.f16472b = lVar;
        this.f16473c = pVar;
    }

    @Override // oe.e
    public Object a(f<? super T> fVar, qd.d<? super md.i0> dVar) {
        ae.h0 h0Var = new ae.h0();
        h0Var.f712a = (T) pe.p.f18356a;
        Object objA = this.f16471a.a(new a(this, h0Var, fVar), dVar);
        return objA == rd.d.e() ? objA : md.i0.f15558a;
    }
}
