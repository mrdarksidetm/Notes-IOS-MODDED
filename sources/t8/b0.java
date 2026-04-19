package t8;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final z f21311a = new t(x.b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final z f21312b = new u(x.b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final z f21313c = new v(x.b("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final z f21314d = new w(x.b("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f21315e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f21316f;

    static synchronized void a(Context context) {
        if (f21316f != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f21316f = context.getApplicationContext();
        }
    }
}
