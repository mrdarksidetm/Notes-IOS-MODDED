package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zzcf extends zzcg {
    private zzcf(zzcd zzcdVar, Character ch) {
        super(zzcdVar, ch);
        zzap.zzc(zzcdVar.zzf.length == 64);
    }

    zzcf(String str, String str2, Character ch) {
        this(new zzcd(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    final zzch zza(zzcd zzcdVar, Character ch) {
        return new zzcf(zzcdVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzap.zze(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 1;
            int i15 = bArr[i12] & 255;
            int i16 = bArr[i14] & 255;
            int i17 = i14 + 1;
            int i18 = (i15 << 16) | (i16 << 8) | (bArr[i17] & 255);
            appendable.append(this.zzb.zza(i18 >>> 18));
            appendable.append(this.zzb.zza((i18 >>> 12) & 63));
            appendable.append(this.zzb.zza((i18 >>> 6) & 63));
            appendable.append(this.zzb.zza(i18 & 63));
            i12 = i17 + 1;
        }
        if (i12 < i11) {
            zze(appendable, bArr, i12, i11 - i12);
        }
    }
}
