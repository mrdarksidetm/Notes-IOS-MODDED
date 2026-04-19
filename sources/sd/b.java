package sd;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements qd.d<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20522a = new b();

    private b() {
    }

    @Override // qd.d
    public qd.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // qd.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
