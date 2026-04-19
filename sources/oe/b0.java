package oe;

/* JADX INFO: loaded from: classes2.dex */
public interface b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16466a = a.f16467a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f16467a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final b0 f16468b = new c0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b0 f16469c = new d0();

        private a() {
        }

        public static /* synthetic */ b0 b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.a(j10, j11);
        }

        public final b0 a(long j10, long j11) {
            return new e0(j10, j11);
        }

        public final b0 c() {
            return f16468b;
        }

        public final b0 d() {
            return f16469c;
        }
    }

    e<z> a(f0<Integer> f0Var);
}
