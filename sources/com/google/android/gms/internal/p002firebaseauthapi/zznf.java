package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvq;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zznf {
    static final /* synthetic */ int[] zza;
    private static final /* synthetic */ int[] zzb;

    static {
        int[] iArr = new int[zzvq.zzb.values().length];
        zza = iArr;
        try {
            iArr[zzvq.zzb.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[zzvq.zzb.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zzws.values().length];
        zzb = iArr2;
        try {
            iArr2[zzws.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zzb[zzws.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzb[zzws.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zzb[zzws.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
