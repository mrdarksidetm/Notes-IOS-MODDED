package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class f1<T, B> {
    f1() {
    }

    abstract void a(B b10, int i10, int i11);

    abstract void b(B b10, int i10, long j10);

    abstract void c(B b10, int i10, T t10);

    abstract void d(B b10, int i10, g gVar);

    abstract void e(B b10, int i10, long j10);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t10);

    abstract int i(T t10);

    abstract void j(Object obj);

    abstract T k(T t10, T t11);

    final void l(B b10, y0 y0Var) {
        while (y0Var.A() != Integer.MAX_VALUE && m(b10, y0Var)) {
        }
    }

    final boolean m(B b10, y0 y0Var) throws z {
        int iU = y0Var.u();
        int iA = k1.a(iU);
        int iB = k1.b(iU);
        if (iB == 0) {
            e(b10, iA, y0Var.M());
            return true;
        }
        if (iB == 1) {
            b(b10, iA, y0Var.d());
            return true;
        }
        if (iB == 2) {
            d(b10, iA, y0Var.D());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw z.d();
            }
            a(b10, iA, y0Var.i());
            return true;
        }
        B bN = n();
        int iC = k1.c(iA, 4);
        l(bN, y0Var);
        if (iC != y0Var.u()) {
            throw z.a();
        }
        c(b10, iA, r(bN));
        return true;
    }

    abstract B n();

    abstract void o(Object obj, B b10);

    abstract void p(Object obj, T t10);

    abstract boolean q(y0 y0Var);

    abstract T r(B b10);

    abstract void s(T t10, l1 l1Var);

    abstract void t(T t10, l1 l1Var);
}
