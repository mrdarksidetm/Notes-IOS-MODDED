package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import le.k;
import le.n0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzed {
    private final WebView zza;
    private final n0 zzb;

    public zzed(WebView webView, n0 n0Var) {
        this.zza = webView;
        this.zzb = n0Var;
    }

    public final void zzb(String str, String... strArr) {
        k.d(this.zzb, null, null, new zzec((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3, null);
    }
}
