package p9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l extends x8.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f18296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t8.b f18297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.internal.i f18298c;

    l(int i10, t8.b bVar, com.google.android.gms.common.internal.i iVar) {
        this.f18296a = i10;
        this.f18297b = bVar;
        this.f18298c = iVar;
    }

    public final t8.b u() {
        return this.f18297b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f18296a);
        x8.c.A(parcel, 2, this.f18297b, i10, false);
        x8.c.A(parcel, 3, this.f18298c, i10, false);
        x8.c.b(parcel, iA);
    }

    public final com.google.android.gms.common.internal.i x() {
        return this.f18298c;
    }
}
