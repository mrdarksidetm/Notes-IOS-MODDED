package w5;

import ae.r;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.ExifInterface;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private final float c(v5.d dVar) {
        return (((float) Math.sqrt(Math.pow(dVar.a().x - dVar.f().x, 2.0d) + Math.pow(dVar.a().y - dVar.f().y, 2.0d))) + ((float) Math.sqrt(Math.pow(dVar.g().x - dVar.b().x, 2.0d) + Math.pow(dVar.g().y - dVar.b().y, 2.0d)))) / 2;
    }

    private final float d(v5.d dVar) {
        return (((float) Math.sqrt(Math.pow(dVar.g().x - dVar.f().x, 2.0d) + Math.pow(dVar.g().y - dVar.f().y, 2.0d))) + ((float) Math.sqrt(Math.pow(dVar.a().x - dVar.b().x, 2.0d) + Math.pow(dVar.a().y - dVar.b().y, 2.0d)))) / 2;
    }

    private final int f(String str) {
        int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    public final Bitmap a(Bitmap bitmap, float[] fArr, float[] fArr2, float f10, float f11) {
        r.f(bitmap, "b");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) f10, (int) f11, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint(1);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.setPolyToPoly(fArr, 0, fArr2, 0, 4);
        canvas.drawBitmap(bitmap, matrix, paint);
        r.c(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    public final Bitmap b(String str, v5.d dVar) {
        r.f(str, "photoFilePath");
        r.f(dVar, "corners");
        Bitmap bitmapE = e(str);
        if (bitmapE == null) {
            return null;
        }
        float[] fArr = {dVar.f().x, dVar.f().y, dVar.g().x, dVar.g().y, dVar.b().x, dVar.b().y, dVar.a().x, dVar.a().y};
        float fD = d(dVar);
        float fC = c(dVar);
        float f10 = fD / fC;
        if (f10 >= 1.0f) {
            fC = fD / f10;
        } else {
            fD = f10 * fC;
        }
        return a(bitmapE, fArr, new float[]{0.0f, 0.0f, fD, 0.0f, fD, fC, 0.0f, fC}, fD, fC);
    }

    public final Bitmap e(String str) {
        r.f(str, "filePath");
        int iF = f(str);
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        if (bitmapDecodeFile == null) {
            return null;
        }
        if (iF == 0) {
            return bitmapDecodeFile;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(iF);
        return Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
    }
}
