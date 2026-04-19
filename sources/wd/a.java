package wd;

import ee.c;

/* JADX INFO: loaded from: classes2.dex */
public class a extends vd.a {

    /* JADX INFO: renamed from: wd.a$a, reason: collision with other inner class name */
    private static final class C0474a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0474a f22894a = new C0474a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f22895b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null) {
                if (num2.intValue() > 0) {
                    num = num2;
                }
            }
            f22895b = num;
        }

        private C0474a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0474a.f22895b;
        return num == null || num.intValue() >= i10;
    }

    @Override // ud.a
    public c b() {
        return c(34) ? new fe.a() : super.b();
    }
}
