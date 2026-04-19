package e0;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10316a = a.f10317a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f10317a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c0.i<Float> f10318b = c0.j.g(0.0f, 0.0f, null, 7, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final f f10319c = new C0242a();

        /* JADX INFO: renamed from: e0.f$a$a, reason: collision with other inner class name */
        public static final class C0242a implements f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final c0.i<Float> f10320b = a.f10317a.b();

            C0242a() {
            }

            @Override // e0.f
            public float a(float f10, float f11, float f12) {
                float f13 = f11 + f10;
                if ((f10 >= 0.0f && f13 <= f12) || (f10 < 0.0f && f13 > f12)) {
                    return 0.0f;
                }
                float f14 = f13 - f12;
                return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
            }

            @Override // e0.f
            public c0.i<Float> b() {
                return this.f10320b;
            }
        }

        private a() {
        }

        public final f a() {
            return f10319c;
        }

        public final c0.i<Float> b() {
            return f10318b;
        }
    }

    float a(float f10, float f11, float f12);

    default c0.i<Float> b() {
        return f10316a.b();
    }
}
