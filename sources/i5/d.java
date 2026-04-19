package i5;

import ae.r;
import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f12526a;

    private static final class a<T> implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final he.c<T> f12527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final zd.l<T, i0> f12528b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(he.c<T> cVar, zd.l<? super T, i0> lVar) {
            r.f(cVar, "clazz");
            r.f(lVar, "consumer");
            this.f12527a = cVar;
            this.f12528b = lVar;
        }

        private final boolean b(Method method, Object[] objArr) {
            if (r.b(method.getName(), "accept")) {
                if (objArr != null && objArr.length == 1) {
                    return true;
                }
            }
            return false;
        }

        private final boolean c(Method method, Object[] objArr) {
            if (r.b(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE)) {
                if (objArr != null && objArr.length == 1) {
                    return true;
                }
            }
            return false;
        }

        private final boolean d(Method method, Object[] objArr) {
            return r.b(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        private final boolean e(Method method, Object[] objArr) {
            return r.b(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        public final void a(T t10) {
            r.f(t10, "parameter");
            this.f12528b.invoke(t10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            r.f(obj, "obj");
            r.f(method, "method");
            if (b(method, objArr)) {
                a(he.d.a(this.f12527a, objArr != null ? objArr[0] : null));
                return i0.f15558a;
            }
            if (c(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (d(method, objArr)) {
                return Integer.valueOf(this.f12528b.hashCode());
            }
            if (e(method, objArr)) {
                return this.f12528b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    public interface b {
        void dispose();
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f12529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f12530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f12531c;

        c(Method method, Object obj, Object obj2) {
            this.f12529a = method;
            this.f12530b = obj;
            this.f12531c = obj2;
        }

        @Override // i5.d.b
        public void dispose() throws IllegalAccessException, InvocationTargetException {
            this.f12529a.invoke(this.f12530b, this.f12531c);
        }
    }

    public d(ClassLoader classLoader) {
        r.f(classLoader, "loader");
        this.f12526a = classLoader;
    }

    private final <T> Object a(he.c<T> cVar, zd.l<? super T, i0> lVar) {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f12526a, new Class[]{d()}, new a(cVar, lVar));
        r.e(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return objNewProxyInstance;
    }

    private final Class<?> d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f12526a.loadClass("java.util.function.Consumer");
        r.e(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }

    public final Class<?> b() {
        try {
            return d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <T> b c(Object obj, he.c<T> cVar, String str, String str2, Activity activity, zd.l<? super T, i0> lVar) throws IllegalAccessException, InvocationTargetException {
        r.f(obj, "obj");
        r.f(cVar, "clazz");
        r.f(str, "addMethodName");
        r.f(str2, "removeMethodName");
        r.f(activity, "activity");
        r.f(lVar, "consumer");
        Object objA = a(cVar, lVar);
        obj.getClass().getMethod(str, Activity.class, d()).invoke(obj, activity, objA);
        return new c(obj.getClass().getMethod(str2, d()), obj, objA);
    }
}
