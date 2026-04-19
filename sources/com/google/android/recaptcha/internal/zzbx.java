package com.google.android.recaptcha.internal;

import java.io.File;
import java.io.IOException;
import xd.i;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbx {
    public static final byte[] zza(File file) {
        return i.c(file);
    }

    public static final void zzb(File file, byte[] bArr) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        i.f(file, bArr);
    }
}
