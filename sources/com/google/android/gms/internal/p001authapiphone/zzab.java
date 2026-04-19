package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import o8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzab extends b {
    public zzab(Activity activity) {
        super(activity);
    }

    public zzab(Context context) {
        super(context);
    }

    @Override // o8.b
    public final Task<Void> startSmsRetriever() {
        return doWrite(j.a().b(new v8.j() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(this.zza, (TaskCompletionSource) obj2));
            }
        }).d(zzac.zzc).e(1567).a());
    }

    @Override // o8.b
    public final Task<Void> startSmsUserConsent(final String str) {
        return doWrite(j.a().b(new v8.j() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(this.zza, (TaskCompletionSource) obj2));
            }
        }).d(zzac.zzd).e(1568).a());
    }
}
