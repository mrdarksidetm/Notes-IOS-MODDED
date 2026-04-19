package com.google.android.gms.internal.p002firebaseauthapi;

import ba.i;
import ba.o0;
import ca.c2;
import ca.g;
import ca.o1;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzabx extends zzady<i, o1> {
    private final o0 zzu;

    public zzabx(o0 o0Var) {
        super(2);
        m.l(o0Var, "credential cannot be null");
        this.zzu = o0Var;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "linkPhoneAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(new zzagp(this.zzd.zze(), zzaeq.zza(this.zzu)), this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        g gVarZza = zzabj.zza(this.zzc, this.zzk);
        ((o1) this.zze).a(this.zzj, gVarZza);
        zzb(new c2(gVarZza));
    }
}
