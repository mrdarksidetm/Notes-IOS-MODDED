package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzamp {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    private static final class zza extends zzb {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final double zza(Object obj, long j10) {
            return Double.longBitsToDouble(zze(obj, j10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j10, byte b10) {
            if (zzamp.zza) {
                zzamp.zzc(obj, j10, b10);
            } else {
                zzamp.zzd(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j10, double d10) {
            zza(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j10, float f10) {
            zza(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j10, boolean z10) {
            if (zzamp.zza) {
                zzamp.zza(obj, j10, z10);
            } else {
                zzamp.zzb(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final float zzb(Object obj, long j10) {
            return Float.intBitsToFloat(zzd(obj, j10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final boolean zzc(Object obj, long j10) {
            return zzamp.zza ? zzamp.zzf(obj, j10) : zzamp.zzg(obj, j10);
        }
    }

    private static abstract class zzb {
        Unsafe zza;

        zzb(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j10);

        public abstract void zza(Object obj, long j10, byte b10);

        public abstract void zza(Object obj, long j10, double d10);

        public abstract void zza(Object obj, long j10, float f10);

        public final void zza(Object obj, long j10, int i10) {
            this.zza.putInt(obj, j10, i10);
        }

        public final void zza(Object obj, long j10, long j11) {
            this.zza.putLong(obj, j10, j11);
        }

        public abstract void zza(Object obj, long j10, boolean z10);

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzamp.zza(th);
                return false;
            }
        }

        public abstract float zzb(Object obj, long j10);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzamp.zze() != null;
            } catch (Throwable th) {
                zzamp.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j10);

        public final int zzd(Object obj, long j10) {
            return this.zza.getInt(obj, j10);
        }

        public final long zze(Object obj, long j10) {
            return this.zza.getLong(obj, j10);
        }
    }

    private static final class zzc extends zzb {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final double zza(Object obj, long j10) {
            return Double.longBitsToDouble(zze(obj, j10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j10, byte b10) {
            if (zzamp.zza) {
                zzamp.zzc(obj, j10, b10);
            } else {
                zzamp.zzd(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j10, double d10) {
            zza(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j10, float f10) {
            zza(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j10, boolean z10) {
            if (zzamp.zza) {
                zzamp.zza(obj, j10, z10);
            } else {
                zzamp.zzb(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final float zzb(Object obj, long j10) {
            return Float.intBitsToFloat(zzd(obj, j10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final boolean zzc(Object obj, long j10) {
            return zzamp.zza ? zzamp.zzf(obj, j10) : zzamp.zzg(obj, j10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            sun.misc.Unsafe r6 = zzb()
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzb = r6
            java.lang.Class r7 = com.google.android.gms.internal.p002firebaseauthapi.zzaii.zza()
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = zzd(r7)
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd = r7
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r8 = zzd(r8)
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze = r8
            if (r6 == 0) goto L3a
            if (r7 == 0) goto L32
            com.google.android.gms.internal.firebase-auth-api.zzamp$zzc r7 = new com.google.android.gms.internal.firebase-auth-api.zzamp$zzc
            r7.<init>(r6)
            goto L3b
        L32:
            if (r8 == 0) goto L3a
            com.google.android.gms.internal.firebase-auth-api.zzamp$zza r7 = new com.google.android.gms.internal.firebase-auth-api.zzamp$zza
            r7.<init>(r6)
            goto L3b
        L3a:
            r7 = 0
        L3b:
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzf = r7
            r6 = 0
            if (r7 != 0) goto L42
            r8 = r6
            goto L46
        L42:
            boolean r8 = r7.zzb()
        L46:
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzg = r8
            if (r7 != 0) goto L4c
            r8 = r6
            goto L50
        L4c:
            boolean r8 = r7.zza()
        L50:
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzh = r8
            java.lang.Class<byte[]> r8 = byte[].class
            int r8 = zzb(r8)
            long r8 = (long) r8
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzi = r8
            zzb(r5)
            zzc(r5)
            zzb(r4)
            zzc(r4)
            zzb(r3)
            zzc(r3)
            zzb(r2)
            zzc(r2)
            zzb(r1)
            zzc(r1)
            zzb(r0)
            zzc(r0)
            java.lang.reflect.Field r0 = zze()
            if (r0 == 0) goto L8d
            if (r7 != 0) goto L88
            goto L8d
        L88:
            sun.misc.Unsafe r1 = r7.zza
            r1.objectFieldOffset(r0)
        L8d:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L96
            r6 = 1
        L96:
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zza = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamp.<clinit>():void");
    }

    private zzamp() {
    }

    static double zza(Object obj, long j10) {
        return zzf.zza(obj, j10);
    }

    static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void zza(Object obj, long j10, double d10) {
        zzf.zza(obj, j10, d10);
    }

    static void zza(Object obj, long j10, float f10) {
        zzf.zza(obj, j10, f10);
    }

    static void zza(Object obj, long j10, int i10) {
        zzf.zza(obj, j10, i10);
    }

    static void zza(Object obj, long j10, long j11) {
        zzf.zza(obj, j10, j11);
    }

    static void zza(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }

    static /* synthetic */ void zza(Object obj, long j10, boolean z10) {
        zzc(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzamp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    static void zza(byte[] bArr, long j10, byte b10) {
        zzf.zza((Object) bArr, zzi + j10, b10);
    }

    static float zzb(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzamr());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zzb(Object obj, long j10, boolean z10) {
        zzd(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzc(Object obj, long j10) {
        return zzf.zzd(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iZzc = zzc(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        zza(obj, j11, ((255 & b10) << i10) | (iZzc & (~(255 << i10))));
    }

    static void zzc(Object obj, long j10, boolean z10) {
        zzf.zza(obj, j10, z10);
    }

    static boolean zzc() {
        return zzh;
    }

    static long zzd(Object obj, long j10) {
        return zzf.zze(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        zza(obj, j11, ((255 & b10) << i10) | (zzc(obj, j11) & (~(255 << i10))));
    }

    static boolean zzd() {
        return zzg;
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Object zze(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field fieldZza = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (fieldZza != null) {
            return fieldZza;
        }
        Field fieldZza2 = zza((Class<?>) Buffer.class, "address");
        if (fieldZza2 == null || fieldZza2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    static /* synthetic */ boolean zzf(Object obj, long j10) {
        return ((byte) (zzc(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean zzg(Object obj, long j10) {
        return ((byte) (zzc(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3)))) != 0;
    }

    static boolean zzh(Object obj, long j10) {
        return zzf.zzc(obj, j10);
    }
}
