package sd;

import ae.r;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f20523a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f20524b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f20525c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f20526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f20527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f20528c;

        public a(Method method, Method method2, Method method3) {
            this.f20526a = method;
            this.f20527b = method2;
            this.f20528c = method3;
        }
    }

    private g() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f20525c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f20524b;
            f20525c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a aVar) {
        r.f(aVar, "continuation");
        a aVarA = f20525c;
        if (aVarA == null) {
            aVarA = a(aVar);
        }
        if (aVarA == f20524b) {
            return null;
        }
        Method method = aVarA.f20526a;
        Object objInvoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = aVarA.f20527b;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = aVarA.f20528c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
