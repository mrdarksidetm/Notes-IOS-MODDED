package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzajr<T extends zzajt<T>> {
    private static final zzajr<?> zzb = new zzajr<>(true);
    final zzalw<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzajr() {
        this.zza = new zzalz();
    }

    private zzajr(zzalw<T, Object> zzalwVar) {
        this.zza = zzalwVar;
        zze();
    }

    private zzajr(boolean z10) {
        this(new zzalz());
        zze();
    }

    public static int zza(zzajt<?> zzajtVar, Object obj) {
        zzamw zzamwVarZzb = zzajtVar.zzb();
        int iZza = zzajtVar.zza();
        if (!zzajtVar.zze()) {
            return zza(zzamwVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!zzajtVar.zzd()) {
            int iZza2 = 0;
            while (i10 < size) {
                iZza2 += zza(zzamwVarZzb, iZza, list.get(i10));
                i10++;
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZza3 = 0;
        while (i10 < size) {
            iZza3 += zza(zzamwVarZzb, list.get(i10));
            i10++;
        }
        return zzajg.zzi(iZza) + iZza3 + zzajg.zzj(iZza3);
    }

    static int zza(zzamw zzamwVar, int i10, Object obj) {
        int iZzi = zzajg.zzi(i10);
        if (zzamwVar == zzamw.zzj) {
            zzakb.zza((zzalc) obj);
            iZzi <<= 1;
        }
        return iZzi + zza(zzamwVar, obj);
    }

    private static int zza(zzamw zzamwVar, Object obj) {
        switch (zzajq.zzb[zzamwVar.ordinal()]) {
            case 1:
                return zzajg.zza(((Double) obj).doubleValue());
            case 2:
                return zzajg.zza(((Float) obj).floatValue());
            case 3:
                return zzajg.zzd(((Long) obj).longValue());
            case 4:
                return zzajg.zzg(((Long) obj).longValue());
            case 5:
                return zzajg.zze(((Integer) obj).intValue());
            case 6:
                return zzajg.zzc(((Long) obj).longValue());
            case 7:
                return zzajg.zzd(((Integer) obj).intValue());
            case 8:
                return zzajg.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzajg.zza((zzalc) obj);
            case 10:
                return obj instanceof zzakg ? zzajg.zza((zzakg) obj) : zzajg.zzb((zzalc) obj);
            case 11:
                return obj instanceof zzaip ? zzajg.zza((zzaip) obj) : zzajg.zza((String) obj);
            case 12:
                return obj instanceof zzaip ? zzajg.zza((zzaip) obj) : zzajg.zza((byte[]) obj);
            case 13:
                return zzajg.zzj(((Integer) obj).intValue());
            case 14:
                return zzajg.zzg(((Integer) obj).intValue());
            case 15:
                return zzajg.zze(((Long) obj).longValue());
            case 16:
                return zzajg.zzh(((Integer) obj).intValue());
            case 17:
                return zzajg.zzf(((Long) obj).longValue());
            case 18:
                return obj instanceof zzaka ? zzajg.zzc(((zzaka) obj).zza()) : zzajg.zzc(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() != zzand.MESSAGE || key.zze() || key.zzd()) {
            return zza((zzajt<?>) key, value);
        }
        boolean z10 = value instanceof zzakg;
        int iZza = entry.getKey().zza();
        return z10 ? zzajg.zza(iZza, (zzakg) value) : zzajg.zza(iZza, (zzalc) value);
    }

    private final Object zza(T t10) {
        Object obj = this.zza.get(t10);
        if (!(obj instanceof zzakg)) {
            return obj;
        }
        throw new NoSuchMethodError();
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzall) {
            return ((zzall) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static void zza(zzajg zzajgVar, zzamw zzamwVar, int i10, Object obj) {
        if (zzamwVar == zzamw.zzj) {
            zzalc zzalcVar = (zzalc) obj;
            zzakb.zza(zzalcVar);
            zzajgVar.zzk(i10, 3);
            zzalcVar.zza(zzajgVar);
            zzajgVar.zzk(i10, 4);
        }
        zzajgVar.zzk(i10, zzamwVar.zza());
        switch (zzajq.zzb[zzamwVar.ordinal()]) {
            case 1:
                zzajgVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzajgVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzajgVar.zzj(((Long) obj).longValue());
                break;
            case 4:
                zzajgVar.zzj(((Long) obj).longValue());
                break;
            case 5:
                zzajgVar.zzl(((Integer) obj).intValue());
                break;
            case 6:
                zzajgVar.zzh(((Long) obj).longValue());
                break;
            case 7:
                zzajgVar.zzk(((Integer) obj).intValue());
                break;
            case 8:
                zzajgVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzalc) obj).zza(zzajgVar);
                break;
            case 10:
                zzajgVar.zzc((zzalc) obj);
                break;
            case 11:
                if (!(obj instanceof zzaip)) {
                    zzajgVar.zzb((String) obj);
                } else {
                    zzajgVar.zzb((zzaip) obj);
                }
                break;
            case 12:
                if (!(obj instanceof zzaip)) {
                    byte[] bArr = (byte[]) obj;
                    zzajgVar.zzb(bArr, 0, bArr.length);
                } else {
                    zzajgVar.zzb((zzaip) obj);
                }
                break;
            case 13:
                zzajgVar.zzn(((Integer) obj).intValue());
                break;
            case 14:
                zzajgVar.zzk(((Integer) obj).intValue());
                break;
            case 15:
                zzajgVar.zzh(((Long) obj).longValue());
                break;
            case 16:
                zzajgVar.zzm(((Integer) obj).intValue());
                break;
            case 17:
                zzajgVar.zzi(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof zzaka)) {
                    zzajgVar.zzl(((Integer) obj).intValue());
                } else {
                    zzajgVar.zzl(((zzaka) obj).zza());
                }
                break;
        }
    }

    public static <T extends zzajt<T>> zzajr<T> zzb() {
        return (zzajr<T>) zzb;
    }

    private final void zzb(T t10, Object obj) {
        if (!t10.zze()) {
            zzc(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzc(t10, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzakg) {
            this.zzd = true;
        }
        this.zza.put(t10, obj);
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzakg;
        if (key.zze()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZza = zza((zzajt) key);
            List list = (List) value;
            int size = list.size();
            if (objZza == null) {
                objZza = new ArrayList(size);
            }
            List list2 = (List) objZza;
            for (int i10 = 0; i10 < size; i10++) {
                list2.add(zza(list.get(i10)));
            }
            this.zza.put(key, objZza);
            return;
        }
        if (key.zzc() != zzand.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(key, zza(value));
            return;
        }
        Object objZza2 = zza((zzajt) key);
        if (objZza2 == null) {
            this.zza.put(key, zza(value));
            if (z10) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z10) {
            throw new NoSuchMethodError();
        }
        this.zza.put(key, objZza2 instanceof zzall ? key.zza((zzall) objZza2, (zzall) value) : key.zza(((zzalc) objZza2).zzr(), (zzalc) value).zze());
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzale) {
            return ((zzale) obj).zzj();
        }
        if (obj instanceof zzakg) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzc(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.firebase-auth-api.zzamw r0 = r5.zzb()
            com.google.android.gms.internal.p002firebaseauthapi.zzakb.zza(r6)
            int[] r1 = com.google.android.gms.internal.p002firebaseauthapi.zzajq.zza
            com.google.android.gms.internal.firebase-auth-api.zzand r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = r2
            goto L47
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzalc
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzakg
            if (r0 == 0) goto L18
            goto L34
        L23:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaka
            if (r0 == 0) goto L18
            goto L34
        L2c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaip
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
        L34:
            r0 = r1
            goto L47
        L36:
            boolean r0 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            com.google.android.gms.internal.firebase-auth-api.zzamw r5 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzand r5 = r5.zzb()
            r3[r1] = r5
            r5 = 2
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r3[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzajr.zzc(com.google.android.gms.internal.firebase-auth-api.zzajt, java.lang.Object):void");
    }

    private static <T extends zzajt<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzand.MESSAGE) {
            return true;
        }
        boolean zZze = key.zze();
        Object value = entry.getValue();
        if (!zZze) {
            return zzb(value);
        }
        List list = (List) value;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!zzb(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        zzajr zzajrVar = new zzajr();
        int iZza = this.zza.zza();
        for (int i10 = 0; i10 < iZza; i10++) {
            Map.Entry<K, Object> entryZza = this.zza.zza(i10);
            zzajrVar.zzb((zzajt) entryZza.getKey(), entryZza.getValue());
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzajrVar.zzb((zzajt) entry.getKey(), entry.getValue());
        }
        zzajrVar.zzd = this.zzd;
        return zzajrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzajr) {
            return this.zza.equals(((zzajr) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zza() {
        int iZza = this.zza.zza();
        int iZza2 = 0;
        for (int i10 = 0; i10 < iZza; i10++) {
            iZza2 += zza((Map.Entry) this.zza.zza(i10));
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            iZza2 += zza((Map.Entry) it.next());
        }
        return iZza2;
    }

    public final void zza(zzajr<T> zzajrVar) {
        int iZza = zzajrVar.zza.zza();
        for (int i10 = 0; i10 < iZza; i10++) {
            zzb((Map.Entry) zzajrVar.zza.zza(i10));
        }
        Iterator it = zzajrVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzaki(this.zza.zzc().iterator()) : this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzaki(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int iZza = this.zza.zza();
        for (int i10 = 0; i10 < iZza; i10++) {
            Object value = this.zza.zza(i10).getValue();
            if (value instanceof zzajy) {
                ((zzajy) value).zzs();
            }
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzajy) {
                ((zzajy) value2).zzs();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int iZza = this.zza.zza();
        for (int i10 = 0; i10 < iZza; i10++) {
            if (!zzc(this.zza.zza(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (!zzc((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
