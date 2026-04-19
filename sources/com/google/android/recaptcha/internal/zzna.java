package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzna extends RuntimeException {
    public zzna(zzlx zzlxVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzlc zza() {
        return new zzlc(getMessage());
    }
}
