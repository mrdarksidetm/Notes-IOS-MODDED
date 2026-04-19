package af;

/* JADX INFO: loaded from: classes2.dex */
public final class y1 implements we.b<md.c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f864a = new y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f865b = e0.a("kotlin.ULong", xe.a.w(ae.t.f722a));

    private y1() {
    }

    public long a(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return md.c0.b(eVar.F(getDescriptor()).u());
    }

    public void b(ze.f fVar, long j10) {
        ae.r.f(fVar, "encoder");
        fVar.z(getDescriptor()).C(j10);
    }

    @Override // we.a
    public /* bridge */ /* synthetic */ Object deserialize(ze.e eVar) {
        return md.c0.a(a(eVar));
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f865b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((md.c0) obj).m());
    }
}
