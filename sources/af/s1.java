package af;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 implements we.b<md.y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f818a = new s1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f819b = e0.a("kotlin.UByte", xe.a.r(ae.e.f700a));

    private s1() {
    }

    public byte a(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return md.y.b(eVar.F(getDescriptor()).A());
    }

    public void b(ze.f fVar, byte b10) {
        ae.r.f(fVar, "encoder");
        fVar.z(getDescriptor()).l(b10);
    }

    @Override // we.a
    public /* bridge */ /* synthetic */ Object deserialize(ze.e eVar) {
        return md.y.a(a(eVar));
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f819b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((md.y) obj).l());
    }
}
