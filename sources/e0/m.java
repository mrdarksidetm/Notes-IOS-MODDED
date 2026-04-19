package e0;

import ae.g0;
import e0.j;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f10401a = new a();

    public static final class a implements l {
        a() {
        }

        @Override // e0.l
        public void a(float f10) {
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {575, 584, 689, 731}, m = "awaitDownAndSlop")
    static final class b extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f10405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f10406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f10407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f10408g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f10409h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f10410i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f10411j;

        b(qd.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10410i = obj;
            this.f10411j |= Integer.MIN_VALUE;
            return m.f(null, null, null, null, null, this);
        }
    }

    static final class c extends ae.s implements zd.p<v1.b0, k1.f, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w1.d f10412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f10413b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w1.d dVar, g0 g0Var) {
            super(2);
            this.f10412a = dVar;
            this.f10413b = g0Var;
        }

        public final void a(v1.b0 b0Var, long j10) {
            w1.e.c(this.f10412a, b0Var);
            b0Var.a();
            this.f10413b.f704a = j10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(v1.b0 b0Var, k1.f fVar) {
            a(b0Var, fVar.x());
            return i0.f15558a;
        }
    }

    static final class d extends ae.s implements zd.l<v1.b0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w1.d f10414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ne.u<j> f10415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10416c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(w1.d dVar, ne.u<? super j> uVar, boolean z10) {
            super(1);
            this.f10414a = dVar;
            this.f10415b = uVar;
            this.f10416c = z10;
        }

        public final void a(v1.b0 b0Var) {
            w1.e.c(this.f10414a, b0Var);
            if (v1.q.d(b0Var)) {
                return;
            }
            long jG = v1.q.g(b0Var);
            b0Var.a();
            ne.u<j> uVar = this.f10415b;
            if (this.f10416c) {
                jG = k1.f.u(jG, -1.0f);
            }
            uVar.i(new j.b(jG, null));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(v1.b0 b0Var) {
            a(b0Var);
            return i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {689}, m = "onDragOrUp-Axegvzg")
    static final class e extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f10420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f10421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f10422f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f10423g;

        e(qd.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10422f = obj;
            this.f10423g |= Integer.MIN_VALUE;
            return m.h(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0283 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01fe -> B:78:0x025b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0248 -> B:74:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0285 -> B:38:0x0172). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(v1.c r20, zd.l<? super v1.b0, java.lang.Boolean> r21, zd.a<java.lang.Boolean> r22, w1.d r23, e0.s r24, qd.d<? super md.s<v1.b0, k1.f>> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.m.f(v1.c, zd.l, zd.a, w1.d, e0.s, qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(v1.c cVar, v1.b0 b0Var, long j10, w1.d dVar, ne.u<? super j> uVar, boolean z10, zd.l<? super v1.b0, Boolean> lVar, qd.d<? super Boolean> dVar2) {
        uVar.i(new j.c(k1.f.s(b0Var.i(), k1.g.a(k1.f.o(j10) * Math.signum(k1.f.o(b0Var.i())), k1.f.p(j10) * Math.signum(k1.f.p(b0Var.i())))), null));
        uVar.i(new j.b(z10 ? k1.f.u(j10, -1.0f) : j10, null));
        return h(cVar, lVar, b0Var.g(), new d(dVar, uVar, z10), dVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fb, code lost:
    
        if (r1.invoke(r14).booleanValue() != false) goto L48;
     */
    /* JADX WARN: Path cross not found for [B:46:0x00f1, B:35:0x00c8], limit reached: 65 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008a -> B:23:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(v1.c r18, zd.l<? super v1.b0, java.lang.Boolean> r19, long r20, zd.l<? super v1.b0, md.i0> r22, qd.d<? super java.lang.Boolean> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.m.h(v1.c, zd.l, long, zd.l, qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(long j10, r rVar) {
        return rVar == r.Vertical ? k1.f.p(j10) : k1.f.o(j10);
    }
}
