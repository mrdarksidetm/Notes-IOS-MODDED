package com.google.android.gms.internal.p002firebaseauthapi;

import ba.e;
import ca.o1;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzacj extends zzady<Void, o1> {
    private final zzagg zzu;

    public zzacj(String str, e eVar) {
        super(6);
        m.f(str, "token cannot be null or empty");
        zzagg zzaggVar = new zzagg(4);
        this.zzu = zzaggVar;
        zzaggVar.zzd(str);
        if (eVar != null) {
            zzaggVar.zza(eVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(null);
    }
}
