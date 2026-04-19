package okhttp3.internal.platform.android;

import ae.r;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import je.w;
import je.y;
import nd.r0;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
@SuppressSignatureCheck
public final class AndroidLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AndroidLog f17574a = new AndroidLog();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CopyOnWriteArraySet<Logger> f17575b = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f17576c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r12 = OkHttpClient.class.getPackage();
        String name = r12 == null ? null : r12.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = OkHttpClient.class.getName();
        r.e(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        r.e(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        r.e(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f17576c = r0.t(linkedHashMap);
    }

    private AndroidLog() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f17575b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(AndroidLogHandler.f17577a);
        }
    }

    private final String d(String str) {
        String str2 = f17576c.get(str);
        return str2 == null ? y.c1(str, 23) : str2;
    }

    public final void a(String str, int i10, String str2, Throwable th) {
        int iMin;
        r.f(str, "loggerName");
        r.f(str2, "message");
        String strD = d(str);
        if (Log.isLoggable(strD, i10)) {
            if (th != null) {
                str2 = str2 + '\n' + ((Object) Log.getStackTraceString(th));
            }
            int i11 = 0;
            int length = str2.length();
            while (i11 < length) {
                int iX = w.X(str2, '\n', i11, false, 4, null);
                if (iX == -1) {
                    iX = length;
                }
                while (true) {
                    iMin = Math.min(iX, i11 + 4000);
                    String strSubstring = str2.substring(i11, iMin);
                    r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strD, strSubstring);
                    if (iMin >= iX) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : f17576c.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }
}
