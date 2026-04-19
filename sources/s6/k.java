package s6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public class k extends w1 {
    public k(h3 h3Var, u6.k kVar) {
        super(h3Var, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n0 z(Context context) {
        return new n0(!y(context), true, true);
    }

    @Override // s6.j1
    public void a(Context context) {
        x(context);
    }

    @Override // s6.j1
    public boolean c() {
        return false;
    }

    public void x(final Context context) {
        super.v(b(new c.a() { // from class: s6.j
            @Override // u6.c.a
            public final n0 run() {
                return this.f20153a.z(context);
            }
        }));
    }

    public final boolean y(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(4)) {
            return false;
        }
        t(f1.a("5E373978A7115A4F8A1D5353"), f1.b(f1.c("43361A6D")));
        return true;
    }
}
