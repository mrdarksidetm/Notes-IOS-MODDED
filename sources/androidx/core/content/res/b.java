package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n3.g;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f3296a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<d, SparseArray<c>> f3297b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f3298c = new Object();

    static class a {
        static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.b$b, reason: collision with other inner class name */
    static class C0074b {
        static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ColorStateList f3299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Configuration f3300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f3301c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f3299a = colorStateList;
            this.f3300b = configuration;
            this.f3301c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Resources f3302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Resources.Theme f3303b;

        d(Resources resources, Resources.Theme theme) {
            this.f3302a = resources;
            this.f3303b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f3302a.equals(dVar.f3302a) && n3.c.a(this.f3303b, dVar.f3303b);
        }

        public int hashCode() {
            return n3.c.b(this.f3302a, this.f3303b);
        }
    }

    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i10, Handler handler) {
            e(handler).post(new Runnable() { // from class: f3.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11106a.f(i10);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: f3.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11104a.g(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i10);

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(Typeface typeface);
    }

    public static final class f {

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Object f3304a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static Method f3305b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static boolean f3306c;

            /* JADX WARN: Removed duplicated region for block: B:30:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            static void a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = androidx.core.content.res.b.f.a.f3304a
                    monitor-enter(r0)
                    boolean r1 = androidx.core.content.res.b.f.a.f3306c     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    androidx.core.content.res.b.f.a.f3305b = r3     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    goto L21
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3c
                L21:
                    androidx.core.content.res.b.f.a.f3306c = r1     // Catch: java.lang.Throwable -> L3c
                L23:
                    java.lang.reflect.Method r1 = androidx.core.content.res.b.f.a.f3305b     // Catch: java.lang.Throwable -> L3c
                    if (r1 == 0) goto L3a
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    goto L3a
                L2d:
                    r6 = move-exception
                    goto L30
                L2f:
                    r6 = move-exception
                L30:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3c
                    r6 = 0
                    androidx.core.content.res.b.f.a.f3305b = r6     // Catch: java.lang.Throwable -> L3c
                L3a:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    return
                L3c:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.b.f.a.a(android.content.res.Resources$Theme):void");
            }
        }

        /* JADX INFO: renamed from: androidx.core.content.res.b$f$b, reason: collision with other inner class name */
        static class C0075b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C0075b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f3298c) {
            WeakHashMap<d, SparseArray<c>> weakHashMap = f3297b;
            SparseArray<c> sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i10, new c(colorStateList, dVar.f3302a.getConfiguration(), theme));
        }
    }

    private static ColorStateList b(d dVar, int i10) {
        c cVar;
        Resources.Theme theme;
        synchronized (f3298c) {
            SparseArray<c> sparseArray = f3297b.get(dVar);
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i10)) != null) {
                if (cVar.f3300b.equals(dVar.f3302a.getConfiguration()) && (((theme = dVar.f3303b) == null && cVar.f3301c == 0) || (theme != null && cVar.f3301c == theme.hashCode()))) {
                    return cVar.f3299a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    public static ColorStateList c(Resources resources, int i10, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListB = b(dVar, i10);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListJ = j(resources, i10, theme);
        if (colorStateListJ == null) {
            return C0074b.b(resources, i10, theme);
        }
        a(dVar, i10, colorStateListJ, theme);
        return colorStateListJ;
    }

    public static Drawable d(Resources resources, int i10, Resources.Theme theme) {
        return a.a(resources, i10, theme);
    }

    public static Drawable e(Resources resources, int i10, int i11, Resources.Theme theme) {
        return a.b(resources, i10, i11, theme);
    }

    public static Typeface f(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return l(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface g(Context context, int i10, TypedValue typedValue, int i11, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return l(context, i10, typedValue, i11, eVar, null, true, false);
    }

    public static void h(Context context, int i10, e eVar, Handler handler) {
        g.h(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            l(context, i10, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    private static TypedValue i() {
        ThreadLocal<TypedValue> threadLocal = f3296a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList j(Resources resources, int i10, Resources.Theme theme) {
        if (k(resources, i10)) {
            return null;
        }
        try {
            return f3.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    private static boolean k(Resources resources, int i10) {
        TypedValue typedValueI = i();
        resources.getValue(i10, typedValueI, true);
        int i11 = typedValueI.type;
        return i11 >= 28 && i11 <= 31;
    }

    private static Typeface l(Context context, int i10, TypedValue typedValue, int i11, e eVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface typefaceM = m(context, resources, typedValue, i10, i11, eVar, handler, z10, z11);
        if (typefaceM != null || eVar != null || z11) {
            return typefaceM;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface m(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.b.e r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.b.m(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.b$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
