package com.google.android.recaptcha.internal;

import ae.r;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import md.x;
import nd.r0;
import nd.y0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbk {
    public zzbk() {
        new ConcurrentHashMap();
        zzc();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            r.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zznz.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zznz.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zznz.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zznz.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zznz.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return y0.b();
        }
    }

    public static final boolean zzb(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = context.getSystemService("connectivity");
            r.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            if (networkCapabilities.hasCapability(16)) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static final Map zzc() {
        Map mapJ = r0.j(x.a(0, zznz.NET_CAPABILITY_MMS), x.a(1, zznz.NET_CAPABILITY_SUPL), x.a(2, zznz.NET_CAPABILITY_DUN), x.a(3, zznz.NET_CAPABILITY_FOTA), x.a(4, zznz.NET_CAPABILITY_IMS), x.a(5, zznz.NET_CAPABILITY_CBS), x.a(6, zznz.NET_CAPABILITY_WIFI_P2P), x.a(7, zznz.NET_CAPABILITY_IA), x.a(8, zznz.NET_CAPABILITY_RCS), x.a(9, zznz.NET_CAPABILITY_XCAP), x.a(10, zznz.NET_CAPABILITY_EIMS), x.a(11, zznz.NET_CAPABILITY_NOT_METERED), x.a(12, zznz.NET_CAPABILITY_INTERNET), x.a(13, zznz.NET_CAPABILITY_NOT_RESTRICTED), x.a(14, zznz.NET_CAPABILITY_TRUSTED), x.a(15, zznz.NET_CAPABILITY_NOT_VPN));
        int i10 = Build.VERSION.SDK_INT;
        mapJ.put(17, zznz.NET_CAPABILITY_CAPTIVE_PORTAL);
        mapJ.put(16, zznz.NET_CAPABILITY_VALIDATED);
        if (i10 >= 28) {
            mapJ.put(18, zznz.NET_CAPABILITY_NOT_ROAMING);
            mapJ.put(19, zznz.NET_CAPABILITY_FOREGROUND);
            mapJ.put(20, zznz.NET_CAPABILITY_NOT_CONGESTED);
            mapJ.put(21, zznz.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i10 >= 29) {
            mapJ.put(23, zznz.NET_CAPABILITY_MCX);
        }
        if (i10 >= 30) {
            mapJ.put(25, zznz.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i10 >= 31) {
            mapJ.put(32, zznz.NET_CAPABILITY_HEAD_UNIT);
            mapJ.put(29, zznz.NET_CAPABILITY_ENTERPRISE);
        }
        if (i10 >= 33) {
            mapJ.put(35, zznz.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            mapJ.put(34, zznz.NET_CAPABILITY_PRIORITIZE_LATENCY);
            mapJ.put(33, zznz.NET_CAPABILITY_MMTEL);
        }
        return mapJ;
    }
}
