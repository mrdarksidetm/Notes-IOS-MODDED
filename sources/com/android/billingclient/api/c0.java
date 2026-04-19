package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzal;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgd;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgk;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8056a = 0;

    static {
        zzal zzalVar = d0.f8081a;
    }

    public static zzga a(int i10, int i11, e eVar) {
        try {
            zzfz zzfzVarZzy = zzga.zzy();
            zzgg zzggVarZzy = zzgk.zzy();
            zzggVarZzy.zzn(eVar.b());
            zzggVarZzy.zzm(eVar.a());
            zzggVarZzy.zzo(i10);
            zzfzVarZzy.zzl(zzggVarZzy);
            zzfzVarZzy.zzn(i11);
            return (zzga) zzfzVarZzy.zzf();
        } catch (Exception e10) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    public static zzga b(int i10, int i11, e eVar, String str) {
        try {
            zzgg zzggVarZzy = zzgk.zzy();
            zzggVarZzy.zzn(eVar.b());
            zzggVarZzy.zzm(eVar.a());
            zzggVarZzy.zzo(i10);
            if (str != null) {
                zzggVarZzy.zzl(str);
            }
            zzfz zzfzVarZzy = zzga.zzy();
            zzfzVarZzy.zzl(zzggVarZzy);
            zzfzVarZzy.zzn(i11);
            return (zzga) zzfzVarZzy.zzf();
        } catch (Exception e10) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    public static zzge c(int i10) {
        try {
            zzgd zzgdVarZzy = zzge.zzy();
            zzgdVarZzy.zzm(i10);
            return (zzge) zzgdVarZzy.zzf();
        } catch (Exception e10) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
