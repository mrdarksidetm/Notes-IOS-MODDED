package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i0 f3657a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i0 f3658b = new j0();

    static i0 a() {
        return f3657a;
    }

    static i0 b() {
        return f3658b;
    }

    private static i0 c() {
        try {
            return (i0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
