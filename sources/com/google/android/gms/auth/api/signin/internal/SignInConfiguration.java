package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import r8.b;
import r8.y;
import w8.m;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends x8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f8368b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f8367a = m.e(str);
        this.f8368b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f8367a.equals(signInConfiguration.f8367a)) {
            GoogleSignInOptions googleSignInOptions = this.f8368b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f8368b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f8367a).a(this.f8368b).b();
    }

    public final GoogleSignInOptions u() {
        return this.f8368b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f8367a;
        int iA = c.a(parcel);
        c.C(parcel, 2, str, false);
        c.A(parcel, 5, this.f8368b, i10, false);
        c.b(parcel, iA);
    }
}
