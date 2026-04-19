package u8;

/* JADX INFO: loaded from: classes.dex */
public final class m extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t8.d f21745a;

    public m(t8.d dVar) {
        this.f21745a = dVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f21745a));
    }
}
