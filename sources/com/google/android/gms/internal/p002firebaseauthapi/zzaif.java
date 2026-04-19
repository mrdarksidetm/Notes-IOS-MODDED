package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaie;
import com.google.android.gms.internal.p002firebaseauthapi.zzaif;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaif<MessageType extends zzaif<MessageType, BuilderType>, BuilderType extends zzaie<MessageType, BuilderType>> implements zzalc {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final zzaip a_() {
        try {
            zzaiu zzaiuVarZzc = zzaip.zzc(zzl());
            zza(zzaiuVarZzc.zzb());
            return zzaiuVarZzc.zza();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    int zza(zzalv zzalvVar) {
        int iZzi = zzi();
        if (iZzi != -1) {
            return iZzi;
        }
        int iZza = zzalvVar.zza(this);
        zzb(iZza);
        return iZza;
    }

    public final void zza(OutputStream outputStream) {
        zzajg zzajgVarZza = zzajg.zza(outputStream, zzajg.zzf(zzl()));
        zza(zzajgVarZza);
        zzajgVarZza.zzc();
    }

    void zzb(int i10) {
        throw new UnsupportedOperationException();
    }

    int zzi() {
        throw new UnsupportedOperationException();
    }

    public final byte[] zzk() {
        try {
            byte[] bArr = new byte[zzl()];
            zzajg zzajgVarZzb = zzajg.zzb(bArr);
            zza(zzajgVarZzb);
            zzajgVarZzb.zzb();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
