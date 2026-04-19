package i2;

import java.util.ArrayList;
import java.util.List;
import l1.s1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f12371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f12374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f12375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f12376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<k1.h> f12377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<n> f12378h;

    static final class a extends ae.s implements zd.l<n, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f12379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float[] f12380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ae.f0 f12381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ae.e0 f12382d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, float[] fArr, ae.f0 f0Var, ae.e0 e0Var) {
            super(1);
            this.f12379a = j10;
            this.f12380b = fArr;
            this.f12381c = f0Var;
            this.f12382d = e0Var;
        }

        public final void a(n nVar) {
            long j10 = this.f12379a;
            float[] fArr = this.f12380b;
            ae.f0 f0Var = this.f12381c;
            ae.e0 e0Var = this.f12382d;
            long jB = f0.b(nVar.n(nVar.f() > e0.j(j10) ? nVar.f() : e0.j(j10)), nVar.n(nVar.b() < e0.i(j10) ? nVar.b() : e0.i(j10)));
            nVar.e().c(jB, fArr, f0Var.f703a);
            int iH = f0Var.f703a + (e0.h(jB) * 4);
            for (int i10 = f0Var.f703a; i10 < iH; i10 += 4) {
                int i11 = i10 + 1;
                float f10 = fArr[i11];
                float f11 = e0Var.f701a;
                fArr[i11] = f10 + f11;
                int i12 = i10 + 3;
                fArr[i12] = fArr[i12] + f11;
            }
            f0Var.f703a = iH;
            e0Var.f701a += nVar.e().getHeight();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(n nVar) {
            a(nVar);
            return md.i0.f15558a;
        }
    }

    private h(i iVar, long j10, int i10, boolean z10) {
        boolean z11;
        this.f12371a = iVar;
        this.f12372b = i10;
        int i11 = 0;
        if (!(w2.b.p(j10) == 0 && w2.b.o(j10) == 0)) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        ArrayList arrayList = new ArrayList();
        List<o> listF = iVar.f();
        int size = listF.size();
        float f10 = 0.0f;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            o oVar = listF.get(i12);
            m mVarC = r.c(oVar.b(), w2.c.b(0, w2.b.n(j10), 0, w2.b.i(j10) ? ge.o.d(w2.b.m(j10) - r.d(f10), i11) : w2.b.m(j10), 5, null), this.f12372b - i13, z10);
            float height = f10 + mVarC.getHeight();
            int iQ = i13 + mVarC.q();
            arrayList.add(new n(mVarC, oVar.c(), oVar.a(), i13, iQ, f10, height));
            if (mVarC.v() || (iQ == this.f12372b && i12 != nd.u.o(this.f12371a.f()))) {
                i13 = iQ;
                f10 = height;
                z11 = true;
                break;
            } else {
                i12++;
                i13 = iQ;
                f10 = height;
                i11 = 0;
            }
        }
        z11 = false;
        this.f12375e = f10;
        this.f12376f = i13;
        this.f12373c = z11;
        this.f12378h = arrayList;
        this.f12374d = w2.b.n(j10);
        List<k1.h> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            n nVar = (n) arrayList.get(i14);
            List<k1.h> listN = nVar.e().n();
            ArrayList arrayList3 = new ArrayList(listN.size());
            int size3 = listN.size();
            for (int i15 = 0; i15 < size3; i15++) {
                k1.h hVar = listN.get(i15);
                arrayList3.add(hVar != null ? nVar.i(hVar) : null);
            }
            nd.z.C(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.f12371a.g().size()) {
            int size4 = this.f12371a.g().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = nd.c0.n0(arrayList2, arrayList4);
        }
        this.f12377g = arrayList2;
    }

    public /* synthetic */ h(i iVar, long j10, int i10, boolean z10, ae.j jVar) {
        this(iVar, j10, i10, z10);
    }

    private final void C(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < b().j().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + b().length() + ')').toString());
    }

    private final void D(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= b().j().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + b().length() + ']').toString());
    }

    private final void E(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f12376f) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + this.f12376f + ')').toString());
    }

    private final d b() {
        return this.f12371a.e();
    }

    public final void A(l1.b0 b0Var, l1.z zVar, float f10, s1 s1Var, u2.j jVar, n1.g gVar, int i10) {
        r2.b.a(this, b0Var, zVar, f10, s1Var, jVar, gVar, i10);
    }

    public final float[] a(long j10, float[] fArr, int i10) {
        C(e0.j(j10));
        D(e0.i(j10));
        ae.f0 f0Var = new ae.f0();
        f0Var.f703a = i10;
        k.d(this.f12378h, j10, new a(j10, fArr, f0Var, new ae.e0()));
        return fArr;
    }

    public final u2.h c(int i10) {
        D(i10);
        n nVar = this.f12378h.get(i10 == b().length() ? nd.u.o(this.f12378h) : k.a(this.f12378h, i10));
        return nVar.e().j(nVar.n(i10));
    }

    public final k1.h d(int i10) {
        C(i10);
        n nVar = this.f12378h.get(k.a(this.f12378h, i10));
        return nVar.i(nVar.e().m(nVar.n(i10)));
    }

    public final k1.h e(int i10) {
        D(i10);
        n nVar = this.f12378h.get(i10 == b().length() ? nd.u.o(this.f12378h) : k.a(this.f12378h, i10));
        return nVar.i(nVar.e().g(nVar.n(i10)));
    }

    public final boolean f() {
        return this.f12373c;
    }

    public final float g() {
        if (this.f12378h.isEmpty()) {
            return 0.0f;
        }
        return this.f12378h.get(0).e().i();
    }

    public final float h() {
        return this.f12375e;
    }

    public final i i() {
        return this.f12371a;
    }

    public final float j() {
        if (this.f12378h.isEmpty()) {
            return 0.0f;
        }
        n nVar = (n) nd.c0.j0(this.f12378h);
        return nVar.l(nVar.e().f());
    }

    public final float k(int i10) {
        E(i10);
        n nVar = this.f12378h.get(k.b(this.f12378h, i10));
        return nVar.l(nVar.e().k(nVar.o(i10)));
    }

    public final int l() {
        return this.f12376f;
    }

    public final int m(int i10, boolean z10) {
        E(i10);
        n nVar = this.f12378h.get(k.b(this.f12378h, i10));
        return nVar.j(nVar.e().p(nVar.o(i10), z10));
    }

    public final int n(int i10) {
        n nVar = this.f12378h.get(i10 >= b().length() ? nd.u.o(this.f12378h) : i10 < 0 ? 0 : k.a(this.f12378h, i10));
        return nVar.k(nVar.e().h(nVar.n(i10)));
    }

    public final int o(float f10) {
        n nVar = this.f12378h.get(f10 <= 0.0f ? 0 : f10 >= this.f12375e ? nd.u.o(this.f12378h) : k.c(this.f12378h, f10));
        return nVar.d() == 0 ? nVar.g() : nVar.k(nVar.e().w(nVar.p(f10)));
    }

    public final float p(int i10) {
        E(i10);
        n nVar = this.f12378h.get(k.b(this.f12378h, i10));
        return nVar.e().x(nVar.o(i10));
    }

    public final float q(int i10) {
        E(i10);
        n nVar = this.f12378h.get(k.b(this.f12378h, i10));
        return nVar.e().r(nVar.o(i10));
    }

    public final int r(int i10) {
        E(i10);
        n nVar = this.f12378h.get(k.b(this.f12378h, i10));
        return nVar.j(nVar.e().o(nVar.o(i10)));
    }

    public final float s(int i10) {
        E(i10);
        n nVar = this.f12378h.get(k.b(this.f12378h, i10));
        return nVar.l(nVar.e().e(nVar.o(i10)));
    }

    public final int t(long j10) {
        n nVar = this.f12378h.get(k1.f.p(j10) <= 0.0f ? 0 : k1.f.p(j10) >= this.f12375e ? nd.u.o(this.f12378h) : k.c(this.f12378h, k1.f.p(j10)));
        return nVar.d() == 0 ? nVar.f() : nVar.j(nVar.e().l(nVar.m(j10)));
    }

    public final u2.h u(int i10) {
        D(i10);
        n nVar = this.f12378h.get(i10 == b().length() ? nd.u.o(this.f12378h) : k.a(this.f12378h, i10));
        return nVar.e().d(nVar.n(i10));
    }

    public final List<n> v() {
        return this.f12378h;
    }

    public final List<k1.h> w() {
        return this.f12377g;
    }

    public final float x() {
        return this.f12374d;
    }

    public final void y(l1.b0 b0Var, long j10, s1 s1Var, u2.j jVar, n1.g gVar, int i10) {
        b0Var.h();
        List<n> list = this.f12378h;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = list.get(i11);
            nVar.e().t(b0Var, j10, s1Var, jVar, gVar, i10);
            b0Var.c(0.0f, nVar.e().getHeight());
        }
        b0Var.p();
    }
}
