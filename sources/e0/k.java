package e0;

import ae.h0;
import b2.x1;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.List;
import md.i0;
import v1.m0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s f10377a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final s f10378b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s f10379c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f10380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f10381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f10382f;

    public static final class a implements s {
        a() {
        }

        @Override // e0.s
        public long a(long j10, float f10) {
            return k1.f.s(j10, k1.f.u(k1.f.j(j10, b(j10)), f10));
        }

        @Override // e0.s
        public float b(long j10) {
            return k1.f.m(j10);
        }
    }

    public static final class b implements s {
        b() {
        }

        @Override // e0.s
        public long a(long j10, float f10) {
            return k1.g.a(k1.f.o(j10) - (Math.signum(k1.f.o(j10)) * f10), k1.f.p(j10));
        }

        @Override // e0.s
        public float b(long j10) {
            return Math.abs(k1.f.o(j10));
        }
    }

    public static final class c implements s {
        c() {
        }

        @Override // e0.s
        public long a(long j10, float f10) {
            return k1.g.a(k1.f.o(j10), k1.f.p(j10) - (Math.signum(k1.f.p(j10)) * f10));
        }

        @Override // e0.s
        public float b(long j10) {
            return Math.abs(k1.f.p(j10));
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {878}, m = "awaitDragOrCancellation-rnUCldI")
    static final class d extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10386d;

        d(qd.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10385c = obj;
            this.f10386d |= Integer.MIN_VALUE;
            return k.b(null, 0L, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {809}, m = "awaitLongPressOrCancellation-rnUCldI")
    static final class e extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10390d;

        e(qd.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10389c = obj;
            this.f10390d |= Integer.MIN_VALUE;
            return k.c(null, 0L, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {812, 829}, m = "invokeSuspend")
    static final class f extends sd.i implements zd.p<v1.c, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f10394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0<v1.b0> f10395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0<v1.b0> f10396f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(h0<v1.b0> h0Var, h0<v1.b0> h0Var2, qd.d<? super f> dVar) {
            super(2, dVar);
            this.f10395e = h0Var;
            this.f10396f = h0Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            f fVar = new f(this.f10395e, this.f10396f, dVar);
            fVar.f10394d = obj;
            return fVar;
        }

        @Override // zd.p
        public final Object invoke(v1.c cVar, qd.d<? super i0> dVar) {
            return ((f) create(cVar, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00e3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0079 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00ae A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v10, types: [T, v1.b0] */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c3 -> B:44:0x00c5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 354
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.k.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {R.styleable.AppCompatTheme_textAppearanceSearchResultTitle}, m = "drag-jO51t88")
    static final class g extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10400d;

        g(qd.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10399c = obj;
            this.f10400d |= Integer.MIN_VALUE;
            return k.d(null, 0L, null, this);
        }
    }

    static {
        float fM = w2.h.m((float) 0.125d);
        f10380d = fM;
        float fM2 = w2.h.m(18);
        f10381e = fM2;
        f10382f = fM / fM2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (v1.q.j(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(v1.c r17, long r18, qd.d<? super v1.b0> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.k.b(v1.c, long, qd.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Object, v1.b0] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [v1.b0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(v1.c r9, long r10, qd.d<? super v1.b0> r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof e0.k.e
            if (r0 == 0) goto L13
            r0 = r12
            e0.k$e r0 = (e0.k.e) r0
            int r1 = r0.f10390d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10390d = r1
            goto L18
        L13:
            e0.k$e r0 = new e0.k$e
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f10389c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10390d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.f10388b
            ae.h0 r9 = (ae.h0) r9
            java.lang.Object r10 = r0.f10387a
            v1.b0 r10 = (v1.b0) r10
            md.u.b(r12)     // Catch: v1.s -> L9b
            goto La4
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            md.u.b(r12)
            v1.p r12 = r9.K()
            boolean r12 = e(r12, r10)
            if (r12 == 0) goto L49
            return r4
        L49:
            v1.p r12 = r9.K()
            java.util.List r12 = r12.c()
            r2 = 0
            int r5 = r12.size()
        L56:
            if (r2 >= r5) goto L6d
            java.lang.Object r6 = r12.get(r2)
            r7 = r6
            v1.b0 r7 = (v1.b0) r7
            long r7 = r7.g()
            boolean r7 = v1.a0.d(r7, r10)
            if (r7 == 0) goto L6a
            goto L6e
        L6a:
            int r2 = r2 + 1
            goto L56
        L6d:
            r6 = r4
        L6e:
            r10 = r6
            v1.b0 r10 = (v1.b0) r10
            if (r10 != 0) goto L74
            return r4
        L74:
            ae.h0 r11 = new ae.h0
            r11.<init>()
            ae.h0 r12 = new ae.h0
            r12.<init>()
            r12.f712a = r10
            b2.x1 r2 = r9.getViewConfiguration()
            long r5 = r2.c()
            e0.k$f r2 = new e0.k$f     // Catch: v1.s -> L9a
            r2.<init>(r12, r11, r4)     // Catch: v1.s -> L9a
            r0.f10387a = r10     // Catch: v1.s -> L9a
            r0.f10388b = r11     // Catch: v1.s -> L9a
            r0.f10390d = r3     // Catch: v1.s -> L9a
            java.lang.Object r9 = r9.P(r5, r2, r0)     // Catch: v1.s -> L9a
            if (r9 != r1) goto La4
            return r1
        L9a:
            r9 = r11
        L9b:
            T r9 = r9.f712a
            v1.b0 r9 = (v1.b0) r9
            if (r9 != 0) goto La3
            r4 = r10
            goto La4
        La3:
            r4 = r9
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.k.c(v1.c, long, qd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(v1.c r4, long r5, zd.l<? super v1.b0, md.i0> r7, qd.d<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof e0.k.g
            if (r0 == 0) goto L13
            r0 = r8
            e0.k$g r0 = (e0.k.g) r0
            int r1 = r0.f10400d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10400d = r1
            goto L18
        L13:
            e0.k$g r0 = new e0.k$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f10399c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10400d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f10398b
            zd.l r4 = (zd.l) r4
            java.lang.Object r5 = r0.f10397a
            v1.c r5 = (v1.c) r5
            md.u.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            md.u.b(r8)
        L3e:
            r0.f10397a = r4
            r0.f10398b = r7
            r0.f10400d = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            v1.b0 r8 = (v1.b0) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = sd.a.a(r4)
            return r4
        L55:
            boolean r5 = v1.q.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = sd.a.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.g()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.k.d(v1.c, long, zd.l, qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(v1.p pVar, long j10) {
        v1.b0 b0Var;
        List<v1.b0> listC = pVar.c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                b0Var = null;
                break;
            }
            b0Var = listC.get(i10);
            if (v1.a0.d(b0Var.g(), j10)) {
                break;
            }
            i10++;
        }
        v1.b0 b0Var2 = b0Var;
        if (b0Var2 != null && b0Var2.j()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float f(x1 x1Var, int i10) {
        boolean zG = m0.g(i10, m0.f21952a.b());
        float f10 = x1Var.f();
        return zG ? f10 * f10382f : f10;
    }

    public static final s g(r rVar) {
        return rVar == r.Vertical ? f10378b : f10377a;
    }
}
