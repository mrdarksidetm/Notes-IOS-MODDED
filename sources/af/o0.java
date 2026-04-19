package af;

import ye.e;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements we.b<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f794a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f795b = new g1("kotlin.Long", e.g.f23985a);

    private o0() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return Long.valueOf(eVar.u());
    }

    public void b(ze.f fVar, long j10) {
        ae.r.f(fVar, "encoder");
        fVar.C(j10);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f795b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }
}
