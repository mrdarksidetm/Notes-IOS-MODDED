package g8;

/* JADX INFO: loaded from: classes.dex */
public final class c implements y7.b<g8.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f11492a = new c();
    }

    public static c a() {
        return a.f11492a;
    }

    public static g8.a b() {
        return (g8.a) y7.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ld.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g8.a get() {
        return b();
    }
}
