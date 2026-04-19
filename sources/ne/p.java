package ne;

import le.n0;
import le.p0;
import md.i0;
import md.t;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    @sd.d(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16204d;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16203c = obj;
            this.f16204d |= Integer.MIN_VALUE;
            return p.a(null, null, this);
        }
    }

    static final class b extends ae.s implements zd.l<Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ le.o<i0> f16205a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(le.o<? super i0> oVar) {
            super(1);
            this.f16205a = oVar;
        }

        public final void a(Throwable th) {
            le.o<i0> oVar = this.f16205a;
            t.a aVar = md.t.f15576b;
            oVar.resumeWith(md.t.b(i0.f15558a));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
            a(th);
            return i0.f15558a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ne.r<?> r4, zd.a<md.i0> r5, qd.d<? super md.i0> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof ne.p.a
            if (r0 == 0) goto L13
            r0 = r6
            ne.p$a r0 = (ne.p.a) r0
            int r1 = r0.f16204d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16204d = r1
            goto L18
        L13:
            ne.p$a r0 = new ne.p$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16203c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f16204d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f16202b
            r5 = r4
            zd.a r5 = (zd.a) r5
            java.lang.Object r4 = r0.f16201a
            ne.r r4 = (ne.r) r4
            md.u.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L7a
        L32:
            r4 = move-exception
            goto L80
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            md.u.b(r6)
            qd.g r6 = r0.getContext()
            le.a2$b r2 = le.a2.R
            qd.g$b r6 = r6.get(r2)
            if (r6 != r4) goto L4d
            r6 = r3
            goto L4e
        L4d:
            r6 = 0
        L4e:
            if (r6 == 0) goto L84
            r0.f16201a = r4     // Catch: java.lang.Throwable -> L32
            r0.f16202b = r5     // Catch: java.lang.Throwable -> L32
            r0.f16204d = r3     // Catch: java.lang.Throwable -> L32
            le.p r6 = new le.p     // Catch: java.lang.Throwable -> L32
            qd.d r2 = rd.b.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.A()     // Catch: java.lang.Throwable -> L32
            ne.p$b r2 = new ne.p$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.e(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.x()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = rd.b.e()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L77
            sd.f.c(r0)     // Catch: java.lang.Throwable -> L32
        L77:
            if (r4 != r1) goto L7a
            return r1
        L7a:
            r5.invoke()
            md.i0 r4 = md.i0.f15558a
            return r4
        L80:
            r5.invoke()
            throw r4
        L84:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.p.a(ne.r, zd.a, qd.d):java.lang.Object");
    }

    public static final <E> t<E> b(n0 n0Var, qd.g gVar, int i10, ne.a aVar, p0 p0Var, zd.l<? super Throwable, i0> lVar, zd.p<? super r<? super E>, ? super qd.d<? super i0>, ? extends Object> pVar) {
        q qVar = new q(le.i0.d(n0Var, gVar), g.b(i10, aVar, null, 4, null));
        if (lVar != null) {
            qVar.invokeOnCompletion(lVar);
        }
        qVar.R0(p0Var, qVar, pVar);
        return qVar;
    }

    public static /* synthetic */ t c(n0 n0Var, qd.g gVar, int i10, ne.a aVar, p0 p0Var, zd.l lVar, zd.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = qd.h.f19040a;
        }
        qd.g gVar2 = gVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            aVar = ne.a.SUSPEND;
        }
        ne.a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            p0Var = p0.DEFAULT;
        }
        p0 p0Var2 = p0Var;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return b(n0Var, gVar2, i12, aVar2, p0Var2, lVar, pVar);
    }
}
