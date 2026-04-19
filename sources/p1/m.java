package p1;

import k1.l;
import l1.k0;
import l1.v0;
import l1.w0;
import md.i0;
import t0.k1;
import t0.k3;

/* JADX INFO: loaded from: classes.dex */
public final class m extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p1.c f18020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f18021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p1.a f18023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zd.a<i0> f18024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k1 f18025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k0 f18026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k1 f18027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f18028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f18029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f18030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zd.l<n1.f, i0> f18031m;

    static final class a extends ae.s implements zd.l<l, i0> {
        a() {
            super(1);
        }

        public final void a(l lVar) {
            m.this.h();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(l lVar) {
            a(lVar);
            return i0.f15558a;
        }
    }

    static final class b extends ae.s implements zd.l<n1.f, i0> {
        b() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(n1.f fVar) {
            invoke2(fVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(n1.f fVar) {
            p1.c cVarL = m.this.l();
            m mVar = m.this;
            float f10 = mVar.f18029k;
            float f11 = mVar.f18030l;
            long jC = k1.f.f14338b.c();
            n1.d dVarM0 = fVar.M0();
            long jC2 = dVarM0.c();
            dVarM0.d().h();
            dVarM0.a().f(f10, f11, jC);
            cVarL.a(fVar);
            dVarM0.d().p();
            dVarM0.b(jC2);
        }
    }

    static final class c extends ae.s implements zd.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f18034a = new c();

        c() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public m(p1.c cVar) {
        super(null);
        this.f18020b = cVar;
        cVar.d(new a());
        this.f18021c = "";
        this.f18022d = true;
        this.f18023e = new p1.a();
        this.f18024f = c.f18034a;
        this.f18025g = k3.e(null, null, 2, null);
        l.a aVar = k1.l.f14359b;
        this.f18027i = k3.e(k1.l.c(aVar.b()), null, 2, null);
        this.f18028j = aVar.a();
        this.f18029k = 1.0f;
        this.f18030l = 1.0f;
        this.f18031m = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.f18022d = true;
        this.f18024f.invoke();
    }

    @Override // p1.l
    public void a(n1.f fVar) {
        i(fVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(n1.f r12, float r13, l1.k0 r14) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.m.i(n1.f, float, l1.k0):void");
    }

    public final int j() {
        v0 v0VarD = this.f18023e.d();
        return v0VarD != null ? v0VarD.b() : w0.f14626b.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k0 k() {
        return (k0) this.f18025g.getValue();
    }

    public final p1.c l() {
        return this.f18020b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long m() {
        return ((k1.l) this.f18027i.getValue()).m();
    }

    public final void n(k0 k0Var) {
        this.f18025g.setValue(k0Var);
    }

    public final void o(zd.a<i0> aVar) {
        this.f18024f = aVar;
    }

    public final void p(String str) {
        this.f18021c = str;
    }

    public final void q(long j10) {
        this.f18027i.setValue(k1.l.c(j10));
    }

    public String toString() {
        String str = "Params: \tname: " + this.f18021c + "\n\tviewportWidth: " + k1.l.i(m()) + "\n\tviewportHeight: " + k1.l.g(m()) + "\n";
        ae.r.e(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
