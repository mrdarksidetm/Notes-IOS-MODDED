package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s extends x8.a {
    public static final Parcelable.Creator<s> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bundle f8609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    t8.d[] f8610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f8611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    w8.d f8612d;

    public s() {
    }

    s(Bundle bundle, t8.d[] dVarArr, int i10, w8.d dVar) {
        this.f8609a = bundle;
        this.f8610b = dVarArr;
        this.f8611c = i10;
        this.f8612d = dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.j(parcel, 1, this.f8609a, false);
        x8.c.F(parcel, 2, this.f8610b, i10, false);
        x8.c.s(parcel, 3, this.f8611c);
        x8.c.A(parcel, 4, this.f8612d, i10, false);
        x8.c.b(parcel, iA);
    }
}
