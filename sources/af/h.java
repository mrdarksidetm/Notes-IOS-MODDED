package af;

import ye.e;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements we.b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f763a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f764b = new g1("kotlin.Boolean", e.a.f23979a);

    private h() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return Boolean.valueOf(eVar.h());
    }

    public void b(ze.f fVar, boolean z10) {
        ae.r.f(fVar, "encoder");
        fVar.n(z10);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f764b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((Boolean) obj).booleanValue());
    }
}
