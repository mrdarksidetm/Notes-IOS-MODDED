package t8;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import w8.k;

/* JADX INFO: loaded from: classes.dex */
public class d extends x8.a {
    public static final Parcelable.Creator<d> CREATOR = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    private final int f21321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f21322c;

    public d(String str, int i10, long j10) {
        this.f21320a = str;
        this.f21321b = i10;
        this.f21322c = j10;
    }

    public d(String str, long j10) {
        this.f21320a = str;
        this.f21322c = j10;
        this.f21321b = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((getName() != null && getName().equals(dVar.getName())) || (getName() == null && dVar.getName() == null)) && u() == dVar.u()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f21320a;
    }

    public final int hashCode() {
        return w8.k.c(getName(), Long.valueOf(u()));
    }

    public final String toString() {
        k.a aVarD = w8.k.d(this);
        aVarD.a("name", getName());
        aVarD.a(DiagnosticsEntry.VERSION_KEY, Long.valueOf(u()));
        return aVarD.toString();
    }

    public long u() {
        long j10 = this.f21322c;
        return j10 == -1 ? this.f21321b : j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, getName(), false);
        x8.c.s(parcel, 2, this.f21321b);
        x8.c.v(parcel, 3, u());
        x8.c.b(parcel, iA);
    }
}
