package androidx.compose.foundation.gestures;

/* JADX INFO: loaded from: classes.dex */
final class f implements u1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f2340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2341b;

    @sd.d(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {934}, m = "onPostFling-RZ2iAVY")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f2342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f2343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f2344c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2346e;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2344c = obj;
            this.f2346e |= Integer.MIN_VALUE;
            return f.this.W0(0L, 0L, this);
        }
    }

    public f(h hVar, boolean z10) {
        this.f2340a = hVar;
        this.f2341b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // u1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object W0(long r3, long r5, qd.d<? super w2.w> r7) throws java.lang.Throwable {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.f.a
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.f$a r3 = (androidx.compose.foundation.gestures.f.a) r3
            int r4 = r3.f2346e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f2346e = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.f$a r3 = new androidx.compose.foundation.gestures.f$a
            r3.<init>(r7)
        L18:
            java.lang.Object r4 = r3.f2344c
            java.lang.Object r7 = rd.b.e()
            int r0 = r3.f2346e
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L2f
            long r5 = r3.f2343b
            java.lang.Object r3 = r3.f2342a
            androidx.compose.foundation.gestures.f r3 = (androidx.compose.foundation.gestures.f) r3
            md.u.b(r4)
            goto L4e
        L2f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L37:
            md.u.b(r4)
            boolean r4 = r2.f2341b
            if (r4 == 0) goto L59
            androidx.compose.foundation.gestures.h r4 = r2.f2340a
            r3.f2342a = r2
            r3.f2343b = r5
            r3.f2346e = r1
            java.lang.Object r4 = r4.d(r5, r3)
            if (r4 != r7) goto L4d
            return r7
        L4d:
            r3 = r2
        L4e:
            w2.w r4 = (w2.w) r4
            long r0 = r4.o()
            long r4 = w2.w.k(r5, r0)
            goto L60
        L59:
            w2.w$a r3 = w2.w.f22437b
            long r4 = r3.a()
            r3 = r2
        L60:
            w2.w r4 = w2.w.b(r4)
            r4.o()
            androidx.compose.foundation.gestures.h r3 = r3.f2340a
            r5 = 0
            r3.i(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.f.W0(long, long, qd.d):java.lang.Object");
    }

    public final void a(boolean z10) {
        this.f2341b = z10;
    }

    @Override // u1.a
    public long m1(long j10, long j11, int i10) {
        return this.f2341b ? this.f2340a.h(j11) : k1.f.f14338b.c();
    }

    @Override // u1.a
    public long x0(long j10, int i10) {
        if (u1.e.e(i10, u1.e.f21506a.b())) {
            this.f2340a.i(true);
        }
        return k1.f.f14338b.c();
    }
}
