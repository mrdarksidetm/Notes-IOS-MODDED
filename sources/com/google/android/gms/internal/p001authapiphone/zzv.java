package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zzv extends d {
    private static final a.g zza;
    private static final a.AbstractC0174a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new a("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, (a<a.d.c>) zzc, a.d.N, d.a.f8400c);
    }

    public zzv(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.N, d.a.f8400c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(j.a().d(zzac.zzb).b(new v8.j() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(this.zza, (TaskCompletionSource) obj2));
            }
        }).e(1566).a());
    }
}
