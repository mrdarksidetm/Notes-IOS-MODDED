package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends x8.a {
    public static final Parcelable.Creator<z1> CREATOR = new a2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f14960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f14961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f14962d;

    z1(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14959a = j10;
        this.f14960b = (byte[]) w8.m.k(bArr);
        this.f14961c = (byte[]) w8.m.k(bArr2);
        this.f14962d = (byte[]) w8.m.k(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f14959a == z1Var.f14959a && Arrays.equals(this.f14960b, z1Var.f14960b) && Arrays.equals(this.f14961c, z1Var.f14961c) && Arrays.equals(this.f14962d, z1Var.f14962d);
    }

    public final int hashCode() {
        return w8.k.c(Long.valueOf(this.f14959a), this.f14960b, this.f14961c, this.f14962d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.v(parcel, 1, this.f14959a);
        x8.c.k(parcel, 2, this.f14960b, false);
        x8.c.k(parcel, 3, this.f14961c, false);
        x8.c.k(parcel, 4, this.f14962d, false);
        x8.c.b(parcel, iA);
    }
}
