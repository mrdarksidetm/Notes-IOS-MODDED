package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.os.b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import w8.i;
import wa.c;
import wa.e;
import wa.j;

/* JADX INFO: loaded from: classes.dex */
public final class zzrk {
    private static zzad zza;
    private static final zzaf zzb = zzaf.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzrd zze;
    private final j zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzrk(Context context, final j jVar, zzrd zzrdVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = jVar;
        this.zze = zzrdVar;
        zzrw.zza();
        this.zzi = str;
        this.zzg = e.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzri
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        });
        e eVarA = e.a();
        Objects.requireNonNull(jVar);
        this.zzh = eVarA.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzrj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return jVar.a();
            }
        });
        zzaf zzafVar = zzb;
        this.zzj = zzafVar.containsKey(str) ? DynamiteModule.b(context, (String) zzafVar.get(str)) : -1;
    }

    private static synchronized zzad zzd() {
        zzad zzadVar = zza;
        if (zzadVar != null) {
            return zzadVar;
        }
        androidx.core.os.c cVarA = b.a(Resources.getSystem().getConfiguration());
        zzaa zzaaVar = new zzaa();
        for (int i10 = 0; i10 < cVarA.g(); i10++) {
            zzaaVar.zza(c.b(cVarA.c(i10)));
        }
        zzad zzadVarZzb = zzaaVar.zzb();
        zza = zzadVarZzb;
        return zzadVarZzb;
    }

    final /* synthetic */ String zza() {
        return i.a().b(this.zzi);
    }

    final /* synthetic */ void zzb(zzrc zzrcVar, zzml zzmlVar, String str) {
        zzrcVar.zza(zzmlVar);
        String strZzc = zzrcVar.zzc();
        zzqc zzqcVar = new zzqc();
        zzqcVar.zzb(this.zzc);
        zzqcVar.zzc(this.zzd);
        zzqcVar.zzh(zzd());
        zzqcVar.zzg(Boolean.TRUE);
        zzqcVar.zzl(strZzc);
        zzqcVar.zzj(str);
        zzqcVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzqcVar.zzd(10);
        zzqcVar.zzk(Integer.valueOf(this.zzj));
        zzrcVar.zzb(zzqcVar);
        this.zze.zza(zzrcVar);
    }

    public final void zzc(final zzrc zzrcVar, final zzml zzmlVar) throws Throwable {
        final String strB;
        if (this.zzg.isSuccessful()) {
            strB = (String) this.zzg.getResult();
        } else {
            strB = i.a().b(this.zzi);
        }
        e.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzrh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzrcVar, zzmlVar, strB);
            }
        });
    }
}
