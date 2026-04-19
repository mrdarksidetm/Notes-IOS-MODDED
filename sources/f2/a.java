package f2;

import ae.r;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import l1.v0;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final v0 a(v0.a aVar, Resources resources, int i10) {
        Drawable drawable = resources.getDrawable(i10, null);
        r.d(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return l1.g.c(((BitmapDrawable) drawable).getBitmap());
    }
}
