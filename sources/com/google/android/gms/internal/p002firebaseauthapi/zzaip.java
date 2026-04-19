package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaip implements Serializable, Iterable<Byte> {
    public static final zzaip zza = new zzaiw(zzakb.zzb);
    private static final zzais zzb = new zzaiz();
    private int zzc = 0;

    static {
        new zzair();
    }

    zzaip() {
    }

    static /* synthetic */ int zza(byte b10) {
        return b10 & 255;
    }

    static int zza(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static zzaip zza(String str) {
        return new zzaiw(str.getBytes(zzakb.zza));
    }

    public static zzaip zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzaip zza(byte[] bArr, int i10, int i11) {
        zza(i10, i10 + i11, bArr.length);
        return new zzaiw(zzb.zza(bArr, i10, i11));
    }

    static zzaip zzb(byte[] bArr) {
        return new zzaiw(bArr);
    }

    static zzaiu zzc(int i10) {
        return new zzaiu(i10);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzb = this.zzc;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzc = iZzb;
        }
        return iZzb;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzaio(this);
    }

    public final String toString() {
        String strZza;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            strZza = zzamh.zza(this);
        } else {
            strZza = zzamh.zza(zza(0, 47)) + "...";
        }
        objArr[2] = strZza;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    protected final int zza() {
        return this.zzc;
    }

    public abstract zzaip zza(int i10, int i11);

    abstract void zza(zzaim zzaimVar);

    protected abstract void zza(byte[] bArr, int i10, int i11, int i12);

    abstract byte zzb(int i10);

    public abstract int zzb();

    protected abstract int zzb(int i10, int i11, int i12);

    public abstract zzajb zzc();

    public final byte[] zzd() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzakb.zzb;
        }
        byte[] bArr = new byte[iZzb];
        zza(bArr, 0, 0, iZzb);
        return bArr;
    }
}
