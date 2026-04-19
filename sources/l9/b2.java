package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b2 extends x8.a {
    public static final Parcelable.Creator<b2> CREATOR = new c2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f14816a;

    public b2(List list) {
        this.f14816a = (List) w8.m.k(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.f14816a.containsAll(b2Var.f14816a) && b2Var.f14816a.containsAll(this.f14816a);
    }

    public final int hashCode() {
        return w8.k.c(new HashSet(this.f14816a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.G(parcel, 1, this.f14816a, false);
        x8.c.b(parcel, iA);
    }
}
