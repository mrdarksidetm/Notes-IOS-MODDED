package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.Collections;
import java.util.List;
import w8.b;
import w8.k;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzba extends a {
    final LocationRequest zzb;
    final List<b> zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final String zzh;
    final boolean zzi;
    boolean zzj;
    String zzk;
    long zzl;
    static final List<b> zza = Collections.emptyList();
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    zzba(LocationRequest locationRequest, List<b> list, String str, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, long j10) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = z12;
        this.zzh = str2;
        this.zzi = z13;
        this.zzj = z14;
        this.zzk = str3;
        this.zzl = j10;
    }

    public static zzba zza(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, zza, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (k.b(this.zzb, zzbaVar.zzb) && k.b(this.zzc, zzbaVar.zzc) && k.b(this.zzd, zzbaVar.zzd) && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && k.b(this.zzh, zzbaVar.zzh) && this.zzi == zzbaVar.zzi && this.zzj == zzbaVar.zzj && k.b(this.zzk, zzbaVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzb);
        if (this.zzd != null) {
            sb2.append(" tag=");
            sb2.append(this.zzd);
        }
        if (this.zzh != null) {
            sb2.append(" moduleId=");
            sb2.append(this.zzh);
        }
        if (this.zzk != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.zzk);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.zze);
        sb2.append(" clients=");
        sb2.append(this.zzc);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.zzf);
        if (this.zzg) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.A(parcel, 1, this.zzb, i10, false);
        c.G(parcel, 5, this.zzc, false);
        c.C(parcel, 6, this.zzd, false);
        c.g(parcel, 7, this.zze);
        c.g(parcel, 8, this.zzf);
        c.g(parcel, 9, this.zzg);
        c.C(parcel, 10, this.zzh, false);
        c.g(parcel, 11, this.zzi);
        c.g(parcel, 12, this.zzj);
        c.C(parcel, 13, this.zzk, false);
        c.v(parcel, 14, this.zzl);
        c.b(parcel, iA);
    }

    public final zzba zzb(long j10) {
        if (this.zzb.x() <= this.zzb.u()) {
            this.zzl = 10000L;
            return this;
        }
        long jU = this.zzb.u();
        long jX = this.zzb.x();
        StringBuilder sb2 = new StringBuilder(R.styleable.AppCompatTheme_windowFixedHeightMajor);
        sb2.append("could not set max age when location batching is requested, interval=");
        sb2.append(jU);
        sb2.append("maxWaitTime=");
        sb2.append(jX);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final zzba zzc(String str) {
        this.zzk = str;
        return this;
    }

    public final zzba zzd(boolean z10) {
        this.zzj = true;
        return this;
    }
}
