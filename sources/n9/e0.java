package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends x8.a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16031d;

    e0(int i10, int i11, long j10, long j11) {
        this.f16028a = i10;
        this.f16029b = i11;
        this.f16030c = j10;
        this.f16031d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f16028a == e0Var.f16028a && this.f16029b == e0Var.f16029b && this.f16030c == e0Var.f16030c && this.f16031d == e0Var.f16031d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return w8.k.c(Integer.valueOf(this.f16029b), Integer.valueOf(this.f16028a), Long.valueOf(this.f16031d), Long.valueOf(this.f16030c));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f16028a + " Cell status: " + this.f16029b + " elapsed time NS: " + this.f16031d + " system time ms: " + this.f16030c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f16028a);
        x8.c.s(parcel, 2, this.f16029b);
        x8.c.v(parcel, 3, this.f16030c);
        x8.c.v(parcel, 4, this.f16031d);
        x8.c.b(parcel, iA);
    }
}
