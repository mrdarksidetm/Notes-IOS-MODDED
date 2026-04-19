package h5;

import ae.r;
import ae.s;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f11829a;

    /* JADX INFO: renamed from: h5.a$a, reason: collision with other inner class name */
    static final class C0287a extends s implements zd.a<Class<?>> {
        C0287a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke() throws ClassNotFoundException {
            Class<?> clsLoadClass = a.this.f11829a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            r.e(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            return clsLoadClass;
        }
    }

    static final class b extends s implements zd.a<Boolean> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            boolean z10 = false;
            Method declaredMethod = a.this.d().getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class<?> clsC = a.this.c();
            r5.a aVar = r5.a.f19183a;
            r.e(declaredMethod, "getWindowExtensionsMethod");
            if (aVar.c(declaredMethod, clsC) && aVar.d(declaredMethod)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public a(ClassLoader classLoader) {
        r.f(classLoader, "loader");
        this.f11829a = classLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f11829a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        r.e(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return clsLoadClass;
    }

    private final boolean e() {
        return r5.a.f19183a.a(new C0287a());
    }

    public final Class<?> c() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f11829a.loadClass("androidx.window.extensions.WindowExtensions");
        r.e(clsLoadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        return clsLoadClass;
    }

    public final boolean f() {
        return e() && r5.a.e("WindowExtensionsProvider#getWindowExtensions is not valid", new b());
    }
}
