package c8;

import android.content.Context;
import d8.x;

/* JADX INFO: loaded from: classes.dex */
public final class i implements y7.b<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ld.a<Context> f6588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ld.a<e8.d> f6589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ld.a<d8.f> f6590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ld.a<g8.a> f6591d;

    public i(ld.a<Context> aVar, ld.a<e8.d> aVar2, ld.a<d8.f> aVar3, ld.a<g8.a> aVar4) {
        this.f6588a = aVar;
        this.f6589b = aVar2;
        this.f6590c = aVar3;
        this.f6591d = aVar4;
    }

    public static i a(ld.a<Context> aVar, ld.a<e8.d> aVar2, ld.a<d8.f> aVar3, ld.a<g8.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, e8.d dVar, d8.f fVar, g8.a aVar) {
        return (x) y7.d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f6588a.get(), this.f6589b.get(), this.f6590c.get(), this.f6591d.get());
    }
}
