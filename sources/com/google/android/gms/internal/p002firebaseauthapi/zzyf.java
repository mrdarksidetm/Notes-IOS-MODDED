package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzyl;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class zzyf<T_WRAPPER extends zzyl<JcePrimitiveT>, JcePrimitiveT> {
    public static final zzyf<zzyk, Cipher> zza = new zzyf<>(new zzyk());
    public static final zzyf<zzyo, Mac> zzb = new zzyf<>(new zzyo());
    public static final zzyf<zzyn, KeyAgreement> zzc;
    public static final zzyf<zzyp, KeyPairGenerator> zzd;
    public static final zzyf<zzym, KeyFactory> zze;
    private final zzyj<JcePrimitiveT> zzf;

    static {
        new zzyf(new zzyq());
        new zzyf(new zzyr());
        zzc = new zzyf<>(new zzyn());
        zzd = new zzyf<>(new zzyp());
        zze = new zzyf<>(new zzym());
    }

    private zzyf(T_WRAPPER t_wrapper) {
        this.zzf = zzil.zzb() ? new zzyg<>(t_wrapper) : zzyy.zza() ? new zzye<>(t_wrapper) : new zzyh<>(t_wrapper);
    }

    public static List<Provider> zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final JcePrimitiveT zza(String str) {
        return this.zzf.zza(str);
    }
}
