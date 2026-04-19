package k0;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes.dex */
final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0.d<g> f14299a = new v0.d<>(new g[16], 0);

    @sd.d(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {R.styleable.AppCompatTheme_windowActionModeOverlay}, m = "bringIntoView")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f14304e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f14306g;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14304e = obj;
            this.f14306g |= Integer.MIN_VALUE;
            return e.this.a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please report as a decompilation issue!!! */
    @Override // k0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(k1.h r8, qd.d<? super md.i0> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof k0.e.a
            if (r0 == 0) goto L13
            r0 = r9
            k0.e$a r0 = (k0.e.a) r0
            int r1 = r0.f14306g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14306g = r1
            goto L18
        L13:
            k0.e$a r0 = new k0.e$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f14304e
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f14306g
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f14303d
            int r2 = r0.f14302c
            java.lang.Object r4 = r0.f14301b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f14300a
            k1.h r5 = (k1.h) r5
            md.u.b(r9)
            r9 = r5
            goto L67
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            md.u.b(r9)
            v0.d<k0.g> r9 = r7.f14299a
            int r2 = r9.o()
            if (r2 <= 0) goto L6a
            r4 = 0
            java.lang.Object[] r9 = r9.n()
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L52:
            r5 = r4[r8]
            k0.g r5 = (k0.g) r5
            r0.f14300a = r9
            r0.f14301b = r4
            r0.f14302c = r2
            r0.f14303d = r8
            r0.f14306g = r3
            java.lang.Object r5 = r5.d2(r9, r0)
            if (r5 != r1) goto L67
            return r1
        L67:
            int r8 = r8 + r3
            if (r8 < r2) goto L52
        L6a:
            md.i0 r8 = md.i0.f15558a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.e.a(k1.h, qd.d):java.lang.Object");
    }

    public final v0.d<g> c() {
        return this.f14299a;
    }
}
