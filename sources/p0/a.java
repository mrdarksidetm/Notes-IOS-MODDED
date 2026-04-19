package p0;

import ae.s;
import android.view.View;
import android.view.ViewGroup;
import l1.b0;
import l1.j0;
import le.n0;
import md.i0;
import t0.k1;
import t0.k2;
import t0.k3;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends m implements k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f17762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p3<j0> f17763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p3<f> f17764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewGroup f17765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f17766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k1 f17767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k1 f17768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f17769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final zd.a<i0> f17771l;

    /* JADX INFO: renamed from: p0.a$a, reason: collision with other inner class name */
    static final class C0377a extends s implements zd.a<i0> {
        C0377a() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a.this.p(!r0.l());
        }
    }

    private a(boolean z10, float f10, p3<j0> p3Var, p3<f> p3Var2, ViewGroup viewGroup) {
        super(z10, p3Var2);
        this.f17761b = z10;
        this.f17762c = f10;
        this.f17763d = p3Var;
        this.f17764e = p3Var2;
        this.f17765f = viewGroup;
        this.f17767h = k3.e(null, null, 2, null);
        this.f17768i = k3.e(Boolean.TRUE, null, 2, null);
        this.f17769j = k1.l.f14359b.b();
        this.f17770k = -1;
        this.f17771l = new C0377a();
    }

    public /* synthetic */ a(boolean z10, float f10, p3 p3Var, p3 p3Var2, ViewGroup viewGroup, ae.j jVar) {
        this(z10, f10, p3Var, p3Var2, viewGroup);
    }

    private final void k() {
        i iVar = this.f17766g;
        if (iVar != null) {
            iVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l() {
        return ((Boolean) this.f17768i.getValue()).booleanValue();
    }

    private final i m() {
        i iVar = this.f17766g;
        if (iVar != null) {
            ae.r.c(iVar);
            return iVar;
        }
        int i10 = 0;
        int childCount = this.f17765f.getChildCount();
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f17765f.getChildAt(i10);
            if (childAt instanceof i) {
                this.f17766g = (i) childAt;
                break;
            }
            i10++;
        }
        if (this.f17766g == null) {
            i iVar2 = new i(this.f17765f.getContext());
            this.f17765f.addView(iVar2);
            this.f17766g = iVar2;
        }
        i iVar3 = this.f17766g;
        ae.r.c(iVar3);
        return iVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final l n() {
        return (l) this.f17767h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(boolean z10) {
        this.f17768i.setValue(Boolean.valueOf(z10));
    }

    private final void q(l lVar) {
        this.f17767h.setValue(lVar);
    }

    @Override // d0.z
    public void a(n1.c cVar) {
        this.f17769j = cVar.c();
        this.f17770k = Float.isNaN(this.f17762c) ? ce.c.d(h.a(cVar, this.f17761b, cVar.c())) : cVar.a1(this.f17762c);
        long jE = this.f17763d.getValue().E();
        float fD = this.f17764e.getValue().d();
        cVar.u1();
        f(cVar, this.f17762c, jE);
        b0 b0VarD = cVar.M0().d();
        l();
        l lVarN = n();
        if (lVarN != null) {
            lVarN.f(cVar.c(), this.f17770k, jE, fD);
            lVarN.draw(l1.c.d(b0VarD));
        }
    }

    @Override // t0.k2
    public void b() {
        k();
    }

    @Override // t0.k2
    public void c() {
        k();
    }

    @Override // t0.k2
    public void d() {
    }

    @Override // p0.m
    public void e(g0.p pVar, n0 n0Var) {
        l lVarB = m().b(this);
        lVarB.b(pVar, this.f17761b, this.f17769j, this.f17770k, this.f17763d.getValue().E(), this.f17764e.getValue().d(), this.f17771l);
        q(lVarB);
    }

    @Override // p0.m
    public void g(g0.p pVar) {
        l lVarN = n();
        if (lVarN != null) {
            lVarN.e();
        }
    }

    public final void o() {
        q(null);
    }
}
