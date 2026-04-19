package l1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f14589a = new u();

    private u() {
    }

    public static final m1.c a(Bitmap bitmap) {
        m1.c cVarB;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (cVarB = e.b(colorSpace)) == null) ? m1.g.f15198a.w() : cVarB;
    }

    public static final Bitmap b(int i10, int i11, int i12, boolean z10, m1.c cVar) {
        return Bitmap.createBitmap((DisplayMetrics) null, i10, i11, g.d(i12), z10, e.a(cVar));
    }
}
