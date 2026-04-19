package ac;

import ae.r;
import android.app.ActivityManager;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import nd.u;
import nd.v;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PackageManager f686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ActivityManager f687b;

    public c(PackageManager packageManager, ActivityManager activityManager) {
        r.f(packageManager, "packageManager");
        r.f(activityManager, "activityManager");
        this.f686a = packageManager;
        this.f687b = activityManager;
    }

    private final List<String> a() {
        FeatureInfo[] systemAvailableFeatures = this.f686a.getSystemAvailableFeatures();
        r.e(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (!(featureInfo.name == null)) {
                arrayList.add(featureInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureInfo) it.next()).name);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean b() {
        /*
            r6 = this;
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            ae.r.e(r0, r1)
            java.lang.String r1 = "generic"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = je.m.G(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L1f
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r5 = "DEVICE"
            ae.r.e(r0, r5)
            boolean r0 = je.m.G(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
        L1f:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r5 = "FINGERPRINT"
            ae.r.e(r0, r5)
            boolean r1 = je.m.G(r0, r1, r2, r3, r4)
            if (r1 != 0) goto Lb5
            ae.r.e(r0, r5)
            java.lang.String r1 = "unknown"
            boolean r0 = je.m.G(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "HARDWARE"
            ae.r.e(r0, r1)
            java.lang.String r5 = "goldfish"
            boolean r5 = je.m.L(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            ae.r.e(r0, r1)
            java.lang.String r1 = "ranchu"
            boolean r0 = je.m.L(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            ae.r.e(r0, r1)
            java.lang.String r5 = "google_sdk"
            boolean r5 = je.m.L(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            ae.r.e(r0, r1)
            java.lang.String r5 = "Emulator"
            boolean r5 = je.m.L(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            ae.r.e(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = je.m.L(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            ae.r.e(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = je.m.L(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r1 = "PRODUCT"
            ae.r.e(r0, r1)
            java.lang.String r5 = "sdk"
            boolean r5 = je.m.L(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            ae.r.e(r0, r1)
            java.lang.String r5 = "vbox86p"
            boolean r5 = je.m.L(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            ae.r.e(r0, r1)
            java.lang.String r5 = "emulator"
            boolean r5 = je.m.L(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            ae.r.e(r0, r1)
            java.lang.String r1 = "simulator"
            boolean r0 = je.m.L(r0, r1, r2, r3, r4)
            if (r0 == 0) goto Lb6
        Lb5:
            r2 = 1
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.c.b():boolean");
    }

    @Override // sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        String serial;
        r.f(iVar, "call");
        r.f(dVar, "result");
        if (!iVar.f20503a.equals("getDeviceInfo")) {
            dVar.notImplemented();
            return;
        }
        HashMap map = new HashMap();
        String str = Build.BOARD;
        r.e(str, "BOARD");
        map.put("board", str);
        String str2 = Build.BOOTLOADER;
        r.e(str2, "BOOTLOADER");
        map.put("bootloader", str2);
        String str3 = Build.BRAND;
        r.e(str3, "BRAND");
        map.put("brand", str3);
        String str4 = Build.DEVICE;
        r.e(str4, "DEVICE");
        map.put("device", str4);
        String str5 = Build.DISPLAY;
        r.e(str5, "DISPLAY");
        map.put("display", str5);
        String str6 = Build.FINGERPRINT;
        r.e(str6, "FINGERPRINT");
        map.put("fingerprint", str6);
        String str7 = Build.HARDWARE;
        r.e(str7, "HARDWARE");
        map.put("hardware", str7);
        String str8 = Build.HOST;
        r.e(str8, "HOST");
        map.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, str8);
        String str9 = Build.ID;
        r.e(str9, "ID");
        map.put("id", str9);
        String str10 = Build.MANUFACTURER;
        r.e(str10, "MANUFACTURER");
        map.put("manufacturer", str10);
        String str11 = Build.MODEL;
        r.e(str11, "MODEL");
        map.put("model", str11);
        String str12 = Build.PRODUCT;
        r.e(str12, "PRODUCT");
        map.put("product", str12);
        int i10 = Build.VERSION.SDK_INT;
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        r.e(strArr, "SUPPORTED_32_BIT_ABIS");
        map.put("supported32BitAbis", u.p(Arrays.copyOf(strArr, strArr.length)));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        r.e(strArr2, "SUPPORTED_64_BIT_ABIS");
        map.put("supported64BitAbis", u.p(Arrays.copyOf(strArr2, strArr2.length)));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        r.e(strArr3, "SUPPORTED_ABIS");
        map.put("supportedAbis", u.p(Arrays.copyOf(strArr3, strArr3.length)));
        String str13 = Build.TAGS;
        r.e(str13, "TAGS");
        map.put("tags", str13);
        String str14 = Build.TYPE;
        r.e(str14, "TYPE");
        map.put("type", str14);
        map.put("isPhysicalDevice", Boolean.valueOf(!b()));
        map.put("systemFeatures", a());
        HashMap map2 = new HashMap();
        String str15 = Build.VERSION.BASE_OS;
        r.e(str15, "BASE_OS");
        map2.put("baseOS", str15);
        map2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        String str16 = Build.VERSION.SECURITY_PATCH;
        r.e(str16, "SECURITY_PATCH");
        map2.put("securityPatch", str16);
        String str17 = Build.VERSION.CODENAME;
        r.e(str17, "CODENAME");
        map2.put("codename", str17);
        String str18 = Build.VERSION.INCREMENTAL;
        r.e(str18, "INCREMENTAL");
        map2.put("incremental", str18);
        String str19 = Build.VERSION.RELEASE;
        r.e(str19, "RELEASE");
        map2.put("release", str19);
        map2.put("sdkInt", Integer.valueOf(i10));
        map.put(DiagnosticsEntry.VERSION_KEY, map2);
        map.put("isLowRamDevice", Boolean.valueOf(this.f687b.isLowRamDevice()));
        if (i10 >= 26) {
            try {
                serial = Build.getSerial();
            } catch (SecurityException unused) {
                serial = "unknown";
            }
            r.c(serial);
        } else {
            serial = Build.SERIAL;
            r.e(serial, "SERIAL");
        }
        map.put("serialNumber", serial);
        dVar.success(map);
    }
}
