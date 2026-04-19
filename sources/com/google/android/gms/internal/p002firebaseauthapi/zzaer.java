package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.firebase.auth.b;
import e9.f;
import java.util.Map;
import java.util.concurrent.Executor;
import z.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzaer {
    private static final Map<String, zzaet> zza = new a();

    public static b.AbstractC0181b zza(String str, b.AbstractC0181b abstractC0181b, zzady zzadyVar) {
        zza(str, zzadyVar);
        return new zzaeu(abstractC0181b, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzady zzadyVar) {
        zza.put(str, new zzaet(zzadyVar, f.b().a()));
    }

    public static boolean zza(String str, b.AbstractC0181b abstractC0181b, Activity activity, Executor executor) {
        Map<String, zzaet> map = zza;
        if (!map.containsKey(str)) {
            zza(str, null);
            return false;
        }
        zzaet zzaetVar = map.get(str);
        if (f.b().a() - zzaetVar.zzb >= 120000) {
            zza(str, null);
            return false;
        }
        zzady zzadyVar = zzaetVar.zza;
        if (zzadyVar == null) {
            return true;
        }
        zzadyVar.zza(abstractC0181b, activity, executor, str);
        return true;
    }
}
