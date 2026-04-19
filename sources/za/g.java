package za;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzsf;
import v8.h;
import wa.i;

/* JADX INFO: loaded from: classes2.dex */
final class g extends com.google.android.gms.common.internal.d {
    g(Context context, Looper looper, w8.c cVar, v8.d dVar, h hVar) {
        super(context, looper, 362, cVar, dVar, hVar);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return zzsf.zzb(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final t8.d[] getApiFeatures() {
        return new t8.d[]{i.f22719u};
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getServiceDescriptor() {
        return "com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getStartServiceAction() {
        return "com.google.android.gms.mlkit.docscan.ui.DocumentScanningChimeraService.START";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean usesClientTelemetry() {
        return true;
    }
}
