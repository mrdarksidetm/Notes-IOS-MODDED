package w8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class j extends x8.a {
    public static final Parcelable.Creator<j> CREATOR = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f22634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f22636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f22638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f22639i;

    public j(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f22631a = i10;
        this.f22632b = i11;
        this.f22633c = i12;
        this.f22634d = j10;
        this.f22635e = j11;
        this.f22636f = str;
        this.f22637g = str2;
        this.f22638h = i13;
        this.f22639i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f22631a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.s(parcel, 2, this.f22632b);
        x8.c.s(parcel, 3, this.f22633c);
        x8.c.v(parcel, 4, this.f22634d);
        x8.c.v(parcel, 5, this.f22635e);
        x8.c.C(parcel, 6, this.f22636f, false);
        x8.c.C(parcel, 7, this.f22637g, false);
        x8.c.s(parcel, 8, this.f22638h);
        x8.c.s(parcel, 9, this.f22639i);
        x8.c.b(parcel, iA);
    }
}
