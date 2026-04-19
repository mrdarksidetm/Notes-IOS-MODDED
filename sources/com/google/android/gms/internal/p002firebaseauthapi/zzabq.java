package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import ba.c0;
import ca.k0;
import ca.o1;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzabq extends zzady<c0, o1> {
    private final String zzu;

    public zzabq(String str) {
        super(1);
        m.f(str, "refresh token cannot be null");
        this.zzu = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zzb(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzu);
        }
        ((o1) this.zze).a(this.zzj, this.zzd);
        zzb(k0.a(this.zzj.zzc()));
    }
}
