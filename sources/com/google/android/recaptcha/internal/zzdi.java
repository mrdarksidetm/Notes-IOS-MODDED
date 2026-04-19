package com.google.android.recaptcha.internal;

import java.util.Timer;
import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzdi extends j implements p {
    final /* synthetic */ zzdk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdi(zzdk zzdkVar, d dVar) {
        super(2, dVar);
        this.zza = zzdkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzdi(this.zza, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdi) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        rd.d.e();
        u.b(obj);
        zzdk zzdkVar = this.zza;
        synchronized (zzdg.class) {
            zzda zzdaVar = zzdkVar.zze;
            if (zzdaVar != null && zzdaVar.zzb() == 0) {
                Timer timer = zzdk.zza;
                if (timer != null) {
                    timer.cancel();
                }
                zzdk.zza = null;
            }
            zzdkVar.zzg();
        }
        return i0.f15558a;
    }
}
