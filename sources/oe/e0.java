package oe;

import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
final class e0 implements b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f16488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16489c;

    @sd.d(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {178, 180, 182, 183, 185}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.q<f<? super z>, Integer, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f16491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ int f16492c;

        a(qd.d<? super a> dVar) {
            super(3, dVar);
        }

        public final Object a(f<? super z> fVar, int i10, qd.d<? super md.i0> dVar) {
            a aVar = e0.this.new a(dVar);
            aVar.f16491b = fVar;
            aVar.f16492c = i10;
            return aVar.invokeSuspend(md.i0.f15558a);
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ Object invoke(f<? super z> fVar, Integer num, qd.d<? super md.i0> dVar) {
            return a(fVar, num.intValue(), dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r9.f16490a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f16491b
                oe.f r1 = (oe.f) r1
                md.u.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f16491b
                oe.f r1 = (oe.f) r1
                md.u.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f16491b
                oe.f r1 = (oe.f) r1
                md.u.b(r10)
                goto L64
            L38:
                md.u.b(r10)
                goto L9c
            L3c:
                md.u.b(r10)
                java.lang.Object r10 = r9.f16491b
                r1 = r10
                oe.f r1 = (oe.f) r1
                int r10 = r9.f16492c
                if (r10 <= 0) goto L53
                oe.z r10 = oe.z.START
                r9.f16490a = r6
                java.lang.Object r10 = r1.b(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                oe.e0 r10 = oe.e0.this
                long r6 = oe.e0.c(r10)
                r9.f16491b = r1
                r9.f16490a = r5
                java.lang.Object r10 = le.x0.a(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                oe.e0 r10 = oe.e0.this
                long r5 = oe.e0.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                oe.z r10 = oe.z.STOP
                r9.f16491b = r1
                r9.f16490a = r4
                java.lang.Object r10 = r1.b(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                oe.e0 r10 = oe.e0.this
                long r4 = oe.e0.b(r10)
                r9.f16491b = r1
                r9.f16490a = r3
                java.lang.Object r10 = le.x0.a(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                oe.z r10 = oe.z.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f16491b = r3
                r9.f16490a = r2
                java.lang.Object r10 = r1.b(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                md.i0 r10 = md.i0.f15558a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.e0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @sd.d(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<z, qd.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16495b;

        b(qd.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z zVar, qd.d<? super Boolean> dVar) {
            return ((b) create(zVar, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f16495b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f16494a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            md.u.b(obj);
            return sd.a.a(((z) this.f16495b) != z.START);
        }
    }

    public e0(long j10, long j11) {
        this.f16488b = j10;
        this.f16489c = j11;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // oe.b0
    public e<z> a(f0<Integer> f0Var) {
        return g.g(g.h(g.t(f0Var, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f16488b == e0Var.f16488b && this.f16489c == e0Var.f16489c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f16488b) * 31) + Long.hashCode(this.f16489c);
    }

    public String toString() {
        List listC = nd.t.c(2);
        if (this.f16488b > 0) {
            listC.add("stopTimeout=" + this.f16488b + "ms");
        }
        if (this.f16489c < Long.MAX_VALUE) {
            listC.add("replayExpiration=" + this.f16489c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + nd.c0.h0(nd.t.a(listC), null, null, null, 0, null, null, 63, null) + ')';
    }
}
