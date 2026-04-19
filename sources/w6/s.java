package w6;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class s {
    private static String a(Context context, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && e(context, null, str)) {
            return str;
        }
        if (i10 >= 29) {
            if (e(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            return null;
        }
        if (e(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (e(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        return null;
    }

    static int b(Activity activity, String str) {
        if (activity == null) {
            return 0;
        }
        boolean zL = l(activity, str);
        boolean z10 = true;
        boolean z11 = !f(activity, str);
        if (!zL) {
            z10 = z11;
        } else if (z11) {
            z10 = false;
        }
        if (!zL && z10) {
            h(activity, str);
        }
        return (zL && z10) ? 4 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0247 A[PHI: r7
  0x0247: PHI (r7v56 java.lang.String) = 
  (r7v2 java.lang.String)
  (r7v3 java.lang.String)
  (r7v11 java.lang.String)
  (r7v16 java.lang.String)
  (r7v17 java.lang.String)
  (r7v31 java.lang.String)
  (r7v33 java.lang.String)
  (r7v38 java.lang.String)
  (r7v41 java.lang.String)
  (r7v57 java.lang.String)
 binds: [B:179:0x025a, B:173:0x0245, B:147:0x01ef, B:116:0x0178, B:111:0x016a, B:82:0x0103, B:79:0x00f9, B:61:0x00c7, B:53:0x00ac, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea A[PHI: r6
  0x00ea: PHI (r6v42 java.lang.String) = 
  (r6v4 java.lang.String)
  (r6v6 java.lang.String)
  (r6v8 java.lang.String)
  (r6v11 java.lang.String)
  (r6v15 java.lang.String)
  (r6v17 java.lang.String)
  (r6v21 java.lang.String)
  (r6v23 java.lang.String)
  (r6v26 java.lang.String)
  (r6v29 java.lang.String)
  (r6v31 java.lang.String)
  (r6v32 java.lang.String)
  (r6v33 java.lang.String)
  (r6v34 java.lang.String)
  (r6v36 java.lang.String)
  (r6v38 java.lang.String)
  (r6v40 java.lang.String)
  (r6v44 java.lang.String)
 binds: [B:171:0x023b, B:162:0x0219, B:156:0x0202, B:145:0x01e5, B:109:0x0161, B:94:0x0126, B:74:0x00e8, B:68:0x00d8, B:59:0x00be, B:51:0x00a3, B:48:0x0098, B:44:0x008d, B:39:0x0080, B:34:0x0072, B:30:0x0064, B:25:0x0054, B:20:0x0044, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.util.List<java.lang.String> c(android.content.Context r6, int r7) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.s.c(android.content.Context, int):java.util.List");
    }

    private static PackageInfo d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        String packageName = context.getPackageName();
        return i10 >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(packageName, 4096);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:4:0x0006, B:5:0x000a, B:7:0x0010, B:13:0x0021, B:15:0x0027, B:17:0x002d, B:19:0x0033, B:20:0x0042, B:22:0x0048), top: B:27:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:4:0x0006, B:5:0x000a, B:7:0x0010, B:13:0x0021, B:15:0x0027, B:17:0x002d, B:19:0x0033, B:20:0x0042, B:22:0x0048), top: B:27:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean e(android.content.Context r4, java.util.ArrayList<java.lang.String> r5, java.lang.String r6) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "permissions_handler"
            if (r5 == 0) goto L1f
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L1d
        La:
            boolean r3 = r5.hasNext()     // Catch: java.lang.Exception -> L1d
            if (r3 == 0) goto L1f
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Exception -> L1d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L1d
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Exception -> L1d
            if (r3 == 0) goto La
            return r0
        L1d:
            r4 = move-exception
            goto L55
        L1f:
            if (r4 != 0) goto L27
            java.lang.String r4 = "Unable to detect current Activity or App Context."
            android.util.Log.d(r2, r4)     // Catch: java.lang.Exception -> L1d
            return r1
        L27:
            android.content.pm.PackageInfo r4 = d(r4)     // Catch: java.lang.Exception -> L1d
            if (r4 != 0) goto L33
            java.lang.String r4 = "Unable to get Package info, will not be able to determine permissions to request."
            android.util.Log.d(r2, r4)     // Catch: java.lang.Exception -> L1d
            return r1
        L33:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1d
            java.lang.String[] r4 = r4.requestedPermissions     // Catch: java.lang.Exception -> L1d
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: java.lang.Exception -> L1d
            r5.<init>(r4)     // Catch: java.lang.Exception -> L1d
            java.util.Iterator r4 = r5.iterator()     // Catch: java.lang.Exception -> L1d
        L42:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> L1d
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> L1d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L1d
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Exception -> L1d
            if (r5 == 0) goto L42
            return r0
        L55:
            java.lang.String r5 = "Unable to check manifest for permission: "
            android.util.Log.d(r2, r5, r4)
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.s.e(android.content.Context, java.util.ArrayList, java.lang.String):boolean");
    }

    static boolean f(Activity activity, String str) {
        return !androidx.core.app.a.j(activity, str);
    }

    static int g(String str) {
        str.hashCode();
        switch (str) {
            case "android.permission.READ_SMS":
            case "android.permission.RECEIVE_WAP_PUSH":
            case "android.permission.RECEIVE_MMS":
            case "android.permission.RECEIVE_SMS":
            case "android.permission.SEND_SMS":
                return 13;
            case "android.permission.READ_CALENDAR":
            case "android.permission.WRITE_CALENDAR":
                return 0;
            case "android.permission.POST_NOTIFICATIONS":
                return 17;
            case "android.permission.READ_CALL_LOG":
            case "android.permission.READ_PHONE_NUMBERS":
            case "android.permission.READ_PHONE_STATE":
            case "android.permission.CALL_PHONE":
            case "android.permission.WRITE_CALL_LOG":
            case "android.permission.USE_SIP":
            case "com.android.voicemail.permission.ADD_VOICEMAIL":
                return 8;
            case "android.permission.ACCESS_FINE_LOCATION":
            case "android.permission.ACCESS_COARSE_LOCATION":
                return 3;
            case "android.permission.MANAGE_EXTERNAL_STORAGE":
                return 22;
            case "android.permission.ACCESS_NOTIFICATION_POLICY":
                return 27;
            case "android.permission.SYSTEM_ALERT_WINDOW":
                return 23;
            case "android.permission.BODY_SENSORS":
                return 12;
            case "android.permission.NEARBY_WIFI_DEVICES":
                return 31;
            case "android.permission.BLUETOOTH_CONNECT":
                return 30;
            case "android.permission.READ_EXTERNAL_STORAGE":
            case "android.permission.WRITE_EXTERNAL_STORAGE":
                return 15;
            case "android.permission.READ_MEDIA_IMAGES":
                return 9;
            case "android.permission.WRITE_CONTACTS":
            case "android.permission.GET_ACCOUNTS":
            case "android.permission.READ_CONTACTS":
                return 2;
            case "android.permission.BODY_SENSORS_BACKGROUND":
                return 35;
            case "android.permission.CAMERA":
                return 1;
            case "android.permission.READ_MEDIA_AUDIO":
                return 33;
            case "android.permission.READ_MEDIA_VIDEO":
                return 32;
            case "android.permission.SCHEDULE_EXACT_ALARM":
                return 34;
            case "android.permission.BLUETOOTH_ADVERTISE":
                return 29;
            case "android.permission.REQUEST_INSTALL_PACKAGES":
                return 24;
            case "android.permission.ACTIVITY_RECOGNITION":
                return 19;
            case "android.permission.RECORD_AUDIO":
                return 7;
            case "android.permission.ACCESS_BACKGROUND_LOCATION":
                return 4;
            case "android.permission.BLUETOOTH_SCAN":
                return 28;
            case "android.permission.ACCESS_MEDIA_LOCATION":
                return 18;
            default:
                return 20;
        }
    }

    private static void h(Context context, String str) {
        context.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
    }

    static Integer i(Integer num, Integer num2) {
        HashSet hashSet = new HashSet();
        hashSet.add(num);
        hashSet.add(num2);
        return j(hashSet);
    }

    static Integer j(Collection<Integer> collection) {
        if (collection.contains(4)) {
            return 4;
        }
        if (collection.contains(2)) {
            return 2;
        }
        if (collection.contains(0)) {
            return 0;
        }
        return collection.contains(3) ? 3 : 1;
    }

    static int k(Activity activity, String str, int i10) {
        if (i10 == -1) {
            return b(activity, str);
        }
        return 1;
    }

    private static boolean l(Context context, String str) {
        return context.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
    }
}
