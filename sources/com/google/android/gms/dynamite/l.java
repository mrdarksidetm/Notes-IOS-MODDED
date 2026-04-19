package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import h9.a;

/* JADX INFO: loaded from: classes.dex */
public final class l extends zza {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int V() {
        Parcel parcelZzB = zzB(6, zza());
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    public final int W(h9.a aVar, String str, boolean z10) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z10 ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    public final int X(h9.a aVar, String str, boolean z10) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z10 ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    public final h9.a Y(h9.a aVar, String str, boolean z10, long j10) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z10 ? 1 : 0);
        parcelZza.writeLong(j10);
        Parcel parcelZzB = zzB(7, parcelZza);
        h9.a aVarB = a.AbstractBinderC0290a.b(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarB;
    }
}
