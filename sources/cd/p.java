package cd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f6866b;

    p(Context context, a aVar) {
        this.f6865a = context;
        this.f6866b = aVar;
    }

    private int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 >= i11 && i16 / i14 >= i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    private n3.h b(double d10, double d11, Double d12, Double d13) {
        double d14 = d10 / d11;
        boolean z10 = true;
        boolean z11 = d12 != null;
        boolean z12 = d13 != null;
        double dMin = z11 ? Math.min(d10, Math.round(d12.doubleValue())) : d10;
        double dMin2 = z12 ? Math.min(d11, Math.round(d13.doubleValue())) : d11;
        boolean z13 = z11 && d12.doubleValue() < d10;
        boolean z14 = z12 && d13.doubleValue() < d11;
        if (!z13 && !z14) {
            z10 = false;
        }
        if (z10) {
            double d15 = dMin2 * d14;
            double d16 = dMin / d14;
            if (d16 > dMin2) {
                dMin = Math.round(d15);
            } else {
                dMin2 = Math.round(d16);
            }
        }
        return new n3.h((float) dMin, (float) dMin2);
    }

    private void c(String str, String str2) throws Throwable {
        try {
            this.f6866b.a(new androidx.exifinterface.media.a(str), new androidx.exifinterface.media.a(str2));
        } catch (Exception e10) {
            Log.e("ImageResizer", "Error preserving Exif data on selected image: " + e10);
        }
    }

    private File d(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2;
    }

    private File e(String str, Bitmap bitmap, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean zHasAlpha = bitmap.hasAlpha();
        if (zHasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmap.compress(zHasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        File fileD = d(this.f6865a.getCacheDir(), str);
        FileOutputStream fileOutputStreamF = f(fileD);
        fileOutputStreamF.write(byteArrayOutputStream.toByteArray());
        fileOutputStreamF.close();
        return fileD;
    }

    private FileOutputStream f(File file) {
        return new FileOutputStream(file);
    }

    private Bitmap g(Bitmap bitmap, int i10, int i11, boolean z10) {
        return Bitmap.createScaledBitmap(bitmap, i10, i11, z10);
    }

    private Bitmap h(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    private File k(Bitmap bitmap, Double d10, Double d11, int i10, String str) {
        return e("/scaled_" + str, g(bitmap, d10.intValue(), d11.intValue(), false), i10);
    }

    n3.h i(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        h(str, options);
        return new n3.h(options.outWidth, options.outHeight);
    }

    String j(String str, Double d10, Double d11, int i10) throws Throwable {
        n3.h hVarI = i(str);
        if (hVarI.b() == -1.0f || hVarI.a() == -1.0f) {
            return str;
        }
        if (!((d10 == null && d11 == null && i10 >= 100) ? false : true)) {
            return str;
        }
        try {
            String[] strArrSplit = str.split("/");
            String str2 = strArrSplit[strArrSplit.length - 1];
            n3.h hVarB = b(hVarI.b(), hVarI.a(), d10, d11);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = a(options, (int) hVarB.b(), (int) hVarB.a());
            Bitmap bitmapH = h(str, options);
            if (bitmapH == null) {
                return str;
            }
            File fileK = k(bitmapH, Double.valueOf(hVarB.b()), Double.valueOf(hVarB.a()), i10, str2);
            c(str, fileK.getPath());
            return fileK.getPath();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
