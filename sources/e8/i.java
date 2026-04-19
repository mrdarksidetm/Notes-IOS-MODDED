package e8;

/* JADX INFO: loaded from: classes.dex */
public final class i implements y7.b<Integer> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f10725a = new i();
    }

    public static i a() {
        return a.f10725a;
    }

    public static int c() {
        return f.c();
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
