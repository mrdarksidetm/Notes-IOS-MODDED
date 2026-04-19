package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.t;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class q0<T> implements z0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f3729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f1<?, ?> f3730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p<?> f3732d;

    private q0(f1<?, ?> f1Var, p<?> pVar, n0 n0Var) {
        this.f3730b = f1Var;
        this.f3731c = pVar.e(n0Var);
        this.f3732d = pVar;
        this.f3729a = n0Var;
    }

    private <UT, UB> int j(f1<UT, UB> f1Var, T t10) {
        return f1Var.i(f1Var.g(t10));
    }

    private <UT, UB, ET extends t.b<ET>> void k(f1<UT, UB> f1Var, p<ET> pVar, T t10, y0 y0Var, o oVar) {
        UB ubF = f1Var.f(t10);
        t<ET> tVarD = pVar.d(t10);
        while (y0Var.A() != Integer.MAX_VALUE) {
            try {
                if (!m(y0Var, oVar, pVar, tVarD, f1Var, ubF)) {
                    return;
                }
            } finally {
                f1Var.o(t10, ubF);
            }
        }
    }

    static <T> q0<T> l(f1<?, ?> f1Var, p<?> pVar, n0 n0Var) {
        return new q0<>(f1Var, pVar, n0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends t.b<ET>> boolean m(y0 y0Var, o oVar, p<ET> pVar, t<ET> tVar, f1<UT, UB> f1Var, UB ub2) throws z {
        int iU = y0Var.u();
        if (iU != k1.f3659a) {
            if (k1.b(iU) != 2) {
                return y0Var.H();
            }
            Object objB = pVar.b(oVar, this.f3729a, k1.a(iU));
            if (objB == null) {
                return f1Var.m(ub2, y0Var);
            }
            pVar.h(y0Var, objB, oVar, tVar);
            return true;
        }
        int iN = 0;
        Object objB2 = null;
        g gVarD = null;
        while (y0Var.A() != Integer.MAX_VALUE) {
            int iU2 = y0Var.u();
            if (iU2 == k1.f3661c) {
                iN = y0Var.n();
                objB2 = pVar.b(oVar, this.f3729a, iN);
            } else if (iU2 == k1.f3662d) {
                if (objB2 != null) {
                    pVar.h(y0Var, objB2, oVar, tVar);
                } else {
                    gVarD = y0Var.D();
                }
            } else if (!y0Var.H()) {
                break;
            }
        }
        if (y0Var.u() != k1.f3660b) {
            throw z.a();
        }
        if (gVarD != null) {
            if (objB2 != null) {
                pVar.i(gVarD, objB2, oVar, tVar);
            } else {
                f1Var.d(ub2, iN, gVarD);
            }
        }
        return true;
    }

    private <UT, UB> void n(f1<UT, UB> f1Var, T t10, l1 l1Var) {
        f1Var.s(f1Var.g(t10), l1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public void a(T t10, T t11) {
        b1.G(this.f3730b, t10, t11);
        if (this.f3731c) {
            b1.E(this.f3732d, t10, t11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public void b(T t10, y0 y0Var, o oVar) {
        k(this.f3730b, this.f3732d, t10, y0Var, oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public void c(T t10) {
        this.f3730b.j(t10);
        this.f3732d.f(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public final boolean d(T t10) {
        return this.f3732d.c(t10).p();
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public void e(T t10, l1 l1Var) {
        Iterator itS = this.f3732d.c(t10).s();
        while (itS.hasNext()) {
            Map.Entry entry = (Map.Entry) itS.next();
            t.b bVar = (t.b) entry.getKey();
            if (bVar.g() != k1.c.MESSAGE || bVar.e() || bVar.h()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            l1Var.c(bVar.d(), entry instanceof a0.b ? ((a0.b) entry).a().e() : entry.getValue());
        }
        n(this.f3730b, t10, l1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public boolean f(T t10, T t11) {
        if (!this.f3730b.g(t10).equals(this.f3730b.g(t11))) {
            return false;
        }
        if (this.f3731c) {
            return this.f3732d.c(t10).equals(this.f3732d.c(t11));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public int g(T t10) {
        int iJ = j(this.f3730b, t10) + 0;
        return this.f3731c ? iJ + this.f3732d.c(t10).j() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public T h() {
        return (T) this.f3729a.g().y();
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public int i(T t10) {
        int iHashCode = this.f3730b.g(t10).hashCode();
        return this.f3731c ? (iHashCode * 53) + this.f3732d.c(t10).hashCode() : iHashCode;
    }
}
