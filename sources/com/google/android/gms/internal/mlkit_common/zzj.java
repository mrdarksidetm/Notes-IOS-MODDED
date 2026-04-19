package com.google.android.gms.internal.mlkit_common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzj {
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

    public static AssetFileDescriptor zza(Context context, Uri uri, String str) throws IllegalAccessException, FileNotFoundException, InvocationTargetException {
        zzi zziVar = zzi.zza;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriZzc = zzc(uri);
        String scheme = uriZzc.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(uriZzc, "r");
        }
        if ("content".equals(scheme)) {
            if (!zzi(context, uriZzc, 1, zziVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriZzc, "r");
            zzd(assetFileDescriptorOpenAssetFileDescriptor);
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uriZzc, "r");
        zzd(assetFileDescriptorOpenAssetFileDescriptor2);
        try {
            zzh(context, assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor(), uriZzc, zziVar);
            return assetFileDescriptorOpenAssetFileDescriptor2;
        } catch (FileNotFoundException e10) {
            zzf(assetFileDescriptorOpenAssetFileDescriptor2, e10);
            throw e10;
        } catch (IOException e11) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e11);
            zzf(assetFileDescriptorOpenAssetFileDescriptor2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    public static InputStream zzb(Context context, Uri uri, zzi zziVar) throws IllegalAccessException, FileNotFoundException, InvocationTargetException {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriZzc = zzc(uri);
        String scheme = uriZzc.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(uriZzc);
        }
        if ("content".equals(scheme)) {
            if (!zzi(context, uriZzc, 1, zziVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uriZzc);
            zzd(inputStreamOpenInputStream);
            return inputStreamOpenInputStream;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(uriZzc.getPath()).getCanonicalFile()), "r");
            try {
                zzh(context, parcelFileDescriptorOpenFileDescriptor, uriZzc, zziVar);
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
            } catch (FileNotFoundException e10) {
                zzg(parcelFileDescriptorOpenFileDescriptor, e10);
                throw e10;
            } catch (IOException e11) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e11);
                zzg(parcelFileDescriptorOpenFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        } catch (IOException e12) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e12);
            throw fileNotFoundException2;
        }
    }

    private static Uri zzc(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    private static Object zzd(Object obj) throws FileNotFoundException {
        if (obj != null) {
            return obj;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }

    private static String zze(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    private static void zzf(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) throws IllegalAccessException, InvocationTargetException {
        try {
            assetFileDescriptor.close();
        } catch (IOException e10) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(fileNotFoundException, e10);
        }
    }

    private static void zzg(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) throws IllegalAccessException, InvocationTargetException {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e10) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(fileNotFoundException, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[EDGE_INSN: B:52:0x0054->B:16:0x0054 BREAK  A[LOOP:0: B:28:0x0088->B:34:0x0099], EDGE_INSN: B:16:0x0054->B:43:0x00bb BREAK  A[LOOP:1: B:36:0x00a7->B:42:0x00b8]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzh(final android.content.Context r7, android.os.ParcelFileDescriptor r8, android.net.Uri r9, com.google.android.gms.internal.mlkit_common.zzi r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzj.zzh(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, com.google.android.gms.internal.mlkit_common.zzi):void");
    }

    private static boolean zzi(Context context, Uri uri, int i10, zzi zziVar) {
        String authority = uri.getAuthority();
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (providerInfoResolveContentProvider == null) {
            int iLastIndexOf = authority.lastIndexOf(64);
            if (iLastIndexOf >= 0) {
                authority = authority.substring(iLastIndexOf + 1);
                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (providerInfoResolveContentProvider == null) {
                return !zziVar.zzd;
            }
        }
        if (zzi.zzc(zziVar, context, new zzr(uri, providerInfoResolveContentProvider, authority)) - 1 == 1) {
            return false;
        }
        if (context.getPackageName().equals(providerInfoResolveContentProvider.packageName)) {
            return zziVar.zzd;
        }
        if (zziVar.zzd) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && providerInfoResolveContentProvider.exported) {
            String[] strArr = zzc;
            int length = strArr.length;
            for (int i11 = 0; i11 < 2; i11++) {
                if (strArr[i11].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = zzd;
            int length2 = strArr2.length;
            for (int i12 = 0; i12 < 3; i12++) {
                if (strArr2[i12].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = zzb;
            for (int i13 = 0; i13 < 6; i13++) {
                String str = strArr3[i13];
                if (str.charAt(str.length() - 1) == '.') {
                    if (providerInfoResolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (providerInfoResolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static File[] zzj(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
