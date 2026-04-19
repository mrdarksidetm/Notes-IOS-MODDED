package cf;

/* JADX INFO: loaded from: classes2.dex */
final class n0 extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bf.b f6970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f6971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6972h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(bf.a aVar, bf.b bVar) {
        super(aVar, bVar, null);
        ae.r.f(aVar, "json");
        ae.r.f(bVar, "value");
        this.f6970f = bVar;
        this.f6971g = s0().size();
        this.f6972h = -1;
    }

    @Override // af.r0
    protected String a0(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return String.valueOf(i10);
    }

    @Override // cf.c
    protected bf.h e0(String str) {
        ae.r.f(str, "tag");
        return s0().get(Integer.parseInt(str));
    }

    @Override // cf.c
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public bf.b s0() {
        return this.f6970f;
    }

    @Override // ze.c
    public int z(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        int i10 = this.f6972h;
        if (i10 >= this.f6971g - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f6972h = i11;
        return i11;
    }
}
