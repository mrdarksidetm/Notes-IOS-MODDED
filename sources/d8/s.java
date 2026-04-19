package d8;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s implements y7.b<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ld.a<Context> f9828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ld.a<x7.e> f9829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ld.a<e8.d> f9830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ld.a<x> f9831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ld.a<Executor> f9832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ld.a<f8.b> f9833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ld.a<g8.a> f9834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ld.a<g8.a> f9835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ld.a<e8.c> f9836i;

    public s(ld.a<Context> aVar, ld.a<x7.e> aVar2, ld.a<e8.d> aVar3, ld.a<x> aVar4, ld.a<Executor> aVar5, ld.a<f8.b> aVar6, ld.a<g8.a> aVar7, ld.a<g8.a> aVar8, ld.a<e8.c> aVar9) {
        this.f9828a = aVar;
        this.f9829b = aVar2;
        this.f9830c = aVar3;
        this.f9831d = aVar4;
        this.f9832e = aVar5;
        this.f9833f = aVar6;
        this.f9834g = aVar7;
        this.f9835h = aVar8;
        this.f9836i = aVar9;
    }

    public static s a(ld.a<Context> aVar, ld.a<x7.e> aVar2, ld.a<e8.d> aVar3, ld.a<x> aVar4, ld.a<Executor> aVar5, ld.a<f8.b> aVar6, ld.a<g8.a> aVar7, ld.a<g8.a> aVar8, ld.a<e8.c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, x7.e eVar, e8.d dVar, x xVar, Executor executor, f8.b bVar, g8.a aVar, g8.a aVar2, e8.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f9828a.get(), this.f9829b.get(), this.f9830c.get(), this.f9831d.get(), this.f9832e.get(), this.f9833f.get(), this.f9834g.get(), this.f9835h.get(), this.f9836i.get());
    }
}
