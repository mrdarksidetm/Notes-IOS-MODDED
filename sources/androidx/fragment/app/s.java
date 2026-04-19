package androidx.fragment.app;

import androidx.fragment.app.n;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z.c0<ClassLoader, z.c0<String, Class<?>>> f4228a = new z.c0<>();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return n.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        z.c0<ClassLoader, z.c0<String, Class<?>>> c0Var = f4228a;
        z.c0<String, Class<?>> c0Var2 = c0Var.get(classLoader);
        if (c0Var2 == null) {
            c0Var2 = new z.c0<>();
            c0Var.put(classLoader, c0Var2);
        }
        Class<?> cls = c0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0Var2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends n> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new n.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new n.l("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    public n a(ClassLoader classLoader, String str) {
        throw null;
    }
}
