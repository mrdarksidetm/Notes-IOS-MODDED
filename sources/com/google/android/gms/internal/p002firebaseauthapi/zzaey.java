package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes.dex */
final class zzaey implements OnFailureListener {
    zzaey(zzaew zzaewVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        zzaew.zza.c("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
