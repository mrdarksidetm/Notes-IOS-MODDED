package m5;

import ae.i0;
import ae.r;
import ae.s;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f15435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i5.d f15436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h5.a f15437c;

    static final class a extends s implements zd.a<Boolean> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            Class clsF = e.this.f();
            boolean z10 = false;
            Method method = clsF.getMethod("getBounds", new Class[0]);
            Method method2 = clsF.getMethod("getType", new Class[0]);
            Method method3 = clsF.getMethod("getState", new Class[0]);
            r5.a aVar = r5.a.f19183a;
            r.e(method, "getBoundsMethod");
            if (aVar.b(method, i0.b(Rect.class)) && aVar.d(method)) {
                r.e(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (aVar.b(method2, i0.b(cls)) && aVar.d(method2)) {
                    r.e(method3, "getStateMethod");
                    if (aVar.b(method3, i0.b(cls)) && aVar.d(method3)) {
                        z10 = true;
                    }
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class b extends s implements zd.a<Boolean> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            Class<?> clsB = e.this.f15436b.b();
            if (clsB == null) {
                return Boolean.FALSE;
            }
            Class clsH = e.this.h();
            boolean z10 = false;
            Method method = clsH.getMethod("addWindowLayoutInfoListener", Activity.class, clsB);
            Method method2 = clsH.getMethod("removeWindowLayoutInfoListener", clsB);
            r5.a aVar = r5.a.f19183a;
            r.e(method, "addListenerMethod");
            if (aVar.d(method)) {
                r.e(method2, "removeListenerMethod");
                if (aVar.d(method2)) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class c extends s implements zd.a<Boolean> {
        c() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            Class clsH = e.this.h();
            boolean z10 = false;
            Method method = clsH.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
            Method method2 = clsH.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            r5.a aVar = r5.a.f19183a;
            r.e(method, "addListenerMethod");
            if (aVar.d(method)) {
                r.e(method2, "removeListenerMethod");
                if (aVar.d(method2)) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class d extends s implements zd.a<Boolean> {
        d() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            boolean z10 = false;
            Method method = e.this.f15437c.c().getMethod("getWindowLayoutComponent", new Class[0]);
            Class<?> clsH = e.this.h();
            r5.a aVar = r5.a.f19183a;
            r.e(method, "getWindowLayoutComponentMethod");
            if (aVar.d(method) && aVar.c(method, clsH)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public e(ClassLoader classLoader, i5.d dVar) {
        r.f(classLoader, "loader");
        r.f(dVar, "consumerAdapter");
        this.f15435a = classLoader;
        this.f15436b = dVar;
        this.f15437c = new h5.a(classLoader);
    }

    private final boolean e() {
        if (!n()) {
            return false;
        }
        int iA = i5.e.f12532a.a();
        if (iA == 1) {
            return i();
        }
        if (2 <= iA && iA <= Integer.MAX_VALUE) {
            return j();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> f() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f15435a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        r.e(clsLoadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return clsLoadClass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> h() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f15435a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        r.e(clsLoadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return clsLoadClass;
    }

    private final boolean k() {
        return r5.a.e("FoldingFeature class is not valid", new a());
    }

    private final boolean l() {
        return r5.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new b());
    }

    private final boolean m() {
        return r5.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new c());
    }

    private final boolean o() {
        return r5.a.e("WindowExtensions#getWindowLayoutComponent is not valid", new d());
    }

    public final WindowLayoutComponent g() {
        if (!e()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final boolean i() {
        return l();
    }

    public final boolean j() {
        return i() && m();
    }

    public final boolean n() {
        return this.f15437c.f() && o() && k();
    }
}
