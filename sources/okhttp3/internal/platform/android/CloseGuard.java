package okhttp3.internal.platform.android;

import ae.j;
import ae.r;
import com.amazon.a.a.o.b;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class CloseGuard {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f17588d = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f17589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f17590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f17591c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final CloseGuard a() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod(b.au, new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new CloseGuard(method3, method2, method);
        }
    }

    public CloseGuard(Method method, Method method2, Method method3) {
        this.f17589a = method;
        this.f17590b = method2;
        this.f17591c = method3;
    }

    public final Object a(String str) {
        r.f(str, "closer");
        Method method = this.f17589a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = this.f17590b;
                r.c(method2);
                method2.invoke(objInvoke, str);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f17591c;
            r.c(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
