package x7;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j implements y7.b<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ld.a<Context> f23069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ld.a<g8.a> f23070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ld.a<g8.a> f23071c;

    public j(ld.a<Context> aVar, ld.a<g8.a> aVar2, ld.a<g8.a> aVar3) {
        this.f23069a = aVar;
        this.f23070b = aVar2;
        this.f23071c = aVar3;
    }

    public static j a(ld.a<Context> aVar, ld.a<g8.a> aVar2, ld.a<g8.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, g8.a aVar, g8.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f23069a.get(), this.f23070b.get(), this.f23071c.get());
    }
}
