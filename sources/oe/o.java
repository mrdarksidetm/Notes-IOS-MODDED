package oe;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f16538a = qe.i0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, a.e.API_PRIORITY_OTHER);

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @sd.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {217, 217}, m = "invokeSuspend")
    static final class a<R, T> extends sd.j implements zd.q<f<? super R>, T, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f16540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<T, qd.d<? super R>, Object> f16542d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zd.p<? super T, ? super qd.d<? super R>, ? extends Object> pVar, qd.d<? super a> dVar) {
            super(3, dVar);
            this.f16542d = pVar;
        }

        @Override // zd.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f<? super R> fVar, T t10, qd.d<? super md.i0> dVar) {
            a aVar = new a(this.f16542d, dVar);
            aVar.f16540b = fVar;
            aVar.f16541c = t10;
            return aVar.invokeSuspend(md.i0.f15558a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to oe.o$a<R, T> for r5v1 'this'  java.lang.Object
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
                int r1 = r5.f16539a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                md.u.b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f16540b
                oe.f r1 = (oe.f) r1
                md.u.b(r6)
                goto L39
            L22:
                md.u.b(r6)
                java.lang.Object r6 = r5.f16540b
                r1 = r6
                oe.f r1 = (oe.f) r1
                java.lang.Object r6 = r5.f16541c
                zd.p<T, qd.d<? super R>, java.lang.Object> r4 = r5.f16542d
                r5.f16540b = r1
                r5.f16539a = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                r3 = 0
                r5.f16540b = r3
                r5.f16539a = r2
                java.lang.Object r6 = r1.b(r6, r5)
                if (r6 != r0) goto L45
                return r0
            L45:
                md.i0 r6 = md.i0.f15558a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T, R> e<R> a(e<? extends T> eVar, zd.p<? super T, ? super qd.d<? super R>, ? extends Object> pVar) {
        return g.t(eVar, new a(pVar, null));
    }

    public static final <T, R> e<R> b(e<? extends T> eVar, zd.q<? super f<? super R>, ? super T, ? super qd.d<? super md.i0>, ? extends Object> qVar) {
        return new pe.i(qVar, eVar, null, 0, null, 28, null);
    }
}
