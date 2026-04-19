package n0;

import com.google.android.gms.common.api.a;
import i2.c0;
import i2.d0;
import i2.g0;
import i2.h0;
import i2.m;
import i2.p;
import md.i0;
import n0.c;
import n2.t;
import nd.u;
import w2.q;
import w2.r;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g0 f15636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t.b f15637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f15642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private w2.d f15643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m f15644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f15645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f15646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f15647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p f15648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private r f15649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f15650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f15651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f15652r;

    private f(String str, g0 g0Var, t.b bVar, int i10, boolean z10, int i11, int i12) {
        this.f15635a = str;
        this.f15636b = g0Var;
        this.f15637c = bVar;
        this.f15638d = i10;
        this.f15639e = z10;
        this.f15640f = i11;
        this.f15641g = i12;
        this.f15642h = a.f15605a.a();
        this.f15646l = q.a(0, 0);
        this.f15650p = w2.b.f22395b.c(0, 0);
        this.f15651q = -1;
        this.f15652r = -1;
    }

    public /* synthetic */ f(String str, g0 g0Var, t.b bVar, int i10, boolean z10, int i11, int i12, ae.j jVar) {
        this(str, g0Var, bVar, i10, z10, i11, i12);
    }

    private final m g(long j10, r rVar) {
        p pVarN = n(rVar);
        return i2.r.c(pVarN, b.a(j10, this.f15639e, this.f15638d, pVarN.a()), b.b(this.f15639e, this.f15638d, this.f15640f), u2.q.e(this.f15638d, u2.q.f21604a.b()));
    }

    private final void i() {
        this.f15644j = null;
        this.f15648n = null;
        this.f15649o = null;
        this.f15651q = -1;
        this.f15652r = -1;
        this.f15650p = w2.b.f22395b.c(0, 0);
        this.f15646l = q.a(0, 0);
        this.f15645k = false;
    }

    private final boolean l(long j10, r rVar) {
        p pVar;
        m mVar = this.f15644j;
        if (mVar == null || (pVar = this.f15648n) == null || pVar.b() || rVar != this.f15649o) {
            return true;
        }
        if (w2.b.g(j10, this.f15650p)) {
            return false;
        }
        return w2.b.n(j10) != w2.b.n(this.f15650p) || ((float) w2.b.m(j10)) < mVar.getHeight() || mVar.v();
    }

    private final p n(r rVar) {
        p pVarB = this.f15648n;
        if (pVarB == null || rVar != this.f15649o || pVarB.b()) {
            this.f15649o = rVar;
            String str = this.f15635a;
            g0 g0VarC = h0.c(this.f15636b, rVar);
            w2.d dVar = this.f15643i;
            ae.r.c(dVar);
            pVarB = i2.q.b(str, g0VarC, null, null, dVar, this.f15637c, 12, null);
        }
        this.f15648n = pVarB;
        return pVarB;
    }

    public final w2.d a() {
        return this.f15643i;
    }

    public final boolean b() {
        return this.f15645k;
    }

    public final long c() {
        return this.f15646l;
    }

    public final i0 d() {
        p pVar = this.f15648n;
        if (pVar != null) {
            pVar.b();
        }
        return i0.f15558a;
    }

    public final m e() {
        return this.f15644j;
    }

    public final int f(int i10, r rVar) {
        int i11 = this.f15651q;
        int i12 = this.f15652r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int iA = m0.g.a(g(w2.c.a(0, i10, 0, a.e.API_PRIORITY_OTHER), rVar).getHeight());
        this.f15651q = i10;
        this.f15652r = iA;
        return iA;
    }

    public final boolean h(long j10, r rVar) {
        boolean z10 = true;
        if (this.f15641g > 1) {
            c.a aVar = c.f15607h;
            c cVar = this.f15647m;
            g0 g0Var = this.f15636b;
            w2.d dVar = this.f15643i;
            ae.r.c(dVar);
            c cVarA = aVar.a(cVar, rVar, g0Var, dVar, this.f15637c);
            this.f15647m = cVarA;
            j10 = cVarA.c(j10, this.f15641g);
        }
        boolean z11 = false;
        if (l(j10, rVar)) {
            m mVarG = g(j10, rVar);
            this.f15650p = j10;
            this.f15646l = w2.c.d(j10, q.a(m0.g.a(mVarG.getWidth()), m0.g.a(mVarG.getHeight())));
            if (!u2.q.e(this.f15638d, u2.q.f21604a.c()) && (w2.p.g(r9) < mVarG.getWidth() || w2.p.f(r9) < mVarG.getHeight())) {
                z11 = true;
            }
            this.f15645k = z11;
            this.f15644j = mVarG;
            return true;
        }
        if (!w2.b.g(j10, this.f15650p)) {
            m mVar = this.f15644j;
            ae.r.c(mVar);
            this.f15646l = w2.c.d(j10, q.a(m0.g.a(Math.min(mVar.a(), mVar.getWidth())), m0.g.a(mVar.getHeight())));
            if (u2.q.e(this.f15638d, u2.q.f21604a.c()) || (w2.p.g(r3) >= mVar.getWidth() && w2.p.f(r3) >= mVar.getHeight())) {
                z10 = false;
            }
            this.f15645k = z10;
            this.f15650p = j10;
        }
        return false;
    }

    public final int j(r rVar) {
        return m0.g.a(n(rVar).a());
    }

    public final int k(r rVar) {
        return m0.g.a(n(rVar).c());
    }

    public final void m(w2.d dVar) {
        w2.d dVar2 = this.f15643i;
        long jD = dVar != null ? a.d(dVar) : a.f15605a.a();
        if (dVar2 == null) {
            this.f15643i = dVar;
            this.f15642h = jD;
        } else if (dVar == null || !a.e(this.f15642h, jD)) {
            this.f15643i = dVar;
            this.f15642h = jD;
            i();
        }
    }

    public final d0 o(g0 g0Var) {
        w2.d dVar;
        r rVar = this.f15649o;
        if (rVar == null || (dVar = this.f15643i) == null) {
            return null;
        }
        i2.d dVar2 = new i2.d(this.f15635a, null, null, 6, null);
        if (this.f15644j == null || this.f15648n == null) {
            return null;
        }
        long jE = w2.b.e(this.f15650p, 0, 0, 0, 0, 10, null);
        return new d0(new c0(dVar2, g0Var, u.m(), this.f15640f, this.f15639e, this.f15638d, dVar, rVar, this.f15637c, jE, (ae.j) null), new i2.h(new i2.i(dVar2, g0Var, u.m(), dVar, this.f15637c), jE, this.f15640f, u2.q.e(this.f15638d, u2.q.f21604a.b()), null), this.f15646l, null);
    }

    public final void p(String str, g0 g0Var, t.b bVar, int i10, boolean z10, int i11, int i12) {
        this.f15635a = str;
        this.f15636b = g0Var;
        this.f15637c = bVar;
        this.f15638d = i10;
        this.f15639e = z10;
        this.f15640f = i11;
        this.f15641g = i12;
        i();
    }
}
