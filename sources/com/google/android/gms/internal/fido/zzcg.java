package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
class zzcg extends zzch {
    private volatile zzch zza;
    final zzcd zzb;
    final Character zzc;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    zzcg(com.google.android.gms.internal.fido.zzcd r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.zzb = r4
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L17
            r5.charValue()
            r2 = 61
            boolean r4 = r4.zzc(r2)
            if (r4 != 0) goto L15
            goto L17
        L15:
            r4 = r0
            goto L18
        L17:
            r4 = r1
        L18:
            if (r4 == 0) goto L1d
            r3.zzc = r5
            return
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "Padding character %s was already in alphabet"
            java.lang.String r5 = com.google.android.gms.internal.fido.zzaq.zza(r5, r1)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzcg.<init>(com.google.android.gms.internal.fido.zzcd, java.lang.Character):void");
    }

    zzcg(String str, String str2, Character ch) {
        this(new zzcd(str, str2.toCharArray()), ch);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcg) {
            zzcg zzcgVar = (zzcg) obj;
            if (this.zzb.equals(zzcgVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzcgVar.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        return iHashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                str = ".omitPadding()";
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                str = "')";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    zzch zza(zzcd zzcdVar, Character ch) {
        return new zzcg(zzcdVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzch
    void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzap.zze(0, i11, bArr.length);
        while (i12 < i11) {
            zze(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzch
    final int zzc(int i10) {
        zzcd zzcdVar = this.zzb;
        return zzcdVar.zzc * zzcj.zza(i10, zzcdVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public final zzch zzd() {
        zzch zzchVarZza = this.zza;
        if (zzchVarZza == null) {
            zzcd zzcdVarZzb = this.zzb.zzb();
            zzchVarZza = zzcdVarZzb == this.zzb ? this : zza(zzcdVarZzb, this.zzc);
            this.zza = zzchVarZza;
        }
        return zzchVarZza;
    }

    final void zze(Appendable appendable, byte[] bArr, int i10, int i11) {
        zzap.zze(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzap.zzc(i11 <= this.zzb.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.zzb.zzb;
        while (i12 < i11 * 8) {
            zzcd zzcdVar = this.zzb;
            appendable.append(zzcdVar.zza(zzcdVar.zza & ((int) (j10 >>> (i14 - i12)))));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i12 += this.zzb.zzb;
            }
        }
    }
}
