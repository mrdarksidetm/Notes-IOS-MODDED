package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import n9.e0;
import w8.k;

/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends x8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    int f8701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    int f8702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f8703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f8704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    e0[] f8705e;

    LocationAvailability(int i10, int i11, int i12, long j10, e0[] e0VarArr) {
        this.f8704d = i10;
        this.f8701a = i11;
        this.f8702b = i12;
        this.f8703c = j10;
        this.f8705e = e0VarArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f8701a == locationAvailability.f8701a && this.f8702b == locationAvailability.f8702b && this.f8703c == locationAvailability.f8703c && this.f8704d == locationAvailability.f8704d && Arrays.equals(this.f8705e, locationAvailability.f8705e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f8704d), Integer.valueOf(this.f8701a), Integer.valueOf(this.f8702b), Long.valueOf(this.f8703c), this.f8705e);
    }

    public String toString() {
        boolean zU = u();
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(zU);
        sb2.append("]");
        return sb2.toString();
    }

    public boolean u() {
        return this.f8704d < 1000;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f8701a);
        x8.c.s(parcel, 2, this.f8702b);
        x8.c.v(parcel, 3, this.f8703c);
        x8.c.s(parcel, 4, this.f8704d);
        x8.c.F(parcel, 5, this.f8705e, i10, false);
        x8.c.b(parcel, iA);
    }
}
