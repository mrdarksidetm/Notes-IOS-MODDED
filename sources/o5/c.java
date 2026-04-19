package o5;

import ae.r;
import android.content.Context;
import java.util.concurrent.Executor;
import m5.k;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public final class c implements n5.a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(n3.a aVar) {
        r.f(aVar, "$callback");
        aVar.accept(new k(u.m()));
    }

    @Override // n5.a
    public void a(n3.a<k> aVar) {
        r.f(aVar, "callback");
    }

    @Override // n5.a
    public void b(Context context, Executor executor, final n3.a<k> aVar) {
        r.f(context, "context");
        r.f(executor, "executor");
        r.f(aVar, "callback");
        executor.execute(new Runnable() { // from class: o5.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(aVar);
            }
        });
    }
}
