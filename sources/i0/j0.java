package i0;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    public static final class a implements j0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f12157a;

        a(h0 h0Var) {
            this.f12157a = h0Var;
        }

        @Override // j0.e0
        public boolean a() {
            return this.f12157a.a();
        }

        @Override // j0.e0
        public int c() {
            return this.f12157a.n();
        }

        @Override // j0.e0
        public g2.b d() {
            return new g2.b(-1, -1);
        }

        @Override // j0.e0
        public Object f(int i10, qd.d<? super md.i0> dVar) {
            Object objD = h0.D(this.f12157a, i10, 0, dVar, 2, null);
            return objD == rd.d.e() ? objD : md.i0.f15558a;
        }

        @Override // j0.e0
        public int g() {
            return this.f12157a.m();
        }

        @Override // j0.e0
        public Object h(float f10, qd.d<? super md.i0> dVar) {
            Object objB = e0.w.b(this.f12157a, f10, null, dVar, 2, null);
            return objB == rd.d.e() ? objB : md.i0.f15558a;
        }
    }

    public static final j0.e0 a(h0 h0Var, boolean z10, t0.l lVar, int i10) {
        lVar.e(-1247008005);
        if (t0.o.I()) {
            t0.o.U(-1247008005, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        lVar.e(511388516);
        boolean zN = lVar.N(boolValueOf) | lVar.N(h0Var);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = new a(h0Var);
            lVar.E(objF);
        }
        lVar.K();
        a aVar = (a) objF;
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return aVar;
    }
}
