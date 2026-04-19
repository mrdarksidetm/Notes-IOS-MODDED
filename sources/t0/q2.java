package t0;

/* JADX INFO: loaded from: classes.dex */
public final class q2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f20907a;

    private /* synthetic */ q2(l lVar) {
        this.f20907a = lVar;
    }

    public static final /* synthetic */ q2 a(l lVar) {
        return new q2(lVar);
    }

    public static <T> l b(l lVar) {
        return lVar;
    }

    public static boolean c(l lVar, Object obj) {
        return (obj instanceof q2) && ae.r.b(lVar, ((q2) obj).f());
    }

    public static int d(l lVar) {
        return lVar.hashCode();
    }

    public static String e(l lVar) {
        return "SkippableUpdater(composer=" + lVar + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f20907a, obj);
    }

    public final /* synthetic */ l f() {
        return this.f20907a;
    }

    public int hashCode() {
        return d(this.f20907a);
    }

    public String toString() {
        return e(this.f20907a);
    }
}
