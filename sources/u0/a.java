package u0;

import ae.n0;
import ae.r;
import java.util.List;
import md.i0;
import t0.c0;
import t0.f1;
import t0.g1;
import t0.j;
import t0.j2;
import t0.k2;
import t0.q;
import t0.s2;
import t0.v2;
import u0.d;
import u0.g;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f21414a = new g();

    public final void A() {
        this.f21414a.x(d.a0.f21434c);
    }

    public final void B(Object obj) {
        g gVar = this.f21414a;
        d.b0 b0Var = d.b0.f21436c;
        gVar.y(b0Var);
        g.c.d(g.c.a(gVar), d.s.a(0), obj);
        if (gVar.f21473g == gVar.n(b0Var.b()) && gVar.f21474h == gVar.n(b0Var.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = b0Var.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f21473g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(b0Var.e(d.p.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = b0Var.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f21474h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(b0Var.f(d.s.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + b0Var + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
    }

    public final <T, V> void C(V v10, p<? super T, ? super V, i0> pVar) {
        g gVar = this.f21414a;
        d.c0 c0Var = d.c0.f21438c;
        gVar.y(c0Var);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), v10);
        int iA = d.s.a(1);
        r.d(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        g.c.d(gVarA, iA, (p) n0.e(pVar, 2));
        if (gVar.f21473g == gVar.n(c0Var.b()) && gVar.f21474h == gVar.n(c0Var.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c0Var.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f21473g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c0Var.e(d.p.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c0Var.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f21474h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c0Var.f(d.s.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + c0Var + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
    }

    public final void D(Object obj, int i10) {
        g gVar = this.f21414a;
        d.d0 d0Var = d.d0.f21440c;
        gVar.y(d0Var);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), obj);
        g.c.c(gVarA, d.p.a(0), i10);
        if (gVar.f21473g == gVar.n(d0Var.b()) && gVar.f21474h == gVar.n(d0Var.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = d0Var.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f21473g) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(d0Var.e(d.p.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = d0Var.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f21474h) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(d0Var.f(d.s.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + d0Var + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").").toString());
    }

    public final void E(int i10) {
        g gVar = this.f21414a;
        d.e0 e0Var = d.e0.f21442c;
        gVar.y(e0Var);
        g.c.c(g.c.a(gVar), d.p.a(0), i10);
        if (gVar.f21473g == gVar.n(e0Var.b()) && gVar.f21474h == gVar.n(e0Var.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = e0Var.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f21473g) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(e0Var.e(d.p.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = e0Var.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f21474h) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(e0Var.f(d.s.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + e0Var + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").").toString());
    }

    public final void F(Object obj) {
        if (obj instanceof j) {
            this.f21414a.x(d.f0.f21444c);
        }
    }

    public final void a() {
        this.f21414a.m();
    }

    public final void b(t0.e<?> eVar, v2 v2Var, j2 j2Var) {
        this.f21414a.r(eVar, v2Var, j2Var);
    }

    public final boolean c() {
        return this.f21414a.t();
    }

    public final boolean d() {
        return this.f21414a.u();
    }

    public final void e(int i10) {
        g gVar = this.f21414a;
        d.a aVar = d.a.f21433c;
        gVar.y(aVar);
        g.c.c(g.c.a(gVar), d.p.a(0), i10);
        if (gVar.f21473g == gVar.n(aVar.b()) && gVar.f21474h == gVar.n(aVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = aVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f21473g) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(aVar.e(d.p.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = aVar.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f21474h) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(aVar.f(d.s.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + aVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").").toString());
    }

    public final void f(List<? extends Object> list, b1.d dVar) {
        if (!list.isEmpty()) {
            g gVar = this.f21414a;
            d.c cVar = d.c.f21437c;
            gVar.y(cVar);
            g gVarA = g.c.a(gVar);
            g.c.d(gVarA, d.s.a(1), list);
            g.c.d(gVarA, d.s.a(0), dVar);
            if (gVar.f21473g == gVar.n(cVar.b()) && gVar.f21474h == gVar.n(cVar.d())) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int iB = cVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < iB; i11++) {
                if (((1 << i11) & gVar.f21473g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(cVar.e(d.p.a(i11)));
                    i10++;
                }
            }
            String string = sb2.toString();
            r.e(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int iD = cVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < iD; i13++) {
                if (((1 << i13) & gVar.f21474h) != 0) {
                    if (i10 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(cVar.f(d.s.a(i13)));
                    i12++;
                }
            }
            String string2 = sb3.toString();
            r.e(string2, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + cVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
        }
    }

    public final void g(f1 f1Var, q qVar, g1 g1Var, g1 g1Var2) {
        g gVar = this.f21414a;
        d.C0436d c0436d = d.C0436d.f21439c;
        gVar.y(c0436d);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), f1Var);
        g.c.d(gVarA, d.s.a(1), qVar);
        g.c.d(gVarA, d.s.a(3), g1Var2);
        g.c.d(gVarA, d.s.a(2), g1Var);
        if (gVar.f21473g == gVar.n(c0436d.b()) && gVar.f21474h == gVar.n(c0436d.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c0436d.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f21473g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c0436d.e(d.p.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c0436d.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f21474h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c0436d.f(d.s.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + c0436d + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
    }

    public final void h() {
        this.f21414a.x(d.e.f21441c);
    }

    public final void i(b1.d dVar, t0.d dVar2) {
        g gVar = this.f21414a;
        d.f fVar = d.f.f21443c;
        gVar.y(fVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), dVar);
        g.c.d(gVarA, d.s.a(1), dVar2);
        if (gVar.f21473g == gVar.n(fVar.b()) && gVar.f21474h == gVar.n(fVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = fVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f21473g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(fVar.e(d.p.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = fVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f21474h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(fVar.f(d.s.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + fVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
    }

    public final void j(Object[] objArr) {
        if (!(objArr.length == 0)) {
            g gVar = this.f21414a;
            d.g gVar2 = d.g.f21445c;
            gVar.y(gVar2);
            g.c.d(g.c.a(gVar), d.s.a(0), objArr);
            if (gVar.f21473g == gVar.n(gVar2.b()) && gVar.f21474h == gVar.n(gVar2.d())) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int iB = gVar2.b();
            int i10 = 0;
            for (int i11 = 0; i11 < iB; i11++) {
                if (((1 << i11) & gVar.f21473g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(gVar2.e(d.p.a(i11)));
                    i10++;
                }
            }
            String string = sb2.toString();
            r.e(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int iD = gVar2.d();
            int i12 = 0;
            for (int i13 = 0; i13 < iD; i13++) {
                if (((1 << i13) & gVar.f21474h) != 0) {
                    if (i10 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(gVar2.f(d.s.a(i13)));
                    i12++;
                }
            }
            String string2 = sb3.toString();
            r.e(string2, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + gVar2 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
        }
    }

    public final void k(l<? super t0.p, i0> lVar, t0.p pVar) {
        g gVar = this.f21414a;
        d.h hVar = d.h.f21446c;
        gVar.y(hVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), lVar);
        g.c.d(gVarA, d.s.a(1), pVar);
        if (gVar.f21473g == gVar.n(hVar.b()) && gVar.f21474h == gVar.n(hVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = hVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f21473g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(hVar.e(d.p.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = hVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f21474h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(hVar.f(d.s.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + hVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
    }

    public final void l() {
        this.f21414a.x(d.i.f21447c);
    }

    public final void m() {
        this.f21414a.x(d.j.f21448c);
    }

    public final void n(t0.d dVar) {
        g gVar = this.f21414a;
        d.k kVar = d.k.f21449c;
        gVar.y(kVar);
        g.c.d(g.c.a(gVar), d.s.a(0), dVar);
        if (gVar.f21473g == gVar.n(kVar.b()) && gVar.f21474h == gVar.n(kVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = kVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f21473g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(kVar.e(d.p.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = kVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f21474h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(kVar.f(d.s.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + kVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
    }

    public final void o() {
        this.f21414a.x(d.l.f21450c);
    }

    public final void p(a aVar, b1.d dVar) {
        if (aVar.d()) {
            g gVar = this.f21414a;
            d.b bVar = d.b.f21435c;
            gVar.y(bVar);
            g gVarA = g.c.a(gVar);
            g.c.d(gVarA, d.s.a(0), aVar);
            g.c.d(gVarA, d.s.a(1), dVar);
            if (gVar.f21473g == gVar.n(bVar.b()) && gVar.f21474h == gVar.n(bVar.d())) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int iB = bVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < iB; i11++) {
                if (((1 << i11) & gVar.f21473g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(bVar.e(d.p.a(i11)));
                    i10++;
                }
            }
            String string = sb2.toString();
            r.e(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int iD = bVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < iD; i13++) {
                if (((1 << i13) & gVar.f21474h) != 0) {
                    if (i10 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(bVar.f(d.s.a(i13)));
                    i12++;
                }
            }
            String string2 = sb3.toString();
            r.e(string2, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + bVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
        }
    }

    public final void q(t0.d dVar, s2 s2Var) {
        g gVar = this.f21414a;
        d.n nVar = d.n.f21452c;
        gVar.y(nVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), dVar);
        g.c.d(gVarA, d.s.a(1), s2Var);
        if (gVar.f21473g == gVar.n(nVar.b()) && gVar.f21474h == gVar.n(nVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = nVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f21473g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(nVar.e(d.p.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = nVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f21474h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(nVar.f(d.s.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + nVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
    }

    public final void r(t0.d dVar, s2 s2Var, c cVar) {
        g gVar = this.f21414a;
        d.o oVar = d.o.f21453c;
        gVar.y(oVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), dVar);
        g.c.d(gVarA, d.s.a(1), s2Var);
        g.c.d(gVarA, d.s.a(2), cVar);
        if (gVar.f21473g == gVar.n(oVar.b()) && gVar.f21474h == gVar.n(oVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = oVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f21473g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(oVar.e(d.p.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = oVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f21474h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(oVar.f(d.s.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + oVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
    }

    public final void s(int i10) {
        g gVar = this.f21414a;
        d.q qVar = d.q.f21454c;
        gVar.y(qVar);
        g.c.c(g.c.a(gVar), d.p.a(0), i10);
        if (gVar.f21473g == gVar.n(qVar.b()) && gVar.f21474h == gVar.n(qVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = qVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f21473g) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(qVar.e(d.p.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = qVar.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f21474h) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(qVar.f(d.s.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + qVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").").toString());
    }

    public final void t(int i10, int i11, int i12) {
        g gVar = this.f21414a;
        d.r rVar = d.r.f21455c;
        gVar.y(rVar);
        g gVarA = g.c.a(gVar);
        g.c.c(gVarA, d.p.a(1), i10);
        g.c.c(gVarA, d.p.a(0), i11);
        g.c.c(gVarA, d.p.a(2), i12);
        if (gVar.f21473g == gVar.n(rVar.b()) && gVar.f21474h == gVar.n(rVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = rVar.b();
        int i13 = 0;
        for (int i14 = 0; i14 < iB; i14++) {
            if (((1 << i14) & gVar.f21473g) != 0) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(rVar.e(d.p.a(i14)));
                i13++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = rVar.d();
        int i15 = 0;
        for (int i16 = 0; i16 < iD; i16++) {
            if (((1 << i16) & gVar.f21474h) != 0) {
                if (i13 > 0) {
                    sb3.append(", ");
                }
                sb3.append(rVar.f(d.s.a(i16)));
                i15++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + rVar + ". Not all arguments were provided. Missing " + i13 + " int arguments (" + string + ") and " + i15 + " object arguments (" + string2 + ").").toString());
    }

    public final void u(c0 c0Var, q qVar, g1 g1Var) {
        g gVar = this.f21414a;
        d.u uVar = d.u.f21457c;
        gVar.y(uVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), c0Var);
        g.c.d(gVarA, d.s.a(1), qVar);
        g.c.d(gVarA, d.s.a(2), g1Var);
        if (gVar.f21473g == gVar.n(uVar.b()) && gVar.f21474h == gVar.n(uVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = uVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f21473g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(uVar.e(d.p.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = uVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f21474h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(uVar.f(d.s.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + uVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
    }

    public final void v(k2 k2Var) {
        g gVar = this.f21414a;
        d.v vVar = d.v.f21458c;
        gVar.y(vVar);
        g.c.d(g.c.a(gVar), d.s.a(0), k2Var);
        if (gVar.f21473g == gVar.n(vVar.b()) && gVar.f21474h == gVar.n(vVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = vVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f21473g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(vVar.e(d.p.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = vVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f21474h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(vVar.f(d.s.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + vVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
    }

    public final void w() {
        this.f21414a.x(d.w.f21459c);
    }

    public final void x(int i10, int i11) {
        g gVar = this.f21414a;
        d.x xVar = d.x.f21460c;
        gVar.y(xVar);
        g gVarA = g.c.a(gVar);
        g.c.c(gVarA, d.p.a(0), i10);
        g.c.c(gVarA, d.p.a(1), i11);
        if (gVar.f21473g == gVar.n(xVar.b()) && gVar.f21474h == gVar.n(xVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = xVar.b();
        int i12 = 0;
        for (int i13 = 0; i13 < iB; i13++) {
            if (((1 << i13) & gVar.f21473g) != 0) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(xVar.e(d.p.a(i13)));
                i12++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = xVar.d();
        int i14 = 0;
        for (int i15 = 0; i15 < iD; i15++) {
            if (((1 << i15) & gVar.f21474h) != 0) {
                if (i12 > 0) {
                    sb3.append(", ");
                }
                sb3.append(xVar.f(d.s.a(i15)));
                i14++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + xVar + ". Not all arguments were provided. Missing " + i12 + " int arguments (" + string + ") and " + i14 + " object arguments (" + string2 + ").").toString());
    }

    public final void y() {
        this.f21414a.x(d.y.f21461c);
    }

    public final void z(zd.a<i0> aVar) {
        g gVar = this.f21414a;
        d.z zVar = d.z.f21462c;
        gVar.y(zVar);
        g.c.d(g.c.a(gVar), d.s.a(0), aVar);
        if (gVar.f21473g == gVar.n(zVar.b()) && gVar.f21474h == gVar.n(zVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = zVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f21473g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(zVar.e(d.p.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = zVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f21474h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(zVar.f(d.s.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        r.e(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + zVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
    }
}
