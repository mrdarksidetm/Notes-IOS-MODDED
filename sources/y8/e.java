package y8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.base.zaf;
import v8.h;
import w8.t;

/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f23553a;

    public e(Context context, Looper looper, w8.c cVar, t tVar, v8.d dVar, h hVar) {
        super(context, looper, 270, cVar, dVar, hVar);
        this.f23553a = tVar;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final t8.d[] getApiFeatures() {
        return zaf.zab;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.f23553a.b();
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final boolean getUseDynamicLookup() {
        return true;
    }
}
