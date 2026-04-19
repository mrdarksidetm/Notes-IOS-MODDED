package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzai;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class t implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f8221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v6.l f8222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f8223c;

    t(b bVar, String str, v6.l lVar) {
        this.f8221a = str;
        this.f8222b = lVar;
        this.f8223c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        v6.m0 m0VarP = b.P(this.f8223c, this.f8221a, 9);
        if (m0VarP.b() != null) {
            this.f8222b.a(m0VarP.a(), m0VarP.b());
            return null;
        }
        this.f8222b.a(m0VarP.a(), zzai.zzk());
        return null;
    }
}
