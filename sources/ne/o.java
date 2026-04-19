package ne;

import le.g3;
import md.i0;
import ne.h;
import qe.q0;
import qe.z;

/* JADX INFO: loaded from: classes2.dex */
public class o<E> extends b<E> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f16199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a f16200n;

    public o(int i10, a aVar, zd.l<? super E, i0> lVar) {
        super(i10, lVar);
        this.f16199m = i10;
        this.f16200n = aVar;
        if (!(aVar != a.SUSPEND)) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + ae.i0.b(b.class).b() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    static /* synthetic */ <E> Object G0(o<E> oVar, E e10, qd.d<? super i0> dVar) throws Throwable {
        q0 q0VarD;
        Object objJ0 = oVar.J0(e10, true);
        if (!(objJ0 instanceof h.a)) {
            return i0.f15558a;
        }
        h.e(objJ0);
        zd.l<E, i0> lVar = oVar.f16159b;
        if (lVar == null || (q0VarD = z.d(lVar, e10, null, 2, null)) == null) {
            throw oVar.M();
        }
        md.f.a(q0VarD, oVar.M());
        throw q0VarD;
    }

    private final Object H0(E e10, boolean z10) {
        zd.l<E, i0> lVar;
        q0 q0VarD;
        Object objI = super.i(e10);
        if (h.i(objI) || h.h(objI)) {
            return objI;
        }
        if (!z10 || (lVar = this.f16159b) == null || (q0VarD = z.d(lVar, e10, null, 2, null)) == null) {
            return h.f16193b.c(i0.f15558a);
        }
        throw q0VarD;
    }

    private final Object I0(E e10) {
        j jVar;
        Object obj = c.f16173d;
        j jVar2 = (j) b.f16153h.get(this);
        while (true) {
            long andIncrement = b.f16149d.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zW = W(andIncrement);
            int i10 = c.f16171b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (jVar2.f19053c != j11) {
                j jVarH = H(j11, jVar2);
                if (jVarH != null) {
                    jVar = jVarH;
                } else if (zW) {
                    return h.f16193b.a(M());
                }
            } else {
                jVar = jVar2;
            }
            int iB0 = B0(jVar, i11, e10, j10, obj, zW);
            if (iB0 == 0) {
                jVar.b();
                return h.f16193b.c(i0.f15558a);
            }
            if (iB0 == 1) {
                return h.f16193b.c(i0.f15558a);
            }
            if (iB0 == 2) {
                if (zW) {
                    jVar.p();
                    return h.f16193b.a(M());
                }
                g3 g3Var = obj instanceof g3 ? (g3) obj : null;
                if (g3Var != null) {
                    l0(g3Var, jVar, i11);
                }
                D((jVar.f19053c * ((long) i10)) + ((long) i11));
                return h.f16193b.c(i0.f15558a);
            }
            if (iB0 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iB0 == 4) {
                if (j10 < L()) {
                    jVar.b();
                }
                return h.f16193b.a(M());
            }
            if (iB0 == 5) {
                jVar.b();
            }
            jVar2 = jVar;
        }
    }

    private final Object J0(E e10, boolean z10) {
        return this.f16200n == a.DROP_LATEST ? H0(e10, z10) : I0(e10);
    }

    @Override // ne.b
    protected boolean X() {
        return this.f16200n == a.DROP_OLDEST;
    }

    @Override // ne.b, ne.u
    public Object b(E e10, qd.d<? super i0> dVar) {
        return G0(this, e10, dVar);
    }

    @Override // ne.b, ne.u
    public Object i(E e10) {
        return J0(e10, false);
    }
}
