package a2;

import t0.k3;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f343c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f344d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.k1 f346b = k3.e(null, null, 2, null);

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public x(f0 f0Var) {
        this.f345a = f0Var;
    }

    private final y1.e0 a() {
        return (y1.e0) this.f346b.getValue();
    }

    private final y1.e0 f() {
        y1.e0 e0VarA = a();
        if (e0VarA != null) {
            return e0VarA;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
    }

    private final void k(y1.e0 e0Var) {
        this.f346b.setValue(e0Var);
    }

    public final int b(int i10) {
        return f().b(this.f345a.i0(), this.f345a.E(), i10);
    }

    public final int c(int i10) {
        return f().c(this.f345a.i0(), this.f345a.E(), i10);
    }

    public final int d(int i10) {
        return f().b(this.f345a.i0(), this.f345a.D(), i10);
    }

    public final int e(int i10) {
        return f().c(this.f345a.i0(), this.f345a.D(), i10);
    }

    public final int g(int i10) {
        return f().d(this.f345a.i0(), this.f345a.E(), i10);
    }

    public final int h(int i10) {
        return f().e(this.f345a.i0(), this.f345a.E(), i10);
    }

    public final int i(int i10) {
        return f().d(this.f345a.i0(), this.f345a.D(), i10);
    }

    public final int j(int i10) {
        return f().e(this.f345a.i0(), this.f345a.D(), i10);
    }

    public final void l(y1.e0 e0Var) {
        k(e0Var);
    }
}
