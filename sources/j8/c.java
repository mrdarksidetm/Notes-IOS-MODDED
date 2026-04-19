package j8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends x8.a {
    public static final Parcelable.Creator<c> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f14092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List f14093b;

    c(int i10, List list) {
        this.f14092a = i10;
        this.f14093b = (List) w8.m.k(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f14092a);
        x8.c.G(parcel, 2, this.f14093b, false);
        x8.c.b(parcel, iA);
    }
}
