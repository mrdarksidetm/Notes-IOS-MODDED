package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends x8.a {
    public static final Parcelable.Creator<p0> CREATOR = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14899a;

    public p0(String str) {
        this.f14899a = (String) w8.m.k(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.f14899a.equals(((p0) obj).f14899a);
        }
        return false;
    }

    public final int hashCode() {
        return w8.k.c(this.f14899a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, this.f14899a, false);
        x8.c.b(parcel, iA);
    }
}
