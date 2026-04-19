package j0;

/* JADX INFO: loaded from: classes.dex */
public interface d<T> {

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f13632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f13633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T f13634c;

        public a(int i10, int i11, T t10) {
            this.f13632a = i10;
            this.f13633b = i11;
            this.f13634c = t10;
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i10).toString());
            }
            if (i11 > 0) {
                return;
            }
            throw new IllegalArgumentException(("size should be >0, but was " + i11).toString());
        }

        public final int a() {
            return this.f13633b;
        }

        public final int b() {
            return this.f13632a;
        }

        public final T c() {
            return this.f13634c;
        }
    }

    int a();

    void b(int i10, int i11, zd.l<? super a<? extends T>, md.i0> lVar);

    a<T> get(int i10);
}
