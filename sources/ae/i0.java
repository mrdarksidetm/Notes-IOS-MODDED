package ae;

/* JADX INFO: loaded from: classes2.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j0 f714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.c[] f715b;

    static {
        j0 j0Var = null;
        try {
            j0Var = (j0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (j0Var == null) {
            j0Var = new j0();
        }
        f714a = j0Var;
        f715b = new he.c[0];
    }

    public static he.f a(kotlin.jvm.internal.b bVar) {
        return f714a.a(bVar);
    }

    public static he.c b(Class cls) {
        return f714a.b(cls);
    }

    public static he.e c(Class cls) {
        return f714a.c(cls, "");
    }

    public static he.g d(u uVar) {
        return f714a.d(uVar);
    }

    public static he.h e(y yVar) {
        return f714a.e(yVar);
    }

    public static he.i f(a0 a0Var) {
        return f714a.f(a0Var);
    }

    public static String g(n nVar) {
        return f714a.g(nVar);
    }

    public static String h(s sVar) {
        return f714a.h(sVar);
    }
}
