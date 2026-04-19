package oe;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class i {

    @sd.d(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {R.styleable.AppCompatTheme_alertDialogCenterButtons, R.styleable.AppCompatTheme_alertDialogStyle}, m = "emitAllImpl$FlowKt__ChannelsKt")
    static final class a<T> extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f16511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f16512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f16513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f16514f;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16513e = obj;
            this.f16514f |= Integer.MIN_VALUE;
            return i.c(null, null, false, this);
        }
    }

    public static final <T> Object b(f<? super T> fVar, ne.t<? extends T> tVar, qd.d<? super md.i0> dVar) throws Throwable {
        Object objC = c(fVar, tVar, true, dVar);
        return objC == rd.d.e() ? objC : md.i0.f15558a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:13:0x0036, B:22:0x0060, B:26:0x0075, B:28:0x007e, B:18:0x0052, B:21:0x005c), top: B:41:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0090 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(oe.f<? super T> r7, ne.t<? extends T> r8, boolean r9, qd.d<? super md.i0> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof oe.i.a
            if (r0 == 0) goto L13
            r0 = r10
            oe.i$a r0 = (oe.i.a) r0
            int r1 = r0.f16514f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16514f = r1
            goto L18
        L13:
            oe.i$a r0 = new oe.i$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f16513e
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f16514f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            boolean r9 = r0.f16512d
            java.lang.Object r7 = r0.f16511c
            ne.f r7 = (ne.f) r7
            java.lang.Object r8 = r0.f16510b
            ne.t r8 = (ne.t) r8
            java.lang.Object r2 = r0.f16509a
            oe.f r2 = (oe.f) r2
            md.u.b(r10)     // Catch: java.lang.Throwable -> L9b
        L39:
            r10 = r7
            r7 = r2
            goto L60
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            boolean r9 = r0.f16512d
            java.lang.Object r7 = r0.f16511c
            ne.f r7 = (ne.f) r7
            java.lang.Object r8 = r0.f16510b
            ne.t r8 = (ne.t) r8
            java.lang.Object r2 = r0.f16509a
            oe.f r2 = (oe.f) r2
            md.u.b(r10)     // Catch: java.lang.Throwable -> L9b
            goto L75
        L56:
            md.u.b(r10)
            oe.g.k(r7)
            ne.f r10 = r8.iterator()     // Catch: java.lang.Throwable -> L9b
        L60:
            r0.f16509a = r7     // Catch: java.lang.Throwable -> L9b
            r0.f16510b = r8     // Catch: java.lang.Throwable -> L9b
            r0.f16511c = r10     // Catch: java.lang.Throwable -> L9b
            r0.f16512d = r9     // Catch: java.lang.Throwable -> L9b
            r0.f16514f = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L9b
            if (r2 != r1) goto L71
            return r1
        L71:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L75:
            r5 = 0
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9b
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L93
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L9b
            r0.f16509a = r2     // Catch: java.lang.Throwable -> L9b
            r0.f16510b = r8     // Catch: java.lang.Throwable -> L9b
            r0.f16511c = r7     // Catch: java.lang.Throwable -> L9b
            r0.f16512d = r9     // Catch: java.lang.Throwable -> L9b
            r0.f16514f = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r10 = r2.b(r10, r0)     // Catch: java.lang.Throwable -> L9b
            if (r10 != r1) goto L39
            return r1
        L93:
            if (r9 == 0) goto L98
            ne.k.a(r8, r5)
        L98:
            md.i0 r7 = md.i0.f15558a
            return r7
        L9b:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L9d
        L9d:
            r10 = move-exception
            if (r9 == 0) goto La3
            ne.k.a(r8, r7)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.i.c(oe.f, ne.t, boolean, qd.d):java.lang.Object");
    }
}
