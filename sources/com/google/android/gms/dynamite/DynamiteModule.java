package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Boolean f8665g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f8666h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f8667i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f8668j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Boolean f8669k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static l f8674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static m f8675q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ThreadLocal f8670l = new ThreadLocal();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f8671m = new com.google.android.gms.dynamite.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final b.a f8672n = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8659a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f8660b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f8661c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f8662d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f8663e = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f8664f = new i();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f8673o = new j();

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, i9.c cVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, i9.c cVar) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
        }
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (w8.k.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return c(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5 A[Catch: all -> 0x00af, TryCatch #4 {, blocks: (B:9:0x0026, B:11:0x0032, B:48:0x00ad, B:14:0x0038, B:16:0x003f, B:18:0x0045, B:21:0x0048, B:23:0x004c, B:27:0x0056, B:29:0x005e, B:32:0x0065, B:39:0x008f, B:40:0x0097, B:35:0x006c, B:37:0x0072, B:38:0x0081, B:43:0x009a, B:46:0x009d, B:47:0x00a5, B:15:0x003b), top: B:128:0x0026, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0163 A[Catch: all -> 0x01bf, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01bf, blocks: (B:3:0x0002, B:61:0x00d6, B:63:0x00dc, B:68:0x00fd, B:90:0x0155, B:94:0x0163, B:115:0x01b8, B:116:0x01bb, B:110:0x01b0, B:66:0x00e2, B:119:0x01be, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:59:0x00d3, B:19:0x0046, B:41:0x0098, B:44:0x009b, B:52:0x00b1, B:60:0x00d5, B:58:0x00b7), top: B:136:0x0002, inners: #1, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int d(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static void e(ClassLoader classLoader) throws a {
        m mVar;
        i9.c cVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                mVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
            }
            f8675q = mVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10, cVar);
        }
    }

    private static boolean f(Cursor cursor) {
        k kVar = (k) f8670l.get();
        if (kVar == null || kVar.f8676a != null) {
            return false;
        }
        kVar.f8676a = cursor;
        return true;
    }

    private static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f8669k)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (f8669k == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (t8.h.f().h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            f8669k = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f8667i = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    private static l h(Context context) {
        l lVar;
        synchronized (DynamiteModule.class) {
            l lVar2 = f8674p;
            if (lVar2 != null) {
                return lVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    lVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    lVar = iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new l(iBinder);
                }
                if (lVar != null) {
                    f8674p = lVar;
                    return lVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }
}
