package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class<?> f3165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f3166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f3167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f3168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f3169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f3170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Handler f3171g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f3172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f3173b;

        a(d dVar, Object obj) {
            this.f3172a = dVar;
            this.f3173b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3172a.f3178a = this.f3173b;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f3174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f3175b;

        b(Application application, d dVar) {
            this.f3174a = application;
            this.f3175b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3174a.unregisterActivityLifecycleCallbacks(this.f3175b);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.c$c, reason: collision with other inner class name */
    class RunnableC0068c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f3176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f3177b;

        RunnableC0068c(Object obj, Object obj2) {
            this.f3176a = obj;
            this.f3177b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = c.f3168d;
                if (method != null) {
                    method.invoke(this.f3176a, this.f3177b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    c.f3169e.invoke(this.f3176a, this.f3177b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f3179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3181d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3182e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f3183f = false;

        d(Activity activity) {
            this.f3179b = activity;
            this.f3180c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3179b == activity) {
                this.f3179b = null;
                this.f3182e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f3182e || this.f3183f || this.f3181d || !c.h(this.f3178a, this.f3180c, activity)) {
                return;
            }
            this.f3183f = true;
            this.f3178a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3179b == activity) {
                this.f3181d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f3165a = clsA;
        f3166b = b();
        f3167c = f();
        f3168d = d(clsA);
        f3169e = c(clsA);
        f3170f = e(clsA);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f3167c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f3171g.postAtFrontOfQueue(new RunnableC0068c(f3166b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f3170f == null) {
            return false;
        }
        if (f3169e == null && f3168d == null) {
            return false;
        }
        try {
            Object obj2 = f3167c.get(activity);
            if (obj2 == null || (obj = f3166b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f3171g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f3170f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f3171g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
