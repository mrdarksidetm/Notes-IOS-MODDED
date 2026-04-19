package v1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f21923c;

    private f(long j10, long j11) {
        this.f21921a = j10;
        this.f21922b = j11;
        this.f21923c = k1.f.f14338b.c();
    }

    private f(long j10, long j11, long j12) {
        this(j10, j11, (ae.j) null);
        this.f21923c = j12;
    }

    public /* synthetic */ f(long j10, long j11, long j12, ae.j jVar) {
        this(j10, j11, j12);
    }

    public /* synthetic */ f(long j10, long j11, ae.j jVar) {
        this(j10, j11);
    }

    public final long a() {
        return this.f21923c;
    }

    public final long b() {
        return this.f21922b;
    }

    public final long c() {
        return this.f21921a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f21921a + ", position=" + ((Object) k1.f.v(this.f21922b)) + ')';
    }
}
