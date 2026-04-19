package e0;

import ae.h0;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import le.n0;
import le.o0;
import md.i0;
import v1.k0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zd.q<t, k1.f, qd.d<? super i0>, Object> f10199a = new a(null);

    @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.q<t, k1.f, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10200a;

        a(qd.d<? super a> dVar) {
            super(3, dVar);
        }

        public final Object a(t tVar, long j10, qd.d<? super i0> dVar) {
            return new a(dVar).invokeSuspend(i0.f15558a);
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ Object invoke(t tVar, k1.f fVar, qd.d<? super i0> dVar) {
            return a(tVar, fVar.x(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f10200a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            md.u.b(obj);
            return i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {279}, m = "awaitFirstDown")
    static final class b extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f10203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f10204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10205e;

        b(qd.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10204d = obj;
            this.f10205e |= Integer.MIN_VALUE;
            return b0.d(null, false, null, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {212}, m = "invokeSuspend")
    static final class c extends sd.i implements zd.p<v1.c, qd.d<? super v1.b0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f10206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f10208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v1.b0 f10209d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(v1.b0 b0Var, qd.d<? super c> dVar) {
            super(2, dVar);
            this.f10209d = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            c cVar = new c(this.f10209d, dVar);
            cVar.f10208c = obj;
            return cVar;
        }

        @Override // zd.p
        public final Object invoke(v1.c cVar, qd.d<? super v1.b0> dVar) {
            return ((c) create(cVar, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:13:0x0052). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r12.f10207b
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                long r3 = r12.f10206a
                java.lang.Object r1 = r12.f10208c
                v1.c r1 = (v1.c) r1
                md.u.b(r13)
                r9 = r3
                r3 = r1
                r1 = r0
                r0 = r12
                goto L52
            L19:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L21:
                md.u.b(r13)
                java.lang.Object r13 = r12.f10208c
                v1.c r13 = (v1.c) r13
                v1.b0 r1 = r12.f10209d
                long r3 = r1.p()
                b2.x1 r1 = r13.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r1 = r13
                r9 = r3
                r13 = r12
            L3a:
                r4 = 0
                r5 = 0
                r7 = 3
                r8 = 0
                r13.f10208c = r1
                r13.f10206a = r9
                r13.f10207b = r2
                r3 = r1
                r6 = r13
                java.lang.Object r3 = e0.b0.e(r3, r4, r5, r6, r7, r8)
                if (r3 != r0) goto L4d
                return r0
            L4d:
                r11 = r0
                r0 = r13
                r13 = r3
                r3 = r1
                r1 = r11
            L52:
                v1.b0 r13 = (v1.b0) r13
                long r4 = r13.p()
                int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r4 < 0) goto L5d
                return r13
            L5d:
                r13 = r0
                r0 = r1
                r1 = r3
                goto L3a
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.b0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {195}, m = "consumeUntilUp")
    static final class d extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10212c;

        d(qd.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10211b = obj;
            this.f10212c |= Integer.MIN_VALUE;
            return b0.g(null, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {232}, m = "invokeSuspend")
    static final class e extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f10215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.q<t, k1.f, qd.d<? super i0>, Object> f10216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.l<k1.f, i0> f10217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u f10218f;

        @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {237, 245}, m = "invokeSuspend")
        static final class a extends sd.i implements zd.p<v1.c, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10219a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f10220b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ n0 f10221c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ zd.q<t, k1.f, qd.d<? super i0>, Object> f10222d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ zd.l<k1.f, i0> f10223e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f10224f;

            /* JADX INFO: renamed from: e0.b0$e$a$a, reason: collision with other inner class name */
            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {234}, m = "invokeSuspend")
            static final class C0238a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10225a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ u f10226b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0238a(u uVar, qd.d<? super C0238a> dVar) {
                    super(2, dVar);
                    this.f10226b = uVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new C0238a(this.f10226b, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((C0238a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f10225a;
                    if (i10 == 0) {
                        md.u.b(obj);
                        u uVar = this.f10226b;
                        this.f10225a = 1;
                        if (uVar.j(this) == objE) {
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

            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {241}, m = "invokeSuspend")
            static final class b extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10227a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ zd.q<t, k1.f, qd.d<? super i0>, Object> f10228b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ u f10229c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ v1.b0 f10230d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(zd.q<? super t, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar, u uVar, v1.b0 b0Var, qd.d<? super b> dVar) {
                    super(2, dVar);
                    this.f10228b = qVar;
                    this.f10229c = uVar;
                    this.f10230d = b0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new b(this.f10228b, this.f10229c, this.f10230d, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f10227a;
                    if (i10 == 0) {
                        md.u.b(obj);
                        zd.q<t, k1.f, qd.d<? super i0>, Object> qVar = this.f10228b;
                        u uVar = this.f10229c;
                        k1.f fVarD = k1.f.d(this.f10230d.i());
                        this.f10227a = 1;
                        if (qVar.invoke(uVar, fVarD, this) == objE) {
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

            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            static final class c extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10231a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ u f10232b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(u uVar, qd.d<? super c> dVar) {
                    super(2, dVar);
                    this.f10232b = uVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new c(this.f10232b, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    rd.d.e();
                    if (this.f10231a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    md.u.b(obj);
                    this.f10232b.d();
                    return i0.f15558a;
                }
            }

            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            static final class d extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10233a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ u f10234b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(u uVar, qd.d<? super d> dVar) {
                    super(2, dVar);
                    this.f10234b = uVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new d(this.f10234b, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((d) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    rd.d.e();
                    if (this.f10233a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    md.u.b(obj);
                    this.f10234b.f();
                    return i0.f15558a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(n0 n0Var, zd.q<? super t, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar, zd.l<? super k1.f, i0> lVar, u uVar, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f10221c = n0Var;
                this.f10222d = qVar;
                this.f10223e = lVar;
                this.f10224f = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                a aVar = new a(this.f10221c, this.f10222d, this.f10223e, this.f10224f, dVar);
                aVar.f10220b = obj;
                return aVar;
            }

            @Override // zd.p
            public final Object invoke(v1.c cVar, qd.d<? super i0> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(i0.f15558a);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
                /*
                    r23 = this;
                    r6 = r23
                    java.lang.Object r7 = rd.b.e()
                    int r0 = r6.f10219a
                    r8 = 2
                    r9 = 1
                    r10 = 0
                    if (r0 == 0) goto L2a
                    if (r0 == r9) goto L1f
                    if (r0 != r8) goto L17
                    md.u.b(r24)
                    r0 = r24
                    goto L7d
                L17:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1f:
                    java.lang.Object r0 = r6.f10220b
                    v1.c r0 = (v1.c) r0
                    md.u.b(r24)
                    r11 = r0
                    r0 = r24
                    goto L51
                L2a:
                    md.u.b(r24)
                    java.lang.Object r0 = r6.f10220b
                    r11 = r0
                    v1.c r11 = (v1.c) r11
                    le.n0 r0 = r6.f10221c
                    r1 = 0
                    r2 = 0
                    e0.b0$e$a$a r3 = new e0.b0$e$a$a
                    e0.u r4 = r6.f10224f
                    r3.<init>(r4, r10)
                    r4 = 3
                    r5 = 0
                    le.i.d(r0, r1, r2, r3, r4, r5)
                    r1 = 0
                    r6.f10220b = r11
                    r6.f10219a = r9
                    r0 = r11
                    r3 = r23
                    java.lang.Object r0 = e0.b0.e(r0, r1, r2, r3, r4, r5)
                    if (r0 != r7) goto L51
                    return r7
                L51:
                    v1.b0 r0 = (v1.b0) r0
                    r0.a()
                    zd.q<e0.t, k1.f, qd.d<? super md.i0>, java.lang.Object> r1 = r6.f10222d
                    zd.q r2 = e0.b0.c()
                    if (r1 == r2) goto L72
                    le.n0 r12 = r6.f10221c
                    r13 = 0
                    r14 = 0
                    e0.b0$e$a$b r15 = new e0.b0$e$a$b
                    zd.q<e0.t, k1.f, qd.d<? super md.i0>, java.lang.Object> r1 = r6.f10222d
                    e0.u r2 = r6.f10224f
                    r15.<init>(r1, r2, r0, r10)
                    r16 = 3
                    r17 = 0
                    le.i.d(r12, r13, r14, r15, r16, r17)
                L72:
                    r6.f10220b = r10
                    r6.f10219a = r8
                    java.lang.Object r0 = e0.b0.l(r11, r10, r6, r9, r10)
                    if (r0 != r7) goto L7d
                    return r7
                L7d:
                    v1.b0 r0 = (v1.b0) r0
                    if (r0 != 0) goto L93
                    le.n0 r11 = r6.f10221c
                    r12 = 0
                    r13 = 0
                    e0.b0$e$a$c r14 = new e0.b0$e$a$c
                    e0.u r0 = r6.f10224f
                    r14.<init>(r0, r10)
                    r15 = 3
                    r16 = 0
                    le.i.d(r11, r12, r13, r14, r15, r16)
                    goto Lbd
                L93:
                    r0.a()
                    le.n0 r1 = r6.f10221c
                    r18 = 0
                    r19 = 0
                    e0.b0$e$a$d r2 = new e0.b0$e$a$d
                    e0.u r3 = r6.f10224f
                    r2.<init>(r3, r10)
                    r21 = 3
                    r22 = 0
                    r17 = r1
                    r20 = r2
                    le.i.d(r17, r18, r19, r20, r21, r22)
                    zd.l<k1.f, md.i0> r1 = r6.f10223e
                    if (r1 == 0) goto Lbd
                    long r2 = r0.i()
                    k1.f r0 = k1.f.d(r2)
                    r1.invoke(r0)
                Lbd:
                    md.i0 r0 = md.i0.f15558a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.b0.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(k0 k0Var, zd.q<? super t, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar, zd.l<? super k1.f, i0> lVar, u uVar, qd.d<? super e> dVar) {
            super(2, dVar);
            this.f10215c = k0Var;
            this.f10216d = qVar;
            this.f10217e = lVar;
            this.f10218f = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            e eVar = new e(this.f10215c, this.f10216d, this.f10217e, this.f10218f, dVar);
            eVar.f10214b = obj;
            return eVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((e) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10213a;
            if (i10 == 0) {
                md.u.b(obj);
                n0 n0Var = (n0) this.f10214b;
                k0 k0Var = this.f10215c;
                a aVar = new a(n0Var, this.f10216d, this.f10217e, this.f10218f, null);
                this.f10213a = 1;
                if (q.c(k0Var, aVar, this) == objE) {
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

    @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {R.styleable.AppCompatTheme_spinnerDropDownItemStyle}, m = "invokeSuspend")
    static final class f extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f10237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.q<t, k1.f, qd.d<? super i0>, Object> f10238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.l<k1.f, i0> f10239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ zd.l<k1.f, i0> f10240f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ zd.l<k1.f, i0> f10241g;

        @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {100, R.styleable.AppCompatTheme_tooltipForegroundColor, 129, 141, 156, 178}, m = "invokeSuspend")
        static final class a extends sd.i implements zd.p<v1.c, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f10242a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f10243b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f10244c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f10245d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f10246e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f10247f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ n0 f10248g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ zd.q<t, k1.f, qd.d<? super i0>, Object> f10249h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ zd.l<k1.f, i0> f10250i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ zd.l<k1.f, i0> f10251j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ zd.l<k1.f, i0> f10252k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ u f10253l;

            /* JADX INFO: renamed from: e0.b0$f$a$a, reason: collision with other inner class name */
            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            static final class C0239a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10254a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ u f10255b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0239a(u uVar, qd.d<? super C0239a> dVar) {
                    super(2, dVar);
                    this.f10255b = uVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new C0239a(this.f10255b, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((C0239a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    rd.d.e();
                    if (this.f10254a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    md.u.b(obj);
                    this.f10255b.f();
                    return i0.f15558a;
                }
            }

            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItem}, m = "invokeSuspend")
            static final class b extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10256a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ u f10257b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(u uVar, qd.d<? super b> dVar) {
                    super(2, dVar);
                    this.f10257b = uVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new b(this.f10257b, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f10256a;
                    if (i10 == 0) {
                        md.u.b(obj);
                        u uVar = this.f10257b;
                        this.f10256a = 1;
                        if (uVar.j(this) == objE) {
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

            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {R.styleable.AppCompatTheme_textAppearancePopupMenuHeader}, m = "invokeSuspend")
            static final class c extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10258a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ zd.q<t, k1.f, qd.d<? super i0>, Object> f10259b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ u f10260c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ v1.b0 f10261d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(zd.q<? super t, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar, u uVar, v1.b0 b0Var, qd.d<? super c> dVar) {
                    super(2, dVar);
                    this.f10259b = qVar;
                    this.f10260c = uVar;
                    this.f10261d = b0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new c(this.f10259b, this.f10260c, this.f10261d, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f10258a;
                    if (i10 == 0) {
                        md.u.b(obj);
                        zd.q<t, k1.f, qd.d<? super i0>, Object> qVar = this.f10259b;
                        u uVar = this.f10260c;
                        k1.f fVarD = k1.f.d(this.f10261d.i());
                        this.f10258a = 1;
                        if (qVar.invoke(uVar, fVarD, this) == objE) {
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

            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "invokeSuspend")
            static final class d extends sd.i implements zd.p<v1.c, qd.d<? super v1.b0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10262a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f10263b;

                d(qd.d<? super d> dVar) {
                    super(2, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    d dVar2 = new d(dVar);
                    dVar2.f10263b = obj;
                    return dVar2;
                }

                @Override // zd.p
                public final Object invoke(v1.c cVar, qd.d<? super v1.b0> dVar) {
                    return ((d) create(cVar, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f10262a;
                    if (i10 == 0) {
                        md.u.b(obj);
                        v1.c cVar = (v1.c) this.f10263b;
                        this.f10262a = 1;
                        obj = b0.l(cVar, null, this, 1, null);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        md.u.b(obj);
                    }
                    return obj;
                }
            }

            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            static final class e extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10264a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ u f10265b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(u uVar, qd.d<? super e> dVar) {
                    super(2, dVar);
                    this.f10265b = uVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new e(this.f10265b, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((e) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    rd.d.e();
                    if (this.f10264a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    md.u.b(obj);
                    this.f10265b.d();
                    return i0.f15558a;
                }
            }

            /* JADX INFO: renamed from: e0.b0$f$a$f, reason: collision with other inner class name */
            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            static final class C0240f extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10266a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ u f10267b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0240f(u uVar, qd.d<? super C0240f> dVar) {
                    super(2, dVar);
                    this.f10267b = uVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new C0240f(this.f10267b, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((C0240f) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    rd.d.e();
                    if (this.f10266a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    md.u.b(obj);
                    this.f10267b.f();
                    return i0.f15558a;
                }
            }

            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            static final class g extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10268a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ u f10269b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(u uVar, qd.d<? super g> dVar) {
                    super(2, dVar);
                    this.f10269b = uVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new g(this.f10269b, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((g) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    rd.d.e();
                    if (this.f10268a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    md.u.b(obj);
                    this.f10269b.f();
                    return i0.f15558a;
                }
            }

            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {148}, m = "invokeSuspend")
            static final class h extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10270a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ u f10271b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(u uVar, qd.d<? super h> dVar) {
                    super(2, dVar);
                    this.f10271b = uVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new h(this.f10271b, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((h) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f10270a;
                    if (i10 == 0) {
                        md.u.b(obj);
                        u uVar = this.f10271b;
                        this.f10270a = 1;
                        if (uVar.j(this) == objE) {
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

            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {151}, m = "invokeSuspend")
            static final class i extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10272a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ zd.q<t, k1.f, qd.d<? super i0>, Object> f10273b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ u f10274c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ v1.b0 f10275d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                i(zd.q<? super t, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar, u uVar, v1.b0 b0Var, qd.d<? super i> dVar) {
                    super(2, dVar);
                    this.f10273b = qVar;
                    this.f10274c = uVar;
                    this.f10275d = b0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new i(this.f10273b, this.f10274c, this.f10275d, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((i) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f10272a;
                    if (i10 == 0) {
                        md.u.b(obj);
                        zd.q<t, k1.f, qd.d<? super i0>, Object> qVar = this.f10273b;
                        u uVar = this.f10274c;
                        k1.f fVarD = k1.f.d(this.f10275d.i());
                        this.f10272a = 1;
                        if (qVar.invoke(uVar, fVarD, this) == objE) {
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

            @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", l = {157}, m = "invokeSuspend")
            static final class j extends sd.i implements zd.p<v1.c, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10276a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f10277b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ n0 f10278c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ zd.l<k1.f, i0> f10279d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ zd.l<k1.f, i0> f10280e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ h0<v1.b0> f10281f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ u f10282g;

                /* JADX INFO: renamed from: e0.b0$f$a$j$a, reason: collision with other inner class name */
                @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
                static final class C0241a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f10283a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ u f10284b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0241a(u uVar, qd.d<? super C0241a> dVar) {
                        super(2, dVar);
                        this.f10284b = uVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                        return new C0241a(this.f10284b, dVar);
                    }

                    @Override // zd.p
                    public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                        return ((C0241a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        rd.d.e();
                        if (this.f10283a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        md.u.b(obj);
                        this.f10284b.f();
                        return i0.f15558a;
                    }
                }

                @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
                static final class b extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f10285a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ u f10286b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(u uVar, qd.d<? super b> dVar) {
                        super(2, dVar);
                        this.f10286b = uVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                        return new b(this.f10286b, dVar);
                    }

                    @Override // zd.p
                    public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                        return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        rd.d.e();
                        if (this.f10285a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        md.u.b(obj);
                        this.f10286b.d();
                        return i0.f15558a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                j(n0 n0Var, zd.l<? super k1.f, i0> lVar, zd.l<? super k1.f, i0> lVar2, h0<v1.b0> h0Var, u uVar, qd.d<? super j> dVar) {
                    super(2, dVar);
                    this.f10278c = n0Var;
                    this.f10279d = lVar;
                    this.f10280e = lVar2;
                    this.f10281f = h0Var;
                    this.f10282g = uVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    j jVar = new j(this.f10278c, this.f10279d, this.f10280e, this.f10281f, this.f10282g, dVar);
                    jVar.f10277b = obj;
                    return jVar;
                }

                @Override // zd.p
                public final Object invoke(v1.c cVar, qd.d<? super i0> dVar) {
                    return ((j) create(cVar, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f10276a;
                    if (i10 == 0) {
                        md.u.b(obj);
                        v1.c cVar = (v1.c) this.f10277b;
                        this.f10276a = 1;
                        obj = b0.l(cVar, null, this, 1, null);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        md.u.b(obj);
                    }
                    v1.b0 b0Var = (v1.b0) obj;
                    if (b0Var != null) {
                        b0Var.a();
                        le.k.d(this.f10278c, null, null, new C0241a(this.f10282g, null), 3, null);
                        this.f10279d.invoke(k1.f.d(b0Var.i()));
                    } else {
                        le.k.d(this.f10278c, null, null, new b(this.f10282g, null), 3, null);
                        zd.l<k1.f, i0> lVar = this.f10280e;
                        if (lVar == null) {
                            return null;
                        }
                        lVar.invoke(k1.f.d(this.f10281f.f712a.i()));
                    }
                    return i0.f15558a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(n0 n0Var, zd.q<? super t, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar, zd.l<? super k1.f, i0> lVar, zd.l<? super k1.f, i0> lVar2, zd.l<? super k1.f, i0> lVar3, u uVar, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f10248g = n0Var;
                this.f10249h = qVar;
                this.f10250i = lVar;
                this.f10251j = lVar2;
                this.f10252k = lVar3;
                this.f10253l = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                a aVar = new a(this.f10248g, this.f10249h, this.f10250i, this.f10251j, this.f10252k, this.f10253l, dVar);
                aVar.f10247f = obj;
                return aVar;
            }

            @Override // zd.p
            public final Object invoke(v1.c cVar, qd.d<? super i0> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(i0.f15558a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00f1 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00fb A[Catch: s -> 0x011d, TryCatch #2 {s -> 0x011d, blocks: (B:34:0x00f5, B:36:0x00fb, B:37:0x0106, B:38:0x010c), top: B:90:0x00f5 }] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x010c A[Catch: s -> 0x011d, TRY_LEAVE, TryCatch #2 {s -> 0x011d, blocks: (B:34:0x00f5, B:36:0x00fb, B:37:0x0106, B:38:0x010c), top: B:90:0x00f5 }] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0142 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0183  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x01fc  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0216 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 572
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.b0.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(k0 k0Var, zd.q<? super t, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar, zd.l<? super k1.f, i0> lVar, zd.l<? super k1.f, i0> lVar2, zd.l<? super k1.f, i0> lVar3, qd.d<? super f> dVar) {
            super(2, dVar);
            this.f10237c = k0Var;
            this.f10238d = qVar;
            this.f10239e = lVar;
            this.f10240f = lVar2;
            this.f10241g = lVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            f fVar = new f(this.f10237c, this.f10238d, this.f10239e, this.f10240f, this.f10241g, dVar);
            fVar.f10236b = obj;
            return fVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((f) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10235a;
            if (i10 == 0) {
                md.u.b(obj);
                n0 n0Var = (n0) this.f10236b;
                u uVar = new u(this.f10237c);
                k0 k0Var = this.f10237c;
                a aVar = new a(n0Var, this.f10238d, this.f10239e, this.f10240f, this.f10241g, uVar, null);
                this.f10235a = 1;
                if (q.c(k0Var, aVar, this) == objE) {
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

    @sd.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {305, 320}, m = "waitForUpOrCancellation")
    static final class g extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10290d;

        g(qd.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10289c = obj;
            this.f10290d |= Integer.MIN_VALUE;
            return b0.k(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
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
    public static final java.lang.Object d(v1.c r9, boolean r10, v1.r r11, qd.d<? super v1.b0> r12) {
        /*
            boolean r0 = r12 instanceof e0.b0.b
            if (r0 == 0) goto L13
            r0 = r12
            e0.b0$b r0 = (e0.b0.b) r0
            int r1 = r0.f10205e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10205e = r1
            goto L18
        L13:
            e0.b0$b r0 = new e0.b0$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f10204d
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10205e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.f10203c
            java.lang.Object r10 = r0.f10202b
            v1.r r10 = (v1.r) r10
            java.lang.Object r11 = r0.f10201a
            v1.c r11 = (v1.c) r11
            md.u.b(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L51
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            md.u.b(r12)
        L42:
            r0.f10201a = r9
            r0.f10202b = r11
            r0.f10203c = r10
            r0.f10205e = r3
            java.lang.Object r12 = r9.J(r11, r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            v1.p r12 = (v1.p) r12
            java.util.List r2 = r12.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5d:
            if (r6 >= r4) goto L77
            java.lang.Object r7 = r2.get(r6)
            v1.b0 r7 = (v1.b0) r7
            if (r10 == 0) goto L6c
            boolean r7 = v1.q.a(r7)
            goto L70
        L6c:
            boolean r7 = v1.q.b(r7)
        L70:
            if (r7 != 0) goto L74
            r2 = r5
            goto L78
        L74:
            int r6 = r6 + 1
            goto L5d
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L42
            java.util.List r9 = r12.c()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.b0.d(v1.c, boolean, v1.r, qd.d):java.lang.Object");
    }

    public static /* synthetic */ Object e(v1.c cVar, boolean z10, v1.r rVar, qd.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            rVar = v1.r.Main;
        }
        return d(cVar, z10, rVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(v1.c cVar, v1.b0 b0Var, qd.d<? super v1.b0> dVar) {
        return cVar.P0(cVar.getViewConfiguration().a(), new c(b0Var, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[EDGE_INSN: B:31:0x007a->B:27:0x007a BREAK  A[LOOP:1: B:22:0x0067->B:26:0x0077], SYNTHETIC] */
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
    public static final java.lang.Object g(v1.c r8, qd.d<? super md.i0> r9) {
        /*
            boolean r0 = r9 instanceof e0.b0.d
            if (r0 == 0) goto L13
            r0 = r9
            e0.b0$d r0 = (e0.b0.d) r0
            int r1 = r0.f10212c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10212c = r1
            goto L18
        L13:
            e0.b0$d r0 = new e0.b0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f10211b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10212c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f10210a
            v1.c r8 = (v1.c) r8
            md.u.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            md.u.b(r9)
        L38:
            r0.f10210a = r8
            r0.f10212c = r3
            r9 = 0
            java.lang.Object r9 = v1.c.G(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            v1.p r9 = (v1.p) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            v1.b0 r7 = (v1.b0) r7
            r7.a()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.c()
            int r2 = r9.size()
            r4 = r5
        L67:
            if (r4 >= r2) goto L7a
            java.lang.Object r6 = r9.get(r4)
            v1.b0 r6 = (v1.b0) r6
            boolean r6 = r6.j()
            if (r6 == 0) goto L77
            r5 = r3
            goto L7a
        L77:
            int r4 = r4 + 1
            goto L67
        L7a:
            if (r5 != 0) goto L38
            md.i0 r8 = md.i0.f15558a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.b0.g(v1.c, qd.d):java.lang.Object");
    }

    public static final Object h(k0 k0Var, zd.q<? super t, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar, zd.l<? super k1.f, i0> lVar, qd.d<? super i0> dVar) {
        Object objE = o0.e(new e(k0Var, qVar, lVar, new u(k0Var), null), dVar);
        return objE == rd.d.e() ? objE : i0.f15558a;
    }

    public static final Object i(k0 k0Var, zd.l<? super k1.f, i0> lVar, zd.l<? super k1.f, i0> lVar2, zd.q<? super t, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar, zd.l<? super k1.f, i0> lVar3, qd.d<? super i0> dVar) {
        Object objE = o0.e(new f(k0Var, qVar, lVar2, lVar, lVar3, null), dVar);
        return objE == rd.d.e() ? objE : i0.f15558a;
    }

    public static /* synthetic */ Object j(k0 k0Var, zd.l lVar, zd.l lVar2, zd.q qVar, zd.l lVar3, qd.d dVar, int i10, Object obj) {
        zd.l lVar4 = (i10 & 1) != 0 ? null : lVar;
        zd.l lVar5 = (i10 & 2) != 0 ? null : lVar2;
        if ((i10 & 4) != 0) {
            qVar = f10199a;
        }
        return i(k0Var, lVar4, lVar5, qVar, (i10 & 8) != 0 ? null : lVar3, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00da -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(v1.c r18, v1.r r19, qd.d<? super v1.b0> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.b0.k(v1.c, v1.r, qd.d):java.lang.Object");
    }

    public static /* synthetic */ Object l(v1.c cVar, v1.r rVar, qd.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = v1.r.Main;
        }
        return k(cVar, rVar, dVar);
    }
}
