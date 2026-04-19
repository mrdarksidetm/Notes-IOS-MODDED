package oe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> implements e<T> {

    /* JADX INFO: renamed from: oe.a$a, reason: collision with other inner class name */
    @sd.d(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    static final class C0371a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a<T> f16455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16456d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0371a(a<T> aVar, qd.d<? super C0371a> dVar) {
            super(dVar);
            this.f16455c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16454b = obj;
            this.f16456d |= Integer.MIN_VALUE;
            return this.f16455c.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oe.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(oe.f<? super T> r6, qd.d<? super md.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof oe.a.C0371a
            if (r0 == 0) goto L13
            r0 = r7
            oe.a$a r0 = (oe.a.C0371a) r0
            int r1 = r0.f16456d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16456d = r1
            goto L18
        L13:
            oe.a$a r0 = new oe.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f16454b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f16456d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f16453a
            pe.q r6 = (pe.q) r6
            md.u.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            md.u.b(r7)
            pe.q r7 = new pe.q
            qd.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f16453a = r7     // Catch: java.lang.Throwable -> L55
            r0.f16456d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.d(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            md.i0 r6 = md.i0.f15558a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.a.a(oe.f, qd.d):java.lang.Object");
    }

    public abstract Object d(f<? super T> fVar, qd.d<? super md.i0> dVar);
}
