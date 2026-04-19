package com.google.android.gms.internal.p002firebaseauthapi;

import ba.o0;
import com.google.firebase.auth.b;
import x9.l;

/* JADX INFO: loaded from: classes.dex */
final class zzaeu extends b.AbstractC0181b {
    private final /* synthetic */ b.AbstractC0181b zza;
    private final /* synthetic */ String zzb;

    zzaeu(b.AbstractC0181b abstractC0181b, String str) {
        this.zza = abstractC0181b;
        this.zzb = str;
    }

    @Override // com.google.firebase.auth.b.AbstractC0181b
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzaer.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.b.AbstractC0181b
    public final void onCodeSent(String str, b.a aVar) {
        this.zza.onCodeSent(str, aVar);
    }

    @Override // com.google.firebase.auth.b.AbstractC0181b
    public final void onVerificationCompleted(o0 o0Var) {
        zzaer.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(o0Var);
    }

    @Override // com.google.firebase.auth.b.AbstractC0181b
    public final void onVerificationFailed(l lVar) {
        zzaer.zza.remove(this.zzb);
        this.zza.onVerificationFailed(lVar);
    }
}
