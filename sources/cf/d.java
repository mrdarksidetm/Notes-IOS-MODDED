package cf;

import ye.j;
import ye.k;

/* JADX INFO: loaded from: classes2.dex */
abstract class d extends af.s0 implements bf.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bf.a f6929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.l<bf.h, md.i0> f6930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final bf.f f6931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f6932e;

    static final class a extends ae.s implements zd.l<bf.h, md.i0> {
        a() {
            super(1);
        }

        public final void a(bf.h hVar) {
            ae.r.f(hVar, "node");
            d dVar = d.this;
            dVar.u0(d.d0(dVar), hVar);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(bf.h hVar) {
            a(hVar);
            return md.i0.f15558a;
        }
    }

    public static final class b extends ze.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ye.f f6936c;

        b(String str, ye.f fVar) {
            this.f6935b = str;
            this.f6936c = fVar;
        }

        @Override // ze.b, ze.f
        public void F(String str) {
            ae.r.f(str, "value");
            d.this.u0(this.f6935b, new bf.o(str, false, this.f6936c));
        }

        @Override // ze.f
        public df.c a() {
            return d.this.b().a();
        }
    }

    public static final class c extends ze.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final df.c f6937a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6939c;

        c(String str) {
            this.f6939c = str;
            this.f6937a = d.this.b().a();
        }

        @Override // ze.b, ze.f
        public void A(int i10) {
            J(Long.toString(((long) md.a0.b(i10)) & 4294967295L, 10));
        }

        @Override // ze.b, ze.f
        public void C(long j10) {
            J(g.a(md.c0.b(j10), 10));
        }

        public final void J(String str) {
            ae.r.f(str, "s");
            d.this.u0(this.f6939c, new bf.o(str, false, null, 4, null));
        }

        @Override // ze.f
        public df.c a() {
            return this.f6937a;
        }

        @Override // ze.b, ze.f
        public void i(short s10) {
            J(md.f0.j(md.f0.b(s10)));
        }

        @Override // ze.b, ze.f
        public void l(byte b10) {
            J(md.y.j(md.y.b(b10)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(bf.a aVar, zd.l<? super bf.h, md.i0> lVar) {
        this.f6929b = aVar;
        this.f6930c = lVar;
        this.f6931d = aVar.f();
    }

    public /* synthetic */ d(bf.a aVar, zd.l lVar, ae.j jVar) {
        this(aVar, lVar);
    }

    public static final /* synthetic */ String d0(d dVar) {
        return dVar.U();
    }

    private final b s0(String str, ye.f fVar) {
        return new b(str, fVar);
    }

    private final c t0(String str) {
        return new c(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // af.p1, ze.f
    public <T> void D(we.h<? super T> hVar, T t10) {
        ae.r.f(hVar, "serializer");
        if (V() == null && b1.b(d1.a(hVar.getDescriptor(), a()))) {
            new i0(this.f6929b, this.f6930c).D(hVar, t10);
            return;
        }
        if (!(hVar instanceof af.b) || b().f().l()) {
            hVar.serialize(this, t10);
            return;
        }
        af.b bVar = (af.b) hVar;
        String strC = t0.c(hVar.getDescriptor(), b());
        ae.r.d(t10, "null cannot be cast to non-null type kotlin.Any");
        we.h hVarB = we.d.b(bVar, this, t10);
        t0.f(bVar, hVarB, strC);
        t0.b(hVarB.getDescriptor().e());
        this.f6932e = strC;
        hVarB.serialize(this, t10);
    }

    @Override // af.p1
    protected void T(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        this.f6930c.invoke(q0());
    }

    @Override // af.s0
    protected String Z(String str, String str2) {
        ae.r.f(str, "parentName");
        ae.r.f(str2, "childName");
        return str2;
    }

    @Override // ze.f
    public final df.c a() {
        return this.f6929b.a();
    }

    @Override // af.s0
    protected String a0(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return f0.f(fVar, this.f6929b, i10);
    }

    @Override // bf.l
    public final bf.a b() {
        return this.f6929b;
    }

    @Override // ze.f
    public ze.d c(ye.f fVar) {
        d m0Var;
        ae.r.f(fVar, "descriptor");
        zd.l aVar = V() == null ? this.f6930c : new a();
        ye.j jVarE = fVar.e();
        if (ae.r.b(jVarE, k.b.f24012a) ? true : jVarE instanceof ye.d) {
            m0Var = new o0(this.f6929b, aVar);
        } else if (ae.r.b(jVarE, k.c.f24013a)) {
            bf.a aVar2 = this.f6929b;
            ye.f fVarA = d1.a(fVar.i(0), aVar2.a());
            ye.j jVarE2 = fVarA.e();
            if ((jVarE2 instanceof ye.e) || ae.r.b(jVarE2, j.b.f24010a)) {
                m0Var = new q0(this.f6929b, aVar);
            } else {
                if (!aVar2.f().b()) {
                    throw e0.d(fVarA);
                }
                m0Var = new o0(this.f6929b, aVar);
            }
        } else {
            m0Var = new m0(this.f6929b, aVar);
        }
        String str = this.f6932e;
        if (str != null) {
            ae.r.c(str);
            m0Var.u0(str, bf.i.c(fVar.a()));
            this.f6932e = null;
        }
        return m0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p1
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void I(String str, boolean z10) {
        ae.r.f(str, "tag");
        u0(str, bf.i.a(Boolean.valueOf(z10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p1
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void J(String str, byte b10) {
        ae.r.f(str, "tag");
        u0(str, bf.i.b(Byte.valueOf(b10)));
    }

    @Override // ze.f
    public void g() {
        String strV = V();
        if (strV == null) {
            this.f6930c.invoke(bf.s.INSTANCE);
        } else {
            n0(strV);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p1
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void K(String str, char c10) {
        ae.r.f(str, "tag");
        u0(str, bf.i.c(String.valueOf(c10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p1
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void L(String str, double d10) {
        ae.r.f(str, "tag");
        u0(str, bf.i.b(Double.valueOf(d10)));
        if (this.f6931d.a()) {
            return;
        }
        if (!((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true)) {
            throw e0.c(Double.valueOf(d10), str, q0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p1
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void M(String str, ye.f fVar, int i10) {
        ae.r.f(str, "tag");
        ae.r.f(fVar, "enumDescriptor");
        u0(str, bf.i.c(fVar.g(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p1
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void N(String str, float f10) {
        ae.r.f(str, "tag");
        u0(str, bf.i.b(Float.valueOf(f10)));
        if (this.f6931d.a()) {
            return;
        }
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            throw e0.c(Float.valueOf(f10), str, q0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p1
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public ze.f O(String str, ye.f fVar) {
        ae.r.f(str, "tag");
        ae.r.f(fVar, "inlineDescriptor");
        return x0.b(fVar) ? t0(str) : x0.a(fVar) ? s0(str, fVar) : super.O(str, fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p1
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void P(String str, int i10) {
        ae.r.f(str, "tag");
        u0(str, bf.i.b(Integer.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p1
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void Q(String str, long j10) {
        ae.r.f(str, "tag");
        u0(str, bf.i.b(Long.valueOf(j10)));
    }

    protected void n0(String str) {
        ae.r.f(str, "tag");
        u0(str, bf.s.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p1
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void R(String str, short s10) {
        ae.r.f(str, "tag");
        u0(str, bf.i.b(Short.valueOf(s10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p1
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void S(String str, String str2) {
        ae.r.f(str, "tag");
        ae.r.f(str2, "value");
        u0(str, bf.i.c(str2));
    }

    public abstract bf.h q0();

    @Override // ze.d
    public boolean r(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return this.f6931d.e();
    }

    protected final zd.l<bf.h, md.i0> r0() {
        return this.f6930c;
    }

    @Override // ze.f
    public void u() {
    }

    public abstract void u0(String str, bf.h hVar);

    @Override // af.p1, ze.f
    public ze.f z(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        return V() != null ? super.z(fVar) : new i0(this.f6929b, this.f6930c).z(fVar);
    }
}
