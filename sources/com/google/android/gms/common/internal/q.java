package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class q extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f8606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ b f8607h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b bVar, int i10, IBinder iBinder, Bundle bundle) {
        super(bVar, i10, bundle);
        this.f8607h = bVar;
        this.f8606g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.k
    protected final void f(t8.b bVar) {
        if (this.f8607h.zzx != null) {
            this.f8607h.zzx.b(bVar);
        }
        this.f8607h.onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.k
    protected final boolean g() {
        String str;
        String interfaceDescriptor;
        try {
            IBinder iBinder = this.f8606g;
            w8.m.k(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f8607h.getServiceDescriptor().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f8607h.getServiceDescriptor() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface iInterfaceCreateServiceInterface = this.f8607h.createServiceInterface(this.f8606g);
        if (iInterfaceCreateServiceInterface == null || !(b.zzn(this.f8607h, 2, 4, iInterfaceCreateServiceInterface) || b.zzn(this.f8607h, 3, 4, iInterfaceCreateServiceInterface))) {
            return false;
        }
        this.f8607h.zzB = null;
        b bVar = this.f8607h;
        Bundle connectionHint = bVar.getConnectionHint();
        if (bVar.zzw == null) {
            return true;
        }
        this.f8607h.zzw.f(connectionHint);
        return true;
    }
}
