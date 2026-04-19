package androidx.webkit;

import android.content.Context;
import androidx.webkit.internal.m;
import c0.u0;
import g5.q;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public class ProcessGlobalConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f4933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f4934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f4935c;
    private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f4931d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f4932e = false;

    public static void a(ProcessGlobalConfig processGlobalConfig) {
        synchronized (f4931d) {
            if (f4932e) {
                throw new IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
            }
            f4932e = true;
        }
        HashMap map = new HashMap();
        if (d()) {
            throw new IllegalStateException("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
        }
        if (processGlobalConfig.f4933a != null) {
            if (m.M.e()) {
                q.e(processGlobalConfig.f4933a);
            } else {
                map.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_SUFFIX, processGlobalConfig.f4933a);
            }
        }
        String str = processGlobalConfig.f4934b;
        if (str != null) {
            map.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_BASE_PATH, str);
        }
        String str2 = processGlobalConfig.f4935c;
        if (str2 != null) {
            map.put(ProcessGlobalConfigConstants.CACHE_DIRECTORY_BASE_PATH, str2);
        }
        if (!u0.a(sProcessGlobalConfig, null, map)) {
            throw new RuntimeException("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
        }
    }

    private static boolean d() {
        try {
            Field declaredField = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
            declaredField.setAccessible(true);
            return declaredField.get(null) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public ProcessGlobalConfig b(Context context, String str) {
        if (!m.M.d(context)) {
            throw m.a();
        }
        if (str.equals("")) {
            throw new IllegalArgumentException("Suffix cannot be an empty string");
        }
        if (str.indexOf(File.separatorChar) < 0) {
            this.f4933a = str;
            return this;
        }
        throw new IllegalArgumentException("Suffix " + str + " contains a path separator");
    }

    public ProcessGlobalConfig c(Context context, File file, File file2) {
        if (!m.N.d(context)) {
            throw m.a();
        }
        if (!file.isAbsolute()) {
            throw new IllegalArgumentException("dataDirectoryBasePath must be a non-empty absolute path");
        }
        if (!file2.isAbsolute()) {
            throw new IllegalArgumentException("cacheDirectoryBasePath must be a non-empty absolute path");
        }
        this.f4934b = file.getAbsolutePath();
        this.f4935c = file2.getAbsolutePath();
        return this;
    }
}
