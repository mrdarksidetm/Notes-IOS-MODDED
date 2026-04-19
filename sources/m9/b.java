package m9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import java.util.List;
import m9.c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class b extends x8.a {
    public static final Parcelable.Creator<b> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f15519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f15520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f15521d;

    b(int i10, byte[] bArr, String str, List list) {
        this.f15518a = i10;
        this.f15519b = bArr;
        try {
            this.f15520c = c.a(str);
            this.f15521d = list;
        } catch (c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public int A() {
        return this.f15518a;
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Arrays.equals(this.f15519b, bVar.f15519b) || !this.f15520c.equals(bVar.f15520c)) {
            return false;
        }
        List list2 = this.f15521d;
        if (list2 == null && bVar.f15521d == null) {
            return true;
        }
        return list2 != null && (list = bVar.f15521d) != null && list2.containsAll(list) && bVar.f15521d.containsAll(this.f15521d);
    }

    public int hashCode() {
        return w8.k.c(Integer.valueOf(Arrays.hashCode(this.f15519b)), this.f15520c, this.f15521d);
    }

    public String toString() {
        List list = this.f15521d;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", e9.c.c(this.f15519b), this.f15520c, list == null ? "null" : list.toString());
    }

    public byte[] u() {
        return this.f15519b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, A());
        x8.c.k(parcel, 2, u(), false);
        x8.c.C(parcel, 3, this.f15520c.toString(), false);
        x8.c.G(parcel, 4, z(), false);
        x8.c.b(parcel, iA);
    }

    public c x() {
        return this.f15520c;
    }

    public List<Transport> z() {
        return this.f15521d;
    }
}
