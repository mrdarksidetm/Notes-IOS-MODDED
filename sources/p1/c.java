package p1;

import java.util.ArrayList;
import java.util.List;
import l1.f1;
import l1.j0;
import l1.u1;
import l1.z;
import l1.z0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f17880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<l> f17881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<? extends h> f17884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f1 f17886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private zd.l<? super l, i0> f17887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final zd.l<l, i0> f17888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f17889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f17890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f17891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f17892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f17893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f17894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f17895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f17896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f17897s;

    static final class a extends ae.s implements zd.l<l, i0> {
        a() {
            super(1);
        }

        public final void a(l lVar) {
            c.this.n(lVar);
            zd.l<l, i0> lVarB = c.this.b();
            if (lVarB != null) {
                lVarB.invoke(lVar);
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(l lVar) {
            a(lVar);
            return i0.f15558a;
        }
    }

    public c() {
        super(null);
        this.f17881c = new ArrayList();
        this.f17882d = true;
        this.f17883e = j0.f14524b.j();
        this.f17884f = o.e();
        this.f17885g = true;
        this.f17888j = new a();
        this.f17889k = "";
        this.f17893o = 1.0f;
        this.f17894p = 1.0f;
        this.f17897s = true;
    }

    private final boolean h() {
        return !this.f17884f.isEmpty();
    }

    private final void k() {
        this.f17882d = false;
        this.f17883e = j0.f14524b.j();
    }

    private final void l(z zVar) {
        if (this.f17882d && zVar != null) {
            if (zVar instanceof u1) {
                m(((u1) zVar).a());
            } else {
                k();
            }
        }
    }

    private final void m(long j10) {
        if (this.f17882d) {
            j0.a aVar = j0.f14524b;
            if (j10 != aVar.j()) {
                if (this.f17883e == aVar.j()) {
                    this.f17883e = j10;
                } else {
                    if (o.f(this.f17883e, j10)) {
                        return;
                    }
                    k();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(l lVar) {
        if (lVar instanceof g) {
            g gVar = (g) lVar;
            l(gVar.e());
            l(gVar.g());
        } else if (lVar instanceof c) {
            c cVar = (c) lVar;
            if (cVar.f17882d && this.f17882d) {
                m(cVar.f17883e);
            } else {
                k();
            }
        }
    }

    private final void x() {
        if (h()) {
            f1 f1VarA = this.f17886h;
            if (f1VarA == null) {
                f1VarA = l1.p.a();
                this.f17886h = f1VarA;
            }
            k.c(this.f17884f, f1VarA);
        }
    }

    private final void y() {
        float[] fArrC = this.f17880b;
        if (fArrC == null) {
            fArrC = z0.c(null, 1, null);
            this.f17880b = fArrC;
        } else {
            z0.h(fArrC);
        }
        z0.n(fArrC, this.f17891m + this.f17895q, this.f17892n + this.f17896r, 0.0f, 4, null);
        z0.i(fArrC, this.f17890l);
        z0.j(fArrC, this.f17893o, this.f17894p, 1.0f);
        z0.n(fArrC, -this.f17891m, -this.f17892n, 0.0f, 4, null);
    }

    @Override // p1.l
    public void a(n1.f fVar) {
        if (this.f17897s) {
            y();
            this.f17897s = false;
        }
        if (this.f17885g) {
            x();
            this.f17885g = false;
        }
        n1.d dVarM0 = fVar.M0();
        long jC = dVarM0.c();
        dVarM0.d().h();
        n1.h hVarA = dVarM0.a();
        float[] fArr = this.f17880b;
        if (fArr != null) {
            hVarA.d(z0.a(fArr).o());
        }
        f1 f1Var = this.f17886h;
        if (h() && f1Var != null) {
            n1.h.e(hVarA, f1Var, 0, 2, null);
        }
        List<l> list = this.f17881c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).a(fVar);
        }
        dVarM0.d().p();
        dVarM0.b(jC);
    }

    @Override // p1.l
    public zd.l<l, i0> b() {
        return this.f17887i;
    }

    @Override // p1.l
    public void d(zd.l<? super l, i0> lVar) {
        this.f17887i = lVar;
    }

    public final int f() {
        return this.f17881c.size();
    }

    public final long g() {
        return this.f17883e;
    }

    public final void i(int i10, l lVar) {
        if (i10 < f()) {
            this.f17881c.set(i10, lVar);
        } else {
            this.f17881c.add(lVar);
        }
        n(lVar);
        lVar.d(this.f17888j);
        c();
    }

    public final boolean j() {
        return this.f17882d;
    }

    public final void o(List<? extends h> list) {
        this.f17884f = list;
        this.f17885g = true;
        c();
    }

    public final void p(String str) {
        this.f17889k = str;
        c();
    }

    public final void q(float f10) {
        this.f17891m = f10;
        this.f17897s = true;
        c();
    }

    public final void r(float f10) {
        this.f17892n = f10;
        this.f17897s = true;
        c();
    }

    public final void s(float f10) {
        this.f17890l = f10;
        this.f17897s = true;
        c();
    }

    public final void t(float f10) {
        this.f17893o = f10;
        this.f17897s = true;
        c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.f17889k);
        List<l> list = this.f17881c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = list.get(i10);
            sb2.append("\t");
            sb2.append(lVar.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public final void u(float f10) {
        this.f17894p = f10;
        this.f17897s = true;
        c();
    }

    public final void v(float f10) {
        this.f17895q = f10;
        this.f17897s = true;
        c();
    }

    public final void w(float f10) {
        this.f17896r = f10;
        this.f17897s = true;
        c();
    }
}
