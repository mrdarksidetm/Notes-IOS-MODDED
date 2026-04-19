package com.google.android.gms.internal.p002firebaseauthapi;

import ba.i;
import ca.c2;
import ca.g;
import ca.o1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzacc extends zzady<i, o1> {
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzacc(String str, String str2, String str3, String str4) {
        super(2);
        m.f(str, "email cannot be null or empty");
        m.f(str2, "password cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
        this.zzw = str3;
        this.zzx = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "reauthenticateWithEmailPasswordWithData";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zzb(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        g gVarZza = zzabj.zza(this.zzc, this.zzk);
        if (!this.zzd.d().equalsIgnoreCase(gVarZza.d())) {
            zza(new Status(17024));
        } else {
            ((o1) this.zze).a(this.zzj, gVarZza);
            zzb(new c2(gVarZza));
        }
    }
}
