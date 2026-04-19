package com.google.android.gms.internal.mlkit_vision_document_scanner;

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
public final class zzrs implements zzrd {
    private b zza;
    private final b zzb;
    private final zzrf zzc;

    public zzrs(Context context, zzrf zzrfVar) {
        this.zzc = zzrfVar;
        a aVar = a.f8264g;
        t.f(context);
        final g gVarG = t.c().g(aVar);
        if (aVar.a().contains(u7.b.b("json"))) {
            this.zza = new w(new b() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzrp
                @Override // ma.b
                public final Object get() {
                    return gVarG.a("FIREBASE_ML_SDK", byte[].class, u7.b.b("json"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzrr
                        @Override // u7.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new w(new b() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzrq
            @Override // ma.b
            public final Object get() {
                return gVarG.a("FIREBASE_ML_SDK", byte[].class, u7.b.b("proto"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzro
                    @Override // u7.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static c zzb(zzrf zzrfVar, zzrc zzrcVar) {
        return c.e(zzrcVar.zzd(zzrfVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzrd
    public final void zza(zzrc zzrcVar) {
        b bVar;
        if (this.zzc.zza() == 0) {
            bVar = this.zza;
            if (bVar == null) {
                return;
            }
        } else {
            bVar = this.zzb;
        }
        ((f) bVar.get()).a(zzb(this.zzc, zzrcVar));
    }
}
