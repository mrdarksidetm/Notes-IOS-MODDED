package z5;

import md.i0;
import oe.h0;
import oe.s;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;
import y1.v;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class d implements k6.j, v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s<w2.b> f24215b = h0.a(w2.b.b(j.c()));

    static final class a extends ae.s implements l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f24216a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0 t0Var) {
            super(1);
            this.f24216a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.f(aVar, this.f24216a, 0, 0, 0.0f, 4, null);
        }
    }

    public static final class b implements oe.e<k6.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ oe.e f24217a;

        public static final class a<T> implements oe.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ oe.f f24218a;

            /* JADX INFO: renamed from: z5.d$b$a$a, reason: collision with other inner class name */
            @sd.d(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "AsyncImage.kt", l = {225}, m = "emit")
            public static final class C0500a extends kotlin.coroutines.jvm.internal.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f24219a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f24220b;

                public C0500a(qd.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f24219a = obj;
                    this.f24220b |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(oe.f fVar) {
                this.f24218a = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oe.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(java.lang.Object r7, qd.d r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof z5.d.b.a.C0500a
                    if (r0 == 0) goto L13
                    r0 = r8
                    z5.d$b$a$a r0 = (z5.d.b.a.C0500a) r0
                    int r1 = r0.f24220b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24220b = r1
                    goto L18
                L13:
                    z5.d$b$a$a r0 = new z5.d$b$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f24219a
                    java.lang.Object r1 = rd.b.e()
                    int r2 = r0.f24220b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    md.u.b(r8)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    md.u.b(r8)
                    oe.f r8 = r6.f24218a
                    w2.b r7 = (w2.b) r7
                    long r4 = r7.t()
                    k6.i r7 = z5.a.d(r4)
                    if (r7 == 0) goto L4b
                    r0.f24220b = r3
                    java.lang.Object r7 = r8.b(r7, r0)
                    if (r7 != r1) goto L4b
                    return r1
                L4b:
                    md.i0 r7 = md.i0.f15558a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: z5.d.b.a.b(java.lang.Object, qd.d):java.lang.Object");
            }
        }

        public b(oe.e eVar) {
            this.f24217a = eVar;
        }

        @Override // oe.e
        public Object a(oe.f<? super k6.i> fVar, qd.d dVar) {
            Object objA = this.f24217a.a(new a(fVar), dVar);
            return objA == rd.d.e() ? objA : i0.f15558a;
        }
    }

    @Override // k6.j
    public Object c(qd.d<? super k6.i> dVar) {
        return oe.g.l(new b(this.f24215b), dVar);
    }

    @Override // y1.v
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        this.f24215b.setValue(w2.b.b(j10));
        t0 t0VarI = d0Var.I(j10);
        return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new a(t0VarI), 4, null);
    }
}
