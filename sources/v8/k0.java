package v8;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes.dex */
final class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f22257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f22258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ l0 f22259c;

    k0(l0 l0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f22259c = l0Var;
        this.f22257a = lifecycleCallback;
        this.f22258b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        l0 l0Var = this.f22259c;
        if (l0Var.f22262b > 0) {
            LifecycleCallback lifecycleCallback = this.f22257a;
            if (l0Var.f22263c != null) {
                bundle = l0Var.f22263c.getBundle(this.f22258b);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.f22259c.f22262b >= 2) {
            this.f22257a.onStart();
        }
        if (this.f22259c.f22262b >= 3) {
            this.f22257a.onResume();
        }
        if (this.f22259c.f22262b >= 4) {
            this.f22257a.onStop();
        }
        if (this.f22259c.f22262b >= 5) {
            this.f22257a.onDestroy();
        }
    }
}
