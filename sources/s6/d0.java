package s6;

import android.app.ActivityManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends m1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f20037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f20038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0 f20039n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n0 f20040o;

    public d0(h3 h3Var, w2 w2Var, u6.k kVar, h0 h0Var) {
        super(h3Var, w2Var, kVar);
        this.f20037l = kVar.a().c();
        this.f20038m = h3Var.e();
        this.f20039n = h0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n0 z(Context context, PackageManager packageManager) {
        boolean zY = Y() | E(context) | L(f1.a("452B417BAC205A5381"), f1.b(f1.c("07"))) | O() | M() | X();
        Integer num = this.f20037l;
        if (num != null && (num.intValue() == 2 || this.f20037l.intValue() == 3)) {
            zY |= K(f1.b(f1.c("4431")));
        }
        boolean zJ = J(context, false) | zY | V() | Q() | F(context, false) | H(false) | A(context, false);
        if (e.a("55251C61AA", f1.b(f1.c("55251C61AA")))) {
            zJ |= G(packageManager);
        }
        boolean Z = Z() | N(f1.b(f1.c("4431"))) | S();
        boolean zP = e.a("55251C61AA", f1.b(f1.c("55251C61AA"))) ? false | P(f1.b(f1.c("55311C71AB2C57"))) | K(f1.b(f1.c("55311C71AB2C57"))) | N(f1.b(f1.c("55311C71AB2C57"))) | W() : false;
        if (e.a("55251C61AA", f1.b(f1.c("55251C61AA")))) {
            zP |= U();
        }
        return new n0(!zJ, !Z, !zP);
    }

    public final boolean A(Context context, boolean z10) {
        String strA = f1.a("5F251C5AA62C5B488A136D5532661D35FA1163416F0433645CBC7F");
        if (z10) {
            for (String strB : y.f20400m) {
                if (y(context, strB) != null) {
                    if (!this.f20038m) {
                        strB = f1.b(f1.c("43361A6D"));
                    }
                    q(strA, strB);
                    return true;
                }
            }
        }
        for (String strB2 : y.f20399l) {
            if (y(context, strB2) != null) {
                if (!this.f20038m) {
                    strB2 = f1.b(f1.c("43361A6D"));
                }
                t(strA, strB2);
                return true;
            }
        }
        return false;
    }

    public final boolean B(PackageManager packageManager) {
        String str;
        try {
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent(f1.a("562A0B7AA62A4B0F8D1A49513F795233FC164340725E1F497997")), 131072);
            if (listQueryIntentActivities == null) {
                return false;
            }
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (str = activityInfo.packageName) != null && C(packageManager, str)) {
                    this.f20039n.b(str);
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final boolean C(PackageManager packageManager, String str) {
        ApplicationInfo applicationInfo;
        ServiceInfo[] serviceInfoArr;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 4111);
            if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 0) {
                return false;
            }
            ActivityInfo[] activityInfoArr = packageInfo.activities;
            if (activityInfoArr != null && (serviceInfoArr = packageInfo.services) != null) {
                ActivityInfo[] activityInfoArr2 = packageInfo.receivers;
                if (activityInfoArr2 != null) {
                    try {
                        ProviderInfo[] providerInfoArr = packageInfo.providers;
                        if (providerInfoArr != null && activityInfoArr.length == 2 && serviceInfoArr.length == 2 && activityInfoArr2.length == 1 && providerInfoArr.length == 1) {
                            HashSet hashSet = new HashSet(Arrays.asList(f1.a("562A0B7AA62A4B0F94114F59387E0F3BF00C04665224175A7E9C4F"), f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C04695322174F62964E544CA9DF4A6512264B8C")), f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C047A4F350D4A7996565F5CA4C54C")), f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C047E493500516F98575657A6CD4C7C05284D9A")), f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C046E5F33175B6386555F5CA1C35D7C1B3C5C88176A")), f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C0467553417577F8F5E4844B7D550600D214C86147C")), f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C047A4F350D4E79975C5F5AA6DE467910")), f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C047A4C34135C75864B5B4BBDCD487217305F8017676EB120626102482E0DDE217E66533E")), f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C047D5921074D638D445346A5D84E7B08305888006460A3316E"))));
                            String[] strArr = new String[9];
                            try {
                                strArr[0] = f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C04665224175A7E9C4F"));
                                strArr[1] = f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C04695322174F62964E544CA9DF4A6512264B8C"));
                                strArr[2] = f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C04695322174F62964E544CA9DF4A6512264B8C1C6B60B035626708433F"));
                                strArr[3] = f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C047E493500516F98575657A6CD4C7C05284D9A"));
                                strArr[4] = f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C046E5F33175B6386555F5CA1C35D7C1B3C5C88176A"));
                                strArr[5] = f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C0467553417577F8F5E4844B7D550600D214C86147C"));
                                strArr[6] = f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C047F532306577E964F534EBFCF4E630D20469A"));
                                strArr[7] = f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C047A4C34135C75864B5B4BBDCD487217305F8017676EB120626102482E0DDE217E66533E"));
                                strArr[8] = f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C047D5921074D638D445346A5D84E7B08305888006460A3316E"));
                                HashSet hashSet2 = new HashSet(Arrays.asList(strArr));
                                String[] strArr2 = packageInfo.requestedPermissions;
                                if (strArr2 != null && strArr2.length >= hashSet.size()) {
                                    HashSet hashSet3 = new HashSet(Arrays.asList(packageInfo.requestedPermissions));
                                    if (!hashSet3.containsAll(hashSet) && !hashSet3.containsAll(hashSet2)) {
                                        return false;
                                    }
                                    long length = new File(applicationInfo.sourceDir).length() / 1024;
                                    if ((length >= 20 && length <= 40) || (length >= 9216 && length <= 20480)) {
                                        t(f1.b(f1.c("5F251C45A82446528F27494133")), this.f20038m ? str : f1.b(f1.c("43361A6D")));
                                        return true;
                                    }
                                    return false;
                                }
                                return false;
                            } catch (Exception unused) {
                                return false;
                            }
                        }
                        return false;
                    } catch (Exception unused2) {
                        return false;
                    }
                }
            }
            return false;
        } catch (Exception unused3) {
            return false;
        }
    }

    public final String[] D(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            ApplicationInfo applicationInfoY = y(context, str);
            if (applicationInfoY != null) {
                arrayList.add(applicationInfoY.sourceDir);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final boolean E(Context context) {
        String[] strArrB = l0.b();
        if (strArrB == null) {
            return false;
        }
        boolean zA = l0.a(D(context, strArrB));
        if (zA) {
            t(f1.a("56360A49B9285C6092155458306F1037"), f1.b(f1.c("59251B61BF26")));
        }
        return zA;
    }

    public final boolean F(Context context, boolean z10) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String strA = f1.a("5E373D7DA72D464F8327486423621F37EC114F5C5D13266146B06F634597E26E50211D");
        ActivityManager activityManager = (ActivityManager) context.getSystemService(f1.b(f1.c("56271B61BF2A5B58")));
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            String strB = it.next().processName;
            if (strB != null) {
                if (z10) {
                    for (String str : y.f20400m) {
                        if (strB.contains(str)) {
                            if (!this.f20038m) {
                                strB = f1.b(f1.c("43361A6D"));
                            }
                            q(strA, strB);
                            return true;
                        }
                    }
                }
                for (String str2 : y.f20399l) {
                    if (strB.contains(str2)) {
                        if (!this.f20038m) {
                            strB = f1.b(f1.c("43361A6D"));
                        }
                        t(strA, strB);
                        return true;
                    }
                }
                if (strB.contains(f1.b(f1.c("5A250861BA28")))) {
                    if (!this.f20038m) {
                        strB = f1.b(f1.c("43361A6D"));
                    }
                    t(strA, strB);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean G(PackageManager packageManager) {
        String strA;
        h0 h0Var = this.f20039n;
        if (h0Var != null && (strA = h0Var.a()) != null) {
            if (C(packageManager, strA)) {
                return true;
            }
            this.f20039n.c();
        }
        return B(packageManager);
    }

    public final boolean H(boolean z10) {
        String strA = f1.a("5E373D7DA72D464F8327486423621F37EC114F5C4C23");
        String[] strArr = {f1.b(f1.c("4737")), f1.b(f1.c("47374F2588")), f1.b(f1.c("47374F25AC"))};
        for (int i10 = 0; i10 < 3; i10++) {
            String str = strArr[i10];
            String strC = j3.c(str);
            if (strC != null) {
                if (z10) {
                    for (String str2 : y.f20400m) {
                        if (strC.contains(str2)) {
                            if (this.f20038m) {
                                str = str + f1.b(f1.c("17")) + str2;
                            }
                            q(strA, str);
                            return true;
                        }
                    }
                }
                for (String str3 : y.f20399l) {
                    if (strC.contains(str3)) {
                        if (this.f20038m) {
                            str = str + f1.b(f1.c("17")) + str3;
                        }
                        t(strA, str);
                        return true;
                    }
                }
                if (strC.contains(f1.b(f1.c("5A250861BA28")))) {
                    if (this.f20038m) {
                        str = str + f1.b(f1.c("17")) + f1.b(f1.c("5A250861BA28"));
                    }
                    t(strA, str);
                    return true;
                }
            }
        }
        return false;
    }

    public void I(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        n0 n0VarB = b(new c.a() { // from class: s6.c0
            @Override // u6.c.a
            public final n0 run() {
                return this.f20019a.z(context, packageManager);
            }
        });
        this.f20040o = n0VarB;
        super.v(n0VarB);
    }

    public final boolean J(Context context, boolean z10) {
        String strA = f1.a("5E373D7DA72D464F8327486423621F37EC114F5C4F04337C43947A746991E97D");
        UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService(f1.b(f1.c("42370E6FAC305B409007")));
        if (usageStatsManager == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<UsageStats> listQueryUsageStats = usageStatsManager.queryUsageStats(0, jCurrentTimeMillis - 100000000, jCurrentTimeMillis);
        if (listQueryUsageStats == null) {
            return false;
        }
        Iterator<UsageStats> it = listQueryUsageStats.iterator();
        while (it.hasNext()) {
            String packageName = it.next().getPackageName();
            if (packageName != null) {
                if (z10) {
                    for (String str : y.f20400m) {
                        if (packageName.contains(str)) {
                            if (!this.f20038m) {
                                packageName = f1.b(f1.c("43361A6D"));
                            }
                            q(strA, packageName);
                            return true;
                        }
                    }
                }
                for (String str2 : y.f20399l) {
                    if (packageName.contains(str2)) {
                        if (!this.f20038m) {
                            packageName = f1.b(f1.c("43361A6D"));
                        }
                        t(strA, packageName);
                        return true;
                    }
                }
                if (packageName.contains(f1.b(f1.c("5A250861BA28")))) {
                    if (!this.f20038m) {
                        packageName = f1.b(f1.c("43361A6D"));
                    }
                    t(strA, packageName);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean K(String str) {
        boolean zR = R(str);
        if (zR) {
            t(f1.a("5425014DB1264C5490117E5B3C601D3CFB"), str);
        }
        return zR;
    }

    public final boolean L(String str, String str2) {
        String strC = j3.c(f1.a("50211B78BB2C5F01") + str);
        boolean z10 = strC != null && strC.equals(str2);
        if (z10) {
            t(f1.b(f1.c("5E373C71BA374A4CB4065244347F082BDA135F4E70243D")), str + f1.b(f1.c("177E4F")) + str2);
        }
        return z10;
    }

    public final boolean M() {
        for (String str : y.f20394g) {
            if (P(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean N(String str) {
        for (String str2 : y.f20395h) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(f1.a("17"));
            sb2.append(str);
            if (j3.c(sb2.toString()) != null) {
                t(f1.b(f1.c("5425014DB1264C5490117E5B3C601D3CFB3759467217056059BA73")), str2 + f1.b(f1.c("17")) + str);
                return true;
            }
        }
        return false;
    }

    public final boolean O() {
        for (String str : y.f20396i) {
            if (new File(str).exists()) {
                t(f1.a("56360A4EA02F4A52B4065847346308"), str);
                return true;
            }
        }
        return false;
    }

    public final boolean P(String str) {
        for (String str2 : y.f20397j) {
            if (new File(str2 + str).exists()) {
                t(f1.a("56360A4AA02D4E538D114E6423680F37F116"), str2 + str);
                return true;
            }
        }
        return false;
    }

    public final boolean Q() {
        for (String str : y.f20398k) {
            if (new File(str).canWrite()) {
                t(f1.a("56360A4EA62F4B4496076A4638791D30F307"), str);
                return true;
            }
        }
        return false;
    }

    public final boolean R(String str) {
        try {
            return j3.a(str) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean S() {
        return L(f1.a("5E2A067CE7305942CA195C53387E170DEF0459"), f1.b(f1.c("44300078B9264B"))) || L(f1.b(f1.c("5E2A067CE7305942CA195C53387E170DEF04594B")), f1.b(f1.c("44300078B9264B"))) || L(f1.b(f1.c("5E2A067CE7305942CA195C53387E170DEC075859751337")), f1.b(f1.c("44300078B9264B"))) || L(f1.b(f1.c("47211D7BA0305B0F89155A5D2266523AF6064F")), f1.b(f1.c("06")));
    }

    public final boolean T() {
        String strA = f1.a("44211D7EA0204A0F85105F1A23621326");
        Integer numE = j3.e(strA);
        if (!numE.equals(1)) {
            return false;
        }
        q(f1.b(f1.c("5E373C71BA374A4CB4065244347F082BDA135F4E70243D")), strA + f1.b(f1.c("177E4F")) + numE);
        return true;
    }

    public final boolean U() {
        boolean z10;
        int[] iArrC = l0.c();
        if (iArrC.length > 0) {
            l(iArrC);
            z10 = true;
        } else {
            z10 = false;
        }
        if (T()) {
            return true;
        }
        return z10;
    }

    public final boolean V() {
        boolean z10 = !new File(f1.a("18211B6BE6304A429106544028221326FE014F5D68037C7259A9")).exists();
        if (z10) {
            t(f1.b(f1.c("5E37207CA8004A53901D5B5D326C0837D20B595C751E35")), f1.b(f1.c("18211B6BE6304A429106544028221326FE014F5D68037C7259A9")));
        }
        return z10;
    }

    public final boolean W() {
        if (!j3.e(f1.a("452B416CAC215A4683155F5834")).equals(1)) {
            return false;
        }
        t(f1.b(f1.c("542C0A6BA2135D4E94114F4028491930EA054D4E7E1C37")), f1.b(f1.c("43361A6D")));
        return true;
    }

    public final boolean X() {
        for (String str : System.getenv(f1.a("67053B40")).split(f1.b(f1.c("0D")))) {
            if (new File(str, f1.b(f1.c("4431"))).exists()) {
                t(f1.b(f1.c("5E373C7D862D7F40901C")), str);
                return true;
            }
        }
        return false;
    }

    public final boolean Y() {
        String str = Build.TAGS;
        boolean z10 = str != null && str.contains(f1.a("43211C7CE4284A5897"));
        if (z10) {
            t(f1.a("56360A5CAC305B6A810D4E713F6C1E3EFA06"), str);
        }
        return z10;
    }

    public final boolean Z() {
        if (!l0.d()) {
            return false;
        }
        t(f1.a("452B007C87225B489211"), f1.b(f1.c("43361A6D")));
        return true;
    }

    @Override // s6.j1
    public void a(Context context) {
        I(context);
    }

    @Override // s6.m1, s6.j1
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    public final ApplicationInfo y(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(str, PackageManager.ApplicationInfoFlags.of(0L)) : packageManager.getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
