package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.a;
import com.google.android.recaptcha.internal.zzkm;
import com.google.android.recaptcha.internal.zzks;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzks<MessageType extends zzks<MessageType, BuilderType>, BuilderType extends zzkm<MessageType, BuilderType>> extends zzig<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zznc zzc = zznc.zzc();

    protected static zzkz zzA(zzkz zzkzVar) {
        int size = zzkzVar.size();
        return zzkzVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzC(zzlx zzlxVar, String str, Object[] objArr) {
        return new zzmi(zzlxVar, str, objArr);
    }

    protected static void zzF(Class cls, zzks zzksVar) {
        zzksVar.zzE();
        zzb.put(cls, zzksVar);
    }

    protected static final boolean zzH(zzks zzksVar, boolean z10) {
        byte bByteValue = ((Byte) zzksVar.zzh(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzmg.zza().zzb(zzksVar.getClass()).zzl(zzksVar);
        if (z10) {
            zzksVar.zzh(2, true != zZzl ? null : zzksVar, null);
        }
        return zZzl;
    }

    private final int zzf(zzmk zzmkVar) {
        return zzmg.zza().zzb(getClass()).zza(this);
    }

    private static zzks zzg(zzks zzksVar) throws zzlc {
        if (zzksVar == null || zzksVar.zzo()) {
            return zzksVar;
        }
        throw new zzna(zzksVar).zza();
    }

    private static zzks zzi(zzks zzksVar, byte[] bArr, int i10, int i11, zzkd zzkdVar) throws zzlc {
        if (i11 == 0) {
            return zzksVar;
        }
        zzks zzksVarZzt = zzksVar.zzt();
        try {
            zzmk zzmkVarZzb = zzmg.zza().zzb(zzksVarZzt.getClass());
            zzmkVarZzb.zzi(zzksVarZzt, bArr, 0, i11, new zzik(zzkdVar));
            zzmkVarZzb.zzf(zzksVarZzt);
            return zzksVarZzt;
        } catch (zzlc e10) {
            if (e10.zzk()) {
                throw new zzlc(e10);
            }
            throw e10;
        } catch (zzna e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzlc) {
                throw ((zzlc) e12.getCause());
            }
            throw new zzlc(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw zzlc.zzi();
        }
    }

    public static zzkq zzr(zzlx zzlxVar, Object obj, zzlx zzlxVar2, zzkv zzkvVar, int i10, zznm zznmVar, Class cls) {
        return new zzkq(zzlxVar, "", null, new zzkp(null, i10, zznmVar, false, false), cls);
    }

    static zzks zzs(Class cls) {
        Map map = zzb;
        zzks zzksVar = (zzks) map.get(cls);
        if (zzksVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzksVar = (zzks) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzksVar == null) {
            zzksVar = (zzks) ((zzks) zzni.zze(cls)).zzh(6, null, null);
            if (zzksVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzksVar);
        }
        return zzksVar;
    }

    protected static zzks zzu(zzks zzksVar, InputStream inputStream) throws zzlc {
        zzjb zzizVar;
        int i10 = zzjb.zzd;
        if (inputStream == null) {
            byte[] bArr = zzla.zzb;
            int length = bArr.length;
            zzizVar = zzjb.zzH(bArr, 0, 0, false);
        } else {
            zzizVar = new zziz(inputStream, 4096, null);
        }
        zzkd zzkdVar = zzkd.zza;
        zzks zzksVarZzt = zzksVar.zzt();
        try {
            zzmk zzmkVarZzb = zzmg.zza().zzb(zzksVarZzt.getClass());
            zzmkVarZzb.zzh(zzksVarZzt, zzjc.zzq(zzizVar), zzkdVar);
            zzmkVarZzb.zzf(zzksVarZzt);
            zzg(zzksVarZzt);
            return zzksVarZzt;
        } catch (zzlc e10) {
            if (e10.zzk()) {
                throw new zzlc(e10);
            }
            throw e10;
        } catch (zzna e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzlc) {
                throw ((zzlc) e12.getCause());
            }
            throw new zzlc(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzlc) {
                throw ((zzlc) e13.getCause());
            }
            throw e13;
        }
    }

    protected static zzks zzv(zzks zzksVar, byte[] bArr) throws zzlc {
        zzks zzksVarZzi = zzi(zzksVar, bArr, 0, bArr.length, zzkd.zza);
        zzg(zzksVarZzi);
        return zzksVarZzi;
    }

    protected static zzkx zzw() {
        return zzkt.zzf();
    }

    protected static zzkx zzx(zzkx zzkxVar) {
        int size = zzkxVar.size();
        return zzkxVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static zzky zzy() {
        return zzlm.zzf();
    }

    protected static zzkz zzz() {
        return zzmh.zze();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzmg.zza().zzb(getClass()).zzk(this, (zzks) obj);
    }

    public final int hashCode() {
        if (zzI()) {
            return zzm();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iZzm = zzm();
        this.zza = iZzm;
        return iZzm;
    }

    public final String toString() {
        return zzlz.zza(this, super.toString());
    }

    protected final void zzD() {
        zzmg.zza().zzb(getClass()).zzf(this);
        zzE();
    }

    final void zzE() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    final void zzG(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | a.e.API_PRIORITY_OTHER;
    }

    final boolean zzI() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzig
    final int zza(zzmk zzmkVar) {
        if (zzI()) {
            int iZza = zzmkVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i10 = this.zzd & a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = zzmkVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final /* synthetic */ zzlw zzaa() {
        return (zzkm) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final /* synthetic */ zzlw zzab() {
        zzkm zzkmVar = (zzkm) zzh(5, null, null);
        zzkmVar.zzg(this);
        return zzkmVar;
    }

    @Override // com.google.android.recaptcha.internal.zzly
    public final /* synthetic */ zzlx zzac() {
        return (zzks) zzh(6, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final void zze(zzjg zzjgVar) {
        zzmg.zza().zzb(getClass()).zzj(this, zzjh.zza(zzjgVar));
    }

    protected abstract Object zzh(int i10, Object obj, Object obj2);

    final int zzm() {
        return zzmg.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final int zzn() {
        int iZzf;
        if (zzI()) {
            iZzf = zzf(null);
            if (iZzf < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iZzf);
            }
        } else {
            iZzf = this.zzd & a.e.API_PRIORITY_OTHER;
            if (iZzf == Integer.MAX_VALUE) {
                iZzf = zzf(null);
                if (iZzf < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iZzf);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzf;
            }
        }
        return iZzf;
    }

    @Override // com.google.android.recaptcha.internal.zzly
    public final boolean zzo() {
        return zzH(this, true);
    }

    protected final zzkm zzp() {
        return (zzkm) zzh(5, null, null);
    }

    public final zzkm zzq() {
        zzkm zzkmVar = (zzkm) zzh(5, null, null);
        zzkmVar.zzg(this);
        return zzkmVar;
    }

    final zzks zzt() {
        return (zzks) zzh(4, null, null);
    }
}
