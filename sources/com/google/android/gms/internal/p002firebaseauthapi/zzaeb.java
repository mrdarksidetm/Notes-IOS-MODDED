package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.b;

/* JADX INFO: loaded from: classes.dex */
final class zzaeb implements zzaeg {
    private final /* synthetic */ String zza;

    zzaeb(zzaea zzaeaVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(b.AbstractC0181b abstractC0181b, Object... objArr) {
        abstractC0181b.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
