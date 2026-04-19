package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import n9.o0;
import w8.b;
import w8.k;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends a {
    final o0 zzc;
    final List<b> zzd;
    final String zze;
    static final List<b> zza = Collections.emptyList();
    static final o0 zzb = new o0();
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    zzj(o0 o0Var, List<b> list, String str) {
        this.zzc = o0Var;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return k.b(this.zzc, zzjVar.zzc) && k.b(this.zzd, zzjVar.zzd) && k.b(this.zze, zzjVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        int length = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + strValueOf2.length() + String.valueOf(str).length());
        sb2.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb2.append(strValueOf);
        sb2.append(", clients=");
        sb2.append(strValueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.A(parcel, 1, this.zzc, i10, false);
        c.G(parcel, 2, this.zzd, false);
        c.C(parcel, 3, this.zze, false);
        c.b(parcel, iA);
    }
}
