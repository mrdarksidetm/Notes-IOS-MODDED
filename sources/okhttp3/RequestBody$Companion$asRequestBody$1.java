package okhttp3;

import ae.r;
import hf.d;
import hf.i0;
import hf.u;
import java.io.File;
import java.io.IOException;
import xd.b;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MediaType f16967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ File f16968c;

    @Override // okhttp3.RequestBody
    public long a() {
        return this.f16968c.length();
    }

    @Override // okhttp3.RequestBody
    public MediaType b() {
        return this.f16967b;
    }

    @Override // okhttp3.RequestBody
    public void e(d dVar) throws IOException {
        r.f(dVar, "sink");
        i0 i0VarJ = u.j(this.f16968c);
        try {
            dVar.T(i0VarJ);
            b.a(i0VarJ, null);
        } finally {
        }
    }
}
