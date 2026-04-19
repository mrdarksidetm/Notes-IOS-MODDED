package p7;

import ae.r;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import l7.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap.CompressFormat f18262c;

    public a(int i10) {
        this.f18260a = i10;
        int type = getType();
        this.f18261b = type != 1 ? type != 3 ? "jpeg" : "webp" : "png";
        int type2 = getType();
        this.f18262c = type2 != 1 ? type2 != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    private final byte[] c(byte[] bArr, int i10, int i11, int i12, int i13, int i14) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i14;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        float width = bitmapDecodeByteArray.getWidth();
        float height = bitmapDecodeByteArray.getHeight();
        r7.a.a("src width = " + width);
        r7.a.a("src height = " + height);
        r.c(bitmapDecodeByteArray);
        float fA = m7.a.a(bitmapDecodeByteArray, i10, i11);
        r7.a.a("scale = " + fA);
        float f10 = width / fA;
        float f11 = height / fA;
        r7.a.a("dst width = " + f10);
        r7.a.a("dst height = " + f11);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, (int) f10, (int) f11, true);
        r.e(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        m7.a.f(bitmapCreateScaledBitmap, i13).compress(this.f18262c, i12, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        r.e(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @Override // o7.a
    public void a(Context context, byte[] bArr, OutputStream outputStream, int i10, int i11, int i12, int i13, boolean z10, int i14) throws IOException {
        r.f(context, "context");
        r.f(bArr, "byteArray");
        r.f(outputStream, "outputStream");
        byte[] bArrC = c(bArr, i10, i11, i12, i13, i14);
        if (!z10 || this.f18262c != Bitmap.CompressFormat.JPEG) {
            outputStream.write(bArrC);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArrC);
        outputStream.write(new b(bArr).c(context, byteArrayOutputStream).toByteArray());
    }

    @Override // o7.a
    public void b(Context context, String str, OutputStream outputStream, int i10, int i11, int i12, int i13, boolean z10, int i14, int i15) throws IOException {
        r.f(context, "context");
        r.f(str, "path");
        r.f(outputStream, "outputStream");
        if (i15 <= 0) {
            return;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            options.inSampleSize = i14;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            r.c(bitmapDecodeFile);
            byte[] bArrC = m7.a.c(bitmapDecodeFile, i10, i11, i12, i13, getType());
            if (z10) {
                try {
                    if (this.f18262c == Bitmap.CompressFormat.JPEG) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArrC);
                        outputStream.write(new b(str).c(context, byteArrayOutputStream).toByteArray());
                    }
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    b(context, str, outputStream, i10, i11, i12, i13, z10, i14 * 2, i15 - 1);
                    return;
                }
            }
            outputStream.write(bArrC);
        } catch (OutOfMemoryError unused2) {
        }
    }

    @Override // o7.a
    public int getType() {
        return this.f18260a;
    }
}
