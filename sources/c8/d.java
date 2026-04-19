package c8;

import d8.x;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements y7.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ld.a<Executor> f6582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ld.a<x7.e> f6583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ld.a<x> f6584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ld.a<e8.d> f6585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ld.a<f8.b> f6586e;

    public d(ld.a<Executor> aVar, ld.a<x7.e> aVar2, ld.a<x> aVar3, ld.a<e8.d> aVar4, ld.a<f8.b> aVar5) {
        this.f6582a = aVar;
        this.f6583b = aVar2;
        this.f6584c = aVar3;
        this.f6585d = aVar4;
        this.f6586e = aVar5;
    }

    public static d a(ld.a<Executor> aVar, ld.a<x7.e> aVar2, ld.a<x> aVar3, ld.a<e8.d> aVar4, ld.a<f8.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, x7.e eVar, x xVar, e8.d dVar, f8.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f6582a.get(), this.f6583b.get(), this.f6584c.get(), this.f6585d.get(), this.f6586e.get());
    }
}
