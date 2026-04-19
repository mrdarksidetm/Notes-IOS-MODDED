package w7;

/* JADX INFO: loaded from: classes.dex */
public final class v implements y7.b<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ld.a<g8.a> f22587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ld.a<g8.a> f22588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ld.a<c8.e> f22589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ld.a<d8.r> f22590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ld.a<d8.v> f22591e;

    public v(ld.a<g8.a> aVar, ld.a<g8.a> aVar2, ld.a<c8.e> aVar3, ld.a<d8.r> aVar4, ld.a<d8.v> aVar5) {
        this.f22587a = aVar;
        this.f22588b = aVar2;
        this.f22589c = aVar3;
        this.f22590d = aVar4;
        this.f22591e = aVar5;
    }

    public static v a(ld.a<g8.a> aVar, ld.a<g8.a> aVar2, ld.a<c8.e> aVar3, ld.a<d8.r> aVar4, ld.a<d8.v> aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(g8.a aVar, g8.a aVar2, c8.e eVar, d8.r rVar, d8.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f22587a.get(), this.f22588b.get(), this.f22589c.get(), this.f22590d.get(), this.f22591e.get());
    }
}
