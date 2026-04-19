package com.google.android.recaptcha.internal;

import android.content.Context;
import ge.c;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import je.v;
import nd.c0;
import nd.r;
import nd.t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbs implements zzav {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbs(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzav
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzbx.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzav
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (v.G(file.getName(), this.zzb, false, 2, null)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzav
    public final void zzc(String str, String str2) throws IOException {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(nd.v.x(cVar, 10));
        Iterator<Character> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(((r) it).c()));
        }
        String strH0 = c0.h0(t.e(arrayList).subList(0, 8), "", null, null, 0, null, null, 62, null);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(strH0)));
        zzbx.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzav
    public final boolean zzd(String str) {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i10];
                    if (ae.r.b(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i10++;
                }
            }
            return file != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
