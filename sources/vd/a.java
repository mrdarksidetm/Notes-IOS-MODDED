package vd;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public class a extends ud.a {

    /* JADX INFO: renamed from: vd.a$a, reason: collision with other inner class name */
    private static final class C0466a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0466a f22347a = new C0466a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f22348b;

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
            f22348b = num;
        }

        private C0466a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0466a.f22348b;
        return num == null || num.intValue() >= i10;
    }

    @Override // ud.a
    public void a(Throwable th, Throwable th2) {
        r.f(th, "cause");
        r.f(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
