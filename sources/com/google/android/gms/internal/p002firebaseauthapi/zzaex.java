package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import u8.a;

/* JADX INFO: loaded from: classes.dex */
final class zzaex extends zzade {
    private final String zza;
    private final /* synthetic */ zzaew zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaex(zzaew zzaewVar, zzade zzadeVar, String str) {
        super(zzadeVar);
        this.zzb = zzaewVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzade
    public final void zza(Status status) {
        zzaew.zza.c("SMS verification code request failed: " + a.a(status.x()) + " " + status.z(), new Object[0]);
        zzaez zzaezVar = (zzaez) this.zzb.zzd.get(this.zza);
        if (zzaezVar == null) {
            return;
        }
        Iterator<zzade> it = zzaezVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(status);
        }
        this.zzb.zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzade
    public final void zzb(String str) {
        zzaew.zza.a("onCodeSent", new Object[0]);
        zzaez zzaezVar = (zzaez) this.zzb.zzd.get(this.zza);
        if (zzaezVar == null) {
            return;
        }
        Iterator<zzade> it = zzaezVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzaezVar.zzg = true;
        zzaezVar.zzd = str;
        if (zzaezVar.zza <= 0) {
            this.zzb.zzb(this.zza);
        } else if (!zzaezVar.zzc) {
            this.zzb.zze(this.zza);
        } else {
            if (zzag.zzc(zzaezVar.zze)) {
                return;
            }
            zzaew.zza(this.zzb, this.zza);
        }
    }
}
