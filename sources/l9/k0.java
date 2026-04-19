package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends x8.a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14879a;

    public k0(long j10) {
        this.f14879a = ((Long) w8.m.k(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k0) && this.f14879a == ((k0) obj).f14879a;
    }

    public final int hashCode() {
        return w8.k.c(Long.valueOf(this.f14879a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.v(parcel, 1, this.f14879a);
        x8.c.b(parcel, iA);
    }
}
