package s6;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20210b = f1.a("4325037BAC20");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20211c = f1.b(f1.c("43270D"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20212d = f1.b(f1.c("5232375C87015A178E237F513A7C1F01FE506C425318176D7AA9595B6C91F5694728193F84700079B2034E09"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20213a;

    public m(Context context) {
        String strB;
        try {
            strB = b(context);
        } catch (Exception unused) {
            strB = null;
        }
        this.f20213a = strB;
    }

    public String a() {
        return this.f20213a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(android.content.Context r6) {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.getFilesDir()
            java.lang.String r2 = "43270D"
            java.lang.String r2 = s6.f1.a(r2)
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 == 0) goto L1d
            boolean r1 = r0.delete()
            if (r1 != 0) goto L1d
            return r2
        L1d:
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: java.lang.Exception -> L7c
            java.lang.String r1 = "4325037BAC20"
            byte[] r1 = s6.f1.c(r1)     // Catch: java.lang.Exception -> L7c
            java.lang.String r1 = s6.f1.b(r1)     // Catch: java.lang.Exception -> L7c
            java.io.InputStream r6 = r6.open(r1)     // Catch: java.lang.Exception -> L7c
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L70
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L70
            byte[] r3 = r5.c(r6, r1)     // Catch: java.lang.Throwable -> L66
            r4 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = "5232375C87015A178E237F513A7C1F01FE506C425318176D7AA9595B6C91F5694728193F84700079B2034E09"
            byte[] r4 = s6.f1.c(r4)     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = s6.f1.b(r4)     // Catch: java.lang.Throwable -> L66
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L56
            r1.close()     // Catch: java.lang.Throwable -> L70
            if (r6 == 0) goto L55
            r6.close()     // Catch: java.lang.Exception -> L7c
        L55:
            return r2
        L56:
            r1.flush()     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L66
            r1.close()     // Catch: java.lang.Throwable -> L70
            if (r6 == 0) goto L65
            r6.close()     // Catch: java.lang.Exception -> L7c
        L65:
            return r0
        L66:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L6b
            goto L6f
        L6b:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L70
        L6f:
            throw r0     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            if (r6 == 0) goto L7b
            r6.close()     // Catch: java.lang.Throwable -> L77
            goto L7b
        L77:
            r6 = move-exception
            r0.addSuppressed(r6)     // Catch: java.lang.Exception -> L7c
        L7b:
            throw r0     // Catch: java.lang.Exception -> L7c
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.m.b(android.content.Context):java.lang.String");
    }

    public final byte[] c(InputStream inputStream, OutputStream outputStream) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance(f1.a("640C2E25FB7619"));
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return messageDigest.digest();
            }
            outputStream.write(bArr, 0, i10);
            messageDigest.update(bArr, 0, i10);
        }
    }
}
