package t0;

import com.google.android.gms.common.api.a;
import d1.k;
import t0.f0;

/* JADX INFO: loaded from: classes.dex */
final class e0<T> extends d1.h0 implements f0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.a<T> f20661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e3<T> f20662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a<T> f20663d = new a<>();

    public static final class a<T> extends d1.i0 implements f0.a<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0424a f20664h = new C0424a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f20665i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final Object f20666j = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f20668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private z.w<d1.g0> f20669e = z.x.a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f20670f = f20666j;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f20671g;

        /* JADX INFO: renamed from: t0.e0$a$a, reason: collision with other inner class name */
        public static final class C0424a {
            private C0424a() {
            }

            public /* synthetic */ C0424a(ae.j jVar) {
                this();
            }

            public final Object a() {
                return a.f20666j;
            }
        }

        @Override // t0.f0.a
        public T a() {
            return (T) this.f20670f;
        }

        @Override // t0.f0.a
        public z.w<d1.g0> b() {
            return this.f20669e;
        }

        @Override // d1.i0
        public void c(d1.i0 i0Var) {
            ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) i0Var;
            m(aVar.b());
            this.f20670f = aVar.f20670f;
            this.f20671g = aVar.f20671g;
        }

        @Override // d1.i0
        public d1.i0 d() {
            return new a();
        }

        public final Object j() {
            return this.f20670f;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean k(t0.f0<?> r6, d1.k r7) {
            /*
                r5 = this;
                java.lang.Object r0 = d1.p.I()
                monitor-enter(r0)
                int r1 = r5.f20667c     // Catch: java.lang.Throwable -> L4a
                int r2 = r7.f()     // Catch: java.lang.Throwable -> L4a
                r3 = 0
                r4 = 1
                if (r1 != r2) goto L1a
                int r1 = r5.f20668d     // Catch: java.lang.Throwable -> L4a
                int r2 = r7.j()     // Catch: java.lang.Throwable -> L4a
                if (r1 == r2) goto L18
                goto L1a
            L18:
                r1 = r3
                goto L1b
            L1a:
                r1 = r4
            L1b:
                monitor-exit(r0)
                java.lang.Object r0 = r5.f20670f
                java.lang.Object r2 = t0.e0.a.f20666j
                if (r0 == r2) goto L2d
                if (r1 == 0) goto L2c
                int r0 = r5.f20671g
                int r6 = r5.l(r6, r7)
                if (r0 != r6) goto L2d
            L2c:
                r3 = r4
            L2d:
                if (r3 == 0) goto L49
                if (r1 == 0) goto L49
                java.lang.Object r6 = d1.p.I()
                monitor-enter(r6)
                int r0 = r7.f()     // Catch: java.lang.Throwable -> L46
                r5.f20667c = r0     // Catch: java.lang.Throwable -> L46
                int r7 = r7.j()     // Catch: java.lang.Throwable -> L46
                r5.f20668d = r7     // Catch: java.lang.Throwable -> L46
                md.i0 r7 = md.i0.f15558a     // Catch: java.lang.Throwable -> L46
                monitor-exit(r6)
                goto L49
            L46:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            L49:
                return r3
            L4a:
                r6 = move-exception
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.e0.a.k(t0.f0, d1.k):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00aa A[Catch: all -> 0x00c7, LOOP:1: B:16:0x003c->B:41:0x00aa, LOOP_END, TryCatch #1 {all -> 0x00c7, blocks: (B:13:0x002f, B:16:0x003c, B:18:0x004c, B:20:0x0058, B:25:0x0069, B:35:0x009d, B:28:0x0078, B:30:0x007c, B:32:0x008b, B:31:0x0083, B:43:0x00af, B:41:0x00aa), top: B:66:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00a6 A[EDGE_INSN: B:70:0x00a6->B:39:0x00a6 BREAK  A[LOOP:1: B:16:0x003c->B:41:0x00aa], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int l(t0.f0<?> r22, d1.k r23) {
            /*
                Method dump skipped, instruction units count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.e0.a.l(t0.f0, d1.k):int");
        }

        public void m(z.w<d1.g0> wVar) {
            this.f20669e = wVar;
        }

        public final void n(Object obj) {
            this.f20670f = obj;
        }

        public final void o(int i10) {
            this.f20671g = i10;
        }

        public final void p(int i10) {
            this.f20667c = i10;
        }

        public final void q(int i10) {
            this.f20668d = i10;
        }
    }

    static final class b extends ae.s implements zd.l<Object, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0<T> f20672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1.d f20673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z.t<d1.g0> f20674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f20675d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e0<T> e0Var, b1.d dVar, z.t<d1.g0> tVar, int i10) {
            super(1);
            this.f20672a = e0Var;
            this.f20673b = dVar;
            this.f20674c = tVar;
            this.f20675d = i10;
        }

        public final void a(Object obj) {
            if (obj == this.f20672a) {
                throw new IllegalStateException("A derived state calculation cannot read itself".toString());
            }
            if (obj instanceof d1.g0) {
                int iA = this.f20673b.a();
                z.t<d1.g0> tVar = this.f20674c;
                tVar.q(obj, Math.min(iA - this.f20675d, tVar.d(obj, a.e.API_PRIORITY_OTHER)));
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Object obj) {
            a(obj);
            return md.i0.f15558a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(zd.a<? extends T> aVar, e3<T> e3Var) {
        this.f20661b = aVar;
        this.f20662c = e3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a9 A[Catch: all -> 0x01e8, TRY_LEAVE, TryCatch #1 {, blocks: (B:72:0x0166, B:74:0x0178, B:76:0x017e, B:81:0x0190, B:82:0x01a9), top: B:106:0x0166 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final t0.e0.a<T> A(t0.e0.a<T> r22, d1.k r23, boolean r24, zd.a<? extends T> r25) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.e0.A(t0.e0$a, d1.k, boolean, zd.a):t0.e0$a");
    }

    private final String B() {
        a aVar = (a) d1.p.F(this.f20663d);
        return aVar.k(this, d1.k.f9368e.d()) ? String.valueOf(aVar.j()) : "<Not calculated>";
    }

    @Override // t0.f0
    public e3<T> d() {
        return this.f20662c;
    }

    @Override // d1.g0
    public d1.i0 f() {
        return this.f20663d;
    }

    @Override // t0.p3
    public T getValue() {
        k.a aVar = d1.k.f9368e;
        zd.l<Object, md.i0> lVarH = aVar.d().h();
        if (lVarH != null) {
            lVarH.invoke(this);
        }
        return (T) A((a) d1.p.F(this.f20663d), aVar.d(), true, this.f20661b).j();
    }

    @Override // d1.g0
    public void n(d1.i0 i0Var) {
        ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f20663d = (a) i0Var;
    }

    public String toString() {
        return "DerivedState(value=" + B() + ")@" + hashCode();
    }

    @Override // t0.f0
    public f0.a<T> w() {
        return A((a) d1.p.F(this.f20663d), d1.k.f9368e.d(), false, this.f20661b);
    }

    public final d1.i0 z(d1.k kVar) {
        return A((a) d1.p.G(this.f20663d, kVar), kVar, false, this.f20661b);
    }
}
