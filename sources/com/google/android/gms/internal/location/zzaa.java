package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import u8.h;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzaa extends a implements h {
    private final Status zzb;
    public static final zzaa zza = new zzaa(Status.f8385f);
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();

    public zzaa(Status status) {
        this.zzb = status;
    }

    @Override // u8.h
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.A(parcel, 1, this.zzb, i10, false);
        c.b(parcel, iA);
    }
}
