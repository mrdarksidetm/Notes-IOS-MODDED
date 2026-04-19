package bf;

import cf.a0;
import ye.j;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements we.b<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f5845a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f5846b = ye.i.c("kotlinx.serialization.json.JsonNull", j.b.f24010a, new ye.f[0], null, 8, null);

    private t() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public s deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        k.g(eVar);
        if (eVar.w()) {
            throw new a0("Expected 'null' literal");
        }
        eVar.r();
        return s.INSTANCE;
    }

    @Override // we.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ze.f fVar, s sVar) {
        ae.r.f(fVar, "encoder");
        ae.r.f(sVar, "value");
        k.h(fVar);
        fVar.g();
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f5846b;
    }
}
