package a9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class b extends x8.a {
    public static final Parcelable.Creator<b> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f664b;

    public b(boolean z10, int i10) {
        this.f663a = z10;
        this.f664b = i10;
    }

    public boolean u() {
        return this.f663a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.g(parcel, 1, u());
        x8.c.s(parcel, 2, x());
        x8.c.b(parcel, iA);
    }

    public int x() {
        return this.f664b;
    }
}
