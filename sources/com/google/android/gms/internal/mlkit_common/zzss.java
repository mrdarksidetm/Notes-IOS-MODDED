package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.os.b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import w8.i;
import wa.c;
import wa.e;
import wa.h;
import wa.j;

/* JADX INFO: loaded from: classes.dex */
public final class zzss {
    private static zzaq zza;
    private static final zzat zzb = zzat.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzsk zze;
    private final j zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzss(Context context, final j jVar, zzsk zzskVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = jVar;
        this.zze = zzskVar;
        zztg.zza();
        this.zzi = str;
        this.zzg = e.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        });
        e eVarA = e.a();
        jVar.getClass();
        this.zzh = eVarA.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return jVar.a();
            }
        });
        zzat zzatVar = zzb;
        this.zzj = zzatVar.containsKey(str) ? DynamiteModule.b(context, (String) zzatVar.get(str)) : -1;
    }

    private static synchronized zzaq zzh() {
        zzaq zzaqVar = zza;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        androidx.core.os.c cVarA = b.a(Resources.getSystem().getConfiguration());
        zzan zzanVar = new zzan();
        for (int i10 = 0; i10 < cVarA.g(); i10++) {
            zzanVar.zzb(c.b(cVarA.c(i10)));
        }
        zzaq zzaqVarZzc = zzanVar.zzc();
        zza = zzaqVarZzc;
        return zzaqVarZzc;
    }

    private final zzre zzi(String str, String str2) {
        zzre zzreVar = new zzre();
        zzreVar.zzb(this.zzc);
        zzreVar.zzc(this.zzd);
        zzreVar.zzh(zzh());
        zzreVar.zzg(Boolean.TRUE);
        zzreVar.zzl(str);
        zzreVar.zzj(str2);
        zzreVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzreVar.zzd(10);
        zzreVar.zzk(Integer.valueOf(this.zzj));
        return zzreVar;
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return i.a().b(this.zzi);
    }

    final /* synthetic */ String zza() {
        return i.a().b(this.zzi);
    }

    final /* synthetic */ void zzb(zzsj zzsjVar, zzng zzngVar, String str) {
        zzsjVar.zza(zzngVar);
        zzsjVar.zzc(zzi(zzsjVar.zzd(), str));
        this.zze.zza(zzsjVar);
    }

    final /* synthetic */ void zzc(zzsj zzsjVar, zzsu zzsuVar, va.b bVar) {
        zzsjVar.zza(zzng.MODEL_DOWNLOAD);
        zzsjVar.zzc(zzi(zzsuVar.zze(), zzj()));
        zzsjVar.zzb(zzte.zza(bVar, this.zzf, zzsuVar));
        this.zze.zza(zzsjVar);
    }

    public final void zzd(final zzsj zzsjVar, final zzng zzngVar) {
        final String strZzj = zzj();
        e.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzso
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzsjVar, zzngVar, strZzj);
            }
        });
    }

    public final void zze(zzsj zzsjVar, va.b bVar, boolean z10, int i10) {
        zzst zzstVarZzh = zzsu.zzh();
        zzstVarZzh.zzf(false);
        zzstVarZzh.zzd(bVar.c());
        zzstVarZzh.zza(zznl.FAILED);
        zzstVarZzh.zzb(zznf.DOWNLOAD_FAILED);
        zzstVarZzh.zzc(i10);
        zzg(zzsjVar, bVar, zzstVarZzh.zzh());
    }

    public final void zzf(zzsj zzsjVar, va.b bVar, zznf zznfVar, boolean z10, h hVar, zznl zznlVar) {
        zzst zzstVarZzh = zzsu.zzh();
        zzstVarZzh.zzf(z10);
        zzstVarZzh.zzd(hVar);
        zzstVarZzh.zzb(zznfVar);
        zzstVarZzh.zza(zznlVar);
        zzg(zzsjVar, bVar, zzstVarZzh.zzh());
    }

    public final void zzg(final zzsj zzsjVar, final va.b bVar, final zzsu zzsuVar) {
        e.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzsjVar, zzsuVar, bVar);
            }
        });
    }
}
