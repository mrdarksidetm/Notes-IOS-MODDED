package m5;

import ae.r;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import androidx.core.view.o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f15472b = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f15473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ArrayList<Integer> f15474d;

    static {
        String simpleName = n.class.getSimpleName();
        r.e(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f15473c = simpleName;
        f15474d = u.g(Integer.valueOf(o.m.g()), Integer.valueOf(o.m.f()), Integer.valueOf(o.m.a()), Integer.valueOf(o.m.c()), Integer.valueOf(o.m.i()), Integer.valueOf(o.m.e()), Integer.valueOf(o.m.j()), Integer.valueOf(o.m.b()));
    }

    private n() {
    }

    private final DisplayCutout j(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e10) {
            Log.w(f15473c, e10);
        }
        return null;
    }

    private final int k(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void m(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // m5.m
    public l a(Activity activity) {
        r.f(activity, "activity");
        return e(activity);
    }

    @Override // m5.m
    public l c(Context context) {
        r.f(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return q5.e.f18983a.c(context);
        }
        Context contextA = q5.b.f18982a.a(context);
        if (contextA instanceof Activity) {
            return d((Activity) contextA);
        }
        if (!(contextA instanceof InputMethodService)) {
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        Object systemService = context.getSystemService("window");
        r.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        r.e(defaultDisplay, "wm.defaultDisplay");
        Point pointL = l(defaultDisplay);
        return new l(new Rect(0, 0, pointL.x, pointL.y), null, 2, null);
    }

    @Override // m5.m
    public l d(Activity activity) throws Exception {
        o oVarA;
        r.f(activity, "activity");
        int i10 = Build.VERSION.SDK_INT;
        Rect rectA = i10 >= 30 ? q5.e.f18983a.a(activity) : i10 >= 29 ? h(activity) : i10 >= 28 ? g(activity) : f(activity);
        if (i10 >= 30) {
            oVarA = i(activity);
        } else {
            oVarA = new o.b().a();
            r.e(oVarA, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new l(new i5.b(rectA), oVarA);
    }

    public l e(Context context) throws Exception {
        Rect rect;
        o oVarA;
        r.f(context, "context");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            rect = q5.e.f18983a.d(context);
        } else {
            Object systemService = context.getSystemService("window");
            r.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            r.e(defaultDisplay, "display");
            Point pointL = l(defaultDisplay);
            rect = new Rect(0, 0, pointL.x, pointL.y);
        }
        if (i10 >= 30) {
            oVarA = i(context);
        } else {
            oVarA = new o.b().a();
            r.e(oVarA, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new l(new i5.b(rect), oVarA);
    }

    public final Rect f(Activity activity) {
        r.f(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!q5.a.f18981a.a(activity)) {
            r.e(defaultDisplay, "defaultDisplay");
            Point pointL = l(defaultDisplay);
            int iK = k(activity);
            int i10 = rect.bottom;
            if (i10 + iK == pointL.y) {
                rect.bottom = i10 + iK;
            } else {
                int i11 = rect.right;
                if (i11 + iK == pointL.x) {
                    rect.right = i11 + iK;
                }
            }
        }
        return rect;
    }

    public final Rect g(Activity activity) {
        Rect rect;
        r.f(activity, "activity");
        Rect rect2 = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (q5.a.f18981a.a(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                r.d(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = (Rect) objInvoke;
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                r.d(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect = (Rect) objInvoke2;
            }
            rect2.set(rect);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e10) {
            Log.w(f15473c, e10);
            m(activity, rect2);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        q5.a aVar = q5.a.f18981a;
        if (!aVar.a(activity)) {
            int iK = k(activity);
            int i10 = rect2.bottom;
            if (i10 + iK == point.y) {
                rect2.bottom = i10 + iK;
            } else {
                int i11 = rect2.right;
                if (i11 + iK == point.x) {
                    rect2.right = i11 + iK;
                } else if (rect2.left == iK) {
                    rect2.left = 0;
                }
            }
        }
        if ((rect2.width() < point.x || rect2.height() < point.y) && !aVar.a(activity)) {
            r.e(defaultDisplay, "currentDisplay");
            DisplayCutout displayCutoutJ = j(defaultDisplay);
            if (displayCutoutJ != null) {
                int i12 = rect2.left;
                q5.f fVar = q5.f.f18984a;
                if (i12 == fVar.b(displayCutoutJ)) {
                    rect2.left = 0;
                }
                if (point.x - rect2.right == fVar.c(displayCutoutJ)) {
                    rect2.right += fVar.c(displayCutoutJ);
                }
                if (rect2.top == fVar.d(displayCutoutJ)) {
                    rect2.top = 0;
                }
                if (point.y - rect2.bottom == fVar.a(displayCutoutJ)) {
                    rect2.bottom += fVar.a(displayCutoutJ);
                }
            }
        }
        return rect2;
    }

    public final Rect h(Activity activity) {
        r.f(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            r.d(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e10) {
            Log.w(f15473c, e10);
            return g(activity);
        }
    }

    public final o i(Context context) throws Exception {
        r.f(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return q5.e.f18983a.b(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public final Point l(Display display) {
        r.f(display, "display");
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}
