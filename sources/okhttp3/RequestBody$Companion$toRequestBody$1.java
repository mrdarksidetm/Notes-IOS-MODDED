package okhttp3;

import ae.r;
import hf.d;
import hf.f;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MediaType f16969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f16970c;

    @Override // okhttp3.RequestBody
    public long a() {
        return this.f16970c.F();
    }

    @Override // okhttp3.RequestBody
    public MediaType b() {
        return this.f16969b;
    }

    @Override // okhttp3.RequestBody
    public void e(d dVar) {
        r.f(dVar, "sink");
        dVar.g(this.f16970c);
    }
}
