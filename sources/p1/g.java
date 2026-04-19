package p1;

import java.util.List;
import l1.f1;
import l1.i1;
import l1.z;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z f17934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f17935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<? extends h> f17936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f17938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f17939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z f17940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f17943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f17944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f17945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f17946o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f17947p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17948q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f17949r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private n1.k f17950s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final f1 f17951t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private f1 f17952u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final md.l f17953v;

    static final class a extends ae.s implements zd.a<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17954a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i1 invoke() {
            return l1.o.a();
        }
    }

    public g() {
        super(null);
        this.f17933b = "";
        this.f17935d = 1.0f;
        this.f17936e = o.e();
        this.f17937f = o.b();
        this.f17938g = 1.0f;
        this.f17941j = o.c();
        this.f17942k = o.d();
        this.f17943l = 4.0f;
        this.f17945n = 1.0f;
        this.f17947p = true;
        this.f17948q = true;
        f1 f1VarA = l1.p.a();
        this.f17951t = f1VarA;
        this.f17952u = f1VarA;
        this.f17953v = md.n.a(md.p.f15571c, a.f17954a);
    }

    private final i1 f() {
        return (i1) this.f17953v.getValue();
    }

    private final void v() {
        k.c(this.f17936e, this.f17951t);
        w();
    }

    private final void w() {
        if (this.f17944m == 0.0f) {
            if (this.f17945n == 1.0f) {
                this.f17952u = this.f17951t;
                return;
            }
        }
        if (ae.r.b(this.f17952u, this.f17951t)) {
            this.f17952u = l1.p.a();
        } else {
            int i10 = this.f17952u.i();
            this.f17952u.o();
            this.f17952u.g(i10);
        }
        f().a(this.f17951t, false);
        float fB = f().b();
        float f10 = this.f17944m;
        float f11 = this.f17946o;
        float f12 = ((f10 + f11) % 1.0f) * fB;
        float f13 = ((this.f17945n + f11) % 1.0f) * fB;
        if (f12 <= f13) {
            f().c(f12, f13, this.f17952u, true);
        } else {
            f().c(f12, fB, this.f17952u, true);
            f().c(0.0f, f13, this.f17952u, true);
        }
    }

    @Override // p1.l
    public void a(n1.f fVar) {
        if (this.f17947p) {
            v();
        } else if (this.f17949r) {
            w();
        }
        this.f17947p = false;
        this.f17949r = false;
        z zVar = this.f17934c;
        if (zVar != null) {
            n1.f.h0(fVar, this.f17952u, zVar, this.f17935d, null, null, 0, 56, null);
        }
        z zVar2 = this.f17940i;
        if (zVar2 != null) {
            n1.k kVar = this.f17950s;
            if (this.f17948q || kVar == null) {
                kVar = new n1.k(this.f17939h, this.f17943l, this.f17941j, this.f17942k, null, 16, null);
                this.f17950s = kVar;
                this.f17948q = false;
            }
            n1.f.h0(fVar, this.f17952u, zVar2, this.f17938g, kVar, null, 0, 48, null);
        }
    }

    public final z e() {
        return this.f17934c;
    }

    public final z g() {
        return this.f17940i;
    }

    public final void h(z zVar) {
        this.f17934c = zVar;
        c();
    }

    public final void i(float f10) {
        this.f17935d = f10;
        c();
    }

    public final void j(String str) {
        this.f17933b = str;
        c();
    }

    public final void k(List<? extends h> list) {
        this.f17936e = list;
        this.f17947p = true;
        c();
    }

    public final void l(int i10) {
        this.f17937f = i10;
        this.f17952u.g(i10);
        c();
    }

    public final void m(z zVar) {
        this.f17940i = zVar;
        c();
    }

    public final void n(float f10) {
        this.f17938g = f10;
        c();
    }

    public final void o(int i10) {
        this.f17941j = i10;
        this.f17948q = true;
        c();
    }

    public final void p(int i10) {
        this.f17942k = i10;
        this.f17948q = true;
        c();
    }

    public final void q(float f10) {
        this.f17943l = f10;
        this.f17948q = true;
        c();
    }

    public final void r(float f10) {
        this.f17939h = f10;
        this.f17948q = true;
        c();
    }

    public final void s(float f10) {
        this.f17945n = f10;
        this.f17949r = true;
        c();
    }

    public final void t(float f10) {
        this.f17946o = f10;
        this.f17949r = true;
        c();
    }

    public String toString() {
        return this.f17951t.toString();
    }

    public final void u(float f10) {
        this.f17944m = f10;
        this.f17949r = true;
        c();
    }
}
