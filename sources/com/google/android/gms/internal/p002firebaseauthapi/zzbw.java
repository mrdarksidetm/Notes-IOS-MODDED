package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzbw {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[zzvv.values().length];
        zza = iArr;
        try {
            iArr[zzvv.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[zzvv.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zza[zzvv.DESTROYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
