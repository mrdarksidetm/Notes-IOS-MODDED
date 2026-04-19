package c9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends x8.a {
    public static final Parcelable.Creator<d> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f6597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f6598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f6599c;

    d(int i10, String str, int i11) {
        this.f6597a = i10;
        this.f6598b = str;
        this.f6599c = i11;
    }

    d(String str, int i10) {
        this.f6597a = 1;
        this.f6598b = str;
        this.f6599c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f6597a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.C(parcel, 2, this.f6598b, false);
        x8.c.s(parcel, 3, this.f6599c);
        x8.c.b(parcel, iA);
    }
}
