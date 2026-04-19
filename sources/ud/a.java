package ud;

import ae.r;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: ud.a$a, reason: collision with other inner class name */
    private static final class C0443a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0443a f21760a = new C0443a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f21761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f21762c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
        static {
            /*
                ud.a$a r0 = new ud.a$a
                r0.<init>()
                ud.a.C0443a.f21760a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                ae.r.c(r1)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L13:
                r5 = 0
                if (r4 >= r2) goto L40
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = ae.r.b(r7, r8)
                if (r7 == 0) goto L39
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "getParameterTypes(...)"
                ae.r.e(r7, r8)
                java.lang.Object r7 = nd.l.w0(r7)
                boolean r7 = ae.r.b(r7, r0)
                if (r7 == 0) goto L39
                r7 = 1
                goto L3a
            L39:
                r7 = r3
            L3a:
                if (r7 == 0) goto L3d
                goto L41
            L3d:
                int r4 = r4 + 1
                goto L13
            L40:
                r6 = r5
            L41:
                ud.a.C0443a.f21761b = r6
                int r0 = r1.length
            L44:
                if (r3 >= r0) goto L59
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = ae.r.b(r4, r6)
                if (r4 == 0) goto L56
                r5 = r2
                goto L59
            L56:
                int r3 = r3 + 1
                goto L44
            L59:
                ud.a.C0443a.f21762c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ud.a.C0443a.<clinit>():void");
        }

        private C0443a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        r.f(th, "cause");
        r.f(th2, "exception");
        Method method = C0443a.f21761b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public ee.c b() {
        return new ee.b();
    }
}
