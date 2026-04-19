package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends x8.a {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[][] f14917a;

    public r0(byte[][] bArr) {
        w8.m.a(bArr != null);
        w8.m.a(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            w8.m.a(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            w8.m.a(bArr[i11] != null);
            int length = bArr[i11].length;
            w8.m.a(length == 32 || length == 64);
            i10 += 2;
        }
        this.f14917a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            return Arrays.deepEquals(this.f14917a, ((r0) obj).f14917a);
        }
        return false;
    }

    public final int hashCode() {
        int iC = 0;
        for (byte[] bArr : this.f14917a) {
            iC ^= w8.k.c(bArr);
        }
        return iC;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.l(parcel, 1, this.f14917a, false);
        x8.c.b(parcel, iA);
    }
}
