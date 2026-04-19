package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.d;
import l8.f;
import l8.g;
import w8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zbe extends d {
    private final g zba;

    public zbe(Context context, Looper looper, c cVar, g gVar, e.b bVar, e.c cVar2) {
        super(context, looper, 68, cVar, bVar, cVar2);
        f fVar = new f(gVar == null ? g.f14794d : gVar);
        fVar.a(zbat.zba());
        this.zba = new g(fVar);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof zbf ? (zbf) iInterfaceQueryLocalInterface : new zbf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.zba.a();
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
