package com.google.mlkit.vision.documentscanner.internal;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzaa;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzlq;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmk;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzml;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmm;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznu;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrk;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrm;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrn;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrv;
import wa.f;
import wa.i;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements ya.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f9059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f9060g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ya.b f9061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t8.d[] f9062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zzlq f9063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zzrk f9064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zzrm f9065e;

    public b(ya.b bVar) {
        zzrk zzrkVarZzb = zzrv.zzb("play-services-mlkit-document-scanner");
        zzrm zzrmVarZza = zzrm.zza(f.c().b());
        this.f9061a = bVar;
        this.f9063c = e.b(bVar);
        this.f9065e = zzrmVarZza;
        this.f9064d = zzrkVarZzb;
        zzaa zzaaVar = new zzaa();
        zzaaVar.zza(i.f22719u);
        if (bVar.e()) {
            zzaaVar.zza(i.f22721w);
        }
        if (bVar.f()) {
            zzaaVar.zza(i.f22720v);
        }
        this.f9062b = (t8.d[]) zzaaVar.zzb().toArray(new t8.d[0]);
    }

    private static void c(String str) {
        if (Log.isLoggable("GmsDocumentScannerImpl", 3)) {
            Log.d("GmsDocumentScannerImpl", str);
        }
    }

    private final void d(zzmk zzmkVar, long j10, long j11) throws Throwable {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzmm zzmmVar = new zzmm();
        zznu zznuVar = new zznu();
        zznuVar.zzc(Long.valueOf(jElapsedRealtime - j10));
        zznuVar.zzd(zzmkVar);
        zznuVar.zze(this.f9063c);
        zzmmVar.zzd(zznuVar.zzg());
        this.f9064d.zzc(zzrn.zze(zzmmVar), zzml.ON_DEVICE_DOCUMENT_SCANNER_UI_FINISH);
        this.f9065e.zzc(24335, zzmkVar.zza(), j11, jCurrentTimeMillis);
    }

    @Override // u8.b
    public final t8.d[] a() {
        return this.f9062b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x003e  */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    @Override // ya.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task<android.content.IntentSender> b(android.app.Activity r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.documentscanner.internal.b.b(android.app.Activity):com.google.android.gms.tasks.Task");
    }
}
