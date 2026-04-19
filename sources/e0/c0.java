package e0;

import c0.l1;
import c0.m1;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f10292f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f10293g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c0.m f10294h = new c0.m(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1<c0.m> f10295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10296b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c0.m f10297c = f10294h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f10299e;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final c0.m a() {
            return c0.f10294h;
        }

        public final boolean b(float f10) {
            return Math.abs(f10) < 0.01f;
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {101, 147}, m = "animateToZero")
    static final class b extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f10303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f10304e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f10306g;

        b(qd.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10304e = obj;
            this.f10306g |= Integer.MIN_VALUE;
            return c0.this.h(null, null, this);
        }
    }

    static final class c extends ae.s implements zd.l<Long, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f10308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.l<Float, i0> f10309c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(float f10, zd.l<? super Float, i0> lVar) {
            super(1);
            this.f10308b = f10;
            this.f10309c = lVar;
        }

        public final void a(long j10) {
            if (c0.this.f10296b == Long.MIN_VALUE) {
                c0.this.f10296b = j10;
            }
            c0.m mVar = new c0.m(c0.this.i());
            long jB = (this.f10308b > 0.0f ? 1 : (this.f10308b == 0.0f ? 0 : -1)) == 0 ? c0.this.f10295a.b(new c0.m(c0.this.i()), c0.f10292f.a(), c0.this.f10297c) : ce.c.f((j10 - c0.this.f10296b) / this.f10308b);
            float f10 = ((c0.m) c0.this.f10295a.d(jB, mVar, c0.f10292f.a(), c0.this.f10297c)).f();
            c0 c0Var = c0.this;
            c0Var.f10297c = (c0.m) c0Var.f10295a.g(jB, mVar, c0.f10292f.a(), c0.this.f10297c);
            c0.this.f10296b = j10;
            float fI = c0.this.i() - f10;
            c0.this.j(f10);
            this.f10309c.invoke(Float.valueOf(fI));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Long l10) {
            a(l10.longValue());
            return i0.f15558a;
        }
    }

    static final class d extends ae.s implements zd.l<Long, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<Float, i0> f10311b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(zd.l<? super Float, i0> lVar) {
            super(1);
            this.f10311b = lVar;
        }

        public final void a(long j10) {
            float fI = c0.this.i();
            c0.this.j(0.0f);
            this.f10311b.invoke(Float.valueOf(fI));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Long l10) {
            a(l10.longValue());
            return i0.f15558a;
        }
    }

    public c0(c0.i<Float> iVar) {
        this.f10295a = iVar.a(l1.b(ae.l.f718a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[Catch: all -> 0x00b6, PHI: r0 r1 r2 r13 r14 r15
  0x0085: PHI (r0v9 ??) = (r0v3 ??), (r0v10 ??) binds: [B:30:0x007d, B:41:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r1v3 e0.c0$b) = (r1v1 e0.c0$b), (r1v4 e0.c0$b) binds: [B:30:0x007d, B:41:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r2v4 java.lang.Object) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:30:0x007d, B:41:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r13v6 float) = (r13v4 float), (r13v7 float) binds: [B:30:0x007d, B:41:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r14v8 zd.l<? super java.lang.Float, md.i0>) = (r14v5 zd.l<? super java.lang.Float, md.i0>), (r14v9 zd.l<? super java.lang.Float, md.i0>) binds: [B:30:0x007d, B:41:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r15v16 e0.c0) = (r15v10 e0.c0), (r15v17 e0.c0) binds: [B:30:0x007d, B:41:0x00af] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b6, blocks: (B:36:0x00a5, B:31:0x0085, B:33:0x008f), top: B:60:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:36:0x00a5, B:31:0x0085, B:33:0x008f), top: B:60:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0034, B:53:0x00dc, B:45:0x00b9, B:50:0x00c7), top: B:62:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [zd.a] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [zd.a] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [zd.a<md.i0>] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [e0.c0] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2, types: [e0.c0] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v7, types: [e0.c0, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a2 -> B:60:0x00a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(zd.l<? super java.lang.Float, md.i0> r13, zd.a<md.i0> r14, qd.d<? super md.i0> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.c0.h(zd.l, zd.a, qd.d):java.lang.Object");
    }

    public final float i() {
        return this.f10299e;
    }

    public final void j(float f10) {
        this.f10299e = f10;
    }
}
