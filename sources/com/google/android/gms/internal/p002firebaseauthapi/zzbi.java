package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zzbi implements zzce {
    private final OutputStream zza;

    private zzbi(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzce zza(OutputStream outputStream) {
        return new zzbi(outputStream);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(zzuo zzuoVar) throws IOException {
        try {
            ((zzuo) ((zzajy) zzuoVar.zzn().zza().zze())).zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(zzwa zzwaVar) throws IOException {
        try {
            zzwaVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
