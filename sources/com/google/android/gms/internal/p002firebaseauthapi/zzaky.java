package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzaky implements zzakz {
    zzaky() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final int zza(int i10, Object obj, Object obj2) {
        zzakw zzakwVar = (zzakw) obj;
        if (zzakwVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzakwVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final zzakx<?, ?> zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final Object zza(Object obj, Object obj2) {
        zzakw zzakwVarZzb = (zzakw) obj;
        zzakw zzakwVar = (zzakw) obj2;
        if (!zzakwVar.isEmpty()) {
            if (!zzakwVarZzb.zzd()) {
                zzakwVarZzb = zzakwVarZzb.zzb();
            }
            zzakwVarZzb.zza(zzakwVar);
        }
        return zzakwVarZzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final Object zzb(Object obj) {
        return zzakw.zza().zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final Object zzc(Object obj) {
        ((zzakw) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final Map<?, ?> zzd(Object obj) {
        return (zzakw) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final Map<?, ?> zze(Object obj) {
        return (zzakw) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final boolean zzf(Object obj) {
        return !((zzakw) obj).zzd();
    }
}
