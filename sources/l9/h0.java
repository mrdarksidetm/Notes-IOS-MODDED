package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends x8.a {
    public static final Parcelable.Creator<h0> CREATOR = new k1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short f14864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f14865c;

    h0(int i10, short s10, short s11) {
        this.f14863a = i10;
        this.f14864b = s10;
        this.f14865c = s11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f14863a == h0Var.f14863a && this.f14864b == h0Var.f14864b && this.f14865c == h0Var.f14865c;
    }

    public int hashCode() {
        return w8.k.c(Integer.valueOf(this.f14863a), Short.valueOf(this.f14864b), Short.valueOf(this.f14865c));
    }

    public short u() {
        return this.f14864b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, z());
        x8.c.B(parcel, 2, u());
        x8.c.B(parcel, 3, x());
        x8.c.b(parcel, iA);
    }

    public short x() {
        return this.f14865c;
    }

    public int z() {
        return this.f14863a;
    }
}
