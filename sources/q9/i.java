package q9;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f19013b = new i(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f19014a;

    private i(Object obj) {
        this.f19014a = obj;
    }

    public static h b(Object obj) {
        if (obj != null) {
            return new i(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // q9.k
    public final Object a() {
        return this.f19014a;
    }
}
