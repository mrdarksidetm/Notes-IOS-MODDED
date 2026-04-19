package c0;

import c0.q;

/* JADX INFO: loaded from: classes.dex */
public final class w1<V extends q> implements p1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f6244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r1<V> f6245d;

    public w1(int i10, int i11, b0 b0Var) {
        this.f6242a = i10;
        this.f6243b = i11;
        this.f6244c = b0Var;
        this.f6245d = new r1<>(new i0(f(), e(), b0Var));
    }

    @Override // c0.m1
    public V d(long j10, V v10, V v11, V v12) {
        return (V) this.f6245d.d(j10, v10, v11, v12);
    }

    @Override // c0.p1
    public int e() {
        return this.f6243b;
    }

    @Override // c0.p1
    public int f() {
        return this.f6242a;
    }

    @Override // c0.m1
    public V g(long j10, V v10, V v11, V v12) {
        return (V) this.f6245d.g(j10, v10, v11, v12);
    }
}
