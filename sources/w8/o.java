package w8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class o extends x8.a {
    public static final Parcelable.Creator<o> CREATOR = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22658e;

    public o(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f22654a = i10;
        this.f22655b = z10;
        this.f22656c = z11;
        this.f22657d = i11;
        this.f22658e = i12;
    }

    public boolean A() {
        return this.f22656c;
    }

    public int B() {
        return this.f22654a;
    }

    public int u() {
        return this.f22657d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, B());
        x8.c.g(parcel, 2, z());
        x8.c.g(parcel, 3, A());
        x8.c.s(parcel, 4, u());
        x8.c.s(parcel, 5, x());
        x8.c.b(parcel, iA);
    }

    public int x() {
        return this.f22658e;
    }

    public boolean z() {
        return this.f22655b;
    }
}
