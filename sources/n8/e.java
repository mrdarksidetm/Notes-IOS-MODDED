package n8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class e extends x8.a {
    public static final Parcelable.Creator<e> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15983a;

    e(int i10) {
        this.f15983a = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return w8.k.b(Integer.valueOf(this.f15983a), Integer.valueOf(((e) obj).f15983a));
        }
        return false;
    }

    public int hashCode() {
        return w8.k.c(Integer.valueOf(this.f15983a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f15983a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.b(parcel, iA);
    }
}
