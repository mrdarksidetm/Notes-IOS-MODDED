package k3;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f14382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f14383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f14384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f14385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f14386e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f14382a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f14383b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f14384c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f14385d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f14386e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
