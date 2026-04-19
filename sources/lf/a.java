package lf;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f15136a = File.separatorChar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15137b;

    static {
        mf.a aVar = new mf.a(4);
        try {
            PrintWriter printWriter = new PrintWriter(aVar);
            try {
                printWriter.println();
                f15137b = aVar.toString();
                printWriter.close();
                aVar.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        long jC = c(inputStream, outputStream);
        if (jC > 2147483647L) {
            return -1;
        }
        return (int) jC;
    }

    public static long b(InputStream inputStream, OutputStream outputStream, int i10) {
        return d(inputStream, outputStream, new byte[i10]);
    }

    public static long c(InputStream inputStream, OutputStream outputStream) {
        return b(inputStream, outputStream, 4096);
    }

    public static long d(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static void e(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }
}
