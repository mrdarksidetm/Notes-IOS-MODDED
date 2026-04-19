package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends d {
    private static final a.g zza;
    private static final a.AbstractC0174a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new a("SmsCodeAutofill.API", zznVar, gVar);
    }

    public zzr(Activity activity) {
        super(activity, (a<a.d.c>) zzc, a.d.N, d.a.f8400c);
    }

    public zzr(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.N, d.a.f8400c);
    }

    public final Task<Integer> checkPermissionState() {
        return doRead(j.a().d(zzac.zza).b(new v8.j() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(this.zza, (TaskCompletionSource) obj2));
            }
        }).e(1564).a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        m.k(str);
        m.b(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(j.a().d(zzac.zza).b(new v8.j() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(this.zza, (TaskCompletionSource) obj2));
            }
        }).e(1565).a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(j.a().d(zzac.zza).b(new v8.j() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(this.zza, (TaskCompletionSource) obj2));
            }
        }).e(1563).a());
    }
}
