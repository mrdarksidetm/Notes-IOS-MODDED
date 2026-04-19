package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzl {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] zzc;
    private static final String[] zzd;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        String str = Build.HARDWARE;
        strArr[1] = true != (str.equals("goldfish") || str.equals("ranchu")) ? "" : "androidx.test.services.storage.runfiles";
        zzc = strArr;
        String[] strArr2 = new String[3];
        int i10 = Build.VERSION.SDK_INT;
        strArr2[0] = i10 <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : "";
        strArr2[1] = i10 <= 25 ? "com.google.android.inputmethod.latin.dev.inputcontent" : "";
        strArr2[2] = "com.google.android.apps.docs.storage.legacy";
        zzd = strArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r13.zzd == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r13.zzd != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d6 A[Catch: IOException -> 0x0202, FileNotFoundException -> 0x0211, TryCatch #3 {FileNotFoundException -> 0x0211, IOException -> 0x0202, blocks: (B:67:0x0117, B:70:0x0136, B:72:0x013e, B:74:0x0146, B:76:0x014e, B:78:0x0156, B:80:0x015f, B:109:0x01d0, B:111:0x01d6, B:86:0x017b, B:88:0x0181, B:90:0x0187, B:93:0x0192, B:95:0x019f, B:97:0x01a3, B:100:0x01ae, B:101:0x01b1, B:103:0x01be, B:105:0x01c2, B:108:0x01cd, B:83:0x016c, B:113:0x01dc, B:114:0x01e5, B:115:0x01e6, B:116:0x01f3, B:117:0x01f4, B:118:0x0201), top: B:132:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b A[Catch: IOException -> 0x0202, FileNotFoundException -> 0x0211, TryCatch #3 {FileNotFoundException -> 0x0211, IOException -> 0x0202, blocks: (B:67:0x0117, B:70:0x0136, B:72:0x013e, B:74:0x0146, B:76:0x014e, B:78:0x0156, B:80:0x015f, B:109:0x01d0, B:111:0x01d6, B:86:0x017b, B:88:0x0181, B:90:0x0187, B:93:0x0192, B:95:0x019f, B:97:0x01a3, B:100:0x01ae, B:101:0x01b1, B:103:0x01be, B:105:0x01c2, B:108:0x01cd, B:83:0x016c, B:113:0x01dc, B:114:0x01e5, B:115:0x01e6, B:116:0x01f3, B:117:0x01f4, B:118:0x0201), top: B:132:0x0117 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.InputStream zza(final android.content.Context r11, android.net.Uri r12, com.google.android.gms.internal.mlkit_vision_document_scanner.zzk r13) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_document_scanner.zzl.zza(android.content.Context, android.net.Uri, com.google.android.gms.internal.mlkit_vision_document_scanner.zzk):java.io.InputStream");
    }

    private static String zzb(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    private static void zzc(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e10) {
            fileNotFoundException.addSuppressed(e10);
        }
    }

    private static File[] zzd(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
