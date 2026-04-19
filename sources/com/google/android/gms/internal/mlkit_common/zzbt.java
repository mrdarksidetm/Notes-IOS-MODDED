package com.google.android.gms.internal.mlkit_common;

import ga.b;
import ga.c;
import ga.g;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zzbt implements g {
    private boolean zza = false;
    private boolean zzb = false;
    private c zzc;
    private final zzbp zzd;

    zzbt(zzbp zzbpVar) {
        this.zzd = zzbpVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    public final g add(double d10) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, d10, this.zzb);
        return this;
    }

    public final g add(float f10) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, f10, this.zzb);
        return this;
    }

    public final g add(int i10) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, i10, this.zzb);
        return this;
    }

    public final g add(long j10) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j10, this.zzb);
        return this;
    }

    @Override // ga.g
    public final g add(String str) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // ga.g
    public final g add(boolean z10) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z10 ? 1 : 0, this.zzb);
        return this;
    }

    public final g add(byte[] bArr) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }

    final void zza(c cVar, boolean z10) {
        this.zza = false;
        this.zzc = cVar;
        this.zzb = z10;
    }
}
