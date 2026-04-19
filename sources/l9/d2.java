package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends x8.a {
    public static final Parcelable.Creator<d2> CREATOR = new e2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f14837a;

    public d2(boolean z10) {
        this.f14837a = ((Boolean) w8.m.k(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d2) && this.f14837a == ((d2) obj).f14837a;
    }

    public final int hashCode() {
        return w8.k.c(Boolean.valueOf(this.f14837a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.g(parcel, 1, this.f14837a);
        x8.c.b(parcel, iA);
    }
}
