package le;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes2.dex */
public final class c3 {

    @sd.d(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItemSecondary}, m = "withTimeoutOrNull")
    static final class a<T> extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f14992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f14994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14996e;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14995d = obj;
            this.f14996e |= Integer.MIN_VALUE;
            return c3.d(0L, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final le.a3 a(long r2, le.w0 r4, le.a2 r5) {
        /*
            boolean r0 = r4 instanceof le.y0
            if (r0 == 0) goto L7
            le.y0 r4 = (le.y0) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            ke.a$a r0 = ke.a.f14459b
            ke.d r0 = ke.d.f14468d
            long r0 = ke.c.t(r2, r0)
            java.lang.String r4 = r4.Q(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            le.a3 r2 = new le.a3
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: le.c3.a(long, le.w0, le.a2):le.a3");
    }

    private static final <U, T extends U> Object b(b3<U, ? super T> b3Var, zd.p<? super n0, ? super qd.d<? super T>, ? extends Object> pVar) {
        e2.k(b3Var, x0.b(b3Var.f19049d.getContext()).l(b3Var.f14988e, b3Var, b3Var.getContext()));
        return re.b.c(b3Var, b3Var, pVar);
    }

    public static final <T> Object c(long j10, zd.p<? super n0, ? super qd.d<? super T>, ? extends Object> pVar, qd.d<? super T> dVar) {
        if (j10 <= 0) {
            throw new a3("Timed out immediately");
        }
        Object objB = b(new b3(j10, dVar), pVar);
        if (objB == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, le.b3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object d(long r7, zd.p<? super le.n0, ? super qd.d<? super T>, ? extends java.lang.Object> r9, qd.d<? super T> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof le.c3.a
            if (r0 == 0) goto L13
            r0 = r10
            le.c3$a r0 = (le.c3.a) r0
            int r1 = r0.f14996e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14996e = r1
            goto L18
        L13:
            le.c3$a r0 = new le.c3$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f14995d
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f14996e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f14994c
            ae.h0 r7 = (ae.h0) r7
            java.lang.Object r8 = r0.f14993b
            zd.p r8 = (zd.p) r8
            md.u.b(r10)     // Catch: le.a3 -> L32
            goto L6b
        L32:
            r8 = move-exception
            goto L6e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            md.u.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            ae.h0 r10 = new ae.h0
            r10.<init>()
            r0.f14993b = r9     // Catch: le.a3 -> L6c
            r0.f14994c = r10     // Catch: le.a3 -> L6c
            r0.f14992a = r7     // Catch: le.a3 -> L6c
            r0.f14996e = r4     // Catch: le.a3 -> L6c
            le.b3 r2 = new le.b3     // Catch: le.a3 -> L6c
            r2.<init>(r7, r0)     // Catch: le.a3 -> L6c
            r10.f712a = r2     // Catch: le.a3 -> L6c
            java.lang.Object r7 = b(r2, r9)     // Catch: le.a3 -> L6c
            java.lang.Object r8 = rd.b.e()     // Catch: le.a3 -> L6c
            if (r7 != r8) goto L67
            sd.f.c(r0)     // Catch: le.a3 -> L6c
        L67:
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r10 = r7
        L6b:
            return r10
        L6c:
            r8 = move-exception
            r7 = r10
        L6e:
            le.a2 r9 = r8.f14981a
            T r7 = r7.f712a
            if (r9 != r7) goto L75
            return r3
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: le.c3.d(long, zd.p, qd.d):java.lang.Object");
    }
}
