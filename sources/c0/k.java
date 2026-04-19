package c0;

import c0.q;
import t0.k3;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class k<T, V extends q> implements p3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j1<T, V> f6083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.k1 f6084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private V f6085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f6086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f6087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6088f;

    public k(j1<T, V> j1Var, T t10, V v10, long j10, long j11, boolean z10) {
        V v11;
        this.f6083a = j1Var;
        this.f6084b = k3.e(t10, null, 2, null);
        this.f6085c = (v10 == null || (v11 = (V) r.e(v10)) == null) ? (V) l.e(j1Var, t10) : v11;
        this.f6086d = j10;
        this.f6087e = j11;
        this.f6088f = z10;
    }

    public /* synthetic */ k(j1 j1Var, Object obj, q qVar, long j10, long j11, boolean z10, int i10, ae.j jVar) {
        this(j1Var, obj, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }

    public final long c() {
        return this.f6087e;
    }

    public final long f() {
        return this.f6086d;
    }

    @Override // t0.p3
    public T getValue() {
        return this.f6084b.getValue();
    }

    public final j1<T, V> i() {
        return this.f6083a;
    }

    public final T j() {
        return this.f6083a.b().invoke(this.f6085c);
    }

    public final V l() {
        return this.f6085c;
    }

    public final boolean m() {
        return this.f6088f;
    }

    public final void n(long j10) {
        this.f6087e = j10;
    }

    public final void p(long j10) {
        this.f6086d = j10;
    }

    public final void q(boolean z10) {
        this.f6088f = z10;
    }

    public void s(T t10) {
        this.f6084b.setValue(t10);
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + j() + ", isRunning=" + this.f6088f + ", lastFrameTimeNanos=" + this.f6086d + ", finishedTimeNanos=" + this.f6087e + ')';
    }

    public final void v(V v10) {
        this.f6085c = v10;
    }
}
