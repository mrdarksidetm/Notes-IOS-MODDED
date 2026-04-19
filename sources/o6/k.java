package o6;

import java.io.IOException;
import md.i0;
import md.t;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
final class k implements Callback, zd.l<Throwable, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Call f16388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final le.o<Response> f16389b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(Call call, le.o<? super Response> oVar) {
        this.f16388a = call;
        this.f16389b = oVar;
    }

    @Override // okhttp3.Callback
    public void a(Call call, Response response) {
        this.f16389b.resumeWith(md.t.b(response));
    }

    @Override // okhttp3.Callback
    public void b(Call call, IOException iOException) {
        if (call.w()) {
            return;
        }
        le.o<Response> oVar = this.f16389b;
        t.a aVar = md.t.f15576b;
        oVar.resumeWith(md.t.b(md.u.a(iOException)));
    }

    public void c(Throwable th) {
        try {
            this.f16388a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
        c(th);
        return i0.f15558a;
    }
}
