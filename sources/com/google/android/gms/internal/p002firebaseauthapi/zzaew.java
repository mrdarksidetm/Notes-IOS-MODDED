package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import ba.o0;
import g9.d;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z8.a;

/* JADX INFO: loaded from: classes.dex */
final class zzaew {
    private static final a zza = new a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzaez> zzd = new HashMap<>();

    zzaew(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes(StandardCharsets.UTF_8));
            String strSubstring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.a("Package: " + str + " -- Hash: " + strSubstring, new Object[0]);
            return strSubstring;
        } catch (NoSuchAlgorithmException e10) {
            zza.c("NoSuchAlgorithm: " + e10.getMessage(), new Object[0]);
            return null;
        }
    }

    static /* synthetic */ void zza(zzaew zzaewVar, String str) {
        zzaez zzaezVar = zzaewVar.zzd.get(str);
        if (zzaezVar == null || zzag.zzc(zzaezVar.zzd) || zzag.zzc(zzaezVar.zze) || zzaezVar.zzb.isEmpty()) {
            return;
        }
        Iterator<zzade> it = zzaezVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(o0.B(zzaezVar.zzd, zzaezVar.zze));
        }
        zzaezVar.zzh = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar == null || zzaezVar.zzh || zzag.zzc(zzaezVar.zzd)) {
            return;
        }
        zza.h("Timed out waiting for SMS.", new Object[0]);
        Iterator<zzade> it = zzaezVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(zzaezVar.zzd);
        }
        zzaezVar.zzi = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zzb(String str) {
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar == null) {
            return;
        }
        if (!zzaezVar.zzi) {
            zze(str);
        }
        zzc(str);
    }

    final zzade zza(zzade zzadeVar, String str) {
        return new zzaex(this, zzadeVar, str);
    }

    final void zza(final String str, zzade zzadeVar, long j10, boolean z10) {
        this.zzd.put(str, new zzaez(j10, z10));
        zzb(zzadeVar, str);
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar.zza <= 0) {
            zza.h("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaezVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzaev
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(str);
            }
        }, zzaezVar.zza, TimeUnit.SECONDS);
        if (!zzaezVar.zzc) {
            zza.h("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafa zzafaVar = new zzafa(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        zzc.zza(this.zzb.getApplicationContext(), zzafaVar, intentFilter);
        o8.a.a(this.zzb).startSmsRetriever().addOnFailureListener(new zzaey(this));
    }

    final String zzb() {
        try {
            String packageName = this.zzb.getPackageName();
            String strZza = zza(packageName, (Build.VERSION.SDK_INT < 28 ? d.a(this.zzb).c(packageName, 64).signatures : d.a(this.zzb).c(packageName, 134217728).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (strZza != null) {
                return strZza;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    final void zzb(zzade zzadeVar, String str) {
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar == null) {
            return;
        }
        zzaezVar.zzb.add(zzadeVar);
        if (zzaezVar.zzg) {
            zzadeVar.zzb(zzaezVar.zzd);
        }
        if (zzaezVar.zzh) {
            zzadeVar.zza(o0.B(zzaezVar.zzd, zzaezVar.zze));
        }
        if (zzaezVar.zzi) {
            zzadeVar.zza(zzaezVar.zzd);
        }
    }

    final void zzc(String str) {
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar == null) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = zzaezVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzaezVar.zzf.cancel(false);
        }
        zzaezVar.zzb.clear();
        this.zzd.remove(str);
    }

    final boolean zzd(String str) {
        return this.zzd.get(str) != null;
    }
}
