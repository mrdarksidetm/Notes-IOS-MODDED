package a7;

import a7.d;
import ae.r;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.media.MediaCodecList;
import android.media.RingtoneManager;
import android.os.Environment;
import android.os.StatFs;
import d7.w;
import e7.b0;
import e7.e0;
import e7.g;
import e7.h0;
import e7.j;
import e7.j0;
import e7.l;
import e7.n;
import e7.q;
import e7.t;
import e7.y;
import e7.z;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f660a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f661b = new a(d.b.f651b.a().b(), null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static h7.a f662c = new h7.b();

    private e() {
    }

    public static final d a(Context context) {
        r.f(context, "context");
        return f660a.k(context);
    }

    private final b7.a b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        r.c(contentResolver);
        return new b7.a(contentResolver);
    }

    private final e7.b c(Context context) {
        return new e7.b(context);
    }

    private final e7.d d() {
        return new e7.e();
    }

    private final g e() {
        return new g(new MediaCodecList(1));
    }

    private final j f() {
        return new j();
    }

    private final c7.c g(Context context) {
        return new c7.c(n(context), b(context), p());
    }

    private final l h(Context context) {
        RingtoneManager ringtoneManager = new RingtoneManager(context);
        AssetManager assets = context.getAssets();
        r.e(assets, "context.assets");
        Configuration configuration = context.getResources().getConfiguration();
        r.e(configuration, "context.resources.configuration");
        return new l(ringtoneManager, assets, configuration);
    }

    private final n i(Context context) {
        Object systemService = context.getSystemService("device_policy");
        DevicePolicyManager devicePolicyManager = systemService instanceof DevicePolicyManager ? (DevicePolicyManager) systemService : null;
        Object systemService2 = context.getSystemService("keyguard");
        return new n(devicePolicyManager, systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null);
    }

    private final q j(Context context) {
        androidx.core.hardware.fingerprint.a aVarA = androidx.core.hardware.fingerprint.a.a(context);
        r.e(aVarA, "from(context)");
        return new q(aVarA);
    }

    private final d k(Context context) {
        return new d(null, l(context), g(context));
    }

    private final w l(Context context) {
        return new w(f(), q(context), t(context), o(context), c(context), d(), m(context), r(), e(), i(context), s(context), u(context), h(context), j(context));
    }

    private final t m(Context context) {
        Object systemService = context.getSystemService("activity");
        r.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        return new t((ActivityManager) systemService);
    }

    private final b7.b n(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        r.c(contentResolver);
        return new b7.b(contentResolver);
    }

    private final e7.w o(Context context) {
        Object systemService = context.getSystemService("input");
        r.d(systemService, "null cannot be cast to non-null type android.hardware.input.InputManager");
        return new e7.w((InputManager) systemService);
    }

    private final b7.d p() {
        return new b7.d();
    }

    private final y q(Context context) {
        Object systemService = context.getSystemService("activity");
        r.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        StatFs statFs2 = null;
        File externalFilesDir = context.getExternalFilesDir(null);
        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        if (absolutePath != null && externalFilesDir.canRead()) {
            statFs2 = new StatFs(absolutePath);
        }
        return new z(activityManager, statFs, statFs2);
    }

    private final b0 r() {
        return new b0();
    }

    private final e0 s(Context context) {
        PackageManager packageManager = context.getPackageManager();
        r.e(packageManager, "context.packageManager");
        return new e0(packageManager);
    }

    private final h0 t(Context context) {
        Object systemService = context.getSystemService("sensor");
        r.d(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return new h0((SensorManager) systemService);
    }

    private final j0 u(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        r.e(contentResolver, "context.contentResolver");
        return new j0(contentResolver);
    }
}
