package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzajg extends zzaim {
    private static final Logger zza = Logger.getLogger(zzajg.class.getName());
    private static final boolean zzb = zzamp.zzc();
    zzajj zze;

    private static abstract class zza extends zzajg {
        final byte[] zza;
        final int zzb;
        int zzc;
        int zzd;

        zza(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void zza(byte b10) {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr[i10] = b10;
            this.zzd++;
        }

        final void zza(int i10) {
            byte[] bArr = this.zza;
            int i11 = this.zzc;
            int i12 = i11 + 1;
            bArr[i11] = (byte) i10;
            int i13 = i12 + 1;
            bArr[i12] = (byte) (i10 >> 8);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (i10 >> 16);
            this.zzc = i14 + 1;
            bArr[i14] = (byte) (i10 >>> 24);
            this.zzd += 4;
        }

        final void zza(int i10, int i11) {
            zzb((i10 << 3) | i11);
        }

        final void zza(long j10) {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (j10 >> 32);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (j10 >> 40);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (j10 >> 48);
            this.zzc = i17 + 1;
            bArr[i17] = (byte) (j10 >> 56);
            this.zzd += 8;
        }

        final void zzb(int i10) {
            if (!zzajg.zzb) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i11 = this.zzc;
                    this.zzc = i11 + 1;
                    bArr[i11] = (byte) (i10 | 128);
                    this.zzd++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.zzd++;
                return;
            }
            long j10 = this.zzc;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i13 = this.zzc;
                this.zzc = i13 + 1;
                zzamp.zza(bArr3, i13, (byte) (i10 | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i14 = this.zzc;
            this.zzc = i14 + 1;
            zzamp.zza(bArr4, i14, (byte) i10);
            this.zzd += (int) (((long) this.zzc) - j10);
        }

        final void zzb(long j10) {
            if (!zzajg.zzb) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    bArr[i10] = (byte) (((int) j10) | 128);
                    this.zzd++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.zzd++;
                return;
            }
            long j11 = this.zzc;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                zzamp.zza(bArr3, i12, (byte) (((int) j10) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            zzamp.zza(bArr4, i13, (byte) j10);
            this.zzd += (int) (((long) this.zzc) - j11);
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(int i10, int i11, int i12, Throwable th) {
            this(i10, i11, i12, th);
        }

        private zzb(long j10, long j11, int i10, Throwable th) {
            this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)), th);
        }

        private zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private static class zzc extends zzajg {
        private final byte[] zza;
        private final int zzb;
        private int zzc;

        zzc(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i11 | 0 | (bArr.length - i11)) < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)));
            }
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i11;
        }

        private final void zzc(byte[] bArr, int i10, int i11) throws zzb {
            try {
                System.arraycopy(bArr, i10, this.zza, this.zzc, i11);
                this.zzc += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(this.zzc, this.zzb, i11, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final int zza() {
            return this.zzb - this.zzc;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zza(byte[] bArr, int i10, int i11) throws zzb {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(byte b10) throws zzb {
            int i10;
            int i11 = this.zzc;
            try {
                i10 = i11 + 1;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
            }
            try {
                this.zza[i11] = b10;
                this.zzc = i10;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                i11 = i10;
                throw new zzb(i11, this.zzb, 1, (Throwable) e);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i10, zzalc zzalcVar) {
            zzk(1, 3);
            zzl(2, i10);
            zzk(3, 2);
            zzc(zzalcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i10, String str) {
            zzk(i10, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i10, boolean z10) {
            zzk(i10, 0);
            zzb(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(zzaip zzaipVar) {
            zzn(zzaipVar.zzb());
            zzaipVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        final void zzb(zzalc zzalcVar, zzalv zzalvVar) {
            zzn(((zzaif) zzalcVar).zza(zzalvVar));
            zzalvVar.zza(zzalcVar, this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(String str) throws zzb {
            int i10 = this.zzc;
            try {
                int iZzj = zzajg.zzj(str.length() * 3);
                int iZzj2 = zzajg.zzj(str.length());
                if (iZzj2 != iZzj) {
                    zzn(zzamt.zza(str));
                    this.zzc = zzamt.zza(str, this.zza, this.zzc, zza());
                    return;
                }
                int i11 = i10 + iZzj2;
                this.zzc = i11;
                int iZza = zzamt.zza(str, this.zza, i11, zza());
                this.zzc = i10;
                zzn((iZza - i10) - iZzj2);
                this.zzc = iZza;
            } catch (zzamx e10) {
                this.zzc = i10;
                zza(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzb(e11);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(byte[] bArr, int i10, int i11) throws zzb {
            zzn(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(int i10, zzaip zzaipVar) {
            zzk(i10, 2);
            zzb(zzaipVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        final void zzc(int i10, zzalc zzalcVar, zzalv zzalvVar) {
            zzk(i10, 2);
            zzn(((zzaif) zzalcVar).zza(zzalvVar));
            zzalvVar.zza(zzalcVar, this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(zzalc zzalcVar) {
            zzn(zzalcVar.zzl());
            zzalcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzd(int i10, zzaip zzaipVar) {
            zzk(1, 3);
            zzl(2, i10);
            zzc(3, zzaipVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzf(int i10, long j10) {
            zzk(i10, 1);
            zzh(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(int i10, int i11) {
            zzk(i10, 5);
            zzk(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(int i10, long j10) {
            zzk(i10, 0);
            zzj(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(long j10) throws zzb {
            int i10 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i10] = (byte) j10;
                bArr[i10 + 1] = (byte) (j10 >> 8);
                bArr[i10 + 2] = (byte) (j10 >> 16);
                bArr[i10 + 3] = (byte) (j10 >> 24);
                bArr[i10 + 4] = (byte) (j10 >> 32);
                bArr[i10 + 5] = (byte) (j10 >> 40);
                bArr[i10 + 6] = (byte) (j10 >> 48);
                bArr[i10 + 7] = (byte) (j10 >> 56);
                this.zzc = i10 + 8;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(i10, this.zzb, 8, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzi(int i10, int i11) {
            zzk(i10, 0);
            zzl(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzj(long j10) throws zzb {
            if (zzajg.zzb && zza() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    zzamp.zza(bArr, i10, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzamp.zza(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zza;
                    int i12 = this.zzc;
                    this.zzc = i12 + 1;
                    bArr3[i12] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzb(this.zzc, this.zzb, 1, (Throwable) e10);
                }
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzk(int i10) throws zzb {
            int i11 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i11] = (byte) i10;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                bArr[i11 + 2] = (byte) (i10 >> 16);
                bArr[i11 + 3] = (byte) (i10 >>> 24);
                this.zzc = i11 + 4;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(i11, this.zzb, 4, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzk(int i10, int i11) {
            zzn((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzl(int i10) {
            if (i10 >= 0) {
                zzn(i10);
            } else {
                zzj(i10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzl(int i10, int i11) {
            zzk(i10, 0);
            zzn(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzn(int i10) throws zzb {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i11 = this.zzc;
                    this.zzc = i11 + 1;
                    bArr[i11] = (byte) (i10 | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzb(this.zzc, this.zzb, 1, (Throwable) e10);
                }
            }
            byte[] bArr2 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            bArr2[i12] = (byte) i10;
        }
    }

    private static final class zzd extends zza {
        private final OutputStream zzf;

        zzd(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zzc(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.zzb;
            int i13 = this.zzc;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.zza, i13, i11);
                this.zzc += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.zza, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.zzc = this.zzb;
                this.zzd += i14;
                zze();
                if (i11 <= this.zzb) {
                    System.arraycopy(bArr, i15, this.zza, 0, i11);
                    this.zzc = i11;
                } else {
                    this.zzf.write(bArr, i15, i11);
                }
            }
            this.zzd += i11;
        }

        private final void zze() throws IOException {
            this.zzf.write(this.zza, 0, this.zzc);
            this.zzc = 0;
        }

        private final void zzo(int i10) throws IOException {
            if (this.zzb - this.zzc < i10) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zza(byte[] bArr, int i10, int i11) throws IOException {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(byte b10) throws IOException {
            if (this.zzc == this.zzb) {
                zze();
            }
            zza(b10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i10, zzalc zzalcVar) {
            zzk(1, 3);
            zzl(2, i10);
            zzk(3, 2);
            zzc(zzalcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i10, String str) {
            zzk(i10, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i10, boolean z10) throws IOException {
            zzo(11);
            zza(i10, 0);
            zza(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(zzaip zzaipVar) {
            zzn(zzaipVar.zzb());
            zzaipVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        final void zzb(zzalc zzalcVar, zzalv zzalvVar) {
            zzn(((zzaif) zzalcVar).zza(zzalvVar));
            zzalvVar.zza(zzalcVar, this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(String str) throws IOException {
            int iZza;
            try {
                int length = str.length() * 3;
                int iZzj = zzajg.zzj(length);
                int i10 = iZzj + length;
                int i11 = this.zzb;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iZza2 = zzamt.zza(str, bArr, 0, length);
                    zzn(iZza2);
                    zza(bArr, 0, iZza2);
                    return;
                }
                if (i10 > i11 - this.zzc) {
                    zze();
                }
                int iZzj2 = zzajg.zzj(str.length());
                int i12 = this.zzc;
                try {
                    if (iZzj2 == iZzj) {
                        int i13 = i12 + iZzj2;
                        this.zzc = i13;
                        int iZza3 = zzamt.zza(str, this.zza, i13, this.zzb - i13);
                        this.zzc = i12;
                        iZza = (iZza3 - i12) - iZzj2;
                        zzb(iZza);
                        this.zzc = iZza3;
                    } else {
                        iZza = zzamt.zza(str);
                        zzb(iZza);
                        this.zzc = zzamt.zza(str, this.zza, this.zzc, iZza);
                    }
                    this.zzd += iZza;
                } catch (zzamx e10) {
                    this.zzd -= this.zzc - i12;
                    this.zzc = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new zzb(e11);
                }
            } catch (zzamx e12) {
                zza(str, e12);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(byte[] bArr, int i10, int i11) throws IOException {
            zzn(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc() throws IOException {
            if (this.zzc > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(int i10, zzaip zzaipVar) {
            zzk(i10, 2);
            zzb(zzaipVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        final void zzc(int i10, zzalc zzalcVar, zzalv zzalvVar) {
            zzk(i10, 2);
            zzb(zzalcVar, zzalvVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(zzalc zzalcVar) {
            zzn(zzalcVar.zzl());
            zzalcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzd(int i10, zzaip zzaipVar) {
            zzk(1, 3);
            zzl(2, i10);
            zzc(3, zzaipVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzf(int i10, long j10) throws IOException {
            zzo(18);
            zza(i10, 1);
            zza(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(int i10, int i11) throws IOException {
            zzo(14);
            zza(i10, 5);
            zza(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(int i10, long j10) throws IOException {
            zzo(20);
            zza(i10, 0);
            zzb(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(long j10) throws IOException {
            zzo(8);
            zza(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzi(int i10, int i11) throws IOException {
            zzo(20);
            zza(i10, 0);
            if (i11 >= 0) {
                zzb(i11);
            } else {
                zzb(i11);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzj(long j10) throws IOException {
            zzo(10);
            zzb(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzk(int i10) throws IOException {
            zzo(4);
            zza(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzk(int i10, int i11) {
            zzn((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzl(int i10) {
            if (i10 >= 0) {
                zzn(i10);
            } else {
                zzj(i10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzl(int i10, int i11) throws IOException {
            zzo(20);
            zza(i10, 0);
            zzb(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzn(int i10) throws IOException {
            zzo(5);
            zzb(i10);
        }
    }

    private zzajg() {
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zza(float f10) {
        return 4;
    }

    private static int zza(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static int zza(int i10, double d10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zza(int i10, float f10) {
        return zzj(i10 << 3) + 4;
    }

    public static int zza(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zza(int i10, zzaip zzaipVar) {
        int iZzj = zzj(i10 << 3);
        int iZzb = zzaipVar.zzb();
        return iZzj + zzj(iZzb) + iZzb;
    }

    public static int zza(int i10, zzakk zzakkVar) {
        return (zzj(8) << 1) + zzg(2, i10) + zzb(3, zzakkVar);
    }

    public static int zza(int i10, zzalc zzalcVar) {
        return (zzj(8) << 1) + zzg(2, i10) + zzj(24) + zzb(zzalcVar);
    }

    @Deprecated
    static int zza(int i10, zzalc zzalcVar, zzalv zzalvVar) {
        return (zzj(i10 << 3) << 1) + ((zzaif) zzalcVar).zza(zzalvVar);
    }

    public static int zza(int i10, String str) {
        return zzj(i10 << 3) + zza(str);
    }

    public static int zza(int i10, boolean z10) {
        return zzj(i10 << 3) + 1;
    }

    public static int zza(zzaip zzaipVar) {
        int iZzb = zzaipVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    public static int zza(zzakk zzakkVar) {
        int iZza = zzakkVar.zza();
        return zzj(iZza) + iZza;
    }

    @Deprecated
    public static int zza(zzalc zzalcVar) {
        return zzalcVar.zzl();
    }

    static int zza(zzalc zzalcVar, zzalv zzalvVar) {
        int iZza = ((zzaif) zzalcVar).zza(zzalvVar);
        return zzj(iZza) + iZza;
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzamt.zza(str);
        } catch (zzamx unused) {
            length = str.getBytes(zzakb.zza).length;
        }
        return zzj(length) + length;
    }

    public static int zza(boolean z10) {
        return 1;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    private static long zza(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static zzajg zza(OutputStream outputStream, int i10) {
        return new zzd(outputStream, i10);
    }

    public static int zzb(int i10, int i11) {
        return zzj(i10 << 3) + zzg(i11);
    }

    public static int zzb(int i10, long j10) {
        return zzj(i10 << 3) + zzg(j10);
    }

    public static int zzb(int i10, zzaip zzaipVar) {
        return (zzj(8) << 1) + zzg(2, i10) + zza(3, zzaipVar);
    }

    public static int zzb(int i10, zzakk zzakkVar) {
        int iZzj = zzj(i10 << 3);
        int iZza = zzakkVar.zza();
        return iZzj + zzj(iZza) + iZza;
    }

    static int zzb(int i10, zzalc zzalcVar, zzalv zzalvVar) {
        return zzj(i10 << 3) + zza(zzalcVar, zzalvVar);
    }

    public static int zzb(zzalc zzalcVar) {
        int iZzl = zzalcVar.zzl();
        return zzj(iZzl) + iZzl;
    }

    public static zzajg zzb(byte[] bArr) {
        return new zzc(bArr, 0, bArr.length);
    }

    public static int zzc(int i10) {
        return zzg(i10);
    }

    public static int zzc(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzc(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zzc(long j10) {
        return 8;
    }

    public static int zzd(int i10) {
        return 4;
    }

    public static int zzd(int i10, int i11) {
        return zzj(i10 << 3) + zzg(i11);
    }

    public static int zzd(int i10, long j10) {
        return zzj(i10 << 3) + zzg(zza(j10));
    }

    public static int zzd(long j10) {
        return zzg(j10);
    }

    public static int zze(int i10) {
        return zzg(i10);
    }

    public static int zze(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zze(int i10, long j10) {
        return zzj(i10 << 3) + zzg(j10);
    }

    public static int zze(long j10) {
        return 8;
    }

    static int zzf(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzf(int i10, int i11) {
        return zzj(i10 << 3) + zzj(zza(i11));
    }

    public static int zzf(long j10) {
        return zzg(zza(j10));
    }

    public static int zzg(int i10) {
        return 4;
    }

    public static int zzg(int i10, int i11) {
        return zzj(i10 << 3) + zzj(i11);
    }

    public static int zzg(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zzh(int i10) {
        return zzj(zza(i10));
    }

    public static int zzi(int i10) {
        return zzj(i10 << 3);
    }

    public static int zzj(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public abstract int zza();

    final void zza(String str, zzamx zzamxVar) throws zzb {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzamxVar);
        byte[] bytes = str.getBytes(zzakb.zza);
        try {
            zzn(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzb(e10);
        }
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzb(byte b10);

    public final void zzb(double d10) {
        zzh(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(float f10) {
        zzk(Float.floatToRawIntBits(f10));
    }

    public final void zzb(int i10, double d10) {
        zzf(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f10) {
        zzh(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void zzb(int i10, zzalc zzalcVar);

    public abstract void zzb(int i10, String str);

    public abstract void zzb(int i10, boolean z10);

    public abstract void zzb(zzaip zzaipVar);

    abstract void zzb(zzalc zzalcVar, zzalv zzalvVar);

    public abstract void zzb(String str);

    public final void zzb(boolean z10) {
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    abstract void zzb(byte[] bArr, int i10, int i11);

    public abstract void zzc();

    public abstract void zzc(int i10, zzaip zzaipVar);

    abstract void zzc(int i10, zzalc zzalcVar, zzalv zzalvVar);

    public abstract void zzc(zzalc zzalcVar);

    public abstract void zzd(int i10, zzaip zzaipVar);

    public abstract void zzf(int i10, long j10);

    public final void zzg(int i10, long j10) {
        zzh(i10, zza(j10));
    }

    public abstract void zzh(int i10, int i11);

    public abstract void zzh(int i10, long j10);

    public abstract void zzh(long j10);

    public abstract void zzi(int i10, int i11);

    public final void zzi(long j10) {
        zzj(zza(j10));
    }

    public final void zzj(int i10, int i11) {
        zzl(i10, zza(i11));
    }

    public abstract void zzj(long j10);

    public abstract void zzk(int i10);

    public abstract void zzk(int i10, int i11);

    public abstract void zzl(int i10);

    public abstract void zzl(int i10, int i11);

    public final void zzm(int i10) {
        zzn(zza(i10));
    }

    public abstract void zzn(int i10);
}
