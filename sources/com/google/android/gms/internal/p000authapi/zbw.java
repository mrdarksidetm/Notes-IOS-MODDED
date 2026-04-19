package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.d;
import n8.b;
import n8.e;
import n8.f;

/* JADX INFO: loaded from: classes.dex */
public final class zbw extends zba {
    zbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbm zbmVar, b bVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbmVar);
        zbc.zbc(parcelZba, bVar);
        zbb(1, parcelZba);
    }

    public final void zbd(zbp zbpVar, e eVar, String str) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbpVar);
        zbc.zbc(parcelZba, eVar);
        parcelZba.writeString(str);
        zbb(4, parcelZba);
    }

    public final void zbe(zbr zbrVar, f fVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbrVar);
        zbc.zbc(parcelZba, fVar);
        zbb(3, parcelZba);
    }

    public final void zbf(d dVar, String str) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, dVar);
        parcelZba.writeString(str);
        zbb(2, parcelZba);
    }
}
