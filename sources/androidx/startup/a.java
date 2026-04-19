package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y4.b;
import y4.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f4897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f4898e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f4901c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set<Class<? extends y4.a<?>>> f4900b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<Class<?>, Object> f4899a = new HashMap();

    a(Context context) {
        this.f4901c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends y4.a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (b5.a.h()) {
            try {
                b5.a.c(cls.getSimpleName());
            } finally {
                b5.a.f();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f4899a.containsKey(cls)) {
            t10 = (T) this.f4899a.get(cls);
        } else {
            set.add(cls);
            try {
                y4.a<?> aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends y4.a<?>>> listA = aVarNewInstance.a();
                if (!listA.isEmpty()) {
                    for (Class<? extends y4.a<?>> cls2 : listA) {
                        if (!this.f4899a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t10 = (T) aVarNewInstance.b(this.f4901c);
                set.remove(cls);
                this.f4899a.put(cls, t10);
            } catch (Throwable th) {
                throw new c(th);
            }
        }
        return t10;
    }

    public static a e(Context context) {
        if (f4897d == null) {
            synchronized (f4898e) {
                if (f4897d == null) {
                    f4897d = new a(context);
                }
            }
        }
        return f4897d;
    }

    void a() {
        try {
            try {
                b5.a.c("Startup");
                b(this.f4901c.getPackageManager().getProviderInfo(new ComponentName(this.f4901c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new c(e10);
            }
        } finally {
            b5.a.f();
        }
    }

    void b(Bundle bundle) {
        String string = this.f4901c.getString(b.f23362a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (y4.a.class.isAssignableFrom(cls)) {
                            this.f4900b.add((Class<? extends y4.a<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends y4.a<?>>> it = this.f4900b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    <T> T c(Class<? extends y4.a<?>> cls) {
        T t10;
        synchronized (f4898e) {
            t10 = (T) this.f4899a.get(cls);
            if (t10 == null) {
                t10 = (T) d(cls, new HashSet());
            }
        }
        return t10;
    }

    public <T> T f(Class<? extends y4.a<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(Class<? extends y4.a<?>> cls) {
        return this.f4900b.contains(cls);
    }
}
