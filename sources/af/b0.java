package af;

import ye.e;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements we.b<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f743a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f744b = new g1("kotlin.Float", e.C0490e.f23983a);

    private b0() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return Float.valueOf(eVar.E());
    }

    public void b(ze.f fVar, float f10) {
        ae.r.f(fVar, "encoder");
        fVar.q(f10);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f744b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((Number) obj).floatValue());
    }
}
