package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class c extends x8.a {
    public static final Parcelable.Creator<c> CREATOR = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16022b;

    c(int i10, int i11) {
        this.f16021a = i10;
        this.f16022b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16021a == cVar.f16021a && this.f16022b == cVar.f16022b;
    }

    public int hashCode() {
        return w8.k.c(Integer.valueOf(this.f16021a), Integer.valueOf(this.f16022b));
    }

    public String toString() {
        int i10 = this.f16021a;
        int i11 = this.f16022b;
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(i10);
        sb2.append(", mTransitionType=");
        sb2.append(i11);
        sb2.append(']');
        return sb2.toString();
    }

    public int u() {
        return this.f16021a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        w8.m.k(parcel);
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, u());
        x8.c.s(parcel, 2, x());
        x8.c.b(parcel, iA);
    }

    public int x() {
        return this.f16022b;
    }
}
