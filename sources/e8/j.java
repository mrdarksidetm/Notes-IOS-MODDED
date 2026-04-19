package e8;

/* JADX INFO: loaded from: classes.dex */
public final class j implements y7.b<e> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j f10729a = new j();
    }

    public static j a() {
        return a.f10729a;
    }

    public static e c() {
        return (e) y7.d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c();
    }
}
