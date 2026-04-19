package a2;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f356a = new y0();

    private static final class a implements y1.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y1.m f357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f359c;

        public a(y1.m mVar, c cVar, d dVar) {
            this.f357a = mVar;
            this.f358b = cVar;
            this.f359c = dVar;
        }

        @Override // y1.m
        public int B(int i10) {
            return this.f357a.B(i10);
        }

        @Override // y1.m
        public int E(int i10) {
            return this.f357a.E(i10);
        }

        @Override // y1.d0
        public y1.t0 I(long j10) {
            if (this.f359c == d.Width) {
                return new b(this.f358b == c.Max ? this.f357a.E(w2.b.m(j10)) : this.f357a.B(w2.b.m(j10)), w2.b.i(j10) ? w2.b.m(j10) : 32767);
            }
            return new b(w2.b.j(j10) ? w2.b.n(j10) : 32767, this.f358b == c.Max ? this.f357a.k(w2.b.n(j10)) : this.f357a.W(w2.b.n(j10)));
        }

        @Override // y1.m
        public int W(int i10) {
            return this.f357a.W(i10);
        }

        @Override // y1.m
        public Object f() {
            return this.f357a.f();
        }

        @Override // y1.m
        public int k(int i10) {
            return this.f357a.k(i10);
        }
    }

    private static final class b extends y1.t0 {
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

    public interface e {
        y1.f0 d(y1.g0 g0Var, y1.d0 d0Var, long j10);
    }

    private y0() {
    }

    public final int a(e eVar, y1.n nVar, y1.m mVar, int i10) {
        return eVar.d(new y1.q(nVar, nVar.getLayoutDirection()), new a(mVar, c.Max, d.Height), w2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int b(e eVar, y1.n nVar, y1.m mVar, int i10) {
        return eVar.d(new y1.q(nVar, nVar.getLayoutDirection()), new a(mVar, c.Max, d.Width), w2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int c(e eVar, y1.n nVar, y1.m mVar, int i10) {
        return eVar.d(new y1.q(nVar, nVar.getLayoutDirection()), new a(mVar, c.Min, d.Height), w2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int d(e eVar, y1.n nVar, y1.m mVar, int i10) {
        return eVar.d(new y1.q(nVar, nVar.getLayoutDirection()), new a(mVar, c.Min, d.Width), w2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
