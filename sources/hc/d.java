package hc;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import hd.g;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f11882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f11883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private hc.b f11884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FlutterJNI f11885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ExecutorService f11886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Future<b> f11887g;

    class a implements Callable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11888a;

        a(Context context) {
            this.f11888a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            d.this.f11885e.prefetchDefaultFontManager();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b call() {
            gd.e eVarY = gd.e.y("FlutterLoader initTask");
            try {
                d.a(d.this, this.f11888a);
                try {
                    d.this.f11885e.loadLibrary();
                    d.this.f11885e.updateRefreshRate();
                    d.this.f11886f.execute(new Runnable() { // from class: hc.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f11880a.c();
                        }
                    });
                    b bVar = new b(gd.b.d(this.f11888a), gd.b.a(this.f11888a), gd.b.c(this.f11888a), null);
                    if (eVarY != null) {
                        eVarY.close();
                    }
                    return bVar;
                } catch (UnsatisfiedLinkError e10) {
                    if (!e10.toString().contains("couldn't find \"libflutter.so\"") && !e10.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                        throw e10;
                    }
                    String property = System.getProperty("os.arch");
                    File file = new File(d.this.f11884d.f11878f);
                    throw new UnsupportedOperationException("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: " + property + ", and the native libraries directory (with path " + file.getAbsolutePath() + ") contains the following files: " + Arrays.toString(file.list()), e10);
                }
            } catch (Throwable th) {
                if (eVarY != null) {
                    try {
                        eVarY.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f11890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f11891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f11892c;

        private b(String str, String str2, String str3) {
            this.f11890a = str;
            this.f11891b = str2;
            this.f11892c = str3;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f11893a;

        public String a() {
            return this.f11893a;
        }
    }

    public d() {
        this(cc.a.e().d().a());
    }

    public d(FlutterJNI flutterJNI) {
        this(flutterJNI, cc.a.e().b());
    }

    public d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f11881a = false;
        this.f11885e = flutterJNI;
        this.f11886f = executorService;
    }

    static /* synthetic */ e a(d dVar, Context context) {
        dVar.j(context);
        return null;
    }

    private String h(String str) {
        return this.f11884d.f11876d + File.separator + str;
    }

    private e j(Context context) {
        return null;
    }

    private static boolean l(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean e() {
        return this.f11884d.f11879g;
    }

    public void f(Context context, String[] strArr) {
        if (this.f11881a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f11882b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            gd.e eVarY = gd.e.y("FlutterLoader#ensureInitializationComplete");
            try {
                b bVar = this.f11887g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--icu-native-lib-path=");
                sb2.append(this.f11884d.f11878f);
                String str = File.separator;
                sb2.append(str);
                sb2.append("libflutter.so");
                arrayList.add(sb2.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=" + this.f11884d.f11873a);
                arrayList.add("--aot-shared-library-name=" + this.f11884d.f11878f + str + this.f11884d.f11873a);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(bVar.f11891b);
                arrayList.add(sb3.toString());
                if (this.f11884d.f11877e != null) {
                    arrayList.add("--domain-network-policy=" + this.f11884d.f11877e);
                }
                if (this.f11882b.a() != null) {
                    arrayList.add("--log-tag=" + this.f11882b.a());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i10 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i10 == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i10 = (int) ((r6.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i10);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 12 * 4));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                        arrayList.add("--enable-impeller");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                }
                arrayList.add("--leak-vm=" + (l(bundle) ? com.amazon.a.a.o.b.f7427af : com.amazon.a.a.o.b.ag));
                this.f11885e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f11890a, bVar.f11891b, SystemClock.uptimeMillis() - this.f11883c);
                this.f11881a = true;
                if (eVarY != null) {
                    eVarY.close();
                }
            } finally {
            }
        } catch (Exception e10) {
            cc.b.c("FlutterLoader", "Flutter initialization failed.", e10);
            throw new RuntimeException(e10);
        }
    }

    public String g() {
        return this.f11884d.f11876d;
    }

    public String i(String str) {
        return h(str);
    }

    public boolean k() {
        return this.f11881a;
    }

    public void m(Context context) {
        n(context, new c());
    }

    public void n(Context context, c cVar) {
        if (this.f11882b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        gd.e eVarY = gd.e.y("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f11882b = cVar;
            this.f11883c = SystemClock.uptimeMillis();
            this.f11884d = hc.a.e(applicationContext);
            g.f((DisplayManager) applicationContext.getSystemService("display"), this.f11885e).g();
            this.f11887g = this.f11886f.submit(new a(applicationContext));
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
