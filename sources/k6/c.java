package k6;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f14405a;

        public a(int i10) {
            super(null);
            this.f14405a = i10;
            if (!(i10 > 0)) {
                throw new IllegalArgumentException("px must be > 0.".toString());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f14405a == ((a) obj).f14405a;
        }

        public int hashCode() {
            return this.f14405a;
        }

        public String toString() {
            return String.valueOf(this.f14405a);
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14406a = new b();

        private b() {
            super(null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    private c() {
    }

    public /* synthetic */ c(ae.j jVar) {
        this();
    }
}
