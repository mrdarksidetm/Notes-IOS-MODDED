package com.google.android.gms.internal.p002firebaseauthapi;

import com.amazon.device.simplesignin.a.a.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class zzalr {
    private static final zzalr zza = new zzalr();
    private final ConcurrentMap<Class<?>, zzalv<?>> zzc = new ConcurrentHashMap();
    private final zzalu zzb = new zzakq();

    private zzalr() {
    }

    public static zzalr zza() {
        return zza;
    }

    public final <T> zzalv<T> zza(Class<T> cls) {
        zzakb.zza(cls, "messageType");
        zzalv<T> zzalvVar = (zzalv) this.zzc.get(cls);
        if (zzalvVar != null) {
            return zzalvVar;
        }
        zzalv<T> zzalvVarZza = this.zzb.zza(cls);
        zzakb.zza(cls, "messageType");
        zzakb.zza(zzalvVarZza, a.E);
        zzalv<T> zzalvVar2 = (zzalv) this.zzc.putIfAbsent(cls, zzalvVarZza);
        return zzalvVar2 != null ? zzalvVar2 : zzalvVarZza;
    }

    public final <T> zzalv<T> zza(T t10) {
        return zza((Class) t10.getClass());
    }
}
