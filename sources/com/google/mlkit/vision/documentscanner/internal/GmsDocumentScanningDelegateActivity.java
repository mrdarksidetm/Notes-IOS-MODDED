package com.google.mlkit.vision.documentscanner.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzlq;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmk;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzml;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmm;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznu;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrk;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrm;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrn;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrv;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.vision.documentscanner.internal.GmsDocumentScanningDelegateActivity;
import java.util.List;
import wa.f;
import ya.d;

/* JADX INFO: loaded from: classes2.dex */
public class GmsDocumentScanningDelegateActivity extends androidx.activity.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzrk f9053a = zzrv.zzb("play-services-mlkit-document-scanner");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zzrm f9054b = zzrm.zza(f.c().b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zzlq f9055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f9056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9057e;

    static Intent F(Context context, Intent intent) {
        Intent action = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_DOCUMENT");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i10 = applicationInfo.labelRes;
        return action.putExtra("string_extra_calling_app_name", i10 != 0 ? context.getString(i10) : context.getPackageManager().getApplicationLabel(applicationInfo).toString()).putExtras(intent).setFlags(1);
    }

    private final void I() throws Throwable {
        setResult(0);
        J(zzmk.CANCELLED, 0);
        finish();
    }

    private final void J(zzmk zzmkVar, int i10) throws Throwable {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzmm zzmmVar = new zzmm();
        zznu zznuVar = new zznu();
        zznuVar.zzc(Long.valueOf(jElapsedRealtime - this.f9056d));
        zznuVar.zzd(zzmkVar);
        zznuVar.zze(this.f9055c);
        zznuVar.zzf(Integer.valueOf(i10));
        zzmmVar.zzd(zznuVar.zzg());
        this.f9053a.zzc(zzrn.zze(zzmmVar), zzml.ON_DEVICE_DOCUMENT_SCANNER_UI_FINISH);
        this.f9054b.zzc(24335, zzmkVar.zza(), this.f9057e, jCurrentTimeMillis);
    }

    final /* synthetic */ void G(ya.d dVar) throws Throwable {
        if (dVar == null) {
            I();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("extra_scanning_result", dVar);
        setResult(-1, intent);
        List<d.a> listA = dVar.a();
        d.b bVarB = dVar.b();
        J(zzmk.NO_ERROR, listA != null ? listA.size() : bVarB != null ? bVarB.a() : 0);
        finish();
    }

    final /* synthetic */ void H(Exception exc) throws Throwable {
        if (Log.isLoggable("GmsDocScanDelAct", 6)) {
            Log.e("GmsDocScanDelAct", "Failed to handle scanning result", exc);
        }
        I();
    }

    @Override // androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        this.f9055c = e.a(getIntent());
        h.d dVarRegisterForActivityResult = registerForActivityResult(new i.f(), new h.b() { // from class: za.a
            @Override // h.b
            public final void onActivityResult(Object obj) {
                final GmsDocumentScanningDelegateActivity gmsDocumentScanningDelegateActivity = this.f24300a;
                h.a aVar = (h.a) obj;
                c.c(gmsDocumentScanningDelegateActivity.getApplicationContext()).b(aVar.b(), aVar.a()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.mlkit.vision.documentscanner.internal.c
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj2) throws Throwable {
                        gmsDocumentScanningDelegateActivity.G((ya.d) obj2);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.vision.documentscanner.internal.d
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) throws Throwable {
                        gmsDocumentScanningDelegateActivity.H(exc);
                    }
                });
            }
        });
        if (bundle != null) {
            this.f9056d = bundle.getLong("elapsedStartTimeMsKey");
            this.f9057e = bundle.getLong("epochStartTimeMsKey");
            return;
        }
        this.f9056d = SystemClock.elapsedRealtime();
        this.f9057e = System.currentTimeMillis();
        zzrk zzrkVar = this.f9053a;
        zzmm zzmmVar = new zzmm();
        zznu zznuVar = new zznu();
        zznuVar.zze(this.f9055c);
        zzmmVar.zze(zznuVar.zzg());
        zzrkVar.zzc(zzrn.zze(zzmmVar), zzml.ON_DEVICE_DOCUMENT_SCANNER_UI_START);
        dVarRegisterForActivityResult.a(F(this, getIntent()));
    }

    @Override // androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("elapsedStartTimeMsKey", this.f9056d);
        bundle.putLong("epochStartTimeMsKey", this.f9057e);
    }
}
