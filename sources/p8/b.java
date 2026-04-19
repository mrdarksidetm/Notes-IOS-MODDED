package p8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class b extends x8.a {
    public static final Parcelable.Creator<b> CREATOR = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f18263g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f18264h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18265i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18266j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f18267k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f18268l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f18269m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f18270n = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f18271o = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f18276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Bundle f18277f;

    b(int i10, String str, int i11, long j10, byte[] bArr, Bundle bundle) {
        this.f18276e = i10;
        this.f18272a = str;
        this.f18273b = i11;
        this.f18274c = j10;
        this.f18275d = bArr;
        this.f18277f = bundle;
    }

    public String toString() {
        return "ProxyRequest[ url: " + this.f18272a + ", method: " + this.f18273b + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, this.f18272a, false);
        x8.c.s(parcel, 2, this.f18273b);
        x8.c.v(parcel, 3, this.f18274c);
        x8.c.k(parcel, 4, this.f18275d, false);
        x8.c.j(parcel, 5, this.f18277f, false);
        x8.c.s(parcel, 1000, this.f18276e);
        x8.c.b(parcel, iA);
    }
}
