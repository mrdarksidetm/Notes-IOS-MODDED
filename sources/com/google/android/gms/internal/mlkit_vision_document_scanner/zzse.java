package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzse extends zza implements zzsg {
    zzse(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzsg
    public final void zzc(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzb(1, parcelZza);
    }
}
