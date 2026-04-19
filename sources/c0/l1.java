package c0;

import k1.f;
import k1.h;
import k1.l;
import w2.h;
import w2.j;
import w2.n;
import w2.p;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j1<Float, c0.m> f6126a = a(e.f6139a, f.f6140a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j1<Integer, c0.m> f6127b = a(k.f6145a, l.f6146a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j1<w2.h, c0.m> f6128c = a(c.f6137a, d.f6138a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j1<w2.j, c0.n> f6129d = a(a.f6135a, b.f6136a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j1<k1.l, c0.n> f6130e = a(q.f6151a, r.f6152a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j1<k1.f, c0.n> f6131f = a(m.f6147a, n.f6148a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j1<w2.n, c0.n> f6132g = a(g.f6141a, h.f6142a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j1<w2.p, c0.n> f6133h = a(i.f6143a, j.f6144a);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final j1<k1.h, c0.p> f6134i = a(o.f6149a, p.f6150a);

    static final class a extends ae.s implements zd.l<w2.j, c0.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6135a = new a();

        a() {
            super(1);
        }

        public final c0.n a(long j10) {
            return new c0.n(w2.j.e(j10), w2.j.f(j10));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ c0.n invoke(w2.j jVar) {
            return a(jVar.i());
        }
    }

    static final class b extends ae.s implements zd.l<c0.n, w2.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6136a = new b();

        b() {
            super(1);
        }

        public final long a(c0.n nVar) {
            return w2.i.a(w2.h.m(nVar.f()), w2.h.m(nVar.g()));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ w2.j invoke(c0.n nVar) {
            return w2.j.b(a(nVar));
        }
    }

    static final class c extends ae.s implements zd.l<w2.h, c0.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f6137a = new c();

        c() {
            super(1);
        }

        public final c0.m a(float f10) {
            return new c0.m(f10);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ c0.m invoke(w2.h hVar) {
            return a(hVar.r());
        }
    }

    static final class d extends ae.s implements zd.l<c0.m, w2.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f6138a = new d();

        d() {
            super(1);
        }

        public final float a(c0.m mVar) {
            return w2.h.m(mVar.f());
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ w2.h invoke(c0.m mVar) {
            return w2.h.i(a(mVar));
        }
    }

    static final class e extends ae.s implements zd.l<Float, c0.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f6139a = new e();

        e() {
            super(1);
        }

        public final c0.m a(float f10) {
            return new c0.m(f10);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ c0.m invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    static final class f extends ae.s implements zd.l<c0.m, Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f6140a = new f();

        f() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(c0.m mVar) {
            return Float.valueOf(mVar.f());
        }
    }

    static final class g extends ae.s implements zd.l<w2.n, c0.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f6141a = new g();

        g() {
            super(1);
        }

        public final c0.n a(long j10) {
            return new c0.n(w2.n.j(j10), w2.n.k(j10));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ c0.n invoke(w2.n nVar) {
            return a(nVar.n());
        }
    }

    static final class h extends ae.s implements zd.l<c0.n, w2.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f6142a = new h();

        h() {
            super(1);
        }

        public final long a(c0.n nVar) {
            return w2.o.a(ce.c.d(nVar.f()), ce.c.d(nVar.g()));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ w2.n invoke(c0.n nVar) {
            return w2.n.b(a(nVar));
        }
    }

    static final class i extends ae.s implements zd.l<w2.p, c0.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f6143a = new i();

        i() {
            super(1);
        }

        public final c0.n a(long j10) {
            return new c0.n(w2.p.g(j10), w2.p.f(j10));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ c0.n invoke(w2.p pVar) {
            return a(pVar.j());
        }
    }

    static final class j extends ae.s implements zd.l<c0.n, w2.p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f6144a = new j();

        j() {
            super(1);
        }

        public final long a(c0.n nVar) {
            return w2.q.a(ce.c.d(nVar.f()), ce.c.d(nVar.g()));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ w2.p invoke(c0.n nVar) {
            return w2.p.b(a(nVar));
        }
    }

    static final class k extends ae.s implements zd.l<Integer, c0.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f6145a = new k();

        k() {
            super(1);
        }

        public final c0.m a(int i10) {
            return new c0.m(i10);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ c0.m invoke(Integer num) {
            return a(num.intValue());
        }
    }

    static final class l extends ae.s implements zd.l<c0.m, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f6146a = new l();

        l() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(c0.m mVar) {
            return Integer.valueOf((int) mVar.f());
        }
    }

    static final class m extends ae.s implements zd.l<k1.f, c0.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f6147a = new m();

        m() {
            super(1);
        }

        public final c0.n a(long j10) {
            return new c0.n(k1.f.o(j10), k1.f.p(j10));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ c0.n invoke(k1.f fVar) {
            return a(fVar.x());
        }
    }

    static final class n extends ae.s implements zd.l<c0.n, k1.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f6148a = new n();

        n() {
            super(1);
        }

        public final long a(c0.n nVar) {
            return k1.g.a(nVar.f(), nVar.g());
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ k1.f invoke(c0.n nVar) {
            return k1.f.d(a(nVar));
        }
    }

    static final class o extends ae.s implements zd.l<k1.h, c0.p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f6149a = new o();

        o() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c0.p invoke(k1.h hVar) {
            return new c0.p(hVar.f(), hVar.i(), hVar.g(), hVar.c());
        }
    }

    static final class p extends ae.s implements zd.l<c0.p, k1.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f6150a = new p();

        p() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k1.h invoke(c0.p pVar) {
            return new k1.h(pVar.f(), pVar.g(), pVar.h(), pVar.i());
        }
    }

    static final class q extends ae.s implements zd.l<k1.l, c0.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f6151a = new q();

        q() {
            super(1);
        }

        public final c0.n a(long j10) {
            return new c0.n(k1.l.i(j10), k1.l.g(j10));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ c0.n invoke(k1.l lVar) {
            return a(lVar.m());
        }
    }

    static final class r extends ae.s implements zd.l<c0.n, k1.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f6152a = new r();

        r() {
            super(1);
        }

        public final long a(c0.n nVar) {
            return k1.m.a(nVar.f(), nVar.g());
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ k1.l invoke(c0.n nVar) {
            return k1.l.c(a(nVar));
        }
    }

    public static final <T, V extends c0.q> j1<T, V> a(zd.l<? super T, ? extends V> lVar, zd.l<? super V, ? extends T> lVar2) {
        return new k1(lVar, lVar2);
    }

    public static final j1<Float, c0.m> b(ae.l lVar) {
        return f6126a;
    }

    public static final j1<Integer, c0.m> c(ae.q qVar) {
        return f6127b;
    }

    public static final j1<k1.f, c0.n> d(f.a aVar) {
        return f6131f;
    }

    public static final j1<k1.h, c0.p> e(h.a aVar) {
        return f6134i;
    }

    public static final j1<k1.l, c0.n> f(l.a aVar) {
        return f6130e;
    }

    public static final j1<w2.h, c0.m> g(h.a aVar) {
        return f6128c;
    }

    public static final j1<w2.j, c0.n> h(j.a aVar) {
        return f6129d;
    }

    public static final j1<w2.n, c0.n> i(n.a aVar) {
        return f6132g;
    }

    public static final j1<w2.p, c0.n> j(p.a aVar) {
        return f6133h;
    }

    public static final float k(float f10, float f11, float f12) {
        return (f10 * (1 - f12)) + (f11 * f12);
    }
}
