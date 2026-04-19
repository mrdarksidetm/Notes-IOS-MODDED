package com.google.android.gms.internal.p002firebaseauthapi;

import com.revenuecat.purchases.common.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x9.f;
import z.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzafb {
    private static final Map<String, zzafe> zza = new a();
    private static final Map<String, List<WeakReference<zzafd>>> zzb = new a();

    public static String zza(String str) {
        zzafe zzafeVar;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            zzafeVar = map.get(str);
        }
        if (zzafeVar == null) {
            throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
        }
        return zza(zzafeVar.zzb(), zzafeVar.zza(), zzafeVar.zzb().contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) + "emulator/auth/handler";
    }

    private static String zza(String str, int i10, boolean z10) {
        StringBuilder sb2;
        String str2;
        if (z10) {
            sb2 = new StringBuilder("http://[");
            sb2.append(str);
            str2 = "]:";
        } else {
            sb2 = new StringBuilder("http://");
            sb2.append(str);
            str2 = Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
        }
        sb2.append(str2);
        sb2.append(i10);
        sb2.append("/");
        return sb2.toString();
    }

    public static void zza(String str, zzafd zzafdVar) {
        Map<String, List<WeakReference<zzafd>>> map = zzb;
        synchronized (map) {
            if (map.containsKey(str)) {
                map.get(str).add(new WeakReference<>(zzafdVar));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference<>(zzafdVar));
                map.put(str, arrayList);
            }
        }
    }

    public static void zza(f fVar, String str, int i10) {
        String strB = fVar.q().b();
        Map<String, zzafe> map = zza;
        synchronized (map) {
            map.put(strB, new zzafe(str, i10));
        }
        Map<String, List<WeakReference<zzafd>>> map2 = zzb;
        synchronized (map2) {
            if (map2.containsKey(strB)) {
                boolean z10 = false;
                Iterator<WeakReference<zzafd>> it = map2.get(strB).iterator();
                while (it.hasNext()) {
                    zzafd zzafdVar = it.next().get();
                    if (zzafdVar != null) {
                        z10 = true;
                        zzafdVar.zza();
                    }
                }
                if (!z10) {
                    zza.remove(strB);
                }
            }
        }
    }

    public static boolean zza(f fVar) {
        return zza.containsKey(fVar.q().b());
    }

    public static String zzb(String str) {
        zzafe zzafeVar;
        String str2;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            zzafeVar = map.get(str);
        }
        if (zzafeVar != null) {
            str2 = "" + zza(zzafeVar.zzb(), zzafeVar.zza(), zzafeVar.zzb().contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR));
        } else {
            str2 = "https://";
        }
        return str2 + "www.googleapis.com/identitytoolkit/v3/relyingparty";
    }

    public static String zzc(String str) {
        zzafe zzafeVar;
        String str2;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            zzafeVar = map.get(str);
        }
        if (zzafeVar != null) {
            str2 = "" + zza(zzafeVar.zzb(), zzafeVar.zza(), zzafeVar.zzb().contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR));
        } else {
            str2 = "https://";
        }
        return str2 + "identitytoolkit.googleapis.com/v2";
    }

    public static String zzd(String str) {
        zzafe zzafeVar;
        String str2;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            zzafeVar = map.get(str);
        }
        if (zzafeVar != null) {
            str2 = "" + zza(zzafeVar.zzb(), zzafeVar.zza(), zzafeVar.zzb().contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR));
        } else {
            str2 = "https://";
        }
        return str2 + "securetoken.googleapis.com/v1";
    }
}
