package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzsf extends zzb implements zzsg {
    public static zzsg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService");
        return iInterfaceQueryLocalInterface instanceof zzsg ? (zzsg) iInterfaceQueryLocalInterface : new zzse(iBinder);
    }
}
