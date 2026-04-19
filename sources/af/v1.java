package af;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 implements we.b<md.a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f840a = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f841b = e0.a("kotlin.UInt", xe.a.v(ae.q.f721a));

    private v1() {
    }

    public int a(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return md.a0.b(eVar.F(getDescriptor()).q());
    }

    public void b(ze.f fVar, int i10) {
        ae.r.f(fVar, "encoder");
        fVar.z(getDescriptor()).A(i10);
    }

    @Override // we.a
    public /* bridge */ /* synthetic */ Object deserialize(ze.e eVar) {
        return md.a0.a(a(eVar));
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f841b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((md.a0) obj).l());
    }
}
