package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* JADX INFO: loaded from: classes.dex */
public final class zzma {
    private static final Object zza = new Object();
    private static final String zzb = "zzma";
    private zzcc zzc;

    public static final class zza {
        private Context zza = null;
        private String zzb = null;
        private String zzc = null;
        private String zzd = null;
        private zzbg zze = null;
        private boolean zzf = true;
        private zzbu zzg = null;
        private zzvu zzh = null;
        private zzcc zzi;

        private static zzcc zza(byte[] bArr) {
            return zzcc.zza(zzbh.zza(zzbf.zza(bArr)));
        }

        private final zzbg zzb() throws KeyStoreException {
            zzma.zzd();
            try {
                try {
                    return new zzmf().zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e10) {
                    e = e10;
                    if (!zzmf.zzc(this.zzd)) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.zzd), e);
                    }
                    Log.w(zzma.zzb, "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            } catch (GeneralSecurityException e11) {
                e = e11;
            } catch (ProviderException e12) {
                e = e12;
            }
        }

        private final zzcc zzb(byte[] bArr) {
            try {
                this.zze = new zzmf().zza(this.zzd);
                try {
                    return zzcc.zza(zzbt.zza(zzbf.zza(bArr), this.zze, new byte[0]));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    zzcc zzccVarZza = zza(bArr);
                    Log.w(zzma.zzb, "cannot use Android Keystore, it'll be disabled", e11);
                    return zzccVarZza;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        private static byte[] zzb(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return zzyt.zza(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        public final zza zza(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            this.zza = context;
            this.zzb = str;
            this.zzc = str2;
            return this;
        }

        public final zza zza(zzvu zzvuVar) {
            this.zzh = zzvuVar;
            return this;
        }

        public final zza zza(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.zzf) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.zzd = str;
            return this;
        }

        public final synchronized zzma zza() {
            zzcc zzccVarZza;
            zzma zzmaVar;
            if (this.zzb == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            zzvu zzvuVar = this.zzh;
            if (zzvuVar != null && this.zzg == null) {
                this.zzg = zzbu.zza(zzcp.zza(zzvuVar.zzk()));
            }
            synchronized (zzma.zza) {
                byte[] bArrZzb = zzb(this.zza, this.zzb, this.zzc);
                if (bArrZzb == null) {
                    if (this.zzd != null) {
                        this.zze = zzb();
                    }
                    zzbu zzbuVar = this.zzg;
                    if (zzbuVar == null) {
                        throw new GeneralSecurityException("cannot read or generate keyset");
                    }
                    zzbt zzbtVarZza = zzbt.zza(zzbuVar);
                    zzma.zza(zzbtVarZza, new zzmh(this.zza, this.zzb, this.zzc), this.zze);
                    zzccVarZza = zzcc.zza(zzbtVarZza);
                } else if (this.zzd != null) {
                    zzma.zzd();
                    zzccVarZza = zzb(bArrZzb);
                } else {
                    zzccVarZza = zza(bArrZzb);
                }
                this.zzi = zzccVarZza;
                zzmaVar = new zzma(this);
            }
            return zzmaVar;
        }
    }

    private zzma(zza zzaVar) {
        new zzmh(zzaVar.zza, zzaVar.zzb, zzaVar.zzc);
        this.zzc = zzaVar.zzi;
    }

    static /* synthetic */ void zza(zzbt zzbtVar, zzce zzceVar, zzbg zzbgVar) throws GeneralSecurityException {
        try {
            if (zzbgVar != null) {
                zzbtVar.zza(zzceVar, zzbgVar, new byte[0]);
            } else {
                zzcf.zza(zzbtVar, zzceVar, zzbq.zza());
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzbt zza() {
        return this.zzc.zza();
    }
}
