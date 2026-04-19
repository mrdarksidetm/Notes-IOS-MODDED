package wb;

/* JADX INFO: loaded from: classes2.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f22794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Runnable f22795b;

    k(j jVar, Runnable runnable) {
        this.f22794a = jVar;
        this.f22795b = runnable;
    }

    public Integer a() {
        j jVar = this.f22794a;
        if (jVar != null) {
            return Integer.valueOf(jVar.a());
        }
        return null;
    }

    public boolean b() {
        j jVar = this.f22794a;
        return jVar != null && jVar.b();
    }
}
