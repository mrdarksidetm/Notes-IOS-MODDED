package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.f;

/* JADX INFO: loaded from: classes.dex */
public class c extends x8.a {
    public static final Parcelable.Creator<c> CREATOR = new u();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final Scope[] f8566o = new Scope[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final t8.d[] f8567p = new t8.d[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f8569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f8570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f8571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IBinder f8572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Scope[] f8573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f8574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Account f8575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    t8.d[] f8576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    t8.d[] f8577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f8578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f8579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f8580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8581n;

    c(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, t8.d[] dVarArr, t8.d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f8566o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? f8567p : dVarArr;
        dVarArr2 = dVarArr2 == null ? f8567p : dVarArr2;
        this.f8568a = i10;
        this.f8569b = i11;
        this.f8570c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f8571d = "com.google.android.gms";
        } else {
            this.f8571d = str;
        }
        if (i10 < 2) {
            this.f8575h = iBinder != null ? a.c(f.a.b(iBinder)) : null;
        } else {
            this.f8572e = iBinder;
            this.f8575h = account;
        }
        this.f8573f = scopeArr;
        this.f8574g = bundle;
        this.f8576i = dVarArr;
        this.f8577j = dVarArr2;
        this.f8578k = z10;
        this.f8579l = i13;
        this.f8580m = z11;
        this.f8581n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        u.a(this, parcel, i10);
    }

    public final String zza() {
        return this.f8581n;
    }
}
