package y1;

/* JADX INFO: loaded from: classes.dex */
final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f23256a = new i0();

    private static final class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f23257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f23258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f23259c;

        public a(m mVar, c cVar, d dVar) {
            this.f23257a = mVar;
            this.f23258b = cVar;
            this.f23259c = dVar;
        }

        @Override // y1.m
        public int B(int i10) {
            return this.f23257a.B(i10);
        }

        @Override // y1.m
        public int E(int i10) {
            return this.f23257a.E(i10);
        }

        @Override // y1.d0
        public t0 I(long j10) {
            if (this.f23259c == d.Width) {
                return new b(this.f23258b == c.Max ? this.f23257a.E(w2.b.m(j10)) : this.f23257a.B(w2.b.m(j10)), w2.b.i(j10) ? w2.b.m(j10) : 32767);
            }
            return new b(w2.b.j(j10) ? w2.b.n(j10) : 32767, this.f23258b == c.Max ? this.f23257a.k(w2.b.n(j10)) : this.f23257a.W(w2.b.n(j10)));
        }

        @Override // y1.m
        public int W(int i10) {
            return this.f23257a.W(i10);
        }

        @Override // y1.m
        public Object f() {
            return this.f23257a.f();
        }

        @Override // y1.m
        public int k(int i10) {
            return this.f23257a.k(i10);
        }
    }

    private static final class b extends t0 {
        public b(int i10, int i11) {
            w0(w2.q.a(i10, i11));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y1.t0
        public void v0(long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
        }
    }

    private enum c {
        Min,
        Max
    }

    private enum d {
        Width,
        Height
    }

    private i0() {
    }

    public final int a(v vVar, n nVar, m mVar, int i10) {
        return vVar.d(new q(nVar, nVar.getLayoutDirection()), new a(mVar, c.Max, d.Height), w2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int b(v vVar, n nVar, m mVar, int i10) {
        return vVar.d(new q(nVar, nVar.getLayoutDirection()), new a(mVar, c.Max, d.Width), w2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int c(v vVar, n nVar, m mVar, int i10) {
        return vVar.d(new q(nVar, nVar.getLayoutDirection()), new a(mVar, c.Min, d.Height), w2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int d(v vVar, n nVar, m mVar, int i10) {
        return vVar.d(new q(nVar, nVar.getLayoutDirection()), new a(mVar, c.Min, d.Width), w2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
