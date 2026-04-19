package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
final class l implements w8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f8597a;

    l(IBinder iBinder) {
        this.f8597a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8597a;
    }

    @Override // w8.h
    public final void n(w8.g gVar, c cVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
            if (cVar != null) {
                parcelObtain.writeInt(1);
                u.a(cVar, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f8597a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
