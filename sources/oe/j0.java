package oe;

/* JADX INFO: loaded from: classes2.dex */
public final class j0<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f<T> f16516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.p<f<? super T>, qd.d<? super md.i0>, Object> f16517b;

    @sd.d(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0<T> f16521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16522e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j0<T> j0Var, qd.d<? super a> dVar) {
            super(dVar);
            this.f16521d = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16520c = obj;
            this.f16522e |= Integer.MIN_VALUE;
            return this.f16521d.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [pe.q] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(qd.d<? super md.i0> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof oe.j0.a
            if (r0 == 0) goto L13
            r0 = r7
            oe.j0$a r0 = (oe.j0.a) r0
            int r1 = r0.f16522e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16522e = r1
            goto L18
        L13:
            oe.j0$a r0 = new oe.j0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f16520c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f16522e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            md.u.b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f16519b
            pe.q r2 = (pe.q) r2
            java.lang.Object r4 = r0.f16518a
            oe.j0 r4 = (oe.j0) r4
            md.u.b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            md.u.b(r7)
            pe.q r2 = new pe.q
            oe.f<T> r7 = r6.f16516a
            qd.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            zd.p<oe.f<? super T>, qd.d<? super md.i0>, java.lang.Object> r7 = r6.f16517b     // Catch: java.lang.Throwable -> L7d
            r0.f16518a = r6     // Catch: java.lang.Throwable -> L7d
            r0.f16519b = r2     // Catch: java.lang.Throwable -> L7d
            r0.f16522e = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            oe.f<T> r7 = r4.f16516a
            boolean r2 = r7 instanceof oe.j0
            if (r2 == 0) goto L7a
            oe.j0 r7 = (oe.j0) r7
            r2 = 0
            r0.f16518a = r2
            r0.f16519b = r2
            r0.f16522e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            md.i0 r7 = md.i0.f15558a
            return r7
        L7a:
            md.i0 r7 = md.i0.f15558a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.j0.a(qd.d):java.lang.Object");
    }

    @Override // oe.f
    public Object b(T t10, qd.d<? super md.i0> dVar) {
        return this.f16516a.b(t10, dVar);
    }
}
