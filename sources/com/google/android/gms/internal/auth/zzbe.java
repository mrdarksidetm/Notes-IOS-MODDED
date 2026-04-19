package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import l8.b;
import v8.h;
import w8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe extends d {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, c cVar, l8.c cVar2, v8.d dVar, h hVar) {
        super(context, looper, 16, cVar, dVar, hVar);
        this.zze = cVar2 == null ? new Bundle() : cVar2.a();
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        c clientSettings = getClientSettings();
        return (TextUtils.isEmpty(clientSettings.c()) || clientSettings.f(b.f14786a).isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean usesClientTelemetry() {
        return true;
    }
}
