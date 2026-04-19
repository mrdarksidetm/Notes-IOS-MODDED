package com.google.android.recaptcha.internal;

import ae.r;
import android.content.Context;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import le.a3;
import le.x;
import md.i0;
import nd.c0;
import qd.d;
import sd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgv extends zze {
    public x zza;
    public zzdv zzb;
    private final WebView zzc;
    private final Context zzd;
    private final zzbv zze;
    private final zzdc zzf;
    private final zzdq zzg;
    private final Map zzh = zzgw.zza();
    private final Map zzi = new LinkedHashMap();
    private final zzgz zzj = zzgz.zzc();
    private final zzgo zzk;
    private final zzdc zzl;
    private zzdf zzm;
    private final zzbo zzn;

    public zzgv(WebView webView, Context context, zzbv zzbvVar, zzdc zzdcVar, zzbo zzboVar, zzdq zzdqVar) {
        this.zzc = webView;
        this.zzd = context;
        this.zze = zzbvVar;
        this.zzf = zzdcVar;
        this.zzn = zzboVar;
        this.zzg = zzdqVar;
        zzgo zzgoVar = new zzgo(this);
        this.zzk = zzgoVar;
        zzdc zzdcVarZza = zzdcVar.zza();
        zzdcVarZza.zzc(zzdcVar.zzd());
        this.zzl = zzdcVarZza;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzgoVar, "RN");
        webView.setWebViewClient(new zzgp(this));
    }

    public static final /* synthetic */ void zzv(zzgv zzgvVar, String str) {
        zzgvVar.zzm = zzgvVar.zzl.zzf(26);
        try {
            zzgvVar.zzc.loadDataWithBaseURL(zzgvVar.zze.zza(), str, "text/html", "utf-8", null);
        } catch (Exception unused) {
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzU, null);
            zzdf zzdfVar = zzgvVar.zzm;
            if (zzdfVar != null) {
                zzdfVar.zzb(zzbjVar);
            }
            zzgvVar.zzm = null;
            zzgvVar.zzu().a(zzbjVar);
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzdf zza(String str) {
        zzdc zzdcVar = this.zzf;
        zzdcVar.zzc(str);
        return zzdcVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzdf zzb() {
        zzdc zzdcVar = this.zzf;
        zzdcVar.zzc(zzdcVar.zzd());
        return zzdcVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzd(String str, d dVar) {
        zzpv zzpvVarZzf = zzpw.zzf();
        zzpvVarZzf.zzd(str);
        return zzpvVarZzf.zzj();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object zzf(java.lang.String r13, qd.d r14) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgv.zzf(java.lang.String, qd.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzg(zzbj zzbjVar, d dVar) {
        if (r.b(zzbjVar.zza(), zzbg.zzb)) {
            zzdf zzdfVar = this.zzm;
            if (zzdfVar != null) {
                zzdfVar.zzb(zzbjVar);
            }
            this.zzm = null;
        }
        return i0.f15558a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object zzh(com.google.android.recaptcha.internal.zzpq r11, qd.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzgu
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzgu r0 = (com.google.android.recaptcha.internal.zzgu) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzgu r0 = new com.google.android.recaptcha.internal.zzgu
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.zza
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            md.u.b(r12)     // Catch: java.lang.Exception -> L29
            goto L8a
        L29:
            r11 = move-exception
            goto L92
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            md.u.b(r12)
            com.google.android.recaptcha.internal.zzcb r12 = new com.google.android.recaptcha.internal.zzcb     // Catch: java.lang.Exception -> L29
            com.google.android.recaptcha.internal.zziv r2 = r11.zzf()     // Catch: java.lang.Exception -> L29
            r12.<init>(r2)     // Catch: java.lang.Exception -> L29
            com.google.android.recaptcha.internal.zzea r12 = r10.zzy(r11, r12)     // Catch: java.lang.Exception -> L29
            r10.zzb = r12     // Catch: java.lang.Exception -> L29
            r12 = 0
            le.x r2 = le.z.b(r12, r3, r12)     // Catch: java.lang.Exception -> L29
            r10.zza = r2     // Catch: java.lang.Exception -> L29
            le.x r2 = r10.zzu()     // Catch: java.lang.Exception -> L29
            int r2 = r2.hashCode()     // Catch: java.lang.Exception -> L29
            sd.a.d(r2)     // Catch: java.lang.Exception -> L29
            com.google.android.recaptcha.internal.zzgz r2 = r10.zzj     // Catch: java.lang.Exception -> L29
            r2.zzd()     // Catch: java.lang.Exception -> L29
            com.google.android.recaptcha.internal.zzgz r2 = r10.zzj     // Catch: java.lang.Exception -> L29
            r2.zze()     // Catch: java.lang.Exception -> L29
            com.google.android.recaptcha.internal.zzbo r2 = r10.zzn     // Catch: java.lang.Exception -> L29
            le.n0 r4 = r2.zza()     // Catch: java.lang.Exception -> L29
            r5 = 0
            r6 = 0
            com.google.android.recaptcha.internal.zzgr r7 = new com.google.android.recaptcha.internal.zzgr     // Catch: java.lang.Exception -> L29
            r7.<init>(r10, r11, r12)     // Catch: java.lang.Exception -> L29
            r8 = 3
            r9 = 0
            le.i.d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L29
            le.x r11 = r10.zzu()     // Catch: java.lang.Exception -> L29
            int r11 = r11.hashCode()     // Catch: java.lang.Exception -> L29
            sd.a.d(r11)     // Catch: java.lang.Exception -> L29
            le.x r11 = r10.zzu()     // Catch: java.lang.Exception -> L29
            r0.zzc = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r11 = r11.await(r0)     // Catch: java.lang.Exception -> L29
            if (r11 == r1) goto L91
        L8a:
            md.i0 r11 = md.i0.f15558a     // Catch: java.lang.Exception -> L29
            java.lang.Object r11 = md.t.b(r11)     // Catch: java.lang.Exception -> L29
            goto Lb4
        L91:
            return r1
        L92:
            r11.getMessage()
            java.lang.Class r12 = r11.getClass()
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r1 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r2 = com.google.android.recaptcha.internal.zzbg.zzV
            java.lang.String r12 = r12.getSimpleName()
            r0.<init>(r1, r2, r12)
            com.google.android.recaptcha.internal.zzbj r11 = com.google.android.recaptcha.internal.zzf.zza(r11, r0)
            md.t$a r12 = md.t.f15576b
            java.lang.Object r11 = md.u.a(r11)
            java.lang.Object r11 = md.t.b(r11)
        Lb4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgv.zzh(com.google.android.recaptcha.internal.zzpq, qd.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzi(String str, long j10, Exception exc, d dVar) {
        x xVar = (x) this.zzi.remove(str);
        if (xVar != null) {
            a.a(xVar.a(exc));
        }
        return i0.f15558a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzj(Exception exc, d dVar) {
        Long lZza = this.zzk.zza();
        if ((exc instanceof a3) && lZza == null) {
            return new zzbj(zzbh.zzc, zzbg.zzH, null);
        }
        return zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzV, exc.getClass().getSimpleName()));
    }

    public final WebView zzm() {
        return this.zzc;
    }

    public final zzdq zzp() {
        return this.zzg;
    }

    public final zzgo zzq() {
        return this.zzk;
    }

    public final x zzu() {
        x xVar = this.zza;
        if (xVar != null) {
            return xVar;
        }
        return null;
    }

    public final zzea zzy(zzpq zzpqVar, zzcb zzcbVar) {
        zzed zzedVar = new zzed(this.zzc, this.zzn.zzb());
        zzgf zzgfVar = new zzgf();
        zzgfVar.zzb(c0.D0(zzpqVar.zzN()));
        zzem zzemVar = new zzem(zzedVar, zzcbVar, new zzbu());
        zzgg zzggVar = new zzgg(zzgfVar, new zzgd());
        zzemVar.zze(3, this.zzd);
        zzemVar.zze(5, zzgm.class.getMethod("cs", new Object[0].getClass()));
        zzemVar.zze(6, new zzgh(this.zzd));
        zzemVar.zze(7, new zzgj());
        zzemVar.zze(8, new zzgn(this.zzd));
        zzemVar.zze(9, new zzgk(this.zzd));
        zzemVar.zze(10, new zzgi(this.zzd));
        return new zzea(this.zzn.zzd(), zzemVar, zzggVar, zzdu.zza());
    }
}
