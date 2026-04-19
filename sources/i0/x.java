package i0;

import java.util.List;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class x implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f12240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w2.r f12244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f12245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f12246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<t0> f12247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f12248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f12249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final l f12250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f12251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f12252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f12253o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f12254p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f12255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f12256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f12257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f12258t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f12259u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f12260v;

    /* JADX WARN: Multi-variable type inference failed */
    private x(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, w2.r rVar, int i13, int i14, List<? extends t0> list, long j10, Object obj2, l lVar) {
        this.f12239a = i10;
        this.f12240b = obj;
        this.f12241c = z10;
        this.f12242d = i11;
        this.f12243e = z11;
        this.f12244f = rVar;
        this.f12245g = i13;
        this.f12246h = i14;
        this.f12247i = list;
        this.f12248j = j10;
        this.f12249k = obj2;
        this.f12250l = lVar;
        this.f12253o = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            t0 t0Var = (t0) list.get(i15);
            iMax = Math.max(iMax, this.f12241c ? t0Var.d0() : t0Var.q0());
        }
        this.f12251m = iMax;
        this.f12252n = ge.o.d(i12 + iMax, 0);
        this.f12256r = this.f12241c ? w2.q.a(this.f12242d, iMax) : w2.q.a(iMax, this.f12242d);
        this.f12257s = w2.n.f22418b.a();
        this.f12258t = -1;
        this.f12259u = -1;
    }

    public /* synthetic */ x(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, w2.r rVar, int i13, int i14, List list, long j10, Object obj2, l lVar, ae.j jVar) {
        this(i10, obj, z10, i11, i12, z11, rVar, i13, i14, list, j10, obj2, lVar);
    }

    private final int h(long j10) {
        return this.f12241c ? w2.n.k(j10) : w2.n.j(j10);
    }

    private final int j(t0 t0Var) {
        return this.f12241c ? t0Var.d0() : t0Var.q0();
    }

    @Override // i0.k
    public int a() {
        return this.f12259u;
    }

    @Override // i0.k
    public int b() {
        return this.f12258t;
    }

    @Override // i0.k
    public long c() {
        return this.f12257s;
    }

    public final void d(int i10) {
        if (this.f12260v) {
            return;
        }
        long jC = c();
        int iJ = this.f12241c ? w2.n.j(jC) : w2.n.j(jC) + i10;
        boolean z10 = this.f12241c;
        int iK = w2.n.k(jC);
        if (z10) {
            iK += i10;
        }
        this.f12257s = w2.o.a(iJ, iK);
        int iN = n();
        for (int i11 = 0; i11 < iN; i11++) {
            j0.f fVarB = this.f12250l.b(g(), i11);
            if (fVarB != null) {
                long jI = fVarB.i();
                int iJ2 = this.f12241c ? w2.n.j(jI) : Integer.valueOf(w2.n.j(jI) + i10).intValue();
                boolean z11 = this.f12241c;
                int iK2 = w2.n.k(jI);
                if (z11) {
                    iK2 += i10;
                }
                fVarB.r(w2.o.a(iJ2, iK2));
            }
        }
    }

    public final int e() {
        return this.f12241c ? w2.n.j(c()) : w2.n.k(c());
    }

    public final int f() {
        return this.f12242d;
    }

    public Object g() {
        return this.f12240b;
    }

    @Override // i0.k
    public int getIndex() {
        return this.f12239a;
    }

    public final int i() {
        return this.f12251m;
    }

    public final int k() {
        return this.f12252n;
    }

    public final boolean l() {
        return this.f12260v;
    }

    public final Object m(int i10) {
        return this.f12247i.get(i10).f();
    }

    public final int n() {
        return this.f12247i.size();
    }

    public final boolean o() {
        return this.f12241c;
    }

    public final void p(t0.a aVar) {
        if (!(this.f12253o != Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int iN = n();
        for (int i10 = 0; i10 < iN; i10++) {
            t0 t0Var = this.f12247i.get(i10);
            int iJ = this.f12254p - j(t0Var);
            int i11 = this.f12255q;
            long jC = c();
            j0.f fVarB = this.f12250l.b(g(), i10);
            if (fVarB != null) {
                long jH = fVarB.h();
                long jA = w2.o.a(w2.n.j(jC) + w2.n.j(jH), w2.n.k(jC) + w2.n.k(jH));
                if ((h(jC) <= iJ && h(jA) <= iJ) || (h(jC) >= i11 && h(jA) >= i11)) {
                    fVarB.g();
                }
                jC = jA;
            }
            if (this.f12243e) {
                jC = w2.o.a(this.f12241c ? w2.n.j(jC) : (this.f12253o - w2.n.j(jC)) - j(t0Var), this.f12241c ? (this.f12253o - w2.n.k(jC)) - j(t0Var) : w2.n.k(jC));
            }
            long j10 = this.f12248j;
            long jA2 = w2.o.a(w2.n.j(jC) + w2.n.j(j10), w2.n.k(jC) + w2.n.k(j10));
            if (this.f12241c) {
                t0.a.t(aVar, t0Var, jA2, 0.0f, null, 6, null);
            } else {
                t0.a.p(aVar, t0Var, jA2, 0.0f, null, 6, null);
            }
        }
    }

    public final void q(int i10, int i11, int i12, int i13, int i14, int i15) {
        boolean z10 = this.f12241c;
        this.f12253o = z10 ? i13 : i12;
        if (!z10) {
            i12 = i13;
        }
        if (z10 && this.f12244f == w2.r.Rtl) {
            i11 = (i12 - i11) - this.f12242d;
        }
        this.f12257s = z10 ? w2.o.a(i11, i10) : w2.o.a(i10, i11);
        this.f12258t = i14;
        this.f12259u = i15;
        this.f12254p = -this.f12245g;
        this.f12255q = this.f12253o + this.f12246h;
    }

    public final void s(boolean z10) {
        this.f12260v = z10;
    }
}
