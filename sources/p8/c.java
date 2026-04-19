package p8;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class c extends x8.a {
    public static final Parcelable.Creator<c> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f18279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f18282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Bundle f18283f;

    c(int i10, int i11, PendingIntent pendingIntent, int i12, Bundle bundle, byte[] bArr) {
        this.f18282e = i10;
        this.f18278a = i11;
        this.f18280c = i12;
        this.f18283f = bundle;
        this.f18281d = bArr;
        this.f18279b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f18278a);
        x8.c.A(parcel, 2, this.f18279b, i10, false);
        x8.c.s(parcel, 3, this.f18280c);
        x8.c.j(parcel, 4, this.f18283f, false);
        x8.c.k(parcel, 5, this.f18281d, false);
        x8.c.s(parcel, 1000, this.f18282e);
        x8.c.b(parcel, iA);
    }
}
