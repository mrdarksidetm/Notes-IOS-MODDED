package h0;

import b2.w0;
import b2.x0;
import java.util.Map;
import t0.k1;
import t0.k3;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
final class l extends x0 implements y1.v, z1.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f11682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.p<o0, w2.d, Integer> f11683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k1 f11684e;

    static final class a extends ae.s implements zd.l<t0.a, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11685a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
        }
    }

    static final class b extends ae.s implements zd.l<t0.a, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y1.t0 f11686a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y1.t0 t0Var) {
            super(1);
            this.f11686a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.j(aVar, this.f11686a, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(o0 o0Var, zd.l<? super w0, md.i0> lVar, zd.p<? super o0, ? super w2.d, Integer> pVar) {
        super(lVar);
        this.f11682c = o0Var;
        this.f11683d = pVar;
        this.f11684e = k3.e(o0Var, null, 2, null);
    }

    private final o0 a() {
        return (o0) this.f11684e.getValue();
    }

    private final void c(o0 o0Var) {
        this.f11684e.setValue(o0Var);
    }

    @Override // y1.v
    public y1.f0 d(y1.g0 g0Var, y1.d0 d0Var, long j10) {
        int iQ0;
        Map map;
        zd.l bVar;
        int i10;
        Object obj;
        y1.g0 g0Var2;
        int i11;
        int iIntValue = this.f11683d.invoke(a(), g0Var).intValue();
        if (iIntValue == 0) {
            iQ0 = 0;
            i11 = 0;
            map = null;
            bVar = a.f11685a;
            i10 = 4;
            obj = null;
            g0Var2 = g0Var;
        } else {
            y1.t0 t0VarI = d0Var.I(w2.b.e(j10, 0, 0, iIntValue, iIntValue, 3, null));
            iQ0 = t0VarI.q0();
            map = null;
            bVar = new b(t0VarI);
            i10 = 4;
            obj = null;
            g0Var2 = g0Var;
            i11 = iIntValue;
        }
        return y1.g0.z0(g0Var2, iQ0, i11, map, bVar, i10, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return ae.r.b(this.f11682c, lVar.f11682c) && ae.r.b(this.f11683d, lVar.f11683d);
    }

    public int hashCode() {
        return (this.f11682c.hashCode() * 31) + this.f11683d.hashCode();
    }

    @Override // z1.d
    public void q(z1.k kVar) {
        c(q0.c(this.f11682c, (o0) kVar.p(r0.a())));
    }
}
