package c0;

/* JADX INFO: loaded from: classes.dex */
public final class a1<T> implements e0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f5920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f5921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f5922c;

    public a1() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public a1(float f10, float f11, T t10) {
        this.f5920a = f10;
        this.f5921b = f11;
        this.f5922c = t10;
    }

    public /* synthetic */ a1(float f10, float f11, Object obj, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a1) {
            a1 a1Var = (a1) obj;
            if (a1Var.f5920a == this.f5920a) {
                if ((a1Var.f5921b == this.f5921b) && ae.r.b(a1Var.f5922c, this.f5922c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f() {
        return this.f5920a;
    }

    public final float g() {
        return this.f5921b;
    }

    public final T h() {
        return this.f5922c;
    }

    public int hashCode() {
        T t10 = this.f5922c;
        return ((((t10 != null ? t10.hashCode() : 0) * 31) + Float.hashCode(this.f5920a)) * 31) + Float.hashCode(this.f5921b);
    }

    @Override // c0.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public <V extends q> v1<V> a(j1<T, V> j1Var) {
        return new v1<>(this.f5920a, this.f5921b, j.b(j1Var, this.f5922c));
    }
}
