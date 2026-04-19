package af;

/* JADX INFO: loaded from: classes2.dex */
public final class w0<T> implements we.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final we.b<T> f847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye.f f848b;

    public w0(we.b<T> bVar) {
        ae.r.f(bVar, "serializer");
        this.f847a = bVar;
        this.f848b = new i1(bVar.getDescriptor());
    }

    @Override // we.a
    public T deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return eVar.w() ? (T) eVar.v(this.f847a) : (T) eVar.r();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && w0.class == obj.getClass() && ae.r.b(this.f847a, ((w0) obj).f847a);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return this.f848b;
    }

    public int hashCode() {
        return this.f847a.hashCode();
    }

    @Override // we.h
    public void serialize(ze.f fVar, T t10) {
        ae.r.f(fVar, "encoder");
        if (t10 == null) {
            fVar.g();
        } else {
            fVar.u();
            fVar.D(this.f847a, t10);
        }
    }
}
