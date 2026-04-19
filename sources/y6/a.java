package y6;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: y6.a$a, reason: collision with other inner class name */
    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.CacheFileFromUriKt", f = "CacheFileFromUri.kt", l = {18}, m = "cacheFilePathFromPathOrUri")
    static final class C0487a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f23364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23366c;

        C0487a(qd.d<? super C0487a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23365b = obj;
            this.f23366c |= Integer.MIN_VALUE;
            return a.a(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.lang.String r9, android.app.Activity r10, sc.j.d r11, qd.d<? super java.lang.String> r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof y6.a.C0487a
            if (r0 == 0) goto L13
            r0 = r12
            y6.a$a r0 = (y6.a.C0487a) r0
            int r1 = r0.f23366c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23366c = r1
            goto L18
        L13:
            y6.a$a r0 = new y6.a$a
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.f23365b
            java.lang.Object r0 = rd.b.e()
            int r1 = r6.f23366c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            long r9 = r6.f23364a
            md.u.b(r12)
            goto L61
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            md.u.b(r12)
            y6.m r1 = new y6.m
            r1.<init>()
            long r7 = java.lang.System.nanoTime()
            android.net.Uri r12 = r1.s(r9)
            java.lang.String r12 = r1.o(r12, r10)
            android.net.Uri r3 = r1.s(r9)
            if (r12 != 0) goto L52
            java.lang.String r9 = "Unknown.ext"
            r4 = r9
            goto L53
        L52:
            r4 = r12
        L53:
            r6.f23364a = r7
            r6.f23366c = r2
            r2 = r10
            r5 = r11
            java.lang.Object r12 = r1.i(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L60
            return r0
        L60:
            r9 = r7
        L61:
            java.lang.String r12 = (java.lang.String) r12
            long r0 = java.lang.System.nanoTime()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "Elapsed time in nanoseconds: "
            r11.append(r2)
            long r0 = r0 - r9
            r11.append(r0)
            java.lang.String r9 = r11.toString()
            java.io.PrintStream r10 = java.lang.System.out
            r10.println(r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.a.a(java.lang.String, android.app.Activity, sc.j$d, qd.d):java.lang.Object");
    }
}
