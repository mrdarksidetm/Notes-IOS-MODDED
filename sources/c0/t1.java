package c0;

import c0.q;

/* JADX INFO: loaded from: classes.dex */
public final class t1<V extends q> implements m1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p1<V> f6202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w0 f6203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f6205d;

    private t1(p1<V> p1Var, w0 w0Var, long j10) {
        this.f6202a = p1Var;
        this.f6203b = w0Var;
        this.f6204c = ((long) (p1Var.e() + p1Var.f())) * 1000000;
        this.f6205d = j10 * 1000000;
    }

    public /* synthetic */ t1(p1 p1Var, w0 w0Var, long j10, ae.j jVar) {
        this(p1Var, w0Var, j10);
    }

    private final long h(long j10) {
        long j11 = this.f6205d;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f6204c;
        long j14 = j12 / j13;
        return (this.f6203b == w0.Restart || j14 % ((long) 2) == 0) ? j12 - (j14 * j13) : ((j14 + 1) * j13) - j12;
    }

    private final V i(long j10, V v10, V v11, V v12) {
        long j11 = this.f6205d;
        long j12 = j10 + j11;
        long j13 = this.f6204c;
        return j12 > j13 ? this.f6202a.g(j13 - j11, v10, v12, v11) : v11;
    }

    @Override // c0.m1
    public boolean a() {
        return true;
    }

    @Override // c0.m1
    public long b(V v10, V v11, V v12) {
        return Long.MAX_VALUE;
    }

    @Override // c0.m1
    public V d(long j10, V v10, V v11, V v12) {
        return this.f6202a.d(h(j10), v10, v11, i(j10, v10, v12, v11));
    }

    @Override // c0.m1
    public V g(long j10, V v10, V v11, V v12) {
        return this.f6202a.g(h(j10), v10, v11, i(j10, v10, v12, v11));
    }
}
