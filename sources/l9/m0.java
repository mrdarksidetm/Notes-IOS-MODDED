package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends x8.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f14886a;

    public m0(boolean z10) {
        this.f14886a = ((Boolean) w8.m.k(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m0) && this.f14886a == ((m0) obj).f14886a;
    }

    public final int hashCode() {
        return w8.k.c(Boolean.valueOf(this.f14886a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.g(parcel, 1, this.f14886a);
        x8.c.b(parcel, iA);
    }
}
