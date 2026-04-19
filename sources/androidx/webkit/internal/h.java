package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import f5.r;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<h> f4950c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4952b;

    public static class a extends h {
        a(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.h
        public final boolean e() {
            return false;
        }
    }

    public static class b extends h {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.h
        public final boolean e() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    h(String str, String str2) {
        this.f4951a = str;
        this.f4952b = str2;
        f4950c.add(this);
    }

    private static Bundle a(Context context) {
        PackageInfo packageInfoF = r.f(context);
        if (packageInfoF == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(packageInfoF.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
        if (Build.VERSION.SDK_INT < 33) {
            try {
                return c(context, componentName, 640).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        try {
            return androidx.webkit.internal.b.a(context.getPackageManager(), componentName, androidx.webkit.internal.b.b(640L)).metaData;
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    private static ServiceInfo c(Context context, ComponentName componentName, int i10) {
        return context.getPackageManager().getServiceInfo(componentName, i10);
    }

    public static Set<h> g() {
        return Collections.unmodifiableSet(f4950c);
    }

    public String b() {
        return this.f4951a;
    }

    public boolean d(Context context) {
        return e() || f(context);
    }

    public abstract boolean e();

    public boolean f(Context context) {
        Bundle bundleA = a(context);
        if (bundleA == null) {
            return false;
        }
        return bundleA.containsKey(this.f4952b);
    }
}
