package com.google.android.recaptcha.internal;

import java.util.Arrays;
import le.n0;
import le.o0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzdy extends j implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzek zzb;
    final /* synthetic */ zzea zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdy(Exception exc, zzek zzekVar, zzea zzeaVar, d dVar) {
        super(2, dVar);
        this.zza = exc;
        this.zzb = zzekVar;
        this.zzc = zzeaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        zzdy zzdyVar = new zzdy(this.zza, this.zzb, this.zzc, dVar);
        zzdyVar.zzd = obj;
        return zzdyVar;
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdy) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzrh zzrhVarZza;
        rd.d.e();
        u.b(obj);
        n0 n0Var = (n0) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzby) {
            zzrhVarZza = ((zzby) exc).zza();
            zzrhVarZza.zzd(this.zzb.zza());
        } else {
            zzek zzekVar = this.zzb;
            zzrh zzrhVarZzf = zzri.zzf();
            zzrhVarZzf.zzd(zzekVar.zza());
            zzrhVarZzf.zzq(2);
            zzrhVarZzf.zzp(2);
            zzrhVarZza = zzrhVarZzf;
        }
        zzri zzriVar = (zzri) zzrhVarZza.zzj();
        zzriVar.zzJ();
        zzriVar.zzk();
        ae.i0.b(this.zza.getClass()).b();
        this.zza.getMessage();
        zzek zzekVar2 = this.zzb;
        zzbt zzbtVarZzb = zzekVar2.zzb();
        zzbt zzbtVar = zzekVar2.zza;
        if (zzbtVar == null) {
            zzbtVar = null;
        }
        zzoy zzoyVarZza = zzdn.zza(zzbtVarZzb, zzbtVar);
        String strZzd = this.zzb.zzd();
        if (strZzd.length() == 0) {
            strZzd = "recaptcha.m.Main.rge";
        }
        if (o0.g(n0Var)) {
            zzea zzeaVar = this.zzc;
            zzhz zzhzVarZzh = zzhz.zzh();
            byte[] bArrZzd = zzriVar.zzd();
            zzhz zzhzVarZzh2 = zzhz.zzh();
            byte[] bArrZzd2 = zzoyVarZza.zzd();
            zzeaVar.zzb.zzd().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{zzhzVarZzh.zzi(bArrZzd, 0, bArrZzd.length), zzhzVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
        }
        return i0.f15558a;
    }
}
