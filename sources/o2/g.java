package o2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f16287a = new g();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16288a = new a();

        private a() {
        }

        public final Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private g() {
    }

    public final Handler a(Looper looper) {
        return Build.VERSION.SDK_INT >= 28 ? a.f16288a.a(looper) : new Handler(looper);
    }
}
