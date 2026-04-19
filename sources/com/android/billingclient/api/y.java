package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzhl;
import com.google.android.gms.internal.play_billing.zzr;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class y implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8248a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8249b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v6.c f8250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f8251d;

    /* synthetic */ y(b bVar, v6.c cVar, v6.s sVar) {
        this.f8251d = bVar;
        this.f8250c = cVar;
    }

    private final void d(e eVar) {
        synchronized (this.f8248a) {
            v6.c cVar = this.f8250c;
            if (cVar != null) {
                cVar.onBillingSetupFinished(eVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ java.lang.Object a() {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.y.a():java.lang.Object");
    }

    final /* synthetic */ void b() {
        this.f8251d.f8025a = 0;
        this.f8251d.f8031g = null;
        e eVar = e0.f8099n;
        this.f8251d.Y(c0.a(24, 6, eVar));
        d(eVar);
    }

    final void c() {
        synchronized (this.f8248a) {
            this.f8250c = null;
            this.f8249b = true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzj("BillingClient", "Billing service connected.");
        this.f8251d.f8031g = zzr.zzu(iBinder);
        Callable callable = new Callable() { // from class: com.android.billingclient.api.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f8241a.a();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f8245a.b();
            }
        };
        b bVar = this.f8251d;
        if (bVar.X(callable, 30000L, runnable, bVar.S()) == null) {
            b bVar2 = this.f8251d;
            e eVarU = bVar2.U();
            bVar2.Y(c0.a(25, 6, eVarU));
            d(eVarU);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzk("BillingClient", "Billing service disconnected.");
        this.f8251d.f8030f.a(zzhl.zzz());
        this.f8251d.f8031g = null;
        this.f8251d.f8025a = 0;
        synchronized (this.f8248a) {
            v6.c cVar = this.f8250c;
            if (cVar != null) {
                cVar.onBillingServiceDisconnected();
            }
        }
    }
}
