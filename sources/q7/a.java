package q7;

import ae.r;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import m4.e;
import xd.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o7.a {
    private final void c(String str, int i10, int i11, int i12, int i13, int i14, String str2) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, f(i14));
        r.c(bitmapDecodeFile);
        e(bitmapDecodeFile, i10, i11, i13, str2, i12);
    }

    private final void d(byte[] bArr, int i10, int i11, int i12, int i13, int i14, String str) {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, f(i14));
        r.c(bitmapDecodeByteArray);
        e(bitmapDecodeByteArray, i10, i11, i13, str, i12);
    }

    private final void e(Bitmap bitmap, int i10, int i11, int i12, String str, int i13) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        r7.a.a("src width = " + width);
        r7.a.a("src height = " + height);
        float fA = m7.a.a(bitmap, i10, i11);
        r7.a.a("scale = " + fA);
        float f10 = width / fA;
        float f11 = height / fA;
        r7.a.a("dst width = " + f10);
        r7.a.a("dst height = " + f11);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f10, (int) f11, true);
        r.e(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        Bitmap bitmapF = m7.a.f(bitmapCreateScaledBitmap, i12);
        e eVarA = new e.b(str, bitmapF.getWidth(), bitmapF.getHeight(), 2).c(i13).b(1).a();
        eVarA.A();
        eVarA.a(bitmapF);
        eVarA.C(5000L);
        eVarA.close();
    }

    private final BitmapFactory.Options f(int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i10;
        return options;
    }

    @Override // o7.a
    public void a(Context context, byte[] bArr, OutputStream outputStream, int i10, int i11, int i12, int i13, boolean z10, int i14) throws IOException {
        r.f(context, "context");
        r.f(bArr, "byteArray");
        r.f(outputStream, "outputStream");
        File fileA = s7.a.f20424a.a(context);
        String absolutePath = fileA.getAbsolutePath();
        r.e(absolutePath, "getAbsolutePath(...)");
        d(bArr, i10, i11, i12, i13, i14, absolutePath);
        outputStream.write(i.c(fileA));
    }

    @Override // o7.a
    public void b(Context context, String str, OutputStream outputStream, int i10, int i11, int i12, int i13, boolean z10, int i14, int i15) throws IOException {
        r.f(context, "context");
        r.f(str, "path");
        r.f(outputStream, "outputStream");
        File fileA = s7.a.f20424a.a(context);
        String absolutePath = fileA.getAbsolutePath();
        r.e(absolutePath, "getAbsolutePath(...)");
        c(str, i10, i11, i12, i13, i14, absolutePath);
        outputStream.write(i.c(fileA));
    }

    @Override // o7.a
    public int getType() {
        return 2;
    }
}
