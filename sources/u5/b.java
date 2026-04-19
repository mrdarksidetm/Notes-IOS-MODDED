package u5;

import ae.r;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final Bitmap a(Bitmap bitmap, int i10) {
        r.f(bitmap, "<this>");
        double dSqrt = Math.sqrt(((double) i10) / ((double) bitmap.getByteCount()));
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((double) bitmap.getWidth()) * dSqrt), (int) (((double) bitmap.getHeight()) * dSqrt), true);
        r.e(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap;
    }

    public static final void b(Bitmap bitmap, File file, int i10) throws IOException {
        r.f(bitmap, "<this>");
        r.f(file, "file");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        bitmap.compress(Bitmap.CompressFormat.JPEG, i10, fileOutputStream);
        fileOutputStream.close();
    }
}
