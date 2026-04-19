package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends x8.a {
    public static final Parcelable.Creator<f0> CREATOR = new e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f14852a;

    public f0(boolean z10) {
        this.f14852a = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f0) && this.f14852a == ((f0) obj).f14852a;
    }

    public int hashCode() {
        return w8.k.c(Boolean.valueOf(this.f14852a));
    }

    public boolean u() {
        return this.f14852a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.g(parcel, 1, u());
        x8.c.b(parcel, iA);
    }
}
