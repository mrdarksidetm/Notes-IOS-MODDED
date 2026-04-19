package fc;

import android.os.Handler;
import android.os.Looper;
import fc.c;

/* JADX INFO: loaded from: classes2.dex */
public class g implements c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f11213a = gd.a.a(Looper.getMainLooper());

    @Override // fc.c.d
    public void a(Runnable runnable) {
        this.f11213a.post(runnable);
    }
}
