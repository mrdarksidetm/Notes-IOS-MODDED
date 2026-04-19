package f9;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f11164a;

    public a(Looper looper) {
        this.f11164a = new zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11164a.post(runnable);
    }
}
