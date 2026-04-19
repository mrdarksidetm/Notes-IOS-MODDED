package e8;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements y7.b<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ld.a<g8.a> f10747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ld.a<g8.a> f10748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ld.a<e> f10749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ld.a<t0> f10750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ld.a<String> f10751e;

    public n0(ld.a<g8.a> aVar, ld.a<g8.a> aVar2, ld.a<e> aVar3, ld.a<t0> aVar4, ld.a<String> aVar5) {
        this.f10747a = aVar;
        this.f10748b = aVar2;
        this.f10749c = aVar3;
        this.f10750d = aVar4;
        this.f10751e = aVar5;
    }

    public static n0 a(ld.a<g8.a> aVar, ld.a<g8.a> aVar2, ld.a<e> aVar3, ld.a<t0> aVar4, ld.a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(g8.a aVar, g8.a aVar2, Object obj, Object obj2, ld.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f10747a.get(), this.f10748b.get(), this.f10749c.get(), this.f10750d.get(), this.f10751e);
    }
}
