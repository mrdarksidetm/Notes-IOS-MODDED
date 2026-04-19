package j8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a extends x8.a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f14082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f14083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f14084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f14085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f14086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f14087f;

    a(int i10, long j10, String str, int i11, int i12, String str2) {
        this.f14082a = i10;
        this.f14083b = j10;
        this.f14084c = (String) w8.m.k(str);
        this.f14085d = i11;
        this.f14086e = i12;
        this.f14087f = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return this.f14082a == aVar.f14082a && this.f14083b == aVar.f14083b && w8.k.b(this.f14084c, aVar.f14084c) && this.f14085d == aVar.f14085d && this.f14086e == aVar.f14086e && w8.k.b(this.f14087f, aVar.f14087f);
    }

    public int hashCode() {
        return w8.k.c(Integer.valueOf(this.f14082a), Long.valueOf(this.f14083b), this.f14084c, Integer.valueOf(this.f14085d), Integer.valueOf(this.f14086e), this.f14087f);
    }

    public String toString() {
        int i10 = this.f14085d;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        return "AccountChangeEvent {accountName = " + this.f14084c + ", changeType = " + str + ", changeData = " + this.f14087f + ", eventIndex = " + this.f14086e + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f14082a);
        x8.c.v(parcel, 2, this.f14083b);
        x8.c.C(parcel, 3, this.f14084c, false);
        x8.c.s(parcel, 4, this.f14085d);
        x8.c.s(parcel, 5, this.f14086e);
        x8.c.C(parcel, 6, this.f14087f, false);
        x8.c.b(parcel, iA);
    }
}
