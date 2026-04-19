package w6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class q implements sc.l, sc.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f22500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f22501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<Integer, Integer> f22503e;

    @FunctionalInterface
    interface a {
        void a(int i10);
    }

    @FunctionalInterface
    interface b {
        void a(Map<Integer, Integer> map);
    }

    @FunctionalInterface
    interface c {
        void a(boolean z10);
    }

    public q(Context context) {
        this.f22499a = context;
    }

    private int a() {
        List<String> listC = s.c(this.f22499a, 21);
        if (!(listC == null || listC.isEmpty())) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    private int b() {
        if (Build.VERSION.SDK_INT < 33) {
            return androidx.core.app.j.b(this.f22499a).a() ? 1 : 0;
        }
        if (this.f22499a.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return 1;
        }
        return s.b(this.f22501c, "android.permission.POST_NOTIFICATIONS");
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0157, code lost:
    
        if (r12 == 0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [int] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e(int r15) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.q.e(int):int");
    }

    private boolean f() {
        List<String> listC = s.c(this.f22499a, 37);
        boolean z10 = listC != null && listC.contains("android.permission.WRITE_CALENDAR");
        boolean z11 = listC != null && listC.contains("android.permission.READ_CALENDAR");
        if (z10 && z11) {
            return true;
        }
        if (!z10) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z11) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    private void g(String str, int i10) {
        if (this.f22501c == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f22501c.getPackageName()));
        }
        this.f22501c.startActivityForResult(intent, i10);
        this.f22502d++;
    }

    void c(int i10, a aVar) {
        aVar.a(e(i10));
    }

    @Override // sc.n
    public boolean d(int i10, String[] strArr, int[] iArr) {
        int iG;
        Map<Integer, Integer> map;
        int i11;
        Integer numValueOf;
        if (i10 != 24) {
            this.f22502d = 0;
            return false;
        }
        if (this.f22503e == null) {
            return false;
        }
        if (strArr.length == 0 && iArr.length == 0) {
            Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
            return false;
        }
        List listAsList = Arrays.asList(strArr);
        int iIndexOf = listAsList.indexOf("android.permission.WRITE_CALENDAR");
        if (iIndexOf >= 0) {
            int iK = s.k(this.f22501c, "android.permission.WRITE_CALENDAR", iArr[iIndexOf]);
            this.f22503e.put(36, Integer.valueOf(iK));
            int iIndexOf2 = listAsList.indexOf("android.permission.READ_CALENDAR");
            if (iIndexOf2 >= 0) {
                int iIntValue = s.i(Integer.valueOf(iK), Integer.valueOf(s.k(this.f22501c, "android.permission.READ_CALENDAR", iArr[iIndexOf2]))).intValue();
                this.f22503e.put(37, Integer.valueOf(iIntValue));
                this.f22503e.put(0, Integer.valueOf(iIntValue));
            }
        }
        for (int i12 = 0; i12 < strArr.length; i12++) {
            String str = strArr[i12];
            if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR") && (iG = s.g(str)) != 20) {
                int i13 = iArr[i12];
                if (iG == 8) {
                    numValueOf = s.i(this.f22503e.get(8), Integer.valueOf(s.k(this.f22501c, str, i13)));
                    map = this.f22503e;
                    i11 = 8;
                } else if (iG == 7) {
                    if (!this.f22503e.containsKey(7)) {
                        this.f22503e.put(7, Integer.valueOf(s.k(this.f22501c, str, i13)));
                    }
                    if (!this.f22503e.containsKey(14)) {
                        this.f22503e.put(14, Integer.valueOf(s.k(this.f22501c, str, i13)));
                    }
                } else if (iG == 4) {
                    int iK2 = s.k(this.f22501c, str, i13);
                    if (!this.f22503e.containsKey(4)) {
                        map = this.f22503e;
                        i11 = 4;
                        numValueOf = Integer.valueOf(iK2);
                    }
                } else if (iG == 3) {
                    int iK3 = s.k(this.f22501c, str, i13);
                    if (Build.VERSION.SDK_INT < 29 && !this.f22503e.containsKey(4)) {
                        this.f22503e.put(4, Integer.valueOf(iK3));
                    }
                    if (!this.f22503e.containsKey(5)) {
                        this.f22503e.put(5, Integer.valueOf(iK3));
                    }
                    this.f22503e.put(Integer.valueOf(iG), Integer.valueOf(iK3));
                } else if (iG == 9 || iG == 32) {
                    this.f22503e.put(Integer.valueOf(iG), Integer.valueOf(e(iG)));
                } else if (!this.f22503e.containsKey(Integer.valueOf(iG))) {
                    this.f22503e.put(Integer.valueOf(iG), Integer.valueOf(s.k(this.f22501c, str, i13)));
                }
                map.put(i11, numValueOf);
            }
        }
        int length = this.f22502d - iArr.length;
        this.f22502d = length;
        b bVar = this.f22500b;
        if (bVar == null || length != 0) {
            return true;
        }
        bVar.a(this.f22503e);
        return true;
    }

    void h(List<Integer> list, b bVar, w6.b bVar2) {
        int iValueOf;
        Map<Integer, Integer> map;
        int i10;
        String str;
        int size;
        String str2;
        if (this.f22502d > 0) {
            str2 = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";
        } else {
            if (this.f22501c != null) {
                this.f22500b = bVar;
                this.f22503e = new HashMap();
                this.f22502d = 0;
                ArrayList arrayList = new ArrayList();
                for (Integer num : list) {
                    int i11 = 1;
                    if (e(num.intValue()) != 1) {
                        List<String> listC = s.c(this.f22501c, num.intValue());
                        i11 = 2;
                        if (listC != null && !listC.isEmpty()) {
                            int i12 = Build.VERSION.SDK_INT;
                            if (num.intValue() == 16) {
                                i10 = 209;
                                str = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                            } else if (i12 >= 30 && num.intValue() == 22) {
                                i10 = 210;
                                str = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
                            } else if (num.intValue() == 23) {
                                i10 = 211;
                                str = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
                            } else if (i12 >= 26 && num.intValue() == 24) {
                                i10 = 212;
                                str = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
                            } else if (num.intValue() == 27) {
                                i10 = 213;
                                str = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS";
                            } else if (i12 < 31 || num.intValue() != 34) {
                                if (num.intValue() != 37 && num.intValue() != 0) {
                                    arrayList.addAll(listC);
                                    size = this.f22502d + listC.size();
                                } else if (f()) {
                                    arrayList.add("android.permission.WRITE_CALENDAR");
                                    arrayList.add("android.permission.READ_CALENDAR");
                                    size = this.f22502d + 2;
                                } else {
                                    map = this.f22503e;
                                    iValueOf = 0;
                                }
                                this.f22502d = size;
                            } else {
                                i10 = 214;
                                str = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM";
                            }
                            g(str, i10);
                        } else if (!this.f22503e.containsKey(num)) {
                            num.intValue();
                            this.f22503e.put(num, 0);
                            if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                                map = this.f22503e;
                                iValueOf = 0;
                            } else {
                                map = this.f22503e;
                                iValueOf = Integer.valueOf(i11);
                            }
                        }
                    } else if (!this.f22503e.containsKey(num)) {
                        map = this.f22503e;
                        iValueOf = Integer.valueOf(i11);
                    }
                    map.put(num, iValueOf);
                }
                if (arrayList.size() > 0) {
                    androidx.core.app.a.g(this.f22501c, (String[]) arrayList.toArray(new String[0]), 24);
                }
                b bVar3 = this.f22500b;
                if (bVar3 == null || this.f22502d != 0) {
                    return;
                }
                bVar3.a(this.f22503e);
                return;
            }
            Log.d("permissions_handler", "Unable to detect current Activity.");
            str2 = "Unable to detect current Android Activity.";
        }
        bVar2.a("PermissionHandler.PermissionManager", str2);
    }

    public void i(Activity activity) {
        this.f22501c = activity;
    }

    void j(int i10, c cVar, w6.b bVar) {
        Activity activity = this.f22501c;
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> listC = s.c(activity, i10);
        if (listC == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            cVar.a(false);
            return;
        }
        if (!listC.isEmpty()) {
            cVar.a(androidx.core.app.a.j(this.f22501c, listC.get(0)));
            return;
        }
        Log.d("permissions_handler", "No permissions found in manifest for: " + i10 + " no need to show request rationale");
        cVar.a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[PHI: r4
  0x002c: PHI (r4v17 int) = (r4v1 int), (r4v18 int) binds: [B:37:0x0086, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    @Override // sc.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            android.app.Activity r5 = r3.f22501c
            r6 = 0
            if (r5 != 0) goto L6
            return r6
        L6:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r3.f22503e
            if (r0 != 0) goto Ld
            r3.f22502d = r6
            return r6
        Ld:
            r0 = 209(0xd1, float:2.93E-43)
            r1 = 1
            if (r4 != r0) goto L2e
            r4 = 16
            android.content.Context r5 = r3.f22499a
            java.lang.String r5 = r5.getPackageName()
            android.content.Context r0 = r3.f22499a
            java.lang.String r2 = "power"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            if (r0 == 0) goto L8d
            boolean r5 = r0.isIgnoringBatteryOptimizations(r5)
            if (r5 == 0) goto L8d
        L2c:
            r6 = r1
            goto L8d
        L2e:
            r0 = 210(0xd2, float:2.94E-43)
            if (r4 != r0) goto L40
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L3f
            boolean r6 = w6.n.a()
            r4 = 22
            goto L8d
        L3f:
            return r6
        L40:
            r0 = 211(0xd3, float:2.96E-43)
            if (r4 != r0) goto L4b
            boolean r6 = android.provider.Settings.canDrawOverlays(r5)
            r4 = 23
            goto L8d
        L4b:
            r0 = 212(0xd4, float:2.97E-43)
            if (r4 != r0) goto L61
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r4 < r0) goto L60
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            boolean r6 = w6.o.a(r4)
            r4 = 24
            goto L8d
        L60:
            return r6
        L61:
            r0 = 213(0xd5, float:2.98E-43)
            if (r4 != r0) goto L74
            java.lang.String r4 = "notification"
            java.lang.Object r4 = r5.getSystemService(r4)
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            boolean r6 = r4.isNotificationPolicyAccessGranted()
            r4 = 27
            goto L8d
        L74:
            r0 = 214(0xd6, float:3.0E-43)
            if (r4 != r0) goto Lab
            r4 = 34
            java.lang.String r6 = "alarm"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.app.AlarmManager r5 = (android.app.AlarmManager) r5
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r6 < r0) goto L2c
            boolean r5 = w6.p.a(r5)
            r6 = r5
        L8d:
            java.util.Map<java.lang.Integer, java.lang.Integer> r5 = r3.f22503e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.put(r4, r6)
            int r4 = r3.f22502d
            int r4 = r4 - r1
            r3.f22502d = r4
            w6.q$b r5 = r3.f22500b
            if (r5 == 0) goto Laa
            if (r4 != 0) goto Laa
            java.util.Map<java.lang.Integer, java.lang.Integer> r4 = r3.f22503e
            r5.a(r4)
        Laa:
            return r1
        Lab:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.q.onActivityResult(int, int, android.content.Intent):boolean");
    }
}
