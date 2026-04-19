package i6;

import ae.r;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import i6.e;

/* JADX INFO: loaded from: classes.dex */
final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f12584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f12585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f12586c;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            g.this.d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            g.this.d(network, false);
        }
    }

    public g(ConnectivityManager connectivityManager, e.a aVar) {
        this.f12584a = connectivityManager;
        this.f12585b = aVar;
        a aVar2 = new a();
        this.f12586c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    private final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f12584a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Network network, boolean z10) {
        Network[] allNetworks = this.f12584a.getAllNetworks();
        int length = allNetworks.length;
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Network network2 = allNetworks[i10];
            if (r.b(network2, network) ? z10 : c(network2)) {
                z11 = true;
                break;
            }
            i10++;
        }
        this.f12585b.a(z11);
    }

    @Override // i6.e
    public boolean a() {
        for (Network network : this.f12584a.getAllNetworks()) {
            if (c(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // i6.e
    public void shutdown() {
        this.f12584a.unregisterNetworkCallback(this.f12586c);
    }
}
