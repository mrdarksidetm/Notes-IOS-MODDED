package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzjg extends zzin {
    private static final Logger zzb = Logger.getLogger(zzjg.class.getName());
    private static final boolean zzc = zzni.zzx();
    zzjh zza;

    private zzjg() {
        throw null;
    }

    /* synthetic */ zzjg(zzjf zzjfVar) {
    }

    @Deprecated
    static int zzt(int i10, zzlx zzlxVar, zzmk zzmkVar) {
        int iZzx = zzx(i10 << 3);
        return iZzx + iZzx + ((zzig) zzlxVar).zza(zzmkVar);
    }

    public static int zzu(zzlx zzlxVar) {
        int iZzn = zzlxVar.zzn();
        return zzx(iZzn) + iZzn;
    }

    static int zzv(zzlx zzlxVar, zzmk zzmkVar) {
        int iZza = ((zzig) zzlxVar).zza(zzmkVar);
        return zzx(iZza) + iZza;
    }

    public static int zzw(String str) {
        int length;
        try {
            length = zznl.zzc(str);
        } catch (zznk unused) {
            length = str.getBytes(zzla.zza).length;
        }
        return zzx(length) + length;
    }

    public static int zzx(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzy(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static zzjg zzz(byte[] bArr, int i10, int i11) {
        return new zzjd(bArr, 0, i11);
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzB(String str, zznk zznkVar) throws zzje {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zznkVar);
        byte[] bytes = str.getBytes(zzla.zza);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzje(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i10, boolean z10);

    public abstract void zze(int i10, zziv zzivVar);

    public abstract void zzf(int i10, int i11);

    public abstract void zzg(int i10);

    public abstract void zzh(int i10, long j10);

    public abstract void zzi(long j10);

    public abstract void zzj(int i10, int i11);

    public abstract void zzk(int i10);

    public abstract void zzl(byte[] bArr, int i10, int i11);

    public abstract void zzm(int i10, String str);

    public abstract void zzo(int i10, int i11);

    public abstract void zzp(int i10, int i11);

    public abstract void zzq(int i10);

    public abstract void zzr(int i10, long j10);

    public abstract void zzs(long j10);
}
