package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzh {
    protected zzh() {
    }

    public int zza(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        zzy.zza(i10, length, "index");
        while (i10 < length) {
            if (zza(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean zza(char c10);
}
