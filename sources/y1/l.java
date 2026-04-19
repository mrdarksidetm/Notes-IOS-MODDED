package y1;

import a2.y0;
import androidx.compose.ui.e;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends e.c implements a2.a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private zd.q<Object, ? super d0, ? super w2.b, ? extends f0> f23267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c0 f23268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b0 f23269p;

    private final class a implements b0, le.n0, g0 {
    }

    static final class b implements y0.e {
        b() {
        }

        @Override // a2.y0.e
        public final f0 d(g0 g0Var, d0 d0Var, long j10) {
            zd.q<Object, d0, w2.b, f0> qVarB2 = l.this.b2();
            l.a2(l.this);
            return qVarB2.invoke(null, d0Var, w2.b.b(j10));
        }
    }

    static final class c implements y0.e {
        c() {
        }

        @Override // a2.y0.e
        public final f0 d(g0 g0Var, d0 d0Var, long j10) {
            zd.q<Object, d0, w2.b, f0> qVarB2 = l.this.b2();
            l.a2(l.this);
            return qVarB2.invoke(null, d0Var, w2.b.b(j10));
        }
    }

    static final class d extends ae.s implements zd.l<t0.a, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f23272a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(t0 t0Var) {
            super(1);
            this.f23272a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.f(aVar, this.f23272a, 0, 0, 0.0f, 4, null);
        }
    }

    static final class e implements y0.e {
        e() {
        }

        @Override // a2.y0.e
        public final f0 d(g0 g0Var, d0 d0Var, long j10) {
            zd.q<Object, d0, w2.b, f0> qVarB2 = l.this.b2();
            l.a2(l.this);
            return qVarB2.invoke(null, d0Var, w2.b.b(j10));
        }
    }

    static final class f implements y0.e {
        f() {
        }

        @Override // a2.y0.e
        public final f0 d(g0 g0Var, d0 d0Var, long j10) {
            zd.q<Object, d0, w2.b, f0> qVarB2 = l.this.b2();
            l.a2(l.this);
            return qVarB2.invoke(null, d0Var, w2.b.b(j10));
        }
    }

    static final class g extends ae.s implements zd.a<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a2.f0 f23275a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(a2.f0 f0Var) {
            super(0);
            this.f23275a = f0Var;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            a2.f0 f0VarK0 = this.f23275a.k0();
            ae.r.c(f0VarK0);
            return f0VarK0.N().U1();
        }
    }

    public static final /* synthetic */ a a2(l lVar) {
        lVar.getClass();
        return null;
    }

    @Override // androidx.compose.ui.e.c
    public void K1() {
        c0 c0Var;
        c0 c0Var2;
        androidx.compose.ui.node.a aVarH0;
        a2.p0 p0VarZ1;
        a2.u0 u0VarZ1 = z1();
        if (((u0VarZ1 == null || (p0VarZ1 = u0VarZ1.Z1()) == null) ? null : p0VarZ1.C1()) == null) {
            throw new IllegalStateException("could not fetch lookahead coordinates".toString());
        }
        a2.f0 f0VarY = a2.k.k(this).Y();
        if (f0VarY != null && f0VarY.K0()) {
            c0Var2 = new c0(new g(f0VarY));
        } else {
            int iA = a2.w0.a(512);
            if (!L0().H1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            e.c cVarE1 = L0().E1();
            a2.f0 f0VarK = a2.k.k(this);
            l lVar = null;
            while (f0VarK != null) {
                if ((f0VarK.h0().k().x1() & iA) != 0) {
                    while (cVarE1 != null) {
                        if ((cVarE1.C1() & iA) != 0) {
                            v0.d dVar = null;
                            e.c cVarG = cVarE1;
                            while (cVarG != null) {
                                if (cVarG instanceof l) {
                                    lVar = (l) cVarG;
                                } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                                    int i10 = 0;
                                    for (e.c cVarB2 = ((a2.l) cVarG).b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
                                        if ((cVarB2.C1() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVarG = cVarB2;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new v0.d(new e.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    dVar.b(cVarG);
                                                    cVarG = null;
                                                }
                                                dVar.b(cVarB2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVarG = a2.k.g(dVar);
                            }
                        }
                        cVarE1 = cVarE1.E1();
                    }
                }
                f0VarK = f0VarK.k0();
                cVarE1 = (f0VarK == null || (aVarH0 = f0VarK.h0()) == null) ? null : aVarH0.o();
            }
            if (lVar == null || (c0Var = lVar.f23268o) == null) {
                c0Var = this.f23268o;
            }
            c0Var2 = c0Var;
        }
        this.f23269p = c0Var2;
    }

    public final zd.q<Object, d0, w2.b, f0> b2() {
        return this.f23267n;
    }

    public final f0 c2(g0 g0Var, d0 d0Var, long j10, long j11, long j12) {
        throw null;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        t0 t0VarI = d0Var.I(j10);
        return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new d(t0VarI), 4, null);
    }

    public final int d2(n nVar, m mVar, int i10) {
        return a2.y0.f356a.a(new b(), nVar, mVar, i10);
    }

    public final int e2(n nVar, m mVar, int i10) {
        return a2.y0.f356a.b(new c(), nVar, mVar, i10);
    }

    public final int f2(n nVar, m mVar, int i10) {
        return a2.y0.f356a.c(new e(), nVar, mVar, i10);
    }

    public final int g2(n nVar, m mVar, int i10) {
        return a2.y0.f356a.d(new f(), nVar, mVar, i10);
    }
}
