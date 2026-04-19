package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f3616a = Logger.getLogger(i1.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Unsafe f3617b = B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class<?> f3618c = androidx.datastore.preferences.protobuf.d.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f3619d = m(Long.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f3620e = m(Integer.TYPE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f3621f = z();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f3622g = Q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f3623h = P();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final long f3624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f3625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f3626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f3627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f3628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f3629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f3630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f3631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f3632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f3633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f3634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f3635t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f3636u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f3637v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f3638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final boolean f3639x;

    static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public boolean c(Object obj, long j10) {
            return i1.f3639x ? i1.q(obj, j10) : i1.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public byte d(Object obj, long j10) {
            return i1.f3639x ? i1.t(obj, j10) : i1.u(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public void k(Object obj, long j10, boolean z10) {
            if (i1.f3639x) {
                i1.F(obj, j10, z10);
            } else {
                i1.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public void l(Object obj, long j10, byte b10) {
            if (i1.f3639x) {
                i1.I(obj, j10, b10);
            } else {
                i1.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public boolean c(Object obj, long j10) {
            return i1.f3639x ? i1.q(obj, j10) : i1.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public byte d(Object obj, long j10) {
            return i1.f3639x ? i1.t(obj, j10) : i1.u(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public void k(Object obj, long j10, boolean z10) {
            if (i1.f3639x) {
                i1.F(obj, j10, z10);
            } else {
                i1.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public void l(Object obj, long j10, byte b10) {
            if (i1.f3639x) {
                i1.I(obj, j10, b10);
            } else {
                i1.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public boolean c(Object obj, long j10) {
            return this.f3640a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public byte d(Object obj, long j10) {
            return this.f3640a.getByte(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public double e(Object obj, long j10) {
            return this.f3640a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public float f(Object obj, long j10) {
            return this.f3640a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public void k(Object obj, long j10, boolean z10) {
            this.f3640a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public void l(Object obj, long j10, byte b10) {
            this.f3640a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public void m(Object obj, long j10, double d10) {
            this.f3640a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public void n(Object obj, long j10, float f10) {
            this.f3640a.putFloat(obj, j10, f10);
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f3640a;

        e(Unsafe unsafe) {
            this.f3640a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f3640a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f3640a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f3640a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f3640a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f3640a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f3640a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f3640a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f3640a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f3640a.putObject(obj, j10, obj2);
        }
    }

    static {
        long j10 = j(byte[].class);
        f3624i = j10;
        f3625j = j(boolean[].class);
        f3626k = k(boolean[].class);
        f3627l = j(int[].class);
        f3628m = k(int[].class);
        f3629n = j(long[].class);
        f3630o = k(long[].class);
        f3631p = j(float[].class);
        f3632q = k(float[].class);
        f3633r = j(double[].class);
        f3634s = k(double[].class);
        f3635t = j(Object[].class);
        f3636u = k(Object[].class);
        f3637v = o(l());
        f3638w = (int) (7 & j10);
        f3639x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private i1() {
    }

    static Object A(Object obj, long j10) {
        return f3621f.i(obj, j10);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return f3623h;
    }

    static boolean D() {
        return f3622g;
    }

    static void E(Object obj, long j10, boolean z10) {
        f3621f.k(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f3621f.l(bArr, f3624i + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iX = x(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (iX & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x(obj, j11) & (~(255 << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f3621f.m(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f3621f.n(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f3621f.o(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f3621f.p(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f3621f.q(obj, j10, obj2);
    }

    private static boolean P() {
        Unsafe unsafe = f3617b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (androidx.datastore.preferences.protobuf.d.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            f3616a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean Q() {
        Unsafe unsafe = f3617b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (androidx.datastore.preferences.protobuf.d.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            f3616a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    static <T> T i(Class<T> cls) {
        try {
            return (T) f3617b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class<?> cls) {
        if (f3623h) {
            return f3621f.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f3623h) {
            return f3621f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field fieldN;
        if (androidx.datastore.preferences.protobuf.d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    private static boolean m(Class<?> cls) {
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f3618c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f3621f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j10) {
        return f3621f.c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        return u(obj, j10) != 0;
    }

    static byte s(byte[] bArr, long j10) {
        return f3621f.d(bArr, f3624i + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte t(Object obj, long j10) {
        return (byte) ((x(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte u(Object obj, long j10) {
        return (byte) ((x(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j10) {
        return f3621f.e(obj, j10);
    }

    static float w(Object obj, long j10) {
        return f3621f.f(obj, j10);
    }

    static int x(Object obj, long j10) {
        return f3621f.g(obj, j10);
    }

    static long y(Object obj, long j10) {
        return f3621f.h(obj, j10);
    }

    private static e z() {
        Unsafe unsafe = f3617b;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f3619d) {
            return new c(unsafe);
        }
        if (f3620e) {
            return new b(unsafe);
        }
        return null;
    }
}
