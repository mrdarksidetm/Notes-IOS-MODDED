package q5;

import ae.r;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.o;
import m5.l;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f18983a = new e();

    private e() {
    }

    public final Rect a(Context context) {
        r.f(context, "context");
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        r.e(bounds, "wm.currentWindowMetrics.bounds");
        return bounds;
    }

    public final o b(Context context) {
        r.f(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        r.e(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        o oVarW = o.w(windowInsets);
        r.e(oVarW, "toWindowInsetsCompat(platformInsets)");
        return oVarW;
    }

    public final l c(Context context) {
        r.f(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        o oVarW = o.w(windowManager.getCurrentWindowMetrics().getWindowInsets());
        r.e(oVarW, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        r.e(bounds, "wm.currentWindowMetrics.bounds");
        return new l(bounds, oVarW);
    }

    public final Rect d(Context context) {
        r.f(context, "context");
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
        r.e(bounds, "wm.maximumWindowMetrics.bounds");
        return bounds;
    }
}
