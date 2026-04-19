package n0;

import com.google.android.gms.common.api.a;
import i2.c0;
import i2.d;
import i2.d0;
import i2.g0;
import i2.h0;
import i2.u;
import java.util.List;
import n0.c;
import n2.t;
import u2.q;
import w2.r;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i2.d f15619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g0 f15620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t.b f15621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<d.b<u>> f15626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f15627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f15628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private w2.d f15629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private i2.i f15630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private r f15631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d0 f15632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f15633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f15634p;

    private e(i2.d dVar, g0 g0Var, t.b bVar, int i10, boolean z10, int i11, int i12, List<d.b<u>> list) {
        this.f15619a = dVar;
        this.f15620b = g0Var;
        this.f15621c = bVar;
        this.f15622d = i10;
        this.f15623e = z10;
        this.f15624f = i11;
        this.f15625g = i12;
        this.f15626h = list;
        this.f15628j = a.f15605a.a();
        this.f15633o = -1;
        this.f15634p = -1;
    }

    public /* synthetic */ e(i2.d dVar, g0 g0Var, t.b bVar, int i10, boolean z10, int i11, int i12, List list, ae.j jVar) {
        this(dVar, g0Var, bVar, i10, z10, i11, i12, list);
    }

    private final i2.h e(long j10, r rVar) {
        i2.i iVarL = l(rVar);
        return new i2.h(iVarL, b.a(j10, this.f15623e, this.f15622d, iVarL.a()), b.b(this.f15623e, this.f15622d, this.f15624f), q.e(this.f15622d, q.f21604a.b()), null);
    }

    private final void g() {
        this.f15630l = null;
        this.f15632n = null;
        this.f15634p = -1;
        this.f15633o = -1;
    }

    private final boolean j(d0 d0Var, long j10, r rVar) {
        if (d0Var == null || d0Var.v().i().b() || rVar != d0Var.k().d()) {
            return true;
        }
        if (w2.b.g(j10, d0Var.k().a())) {
            return false;
        }
        return w2.b.n(j10) != w2.b.n(d0Var.k().a()) || ((float) w2.b.m(j10)) < d0Var.v().h() || d0Var.v().f();
    }

    private final i2.i l(r rVar) {
        i2.i iVar = this.f15630l;
        if (iVar == null || rVar != this.f15631m || iVar.b()) {
            this.f15631m = rVar;
            i2.d dVar = this.f15619a;
            g0 g0VarC = h0.c(this.f15620b, rVar);
            w2.d dVar2 = this.f15629k;
            ae.r.c(dVar2);
            t.b bVar = this.f15621c;
            List<d.b<u>> listM = this.f15626h;
            if (listM == null) {
                listM = nd.u.m();
            }
            iVar = new i2.i(dVar, g0VarC, listM, dVar2, bVar);
        }
        this.f15630l = iVar;
        return iVar;
    }

    private final d0 m(r rVar, long j10, i2.h hVar) {
        float fMin = Math.min(hVar.i().a(), hVar.x());
        i2.d dVar = this.f15619a;
        g0 g0Var = this.f15620b;
        List<d.b<u>> listM = this.f15626h;
        if (listM == null) {
            listM = nd.u.m();
        }
        List<d.b<u>> list = listM;
        int i10 = this.f15624f;
        boolean z10 = this.f15623e;
        int i11 = this.f15622d;
        w2.d dVar2 = this.f15629k;
        ae.r.c(dVar2);
        return new d0(new c0(dVar, g0Var, list, i10, z10, i11, dVar2, rVar, this.f15621c, j10, (ae.j) null), hVar, w2.c.d(j10, w2.q.a(m0.g.a(fMin), m0.g.a(hVar.h()))), null);
    }

    public final w2.d a() {
        return this.f15629k;
    }

    public final d0 b() {
        return this.f15632n;
    }

    public final d0 c() {
        d0 d0Var = this.f15632n;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int i10, r rVar) {
        int i11 = this.f15633o;
        int i12 = this.f15634p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int iA = m0.g.a(e(w2.c.a(0, i10, 0, a.e.API_PRIORITY_OTHER), rVar).h());
        this.f15633o = i10;
        this.f15634p = iA;
        return iA;
    }

    public final boolean f(long j10, r rVar) {
        i2.h hVarE;
        if (this.f15625g > 1) {
            c.a aVar = c.f15607h;
            c cVar = this.f15627i;
            g0 g0Var = this.f15620b;
            w2.d dVar = this.f15629k;
            ae.r.c(dVar);
            c cVarA = aVar.a(cVar, rVar, g0Var, dVar, this.f15621c);
            this.f15627i = cVarA;
            j10 = cVarA.c(j10, this.f15625g);
        }
        if (j(this.f15632n, j10, rVar)) {
            hVarE = e(j10, rVar);
        } else {
            d0 d0Var = this.f15632n;
            ae.r.c(d0Var);
            if (w2.b.g(j10, d0Var.k().a())) {
                return false;
            }
            d0 d0Var2 = this.f15632n;
            ae.r.c(d0Var2);
            hVarE = d0Var2.v();
        }
        this.f15632n = m(rVar, j10, hVarE);
        return true;
    }

    public final int h(r rVar) {
        return m0.g.a(l(rVar).a());
    }

    public final int i(r rVar) {
        return m0.g.a(l(rVar).c());
    }

    public final void k(w2.d dVar) {
        w2.d dVar2 = this.f15629k;
        long jD = dVar != null ? a.d(dVar) : a.f15605a.a();
        if (dVar2 == null) {
            this.f15629k = dVar;
            this.f15628j = jD;
        } else if (dVar == null || !a.e(this.f15628j, jD)) {
            this.f15629k = dVar;
            this.f15628j = jD;
            g();
        }
    }

    public final void n(i2.d dVar, g0 g0Var, t.b bVar, int i10, boolean z10, int i11, int i12, List<d.b<u>> list) {
        this.f15619a = dVar;
        this.f15620b = g0Var;
        this.f15621c = bVar;
        this.f15622d = i10;
        this.f15623e = z10;
        this.f15624f = i11;
        this.f15625g = i12;
        this.f15626h = list;
        g();
    }
}
