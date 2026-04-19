package af;

import ye.e;

/* JADX INFO: loaded from: classes2.dex */
public final class m1 implements we.b<Short> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f786a = new m1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f787b = new g1("kotlin.Short", e.h.f23986a);

    private m1() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return Short.valueOf(eVar.C());
    }

    public void b(ze.f fVar, short s10) {
        ae.r.f(fVar, "encoder");
        fVar.i(s10);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f787b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((Number) obj).shortValue());
    }
}
