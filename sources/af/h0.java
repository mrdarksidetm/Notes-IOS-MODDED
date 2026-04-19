package af;

import ye.e;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements we.b<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f765a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f766b = new g1("kotlin.Int", e.f.f23984a);

    private h0() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return Integer.valueOf(eVar.q());
    }

    public void b(ze.f fVar, int i10) {
        ae.r.f(fVar, "encoder");
        fVar.A(i10);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f766b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((Number) obj).intValue());
    }
}
