package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p<?> f3733a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p<?> f3734b = c();

    static p<?> a() {
        p<?> pVar = f3734b;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static p<?> b() {
        return f3733a;
    }

    private static p<?> c() {
        try {
            return (p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
