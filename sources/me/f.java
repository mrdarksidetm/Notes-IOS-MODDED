package me;

import ae.r;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import md.t;
import md.u;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f15602a;
    private static volatile Choreographer choreographer;

    static {
        Object objB;
        try {
            t.a aVar = t.f15576b;
            objB = t.b(new d(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            t.a aVar2 = t.f15576b;
            objB = t.b(u.a(th));
        }
        f15602a = (e) (t.g(objB) ? null : objB);
    }

    public static final Handler a(Looper looper, boolean z10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            objNewInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            r.d(objNewInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                objNewInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) objNewInstance;
    }

    public static final e b(Handler handler, String str) {
        return new d(handler, str);
    }
}
