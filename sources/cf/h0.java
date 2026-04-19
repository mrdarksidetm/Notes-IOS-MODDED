package cf;

/* JADX INFO: loaded from: classes2.dex */
final class h0 extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bf.h f6950f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(bf.a aVar, bf.h hVar) {
        super(aVar, hVar, null);
        ae.r.f(aVar, "json");
        ae.r.f(hVar, "value");
        this.f6950f = hVar;
        X("primitive");
    }

    @Override // cf.c
    protected bf.h e0(String str) {
        ae.r.f(str, "tag");
        if (str == "primitive") {
            return s0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // cf.c
    public bf.h s0() {
        return this.f6950f;
    }

    @Override // ze.c
    public int z(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        return 0;
    }
}
