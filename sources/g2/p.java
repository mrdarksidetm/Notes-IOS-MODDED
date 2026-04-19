package g2;

import a2.f0;
import a2.n1;
import a2.o1;
import a2.u0;
import a2.w0;
import androidx.compose.ui.e;
import java.util.ArrayList;
import java.util.List;
import md.i0;
import nd.c0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e.c f11363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f11365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f11366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p f11368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f11369g;

    static final class a extends ae.s implements zd.l<x, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f11370a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(1);
            this.f11370a = iVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(x xVar) {
            invoke2(xVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(x xVar) {
            v.y(xVar, this.f11370a.n());
        }
    }

    static final class b extends ae.s implements zd.l<x, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11371a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f11371a = str;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(x xVar) {
            invoke2(xVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(x xVar) {
            v.t(xVar, this.f11371a);
        }
    }

    public static final class c extends e.c implements n1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ zd.l<x, i0> f11372n;

        /* JADX WARN: Multi-variable type inference failed */
        c(zd.l<? super x, i0> lVar) {
            this.f11372n = lVar;
        }

        @Override // a2.n1
        public void U(x xVar) {
            this.f11372n.invoke(xVar);
        }
    }

    static final class d extends ae.s implements zd.l<f0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f11373a = new d();

        d() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(f0 f0Var) {
            l lVarG = f0Var.G();
            return Boolean.valueOf(lVarG != null && lVarG.u());
        }
    }

    static final class e extends ae.s implements zd.l<f0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f11374a = new e();

        e() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(f0 f0Var) {
            l lVarG = f0Var.G();
            return Boolean.valueOf(lVarG != null && lVarG.u());
        }
    }

    static final class f extends ae.s implements zd.l<f0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f11375a = new f();

        f() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(f0 f0Var) {
            return Boolean.valueOf(f0Var.h0().q(w0.a(8)));
        }
    }

    public p(e.c cVar, boolean z10, f0 f0Var, l lVar) {
        this.f11363a = cVar;
        this.f11364b = z10;
        this.f11365c = f0Var;
        this.f11366d = lVar;
        this.f11369g = f0Var.m0();
    }

    private final void A(l lVar) {
        if (this.f11366d.t()) {
            return;
        }
        List listC = C(this, false, 1, null);
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) listC.get(i10);
            if (!pVar.x()) {
                lVar.v(pVar.f11366d);
                pVar.A(lVar);
            }
        }
    }

    public static /* synthetic */ List C(p pVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return pVar.B(z10);
    }

    private final void b(List<p> list) {
        i iVarH = q.h(this);
        if (iVarH != null && this.f11366d.u() && (!list.isEmpty())) {
            list.add(c(iVarH, new a(iVarH)));
        }
        l lVar = this.f11366d;
        s sVar = s.f11377a;
        if (lVar.f(sVar.c()) && (!list.isEmpty()) && this.f11366d.u()) {
            List list2 = (List) m.a(this.f11366d, sVar.c());
            String str = list2 != null ? (String) c0.a0(list2) : null;
            if (str != null) {
                list.add(0, c(null, new b(str)));
            }
        }
    }

    private final p c(i iVar, zd.l<? super x, i0> lVar) {
        l lVar2 = new l();
        lVar2.x(false);
        lVar2.w(false);
        lVar.invoke(lVar2);
        p pVar = new p(new c(lVar), false, new f0(true, iVar != null ? q.i(this) : q.e(this)), lVar2);
        pVar.f11367e = true;
        pVar.f11368f = this;
        return pVar;
    }

    private final void d(f0 f0Var, List<p> list) {
        v0.d<f0> dVarR0 = f0Var.r0();
        int iO = dVarR0.o();
        if (iO > 0) {
            int i10 = 0;
            f0[] f0VarArrN = dVarR0.n();
            do {
                f0 f0Var2 = f0VarArrN[i10];
                if (f0Var2.G0()) {
                    if (f0Var2.h0().q(w0.a(8))) {
                        list.add(q.a(f0Var2, this.f11364b));
                    } else {
                        d(f0Var2, list);
                    }
                }
                i10++;
            } while (i10 < iO);
        }
    }

    private final List<p> f(List<p> list) {
        List listC = C(this, false, 1, null);
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) listC.get(i10);
            if (pVar.x()) {
                list.add(pVar);
            } else if (!pVar.f11366d.t()) {
                pVar.f(list);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List g(p pVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return pVar.f(list);
    }

    private final List<p> l(boolean z10, boolean z11) {
        return (z10 || !this.f11366d.t()) ? x() ? g(this, null, 1, null) : B(z11) : nd.u.m();
    }

    private final boolean x() {
        return this.f11364b && this.f11366d.u();
    }

    public final List<p> B(boolean z10) {
        if (this.f11367e) {
            return nd.u.m();
        }
        ArrayList arrayList = new ArrayList();
        d(this.f11365c, arrayList);
        if (z10) {
            b(arrayList);
        }
        return arrayList;
    }

    public final p a() {
        return new p(this.f11363a, true, this.f11365c, this.f11366d);
    }

    public final u0 e() {
        if (this.f11367e) {
            p pVarQ = q();
            if (pVarQ != null) {
                return pVarQ.e();
            }
            return null;
        }
        a2.j jVarG = q.g(this.f11365c);
        if (jVarG == null) {
            jVarG = this.f11363a;
        }
        return a2.k.h(jVarG, w0.a(8));
    }

    public final k1.h h() {
        y1.r rVarU1;
        p pVarQ = q();
        if (pVarQ == null) {
            return k1.h.f14343e.a();
        }
        u0 u0VarE = e();
        if (u0VarE != null) {
            if (!u0VarE.v()) {
                u0VarE = null;
            }
            if (u0VarE != null && (rVarU1 = u0VarE.U1()) != null) {
                return y1.r.M(a2.k.h(pVarQ.f11363a, w0.a(8)), rVarU1, false, 2, null);
            }
        }
        return k1.h.f14343e.a();
    }

    public final k1.h i() {
        k1.h hVarB;
        u0 u0VarE = e();
        if (u0VarE != null) {
            if (!u0VarE.v()) {
                u0VarE = null;
            }
            if (u0VarE != null && (hVarB = y1.s.b(u0VarE)) != null) {
                return hVarB;
            }
        }
        return k1.h.f14343e.a();
    }

    public final k1.h j() {
        k1.h hVarC;
        u0 u0VarE = e();
        if (u0VarE != null) {
            if (!u0VarE.v()) {
                u0VarE = null;
            }
            if (u0VarE != null && (hVarC = y1.s.c(u0VarE)) != null) {
                return hVarC;
            }
        }
        return k1.h.f14343e.a();
    }

    public final List<p> k() {
        return l(!this.f11364b, false);
    }

    public final l m() {
        if (!x()) {
            return this.f11366d;
        }
        l lVarN = this.f11366d.n();
        A(lVarN);
        return lVarN;
    }

    public final int n() {
        return this.f11369g;
    }

    public final y1.t o() {
        return this.f11365c;
    }

    public final f0 p() {
        return this.f11365c;
    }

    public final p q() {
        p pVar = this.f11368f;
        if (pVar != null) {
            return pVar;
        }
        f0 f0VarF = this.f11364b ? q.f(this.f11365c, e.f11374a) : null;
        if (f0VarF == null) {
            f0VarF = q.f(this.f11365c, f.f11375a);
        }
        if (f0VarF == null) {
            return null;
        }
        return q.a(f0VarF, this.f11364b);
    }

    public final long r() {
        u0 u0VarE = e();
        if (u0VarE != null) {
            if (!u0VarE.v()) {
                u0VarE = null;
            }
            if (u0VarE != null) {
                return y1.s.e(u0VarE);
            }
        }
        return k1.f.f14338b.c();
    }

    public final List<p> s() {
        return l(false, true);
    }

    public final long t() {
        u0 u0VarE = e();
        return u0VarE != null ? u0VarE.a() : w2.p.f22421b.a();
    }

    public final k1.h u() {
        a2.j jVarG;
        if (!this.f11366d.u() || (jVarG = q.g(this.f11365c)) == null) {
            jVarG = this.f11363a;
        }
        return o1.c(jVarG.L0(), o1.a(this.f11366d));
    }

    public final l v() {
        return this.f11366d;
    }

    public final boolean w() {
        return this.f11367e;
    }

    public final boolean y() {
        u0 u0VarE = e();
        if (u0VarE != null) {
            return u0VarE.q2();
        }
        return false;
    }

    public final boolean z() {
        return !this.f11367e && s().isEmpty() && q.f(this.f11365c, d.f11373a) == null;
    }
}
