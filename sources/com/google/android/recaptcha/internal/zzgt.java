package com.google.android.recaptcha.internal;

import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzgt extends j implements p {
    final /* synthetic */ zzgv zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgt(zzgv zzgvVar, String str, d dVar) {
        super(2, dVar);
        this.zza = zzgvVar;
        this.zzb = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzgt(this.zza, this.zzb, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgt) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        rd.d.e();
        u.b(obj);
        this.zza.zzm().evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzb + "\")", null);
        return i0.f15558a;
    }
}
