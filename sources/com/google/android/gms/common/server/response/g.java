package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends x8.a {
    public static final Parcelable.Creator<g> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f8654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a.C0179a f8655c;

    g(int i10, String str, a.C0179a c0179a) {
        this.f8653a = i10;
        this.f8654b = str;
        this.f8655c = c0179a;
    }

    g(String str, a.C0179a c0179a) {
        this.f8653a = 1;
        this.f8654b = str;
        this.f8655c = c0179a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8653a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.C(parcel, 2, this.f8654b, false);
        x8.c.A(parcel, 3, this.f8655c, i10, false);
        x8.c.b(parcel, iA);
    }
}
