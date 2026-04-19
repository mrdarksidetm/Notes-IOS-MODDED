package i0;

import java.util.Map;
import nd.r0;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w f12144a = new w(null, 0, false, 0.0f, new a(), false, nd.u.m(), 0, 0, 0, false, e0.r.Vertical, 0, 0);

    public static final class a implements y1.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<y1.a, Integer> f12147c = r0.e();

        a() {
        }

        @Override // y1.f0
        public void a() {
        }

        @Override // y1.f0
        public Map<y1.a, Integer> d() {
            return this.f12147c;
        }

        @Override // y1.f0
        public int getHeight() {
            return this.f12146b;
        }

        @Override // y1.f0
        public int getWidth() {
            return this.f12145a;
        }
    }

    static final class b extends ae.s implements zd.a<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f12148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11) {
            super(0);
            this.f12148a = i10;
            this.f12149b = i11;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return new h0(this.f12148a, this.f12149b);
        }
    }

    public static final h0 b(int i10, int i11, t0.l lVar, int i12, int i13) {
        lVar.e(29186956);
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (t0.o.I()) {
            t0.o.U(29186956, i12, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:67)");
        }
        Object[] objArr = new Object[0];
        c1.j<h0, ?> jVarA = h0.f12099z.a();
        lVar.e(-707393359);
        boolean zH = lVar.h(i10) | lVar.h(i11);
        Object objF = lVar.f();
        if (zH || objF == t0.l.f20813a.a()) {
            objF = new b(i10, i11);
            lVar.E(objF);
        }
        lVar.K();
        h0 h0Var = (h0) c1.b.b(objArr, jVarA, null, (zd.a) objF, lVar, 72, 4);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return h0Var;
    }
}
