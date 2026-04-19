package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzsa extends a {
    public static final Parcelable.Creator<zzsa> CREATOR = new zzsb();
    private final List zza;

    public zzsa(List list) {
        this.zza = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.zza;
        int iA = c.a(parcel);
        c.G(parcel, 1, list, false);
        c.b(parcel, iA);
    }
}
