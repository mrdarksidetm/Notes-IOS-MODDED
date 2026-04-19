package e8;

/* JADX INFO: loaded from: classes.dex */
public final class g implements y7.b<String> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f10722a = new g();
    }

    public static g a() {
        return a.f10722a;
    }

    public static String b() {
        return (String) y7.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ld.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
