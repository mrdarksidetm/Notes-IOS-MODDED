package m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m9.c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class d extends x8.a {
    public static final Parcelable.Creator<d> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f15528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f15529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15530d;

    d(int i10, String str, byte[] bArr, String str2) {
        this.f15527a = i10;
        try {
            this.f15528b = c.a(str);
            this.f15529c = bArr;
            this.f15530d = str2;
        } catch (c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Arrays.equals(this.f15529c, dVar.f15529c) || this.f15528b != dVar.f15528b) {
            return false;
        }
        String str = this.f15530d;
        String str2 = dVar.f15530d;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.f15529c) + 31) * 31) + this.f15528b.hashCode();
        String str = this.f15530d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String u() {
        return this.f15530d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, z());
        x8.c.C(parcel, 2, this.f15528b.toString(), false);
        x8.c.k(parcel, 3, x(), false);
        x8.c.C(parcel, 4, u(), false);
        x8.c.b(parcel, iA);
    }

    public byte[] x() {
        return this.f15529c;
    }

    public int z() {
        return this.f15527a;
    }
}
