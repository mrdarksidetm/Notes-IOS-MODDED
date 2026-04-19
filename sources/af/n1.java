package af;

import ye.e;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 implements we.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f790a = new n1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f791b = new g1("kotlin.String", e.i.f23987a);

    private n1() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return eVar.s();
    }

    @Override // we.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ze.f fVar, String str) {
        ae.r.f(fVar, "encoder");
        ae.r.f(str, "value");
        fVar.F(str);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f791b;
    }
}
