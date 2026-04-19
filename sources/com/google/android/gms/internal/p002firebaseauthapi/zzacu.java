package com.google.android.gms.internal.p002firebaseauthapi;

import ba.i;
import ca.c2;
import ca.g;
import ca.o1;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zzacu extends zzady<i, o1> {
    public zzacu() {
        super(2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "unlinkEmailCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zze(this.zzd.zze(), this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        g gVarZza = zzabj.zza(this.zzc, this.zzk);
        ((o1) this.zze).a(this.zzj, gVarZza);
        zzb(new c2(gVarZza));
    }
}
