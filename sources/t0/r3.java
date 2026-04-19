package t0;

/* JADX INFO: loaded from: classes.dex */
public final class r3<T> implements p3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f20925a;

    public r3(T t10) {
        this.f20925a = t10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3) && ae.r.b(this.f20925a, ((r3) obj).f20925a);
    }

    @Override // t0.p3
    public T getValue() {
        return this.f20925a;
    }

    public int hashCode() {
        T t10 = this.f20925a;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f20925a + ')';
    }
}
