package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import le.n0;
import md.i0;
import md.t;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzct extends j implements p {
    int zza;
    final /* synthetic */ zzcx zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzct(zzcx zzcxVar, RecaptchaAction recaptchaAction, long j10, d dVar) {
        super(2, dVar);
        this.zzb = zzcxVar;
        this.zzc = recaptchaAction;
        this.zzd = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzct(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzct) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZzg;
        Object objE = rd.d.e();
        int i10 = this.zza;
        u.b(obj);
        if (i10 != 0) {
            objZzg = ((t) obj).j();
        } else {
            zzcx zzcxVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            objZzg = zzcxVar.zzg(recaptchaAction, j10, this);
            if (objZzg == objE) {
                return objE;
            }
        }
        u.b(objZzg);
        return objZzg;
    }
}
