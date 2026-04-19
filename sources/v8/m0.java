package v8;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes.dex */
final class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f22264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f22265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ n0 f22266c;

    m0(n0 n0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f22266c = n0Var;
        this.f22264a = lifecycleCallback;
        this.f22265b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        n0 n0Var = this.f22266c;
        if (n0Var.f22269b > 0) {
            LifecycleCallback lifecycleCallback = this.f22264a;
            if (n0Var.f22270c != null) {
                bundle = n0Var.f22270c.getBundle(this.f22265b);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.f22266c.f22269b >= 2) {
            this.f22264a.onStart();
        }
        if (this.f22266c.f22269b >= 3) {
            this.f22264a.onResume();
        }
        if (this.f22266c.f22269b >= 4) {
            this.f22264a.onStop();
        }
        if (this.f22266c.f22269b >= 5) {
            this.f22264a.onDestroy();
        }
    }
}
