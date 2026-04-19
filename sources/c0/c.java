package c0;

import t0.f3;
import t0.k3;
import t0.l;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a1<Float> f5931a = j.g(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a1<w2.h> f5932b = j.g(0.0f, 0.0f, w2.h.i(x1.a(w2.h.f22405b)), 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a1<k1.l> f5933c = j.g(0.0f, 0.0f, k1.l.c(x1.d(k1.l.f14359b)), 3, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a1<k1.f> f5934d = j.g(0.0f, 0.0f, k1.f.d(x1.c(k1.f.f14338b)), 3, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a1<k1.h> f5935e = j.g(0.0f, 0.0f, x1.g(k1.h.f14343e), 3, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a1<Integer> f5936f = j.g(0.0f, 0.0f, Integer.valueOf(x1.b(ae.q.f721a)), 3, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a1<w2.n> f5937g = j.g(0.0f, 0.0f, w2.n.b(x1.e(w2.n.f22418b)), 3, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a1<w2.p> f5938h = j.g(0.0f, 0.0f, w2.p.b(x1.f(w2.p.f22421b)), 3, null);

    static final class a extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ne.d<T> f5939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f5940b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ne.d<T> dVar, T t10) {
            super(0);
            this.f5939a = dVar;
            this.f5940b = t10;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f5939a.i(this.f5940b);
        }
    }

    @sd.d(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {419}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f5941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f5943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ne.d<T> f5944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c0.a<T, V> f5945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p3<i<T>> f5946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p3<zd.l<T, md.i0>> f5947g;

        @sd.d(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {428}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f5948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f5949b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c0.a<T, V> f5950c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p3<i<T>> f5951d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ p3<zd.l<T, md.i0>> f5952e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(T t10, c0.a<T, V> aVar, p3<? extends i<T>> p3Var, p3<? extends zd.l<? super T, md.i0>> p3Var2, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f5949b = t10;
                this.f5950c = aVar;
                this.f5951d = p3Var;
                this.f5952e = p3Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                return new a(this.f5949b, this.f5950c, this.f5951d, this.f5952e, dVar);
            }

            @Override // zd.p
            public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f5948a;
                if (i10 == 0) {
                    md.u.b(obj);
                    if (!ae.r.b(this.f5949b, this.f5950c.k())) {
                        c0.a<T, V> aVar = this.f5950c;
                        T t10 = this.f5949b;
                        i iVarG = c.g(this.f5951d);
                        this.f5948a = 1;
                        if (c0.a.f(aVar, t10, iVarG, null, null, this, 12, null) == objE) {
                            return objE;
                        }
                    }
                    return md.i0.f15558a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
                zd.l lVarF = c.f(this.f5952e);
                if (lVarF != null) {
                    lVarF.invoke(this.f5950c.m());
                }
                return md.i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ne.d<T> dVar, c0.a<T, V> aVar, p3<? extends i<T>> p3Var, p3<? extends zd.l<? super T, md.i0>> p3Var2, qd.d<? super b> dVar2) {
            super(2, dVar2);
            this.f5944d = dVar;
            this.f5945e = aVar;
            this.f5946f = p3Var;
            this.f5947g = p3Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            b bVar = new b(this.f5944d, this.f5945e, this.f5946f, this.f5947g, dVar);
            bVar.f5943c = obj;
            return bVar;
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:12:0x0044). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = rd.b.e()
                int r2 = r0.f5942b
                r3 = 1
                if (r2 == 0) goto L24
                if (r2 != r3) goto L1c
                java.lang.Object r2 = r0.f5941a
                ne.f r2 = (ne.f) r2
                java.lang.Object r4 = r0.f5943c
                le.n0 r4 = (le.n0) r4
                md.u.b(r18)
                r6 = r18
                r5 = r0
                goto L44
            L1c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L24:
                md.u.b(r18)
                java.lang.Object r2 = r0.f5943c
                le.n0 r2 = (le.n0) r2
                ne.d<T> r4 = r0.f5944d
                ne.f r4 = r4.iterator()
                r5 = r0
                r16 = r4
                r4 = r2
                r2 = r16
            L37:
                r5.f5943c = r4
                r5.f5941a = r2
                r5.f5942b = r3
                java.lang.Object r6 = r2.a(r5)
                if (r6 != r1) goto L44
                return r1
            L44:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L78
                java.lang.Object r6 = r2.next()
                ne.d<T> r7 = r5.f5944d
                java.lang.Object r7 = r7.g()
                java.lang.Object r7 = ne.h.f(r7)
                if (r7 != 0) goto L5e
                r9 = r6
                goto L5f
            L5e:
                r9 = r7
            L5f:
                r6 = 0
                r14 = 0
                c0.c$b$a r15 = new c0.c$b$a
                c0.a<T, V> r10 = r5.f5945e
                t0.p3<c0.i<T>> r11 = r5.f5946f
                t0.p3<zd.l<T, md.i0>> r12 = r5.f5947g
                r13 = 0
                r8 = r15
                r8.<init>(r9, r10, r11, r12, r13)
                r11 = 3
                r12 = 0
                r7 = r4
                r8 = r6
                r9 = r14
                r10 = r15
                le.i.d(r7, r8, r9, r10, r11, r12)
                goto L37
            L78:
                md.i0 r1 = md.i0.f15558a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: c0.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final p3<w2.h> c(float f10, i<w2.h> iVar, String str, zd.l<? super w2.h, md.i0> lVar, t0.l lVar2, int i10, int i11) {
        lVar2.e(-1407150062);
        i<w2.h> iVar2 = (i11 & 2) != 0 ? f5932b : iVar;
        String str2 = (i11 & 4) != 0 ? "DpAnimation" : str;
        zd.l<? super w2.h, md.i0> lVar3 = (i11 & 8) != 0 ? null : lVar;
        if (t0.o.I()) {
            t0.o.U(-1407150062, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i12 = i10 << 6;
        p3<w2.h> p3VarE = e(w2.h.i(f10), l1.g(w2.h.f22405b), iVar2, null, str2, lVar3, lVar2, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar2.K();
        return p3VarE;
    }

    public static final p3<Float> d(float f10, i<Float> iVar, float f11, String str, zd.l<? super Float, md.i0> lVar, t0.l lVar2, int i10, int i11) {
        lVar2.e(668842840);
        i<Float> iVar2 = (i11 & 2) != 0 ? f5931a : iVar;
        float f12 = (i11 & 4) != 0 ? 0.01f : f11;
        String str2 = (i11 & 8) != 0 ? "FloatAnimation" : str;
        zd.l<? super Float, md.i0> lVar3 = (i11 & 16) != 0 ? null : lVar;
        if (t0.o.I()) {
            t0.o.U(668842840, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        lVar2.e(841393662);
        if (iVar2 == f5931a) {
            Float fValueOf = Float.valueOf(f12);
            lVar2.e(1157296644);
            boolean zN = lVar2.N(fValueOf);
            Object objF = lVar2.f();
            if (zN || objF == t0.l.f20813a.a()) {
                objF = j.g(0.0f, 0.0f, Float.valueOf(f12), 3, null);
                lVar2.E(objF);
            }
            lVar2.K();
            iVar2 = (i) objF;
        }
        lVar2.K();
        int i12 = i10 << 3;
        p3<Float> p3VarE = e(Float.valueOf(f10), l1.b(ae.l.f718a), iVar2, Float.valueOf(f12), str2, lVar3, lVar2, (i12 & 7168) | (i10 & 14) | (57344 & i12) | (i12 & 458752), 0);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar2.K();
        return p3VarE;
    }

    public static final <T, V extends q> p3<T> e(T t10, j1<T, V> j1Var, i<T> iVar, T t11, String str, zd.l<? super T, md.i0> lVar, t0.l lVar2, int i10, int i11) {
        i<T> iVarF;
        lVar2.e(-1994373980);
        if ((i11 & 4) != 0) {
            lVar2.e(-492369756);
            Object objF = lVar2.f();
            if (objF == t0.l.f20813a.a()) {
                objF = j.g(0.0f, 0.0f, null, 7, null);
                lVar2.E(objF);
            }
            lVar2.K();
            iVarF = (i) objF;
        } else {
            iVarF = iVar;
        }
        T t12 = (i11 & 8) != 0 ? null : t11;
        String str2 = (i11 & 16) != 0 ? "ValueAnimation" : str;
        zd.l<? super T, md.i0> lVar3 = (i11 & 32) != 0 ? null : lVar;
        if (t0.o.I()) {
            t0.o.U(-1994373980, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        lVar2.e(-492369756);
        Object objF2 = lVar2.f();
        l.a aVar = t0.l.f20813a;
        if (objF2 == aVar.a()) {
            objF2 = k3.e(null, null, 2, null);
            lVar2.E(objF2);
        }
        lVar2.K();
        t0.k1 k1Var = (t0.k1) objF2;
        lVar2.e(-492369756);
        Object objF3 = lVar2.f();
        if (objF3 == aVar.a()) {
            objF3 = new c0.a(t10, j1Var, t12, str2);
            lVar2.E(objF3);
        }
        lVar2.K();
        c0.a aVar2 = (c0.a) objF3;
        p3 p3VarO = f3.o(lVar3, lVar2, (i10 >> 15) & 14);
        if (t12 != null && (iVarF instanceof a1)) {
            a1 a1Var = (a1) iVarF;
            if (!ae.r.b(a1Var.h(), t12)) {
                iVarF = j.f(a1Var.f(), a1Var.g(), t12);
            }
        }
        p3 p3VarO2 = f3.o(iVarF, lVar2, 0);
        lVar2.e(-492369756);
        Object objF4 = lVar2.f();
        if (objF4 == aVar.a()) {
            objF4 = ne.g.b(-1, null, null, 6, null);
            lVar2.E(objF4);
        }
        lVar2.K();
        ne.d dVar = (ne.d) objF4;
        t0.l0.e(new a(dVar, t10), lVar2, 0);
        t0.l0.d(dVar, new b(dVar, aVar2, p3VarO2, p3VarO, null), lVar2, 72);
        p3<T> p3VarG = (p3) k1Var.getValue();
        if (p3VarG == null) {
            p3VarG = aVar2.g();
        }
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar2.K();
        return p3VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> zd.l<T, md.i0> f(p3<? extends zd.l<? super T, md.i0>> p3Var) {
        return p3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> i<T> g(p3<? extends i<T>> p3Var) {
        return p3Var.getValue();
    }
}
