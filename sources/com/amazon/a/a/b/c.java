package com.amazon.a.a.b;

import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.amazon.a.a.o.e;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class c implements Serializable {
    private static final String A = "deviceDisplay";
    private static final String B = "deviceBrand";
    private static final String C = "deviceBoard";
    private static final String D = "androidVersion";
    private static final String E = "deviceModel";
    private static final String F = "packageFilePath";
    private static final String G = "packageName";
    private static final String H = "packageVersionName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7098a = new com.amazon.a.a.o.c("CrashReport");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f7099b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7100c = "([a-zA-Z0-9_.]+(Exception|Error))|(at\\s.*\\(.*\\))";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f7101d = "SHA1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7102e = "crashTime";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f7103f = "UTF-8";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f7104g = "crashId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f7105h = "threadDump";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f7106i = "stackTrace";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f7107j = "threadAllocSize";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f7108k = "threadAllocCount";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f7109l = "nativeHeapFreeSize";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f7110m = "nativeHeapSize";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f7111n = "memLowThreshold";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f7112o = "memLowFlag";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f7113p = "availableInternalMemorySize";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f7114q = "totalInternalMemorySize";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f7115r = "deviceUser";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f7116s = "deviceType";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f7117t = "deviceTime";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f7118u = "deviceTags";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f7119v = "deviceProduct";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f7120w = "deviceManufacturer";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f7121x = "deviceId";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f7122y = "deviceHost";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f7123z = "deviceFingerPrint";
    private final HashMap<String, String> I = new LinkedHashMap();

    public c(Application application, Throwable th) {
        try {
            a(application, th);
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.f7484b) {
                f7098a.b("Error collection crash report details", th2);
            }
        }
    }

    private void a(Application application) {
        PackageInfo packageInfoB = b(application);
        if (packageInfoB == null) {
            return;
        }
        this.I.put(H, packageInfoB.versionName);
        this.I.put(G, packageInfoB.packageName);
        this.I.put(F, application.getFilesDir().getAbsolutePath());
    }

    private void a(Application application, Throwable th) {
        b();
        a(application);
        c(application);
        a(th);
        e();
        f();
    }

    private void a(Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        sb2.append(stringWriter.toString());
        sb2.append("\n");
        Throwable cause = th.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            sb2.append(stringWriter.toString());
            cause = cause.getCause();
            sb2.append("\n\n");
        }
        printWriter.close();
        this.I.put(f7106i, sb2.toString());
    }

    private PackageInfo b(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (!com.amazon.a.a.o.c.f7484b) {
                return null;
            }
            f7098a.b("Unable to fetch package info", e10);
            return null;
        }
    }

    private void b() {
        this.I.put(f7102e, new Date().toString());
    }

    private long c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    private void c(Application application) {
        this.I.put(E, Build.MODEL);
        this.I.put(D, Build.VERSION.RELEASE);
        this.I.put(C, Build.BOARD);
        this.I.put(B, Build.BRAND);
        this.I.put(A, Build.DISPLAY);
        this.I.put(f7123z, Build.FINGERPRINT);
        this.I.put(f7122y, Build.HOST);
        this.I.put(f7121x, Build.ID);
        this.I.put(f7120w, Build.MANUFACTURER);
        this.I.put(f7119v, Build.PRODUCT);
        this.I.put(f7118u, Build.TAGS);
        this.I.put(f7117t, Long.toString(Build.TIME));
        this.I.put(f7116s, Build.TYPE);
        this.I.put(f7115r, Build.USER);
        this.I.put(f7114q, Long.toString(d()));
        this.I.put(f7113p, Long.toString(c()));
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            this.I.put(f7112o, Boolean.toString(memoryInfo.lowMemory));
            this.I.put(f7111n, Long.toString(memoryInfo.threshold));
        }
        this.I.put(f7110m, Long.toString(Debug.getNativeHeapSize()));
        this.I.put(f7109l, Long.toString(Debug.getNativeHeapAllocatedSize()));
        this.I.put(f7108k, Long.toString(Debug.getThreadAllocCount()));
        this.I.put(f7107j, Long.toString(Debug.getThreadAllocSize()));
    }

    private long d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    private void e() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            sb2.append("Thread : " + key.getId());
            if (!e.a(key.getName())) {
                sb2.append("/" + key.getName());
            }
            sb2.append("\n");
            sb2.append("isAlive : " + key.isAlive() + "\n");
            sb2.append("isInterrupted : " + key.isInterrupted() + "\n");
            sb2.append("isDaemon : " + key.isDaemon() + "\n");
            for (StackTraceElement stackTraceElement : value) {
                sb2.append("\tat " + stackTraceElement + "\n");
            }
            sb2.append("\n\n");
        }
        this.I.put(f7105h, sb2.toString());
    }

    private void f() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.I.get(G));
            sb2.append(this.I.get(H));
            sb2.append(this.I.get(D));
            String str = this.I.get(f7106i);
            if (str != null) {
                Matcher matcher = Pattern.compile(f7100c).matcher(str);
                while (matcher.find()) {
                    sb2.append(matcher.group());
                }
            }
            this.I.put(f7104g, new BigInteger(MessageDigest.getInstance(f7101d).digest(sb2.toString().getBytes(f7103f))).abs().toString(16));
        } catch (Exception e10) {
            if (com.amazon.a.a.o.c.f7484b) {
                f7098a.b("Error capturing crash id", e10);
            }
        }
    }

    public Map<String, String> a() {
        return this.I;
    }
}
