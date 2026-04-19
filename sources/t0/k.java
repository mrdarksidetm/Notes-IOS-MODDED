package t0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20811a;

    public k(String str) {
        this.f20811a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f20811a;
    }
}
