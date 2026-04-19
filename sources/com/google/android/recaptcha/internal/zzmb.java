package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzmb implements zzmk {
    private final zzlx zza;
    private final zznb zzb;
    private final boolean zzc;
    private final zzke zzd;

    private zzmb(zznb zznbVar, zzke zzkeVar, zzlx zzlxVar) {
        this.zzb = zznbVar;
        this.zzc = zzkeVar.zzj(zzlxVar);
        this.zzd = zzkeVar;
        this.zza = zzlxVar;
    }

    static zzmb zzc(zznb zznbVar, zzke zzkeVar, zzlx zzlxVar) {
        return new zzmb(zznbVar, zzkeVar, zzlxVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zza(Object obj) {
        zznb zznbVar = this.zzb;
        int iZzb = zznbVar.zzb(zznbVar.zzd(obj));
        return this.zzc ? iZzb + this.zzd.zzb(obj).zzb() : iZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final Object zze() {
        zzlx zzlxVar = this.zza;
        return zzlxVar instanceof zzks ? ((zzks) zzlxVar).zzt() : zzlxVar.zzaa().zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzg(Object obj, Object obj2) {
        zzmm.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzmm.zzq(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzh(Object obj, zzmj zzmjVar, zzkd zzkdVar) {
        boolean zZzO;
        zznb zznbVar = this.zzb;
        Object objZzc = zznbVar.zzc(obj);
        zzke zzkeVar = this.zzd;
        zzki zzkiVarZzc = zzkeVar.zzc(obj);
        while (zzmjVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzmjVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzd = zzkeVar.zzd(zzkdVar, this.zza, iZzd >>> 3);
                        if (objZzd != null) {
                            zzkeVar.zzg(zzmjVar, objZzd, zzkdVar, zzkiVarZzc);
                        } else {
                            zZzO = zznbVar.zzr(objZzc, zzmjVar);
                        }
                    } else {
                        zZzO = zzmjVar.zzO();
                    }
                    if (!zZzO) {
                        break;
                    }
                } else {
                    int iZzj = 0;
                    Object objZzd2 = null;
                    zziv zzivVarZzp = null;
                    while (zzmjVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzmjVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzmjVar.zzj();
                            objZzd2 = zzkeVar.zzd(zzkdVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzd2 != null) {
                                zzkeVar.zzg(zzmjVar, objZzd2, zzkdVar, zzkiVarZzc);
                            } else {
                                zzivVarZzp = zzmjVar.zzp();
                            }
                        } else if (!zzmjVar.zzO()) {
                            break;
                        }
                    }
                    if (zzmjVar.zzd() != 12) {
                        throw zzlc.zzb();
                    }
                    if (zzivVarZzp != null) {
                        if (objZzd2 != null) {
                            zzkeVar.zzh(zzivVarZzp, objZzd2, zzkdVar, zzkiVarZzc);
                        } else {
                            zznbVar.zzk(objZzc, iZzj, zzivVarZzp);
                        }
                    }
                }
            } finally {
                zznbVar.zzn(obj, objZzc);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0088 A[EDGE_INSN: B:56:0x0088->B:34:0x0088 BREAK  A[LOOP:1: B:18:0x004a->B:61:0x004a], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r10, byte[] r11, int r12, int r13, com.google.android.recaptcha.internal.zzik r14) throws com.google.android.recaptcha.internal.zzlc {
        /*
            r9 = this;
            r0 = r10
            com.google.android.recaptcha.internal.zzks r0 = (com.google.android.recaptcha.internal.zzks) r0
            com.google.android.recaptcha.internal.zznc r1 = r0.zzc
            com.google.android.recaptcha.internal.zznc r2 = com.google.android.recaptcha.internal.zznc.zzc()
            if (r1 != r2) goto L11
            com.google.android.recaptcha.internal.zznc r1 = com.google.android.recaptcha.internal.zznc.zzf()
            r0.zzc = r1
        L11:
            com.google.android.recaptcha.internal.zzko r10 = (com.google.android.recaptcha.internal.zzko) r10
            r10.zzi()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto L92
            int r4 = com.google.android.recaptcha.internal.zzil.zzi(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L48
            r12 = r2 & 7
            if (r12 != r3) goto L43
            com.google.android.recaptcha.internal.zzke r12 = r9.zzd
            com.google.android.recaptcha.internal.zzkd r0 = r14.zzd
            com.google.android.recaptcha.internal.zzlx r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r0 = r12.zzd(r0, r3, r5)
            if (r0 != 0) goto L40
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.recaptcha.internal.zzil.zzh(r2, r3, r4, r5, r6, r7)
            goto L18
        L40:
            int r11 = com.google.android.recaptcha.internal.zzmg.zza
            throw r10
        L43:
            int r12 = com.google.android.recaptcha.internal.zzil.zzo(r2, r11, r4, r13, r14)
            goto L18
        L48:
            r12 = 0
            r2 = r10
        L4a:
            if (r4 >= r13) goto L88
            int r4 = com.google.android.recaptcha.internal.zzil.zzi(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L6c
            r8 = 3
            if (r6 == r8) goto L5c
            goto L7f
        L5c:
            if (r0 != 0) goto L69
            if (r7 != r3) goto L7f
            int r4 = com.google.android.recaptcha.internal.zzil.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.recaptcha.internal.zziv r2 = (com.google.android.recaptcha.internal.zziv) r2
            goto L4a
        L69:
            int r11 = com.google.android.recaptcha.internal.zzmg.zza
            throw r10
        L6c:
            if (r7 != 0) goto L7f
            int r4 = com.google.android.recaptcha.internal.zzil.zzi(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.recaptcha.internal.zzke r0 = r9.zzd
            com.google.android.recaptcha.internal.zzkd r5 = r14.zzd
            com.google.android.recaptcha.internal.zzlx r6 = r9.zza
            java.lang.Object r0 = r0.zzd(r5, r6, r12)
            goto L4a
        L7f:
            r6 = 12
            if (r5 == r6) goto L88
            int r4 = com.google.android.recaptcha.internal.zzil.zzo(r5, r11, r4, r13, r14)
            goto L4a
        L88:
            if (r2 == 0) goto L90
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zzj(r12, r2)
        L90:
            r12 = r4
            goto L18
        L92:
            if (r12 != r13) goto L95
            return
        L95:
            com.google.android.recaptcha.internal.zzlc r10 = com.google.android.recaptcha.internal.zzlc.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmb.zzi(java.lang.Object, byte[], int, int, com.google.android.recaptcha.internal.zzik):void");
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzj(Object obj, zzno zznoVar) {
        Iterator itZzf = this.zzd.zzb(obj).zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzkh zzkhVar = (zzkh) entry.getKey();
            if (zzkhVar.zze() != zznn.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzkhVar.zzg();
            zzkhVar.zzf();
            zznoVar.zzw(zzkhVar.zza(), entry instanceof zzlf ? ((zzlf) entry).zza().zzb() : entry.getValue());
        }
        zznb zznbVar = this.zzb;
        zznbVar.zzp(zznbVar.zzd(obj), zznoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzk(Object obj, Object obj2) {
        zznb zznbVar = this.zzb;
        if (!zznbVar.zzd(obj).equals(zznbVar.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzl(Object obj) {
        return this.zzd.zzb(obj).zzk();
    }
}
