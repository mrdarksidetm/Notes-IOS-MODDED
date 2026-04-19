package xd;

import ae.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import md.i0;
import nd.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class i extends h {
    public static byte[] c(File file) throws IOException {
        r.f(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArrD = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = fileInputStream.read(bArrD, i12, i11);
                if (i13 < 0) {
                    break;
                }
                i11 -= i13;
                i12 += i13;
            }
            if (i11 > 0) {
                bArrD = Arrays.copyOf(bArrD, i12);
                r.e(bArrD, "copyOf(...)");
            } else {
                int i14 = fileInputStream.read();
                if (i14 != -1) {
                    d dVar = new d(8193);
                    dVar.write(i14);
                    a.b(fileInputStream, dVar, 0, 2, null);
                    int size = dVar.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = dVar.a();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrD, size);
                    r.e(bArrCopyOf, "copyOf(...)");
                    bArrD = o.d(bArrA, bArrCopyOf, i10, 0, dVar.size());
                }
            }
            b.a(fileInputStream, null);
            return bArrD;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String d(File file, Charset charset) throws IOException {
        r.f(file, "<this>");
        r.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strD = n.d(inputStreamReader);
            b.a(inputStreamReader, null);
            return strD;
        } finally {
        }
    }

    public static /* synthetic */ String e(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = je.d.f14191b;
        }
        return d(file, charset);
    }

    public static void f(File file, byte[] bArr) throws IOException {
        r.f(file, "<this>");
        r.f(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            i0 i0Var = i0.f15558a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }
}
