package zb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import sc.c;

/* JADX INFO: loaded from: classes2.dex */
public class d extends BroadcastReceiver implements c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zb.a f24317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.b f24318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f24319d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f24320e;

    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            d dVar = d.this;
            dVar.k(dVar.f24317b.a(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            d dVar = d.this;
            dVar.k(dVar.f24317b.b(networkCapabilities));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            d.this.j();
        }
    }

    public d(Context context, zb.a aVar) {
        this.f24316a = context;
        this.f24317b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.f24318c.success(this.f24317b.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(List list) {
        this.f24318c.success(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f24319d.postDelayed(new Runnable() { // from class: zb.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f24315a.h();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(final List<String> list) {
        this.f24319d.post(new Runnable() { // from class: zb.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f24313a.i(list);
            }
        });
    }

    @Override // sc.c.d
    public void a(Object obj, c.b bVar) {
        this.f24318c = bVar;
        this.f24320e = new a();
        this.f24317b.c().registerDefaultNetworkCallback(this.f24320e);
        k(this.f24317b.d());
    }

    @Override // sc.c.d
    public void b(Object obj) {
        if (this.f24320e != null) {
            this.f24317b.c().unregisterNetworkCallback(this.f24320e);
            this.f24320e = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        c.b bVar = this.f24318c;
        if (bVar != null) {
            bVar.success(this.f24317b.d());
        }
    }
}
