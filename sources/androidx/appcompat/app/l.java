package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Field f1065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f1066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class<?> f1067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f1068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f1069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f1070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f1071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f1072h;

    static class a {
        static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f1072h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1071g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f1072h = true;
        }
        Field field = f1071g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f1066b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f1065a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f1066b = true;
        }
        Field field2 = f1065a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) {
        if (!f1068d) {
            try {
                f1067c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f1068d = true;
        }
        Class<?> cls = f1067c;
        if (cls == null) {
            return;
        }
        if (!f1070f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1069e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f1070f = true;
        }
        Field field = f1069e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
