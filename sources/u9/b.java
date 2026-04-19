package u9;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f21748a = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f21749b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: u9.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0441b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC0441b f21750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC0441b f21751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0441b[] f21752c;

        /* JADX INFO: renamed from: u9.b$b$a */
        enum a extends EnumC0441b {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // u9.b.EnumC0441b
            public boolean a() {
                return !b.c();
            }
        }

        /* JADX INFO: renamed from: u9.b$b$b, reason: collision with other inner class name */
        enum C0442b extends EnumC0441b {
            C0442b(String str, int i10) {
                super(str, i10);
            }

            @Override // u9.b.EnumC0441b
            public boolean a() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f21750a = aVar;
            C0442b c0442b = new C0442b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f21751b = c0442b;
            f21752c = new EnumC0441b[]{aVar, c0442b};
        }

        private EnumC0441b(String str, int i10) {
        }

        public static EnumC0441b valueOf(String str) {
            return (EnumC0441b) Enum.valueOf(EnumC0441b.class, str);
        }

        public static EnumC0441b[] values() {
            return (EnumC0441b[]) f21752c.clone();
        }

        public abstract boolean a();
    }

    private b() {
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f21748a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return u9.a.a() || f21749b.get();
    }
}
