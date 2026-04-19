package com.google.android.recaptcha.internal;

import ae.s;
import md.i0;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzey extends s implements p {
    final /* synthetic */ zzek zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzey(zzek zzekVar, String str, int i10) {
        super(2);
        this.zza = zzekVar;
        this.zzb = str;
        this.zzc = i10;
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i10 = this.zzc;
        if (i10 != -1) {
            this.zza.zzc().zze(i10, objArr);
        }
        return i0.f15558a;
    }
}
