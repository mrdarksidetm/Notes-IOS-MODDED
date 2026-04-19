package okhttp3.internal.http1;

import ae.j;
import ae.r;
import hf.e;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes2.dex */
public final class HeadersReader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f17288c = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f17289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f17290b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public HeadersReader(e eVar) {
        r.f(eVar, "source");
        this.f17289a = eVar;
        this.f17290b = 262144L;
    }

    public final Headers a() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return builder.e();
            }
            builder.b(strB);
        }
    }

    public final String b() {
        String strU = this.f17289a.u(this.f17290b);
        this.f17290b -= (long) strU.length();
        return strU;
    }
}
