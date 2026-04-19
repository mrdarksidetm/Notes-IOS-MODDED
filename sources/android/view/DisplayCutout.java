package android.view;

import android.graphics.Insets;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DisplayCutout {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ DisplayCutout(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
    }

    @Deprecated
    public /* synthetic */ DisplayCutout(Rect rect, List<Rect> list) {
    }

    public native /* synthetic */ List<Rect> getBoundingRects();

    public native /* synthetic */ int getSafeInsetBottom();

    public native /* synthetic */ int getSafeInsetLeft();

    public native /* synthetic */ int getSafeInsetRight();

    public native /* synthetic */ int getSafeInsetTop();

    public native /* synthetic */ int hashCode();
}
