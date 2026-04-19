package com.google.android.gms.internal.p002firebaseauthapi;

import ba.u0;
import ca.o1;
import ca.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzabp extends zzady<u0, o1> {
    private final String zzu;
    private final String zzv;

    public zzabp(String str, String str2) {
        super(3);
        m.f(str, "email cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zze(this.zzu, this.zzv, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(new s(this.zzl.zza() == null ? zzal.zzh() : (List) m.k(this.zzl.zza())));
    }
}
