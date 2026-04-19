package okhttp3.internal.http;

import ae.r;
import hf.e;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f17279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f17280d;

    public RealResponseBody(String str, long j10, e eVar) {
        r.f(eVar, "source");
        this.f17278b = str;
        this.f17279c = j10;
        this.f17280d = eVar;
    }

    @Override // okhttp3.ResponseBody
    public long a() {
        return this.f17279c;
    }

    @Override // okhttp3.ResponseBody
    public MediaType b() {
        String str = this.f17278b;
        if (str == null) {
            return null;
        }
        return MediaType.f16856e.b(str);
    }

    @Override // okhttp3.ResponseBody
    public e l() {
        return this.f17280d;
    }
}
