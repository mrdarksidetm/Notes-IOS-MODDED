package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzjc implements zzmj {
    private final zzjb zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzjc(zzjb zzjbVar) {
        byte[] bArr = zzla.zzb;
        this.zza = zzjbVar;
        zzjbVar.zzc = this;
    }

    private final void zzP(Object obj, zzmk zzmkVar, zzkd zzkdVar) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzmkVar.zzh(obj, this, zzkdVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzlc.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzQ(Object obj, zzmk zzmkVar, zzkd zzkdVar) throws zzlc {
        zzjb zzjbVar = this.zza;
        int iZzn = zzjbVar.zzn();
        if (zzjbVar.zza >= zzjbVar.zzb) {
            throw new zzlc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZze = this.zza.zze(iZzn);
        this.zza.zza++;
        zzmkVar.zzh(obj, this, zzkdVar);
        this.zza.zzz(0);
        r4.zza--;
        this.zza.zzA(iZze);
    }

    private final void zzR(int i10) throws zzlc {
        if (this.zza.zzd() != i10) {
            throw zzlc.zzi();
        }
    }

    private final void zzS(int i10) throws zzlb {
        if ((this.zzb & 7) != i10) {
            throw zzlc.zza();
        }
    }

    private static final void zzT(int i10) throws zzlc {
        if ((i10 & 3) != 0) {
            throw zzlc.zzg();
        }
    }

    private static final void zzU(int i10) throws zzlc {
        if ((i10 & 7) != 0) {
            throw zzlc.zzg();
        }
    }

    public static zzjc zzq(zzjb zzjbVar) {
        zzjc zzjcVar = zzjbVar.zzc;
        return zzjcVar != null ? zzjcVar : new zzjc(zzjbVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzA(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzlc.zza();
                }
                int iZzn = this.zza.zzn();
                zzU(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzlmVar.zzg(this.zza.zzo());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw zzlc.zza();
                }
                int iZzn2 = this.zza.zzn();
                zzU(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzB(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzkk) {
            zzkk zzkkVar = (zzkk) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzn = this.zza.zzn();
                zzT(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzkkVar.zzf(this.zza.zzc());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i10 != 5) {
                throw zzlc.zza();
            }
            do {
                zzkkVar.zzf(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int iZzn2 = this.zza.zzn();
                zzT(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i11 != 5) {
                throw zzlc.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    @Deprecated
    public final void zzC(List list, zzmk zzmkVar, zzkd zzkdVar) throws zzlb {
        int iZzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzlc.zza();
        }
        do {
            Object objZze = zzmkVar.zze();
            zzP(objZze, zzmkVar, zzkdVar);
            zzmkVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i10);
        this.zzd = iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzD(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int iZzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzktVar.zzh(this.zza.zzh());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzktVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int iZzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzE(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int iZzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzlmVar.zzg(this.zza.zzp());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int iZzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzF(List list, zzmk zzmkVar, zzkd zzkdVar) throws zzlc {
        int iZzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzlc.zza();
        }
        do {
            Object objZze = zzmkVar.zze();
            zzQ(objZze, zzmkVar, zzkdVar);
            zzmkVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i10);
        this.zzd = iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzG(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzn = this.zza.zzn();
                zzT(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzktVar.zzh(this.zza.zzk());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i10 != 5) {
                throw zzlc.zza();
            }
            do {
                zzktVar.zzh(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int iZzn2 = this.zza.zzn();
                zzT(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i11 != 5) {
                throw zzlc.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzH(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzlc.zza();
                }
                int iZzn = this.zza.zzn();
                zzU(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzlmVar.zzg(this.zza.zzt());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw zzlc.zza();
                }
                int iZzn2 = this.zza.zzn();
                zzU(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzI(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int iZzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzktVar.zzh(this.zza.zzl());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzktVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int iZzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzJ(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int iZzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzlmVar.zzg(this.zza.zzu());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int iZzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    public final void zzK(List list, boolean z10) throws zzlb {
        int iZzm;
        int iZzm2;
        if ((this.zzb & 7) != 2) {
            throw zzlc.zza();
        }
        if ((list instanceof zzlj) && !z10) {
            zzlj zzljVar = (zzlj) list;
            do {
                zzp();
                zzljVar.zzb();
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            do {
                list.add(z10 ? zzs() : zzr());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzL(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int iZzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzktVar.zzh(this.zza.zzn());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzktVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int iZzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzM(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int iZzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzlmVar.zzg(this.zza.zzv());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int iZzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final boolean zzN() throws zzlb {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final boolean zzO() {
        int i10;
        if (this.zza.zzC() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final double zza() throws zzlb {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final float zzb() throws zzlb {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzc() {
        int iZzm = this.zzd;
        if (iZzm != 0) {
            this.zzb = iZzm;
            this.zzd = 0;
        } else {
            iZzm = this.zza.zzm();
            this.zzb = iZzm;
        }
        return (iZzm == 0 || iZzm == this.zzc) ? a.e.API_PRIORITY_OTHER : iZzm >>> 3;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zze() throws zzlb {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzf() throws zzlb {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzg() throws zzlb {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzh() throws zzlb {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzi() throws zzlb {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzj() throws zzlb {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzk() throws zzlb {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzl() throws zzlb {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzm() throws zzlb {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzn() throws zzlb {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzo() throws zzlb {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final zziv zzp() throws zzlb {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final String zzr() throws zzlb {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final String zzs() throws zzlb {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzt(Object obj, zzmk zzmkVar, zzkd zzkdVar) throws zzlb {
        zzS(3);
        zzP(obj, zzmkVar, zzkdVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzu(Object obj, zzmk zzmkVar, zzkd zzkdVar) throws zzlc {
        zzS(2);
        zzQ(obj, zzmkVar, zzkdVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzv(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzim) {
            zzim zzimVar = (zzim) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int iZzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzimVar.zze(this.zza.zzD());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzimVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int iZzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzw(List list) throws zzlb {
        int iZzm;
        if ((this.zzb & 7) != 2) {
            throw zzlc.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == this.zzb);
        this.zzd = iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzx(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzjx) {
            zzjx zzjxVar = (zzjx) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzlc.zza();
                }
                int iZzn = this.zza.zzn();
                zzU(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzjxVar.zzf(this.zza.zzb());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzjxVar.zzf(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw zzlc.zza();
                }
                int iZzn2 = this.zza.zzn();
                zzU(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzy(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int iZzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzktVar.zzh(this.zza.zzf());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzktVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int iZzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzz(List list) throws zzlc {
        int iZzm;
        int iZzm2;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzn = this.zza.zzn();
                zzT(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzktVar.zzh(this.zza.zzg());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i10 != 5) {
                throw zzlc.zza();
            }
            do {
                zzktVar.zzh(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int iZzn2 = this.zza.zzn();
                zzT(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i11 != 5) {
                throw zzlc.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }
}
