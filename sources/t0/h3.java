package t0;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class h3 {

    @sd.d(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1", f = "ProduceState.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingLeft}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f20783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.p<y1<T>, qd.d<? super md.i0>, Object> f20784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1<T> f20785d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zd.p<? super y1<T>, ? super qd.d<? super md.i0>, ? extends Object> pVar, k1<T> k1Var, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f20784c = pVar;
            this.f20785d = k1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            a aVar = new a(this.f20784c, this.f20785d, dVar);
            aVar.f20783b = obj;
            return aVar;
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to t0.h3$a for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r5.f20782a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                md.u.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                md.u.b(r6)
                java.lang.Object r6 = r5.f20783b
                le.n0 r6 = (le.n0) r6
                zd.p<t0.y1<T>, qd.d<? super md.i0>, java.lang.Object> r1 = r5.f20784c
                t0.z1 r3 = new t0.z1
                t0.k1<T> r4 = r5.f20785d
                qd.g r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f20782a = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                md.i0 r6 = md.i0.f15558a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.h3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @sd.d(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = {150}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f20787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.p<y1<T>, qd.d<? super md.i0>, Object> f20788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1<T> f20789d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(zd.p<? super y1<T>, ? super qd.d<? super md.i0>, ? extends Object> pVar, k1<T> k1Var, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f20788c = pVar;
            this.f20789d = k1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            b bVar = new b(this.f20788c, this.f20789d, dVar);
            bVar.f20787b = obj;
            return bVar;
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to t0.h3$b for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r5.f20786a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                md.u.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                md.u.b(r6)
                java.lang.Object r6 = r5.f20787b
                le.n0 r6 = (le.n0) r6
                zd.p<t0.y1<T>, qd.d<? super md.i0>, java.lang.Object> r1 = r5.f20788c
                t0.z1 r3 = new t0.z1
                t0.k1<T> r4 = r5.f20789d
                qd.g r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f20786a = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                md.i0 r6 = md.i0.f15558a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.h3.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> p3<T> a(T t10, Object obj, Object obj2, zd.p<? super y1<T>, ? super qd.d<? super md.i0>, ? extends Object> pVar, l lVar, int i10) {
        lVar.e(-1703169085);
        if (o.I()) {
            o.U(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        lVar.e(-492369756);
        Object objF = lVar.f();
        if (objF == l.f20813a.a()) {
            objF = k3.e(t10, null, 2, null);
            lVar.E(objF);
        }
        lVar.K();
        k1 k1Var = (k1) objF;
        l0.c(obj, obj2, new b(pVar, k1Var, null), lVar, 584);
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return k1Var;
    }

    public static final <T> p3<T> b(T t10, zd.p<? super y1<T>, ? super qd.d<? super md.i0>, ? extends Object> pVar, l lVar, int i10) {
        lVar.e(10454275);
        if (o.I()) {
            o.U(10454275, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        lVar.e(-492369756);
        Object objF = lVar.f();
        if (objF == l.f20813a.a()) {
            objF = k3.e(t10, null, 2, null);
            lVar.E(objF);
        }
        lVar.K();
        k1 k1Var = (k1) objF;
        l0.d(md.i0.f15558a, new a(pVar, k1Var, null), lVar, 70);
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return k1Var;
    }
}
