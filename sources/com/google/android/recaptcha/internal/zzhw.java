package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzhw extends zzhy {
    zzhw(String str, String str2, Character ch) {
        zzhv zzhvVar = new zzhv(str, str2.toCharArray());
        super(zzhvVar, ch);
        zzgx.zza(zzhvVar.zzf.length == 64);
    }

    @Override // com.google.android.recaptcha.internal.zzhy, com.google.android.recaptcha.internal.zzhz
    final int zza(byte[] bArr, CharSequence charSequence) throws zzhx {
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zza.zzc(charSequenceZze.length())) {
            throw new zzhx("Invalid input length " + charSequenceZze.length());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceZze.length()) {
            int i12 = i10 + 1;
            int i13 = i11 + 1;
            int iZzb = (this.zza.zzb(charSequenceZze.charAt(i10)) << 18) | (this.zza.zzb(charSequenceZze.charAt(i12)) << 12);
            bArr[i11] = (byte) (iZzb >>> 16);
            int i14 = i12 + 1;
            if (i14 < charSequenceZze.length()) {
                int i15 = i14 + 1;
                int iZzb2 = iZzb | (this.zza.zzb(charSequenceZze.charAt(i14)) << 6);
                i11 = i13 + 1;
                bArr[i13] = (byte) ((iZzb2 >>> 8) & 255);
                if (i15 < charSequenceZze.length()) {
                    bArr[i11] = (byte) ((iZzb2 | this.zza.zzb(charSequenceZze.charAt(i15))) & 255);
                    i11++;
                    i10 = i15 + 1;
                } else {
                    i10 = i15;
                }
            } else {
                i10 = i14;
                i11 = i13;
            }
        }
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzhy, com.google.android.recaptcha.internal.zzhz
    final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzgx.zzd(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 1;
            int i15 = bArr[i12] & 255;
            int i16 = bArr[i14] & 255;
            int i17 = i14 + 1;
            int i18 = (i15 << 16) | (i16 << 8) | (bArr[i17] & 255);
            appendable.append(this.zza.zza(i18 >>> 18));
            appendable.append(this.zza.zza((i18 >>> 12) & 63));
            appendable.append(this.zza.zza((i18 >>> 6) & 63));
            appendable.append(this.zza.zza(i18 & 63));
            i12 = i17 + 1;
        }
        if (i12 < i11) {
            zzf(appendable, bArr, i12, i11 - i12);
        }
    }
}
