package cf;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends ze.b implements bf.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f7008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bf.a f7009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c1 f7010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bf.l[] f7011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final df.c f7012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bf.f f7013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f7015h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7016a;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c1.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7016a = iArr;
        }
    }

    public w0(m mVar, bf.a aVar, c1 c1Var, bf.l[] lVarArr) {
        ae.r.f(mVar, "composer");
        ae.r.f(aVar, "json");
        ae.r.f(c1Var, "mode");
        this.f7008a = mVar;
        this.f7009b = aVar;
        this.f7010c = c1Var;
        this.f7011d = lVarArr;
        this.f7012e = b().a();
        this.f7013f = b().f();
        int iOrdinal = c1Var.ordinal();
        if (lVarArr != null) {
            bf.l lVar = lVarArr[iOrdinal];
            if (lVar == null && lVar == this) {
                return;
            }
            lVarArr[iOrdinal] = this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(s0 s0Var, bf.a aVar, c1 c1Var, bf.l[] lVarArr) {
        this(w.a(s0Var, aVar), aVar, c1Var, lVarArr);
        ae.r.f(s0Var, "output");
        ae.r.f(aVar, "json");
        ae.r.f(c1Var, "mode");
        ae.r.f(lVarArr, "modeReuseCache");
    }

    private final void J(ye.f fVar) {
        this.f7008a.c();
        String str = this.f7015h;
        ae.r.c(str);
        F(str);
        this.f7008a.e(':');
        this.f7008a.o();
        F(fVar.a());
    }

    @Override // ze.b, ze.f
    public void A(int i10) {
        if (this.f7014g) {
            F(String.valueOf(i10));
        } else {
            this.f7008a.h(i10);
        }
    }

    @Override // ze.b, ze.f
    public void C(long j10) {
        if (this.f7014g) {
            F(String.valueOf(j10));
        } else {
            this.f7008a.i(j10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ze.b, ze.f
    public <T> void D(we.h<? super T> hVar, T t10) {
        ae.r.f(hVar, "serializer");
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
        this.f7015h = strC;
        hVarB.serialize(this, t10);
    }

    @Override // ze.b, ze.f
    public void F(String str) {
        ae.r.f(str, "value");
        this.f7008a.m(str);
    }

    @Override // ze.b
    public boolean G(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        int i11 = a.f7016a[this.f7010c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f7008a.a()) {
                        this.f7008a.e(',');
                    }
                    this.f7008a.c();
                    F(f0.f(fVar, b(), i10));
                    this.f7008a.e(':');
                    this.f7008a.o();
                } else {
                    if (i10 == 0) {
                        this.f7014g = true;
                    }
                    if (i10 == 1) {
                        this.f7008a.e(',');
                    }
                }
                return true;
            }
            if (this.f7008a.a()) {
                this.f7014g = true;
            } else {
                int i12 = i10 % 2;
                m mVar = this.f7008a;
                if (i12 == 0) {
                    mVar.e(',');
                    this.f7008a.c();
                    z10 = true;
                    this.f7014g = z10;
                    return true;
                }
                mVar.e(':');
            }
            this.f7008a.o();
            this.f7014g = z10;
            return true;
        }
        if (!this.f7008a.a()) {
            this.f7008a.e(',');
        }
        this.f7008a.c();
        return true;
    }

    @Override // ze.f
    public df.c a() {
        return this.f7012e;
    }

    @Override // bf.l
    public bf.a b() {
        return this.f7009b;
    }

    @Override // ze.b, ze.f
    public ze.d c(ye.f fVar) {
        bf.l lVar;
        ae.r.f(fVar, "descriptor");
        c1 c1VarB = d1.b(b(), fVar);
        char c10 = c1VarB.f6927a;
        if (c10 != 0) {
            this.f7008a.e(c10);
            this.f7008a.b();
        }
        if (this.f7015h != null) {
            J(fVar);
            this.f7015h = null;
        }
        if (this.f7010c == c1VarB) {
            return this;
        }
        bf.l[] lVarArr = this.f7011d;
        return (lVarArr == null || (lVar = lVarArr[c1VarB.ordinal()]) == null) ? new w0(this.f7008a, b(), c1VarB, this.f7011d) : lVar;
    }

    @Override // ze.b, ze.d
    public void d(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        if (this.f7010c.f6928b != 0) {
            this.f7008a.p();
            this.f7008a.c();
            this.f7008a.e(this.f7010c.f6928b);
        }
    }

    @Override // ze.b, ze.f
    public void f(ye.f fVar, int i10) {
        ae.r.f(fVar, "enumDescriptor");
        F(fVar.g(i10));
    }

    @Override // ze.b, ze.f
    public void g() {
        this.f7008a.j("null");
    }

    @Override // ze.b, ze.f
    public void h(double d10) {
        if (this.f7014g) {
            F(String.valueOf(d10));
        } else {
            this.f7008a.f(d10);
        }
        if (this.f7013f.a()) {
            return;
        }
        if (!((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true)) {
            throw e0.b(Double.valueOf(d10), this.f7008a.f6966a.toString());
        }
    }

    @Override // ze.b, ze.f
    public void i(short s10) {
        if (this.f7014g) {
            F(String.valueOf((int) s10));
        } else {
            this.f7008a.k(s10);
        }
    }

    @Override // ze.b, ze.d
    public <T> void k(ye.f fVar, int i10, we.h<? super T> hVar, T t10) {
        ae.r.f(fVar, "descriptor");
        ae.r.f(hVar, "serializer");
        if (t10 != null || this.f7013f.f()) {
            super.k(fVar, i10, hVar, t10);
        }
    }

    @Override // ze.b, ze.f
    public void l(byte b10) {
        if (this.f7014g) {
            F(String.valueOf((int) b10));
        } else {
            this.f7008a.d(b10);
        }
    }

    @Override // ze.b, ze.f
    public void n(boolean z10) {
        if (this.f7014g) {
            F(String.valueOf(z10));
        } else {
            this.f7008a.l(z10);
        }
    }

    @Override // ze.b, ze.f
    public void q(float f10) {
        if (this.f7014g) {
            F(String.valueOf(f10));
        } else {
            this.f7008a.g(f10);
        }
        if (this.f7013f.a()) {
            return;
        }
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            throw e0.b(Float.valueOf(f10), this.f7008a.f6966a.toString());
        }
    }

    @Override // ze.b, ze.d
    public boolean r(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return this.f7013f.e();
    }

    @Override // ze.b, ze.f
    public void t(char c10) {
        F(String.valueOf(c10));
    }

    @Override // ze.b, ze.f
    public ze.f z(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        if (x0.b(fVar)) {
            m uVar = this.f7008a;
            if (!(uVar instanceof u)) {
                uVar = new u(uVar.f6966a, this.f7014g);
            }
            return new w0(uVar, b(), this.f7010c, (bf.l[]) null);
        }
        if (!x0.a(fVar)) {
            return super.z(fVar);
        }
        m nVar = this.f7008a;
        if (!(nVar instanceof n)) {
            nVar = new n(nVar.f6966a, this.f7014g);
        }
        return new w0(nVar, b(), this.f7010c, (bf.l[]) null);
    }
}
