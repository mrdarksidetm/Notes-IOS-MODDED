package bd;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    static final class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Handler f5715a = new Handler(Looper.getMainLooper());

        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f5715a.post(runnable);
        }
    }

    public static Executor a() {
        return new a();
    }
}
