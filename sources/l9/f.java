package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class f extends x8.a {
    public static final Parcelable.Creator<f> CREATOR = new n1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f14851a;

    public f(boolean z10) {
        this.f14851a = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f14851a == ((f) obj).f14851a;
    }

    public int hashCode() {
        return w8.k.c(Boolean.valueOf(this.f14851a));
    }

    public boolean u() {
        return this.f14851a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.g(parcel, 1, u());
        x8.c.b(parcel, iA);
    }
}
