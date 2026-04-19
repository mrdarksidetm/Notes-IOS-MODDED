package af;

import ye.e;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements we.b<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f820a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f821b = new g1("kotlin.Double", e.d.f23982a);

    private t() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return Double.valueOf(eVar.H());
    }

    public void b(ze.f fVar, double d10) {
        ae.r.f(fVar, "encoder");
        fVar.h(d10);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f821b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((Number) obj).doubleValue());
    }
}
