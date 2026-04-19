package l1;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f14499a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f14500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f14501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f14502d;

    private e0() {
    }

    public final void a(Canvas canvas, boolean z10) {
        Method method;
        Method declaredMethod;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            h0.f14509a.a(canvas, z10);
            return;
        }
        if (!f14502d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f14500b = (Method) declaredMethod2.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    declaredMethod = (Method) declaredMethod2.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f14500b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    declaredMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                f14501c = declaredMethod;
                Method method2 = f14500b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f14501c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f14502d = true;
        }
        if (z10) {
            try {
                Method method4 = f14500b;
                if (method4 != null) {
                    ae.r.c(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f14501c) == null) {
            return;
        }
        ae.r.c(method);
        method.invoke(canvas, new Object[0]);
    }
}
