package af;

/* JADX INFO: loaded from: classes2.dex */
public final class b2 implements we.b<md.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f745a = new b2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f746b = e0.a("kotlin.UShort", xe.a.x(ae.k0.f717a));

    private b2() {
    }

    public short a(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return md.f0.b(eVar.F(getDescriptor()).C());
    }

    public void b(ze.f fVar, short s10) {
        ae.r.f(fVar, "encoder");
        fVar.z(getDescriptor()).i(s10);
    }

    @Override // we.a
    public /* bridge */ /* synthetic */ Object deserialize(ze.e eVar) {
        return md.f0.a(a(eVar));
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f746b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((md.f0) obj).l());
    }
}
