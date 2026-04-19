package i6;

import android.content.Context;
import android.net.ConnectivityManager;
import i6.e;
import o6.h;
import o6.r;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final e a(Context context, e.a aVar, r rVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) androidx.core.content.a.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || !o6.d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (rVar != null && rVar.a() <= 5) {
                rVar.b("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new c();
        }
        try {
            return new g(connectivityManager, aVar);
        } catch (Exception e10) {
            if (rVar != null) {
                h.a(rVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e10));
            }
            return new c();
        }
    }
}
