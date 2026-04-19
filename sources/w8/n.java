package w8;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static n f22647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o f22648c = new o(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f22649a;

    private n() {
    }

    public static synchronized n b() {
        if (f22647b == null) {
            f22647b = new n();
        }
        return f22647b;
    }

    public o a() {
        return this.f22649a;
    }

    public final synchronized void c(o oVar) {
        if (oVar == null) {
            this.f22649a = f22648c;
            return;
        }
        o oVar2 = this.f22649a;
        if (oVar2 == null || oVar2.B() < oVar.B()) {
            this.f22649a = oVar;
        }
    }
}
