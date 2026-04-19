package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzos extends zzks implements zzly {
    private static final zzos zzb;
    private zzkz zzd = zzks.zzz();
    private zzkz zze = zzks.zzz();

    static {
        zzos zzosVar = new zzos();
        zzb = zzosVar;
        zzks.zzF(zzos.class, zzosVar);
    }

    private zzos() {
    }

    static /* synthetic */ void zzK(zzos zzosVar, zzop zzopVar) {
        zzopVar.getClass();
        zzkz zzkzVar = zzosVar.zzd;
        if (!zzkzVar.zzc()) {
            zzosVar.zzd = zzks.zzA(zzkzVar);
        }
        zzosVar.zzd.add(zzopVar);
    }

    static /* synthetic */ void zzL(zzos zzosVar, zzpe zzpeVar) {
        zzpeVar.getClass();
        zzkz zzkzVar = zzosVar.zze;
        if (!zzkzVar.zzc()) {
            zzosVar.zze = zzks.zzA(zzkzVar);
        }
        zzosVar.zze.add(zzpeVar);
    }

    public static zzor zzi() {
        return (zzor) zzb.zzp();
    }

    public static zzos zzk(byte[] bArr) {
        return (zzos) zzks.zzv(zzb, bArr);
    }

    public final List zzJ() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzd.size();
    }

    public final int zzg() {
        return this.zze.size();
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", zzop.class, "zze", zzpe.class});
        }
        if (i11 == 3) {
            return new zzos();
        }
        zzoq zzoqVar = null;
        if (i11 == 4) {
            return new zzor(zzoqVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
