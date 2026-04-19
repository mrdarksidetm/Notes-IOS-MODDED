package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v0 f3747c = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, z0<?>> f3749b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a1 f3748a = new f0();

    private v0() {
    }

    public static v0 a() {
        return f3747c;
    }

    public <T> void b(T t10, y0 y0Var, o oVar) {
        e(t10).b(t10, y0Var, oVar);
    }

    public z0<?> c(Class<?> cls, z0<?> z0Var) {
        y.b(cls, "messageType");
        y.b(z0Var, com.amazon.device.simplesignin.a.a.a.E);
        return this.f3749b.putIfAbsent(cls, z0Var);
    }

    public <T> z0<T> d(Class<T> cls) {
        y.b(cls, "messageType");
        z0<T> z0Var = (z0) this.f3749b.get(cls);
        if (z0Var != null) {
            return z0Var;
        }
        z0<T> z0VarA = this.f3748a.a(cls);
        z0<T> z0Var2 = (z0<T>) c(cls, z0VarA);
        return z0Var2 != null ? z0Var2 : z0VarA;
    }

    public <T> z0<T> e(T t10) {
        return d(t10.getClass());
    }
}
