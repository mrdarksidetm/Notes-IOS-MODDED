package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class s extends x8.a {
    public static final Parcelable.Creator<s> CREATOR = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f14918a;

    public s(boolean z10) {
        this.f14918a = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && this.f14918a == ((s) obj).u();
    }

    public int hashCode() {
        return w8.k.c(Boolean.valueOf(this.f14918a));
    }

    public boolean u() {
        return this.f14918a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.g(parcel, 1, u());
        x8.c.b(parcel, iA);
    }
}
