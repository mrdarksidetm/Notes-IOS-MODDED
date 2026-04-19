package r8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a extends x8.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f19212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f19214c;

    a(int i10, int i11, Bundle bundle) {
        this.f19212a = i10;
        this.f19213b = i11;
        this.f19214c = bundle;
    }

    public int u() {
        return this.f19213b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f19212a);
        x8.c.s(parcel, 2, u());
        x8.c.j(parcel, 3, this.f19214c, false);
        x8.c.b(parcel, iA);
    }
}
