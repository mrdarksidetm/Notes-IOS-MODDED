package af;

import ye.e;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements we.b<ke.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f826a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f827b = new g1("kotlin.time.Duration", e.i.f23987a);

    private u() {
    }

    public long a(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return ke.a.f14459b.c(eVar.s());
    }

    public void b(ze.f fVar, long j10) {
        ae.r.f(fVar, "encoder");
        fVar.F(ke.a.J(j10));
    }

    @Override // we.a
    public /* bridge */ /* synthetic */ Object deserialize(ze.e eVar) {
        return ke.a.j(a(eVar));
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f827b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((ke.a) obj).N());
    }
}
