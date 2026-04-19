package m7;

import ae.r;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final float a(Bitmap bitmap, int i10, int i11) {
        r.f(bitmap, "<this>");
        float width = bitmap.getWidth() / i10;
        float height = bitmap.getHeight() / i11;
        e("width scale = " + width);
        e("height scale = " + height);
        return Math.max(1.0f, Math.min(width, height));
    }

    public static final void b(Bitmap bitmap, int i10, int i11, int i12, int i13, OutputStream outputStream, int i14) {
        r.f(bitmap, "<this>");
        r.f(outputStream, "outputStream");
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        e("src width = " + width);
        e("src height = " + height);
        float fA = a(bitmap, i10, i11);
        e("scale = " + fA);
        float f10 = width / fA;
        float f11 = height / fA;
        e("dst width = " + f10);
        e("dst height = " + f11);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f10, (int) f11, true);
        r.e(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        f(bitmapCreateScaledBitmap, i13).compress(d(i14), i12, outputStream);
    }

    public static final byte[] c(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        r.f(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b(bitmap, i10, i11, i12, i13, byteArrayOutputStream, i14);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        r.e(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final Bitmap.CompressFormat d(int i10) {
        return i10 != 1 ? i10 != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    private static final void e(Object obj) {
        if (j7.a.f14078c.a()) {
            if (obj == null) {
                obj = "null";
            }
            System.out.println(obj);
        }
    }

    public static final Bitmap f(Bitmap bitmap, int i10) {
        r.f(bitmap, "<this>");
        if (i10 % 360 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        r.c(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }
}
