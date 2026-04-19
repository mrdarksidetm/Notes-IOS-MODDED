package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class r extends x8.a {
    public static final Parcelable.Creator<r> CREATOR = new g2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14916a;

    public r(String str) {
        this.f14916a = (String) w8.m.k(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f14916a.equals(((r) obj).f14916a);
        }
        return false;
    }

    public int hashCode() {
        return w8.k.c(this.f14916a);
    }

    public String u() {
        return this.f14916a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 2, u(), false);
        x8.c.b(parcel, iA);
    }
}
