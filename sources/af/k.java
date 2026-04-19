package af;

import ye.e;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements we.b<Byte> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f774a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f775b = new g1("kotlin.Byte", e.b.f23980a);

    private k() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return Byte.valueOf(eVar.A());
    }

    public void b(ze.f fVar, byte b10) {
        ae.r.f(fVar, "encoder");
        fVar.l(b10);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f775b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((Number) obj).byteValue());
    }
}
