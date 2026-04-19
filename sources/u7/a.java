package u7;

/* JADX INFO: loaded from: classes.dex */
final class a<T> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f21737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f21738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f21739c;

    a(Integer num, T t10, d dVar) {
        this.f21737a = num;
        if (t10 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f21738b = t10;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f21739c = dVar;
    }

    @Override // u7.c
    public Integer a() {
        return this.f21737a;
    }

    @Override // u7.c
    public T b() {
        return this.f21738b;
    }

    @Override // u7.c
    public d c() {
        return this.f21739c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f21737a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f21738b.equals(cVar.b()) && this.f21739c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f21737a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f21738b.hashCode()) * 1000003) ^ this.f21739c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f21737a + ", payload=" + this.f21738b + ", priority=" + this.f21739c + "}";
    }
}
