package u0;

import ae.n0;
import ae.r;
import md.i;
import md.i0;
import t0.j2;
import t0.o;
import t0.v2;
import u0.d;
import u0.g;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f21429a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f21430b = new g();

    public final void a() {
        this.f21430b.m();
        this.f21429a.m();
    }

    public final void b(zd.a<? extends Object> aVar, int i10, t0.d dVar) {
        g gVar;
        g gVar2;
        g gVar3 = this.f21429a;
        d.m mVar = d.m.f21451c;
        gVar3.y(mVar);
        g gVarA = g.c.a(gVar3);
        int i11 = 0;
        g.c.d(gVarA, d.s.a(0), aVar);
        g.c.c(gVarA, d.p.a(0), i10);
        int i12 = 1;
        g.c.d(gVarA, d.s.a(1), dVar);
        if (!(gVar3.f21473g == gVar3.n(mVar.b()) && gVar3.f21474h == gVar3.n(mVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int iB = mVar.b();
            int i13 = 0;
            while (i13 < iB) {
                if (((i12 << i13) & gVar3.f21473g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(mVar.e(d.p.a(i13)));
                    i11++;
                }
                i13++;
                i12 = 1;
            }
            String string = sb2.toString();
            r.e(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int iD = mVar.d();
            int i14 = 0;
            int i15 = 0;
            while (i15 < iD) {
                if (((1 << i15) & gVar3.f21474h) != 0) {
                    if (i11 > 0) {
                        sb3.append(", ");
                    }
                    gVar2 = gVar3;
                    sb3.append(mVar.f(d.s.a(i15)));
                    i14++;
                } else {
                    gVar2 = gVar3;
                }
                i15++;
                gVar3 = gVar2;
            }
            String string2 = sb3.toString();
            r.e(string2, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + mVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i14 + " object arguments (" + string2 + ").").toString());
        }
        g gVar4 = this.f21430b;
        d.t tVar = d.t.f21456c;
        gVar4.y(tVar);
        g gVarA2 = g.c.a(gVar4);
        g.c.c(gVarA2, d.p.a(0), i10);
        g.c.d(gVarA2, d.s.a(0), dVar);
        if (gVar4.f21473g == gVar4.n(tVar.b()) && gVar4.f21474h == gVar4.n(tVar.d())) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        int iB2 = tVar.b();
        int i16 = 0;
        for (int i17 = 0; i17 < iB2; i17++) {
            if (((1 << i17) & gVar4.f21473g) != 0) {
                if (i16 > 0) {
                    sb4.append(", ");
                }
                sb4.append(tVar.e(d.p.a(i17)));
                i16++;
            }
        }
        String string3 = sb4.toString();
        r.e(string3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder();
        int iD2 = tVar.d();
        int i18 = 0;
        int i19 = 0;
        while (i19 < iD2) {
            if (((1 << i19) & gVar4.f21474h) != 0) {
                if (i16 > 0) {
                    sb5.append(", ");
                }
                gVar = gVar4;
                sb5.append(tVar.f(d.s.a(i19)));
                i18++;
            } else {
                gVar = gVar4;
            }
            i19++;
            gVar4 = gVar;
        }
        String string4 = sb5.toString();
        r.e(string4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + tVar + ". Not all arguments were provided. Missing " + i16 + " int arguments (" + string3 + ") and " + i18 + " object arguments (" + string4 + ").").toString());
    }

    public final void c() {
        if (this.f21430b.u()) {
            this.f21430b.w(this.f21429a);
        } else {
            o.u("Cannot end node insertion, there are no pending operations that can be realized.".toString());
            throw new i();
        }
    }

    public final void d(t0.e<?> eVar, v2 v2Var, j2 j2Var) {
        if (this.f21430b.t()) {
            this.f21429a.r(eVar, v2Var, j2Var);
        } else {
            o.u("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?".toString());
            throw new i();
        }
    }

    public final boolean e() {
        return this.f21429a.t();
    }

    public final <V, T> void f(V v10, p<? super T, ? super V, i0> pVar) {
        g gVar = this.f21429a;
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
}
