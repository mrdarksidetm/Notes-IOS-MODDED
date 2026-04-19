package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class f0 implements a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m0 f3558b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f3559a;

    static class a implements m0 {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public l0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    private static class b implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m0[] f3560a;

        b(m0... m0VarArr) {
            this.f3560a = m0VarArr;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public l0 a(Class<?> cls) {
            for (m0 m0Var : this.f3560a) {
                if (m0Var.b(cls)) {
                    return m0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public boolean b(Class<?> cls) {
            for (m0 m0Var : this.f3560a) {
                if (m0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public f0() {
        this(b());
    }

    private f0(m0 m0Var) {
        this.f3559a = (m0) y.b(m0Var, "messageInfoFactory");
    }

    private static m0 b() {
        return new b(v.c(), c());
    }

    private static m0 c() {
        try {
            return (m0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f3558b;
        }
    }

    private static boolean d(l0 l0Var) {
        return l0Var.c() == e4.g.PROTO2;
    }

    private static <T> z0<T> e(Class<T> cls, l0 l0Var) {
        return w.class.isAssignableFrom(cls) ? d(l0Var) ? p0.N(cls, l0Var, t0.b(), d0.b(), b1.M(), r.b(), k0.b()) : p0.N(cls, l0Var, t0.b(), d0.b(), b1.M(), null, k0.b()) : d(l0Var) ? p0.N(cls, l0Var, t0.a(), d0.a(), b1.H(), r.a(), k0.a()) : p0.N(cls, l0Var, t0.a(), d0.a(), b1.I(), null, k0.a());
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    public <T> z0<T> a(Class<T> cls) {
        f1<?, ?> f1VarH;
        p<?> pVarA;
        b1.J(cls);
        l0 l0VarA = this.f3559a.a(cls);
        if (!l0VarA.a()) {
            return e(cls, l0VarA);
        }
        if (w.class.isAssignableFrom(cls)) {
            f1VarH = b1.M();
            pVarA = r.b();
        } else {
            f1VarH = b1.H();
            pVarA = r.a();
        }
        return q0.l(f1VarH, pVarA, l0VarA.b());
    }
}
