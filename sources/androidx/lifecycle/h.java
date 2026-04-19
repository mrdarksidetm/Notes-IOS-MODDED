package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f4322a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f4323b = new AtomicBoolean(false);

    public static final class a extends o4.c {
        @Override // o4.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ae.r.f(activity, "activity");
            p.f4372b.c(activity);
        }
    }

    private h() {
    }

    public static final void a(Context context) {
        ae.r.f(context, "context");
        if (f4323b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        ae.r.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
