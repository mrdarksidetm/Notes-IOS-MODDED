package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.p;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class zzff implements zzfe {
    public static final zzff zza = new zzff();

    private zzff() {
    }

    private static final List zzc(Object obj) {
        if (obj instanceof byte[]) {
            return p.z0((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return p.F0((short[]) obj);
        }
        if (obj instanceof int[]) {
            return p.C0((int[]) obj);
        }
        if (obj instanceof long[]) {
            return p.D0((long[]) obj);
        }
        if (obj instanceof float[]) {
            return p.B0((float[]) obj);
        }
        if (obj instanceof double[]) {
            return p.A0((double[]) obj);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzby(4, 5, null);
        }
        Object objZza2 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza2 instanceof Object)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzby(4, 5, null);
        }
        zzekVar.zzc().zze(i10, zzb(objZza, objZza2));
    }

    public final Object zzb(Object obj, Object obj2) throws zzby {
        List listZzc = zzc(obj);
        List listZzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (listZzc2 != null) {
                ArrayList arrayList = new ArrayList(v.x(listZzc2, 10));
                Iterator it = listZzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (listZzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(v.x(listZzc, 10));
            Iterator it2 = listZzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (listZzc == null || listZzc2 == null) {
            throw new zzby(4, 5, null);
        }
        zzfd.zza(this, listZzc.size(), listZzc2.size());
        int size = listZzc.size();
        Double[] dArr = new Double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = Double.valueOf(Math.pow(((Number) listZzc.get(i10)).doubleValue(), ((Number) listZzc2.get(i10)).doubleValue()));
        }
        return dArr;
    }
}
