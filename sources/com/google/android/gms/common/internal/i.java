package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f;

/* JADX INFO: loaded from: classes.dex */
public final class i extends x8.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final IBinder f8590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t8.b f8591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8593e;

    i(int i10, IBinder iBinder, t8.b bVar, boolean z10, boolean z11) {
        this.f8589a = i10;
        this.f8590b = iBinder;
        this.f8591c = bVar;
        this.f8592d = z10;
        this.f8593e = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8591c.equals(iVar.f8591c) && w8.k.b(x(), iVar.x());
    }

    public final t8.b u() {
        return this.f8591c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f8589a);
        x8.c.r(parcel, 2, this.f8590b, false);
        x8.c.A(parcel, 3, this.f8591c, i10, false);
        x8.c.g(parcel, 4, this.f8592d);
        x8.c.g(parcel, 5, this.f8593e);
        x8.c.b(parcel, iA);
    }

    public final f x() {
        IBinder iBinder = this.f8590b;
        if (iBinder == null) {
            return null;
        }
        return f.a.b(iBinder);
    }
}
