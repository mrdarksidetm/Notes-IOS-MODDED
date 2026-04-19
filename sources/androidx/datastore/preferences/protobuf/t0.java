package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r0 f3741a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r0 f3742b = new s0();

    static r0 a() {
        return f3741a;
    }

    static r0 b() {
        return f3742b;
    }

    private static r0 c() {
        try {
            return (r0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
