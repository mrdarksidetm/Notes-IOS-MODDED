package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j8.b;
import j8.j;
import j8.k;
import v8.n;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzab extends d implements zzg {
    private static final a.g zza;
    private static final a.AbstractC0174a zzb;
    private static final a zzc;
    private static final z8.a zzd;
    private final Context zze;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new a("GoogleAuthService.API", zzvVar, gVar);
        zzd = j.a("GoogleAuthServiceClient");
    }

    zzab(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.N, d.a.f8400c);
        this.zze = context;
    }

    static /* bridge */ /* synthetic */ void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (n.c(status, obj, taskCompletionSource)) {
            return;
        }
        zzd.h("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        return doWrite(com.google.android.gms.common.api.internal.j.a().d(k.f14106l).b(new v8.j() { // from class: com.google.android.gms.internal.auth.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        }).e(1513).a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final b bVar) {
        m.l(bVar, "request cannot be null.");
        return doWrite(com.google.android.gms.common.api.internal.j.a().d(k.f14105k).b(new v8.j() { // from class: com.google.android.gms.internal.auth.zzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                b bVar2 = bVar;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), bVar2);
            }
        }).e(1515).a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        m.l(account, "Account name cannot be null!");
        m.f(str, "Scope cannot be null!");
        return doWrite(com.google.android.gms.common.api.internal.j.a().d(k.f14106l).b(new v8.j() { // from class: com.google.android.gms.internal.auth.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        }).e(1512).a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        m.l(account, "account cannot be null.");
        return doWrite(com.google.android.gms.common.api.internal.j.a().d(k.f14105k).b(new v8.j() { // from class: com.google.android.gms.internal.auth.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        }).e(1517).a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        m.l(str, "Client package name cannot be null!");
        return doWrite(com.google.android.gms.common.api.internal.j.a().d(k.f14105k).b(new v8.j() { // from class: com.google.android.gms.internal.auth.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        }).e(1514).a());
    }
}
