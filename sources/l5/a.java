package l5;

import ae.r;
import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Executor;
import m5.f;
import m5.k;
import oe.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f14771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k5.a f14772c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar, new k5.a());
        r.f(fVar, "tracker");
    }

    private a(f fVar, k5.a aVar) {
        this.f14771b = fVar;
        this.f14772c = aVar;
    }

    @Override // m5.f
    public e<k> a(Activity activity) {
        r.f(activity, "activity");
        return this.f14771b.a(activity);
    }

    @Override // m5.f
    public e<k> b(Context context) {
        r.f(context, "context");
        return this.f14771b.b(context);
    }

    public final void c(Activity activity, Executor executor, n3.a<k> aVar) {
        r.f(activity, "activity");
        r.f(executor, "executor");
        r.f(aVar, "consumer");
        this.f14772c.a(executor, aVar, this.f14771b.a(activity));
    }

    public final void d(n3.a<k> aVar) {
        r.f(aVar, "consumer");
        this.f14772c.b(aVar);
    }
}
