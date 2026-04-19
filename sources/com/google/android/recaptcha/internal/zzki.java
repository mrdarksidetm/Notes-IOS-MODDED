package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzki {
    private static final zzki zzb = new zzki(true);
    final zzmu zza = new zzmn(16);
    private boolean zzc;
    private boolean zzd;

    private zzki() {
    }

    private zzki(boolean z10) {
        zzg();
        zzg();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(com.google.android.recaptcha.internal.zzkh r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzki.zza(com.google.android.recaptcha.internal.zzkh, java.lang.Object):int");
    }

    public static zzki zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzmc) {
            return ((zzmc) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzlx zzlxVarZzj;
        zzkh zzkhVar = (zzkh) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzlh;
        zzkhVar.zzg();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzkhVar, zzl(value));
            return;
        }
        Object objZze = zze(zzkhVar);
        if (objZze == null) {
            this.zza.put(zzkhVar, zzl(value));
            if (z10) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z10) {
            throw null;
        }
        if (objZze instanceof zzmc) {
            zzlxVarZzj = zzkhVar.zzc((zzmc) objZze, (zzmc) value);
        } else {
            zzlw zzlwVarZzab = ((zzlx) objZze).zzab();
            zzkhVar.zzb(zzlwVarZzab, (zzlx) value);
            zzlxVarZzj = zzlwVarZzab.zzj();
        }
        this.zza.put(zzkhVar, zzlxVarZzj);
    }

    private static boolean zzn(Map.Entry entry) {
        zzkh zzkhVar = (zzkh) entry.getKey();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            return true;
        }
        zzkhVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzly) {
            return ((zzly) value).zzo();
        }
        if (value instanceof zzlh) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i10;
        int iZzx;
        int iZzx2;
        zzkh zzkhVar = (zzkh) entry.getKey();
        Object value = entry.getValue();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            return zza(zzkhVar, value);
        }
        zzkhVar.zzg();
        zzkhVar.zzf();
        boolean z10 = value instanceof zzlh;
        int iZza = ((zzkh) entry.getKey()).zza();
        if (z10) {
            int iZzx3 = zzjg.zzx(8);
            i10 = iZzx3 + iZzx3;
            iZzx = zzjg.zzx(16) + zzjg.zzx(iZza);
            int iZzx4 = zzjg.zzx(24);
            int iZza2 = ((zzlh) value).zza();
            iZzx2 = iZzx4 + zzjg.zzx(iZza2) + iZza2;
        } else {
            int iZzx5 = zzjg.zzx(8);
            i10 = iZzx5 + iZzx5;
            iZzx = zzjg.zzx(16) + zzjg.zzx(iZza);
            iZzx2 = zzjg.zzx(24) + zzjg.zzu((zzlx) value);
        }
        return i10 + iZzx + iZzx2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzki) {
            return this.zza.equals(((zzki) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzo = 0;
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            iZzo += zzo(this.zza.zzg(i10));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzki clone() {
        zzki zzkiVar = new zzki();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            zzkiVar.zzi((zzkh) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzkiVar.zzi((zzkh) entry.getKey(), entry.getValue());
        }
        zzkiVar.zzd = this.zzd;
        return zzkiVar;
    }

    public final Object zze(zzkh zzkhVar) {
        Object obj = this.zza.get(zzkhVar);
        if (!(obj instanceof zzlh)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        return this.zzd ? new zzlg(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            if (entryZzg.getValue() instanceof zzks) {
                ((zzks) entryZzg.getValue()).zzD();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzki zzkiVar) {
        for (int i10 = 0; i10 < zzkiVar.zza.zzb(); i10++) {
            zzm(zzkiVar.zza.zzg(i10));
        }
        Iterator it = zzkiVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzku) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzlh) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.recaptcha.internal.zzkh r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.zzg()
            com.google.android.recaptcha.internal.zznm r0 = r6.zzd()
            byte[] r1 = com.google.android.recaptcha.internal.zzla.zzb
            r7.getClass()
            com.google.android.recaptcha.internal.zznm r1 = com.google.android.recaptcha.internal.zznm.zza
            com.google.android.recaptcha.internal.zznn r1 = com.google.android.recaptcha.internal.zznn.INT
            com.google.android.recaptcha.internal.zznn r0 = r0.zza()
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L47;
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L2f;
                case 7: goto L26;
                case 8: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L57
        L1d:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzlx
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzlh
            if (r0 == 0) goto L57
            goto L4b
        L26:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzku
            if (r0 == 0) goto L57
            goto L4b
        L2f:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zziv
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4b
        L38:
            boolean r0 = r7 instanceof java.lang.String
            goto L49
        L3b:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L49
        L3e:
            boolean r0 = r7 instanceof java.lang.Double
            goto L49
        L41:
            boolean r0 = r7 instanceof java.lang.Float
            goto L49
        L44:
            boolean r0 = r7 instanceof java.lang.Long
            goto L49
        L47:
            boolean r0 = r7 instanceof java.lang.Integer
        L49:
            if (r0 == 0) goto L57
        L4b:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzlh
            if (r0 == 0) goto L51
            r5.zzd = r1
        L51:
            com.google.android.recaptcha.internal.zzmu r0 = r5.zza
            r0.put(r6, r7)
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r6.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            com.google.android.recaptcha.internal.zznm r6 = r6.zzd()
            com.google.android.recaptcha.internal.zznn r6 = r6.zza()
            r2[r1] = r6
            r6 = 2
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r2[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzki.zzi(com.google.android.recaptcha.internal.zzkh, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzn(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
