package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends x8.a {
    public static final Parcelable.Creator<q1> CREATOR = new r1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f14914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f14915b;

    public q1(boolean z10, byte[] bArr) {
        this.f14914a = z10;
        this.f14915b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.f14914a == q1Var.f14914a && Arrays.equals(this.f14915b, q1Var.f14915b);
    }

    public final int hashCode() {
        return w8.k.c(Boolean.valueOf(this.f14914a), this.f14915b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.g(parcel, 1, this.f14914a);
        x8.c.k(parcel, 2, this.f14915b, false);
        x8.c.b(parcel, iA);
    }
}
