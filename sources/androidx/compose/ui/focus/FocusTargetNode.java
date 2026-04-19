package androidx.compose.ui.focus;

import a2.a1;
import a2.f0;
import a2.r0;
import a2.w0;
import a2.z0;
import ae.h0;
import ae.s;
import androidx.compose.ui.e;
import j1.o;
import j1.p;
import j1.r;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetNode extends e.c implements a2.h, p, z0, z1.h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private o f2693p = o.Inactive;

    public static final class FocusTargetElement extends r0<FocusTargetNode> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FocusTargetElement f2694b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // a2.r0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode a() {
            return new FocusTargetNode();
        }

        @Override // a2.r0
        public int hashCode() {
            return 1739042953;
        }

        @Override // a2.r0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void c(FocusTargetNode focusTargetNode) {
        }
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2695a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2695a = iArr;
        }
    }

    static final class b extends s implements zd.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0<d> f2696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2697b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h0<d> h0Var, FocusTargetNode focusTargetNode) {
            super(0);
            this.f2696a = h0Var;
            this.f2697b = focusTargetNode;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.d] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f2696a.f712a = this.f2697b.f2();
        }
    }

    @Override // androidx.compose.ui.e.c
    public void M1() {
        int i10 = a.f2695a[h2().ordinal()];
        if (i10 == 1 || i10 == 2) {
            a2.k.l(this).getFocusOwner().o(true);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            j2();
            return;
        }
        j2();
        j1.s sVarD = r.d(this);
        try {
            if (sVarD.f13821c) {
                sVarD.g();
            }
            sVarD.f();
            k2(o.Inactive);
            i0 i0Var = i0.f15558a;
        } finally {
            sVarD.h();
        }
    }

    @Override // a2.z0
    public void R0() {
        o oVarH2 = h2();
        i2();
        if (oVarH2 != h2()) {
            j1.d.c(this);
        }
    }

    public final void e2() {
        o oVarI = r.d(this).i(this);
        if (oVarI == null) {
            throw new IllegalStateException("committing a node that was not updated in the current transaction".toString());
        }
        this.f2693p = oVarI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    public final d f2() {
        androidx.compose.ui.node.a aVarH0;
        e eVar = new e();
        int iA = w0.a(2048);
        int iA2 = w0.a(1024);
        e.c cVarL0 = L0();
        int i10 = iA | iA2;
        if (!L0().H1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        e.c cVarL02 = L0();
        f0 f0VarK = a2.k.k(this);
        loop0: while (f0VarK != null) {
            if ((f0VarK.h0().k().x1() & i10) != 0) {
                while (cVarL02 != null) {
                    if ((cVarL02.C1() & i10) != 0) {
                        if (cVarL02 != cVarL0) {
                            if ((cVarL02.C1() & iA2) != 0) {
                                break loop0;
                            }
                        }
                        if ((cVarL02.C1() & iA) != 0) {
                            e.c cVarG = cVarL02;
                            v0.d dVar = null;
                            while (cVarG != 0) {
                                if (cVarG instanceof j1.j) {
                                    ((j1.j) cVarG).S(eVar);
                                } else {
                                    if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                                        e.c cVarB2 = ((a2.l) cVarG).b2();
                                        int i11 = 0;
                                        cVarG = cVarG;
                                        while (cVarB2 != null) {
                                            if ((cVarB2.C1() & iA) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    cVarG = cVarB2;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new v0.d(new e.c[16], 0);
                                                    }
                                                    if (cVarG != 0) {
                                                        dVar.b(cVarG);
                                                        cVarG = 0;
                                                    }
                                                    dVar.b(cVarB2);
                                                }
                                            }
                                            cVarB2 = cVarB2.y1();
                                            cVarG = cVarG;
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                }
                                cVarG = a2.k.g(dVar);
                            }
                        }
                    }
                    cVarL02 = cVarL02.E1();
                }
            }
            f0VarK = f0VarK.k0();
            cVarL02 = (f0VarK == null || (aVarH0 = f0VarK.h0()) == null) ? null : aVarH0.o();
        }
        return eVar;
    }

    public final y1.c g2() {
        return (y1.c) p(y1.d.a());
    }

    public o h2() {
        o oVarI;
        j1.s sVarB = r.b(this);
        return (sVarB == null || (oVarI = sVarB.i(this)) == null) ? this.f2693p : oVarI;
    }

    public final void i2() {
        d dVar;
        int i10 = a.f2695a[h2().ordinal()];
        if (i10 == 1 || i10 == 2) {
            h0 h0Var = new h0();
            a1.a(this, new b(h0Var, this));
            T t10 = h0Var.f712a;
            if (t10 == 0) {
                ae.r.t("focusProperties");
                dVar = null;
            } else {
                dVar = (d) t10;
            }
            if (dVar.g()) {
                return;
            }
            a2.k.l(this).getFocusOwner().o(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public final void j2() {
        androidx.compose.ui.node.a aVarH0;
        e.c cVarL0 = L0();
        int iA = w0.a(4096);
        v0.d dVar = null;
        while (cVarL0 != 0) {
            if (cVarL0 instanceof j1.c) {
                j1.d.b((j1.c) cVarL0);
            } else {
                if (((cVarL0.C1() & iA) != 0) && (cVarL0 instanceof a2.l)) {
                    e.c cVarB2 = ((a2.l) cVarL0).b2();
                    int i10 = 0;
                    cVarL0 = cVarL0;
                    while (cVarB2 != null) {
                        if ((cVarB2.C1() & iA) != 0) {
                            i10++;
                            if (i10 == 1) {
                                cVarL0 = cVarB2;
                            } else {
                                if (dVar == null) {
                                    dVar = new v0.d(new e.c[16], 0);
                                }
                                if (cVarL0 != 0) {
                                    dVar.b(cVarL0);
                                    cVarL0 = 0;
                                }
                                dVar.b(cVarB2);
                            }
                        }
                        cVarB2 = cVarB2.y1();
                        cVarL0 = cVarL0;
                    }
                    if (i10 == 1) {
                    }
                }
            }
            cVarL0 = a2.k.g(dVar);
        }
        int iA2 = w0.a(4096) | w0.a(1024);
        if (!L0().H1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        e.c cVarE1 = L0().E1();
        f0 f0VarK = a2.k.k(this);
        while (f0VarK != null) {
            if ((f0VarK.h0().k().x1() & iA2) != 0) {
                while (cVarE1 != null) {
                    if ((cVarE1.C1() & iA2) != 0) {
                        if (!((w0.a(1024) & cVarE1.C1()) != 0) && cVarE1.H1()) {
                            int iA3 = w0.a(4096);
                            v0.d dVar2 = null;
                            e.c cVarG = cVarE1;
                            while (cVarG != 0) {
                                if (cVarG instanceof j1.c) {
                                    j1.d.b((j1.c) cVarG);
                                } else {
                                    if (((cVarG.C1() & iA3) != 0) && (cVarG instanceof a2.l)) {
                                        e.c cVarB22 = ((a2.l) cVarG).b2();
                                        int i11 = 0;
                                        cVarG = cVarG;
                                        while (cVarB22 != null) {
                                            if ((cVarB22.C1() & iA3) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    cVarG = cVarB22;
                                                } else {
                                                    if (dVar2 == null) {
                                                        dVar2 = new v0.d(new e.c[16], 0);
                                                    }
                                                    if (cVarG != 0) {
                                                        dVar2.b(cVarG);
                                                        cVarG = 0;
                                                    }
                                                    dVar2.b(cVarB22);
                                                }
                                            }
                                            cVarB22 = cVarB22.y1();
                                            cVarG = cVarG;
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                }
                                cVarG = a2.k.g(dVar2);
                            }
                        }
                    }
                    cVarE1 = cVarE1.E1();
                }
            }
            f0VarK = f0VarK.k0();
            cVarE1 = (f0VarK == null || (aVarH0 = f0VarK.h0()) == null) ? null : aVarH0.o();
        }
    }

    public void k2(o oVar) {
        r.d(this).j(this, oVar);
    }
}
