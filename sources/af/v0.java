package af;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 implements we.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f838a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f839b = u0.f828a;

    private v0() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        throw new we.g("'kotlin.Nothing' does not have instances");
    }

    @Override // we.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ze.f fVar, Void r32) {
        ae.r.f(fVar, "encoder");
        ae.r.f(r32, "value");
        throw new we.g("'kotlin.Nothing' cannot be serialized");
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f839b;
    }
}
