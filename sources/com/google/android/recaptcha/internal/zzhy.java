package com.google.android.recaptcha.internal;

import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzhy extends zzhz {
    final zzhv zza;
    final Character zzb;

    zzhy(zzhv zzhvVar, Character ch) {
        this.zza = zzhvVar;
        if (ch != null) {
            ch.charValue();
            if (zzhvVar.zzd('=')) {
                throw new IllegalArgumentException(zzha.zza("Padding character %s was already in alphabet", ch));
            }
        }
        this.zzb = ch;
    }

    zzhy(String str, String str2, Character ch) {
        this(new zzhv(str, str2.toCharArray()), ch);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhy) {
            zzhy zzhyVar = (zzhy) obj;
            if (this.zza.equals(zzhyVar.zza) && Objects.equals(this.zzb, zzhyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                str = ".omitPadding()";
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzb);
                str = "')";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    int zza(byte[] bArr, CharSequence charSequence) throws zzhx {
        zzhv zzhvVar;
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zza.zzc(charSequenceZze.length())) {
            throw new zzhx("Invalid input length " + charSequenceZze.length());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceZze.length()) {
            long jZzb = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                zzhvVar = this.zza;
                if (i12 >= zzhvVar.zzc) {
                    break;
                }
                jZzb <<= zzhvVar.zzb;
                if (i10 + i12 < charSequenceZze.length()) {
                    jZzb |= (long) this.zza.zzb(charSequenceZze.charAt(i13 + i10));
                    i13++;
                }
                i12++;
            }
            int i14 = zzhvVar.zzd;
            int i15 = i13 * zzhvVar.zzb;
            int i16 = (i14 - 1) * 8;
            while (i16 >= (i14 * 8) - i15) {
                bArr[i11] = (byte) ((jZzb >>> i16) & 255);
                i16 -= 8;
                i11++;
            }
            i10 += this.zza.zzc;
        }
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzgx.zzd(0, i11, bArr.length);
        while (i12 < i11) {
            zzf(appendable, bArr, i12, Math.min(this.zza.zzd, i11 - i12));
            i12 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    final int zzc(int i10) {
        return (int) (((((long) this.zza.zzb) * ((long) i10)) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    final int zzd(int i10) {
        zzhv zzhvVar = this.zza;
        return zzhvVar.zzc * zzib.zza(i10, zzhvVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.zzb;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    final void zzf(Appendable appendable, byte[] bArr, int i10, int i11) {
        zzgx.zzd(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzgx.zza(i11 <= this.zza.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = (i11 + 1) * 8;
        zzhv zzhvVar = this.zza;
        while (i12 < i11 * 8) {
            long j11 = j10 >>> ((i14 - zzhvVar.zzb) - i12);
            zzhv zzhvVar2 = this.zza;
            appendable.append(zzhvVar2.zza(((int) j11) & zzhvVar2.zza));
            i12 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i12 < this.zza.zzd * 8) {
                this.zzb.charValue();
                appendable.append('=');
                i12 += this.zza.zzb;
            }
        }
    }
}
