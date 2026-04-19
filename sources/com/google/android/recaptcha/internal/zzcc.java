package com.google.android.recaptcha.internal;

import android.app.Application;
import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzcc extends j implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcc(Application application, String str, long j10, zzdq zzdqVar, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzcc(this.zzb, this.zzc, this.zzd, null, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = rd.d.e();
        int i10 = this.zza;
        u.b(obj);
        if (i10 == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            long j10 = this.zzd;
            zzco zzcoVar = zzco.zza;
            this.zza = 1;
            obj = zzcoVar.zze(application, str, j10, new zzbv("https://www.recaptcha.net/recaptcha/api3"), null, null, zzco.zzf, this);
            if (obj == objE) {
                return objE;
            }
        }
        return obj;
    }
}
