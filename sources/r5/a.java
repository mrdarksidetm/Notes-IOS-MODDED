package r5;

import ae.r;
import he.c;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19183a = new a();

    private a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[PHI: r5
  0x0036: PHI (r5v3 java.lang.StringBuilder) = (r5v1 java.lang.StringBuilder), (r5v4 java.lang.StringBuilder) binds: [B:9:0x0027, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e(java.lang.String r4, zd.a<java.lang.Boolean> r5) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "ReflectionGuard"
            java.lang.String r2 = "block"
            ae.r.f(r5, r2)
            r2 = 0
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.NoSuchMethodException -> L1d java.lang.ClassNotFoundException -> L2a
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.NoSuchMethodException -> L1d java.lang.ClassNotFoundException -> L2a
            boolean r5 = r5.booleanValue()     // Catch: java.lang.NoSuchMethodException -> L1d java.lang.ClassNotFoundException -> L2a
            if (r5 != 0) goto L1b
            if (r4 == 0) goto L1b
            android.util.Log.e(r1, r4)     // Catch: java.lang.NoSuchMethodException -> L1d java.lang.ClassNotFoundException -> L2a
        L1b:
            r2 = r5
            goto L41
        L1d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = "NoSuchMethod: "
            r5.append(r3)
            if (r4 != 0) goto L37
            goto L36
        L2a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = "ClassNotFound: "
            r5.append(r3)
            if (r4 != 0) goto L37
        L36:
            r4 = r0
        L37:
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.e(r1, r4)
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.a.e(java.lang.String, zd.a):boolean");
    }

    public final boolean a(zd.a<? extends Class<?>> aVar) {
        r.f(aVar, "classLoader");
        try {
            aVar.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean b(Method method, c<?> cVar) {
        r.f(method, "<this>");
        r.f(cVar, "clazz");
        return c(method, yd.a.a(cVar));
    }

    public final boolean c(Method method, Class<?> cls) {
        r.f(method, "<this>");
        r.f(cls, "clazz");
        return method.getReturnType().equals(cls);
    }

    public final boolean d(Method method) {
        r.f(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}
