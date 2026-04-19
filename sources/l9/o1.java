package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends x8.a {
    public static final Parcelable.Creator<o1> CREATOR = new p1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f14888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f14889b;

    public o1(byte[] bArr, byte[] bArr2) {
        this.f14888a = bArr;
        this.f14889b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Arrays.equals(this.f14888a, o1Var.f14888a) && Arrays.equals(this.f14889b, o1Var.f14889b);
    }

    public final int hashCode() {
        return w8.k.c(this.f14888a, this.f14889b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.k(parcel, 1, this.f14888a, false);
        x8.c.k(parcel, 2, this.f14889b, false);
        x8.c.b(parcel, iA);
    }
}
