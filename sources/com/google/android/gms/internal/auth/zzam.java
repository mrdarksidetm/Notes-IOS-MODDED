package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.d;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import j8.k;
import w8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzam extends d {
    public zzam(Context context, Looper looper, c cVar, e.b bVar, e.c cVar2) {
        super(context, looper, R.styleable.AppCompatTheme_windowFixedHeightMajor, cVar, bVar, cVar2);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return k8.e.b(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final t8.d[] getApiFeatures() {
        return new t8.d[]{k.f14108n};
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean usesClientTelemetry() {
        return true;
    }
}
