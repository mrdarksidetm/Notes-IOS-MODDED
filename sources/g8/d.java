package g8;

/* JADX INFO: loaded from: classes.dex */
public final class d implements y7.b<g8.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f11493a = new d();
    }

    public static d a() {
        return a.f11493a;
    }

    public static g8.a c() {
        return (g8.a) y7.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g8.a get() {
        return c();
    }
}
