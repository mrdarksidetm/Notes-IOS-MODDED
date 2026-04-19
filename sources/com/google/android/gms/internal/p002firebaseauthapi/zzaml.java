package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzaml extends RuntimeException {
    public zzaml(zzalc zzalcVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzakf zza() {
        return new zzakf(getMessage());
    }
}
