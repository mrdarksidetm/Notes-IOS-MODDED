package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzae extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzag zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzae(zzag zzagVar, String str, d dVar) {
        super(2, dVar);
        this.zzc = zzagVar;
        this.zzd = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzae(this.zzc, this.zzd, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzae) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzdf] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzaa zzaaVar;
        Object objE = rd.d.e();
        zzdf zzdfVar = this.zzb;
        try {
        } catch (Exception e10) {
            zzdfVar.zzb(new zzbj(zzbh.zzb, zzbg.zzab, e10.getMessage()));
            zzag zzagVar = this.zzc;
            this.zza = zzagVar;
            int i10 = 2;
            this.zzb = 2;
            if (e10 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e10).getErrorCode();
                if (errorCode == -100) {
                    i10 = 44;
                } else if (errorCode == -12) {
                    i10 = 39;
                } else if (errorCode == -3) {
                    i10 = 30;
                } else if (errorCode == -2) {
                    i10 = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i10 = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i10 = 53;
                            break;
                        case -17:
                            i10 = 52;
                            break;
                        case -16:
                            i10 = 43;
                            break;
                        case -15:
                            i10 = 42;
                            break;
                        case -14:
                            i10 = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i10 = 36;
                                    break;
                                case -8:
                                    i10 = 35;
                                    break;
                                case -7:
                                    i10 = 34;
                                    break;
                                case -6:
                                    i10 = 33;
                                    break;
                                case -5:
                                    i10 = 32;
                                    break;
                            }
                            break;
                    }
                } else {
                    i10 = 28;
                }
            } else {
                i10 = 45;
            }
            zzrh zzrhVarZzf = zzri.zzf();
            zzrhVarZzf.zzp(i10);
            zzrhVarZzf.zzq(15);
            obj = zzrhVarZzf.zzj();
            if (obj == objE) {
                return objE;
            }
            zzaaVar = zzagVar;
        }
        if (zzdfVar == 0) {
            u.b(obj);
            zzdf zzdfVarZzb = zzab.zzb(this.zzc, this.zzd);
            zzag zzagVar2 = this.zzc;
            zzap zzapVar = zzagVar2.zzb;
            String str = zzagVar2.zzd;
            this.zza = zzdfVarZzb;
            this.zzb = 1;
            obj = zzapVar.zzc(str, this);
            zzdfVar = zzdfVarZzb;
            if (obj == objE) {
                return objE;
            }
        } else {
            if (zzdfVar != 1) {
                zzaaVar = (zzaa) this.zza;
                u.b(obj);
                int iZza = zzaaVar.zza();
                zzrh zzrhVar = (zzrh) ((zzri) obj).zzq();
                zzrhVar.zze(zzaaVar.zza());
                return new zzy(iZza, (zzri) zzrhVar.zzj());
            }
            zzdf zzdfVar2 = (zzdf) this.zza;
            u.b(obj);
            zzdfVar = zzdfVar2;
        }
        zzdfVar.zza();
        zzag zzagVar3 = this.zzc;
        zzrj zzrjVarZzf = zzrm.zzf();
        zzrk zzrkVarZzf = zzrl.zzf();
        zzrkVarZzf.zzv((String) obj);
        zzrjVarZzf.zze((zzrl) zzrkVarZzf.zzj());
        return zzab.zza(zzagVar3, (zzrm) zzrjVarZzf.zzj());
    }
}
