package l1;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import l1.w0;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final v0 a(int i10, int i11, int i12, boolean z10, m1.c cVar) {
        Bitmap bitmapCreateBitmap;
        Bitmap.Config configD = d(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = u.b(i10, i11, i12, z10, cVar);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configD);
            bitmapCreateBitmap.setHasAlpha(z10);
        }
        return new f(bitmapCreateBitmap);
    }

    public static final Bitmap b(v0 v0Var) {
        if (v0Var instanceof f) {
            return ((f) v0Var).c();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final v0 c(Bitmap bitmap) {
        return new f(bitmap);
    }

    public static final Bitmap.Config d(int i10) {
        w0.a aVar = w0.f14626b;
        if (!w0.i(i10, aVar.b())) {
            if (w0.i(i10, aVar.a())) {
                return Bitmap.Config.ALPHA_8;
            }
            if (w0.i(i10, aVar.e())) {
                return Bitmap.Config.RGB_565;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 26 && w0.i(i10, aVar.c())) {
                return Bitmap.Config.RGBA_F16;
            }
            if (i11 >= 26 && w0.i(i10, aVar.d())) {
                return Bitmap.Config.HARDWARE;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final int e(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return w0.f14626b.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return w0.f14626b.e();
        }
        if (config != Bitmap.Config.ARGB_4444) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26 && config == Bitmap.Config.RGBA_F16) {
                return w0.f14626b.c();
            }
            if (i10 >= 26 && config == Bitmap.Config.HARDWARE) {
                return w0.f14626b.d();
            }
        }
        return w0.f14626b.b();
    }
}
