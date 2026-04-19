package d0;

import l1.b1;
import l1.f1;
import l1.t1;
import l1.v0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a2.l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private f f9205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f9206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private l1.z f9207r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private t1 f9208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final i1.e f9209t;

    static final class a extends ae.s implements zd.l<n1.c, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b1.a f9210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l1.z f9211b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b1.a aVar, l1.z zVar) {
            super(1);
            this.f9210a = aVar;
            this.f9211b = zVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(n1.c cVar) {
            invoke2(cVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(n1.c cVar) {
            cVar.u1();
            n1.f.h0(cVar, this.f9210a.a(), this.f9211b, 0.0f, null, null, 0, 60, null);
        }
    }

    static final class b extends ae.s implements zd.l<n1.c, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.h f9212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ae.h0<v0> f9213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1.k0 f9215d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.h hVar, ae.h0<v0> h0Var, long j10, l1.k0 k0Var) {
            super(1);
            this.f9212a = hVar;
            this.f9213b = h0Var;
            this.f9214c = j10;
            this.f9215d = k0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(n1.c cVar) {
            invoke2(cVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(n1.c cVar) {
            cVar.u1();
            float f10 = this.f9212a.f();
            float fI = this.f9212a.i();
            ae.h0<v0> h0Var = this.f9213b;
            long j10 = this.f9214c;
            l1.k0 k0Var = this.f9215d;
            cVar.M0().a().c(f10, fI);
            n1.f.Y0(cVar, h0Var.f712a, 0L, j10, 0L, 0L, 0.0f, null, k0Var, 0, 0, 890, null);
            cVar.M0().a().c(-f10, -fI);
        }
    }

    static final class c extends ae.s implements zd.l<n1.c, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l1.z f9217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f9219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f9220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f9221f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f9222g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ n1.k f9223h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, l1.z zVar, long j10, float f10, float f11, long j11, long j12, n1.k kVar) {
            super(1);
            this.f9216a = z10;
            this.f9217b = zVar;
            this.f9218c = j10;
            this.f9219d = f10;
            this.f9220e = f11;
            this.f9221f = j11;
            this.f9222g = j12;
            this.f9223h = kVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(n1.c cVar) {
            invoke2(cVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(n1.c cVar) {
            cVar.u1();
            if (this.f9216a) {
                n1.f.l1(cVar, this.f9217b, 0L, 0L, this.f9218c, 0.0f, null, null, 0, 246, null);
                return;
            }
            float fD = k1.a.d(this.f9218c);
            float f10 = this.f9219d;
            if (fD >= f10) {
                n1.f.l1(cVar, this.f9217b, this.f9221f, this.f9222g, g.m(this.f9218c, f10), 0.0f, this.f9223h, null, 0, 208, null);
                return;
            }
            float f11 = this.f9220e;
            float fI = k1.l.i(cVar.c()) - this.f9220e;
            float fG = k1.l.g(cVar.c()) - this.f9220e;
            int iA = l1.i0.f14518a.a();
            l1.z zVar = this.f9217b;
            long j10 = this.f9218c;
            n1.d dVarM0 = cVar.M0();
            long jC = dVarM0.c();
            dVarM0.d().h();
            dVarM0.a().b(f11, f11, fI, fG, iA);
            n1.f.l1(cVar, zVar, 0L, 0L, j10, 0.0f, null, null, 0, 246, null);
            dVarM0.d().p();
            dVarM0.b(jC);
        }
    }

    static final class d extends ae.s implements zd.l<n1.c, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1 f9224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l1.z f9225b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f1 f1Var, l1.z zVar) {
            super(1);
            this.f9224a = f1Var;
            this.f9225b = zVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(n1.c cVar) {
            invoke2(cVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(n1.c cVar) {
            cVar.u1();
            n1.f.h0(cVar, this.f9224a, this.f9225b, 0.0f, null, null, 0, 60, null);
        }
    }

    static final class e extends ae.s implements zd.l<i1.f, i1.k> {
        e() {
            super(1);
        }

        @Override // zd.l
        public final i1.k invoke(i1.f fVar) {
            if (!(fVar.G0(h.this.l2()) >= 0.0f && k1.l.h(fVar.c()) > 0.0f)) {
                return g.k(fVar);
            }
            float f10 = 2;
            float fMin = Math.min(w2.h.o(h.this.l2(), w2.h.f22405b.a()) ? 1.0f : (float) Math.ceil(fVar.G0(h.this.l2())), (float) Math.ceil(k1.l.h(fVar.c()) / f10));
            float f11 = fMin / f10;
            long jA = k1.g.a(f11, f11);
            long jA2 = k1.m.a(k1.l.i(fVar.c()) - fMin, k1.l.g(fVar.c()) - fMin);
            boolean z10 = f10 * fMin > k1.l.h(fVar.c());
            b1 b1VarMo253createOutlinePq9zytI = h.this.k2().mo253createOutlinePq9zytI(fVar.c(), fVar.getLayoutDirection(), fVar);
            if (b1VarMo253createOutlinePq9zytI instanceof b1.a) {
                h hVar = h.this;
                return hVar.h2(fVar, hVar.j2(), (b1.a) b1VarMo253createOutlinePq9zytI, z10, fMin);
            }
            if (b1VarMo253createOutlinePq9zytI instanceof b1.c) {
                h hVar2 = h.this;
                return hVar2.i2(fVar, hVar2.j2(), (b1.c) b1VarMo253createOutlinePq9zytI, jA, jA2, z10, fMin);
            }
            if (b1VarMo253createOutlinePq9zytI instanceof b1.b) {
                return g.l(fVar, h.this.j2(), jA, jA2, z10, fMin);
            }
            throw new md.q();
        }
    }

    private h(float f10, l1.z zVar, t1 t1Var) {
        this.f9206q = f10;
        this.f9207r = zVar;
        this.f9208s = t1Var;
        this.f9209t = (i1.e) a2(androidx.compose.ui.draw.b.a(new e()));
    }

    public /* synthetic */ h(float f10, l1.z zVar, t1 t1Var, ae.j jVar) {
        this(f10, zVar, t1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, l1.v0] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i1.k h2(i1.f r46, l1.z r47, l1.b1.a r48, boolean r49, float r50) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.h.h2(i1.f, l1.z, l1.b1$a, boolean, float):i1.k");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i1.k i2(i1.f fVar, l1.z zVar, b1.c cVar, long j10, long j11, boolean z10, float f10) {
        if (k1.k.d(cVar.a())) {
            return fVar.f(new c(z10, zVar, cVar.a().h(), f10 / 2, f10, j10, j11, new n1.k(f10, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.f9205p == null) {
            this.f9205p = new f(null, null, null, null, 15, null);
        }
        f fVar2 = this.f9205p;
        ae.r.c(fVar2);
        return fVar.f(new d(g.j(fVar2.g(), cVar.a(), f10, z10), zVar));
    }

    public final void d1(t1 t1Var) {
        if (ae.r.b(this.f9208s, t1Var)) {
            return;
        }
        this.f9208s = t1Var;
        this.f9209t.M();
    }

    public final l1.z j2() {
        return this.f9207r;
    }

    public final t1 k2() {
        return this.f9208s;
    }

    public final float l2() {
        return this.f9206q;
    }

    public final void m2(l1.z zVar) {
        if (ae.r.b(this.f9207r, zVar)) {
            return;
        }
        this.f9207r = zVar;
        this.f9209t.M();
    }

    public final void n2(float f10) {
        if (w2.h.o(this.f9206q, f10)) {
            return;
        }
        this.f9206q = f10;
        this.f9209t.M();
    }
}
