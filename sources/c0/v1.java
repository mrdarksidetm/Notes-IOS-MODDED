package c0;

import c0.q;

/* JADX INFO: loaded from: classes.dex */
public final class v1<V extends q> implements q1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f6227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f6228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ r1<V> f6229c;

    public v1(float f10, float f11, V v10) {
        this(f10, f11, n1.c(v10, f10, f11));
    }

    private v1(float f10, float f11, s sVar) {
        this.f6227a = f10;
        this.f6228b = f11;
        this.f6229c = new r1<>(sVar);
    }

    @Override // c0.q1, c0.m1
    public boolean a() {
        return this.f6229c.a();
    }

    @Override // c0.m1
    public long b(V v10, V v11, V v12) {
        return this.f6229c.b(v10, v11, v12);
    }

    @Override // c0.m1
    public V c(V v10, V v11, V v12) {
        return (V) this.f6229c.c(v10, v11, v12);
    }

    @Override // c0.m1
    public V d(long j10, V v10, V v11, V v12) {
        return (V) this.f6229c.d(j10, v10, v11, v12);
    }

    @Override // c0.m1
    public V g(long j10, V v10, V v11, V v12) {
        return (V) this.f6229c.g(j10, v10, v11, v12);
    }
}
