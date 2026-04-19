package a2;

import java.util.Map;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends y1.t0 implements y1.g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t0.a f247h = y1.u0.a(this);

    public static final class a implements y1.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<y1.a, Integer> f250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.l<t0.a, md.i0> f251d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ o0 f252e;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Map<y1.a, Integer> map, zd.l<? super t0.a, md.i0> lVar, o0 o0Var) {
            this.f248a = i10;
            this.f249b = i11;
            this.f250c = map;
            this.f251d = lVar;
            this.f252e = o0Var;
        }

        @Override // y1.f0
        public void a() {
            this.f251d.invoke(this.f252e.R0());
        }

        @Override // y1.f0
        public Map<y1.a, Integer> d() {
            return this.f250c;
        }

        @Override // y1.f0
        public int getHeight() {
            return this.f249b;
        }

        @Override // y1.f0
        public int getWidth() {
            return this.f248a;
        }
    }

    public abstract int A0(y1.a aVar);

    @Override // y1.n
    public boolean C0() {
        return false;
    }

    public final int E0(y1.a aVar) {
        int iA0;
        if (L0() && (iA0 = A0(aVar)) != Integer.MIN_VALUE) {
            return iA0 + w2.n.k(c0());
        }
        return Integer.MIN_VALUE;
    }

    public abstract o0 I0();

    @Override // y1.g0
    public y1.f0 J0(int i10, int i11, Map<y1.a, Integer> map, zd.l<? super t0.a, md.i0> lVar) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new a(i10, i11, map, lVar, this);
        }
        throw new IllegalStateException(("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    public abstract boolean L0();

    public abstract y1.f0 N0();

    public final t0.a R0() {
        return this.f247h;
    }

    public abstract long W0();

    protected final void Z0(u0 u0Var) {
        a2.a aVarD;
        u0 u0VarE2 = u0Var.e2();
        boolean zB = ae.r.b(u0VarE2 != null ? u0VarE2.Y1() : null, u0Var.Y1());
        b bVarT1 = u0Var.T1();
        if (zB) {
            b bVarS = bVarT1.s();
            if (bVarS == null || (aVarD = bVarS.d()) == null) {
                return;
            }
        } else {
            aVarD = bVarT1.d();
        }
        aVarD.m();
    }

    public final boolean c1() {
        return this.f246g;
    }

    public final boolean i1() {
        return this.f245f;
    }

    public abstract void m1();

    public final void n1(boolean z10) {
        this.f246g = z10;
    }

    public final void p1(boolean z10) {
        this.f245f = z10;
    }
}
