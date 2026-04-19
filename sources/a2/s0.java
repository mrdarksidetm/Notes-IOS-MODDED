package a2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f277c = v0.d.f21872d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0.d<T> f278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.a<md.i0> f279b;

    public s0(v0.d<T> dVar, zd.a<md.i0> aVar) {
        this.f278a = dVar;
        this.f279b = aVar;
    }

    public final void a(int i10, T t10) {
        this.f278a.a(i10, t10);
        this.f279b.invoke();
    }

    public final List<T> b() {
        return this.f278a.h();
    }

    public final void c() {
        this.f278a.i();
        this.f279b.invoke();
    }

    public final T d(int i10) {
        return this.f278a.n()[i10];
    }

    public final int e() {
        return this.f278a.o();
    }

    public final v0.d<T> f() {
        return this.f278a;
    }

    public final T g(int i10) {
        T tX = this.f278a.x(i10);
        this.f279b.invoke();
        return tX;
    }
}
