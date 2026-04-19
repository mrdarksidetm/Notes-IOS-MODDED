package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import da.w;
import ma.b;
import u7.c;
import u7.e;
import u7.f;
import u7.g;
import w7.t;

/* JADX INFO: loaded from: classes.dex */
public final class zzta implements zzsk {
    private b zza;
    private final b zzb;
    private final zzsm zzc;

    public zzta(Context context, zzsm zzsmVar) {
        this.zzc = zzsmVar;
        a aVar = a.f8264g;
        t.f(context);
        final g gVarG = t.c().g(aVar);
        if (aVar.a().contains(u7.b.b("json"))) {
            this.zza = new w(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsx
                @Override // ma.b
                public final Object get() {
                    return gVarG.a("FIREBASE_ML_SDK", byte[].class, u7.b.b("json"), new e() { // from class: com.google.android.gms.internal.mlkit_common.zzsz
                        @Override // u7.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new w(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsy
            @Override // ma.b
            public final Object get() {
                return gVarG.a("FIREBASE_ML_SDK", byte[].class, u7.b.b("proto"), new e() { // from class: com.google.android.gms.internal.mlkit_common.zzsw
                    @Override // u7.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static c zzb(zzsm zzsmVar, zzsj zzsjVar) {
        return c.e(zzsjVar.zze(zzsmVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsk
    public final void zza(zzsj zzsjVar) {
        b bVar;
        if (this.zzc.zza() == 0) {
            bVar = this.zza;
            if (bVar == null) {
                return;
            }
        } else {
            bVar = this.zzb;
        }
        ((f) bVar.get()).a(zzb(this.zzc, zzsjVar));
    }
}
