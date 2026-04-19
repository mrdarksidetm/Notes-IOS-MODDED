package a9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class g extends x8.a {
    public static final Parcelable.Creator<g> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f673b;

    public g(int i10) {
        this(i10, false);
    }

    public g(int i10, boolean z10) {
        this.f672a = i10;
        this.f673b = z10;
    }

    public int u() {
        return this.f672a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, u());
        x8.c.g(parcel, 2, this.f673b);
        x8.c.b(parcel, iA);
    }

    public final boolean x() {
        return this.f673b;
    }
}
