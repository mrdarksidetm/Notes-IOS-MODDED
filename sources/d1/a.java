package d1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d1.c {

    /* JADX INFO: renamed from: d1.a$a, reason: collision with other inner class name */
    static final class C0223a extends ae.s implements zd.l<Object, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<zd.l<Object, md.i0>> f9317a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0223a(List<? extends zd.l<Object, md.i0>> list) {
            super(1);
            this.f9317a = list;
        }

        public final void a(Object obj) {
            List<zd.l<Object, md.i0>> list = this.f9317a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).invoke(obj);
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Object obj) {
            a(obj);
            return md.i0.f15558a;
        }
    }

    static final class b extends ae.s implements zd.l<n, d1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<Object, md.i0> f9318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<Object, md.i0> f9319b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2) {
            super(1);
            this.f9318a = lVar;
            this.f9319b = lVar2;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d1.c invoke(n nVar) {
            int i10;
            synchronized (p.I()) {
                i10 = p.f9406e;
                p.f9406e = i10 + 1;
            }
            return new d1.c(i10, nVar, this.f9318a, this.f9319b);
        }
    }

    static final class c extends ae.s implements zd.l<n, h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<Object, md.i0> f9320a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(zd.l<Object, md.i0> lVar) {
            super(1);
            this.f9320a = lVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke(n nVar) {
            int i10;
            synchronized (p.I()) {
                i10 = p.f9406e;
                p.f9406e = i10 + 1;
            }
            return new h(i10, nVar, this.f9320a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i10, n nVar) {
        zd.l c0223a;
        synchronized (p.I()) {
            List list = p.f9410i;
            c0223a = (zd.l) nd.c0.s0(list);
            c0223a = c0223a == null ? new C0223a(list) : c0223a;
        }
        super(i10, nVar, null, c0223a);
    }

    @Override // d1.c
    public l C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // d1.c
    public d1.c P(zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2) {
        return (d1.c) p.b0(new b(lVar, lVar2));
    }

    @Override // d1.c, d1.k
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public Void m(k kVar) {
        y.b();
        throw new md.i();
    }

    @Override // d1.c, d1.k
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void n(k kVar) {
        y.b();
        throw new md.i();
    }

    @Override // d1.c, d1.k
    public void d() {
        synchronized (p.I()) {
            q();
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    @Override // d1.c, d1.k
    public void o() {
        p.B();
    }

    @Override // d1.c, d1.k
    public k x(zd.l<Object, md.i0> lVar) {
        return p.b0(new c(lVar));
    }
}
