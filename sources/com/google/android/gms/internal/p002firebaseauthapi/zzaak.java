package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzaak implements zzael<zzaib> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzaal zzb;

    zzaak(zzaal zzaalVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzaalVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzaib zzaibVar) {
        zzaib zzaibVar2 = zzaibVar;
        if (TextUtils.isEmpty(zzaibVar2.zza()) || TextUtils.isEmpty(zzaibVar2.zzb())) {
            this.zza.zza(t.a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        this.zzb.zza.zza(new zzagl(zzaibVar2.zzb(), zzaibVar2.zza(), Long.valueOf(zzagn.zza(zzaibVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(t.a(str));
    }
}
