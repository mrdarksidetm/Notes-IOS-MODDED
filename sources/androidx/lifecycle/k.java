package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f4336a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Class<?>, Integer> f4337b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, List<Constructor<? extends d>>> f4338c = new HashMap();

    private k() {
    }

    private final d a(Constructor<? extends d> constructor, Object obj) {
        try {
            d dVarNewInstance = constructor.newInstance(obj);
            ae.r.e(dVarNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return dVarNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends d> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            ae.r.e(name, "fullPackage");
            if (!(name.length() == 0)) {
                ae.r.e(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                ae.r.e(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            ae.r.e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(canonicalName);
            if (!(name.length() == 0)) {
                strC = name + com.amazon.a.a.o.c.a.b.f7490a + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            ae.r.d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String str) {
        ae.r.f(str, "className");
        return je.v.C(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f4337b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && o4.d.class.isAssignableFrom(cls);
    }

    public static final i f(Object obj) {
        ae.r.f(obj, "object");
        boolean z10 = obj instanceof i;
        boolean z11 = obj instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            return new c((DefaultLifecycleObserver) obj, (i) obj);
        }
        if (z11) {
            return new c((DefaultLifecycleObserver) obj, null);
        }
        if (z10) {
            return (i) obj;
        }
        Class<?> cls = obj.getClass();
        k kVar = f4336a;
        if (kVar.d(cls) != 2) {
            return new o(obj);
        }
        List<Constructor<? extends d>> list = f4338c.get(cls);
        ae.r.c(list);
        List<Constructor<? extends d>> list2 = list;
        if (list2.size() == 1) {
            return new v(kVar.a(list2.get(0), obj));
        }
        int size = list2.size();
        d[] dVarArr = new d[size];
        for (int i10 = 0; i10 < size; i10++) {
            dVarArr[i10] = f4336a.a(list2.get(i10), obj);
        }
        return new b(dVarArr);
    }

    private final int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends d> constructorB = b(cls);
        if (constructorB != null) {
            f4338c.put(cls, nd.t.d(constructorB));
            return 2;
        }
        if (a.f4299c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (e(superclass)) {
            ae.r.e(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends d>> list = f4338c.get(superclass);
            ae.r.c(list);
            arrayList = new ArrayList(list);
        }
        Class<?>[] interfaces = cls.getInterfaces();
        ae.r.e(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (e(cls2)) {
                ae.r.e(cls2, "intrface");
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends d>> list2 = f4338c.get(cls2);
                ae.r.c(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f4338c.put(cls, arrayList);
        return 2;
    }
}
