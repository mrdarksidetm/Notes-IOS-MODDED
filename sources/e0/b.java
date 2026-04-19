package e0;

import a2.j1;
import ae.h0;
import com.google.android.gms.common.api.a;
import e0.j;
import le.n0;
import le.o0;
import md.i0;
import v1.k0;
import v1.p0;
import v1.q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends a2.l implements j1, a2.h {
    private g0.b C;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private zd.l<? super v1.b0, Boolean> f10143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f10144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g0.m f10145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private zd.a<Boolean> f10146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private zd.q<? super n0, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> f10147t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private zd.q<? super n0, ? super w2.w, ? super qd.d<? super i0>, ? extends Object> f10148u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10149v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f10153z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final zd.l<v1.b0, Boolean> f10150w = new a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final zd.a<Boolean> f10151x = new C0235b();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final w1.d f10152y = new w1.d();
    private final q0 A = (q0) a2(p0.a(new c(null)));
    private final ne.d<j> B = ne.g.b(a.e.API_PRIORITY_OTHER, null, null, 6, null);

    static final class a extends ae.s implements zd.l<v1.b0, Boolean> {
        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(v1.b0 b0Var) {
            return b.this.r2().invoke(b0Var);
        }
    }

    /* JADX INFO: renamed from: e0.b$b, reason: collision with other inner class name */
    static final class C0235b extends ae.s implements zd.a<Boolean> {
        C0235b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return b.this.x2().invoke();
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1", f = "Draggable.kt", l = {456}, m = "invokeSuspend")
    static final class c extends sd.j implements zd.p<k0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10157b;

        @sd.d(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1", f = "Draggable.kt", l = {458}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10159a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f10160b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k0 f10161c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f10162d;

            /* JADX INFO: renamed from: e0.b$c$a$a, reason: collision with other inner class name */
            @sd.d(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1", f = "Draggable.kt", l = {460, 475}, m = "invokeSuspend")
            static final class C0236a extends sd.i implements zd.p<v1.c, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f10163a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f10164b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f10165c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                int f10166d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private /* synthetic */ Object f10167e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ n0 f10168f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ b f10169g;

                /* JADX INFO: renamed from: e0.b$c$a$a$a, reason: collision with other inner class name */
                static final class C0237a extends ae.s implements zd.l<v1.b0, Boolean> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ b f10170a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0237a(b bVar) {
                        super(1);
                        this.f10170a = bVar;
                    }

                    @Override // zd.l
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(v1.b0 b0Var) {
                        return Boolean.valueOf(!(this.f10170a.u2().b(v1.q.h(b0Var)) == 0.0f));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0236a(n0 n0Var, b bVar, qd.d<? super C0236a> dVar) {
                    super(2, dVar);
                    this.f10168f = n0Var;
                    this.f10169g = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    C0236a c0236a = new C0236a(this.f10168f, this.f10169g, dVar);
                    c0236a.f10167e = obj;
                    return c0236a;
                }

                @Override // zd.p
                public final Object invoke(v1.c cVar, qd.d<? super i0> dVar) {
                    return ((C0236a) create(cVar, dVar)).invokeSuspend(i0.f15558a);
                }

                /* JADX WARN: Can't wrap try/catch for region: R(8:26|(1:28)|79|29|30|81|31|(1:33)(8:34|77|35|36|(0)(0)|58|18|(2:71|72)(0))) */
                /* JADX WARN: Can't wrap try/catch for region: R(9:6|(3:73|7|8)|77|35|36|(3:38|(1:40)(1:41)|42)(1:57)|58|18|(2:20|(1:22)(4:23|16|24|(8:26|(1:28)|79|29|30|81|31|(1:33)(8:34|77|35|36|(0)(0)|58|18|(2:71|72)(0)))(3:70|18|(0)(0))))(0)) */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x0123, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x0125, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x0127, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x0128, code lost:
                
                    r12 = r2;
                    r2 = r15;
                    r11 = r20;
                    r10 = r13;
                    r14 = r22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x0131, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0132, code lost:
                
                    r20 = r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
                
                    r11 = r20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x0137, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
                
                    r12 = r2;
                    r2 = r15;
                    r11 = r12;
                    r10 = r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x015a, code lost:
                
                    r0 = e0.j.a.f10373a;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x014b  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0165 A[Catch: all -> 0x0166, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0166, blocks: (B:54:0x0145, B:59:0x0165), top: B:75:0x0145 }] */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0177  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x019c  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x01a6  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x01af  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00dd -> B:77:0x00e6). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01a6 -> B:18:0x0052). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 434
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e0.b.c.a.C0236a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k0 k0Var, b bVar, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f10161c = k0Var;
                this.f10162d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                a aVar = new a(this.f10161c, this.f10162d, dVar);
                aVar.f10160b = obj;
                return aVar;
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = rd.b.e()
                    int r1 = r7.f10159a
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r0 = r7.f10160b
                    le.n0 r0 = (le.n0) r0
                    md.u.b(r8)     // Catch: java.util.concurrent.CancellationException -> L13
                    goto L43
                L13:
                    r8 = move-exception
                    goto L3d
                L15:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1d:
                    md.u.b(r8)
                    java.lang.Object r8 = r7.f10160b
                    le.n0 r8 = (le.n0) r8
                    v1.k0 r1 = r7.f10161c     // Catch: java.util.concurrent.CancellationException -> L39
                    e0.b$c$a$a r3 = new e0.b$c$a$a     // Catch: java.util.concurrent.CancellationException -> L39
                    e0.b r4 = r7.f10162d     // Catch: java.util.concurrent.CancellationException -> L39
                    r5 = 0
                    r3.<init>(r8, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L39
                    r7.f10160b = r8     // Catch: java.util.concurrent.CancellationException -> L39
                    r7.f10159a = r2     // Catch: java.util.concurrent.CancellationException -> L39
                    java.lang.Object r8 = r1.B0(r3, r7)     // Catch: java.util.concurrent.CancellationException -> L39
                    if (r8 != r0) goto L43
                    return r0
                L39:
                    r0 = move-exception
                    r6 = r0
                    r0 = r8
                    r8 = r6
                L3d:
                    boolean r0 = le.o0.g(r0)
                    if (r0 == 0) goto L46
                L43:
                    md.i0 r8 = md.i0.f15558a
                    return r8
                L46:
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.b.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        c(qd.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            c cVar = b.this.new c(dVar);
            cVar.f10157b = obj;
            return cVar;
        }

        @Override // zd.p
        public final Object invoke(k0 k0Var, qd.d<? super i0> dVar) {
            return ((c) create(k0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10156a;
            if (i10 == 0) {
                md.u.b(obj);
                k0 k0Var = (k0) this.f10157b;
                if (!b.this.s2()) {
                    return i0.f15558a;
                }
                a aVar = new a(k0Var, b.this, null);
                this.f10156a = 1;
                if (o0.e(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", l = {554, 557}, m = "processDragCancel")
    static final class d extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10173c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10175e;

        d(qd.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10173c = obj;
            this.f10175e |= Integer.MIN_VALUE;
            return b.this.y2(null, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", l = {536, 539, 541}, m = "processDragStart")
    static final class e extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f10179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f10180e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f10182g;

        e(qd.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10180e = obj;
            this.f10182g |= Integer.MIN_VALUE;
            return b.this.z2(null, null, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", l = {546, 549}, m = "processDragStop")
    static final class f extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f10186d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10188f;

        f(qd.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10186d = obj;
            this.f10188f |= Integer.MIN_VALUE;
            return b.this.A2(null, null, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1", f = "Draggable.kt", l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend")
    static final class g extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f10192d;

        @sd.d(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {437, 438}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<e0.a, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f10194a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f10195b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f10196c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ h0<j> f10197d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f10198e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0<j> h0Var, b bVar, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f10197d = h0Var;
                this.f10198e = bVar;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(e0.a aVar, qd.d<? super i0> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                a aVar = new a(this.f10197d, this.f10198e, dVar);
                aVar.f10196c = obj;
                return aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007d -> B:27:0x0083). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
                /*
                    r9 = this;
                    java.lang.Object r0 = rd.b.e()
                    int r1 = r9.f10195b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L27
                    if (r1 != r2) goto L1f
                    java.lang.Object r1 = r9.f10194a
                    ae.h0 r1 = (ae.h0) r1
                    java.lang.Object r4 = r9.f10196c
                    e0.a r4 = (e0.a) r4
                    md.u.b(r10)
                    r5 = r4
                    r4 = r1
                    r1 = r0
                    r0 = r9
                    goto L83
                L1f:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L27:
                    java.lang.Object r1 = r9.f10196c
                    e0.a r1 = (e0.a) r1
                    md.u.b(r10)
                    r10 = r9
                    goto L67
                L30:
                    md.u.b(r10)
                    java.lang.Object r10 = r9.f10196c
                    e0.a r10 = (e0.a) r10
                    r1 = r10
                    r10 = r9
                L39:
                    ae.h0<e0.j> r4 = r10.f10197d
                    T r4 = r4.f712a
                    boolean r5 = r4 instanceof e0.j.d
                    if (r5 != 0) goto L89
                    boolean r5 = r4 instanceof e0.j.a
                    if (r5 != 0) goto L89
                    boolean r5 = r4 instanceof e0.j.b
                    r6 = 0
                    if (r5 == 0) goto L4e
                    r5 = r4
                    e0.j$b r5 = (e0.j.b) r5
                    goto L4f
                L4e:
                    r5 = r6
                L4f:
                    if (r5 == 0) goto L67
                    e0.b r5 = r10.f10198e
                    java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragDelta"
                    ae.r.d(r4, r7)
                    e0.j$b r4 = (e0.j.b) r4
                    r10.f10196c = r1
                    r10.f10194a = r6
                    r10.f10195b = r3
                    java.lang.Object r4 = r5.q2(r1, r4, r10)
                    if (r4 != r0) goto L67
                    return r0
                L67:
                    r4 = r1
                    ae.h0<e0.j> r1 = r10.f10197d
                    e0.b r5 = r10.f10198e
                    ne.d r5 = e0.b.f2(r5)
                    r10.f10196c = r4
                    r10.f10194a = r1
                    r10.f10195b = r2
                    java.lang.Object r5 = r5.c(r10)
                    if (r5 != r0) goto L7d
                    return r0
                L7d:
                    r8 = r0
                    r0 = r10
                    r10 = r5
                    r5 = r4
                    r4 = r1
                    r1 = r8
                L83:
                    r4.f712a = r10
                    r10 = r0
                    r0 = r1
                    r1 = r5
                    goto L39
                L89:
                    md.i0 r10 = md.i0.f15558a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.b.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        g(qd.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            g gVar = b.this.new g(dVar);
            gVar.f10192d = obj;
            return gVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((g) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[Catch: CancellationException -> 0x00f2, TryCatch #0 {CancellationException -> 0x00f2, blocks: (B:37:0x00be, B:39:0x00c4, B:42:0x00db, B:44:0x00df), top: B:58:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[Catch: CancellationException -> 0x00f2, TryCatch #0 {CancellationException -> 0x00f2, blocks: (B:37:0x00be, B:39:0x00c4, B:42:0x00db, B:44:0x00df), top: B:58:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0104 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ef -> B:21:0x0064). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0107 -> B:21:0x0064). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 288
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(zd.l<? super v1.b0, Boolean> lVar, boolean z10, g0.m mVar, zd.a<Boolean> aVar, zd.q<? super n0, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar, zd.q<? super n0, ? super w2.w, ? super qd.d<? super i0>, ? extends Object> qVar2, boolean z11) {
        this.f10143p = lVar;
        this.f10144q = z10;
        this.f10145r = mVar;
        this.f10146s = aVar;
        this.f10147t = qVar;
        this.f10148u = qVar2;
        this.f10149v = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A2(le.n0 r10, e0.j.d r11, qd.d<? super md.i0> r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof e0.b.f
            if (r0 == 0) goto L13
            r0 = r12
            e0.b$f r0 = (e0.b.f) r0
            int r1 = r0.f10188f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10188f = r1
            goto L18
        L13:
            e0.b$f r0 = new e0.b$f
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f10186d
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10188f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            md.u.b(r12)
            goto L85
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            java.lang.Object r10 = r0.f10185c
            e0.j$d r10 = (e0.j.d) r10
            java.lang.Object r11 = r0.f10184b
            le.n0 r11 = (le.n0) r11
            java.lang.Object r2 = r0.f10183a
            e0.b r2 = (e0.b) r2
            md.u.b(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L68
        L48:
            md.u.b(r12)
            g0.b r12 = r9.C
            if (r12 == 0) goto L6b
            g0.m r2 = r9.f10145r
            if (r2 == 0) goto L67
            g0.c r6 = new g0.c
            r6.<init>(r12)
            r0.f10183a = r9
            r0.f10184b = r10
            r0.f10185c = r11
            r0.f10188f = r4
            java.lang.Object r12 = r2.c(r6, r0)
            if (r12 != r1) goto L67
            return r1
        L67:
            r2 = r9
        L68:
            r2.C = r5
            goto L6c
        L6b:
            r2 = r9
        L6c:
            zd.q<? super le.n0, ? super w2.w, ? super qd.d<? super md.i0>, ? extends java.lang.Object> r12 = r2.f10148u
            long r6 = r11.a()
            w2.w r11 = w2.w.b(r6)
            r0.f10183a = r5
            r0.f10184b = r5
            r0.f10185c = r5
            r0.f10188f = r3
            java.lang.Object r10 = r12.invoke(r10, r11, r0)
            if (r10 != r1) goto L85
            return r1
        L85:
            md.i0 r10 = md.i0.f15558a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.b.A2(le.n0, e0.j$d, qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2() {
        this.f10153z = true;
        le.k.d(A1(), null, null, new g(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y2(le.n0 r9, qd.d<? super md.i0> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof e0.b.d
            if (r0 == 0) goto L13
            r0 = r10
            e0.b$d r0 = (e0.b.d) r0
            int r1 = r0.f10175e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10175e = r1
            goto L18
        L13:
            e0.b$d r0 = new e0.b$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f10173c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10175e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            md.u.b(r10)
            goto L7c
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.f10172b
            le.n0 r9 = (le.n0) r9
            java.lang.Object r2 = r0.f10171a
            e0.b r2 = (e0.b) r2
            md.u.b(r10)
            goto L5f
        L41:
            md.u.b(r10)
            g0.b r10 = r8.C
            if (r10 == 0) goto L62
            g0.m r2 = r8.f10145r
            if (r2 == 0) goto L5e
            g0.a r6 = new g0.a
            r6.<init>(r10)
            r0.f10171a = r8
            r0.f10172b = r9
            r0.f10175e = r4
            java.lang.Object r10 = r2.c(r6, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            r2 = r8
        L5f:
            r2.C = r5
            goto L63
        L62:
            r2 = r8
        L63:
            zd.q<? super le.n0, ? super w2.w, ? super qd.d<? super md.i0>, ? extends java.lang.Object> r10 = r2.f10148u
            w2.w$a r2 = w2.w.f22437b
            long r6 = r2.a()
            w2.w r2 = w2.w.b(r6)
            r0.f10171a = r5
            r0.f10172b = r5
            r0.f10175e = r3
            java.lang.Object r9 = r10.invoke(r9, r2, r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            md.i0 r9 = md.i0.f15558a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.b.y2(le.n0, qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z2(le.n0 r9, e0.j.c r10, qd.d<? super md.i0> r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof e0.b.e
            if (r0 == 0) goto L13
            r0 = r11
            e0.b$e r0 = (e0.b.e) r0
            int r1 = r0.f10182g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10182g = r1
            goto L18
        L13:
            e0.b$e r0 = new e0.b$e
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f10180e
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10182g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5f
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            md.u.b(r11)
            goto Lbd
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f10179d
            g0.b r9 = (g0.b) r9
            java.lang.Object r10 = r0.f10178c
            e0.j$c r10 = (e0.j.c) r10
            java.lang.Object r2 = r0.f10177b
            le.n0 r2 = (le.n0) r2
            java.lang.Object r4 = r0.f10176a
            e0.b r4 = (e0.b) r4
            md.u.b(r11)
            goto L9c
        L4c:
            java.lang.Object r9 = r0.f10178c
            e0.j$c r9 = (e0.j.c) r9
            java.lang.Object r10 = r0.f10177b
            le.n0 r10 = (le.n0) r10
            java.lang.Object r2 = r0.f10176a
            e0.b r2 = (e0.b) r2
            md.u.b(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7f
        L5f:
            md.u.b(r11)
            g0.b r11 = r8.C
            if (r11 == 0) goto L7e
            g0.m r2 = r8.f10145r
            if (r2 == 0) goto L7e
            g0.a r6 = new g0.a
            r6.<init>(r11)
            r0.f10176a = r8
            r0.f10177b = r9
            r0.f10178c = r10
            r0.f10182g = r5
            java.lang.Object r11 = r2.c(r6, r0)
            if (r11 != r1) goto L7e
            return r1
        L7e:
            r2 = r8
        L7f:
            g0.b r11 = new g0.b
            r11.<init>()
            g0.m r5 = r2.f10145r
            if (r5 == 0) goto L9f
            r0.f10176a = r2
            r0.f10177b = r9
            r0.f10178c = r10
            r0.f10179d = r11
            r0.f10182g = r4
            java.lang.Object r4 = r5.c(r11, r0)
            if (r4 != r1) goto L99
            return r1
        L99:
            r4 = r2
            r2 = r9
            r9 = r11
        L9c:
            r11 = r9
            r9 = r2
            r2 = r4
        L9f:
            r2.C = r11
            zd.q<? super le.n0, ? super k1.f, ? super qd.d<? super md.i0>, ? extends java.lang.Object> r11 = r2.f10147t
            long r4 = r10.a()
            k1.f r10 = k1.f.d(r4)
            r2 = 0
            r0.f10176a = r2
            r0.f10177b = r2
            r0.f10178c = r2
            r0.f10179d = r2
            r0.f10182g = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto Lbd
            return r1
        Lbd:
            md.i0 r9 = md.i0.f15558a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.b.z2(le.n0, e0.j$c, qd.d):java.lang.Object");
    }

    public final void B2(zd.l<? super v1.b0, Boolean> lVar) {
        this.f10143p = lVar;
    }

    public final void C2(boolean z10) {
        this.f10144q = z10;
    }

    public final void D2(g0.m mVar) {
        this.f10145r = mVar;
    }

    public final void E2(zd.q<? super n0, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar) {
        this.f10147t = qVar;
    }

    public final void F2(zd.q<? super n0, ? super w2.w, ? super qd.d<? super i0>, ? extends Object> qVar) {
        this.f10148u = qVar;
    }

    public final void G2(boolean z10) {
        this.f10149v = z10;
    }

    public final void H2(zd.a<Boolean> aVar) {
        this.f10146s = aVar;
    }

    @Override // androidx.compose.ui.e.c
    public void L1() {
        this.f10153z = false;
        o2();
    }

    @Override // a2.j1
    public void Z(v1.p pVar, v1.r rVar, long j10) {
        this.A.Z(pVar, rVar, j10);
    }

    @Override // a2.j1
    public void c0() {
        this.A.c0();
    }

    public final void o2() {
        g0.b bVar = this.C;
        if (bVar != null) {
            g0.m mVar = this.f10145r;
            if (mVar != null) {
                mVar.a(new g0.a(bVar));
            }
            this.C = null;
        }
    }

    public abstract Object p2(zd.p<? super e0.a, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super i0> dVar);

    public abstract Object q2(e0.a aVar, j.b bVar, qd.d<? super i0> dVar);

    public final zd.l<v1.b0, Boolean> r2() {
        return this.f10143p;
    }

    public final boolean s2() {
        return this.f10144q;
    }

    public final g0.m t2() {
        return this.f10145r;
    }

    public abstract s u2();

    public final q0 v2() {
        return this.A;
    }

    public final boolean w2() {
        return this.f10149v;
    }

    public final zd.a<Boolean> x2() {
        return this.f10146s;
    }
}
