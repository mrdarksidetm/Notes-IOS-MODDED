package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    public static final ClipData zza = ClipData.newIntent("", new Intent());

    public static PendingIntent zza(Context context, int i10, Intent intent, int i11, int i12) {
        boolean zZzb;
        String str;
        zzt.zzd((i11 & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        zzt.zzd((i11 & 1) == 0 || zzb(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        zzt.zzd((i11 & 2) == 0 || zzb(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        zzt.zzd((i11 & 4) == 0 || zzb(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        zzt.zzd((i11 & 128) == 0 || zzb(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        zzt.zzd(intent.getComponent() != null, "Must set component on Intent.");
        if (zzb(0, 1)) {
            zZzb = !zzb(i11, 67108864);
            str = "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.";
        } else {
            zZzb = zzb(i11, 67108864);
            str = "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.";
        }
        zzt.zzd(zZzb, str);
        Intent intent2 = new Intent(intent);
        if (!zzb(i11, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzb(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zzb(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zzb(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzb(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zza);
            }
        }
        return PendingIntent.getActivity(context, i10, intent2, i11);
    }

    private static boolean zzb(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
