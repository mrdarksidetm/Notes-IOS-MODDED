package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static o f1092d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f1094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f1095c = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f1097b;

        a() {
        }
    }

    o(Context context, LocationManager locationManager) {
        this.f1093a = context;
        this.f1094b = locationManager;
    }

    static o a(Context context) {
        if (f1092d == null) {
            Context applicationContext = context.getApplicationContext();
            f1092d = new o(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1092d;
    }

    private Location b() {
        Location locationC = e3.i.b(this.f1093a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = e3.i.b(this.f1093a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f1094b.isProviderEnabled(str)) {
                return this.f1094b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f1095c.f1097b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f1095c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        n nVarB = n.b();
        nVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        nVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = nVarB.f1091c == 1;
        long j11 = nVarB.f1090b;
        long j12 = nVarB.f1089a;
        nVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = nVarB.f1090b;
        if (j11 == -1 || j12 == -1) {
            j10 = 43200000 + jCurrentTimeMillis;
        } else {
            j10 = (jCurrentTimeMillis > j12 ? j13 + 0 : jCurrentTimeMillis > j11 ? j12 + 0 : j11 + 0) + 60000;
        }
        aVar.f1096a = z10;
        aVar.f1097b = j10;
    }

    boolean d() {
        a aVar = this.f1095c;
        if (e()) {
            return aVar.f1096a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f1096a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
