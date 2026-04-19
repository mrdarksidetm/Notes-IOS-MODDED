package oe;

/* JADX INFO: loaded from: classes2.dex */
final class b<T> extends c<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zd.p<ne.r<? super T>, qd.d<? super md.i0>, Object> f16461e;

    @sd.d(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {334}, m = "collectTo")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<T> f16464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16465d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, qd.d<? super a> dVar) {
            super(dVar);
            this.f16464c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16463b = obj;
            this.f16465d |= Integer.MIN_VALUE;
            return this.f16464c.g(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(zd.p<? super ne.r<? super T>, ? super qd.d<? super md.i0>, ? extends Object> pVar, qd.g gVar, int i10, ne.a aVar) {
        super(pVar, gVar, i10, aVar);
        this.f16461e = pVar;
    }

    public /* synthetic */ b(zd.p pVar, qd.g gVar, int i10, ne.a aVar, int i11, ae.j jVar) {
        this(pVar, (i11 & 2) != 0 ? qd.h.f19040a : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? ne.a.SUSPEND : aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oe.c, pe.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object g(ne.r<? super T> r5, qd.d<? super md.i0> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof oe.b.a
            if (r0 == 0) goto L13
            r0 = r6
            oe.b$a r0 = (oe.b.a) r0
            int r1 = r0.f16465d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16465d = r1
            goto L18
        L13:
            oe.b$a r0 = new oe.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f16463b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f16465d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f16462a
            ne.r r5 = (ne.r) r5
            md.u.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            md.u.b(r6)
            r0.f16462a = r5
            r0.f16465d = r3
            java.lang.Object r6 = super.g(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.k()
            if (r5 == 0) goto L4c
            md.i0 r5 = md.i0.f15558a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.b.g(ne.r, qd.d):java.lang.Object");
    }

    @Override // pe.e
    protected pe.e<T> j(qd.g gVar, int i10, ne.a aVar) {
        return new b(this.f16461e, gVar, i10, aVar);
    }
}
