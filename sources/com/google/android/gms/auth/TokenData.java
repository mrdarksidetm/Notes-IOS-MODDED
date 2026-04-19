package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import w8.k;
import w8.m;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public class TokenData extends x8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f8284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f8287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8288g;

    TokenData(int i10, String str, Long l10, boolean z10, boolean z11, List list, String str2) {
        this.f8282a = i10;
        this.f8283b = m.e(str);
        this.f8284c = l10;
        this.f8285d = z10;
        this.f8286e = z11;
        this.f8287f = list;
        this.f8288g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f8283b, tokenData.f8283b) && k.b(this.f8284c, tokenData.f8284c) && this.f8285d == tokenData.f8285d && this.f8286e == tokenData.f8286e && k.b(this.f8287f, tokenData.f8287f) && k.b(this.f8288g, tokenData.f8288g);
    }

    public final int hashCode() {
        return k.c(this.f8283b, this.f8284c, Boolean.valueOf(this.f8285d), Boolean.valueOf(this.f8286e), this.f8287f, this.f8288g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.f8282a);
        c.C(parcel, 2, this.f8283b, false);
        c.x(parcel, 3, this.f8284c, false);
        c.g(parcel, 4, this.f8285d);
        c.g(parcel, 5, this.f8286e);
        c.E(parcel, 6, this.f8287f, false);
        c.C(parcel, 7, this.f8288g, false);
        c.b(parcel, iA);
    }

    public final String zza() {
        return this.f8283b;
    }
}
