package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
class v implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v f3746a = new v();

    private v() {
    }

    public static v c() {
        return f3746a;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public l0 a(Class<?> cls) {
        if (!w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (l0) w.x(cls.asSubclass(w.class)).q();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public boolean b(Class<?> cls) {
        return w.class.isAssignableFrom(cls);
    }
}
