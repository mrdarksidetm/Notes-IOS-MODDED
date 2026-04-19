package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.internal.play_billing.zzhl;

/* JADX INFO: loaded from: classes.dex */
final class f0 implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zzgu f8114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f8115c;

    f0(Context context, zzgu zzguVar) {
        this.f8115c = new g0(context);
        this.f8114b = zzguVar;
    }

    @Override // com.android.billingclient.api.d0
    public final void a(zzhl zzhlVar) {
        if (zzhlVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn(this.f8114b);
            zzhdVarZzy.zzo(zzhlVar);
            this.f8115c.a((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.d0
    public final void b(zzge zzgeVar, int i10) {
        try {
            zzgt zzgtVar = (zzgt) this.f8114b.zzi();
            zzgtVar.zzl(i10);
            this.f8114b = (zzgu) zzgtVar.zzf();
            c(zzgeVar);
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.d0
    public final void c(zzge zzgeVar) {
        if (zzgeVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn(this.f8114b);
            zzhdVarZzy.zzm(zzgeVar);
            this.f8115c.a((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.d0
    public final void d(zzga zzgaVar, int i10) {
        try {
            zzgt zzgtVar = (zzgt) this.f8114b.zzi();
            zzgtVar.zzl(i10);
            this.f8114b = (zzgu) zzgtVar.zzf();
            e(zzgaVar);
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.d0
    public final void e(zzga zzgaVar) {
        if (zzgaVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn(this.f8114b);
            zzhdVarZzy.zzl(zzgaVar);
            this.f8115c.a((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }
}
