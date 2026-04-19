package androidx.compose.foundation.gestures;

import ae.s;
import d0.j0;
import e0.p;
import e0.r;
import e0.x;
import e0.z;
import f1.d;
import g0.m;
import le.n0;
import md.i0;
import md.u;
import qd.g;
import sd.j;
import v1.b0;
import v1.m0;
import zd.l;
import zd.q;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l<b0, Boolean> f2327a = a.f2334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q<n0, k1.f, qd.d<? super i0>, Object> f2328b = new C0050e(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x f2329c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z1.l<Boolean> f2330d = z1.e.a(c.f2335a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p f2331e = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f1.d f2332f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final g f2333g = new g();

    static final class a extends s implements l<b0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2334a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(b0 b0Var) {
            return Boolean.valueOf(!m0.g(b0Var.o(), m0.f21952a.b()));
        }
    }

    public static final class b implements f1.d {
        b() {
        }

        @Override // qd.g.b, qd.g
        public <R> R fold(R r10, zd.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) d.a.a(this, r10, pVar);
        }

        @Override // qd.g.b, qd.g
        public <E extends g.b> E get(g.c<E> cVar) {
            return (E) d.a.b(this, cVar);
        }

        @Override // qd.g.b, qd.g
        public qd.g minusKey(g.c<?> cVar) {
            return d.a.c(this, cVar);
        }

        @Override // qd.g
        public qd.g plus(qd.g gVar) {
            return d.a.d(this, gVar);
        }

        @Override // f1.d
        public float w() {
            return 1.0f;
        }
    }

    static final class c extends s implements zd.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f2335a = new c();

        c() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class d implements p {
        d() {
        }

        @Override // e0.p
        public Object a(x xVar, float f10, qd.d<? super Float> dVar) {
            return sd.a.c(0.0f);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.e$e, reason: collision with other inner class name */
    @sd.d(c = "androidx.compose.foundation.gestures.ScrollableKt$NoOpOnDragStarted$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    static final class C0050e extends j implements q<n0, k1.f, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2336a;

        C0050e(qd.d<? super C0050e> dVar) {
            super(3, dVar);
        }

        public final Object a(n0 n0Var, long j10, qd.d<? super i0> dVar) {
            return new C0050e(dVar).invokeSuspend(i0.f15558a);
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ Object invoke(n0 n0Var, k1.f fVar, qd.d<? super i0> dVar) {
            return a(n0Var, fVar.x(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f2336a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return i0.f15558a;
        }
    }

    public static final class f implements x {
        f() {
        }

        @Override // e0.x
        public float a(float f10) {
            return f10;
        }
    }

    public static final class g implements w2.d {
        g() {
        }

        @Override // w2.d
        public float getDensity() {
            return 1.0f;
        }

        @Override // w2.l
        public float y0() {
            return 1.0f;
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {701}, m = "awaitScrollEvent")
    static final class h extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f2337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2339c;

        h(qd.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2338b = obj;
            this.f2339c |= Integer.MIN_VALUE;
            return e.f(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(v1.c r5, qd.d<? super v1.p> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.e.h
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.e$h r0 = (androidx.compose.foundation.gestures.e.h) r0
            int r1 = r0.f2339c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2339c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.e$h r0 = new androidx.compose.foundation.gestures.e$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2338b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f2339c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f2337a
            v1.c r5 = (v1.c) r5
            md.u.b(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            md.u.b(r6)
        L38:
            r0.f2337a = r5
            r0.f2339c = r3
            r6 = 0
            java.lang.Object r6 = v1.c.G(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L44
            return r1
        L44:
            v1.p r6 = (v1.p) r6
            int r2 = r6.e()
            v1.t$a r4 = v1.t.f21997a
            int r4 = r4.f()
            boolean r2 = v1.t.i(r2, r4)
            if (r2 == 0) goto L38
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.f(v1.c, qd.d):java.lang.Object");
    }

    public static final f1.d g() {
        return f2332f;
    }

    public static final z1.l<Boolean> h() {
        return f2330d;
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, z zVar, r rVar, j0 j0Var, boolean z10, boolean z11, p pVar, m mVar, e0.f fVar) {
        return eVar.h(new ScrollableElement(zVar, rVar, j0Var, z10, z11, pVar, mVar, fVar));
    }
}
