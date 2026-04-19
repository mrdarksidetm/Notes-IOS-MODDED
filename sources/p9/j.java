package p9;

import android.os.Parcel;
import android.os.Parcelable;
import w8.j0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends x8.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f18294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j0 f18295b;

    j(int i10, j0 j0Var) {
        this.f18294a = i10;
        this.f18295b = j0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f18294a);
        x8.c.A(parcel, 2, this.f18295b, i10, false);
        x8.c.b(parcel, iA);
    }
}
