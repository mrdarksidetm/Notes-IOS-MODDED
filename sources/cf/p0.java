package cf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class p0 extends l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final bf.u f6974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<String> f6975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f6976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6977n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(bf.a aVar, bf.u uVar) {
        super(aVar, uVar, null, null, 12, null);
        ae.r.f(aVar, "json");
        ae.r.f(uVar, "value");
        this.f6974k = uVar;
        List<String> listC0 = nd.c0.C0(s0().keySet());
        this.f6975l = listC0;
        this.f6976m = listC0.size() * 2;
        this.f6977n = -1;
    }

    @Override // cf.l0, af.r0
    protected String a0(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return this.f6975l.get(i10 / 2);
    }

    @Override // cf.l0, cf.c, ze.c
    public void d(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
    }

    @Override // cf.l0, cf.c
    protected bf.h e0(String str) {
        ae.r.f(str, "tag");
        return this.f6977n % 2 == 0 ? bf.i.c(str) : (bf.h) nd.r0.f(s0(), str);
    }

    @Override // cf.l0, cf.c
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public bf.u s0() {
        return this.f6974k;
    }

    @Override // cf.l0, ze.c
    public int z(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        int i10 = this.f6977n;
        if (i10 >= this.f6976m - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f6977n = i11;
        return i11;
    }
}
