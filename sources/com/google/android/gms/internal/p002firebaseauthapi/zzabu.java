package com.google.android.gms.internal.p002firebaseauthapi;

import ba.h;
import ba.i;
import ca.c2;
import ca.g;
import ca.o1;
import ca.r1;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzabu extends zzady<i, o1> {
    private final zzahr zzu;

    public zzabu(h hVar) {
        super(2);
        m.l(hVar, "credential cannot be null");
        this.zzu = r1.a(hVar, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "linkFederatedCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzd.zze(), this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        g gVarZza = zzabj.zza(this.zzc, this.zzk);
        ((o1) this.zze).a(this.zzj, gVarZza);
        zzb(new c2(gVarZza));
    }
}
