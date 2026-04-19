package u5;

import ae.r;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final Rect a(androidx.appcompat.app.c cVar) {
        r.f(cVar, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            return new Rect(0, 0, cVar.getWindowManager().getDefaultDisplay().getWidth(), cVar.getWindowManager().getDefaultDisplay().getHeight());
        }
        Rect bounds = cVar.getWindowManager().getCurrentWindowMetrics().getBounds();
        r.e(bounds, "getBounds(...)");
        return bounds;
    }

    public static final int b(androidx.appcompat.app.c cVar) {
        r.f(cVar, "<this>");
        return a(cVar).height();
    }

    public static final int c(androidx.appcompat.app.c cVar) {
        r.f(cVar, "<this>");
        return a(cVar).width();
    }
}
