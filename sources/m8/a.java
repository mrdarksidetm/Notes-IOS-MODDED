package m8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a extends x8.a {
    public static final Parcelable.Creator<a> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f15475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f15477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15478d;

    a(int i10, boolean z10, long j10, boolean z11) {
        this.f15475a = i10;
        this.f15476b = z10;
        this.f15477c = j10;
        this.f15478d = z11;
    }

    public long u() {
        return this.f15477c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f15475a);
        x8.c.g(parcel, 2, z());
        x8.c.v(parcel, 3, u());
        x8.c.g(parcel, 4, x());
        x8.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f15478d;
    }

    public boolean z() {
        return this.f15476b;
    }
}
