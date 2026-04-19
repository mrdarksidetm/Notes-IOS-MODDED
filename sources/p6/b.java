package p6;

import ae.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String a(PackageInfo packageInfo) {
        r.f(packageInfo, "<this>");
        return Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
    }

    private static final q6.b b(PackageInfo packageInfo, Context context) {
        String str;
        String str2 = packageInfo.packageName;
        r.e(str2, "packageName");
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo != null) {
            CharSequence applicationLabel = context.getPackageManager().getApplicationLabel(applicationInfo);
            r.d(applicationLabel, "null cannot be cast to non-null type kotlin.String");
            str = (String) applicationLabel;
        } else {
            str = null;
        }
        String str3 = str;
        String strA = a(packageInfo);
        f fVar = f.f18255a;
        String str4 = packageInfo.packageName;
        r.e(str4, "packageName");
        return new q6.b(str2, null, str3, strA, fVar.b(context, str4), 2, null);
    }

    public static final q6.c c(t6.b bVar, Context context) {
        r.f(bVar, "<this>");
        r.f(context, "context");
        return new q6.c(b(bVar.a(), context), bVar.b());
    }
}
