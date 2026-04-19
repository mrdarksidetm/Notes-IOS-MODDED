package m1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f15184b = new d(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f15185c = new C0347a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f15186d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f15187e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f15188a;

    /* JADX INFO: renamed from: m1.a$a, reason: collision with other inner class name */
    public static final class C0347a extends a {
        C0347a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    public static final class b extends a {
        b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    public static final class c extends a {
        c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(ae.j jVar) {
            this();
        }

        public final a a() {
            return a.f15185c;
        }
    }

    private a(float[] fArr) {
        this.f15188a = fArr;
    }

    public /* synthetic */ a(float[] fArr, ae.j jVar) {
        this(fArr);
    }

    public final float[] b() {
        return this.f15188a;
    }
}
