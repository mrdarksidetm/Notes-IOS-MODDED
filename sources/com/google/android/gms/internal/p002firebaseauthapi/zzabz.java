package com.google.android.gms.internal.p002firebaseauthapi;

import ba.h;
import ca.g;
import ca.o1;
import ca.r1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzabz extends zzady<Void, o1> {
    private final zzahr zzu;

    public zzabz(h hVar, String str) {
        super(2);
        m.l(hVar, "credential cannot be null");
        this.zzu = r1.a(hVar, str).zza(false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "reauthenticateWithCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        g gVarZza = zzabj.zza(this.zzc, this.zzk);
        if (!this.zzd.d().equalsIgnoreCase(gVarZza.d())) {
            zza(new Status(17024));
        } else {
            ((o1) this.zze).a(this.zzj, gVarZza);
            zzb(null);
        }
    }
}
