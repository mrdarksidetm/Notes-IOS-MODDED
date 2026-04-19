package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzhe;

/* JADX INFO: loaded from: classes.dex */
final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u7.f f8121b;

    g0(Context context) {
        try {
            w7.t.f(context);
            this.f8121b = w7.t.c().g(com.google.android.datatransport.cct.a.f8264g).a("PLAY_BILLING_LIBRARY", zzhe.class, u7.b.b("proto"), new u7.e() { // from class: v6.f0
                @Override // u7.e
                public final Object apply(Object obj) {
                    return ((zzhe) obj).zzc();
                }
            });
        } catch (Throwable unused) {
            this.f8120a = true;
        }
    }

    public final void a(zzhe zzheVar) {
        String str;
        if (this.f8120a) {
            str = "Skipping logging since initialization failed.";
        } else {
            try {
                this.f8121b.a(u7.c.d(zzheVar));
                return;
            } catch (Throwable unused) {
                str = "logging failed.";
            }
        }
        zzb.zzk("BillingLogger", str);
    }
}
