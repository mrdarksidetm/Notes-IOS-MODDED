package androidx.lifecycle;

import androidx.lifecycle.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static a f4299c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, C0100a> f4300a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f4301b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    @Deprecated
    static class C0100a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<g.a, List<b>> f4302a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<b, g.a> f4303b;

        C0100a(Map<b, g.a> map) {
            this.f4303b = map;
            for (Map.Entry<b, g.a> entry : map.entrySet()) {
                g.a value = entry.getValue();
                List<b> arrayList = this.f4302a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f4302a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<b> list, o4.e eVar, g.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(eVar, aVar, obj);
                }
            }
        }

        void a(o4.e eVar, g.a aVar, Object obj) {
            b(this.f4302a.get(aVar), eVar, aVar, obj);
            b(this.f4302a.get(g.a.ON_ANY), eVar, aVar, obj);
        }
    }

    @Deprecated
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f4305b;

        b(int i10, Method method) {
            this.f4304a = i10;
            this.f4305b = method;
            method.setAccessible(true);
        }

        void a(o4.e eVar, g.a aVar, Object obj) {
            try {
                int i10 = this.f4304a;
                if (i10 == 0) {
                    this.f4305b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f4305b.invoke(obj, eVar);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f4305b.invoke(obj, eVar, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4304a == bVar.f4304a && this.f4305b.getName().equals(bVar.f4305b.getName());
        }

        public int hashCode() {
            return (this.f4304a * 31) + this.f4305b.getName().hashCode();
        }
    }

    a() {
    }

    private C0100a a(Class<?> cls, Method[] methodArr) {
        int i10;
        C0100a c0100aC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0100aC = c(superclass)) != null) {
            map.putAll(c0100aC.f4303b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, g.a> entry : c(cls2).f4303b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            m mVar = (m) method.getAnnotation(m.class);
            if (mVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!o4.e.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                g.a aVarValue = mVar.value();
                if (parameterTypes.length > 1) {
                    if (!g.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != g.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        C0100a c0100a = new C0100a(map);
        this.f4300a.put(cls, c0100a);
        this.f4301b.put(cls, Boolean.valueOf(z10));
        return c0100a;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<b, g.a> map, b bVar, g.a aVar, Class<?> cls) {
        g.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f4305b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    C0100a c(Class<?> cls) {
        C0100a c0100a = this.f4300a.get(cls);
        return c0100a != null ? c0100a : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f4301b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((m) method.getAnnotation(m.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f4301b.put(cls, Boolean.FALSE);
        return false;
    }
}
