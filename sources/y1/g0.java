package y1;

import java.util.Map;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public interface g0 extends n {

    public static final class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<y1.a, Integer> f23248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f23249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g0 f23250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ zd.l<t0.a, md.i0> f23251f;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Map<y1.a, Integer> map, g0 g0Var, zd.l<? super t0.a, md.i0> lVar) {
            this.f23249d = i10;
            this.f23250e = g0Var;
            this.f23251f = lVar;
            this.f23246a = i10;
            this.f23247b = i11;
            this.f23248c = map;
        }

        @Override // y1.f0
        public void a() {
            g0 g0Var = this.f23250e;
            if (g0Var instanceof a2.o0) {
                this.f23251f.invoke(((a2.o0) g0Var).R0());
            } else {
                this.f23251f.invoke(new a1(this.f23249d, this.f23250e.getLayoutDirection()));
            }
        }

        @Override // y1.f0
        public Map<y1.a, Integer> d() {
            return this.f23248c;
        }

        @Override // y1.f0
        public int getHeight() {
            return this.f23247b;
        }

        @Override // y1.f0
        public int getWidth() {
            return this.f23246a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ f0 z0(g0 g0Var, int i10, int i11, Map map, zd.l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = nd.r0.e();
        }
        return g0Var.J0(i10, i11, map, lVar);
    }

    default f0 J0(int i10, int i11, Map<y1.a, Integer> map, zd.l<? super t0.a, md.i0> lVar) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new a(i10, i11, map, this, lVar);
        }
        throw new IllegalStateException(("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }
}
