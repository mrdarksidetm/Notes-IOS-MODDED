package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n extends x8.a {
    public static final Parcelable.Creator<n> CREATOR = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f16061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f16062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f16063f;

    public n(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f16058a = z10;
        this.f16059b = z11;
        this.f16060c = z12;
        this.f16061d = z13;
        this.f16062e = z14;
        this.f16063f = z15;
    }

    public boolean A() {
        return this.f16058a;
    }

    public boolean B() {
        return this.f16062e;
    }

    public boolean C() {
        return this.f16059b;
    }

    public boolean u() {
        return this.f16063f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.g(parcel, 1, A());
        x8.c.g(parcel, 2, C());
        x8.c.g(parcel, 3, x());
        x8.c.g(parcel, 4, z());
        x8.c.g(parcel, 5, B());
        x8.c.g(parcel, 6, u());
        x8.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f16060c;
    }

    public boolean z() {
        return this.f16061d;
    }
}
