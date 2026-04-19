package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzif;
import com.google.android.recaptcha.internal.zzig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzig<MessageType extends zzig<MessageType, BuilderType>, BuilderType extends zzif<MessageType, BuilderType>> implements zzlx {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static void zzc(Iterable iterable, List list) {
        byte[] bArr = zzla.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzlj)) {
            if (iterable instanceof zzmf) {
                list.addAll(iterable);
                return;
            }
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    int size2 = list.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        list.remove(size2);
                    }
                } else {
                    list.add(obj);
                }
            }
            return;
        }
        List listZza = ((zzlj) iterable).zza();
        zzlj zzljVar = (zzlj) list;
        int size3 = list.size();
        for (Object obj2 : listZza) {
            if (obj2 == null) {
                String str2 = "Element at index " + (zzljVar.size() - size3) + " is null.";
                int size4 = zzljVar.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(str2);
                    }
                    zzljVar.remove(size4);
                }
            } else {
                if (obj2 instanceof zziv) {
                } else if (obj2 instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj2;
                    zziv.zzk(bArr2, 0, bArr2.length);
                } else {
                    zzljVar.add((String) obj2);
                }
                zzljVar.zzb();
            }
        }
    }

    int zza(zzmk zzmkVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final zziv zzb() {
        try {
            int iZzn = zzn();
            zziv zzivVar = zziv.zzb;
            byte[] bArr = new byte[iZzn];
            zzjg zzjgVarZzz = zzjg.zzz(bArr, 0, iZzn);
            zze(zzjgVarZzz);
            zzjgVarZzz.zzA();
            return new zziu(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] zzd() {
        try {
            int iZzn = zzn();
            byte[] bArr = new byte[iZzn];
            zzjg zzjgVarZzz = zzjg.zzz(bArr, 0, iZzn);
            zze(zzjgVarZzz);
            zzjgVarZzz.zzA();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
