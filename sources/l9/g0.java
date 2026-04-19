package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends x8.a {
    public static final Parcelable.Creator<g0> CREATOR = new i1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f14858a;

    g0(List list) {
        this.f14858a = list;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        List list2 = this.f14858a;
        return (list2 == null && g0Var.f14858a == null) || (list2 != null && (list = g0Var.f14858a) != null && list2.containsAll(list) && g0Var.f14858a.containsAll(this.f14858a));
    }

    public int hashCode() {
        return w8.k.c(new HashSet(this.f14858a));
    }

    public List<h0> u() {
        return this.f14858a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.G(parcel, 1, u(), false);
        x8.c.b(parcel, iA);
    }
}
