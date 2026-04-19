package d8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w implements y7.b<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ld.a<Executor> f9843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ld.a<e8.d> f9844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ld.a<x> f9845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ld.a<f8.b> f9846d;

    public w(ld.a<Executor> aVar, ld.a<e8.d> aVar2, ld.a<x> aVar3, ld.a<f8.b> aVar4) {
        this.f9843a = aVar;
        this.f9844b = aVar2;
        this.f9845c = aVar3;
        this.f9846d = aVar4;
    }

    public static w a(ld.a<Executor> aVar, ld.a<e8.d> aVar2, ld.a<x> aVar3, ld.a<f8.b> aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, e8.d dVar, x xVar, f8.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f9843a.get(), this.f9844b.get(), this.f9845c.get(), this.f9846d.get());
    }
}
