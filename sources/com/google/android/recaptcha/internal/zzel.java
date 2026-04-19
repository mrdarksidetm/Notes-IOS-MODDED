package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class zzel {
    private final Map zza = new LinkedHashMap();
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        ArrayList arrayList = new ArrayList(v.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzrr) it.next()));
        }
        return arrayList;
    }

    public final Object zza(zzrr zzrrVar) throws zzby {
        int iZzQ = zzrrVar.zzQ();
        int i10 = iZzQ - 1;
        if (iZzQ == 0) {
            throw null;
        }
        switch (i10) {
            case 0:
                return this.zza.get(Integer.valueOf(zzrrVar.zzi()));
            case 1:
                return Boolean.valueOf(zzrrVar.zzO());
            case 2:
                byte[] bArrZzl = zzrrVar.zzK().zzl();
                if (bArrZzl.length == 1) {
                    return Byte.valueOf(bArrZzl[0]);
                }
                throw new zzby(4, 6, null);
            case 3:
                String strZzM = zzrrVar.zzM();
                if (strZzM.length() == 1) {
                    return Character.valueOf(strZzM.charAt(0));
                }
                throw new zzby(4, 6, null);
            case 4:
                int iZzj = zzrrVar.zzj();
                if (iZzj < -32768 || iZzj > 32767) {
                    throw new zzby(4, 6, null);
                }
                return Short.valueOf((short) iZzj);
            case 5:
                return Integer.valueOf(zzrrVar.zzk());
            case 6:
            case 8:
                throw new zzby(4, 6, null);
            case 7:
                return Long.valueOf(zzrrVar.zzJ());
            case 9:
                return Float.valueOf(zzrrVar.zzg());
            case 10:
                return Double.valueOf(zzrrVar.zzf());
            case 11:
                return zzrrVar.zzN();
            case 12:
                return null;
            default:
                throw new zzby(4, 5, null);
        }
    }

    public final Object zzb(int i10) {
        return this.zza.remove(Integer.valueOf(i10));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i10, Object obj) {
        zze(173, obj);
        this.zzb.add(173);
    }

    public final void zze(int i10, Object obj) {
        this.zza.put(Integer.valueOf(i10), obj);
    }

    public final Class[] zzf(List list) {
        List listZzh = zzh(list);
        ArrayList arrayList = new ArrayList(v.x(listZzh, 10));
        Iterator it = listZzh.iterator();
        while (it.hasNext()) {
            arrayList.add(zzej.zza(it.next()));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzg(List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
