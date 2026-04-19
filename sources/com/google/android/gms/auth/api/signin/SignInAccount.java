package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends x8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    final String f8362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f8363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    final String f8364c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f8363b = googleSignInAccount;
        this.f8362a = m.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.f8364c = m.f(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount u() {
        return this.f8363b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f8362a;
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 4, str, false);
        x8.c.A(parcel, 7, this.f8363b, i10, false);
        x8.c.C(parcel, 8, this.f8364c, false);
        x8.c.b(parcel, iA);
    }
}
