package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import l8.b;
import l8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends d {
    public zzbo(Activity activity, c cVar) {
        super(activity, b.f14786a, cVar == null ? c.f14790b : cVar, d.a.f8400c);
    }

    public zzbo(Context context, c cVar) {
        super(context, b.f14786a, cVar == null ? c.f14790b : cVar, d.a.f8400c);
    }

    public final Task<String> getSpatulaHeader() {
        return doRead(j.a().b(new v8.j() { // from class: com.google.android.gms.internal.auth.zzbk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(this.zza, (TaskCompletionSource) obj2));
            }
        }).e(1520).a());
    }

    public final Task<p8.c> performProxyRequest(final p8.b bVar) {
        return doWrite(j.a().b(new v8.j() { // from class: com.google.android.gms.internal.auth.zzbl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = this.zza;
                p8.b bVar2 = bVar;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), bVar2);
            }
        }).e(1518).a());
    }
}
