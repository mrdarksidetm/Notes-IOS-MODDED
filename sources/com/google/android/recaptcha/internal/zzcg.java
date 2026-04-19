package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzcg extends j implements p {
    final /* synthetic */ WebView zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ zzbv zzc;
    final /* synthetic */ zzdc zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ zzbo zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcg(WebView webView, Application application, zzbv zzbvVar, zzdc zzdcVar, zzbo zzboVar, zzdq zzdqVar, d dVar) {
        super(2, dVar);
        this.zza = webView;
        this.zzb = application;
        this.zzc = zzbvVar;
        this.zzd = zzdcVar;
        this.zzf = zzboVar;
        this.zze = zzdqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzcg(this.zza, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcg) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        rd.d.e();
        u.b(obj);
        WebView webView = this.zza;
        return new zzgv(webView == null ? new WebView(this.zzb) : webView, this.zzb, this.zzc, this.zzd, this.zzf, this.zze);
    }
}
