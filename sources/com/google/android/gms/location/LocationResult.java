package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LocationResult extends x8.a implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Location> f8716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final List<Location> f8715b = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new i();

    LocationResult(List<Location> list) {
        this.f8716a = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f8716a.size() != this.f8716a.size()) {
            return false;
        }
        Iterator<Location> it = locationResult.f8716a.iterator();
        Iterator<Location> it2 = this.f8716a.iterator();
        while (it.hasNext()) {
            if (it2.next().getTime() != it.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator<Location> it = this.f8716a.iterator();
        int i10 = 17;
        while (it.hasNext()) {
            long time = it.next().getTime();
            i10 = (i10 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i10;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f8716a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 27);
        sb2.append("LocationResult[locations: ");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }

    public List<Location> u() {
        return this.f8716a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.G(parcel, 1, u(), false);
        x8.c.b(parcel, iA);
    }
}
