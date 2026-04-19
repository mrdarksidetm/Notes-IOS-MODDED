package ge;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends j implements f<Long> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11551e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final l f11552f = new l(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public l(long j10, long j11) {
        super(j10, j11, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (l() != lVar.l() || n() != lVar.n()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (l() ^ (l() >>> 32))) + (n() ^ (n() >>> 32)));
    }

    @Override // ge.f
    public boolean isEmpty() {
        return l() > n();
    }

    public boolean r(long j10) {
        return l() <= j10 && j10 <= n();
    }

    @Override // ge.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Long f() {
        return Long.valueOf(n());
    }

    @Override // ge.f
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Long d() {
        return Long.valueOf(l());
    }

    public String toString() {
        return l() + ".." + n();
    }
}
