package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzakq implements zzalu {
    private static final zzald zza = new zzakt();
    private final zzald zzb;

    public zzakq() {
        this(new zzakv(zzajw.zza(), zza));
    }

    private zzakq(zzald zzaldVar) {
        this.zzb = (zzald) zzakb.zza(zzaldVar, "messageInfoFactory");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalu
    public final <T> zzalv<T> zza(Class<T> cls) {
        zzalx.zza((Class<?>) cls);
        zzala zzalaVarZza = this.zzb.zza(cls);
        if (zzalaVarZza.zzc()) {
            return zzali.zza(zzalx.zza(), zzajo.zza(), zzalaVarZza.zza());
        }
        return zzalg.zza(cls, zzalaVarZza, zzalm.zza(), zzako.zza(), zzalx.zza(), zzaks.zza[zzalaVarZza.zzb().ordinal()] != 1 ? zzajo.zza() : null, zzalb.zza());
    }
}
