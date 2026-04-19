package h0;

import h0.b;
import java.util.List;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements y1.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f11627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.e f11628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b.m f11629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f11630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i0 f11631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f11632f;

    static final class a extends ae.s implements zd.l<t0.a, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0 f11633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f11634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y1.g0 f11635c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0 d0Var, b0 b0Var, y1.g0 g0Var) {
            super(1);
            this.f11633a = d0Var;
            this.f11634b = b0Var;
            this.f11635c = g0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            this.f11633a.f(aVar, this.f11634b, 0, this.f11635c.getLayoutDirection());
        }
    }

    private c0(v vVar, b.e eVar, b.m mVar, float f10, i0 i0Var, k kVar) {
        this.f11627a = vVar;
        this.f11628b = eVar;
        this.f11629c = mVar;
        this.f11630d = f10;
        this.f11631e = i0Var;
        this.f11632f = kVar;
    }

    public /* synthetic */ c0(v vVar, b.e eVar, b.m mVar, float f10, i0 i0Var, k kVar, ae.j jVar) {
        this(vVar, eVar, mVar, f10, i0Var, kVar);
    }

    @Override // y1.e0
    public y1.f0 a(y1.g0 g0Var, List<? extends y1.d0> list, long j10) throws Throwable {
        int iB;
        int iE;
        d0 d0Var = new d0(this.f11627a, this.f11628b, this.f11629c, this.f11630d, this.f11631e, this.f11632f, list, new y1.t0[list.size()], null);
        b0 b0VarE = d0Var.e(g0Var, j10, 0, list.size());
        if (this.f11627a == v.Horizontal) {
            iB = b0VarE.e();
            iE = b0VarE.b();
        } else {
            iB = b0VarE.b();
            iE = b0VarE.e();
        }
        return y1.g0.z0(g0Var, iB, iE, null, new a(d0Var, b0VarE, g0Var), 4, null);
    }

    @Override // y1.e0
    public int b(y1.n nVar, List<? extends y1.m> list, int i10) {
        return ((Number) a0.a(this.f11627a).invoke(list, Integer.valueOf(i10), Integer.valueOf(nVar.a1(this.f11630d)))).intValue();
    }

    @Override // y1.e0
    public int c(y1.n nVar, List<? extends y1.m> list, int i10) {
        return ((Number) a0.b(this.f11627a).invoke(list, Integer.valueOf(i10), Integer.valueOf(nVar.a1(this.f11630d)))).intValue();
    }

    @Override // y1.e0
    public int d(y1.n nVar, List<? extends y1.m> list, int i10) {
        return ((Number) a0.c(this.f11627a).invoke(list, Integer.valueOf(i10), Integer.valueOf(nVar.a1(this.f11630d)))).intValue();
    }

    @Override // y1.e0
    public int e(y1.n nVar, List<? extends y1.m> list, int i10) {
        return ((Number) a0.d(this.f11627a).invoke(list, Integer.valueOf(i10), Integer.valueOf(nVar.a1(this.f11630d)))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f11627a == c0Var.f11627a && ae.r.b(this.f11628b, c0Var.f11628b) && ae.r.b(this.f11629c, c0Var.f11629c) && w2.h.o(this.f11630d, c0Var.f11630d) && this.f11631e == c0Var.f11631e && ae.r.b(this.f11632f, c0Var.f11632f);
    }

    public int hashCode() {
        int iHashCode = this.f11627a.hashCode() * 31;
        b.e eVar = this.f11628b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        b.m mVar = this.f11629c;
        return ((((((iHashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31) + w2.h.p(this.f11630d)) * 31) + this.f11631e.hashCode()) * 31) + this.f11632f.hashCode();
    }

    public String toString() {
        return "RowColumnMeasurePolicy(orientation=" + this.f11627a + ", horizontalArrangement=" + this.f11628b + ", verticalArrangement=" + this.f11629c + ", arrangementSpacing=" + ((Object) w2.h.q(this.f11630d)) + ", crossAxisSize=" + this.f11631e + ", crossAxisAlignment=" + this.f11632f + ')';
    }
}
