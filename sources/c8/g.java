package c8;

/* JADX INFO: loaded from: classes.dex */
public final class g implements y7.b<d8.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ld.a<g8.a> f6587a;

    public g(ld.a<g8.a> aVar) {
        this.f6587a = aVar;
    }

    public static d8.f a(g8.a aVar) {
        return (d8.f) y7.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(ld.a<g8.a> aVar) {
        return new g(aVar);
    }

    @Override // ld.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d8.f get() {
        return a(this.f6587a.get());
    }
}
