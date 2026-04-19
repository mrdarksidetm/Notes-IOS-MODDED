package n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class q extends x8.a {
    public static final Parcelable.Creator<q> CREATOR = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<j0> f16069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16070b;

    public q(List<j0> list, int i10) {
        this.f16069a = list;
        this.f16070b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return w8.k.b(this.f16069a, qVar.f16069a) && this.f16070b == qVar.f16070b;
    }

    public int hashCode() {
        return w8.k.c(this.f16069a, Integer.valueOf(this.f16070b));
    }

    public int u() {
        return this.f16070b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        w8.m.k(parcel);
        int iA = x8.c.a(parcel);
        x8.c.G(parcel, 1, this.f16069a, false);
        x8.c.s(parcel, 2, u());
        x8.c.b(parcel, iA);
    }
}
