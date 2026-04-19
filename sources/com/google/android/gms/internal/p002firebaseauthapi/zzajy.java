package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.firebase-auth-api.zzajy.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzajy<MessageType extends zzajy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzaif<MessageType, BuilderType> {
    private static Map<Class<?>, zzajy<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzamn zzb = zzamn.zzc();

    public static abstract class zza<MessageType extends zzajy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzaie<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        protected zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzu()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzo();
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzalr.zza().zza(messagetype).zza(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaie
        public /* synthetic */ Object clone() {
            zza zzaVar = (zza) this.zzb.zza(zzf.zze, null, null);
            zzaVar.zza = (MessageType) zzf();
            return zzaVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzu()) {
                zzi();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaie
        /* JADX INFO: renamed from: zzb */
        public final /* synthetic */ zzaie clone() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
        /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final MessageType zze() {
            MessageType messagetype = (MessageType) zzf();
            if (zzajy.zza(messagetype, true)) {
                return messagetype;
            }
            throw new zzaml(messagetype);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
        /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public MessageType zzf() {
            if (!this.zza.zzu()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzale
        public final /* synthetic */ zzalc zzg() {
            return this.zzb;
        }

        protected final void zzh() {
            if (this.zza.zzu()) {
                return;
            }
            zzi();
        }

        protected void zzi() {
            MessageType messagetype = (MessageType) this.zzb.zzo();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzale
        public final boolean zzj() {
            return zzajy.zza(this.zza, false);
        }
    }

    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzajy<MessageType, BuilderType> implements zzale {
        protected zzajr<zze> zzc = zzajr.zzb();

        final zzajr<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzajr) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    protected static class zzc<T extends zzajy<T, ?>> extends zzaig<T> {
        public zzc(T t10) {
        }
    }

    public static class zzd<ContainingType extends zzalc, Type> extends zzajl<ContainingType, Type> {
    }

    static final class zze implements zzajt<zze> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final zzalf zza(zzalf zzalfVar, zzalc zzalcVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final zzall zza(zzall zzallVar, zzall zzallVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final zzamw zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final zzand zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    public enum zzf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    private final int zza() {
        return zzalr.zza().zza(this).zzb(this);
    }

    private static <T extends zzajy<T, ?>> T zza(T t10) throws zzakf {
        if (t10 == null || zza((zzajy) t10, true)) {
            return t10;
        }
        zzakf zzakfVarZza = new zzaml(t10).zza();
        zzakfVarZza.getClass();
        throw zzakfVarZza;
    }

    protected static <T extends zzajy<T, ?>> T zza(T t10, zzaip zzaipVar, zzajk zzajkVar) {
        return (T) zza(zzb(t10, zzaipVar, zzajkVar));
    }

    private static <T extends zzajy<T, ?>> T zza(T t10, zzajb zzajbVar, zzajk zzajkVar) throws zzakf {
        T t11 = (T) t10.zzo();
        try {
            zzalv zzalvVarZza = zzalr.zza().zza(t11);
            zzalvVarZza.zza(t11, zzajf.zza(zzajbVar), zzajkVar);
            zzalvVarZza.zzd(t11);
            return t11;
        } catch (zzakf e10) {
            if (e10.zzl()) {
                throw new zzakf(e10);
            }
            throw e10;
        } catch (zzaml e11) {
            zzakf zzakfVarZza = e11.zza();
            zzakfVarZza.getClass();
            throw zzakfVarZza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzakf) {
                throw ((zzakf) e12.getCause());
            }
            throw new zzakf(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzakf) {
                throw ((zzakf) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends zzajy<T, ?>> T zza(T t10, InputStream inputStream, zzajk zzajkVar) {
        zzajb zzajdVar;
        if (inputStream == null) {
            byte[] bArr = zzakb.zzb;
            zzajdVar = zzajb.zza(bArr, 0, bArr.length, false);
        } else {
            zzajdVar = new zzajd(inputStream);
        }
        return (T) zza(zza(t10, zzajdVar, zzajkVar));
    }

    private static <T extends zzajy<T, ?>> T zza(T t10, byte[] bArr, int i10, int i11, zzajk zzajkVar) throws zzakf {
        if (i11 == 0) {
            return t10;
        }
        T t11 = (T) t10.zzo();
        try {
            zzalv zzalvVarZza = zzalr.zza().zza(t11);
            zzalvVarZza.zza(t11, bArr, 0, i11, new zzaik(zzajkVar));
            zzalvVarZza.zzd(t11);
            return t11;
        } catch (zzakf e10) {
            if (e10.zzl()) {
                throw new zzakf(e10);
            }
            throw e10;
        } catch (zzaml e11) {
            zzakf zzakfVarZza = e11.zza();
            zzakfVarZza.getClass();
            throw zzakfVarZza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzakf) {
                throw ((zzakf) e12.getCause());
            }
            throw new zzakf(e12);
        } catch (IndexOutOfBoundsException unused) {
            zzakf zzakfVarZzj = zzakf.zzj();
            zzakfVarZzj.getClass();
            throw zzakfVarZzj;
        }
    }

    protected static <T extends zzajy<T, ?>> T zza(T t10, byte[] bArr, zzajk zzajkVar) {
        return (T) zza(zza(t10, bArr, 0, bArr.length, zzajkVar));
    }

    static <T extends zzajy<?, ?>> T zza(Class<T> cls) {
        zzajy<?, ?> zzajyVar = zzc.get(cls);
        if (zzajyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzajyVar = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzajyVar == null) {
            zzajyVar = (T) ((zzajy) zzamp.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (zzajyVar == null) {
                throw new IllegalStateException();
            }
            zzc.put((Class<?>) cls, zzajyVar);
        }
        return (T) zzajyVar;
    }

    protected static <E> zzakc<E> zza(zzakc<E> zzakcVar) {
        return zzakcVar.zza(zzakcVar.size() << 1);
    }

    protected static Object zza(zzalc zzalcVar, String str, Object[] objArr) {
        return new zzalt(zzalcVar, str, objArr);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
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

    protected static <T extends zzajy<?, ?>> void zza(Class<T> cls, T t10) {
        t10.zzt();
        zzc.put(cls, t10);
    }

    protected static final <T extends zzajy<T, ?>> boolean zza(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.zza(zzf.zza, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZze = zzalr.zza().zza(t10).zze(t10);
        if (z10) {
            t10.zza(zzf.zzb, zZze ? t10 : null, null);
        }
        return zZze;
    }

    private final int zzb(zzalv<?> zzalvVar) {
        return zzalvVar == null ? zzalr.zza().zza(this).zza(this) : zzalvVar.zza(this);
    }

    private static <T extends zzajy<T, ?>> T zzb(T t10, zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        zzajb zzajbVarZzc = zzaipVar.zzc();
        T t11 = (T) zza(t10, zzajbVarZzc, zzajkVar);
        try {
            zzajbVarZzc.zzb(0);
            return t11;
        } catch (zzakf e10) {
            throw e10;
        }
    }

    protected static <E> zzakc<E> zzp() {
        return zzalq.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzalr.zza().zza(this).zzb(this, (zzajy) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzu()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzalh.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaif
    final int zza(zzalv zzalvVar) {
        if (!zzu()) {
            if (zzi() != Integer.MAX_VALUE) {
                return zzi();
            }
            int iZzb = zzb((zzalv<?>) zzalvVar);
            zzb(iZzb);
            return iZzb;
        }
        int iZzb2 = zzb((zzalv<?>) zzalvVar);
        if (iZzb2 >= 0) {
            return iZzb2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZzb2);
    }

    protected abstract Object zza(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final void zza(zzajg zzajgVar) {
        zzalr.zza().zza(this).zza(this, zzajj.zza(zzajgVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaif
    final void zzb(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & a.e.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzale
    public final /* synthetic */ zzalc zzg() {
        return (zzajy) zza(zzf.zzf, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaif
    final int zzi() {
        return this.zzd & a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzale
    public final boolean zzj() {
        return zza(this, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final int zzl() {
        return zza((zzalv) null);
    }

    protected final <MessageType extends zzajy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzm() {
        return (BuilderType) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return (BuilderType) ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    final MessageType zzo() {
        return (MessageType) zza(zzf.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final /* synthetic */ zzalf zzq() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final /* synthetic */ zzalf zzr() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    protected final void zzs() {
        zzalr.zza().zza(this).zzd(this);
        zzt();
    }

    final void zzt() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    final boolean zzu() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
