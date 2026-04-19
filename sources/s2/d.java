package s2;

import ae.s;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import i2.a0;
import i2.d;
import i2.g0;
import i2.x;
import java.util.ArrayList;
import java.util.List;
import je.y;
import l1.j0;
import l1.l0;
import l1.q1;
import l1.s1;
import l1.u1;
import l1.z;
import l2.h;
import l2.l;
import l2.m;
import l2.o;
import md.i0;
import n1.g;
import n2.e0;
import n2.f0;
import n2.t;
import nd.p;
import u2.g;
import u2.j;
import u2.n;
import w2.u;
import w2.v;
import zd.q;
import zd.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    static final class a extends s implements q<a0, Integer, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Spannable f19920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r<t, n2.i0, e0, f0, Typeface> f19921b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Spannable spannable, r<? super t, ? super n2.i0, ? super e0, ? super f0, ? extends Typeface> rVar) {
            super(3);
            this.f19920a = spannable;
            this.f19921b = rVar;
        }

        public final void a(a0 a0Var, int i10, int i11) {
            Spannable spannable = this.f19920a;
            r<t, n2.i0, e0, f0, Typeface> rVar = this.f19921b;
            t tVarI = a0Var.i();
            n2.i0 i0VarN = a0Var.n();
            if (i0VarN == null) {
                i0VarN = n2.i0.f15808b.g();
            }
            e0 e0VarL = a0Var.l();
            e0 e0VarC = e0.c(e0VarL != null ? e0VarL.i() : e0.f15784b.b());
            f0 f0VarM = a0Var.m();
            spannable.setSpan(new o(rVar.invoke(tVarI, i0VarN, e0VarC, f0.b(f0VarM != null ? f0VarM.j() : f0.f15789b.a()))), i10, i11, 33);
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ i0 invoke(a0 a0Var, Integer num, Integer num2) {
            a(a0Var, num.intValue(), num2.intValue());
            return i0.f15558a;
        }
    }

    private static final MetricAffectingSpan a(long j10, w2.d dVar) {
        long jG = w2.t.g(j10);
        v.a aVar = v.f22432b;
        if (v.g(jG, aVar.b())) {
            return new l2.f(dVar.o1(j10));
        }
        if (v.g(jG, aVar.a())) {
            return new l2.e(w2.t.h(j10));
        }
        return null;
    }

    public static final void b(a0 a0Var, List<d.b<a0>> list, q<? super a0, ? super Integer, ? super Integer, i0> qVar) {
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                qVar.invoke(f(a0Var, list.get(0).e()), Integer.valueOf(list.get(0).f()), Integer.valueOf(list.get(0).d()));
                return;
            }
            return;
        }
        int size = list.size();
        int i10 = size * 2;
        Integer[] numArr = new Integer[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            numArr[i11] = 0;
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            d.b<a0> bVar = list.get(i12);
            numArr[i12] = Integer.valueOf(bVar.f());
            numArr[i12 + size] = Integer.valueOf(bVar.d());
        }
        nd.o.y(numArr);
        int iIntValue = ((Number) p.L(numArr)).intValue();
        for (int i13 = 0; i13 < i10; i13++) {
            int iIntValue2 = numArr[i13].intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = list.size();
                a0 a0VarF = a0Var;
                for (int i14 = 0; i14 < size3; i14++) {
                    d.b<a0> bVar2 = list.get(i14);
                    if (bVar2.f() != bVar2.d() && i2.e.k(iIntValue, iIntValue2, bVar2.f(), bVar2.d())) {
                        a0VarF = f(a0VarF, bVar2.e());
                    }
                }
                if (a0VarF != null) {
                    qVar.invoke(a0VarF, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                }
                iIntValue = iIntValue2;
            }
        }
    }

    private static final boolean c(a0 a0Var) {
        long jG = w2.t.g(a0Var.o());
        v.a aVar = v.f22432b;
        return v.g(jG, aVar.b()) || v.g(w2.t.g(a0Var.o()), aVar.a());
    }

    private static final boolean d(g0 g0Var) {
        return e.d(g0Var.O()) || g0Var.p() != null;
    }

    private static final boolean e(w2.d dVar) {
        return ((double) dVar.y0()) > 1.05d;
    }

    private static final a0 f(a0 a0Var, a0 a0Var2) {
        return a0Var == null ? a0Var2 : a0Var.x(a0Var2);
    }

    private static final float g(long j10, float f10, w2.d dVar) {
        float fH;
        long jG = w2.t.g(j10);
        v.a aVar = v.f22432b;
        if (v.g(jG, aVar.b())) {
            if (!e(dVar)) {
                return dVar.o1(j10);
            }
            fH = w2.t.h(j10) / w2.t.h(dVar.q(f10));
        } else {
            if (!v.g(jG, aVar.a())) {
                return Float.NaN;
            }
            fH = w2.t.h(j10);
        }
        return fH * f10;
    }

    public static final void h(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != j0.f14524b.j()) {
            u(spannable, new BackgroundColorSpan(l0.i(j10)), i10, i11);
        }
    }

    private static final void i(Spannable spannable, u2.a aVar, int i10, int i11) {
        if (aVar != null) {
            u(spannable, new l2.a(aVar.h()), i10, i11);
        }
    }

    private static final void j(Spannable spannable, z zVar, float f10, int i10, int i11) {
        if (zVar != null) {
            if (zVar instanceof u1) {
                k(spannable, ((u1) zVar).a(), i10, i11);
            } else if (zVar instanceof q1) {
                u(spannable, new t2.b((q1) zVar, f10), i10, i11);
            }
        }
    }

    public static final void k(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != j0.f14524b.j()) {
            u(spannable, new ForegroundColorSpan(l0.i(j10)), i10, i11);
        }
    }

    private static final void l(Spannable spannable, g gVar, int i10, int i11) {
        if (gVar != null) {
            u(spannable, new t2.a(gVar), i10, i11);
        }
    }

    private static final void m(Spannable spannable, g0 g0Var, List<d.b<a0>> list, r<? super t, ? super n2.i0, ? super e0, ? super f0, ? extends Typeface> rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            d.b<a0> bVar = list.get(i10);
            d.b<a0> bVar2 = bVar;
            if (e.d(bVar2.e()) || bVar2.e().m() != null) {
                arrayList.add(bVar);
            }
        }
        b(d(g0Var) ? new a0(0L, 0L, g0Var.q(), g0Var.o(), g0Var.p(), g0Var.l(), (String) null, 0L, (u2.a) null, (n) null, (q2.e) null, 0L, (j) null, (s1) null, (x) null, (g) null, 65475, (ae.j) null) : null, arrayList, new a(spannable, rVar));
    }

    private static final void n(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            u(spannable, new l2.b(str), i10, i11);
        }
    }

    public static final void o(Spannable spannable, long j10, w2.d dVar, int i10, int i11) {
        long jG = w2.t.g(j10);
        v.a aVar = v.f22432b;
        if (v.g(jG, aVar.b())) {
            u(spannable, new AbsoluteSizeSpan(ce.c.d(dVar.o1(j10)), false), i10, i11);
        } else if (v.g(jG, aVar.a())) {
            u(spannable, new RelativeSizeSpan(w2.t.h(j10)), i10, i11);
        }
    }

    private static final void p(Spannable spannable, n nVar, int i10, int i11) {
        if (nVar != null) {
            u(spannable, new ScaleXSpan(nVar.b()), i10, i11);
            u(spannable, new m(nVar.c()), i10, i11);
        }
    }

    public static final void q(Spannable spannable, long j10, float f10, w2.d dVar, u2.g gVar) {
        float fG = g(j10, f10, dVar);
        if (Float.isNaN(fG)) {
            return;
        }
        u(spannable, new h(fG, 0, ((spannable.length() == 0) || y.a1(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), g.c.f(gVar.c()), g.c.g(gVar.c()), gVar.b()), 0, spannable.length());
    }

    public static final void r(Spannable spannable, long j10, float f10, w2.d dVar) {
        float fG = g(j10, f10, dVar);
        if (Float.isNaN(fG)) {
            return;
        }
        u(spannable, new l2.g(fG), 0, spannable.length());
    }

    public static final void s(Spannable spannable, q2.e eVar, int i10, int i11) {
        if (eVar != null) {
            u(spannable, b.f19919a.a(eVar), i10, i11);
        }
    }

    private static final void t(Spannable spannable, s1 s1Var, int i10, int i11) {
        if (s1Var != null) {
            u(spannable, new l(l0.i(s1Var.c()), k1.f.o(s1Var.d()), k1.f.p(s1Var.d()), e.b(s1Var.b())), i10, i11);
        }
    }

    public static final void u(Spannable spannable, Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }

    private static final void v(Spannable spannable, d.b<a0> bVar, w2.d dVar) {
        int iF = bVar.f();
        int iD = bVar.d();
        a0 a0VarE = bVar.e();
        i(spannable, a0VarE.e(), iF, iD);
        k(spannable, a0VarE.g(), iF, iD);
        j(spannable, a0VarE.f(), a0VarE.c(), iF, iD);
        x(spannable, a0VarE.s(), iF, iD);
        o(spannable, a0VarE.k(), dVar, iF, iD);
        n(spannable, a0VarE.j(), iF, iD);
        p(spannable, a0VarE.u(), iF, iD);
        s(spannable, a0VarE.p(), iF, iD);
        h(spannable, a0VarE.d(), iF, iD);
        t(spannable, a0VarE.r(), iF, iD);
        l(spannable, a0VarE.h(), iF, iD);
    }

    public static final void w(Spannable spannable, g0 g0Var, List<d.b<a0>> list, w2.d dVar, r<? super t, ? super n2.i0, ? super e0, ? super f0, ? extends Typeface> rVar) {
        MetricAffectingSpan metricAffectingSpanA;
        m(spannable, g0Var, list, rVar);
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            d.b<a0> bVar = list.get(i10);
            int iF = bVar.f();
            int iD = bVar.d();
            if (iF >= 0 && iF < spannable.length() && iD > iF && iD <= spannable.length()) {
                v(spannable, bVar, dVar);
                if (c(bVar.e())) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                d.b<a0> bVar2 = list.get(i11);
                int iF2 = bVar2.f();
                int iD2 = bVar2.d();
                a0 a0VarE = bVar2.e();
                if (iF2 >= 0 && iF2 < spannable.length() && iD2 > iF2 && iD2 <= spannable.length() && (metricAffectingSpanA = a(a0VarE.o(), dVar)) != null) {
                    u(spannable, metricAffectingSpanA, iF2, iD2);
                }
            }
        }
    }

    public static final void x(Spannable spannable, j jVar, int i10, int i11) {
        if (jVar != null) {
            j.a aVar = j.f21569b;
            u(spannable, new l2.n(jVar.d(aVar.c()), jVar.d(aVar.a())), i10, i11);
        }
    }

    public static final void y(Spannable spannable, u2.o oVar, float f10, w2.d dVar) {
        if (oVar != null) {
            if ((w2.t.e(oVar.b(), u.e(0)) && w2.t.e(oVar.c(), u.e(0))) || u.f(oVar.b()) || u.f(oVar.c())) {
                return;
            }
            long jG = w2.t.g(oVar.b());
            v.a aVar = v.f22432b;
            float fH = 0.0f;
            float fO1 = v.g(jG, aVar.b()) ? dVar.o1(oVar.b()) : v.g(jG, aVar.a()) ? w2.t.h(oVar.b()) * f10 : 0.0f;
            long jG2 = w2.t.g(oVar.c());
            if (v.g(jG2, aVar.b())) {
                fH = dVar.o1(oVar.c());
            } else if (v.g(jG2, aVar.a())) {
                fH = w2.t.h(oVar.c()) * f10;
            }
            u(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fO1), (int) Math.ceil(fH)), 0, spannable.length());
        }
    }
}
