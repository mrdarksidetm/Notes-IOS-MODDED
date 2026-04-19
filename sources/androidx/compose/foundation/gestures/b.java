package androidx.compose.foundation.gestures;

import a2.l;
import d0.c0;
import e0.v;
import e0.x;
import e0.z;
import le.n0;
import md.i0;
import md.u;
import sd.i;
import sd.j;
import v1.k0;
import v1.p0;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
final class b extends l implements a2.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final h f2290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v f2291q;

    @sd.d(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1", f = "Scrollable.kt", l = {669}, m = "invokeSuspend")
    static final class a extends j implements p<k0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2293b;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$a$a, reason: collision with other inner class name */
        @sd.d(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1", f = "Scrollable.kt", l = {671}, m = "invokeSuspend")
        static final class C0046a extends i implements p<v1.c, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f2295a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f2296b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f2297c;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$a$a$a, reason: collision with other inner class name */
            @sd.d(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1", f = "Scrollable.kt", l = {684}, m = "invokeSuspend")
            static final class C0047a extends j implements p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f2298a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ h f2299b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f2300c;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$a$a$a$a, reason: collision with other inner class name */
                @sd.d(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
                static final class C0048a extends j implements p<x, qd.d<? super i0>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f2301a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f2302b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ h f2303c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ long f2304d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0048a(h hVar, long j10, qd.d<? super C0048a> dVar) {
                        super(2, dVar);
                        this.f2303c = hVar;
                        this.f2304d = j10;
                    }

                    @Override // zd.p
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(x xVar, qd.d<? super i0> dVar) {
                        return ((C0048a) create(xVar, dVar)).invokeSuspend(i0.f15558a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                        C0048a c0048a = new C0048a(this.f2303c, this.f2304d, dVar);
                        c0048a.f2302b = obj;
                        return c0048a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        rd.d.e();
                        if (this.f2301a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                        this.f2303c.c((x) this.f2302b, this.f2304d, u1.e.f21506a.c());
                        return i0.f15558a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0047a(h hVar, long j10, qd.d<? super C0047a> dVar) {
                    super(2, dVar);
                    this.f2299b = hVar;
                    this.f2300c = j10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new C0047a(this.f2299b, this.f2300c, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((C0047a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f2298a;
                    if (i10 == 0) {
                        u.b(obj);
                        z zVarE = this.f2299b.e();
                        c0 c0Var = c0.UserInput;
                        C0048a c0048a = new C0048a(this.f2299b, this.f2300c, null);
                        this.f2298a = 1;
                        if (zVarE.e(c0Var, c0048a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                    }
                    return i0.f15558a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0046a(b bVar, qd.d<? super C0046a> dVar) {
                super(2, dVar);
                this.f2297c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                C0046a c0046a = new C0046a(this.f2297c, dVar);
                c0046a.f2296b = obj;
                return c0046a;
            }

            @Override // zd.p
            public final Object invoke(v1.c cVar, qd.d<? super i0> dVar) {
                return ((C0046a) create(cVar, dVar)).invokeSuspend(i0.f15558a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0030 -> B:12:0x0033). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    r17 = this;
                    r0 = r17
                    java.lang.Object r1 = rd.b.e()
                    int r2 = r0.f2295a
                    r3 = 1
                    if (r2 == 0) goto L20
                    if (r2 != r3) goto L18
                    java.lang.Object r2 = r0.f2296b
                    v1.c r2 = (v1.c) r2
                    md.u.b(r18)
                    r5 = r18
                    r4 = r0
                    goto L33
                L18:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L20:
                    md.u.b(r18)
                    java.lang.Object r2 = r0.f2296b
                    v1.c r2 = (v1.c) r2
                    r4 = r0
                L28:
                    r4.f2296b = r2
                    r4.f2295a = r3
                    java.lang.Object r5 = androidx.compose.foundation.gestures.e.a(r2, r4)
                    if (r5 != r1) goto L33
                    return r1
                L33:
                    v1.p r5 = (v1.p) r5
                    java.util.List r6 = r5.c()
                    int r7 = r6.size()
                    r8 = 0
                    r9 = r8
                L3f:
                    if (r9 >= r7) goto L53
                    java.lang.Object r10 = r6.get(r9)
                    v1.b0 r10 = (v1.b0) r10
                    boolean r10 = r10.q()
                    r10 = r10 ^ r3
                    if (r10 != 0) goto L50
                    r6 = r8
                    goto L54
                L50:
                    int r9 = r9 + 1
                    goto L3f
                L53:
                    r6 = r3
                L54:
                    if (r6 == 0) goto L28
                    androidx.compose.foundation.gestures.b r6 = r4.f2297c
                    e0.v r6 = r6.g2()
                    ae.r.c(r6)
                    androidx.compose.foundation.gestures.b r7 = r4.f2297c
                    long r9 = r2.a()
                    long r9 = r6.a(r2, r5, r9)
                    androidx.compose.foundation.gestures.h r6 = androidx.compose.foundation.gestures.b.f2(r7)
                    le.n0 r11 = r7.A1()
                    r12 = 0
                    r13 = 0
                    androidx.compose.foundation.gestures.b$a$a$a r14 = new androidx.compose.foundation.gestures.b$a$a$a
                    r7 = 0
                    r14.<init>(r6, r9, r7)
                    r15 = 3
                    r16 = 0
                    le.i.d(r11, r12, r13, r14, r15, r16)
                    java.util.List r5 = r5.c()
                    int r6 = r5.size()
                L87:
                    if (r8 >= r6) goto L28
                    java.lang.Object r7 = r5.get(r8)
                    v1.b0 r7 = (v1.b0) r7
                    r7.a()
                    int r8 = r8 + 1
                    goto L87
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.a.C0046a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        a(qd.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            a aVar = b.this.new a(dVar);
            aVar.f2293b = obj;
            return aVar;
        }

        @Override // zd.p
        public final Object invoke(k0 k0Var, qd.d<? super i0> dVar) {
            return ((a) create(k0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f2292a;
            if (i10 == 0) {
                u.b(obj);
                k0 k0Var = (k0) this.f2293b;
                C0046a c0046a = new C0046a(b.this, null);
                this.f2292a = 1;
                if (k0Var.B0(c0046a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    public b(h hVar) {
        this.f2290p = hVar;
        a2(p0.a(new a(null)));
    }

    @Override // androidx.compose.ui.e.c
    public void K1() {
        this.f2291q = e0.d.a(this);
    }

    public final v g2() {
        return this.f2291q;
    }
}
