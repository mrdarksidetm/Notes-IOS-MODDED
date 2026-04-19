package n2;

import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15881b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u0 f15882c = new n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j0 f15883d = new j0("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j0 f15884e = new j0("serif", "FontFamily.Serif");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j0 f15885f = new j0("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j0 f15886g = new j0("cursive", "FontFamily.Cursive");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f15887a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final j0 a() {
            return t.f15886g;
        }

        public final u0 b() {
            return t.f15882c;
        }

        public final j0 c() {
            return t.f15885f;
        }

        public final j0 d() {
            return t.f15883d;
        }

        public final j0 e() {
            return t.f15884e;
        }
    }

    public interface b {
        static /* synthetic */ p3 b(b bVar, t tVar, i0 i0Var, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i12 & 1) != 0) {
                tVar = null;
            }
            if ((i12 & 2) != 0) {
                i0Var = i0.f15808b.g();
            }
            if ((i12 & 4) != 0) {
                i10 = e0.f15784b.b();
            }
            if ((i12 & 8) != 0) {
                i11 = f0.f15789b.a();
            }
            return bVar.a(tVar, i0Var, i10, i11);
        }

        p3<Object> a(t tVar, i0 i0Var, int i10, int i11);
    }

    private t(boolean z10) {
        this.f15887a = z10;
    }

    public /* synthetic */ t(boolean z10, ae.j jVar) {
        this(z10);
    }
}
