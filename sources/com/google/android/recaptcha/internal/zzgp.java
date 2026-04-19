package com.google.android.recaptcha.internal;

import ae.r;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgp extends WebViewClient {
    final /* synthetic */ zzgv zza;

    zzgp(zzgv zzgvVar) {
        this.zza = zzgvVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        long jZza = this.zza.zzj.zza(TimeUnit.MICROSECONDS);
        int i10 = zzbq.zza;
        zzbq.zza(zzbr.zzg.zza(), jZza);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        zzbh zzbhVar = zzbh.zzc;
        zzbg zzbgVar = (zzbg) this.zza.zzh.get(Integer.valueOf(i10));
        if (zzbgVar == null) {
            zzbgVar = zzbg.zzM;
        }
        zzbj zzbjVar = new zzbj(zzbhVar, zzbgVar, null);
        this.zza.zzu().hashCode();
        zzbjVar.getMessage();
        this.zza.zzu().a(zzbjVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri uri = Uri.parse(str);
        int i10 = zzdt.zza;
        r.c(uri);
        if (!zzdt.zzc(uri) || zzdt.zza(uri)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzQ, null);
        this.zza.zzu().hashCode();
        uri.toString();
        this.zza.zzu().a(zzbjVar);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
