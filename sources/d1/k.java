package d1;

import d1.k;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9368e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f9369f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f9370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9373d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(zd.p pVar) {
            synchronized (p.I()) {
                p.f9409h = nd.c0.m0(p.f9409h, pVar);
                md.i0 i0Var = md.i0.f15558a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(zd.l lVar) {
            synchronized (p.I()) {
                p.f9410i = nd.c0.m0(p.f9410i, lVar);
                md.i0 i0Var = md.i0.f15558a;
            }
            p.B();
        }

        public final k c() {
            return p.E((k) p.f9403b.a(), null, false, 6, null);
        }

        public final k d() {
            return p.H();
        }

        public final void e() {
            p.H().o();
        }

        public final <T> T f(zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2, zd.a<? extends T> aVar) {
            k k0Var;
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            k kVar = (k) p.f9403b.a();
            if (kVar == null || (kVar instanceof c)) {
                k0Var = new k0(kVar instanceof c ? (c) kVar : null, lVar, lVar2, true, false);
            } else {
                if (lVar == null) {
                    return aVar.invoke();
                }
                k0Var = kVar.x(lVar);
            }
            try {
                k kVarL = k0Var.l();
                try {
                    return aVar.invoke();
                } finally {
                    k0Var.s(kVarL);
                }
            } finally {
                k0Var.d();
            }
        }

        public final f g(final zd.p<? super Set<? extends Object>, ? super k, md.i0> pVar) {
            p.A(p.f9402a);
            synchronized (p.I()) {
                p.f9409h = nd.c0.o0(p.f9409h, pVar);
                md.i0 i0Var = md.i0.f15558a;
            }
            return new f() { // from class: d1.i
                @Override // d1.f
                public final void dispose() {
                    k.a.h(pVar);
                }
            };
        }

        public final f i(final zd.l<Object, md.i0> lVar) {
            synchronized (p.I()) {
                p.f9410i = nd.c0.o0(p.f9410i, lVar);
                md.i0 i0Var = md.i0.f15558a;
            }
            p.B();
            return new f() { // from class: d1.j
                @Override // d1.f
                public final void dispose() {
                    k.a.j(lVar);
                }
            };
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void k() {
            /*
                r4 = this;
                java.lang.Object r0 = d1.p.I()
                monitor-enter(r0)
                java.util.concurrent.atomic.AtomicReference r1 = d1.p.f()     // Catch: java.lang.Throwable -> L26
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L26
                d1.a r1 = (d1.a) r1     // Catch: java.lang.Throwable -> L26
                v0.b r1 = r1.E()     // Catch: java.lang.Throwable -> L26
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1e
                boolean r1 = r1.o()     // Catch: java.lang.Throwable -> L26
                if (r1 != r2) goto L1e
                goto L1f
            L1e:
                r2 = r3
            L1f:
                monitor-exit(r0)
                if (r2 == 0) goto L25
                d1.p.b()
            L25:
                return
            L26:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.k.a.k():void");
        }

        public final c l(zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2) {
            c cVarP;
            k kVarH = p.H();
            c cVar = kVarH instanceof c ? (c) kVarH : null;
            if (cVar == null || (cVarP = cVar.P(lVar, lVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            return cVarP;
        }

        public final k m(zd.l<Object, md.i0> lVar) {
            return p.H().x(lVar);
        }
    }

    private k(int i10, n nVar) {
        this.f9370a = nVar;
        this.f9371b = i10;
        this.f9373d = i10 != 0 ? p.c0(i10, g()) : -1;
    }

    public /* synthetic */ k(int i10, n nVar, ae.j jVar) {
        this(i10, nVar);
    }

    public final void b() {
        synchronized (p.I()) {
            c();
            r();
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public void c() {
        p.f9405d = p.f9405d.r(f());
    }

    public void d() {
        this.f9372c = true;
        synchronized (p.I()) {
            q();
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final boolean e() {
        return this.f9372c;
    }

    public int f() {
        return this.f9371b;
    }

    public n g() {
        return this.f9370a;
    }

    public abstract zd.l<Object, md.i0> h();

    public abstract boolean i();

    public int j() {
        return 0;
    }

    public abstract zd.l<Object, md.i0> k();

    public k l() {
        k kVar = (k) p.f9403b.a();
        p.f9403b.b(this);
        return kVar;
    }

    public abstract void m(k kVar);

    public abstract void n(k kVar);

    public abstract void o();

    public abstract void p(g0 g0Var);

    public final void q() {
        int i10 = this.f9373d;
        if (i10 >= 0) {
            p.Y(i10);
            this.f9373d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(k kVar) {
        p.f9403b.b(kVar);
    }

    public final void t(boolean z10) {
        this.f9372c = z10;
    }

    public void u(int i10) {
        this.f9371b = i10;
    }

    public void v(n nVar) {
        this.f9370a = nVar;
    }

    public void w(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public abstract k x(zd.l<Object, md.i0> lVar);

    public final int y() {
        int i10 = this.f9373d;
        this.f9373d = -1;
        return i10;
    }

    public final void z() {
        if (!(!this.f9372c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }
}
