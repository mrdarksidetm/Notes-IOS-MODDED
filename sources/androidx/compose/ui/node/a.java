package androidx.compose.ui.node;

import a2.a0;
import a2.b0;
import a2.c;
import a2.f0;
import a2.k;
import a2.o;
import a2.q1;
import a2.r0;
import a2.t0;
import a2.u0;
import a2.v;
import a2.w0;
import a2.x0;
import ae.r;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.amazon.a.a.o.b.f;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f2827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f2828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u0 f2829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e.c f2830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e.c f2831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d<e.b> f2832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d<e.b> f2833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C0056a f2834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f2835i;

    /* JADX INFO: renamed from: androidx.compose.ui.node.a$a, reason: collision with other inner class name */
    private final class C0056a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e.c f2836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d<e.b> f2838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d<e.b> f2839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2840e;

        public C0056a(e.c cVar, int i10, d<e.b> dVar, d<e.b> dVar2, boolean z10) {
            this.f2836a = cVar;
            this.f2837b = i10;
            this.f2838c = dVar;
            this.f2839d = dVar2;
            this.f2840e = z10;
        }

        @Override // a2.o
        public void a(int i10, int i11) {
            e.c cVarY1 = this.f2836a.y1();
            r.c(cVarY1);
            b bVar = a.this.f2835i;
            if (bVar != null) {
                bVar.b(i11, this.f2838c.n()[this.f2837b + i11], cVarY1);
            }
            if ((w0.a(2) & cVarY1.C1()) != 0) {
                u0 u0VarZ1 = cVarY1.z1();
                r.c(u0VarZ1);
                u0 u0VarF2 = u0VarZ1.f2();
                u0 u0VarE2 = u0VarZ1.e2();
                r.c(u0VarE2);
                if (u0VarF2 != null) {
                    u0VarF2.G2(u0VarE2);
                }
                u0VarE2.H2(u0VarF2);
                a.this.v(this.f2836a, u0VarE2);
            }
            this.f2836a = a.this.h(cVarY1);
        }

        @Override // a2.o
        public boolean b(int i10, int i11) {
            return androidx.compose.ui.node.b.d(this.f2838c.n()[this.f2837b + i10], this.f2839d.n()[this.f2837b + i11]) != 0;
        }

        @Override // a2.o
        public void c(int i10, int i11) {
            e.c cVarY1 = this.f2836a.y1();
            r.c(cVarY1);
            this.f2836a = cVarY1;
            d<e.b> dVar = this.f2838c;
            e.b bVar = dVar.n()[this.f2837b + i10];
            d<e.b> dVar2 = this.f2839d;
            e.b bVar2 = dVar2.n()[this.f2837b + i11];
            if (r.b(bVar, bVar2)) {
                b bVar3 = a.this.f2835i;
                if (bVar3 != null) {
                    int i12 = this.f2837b;
                    bVar3.c(i12 + i10, i12 + i11, bVar, bVar2, this.f2836a);
                    return;
                }
                return;
            }
            a.this.F(bVar, bVar2, this.f2836a);
            b bVar4 = a.this.f2835i;
            if (bVar4 != null) {
                int i13 = this.f2837b;
                bVar4.d(i13 + i10, i13 + i11, bVar, bVar2, this.f2836a);
            }
        }

        @Override // a2.o
        public void d(int i10) {
            int i11 = this.f2837b + i10;
            e.c cVar = this.f2836a;
            this.f2836a = a.this.g(this.f2839d.n()[i11], cVar);
            b bVar = a.this.f2835i;
            if (bVar != null) {
                bVar.a(i11, i11, this.f2839d.n()[i11], cVar, this.f2836a);
            }
            if (!this.f2840e) {
                this.f2836a.T1(true);
                return;
            }
            e.c cVarY1 = this.f2836a.y1();
            r.c(cVarY1);
            u0 u0VarZ1 = cVarY1.z1();
            r.c(u0VarZ1);
            a0 a0VarD = k.d(this.f2836a);
            if (a0VarD != null) {
                b0 b0Var = new b0(a.this.m(), a0VarD);
                this.f2836a.Z1(b0Var);
                a.this.v(this.f2836a, b0Var);
                b0Var.H2(u0VarZ1.f2());
                b0Var.G2(u0VarZ1);
                u0VarZ1.H2(b0Var);
            } else {
                this.f2836a.Z1(u0VarZ1);
            }
            this.f2836a.I1();
            this.f2836a.O1();
            x0.a(this.f2836a);
        }

        public final void e(d<e.b> dVar) {
            this.f2839d = dVar;
        }

        public final void f(d<e.b> dVar) {
            this.f2838c = dVar;
        }

        public final void g(e.c cVar) {
            this.f2836a = cVar;
        }

        public final void h(int i10) {
            this.f2837b = i10;
        }

        public final void i(boolean z10) {
            this.f2840e = z10;
        }
    }

    public interface b {
        void a(int i10, int i11, e.b bVar, e.c cVar, e.c cVar2);

        void b(int i10, e.b bVar, e.c cVar);

        void c(int i10, int i11, e.b bVar, e.b bVar2, e.c cVar);

        void d(int i10, int i11, e.b bVar, e.b bVar2, e.c cVar);

        void e(int i10, e.b bVar, e.b bVar2, e.c cVar);
    }

    public a(f0 f0Var) {
        this.f2827a = f0Var;
        v vVar = new v(f0Var);
        this.f2828b = vVar;
        this.f2829c = vVar;
        q1 q1VarS2 = vVar.d2();
        this.f2830d = q1VarS2;
        this.f2831e = q1VarS2;
    }

    private final void A(int i10, d<e.b> dVar, d<e.b> dVar2, e.c cVar, boolean z10) {
        t0.e(dVar.o() - i10, dVar2.o() - i10, j(cVar, i10, dVar, dVar2, z10));
        B();
    }

    private final void B() {
        int iC1 = 0;
        for (e.c cVarE1 = this.f2830d.E1(); cVarE1 != null && cVarE1 != androidx.compose.ui.node.b.f2842a; cVarE1 = cVarE1.E1()) {
            iC1 |= cVarE1.C1();
            cVarE1.Q1(iC1);
        }
    }

    private final e.c D(e.c cVar) {
        if (!(cVar == androidx.compose.ui.node.b.f2842a)) {
            throw new IllegalStateException("trimChain called on already trimmed chain".toString());
        }
        e.c cVarY1 = androidx.compose.ui.node.b.f2842a.y1();
        if (cVarY1 == null) {
            cVarY1 = this.f2830d;
        }
        cVarY1.W1(null);
        androidx.compose.ui.node.b.f2842a.S1(null);
        androidx.compose.ui.node.b.f2842a.Q1(-1);
        androidx.compose.ui.node.b.f2842a.Z1(null);
        if (cVarY1 != androidx.compose.ui.node.b.f2842a) {
            return cVarY1;
        }
        throw new IllegalStateException("trimChain did not update the head".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r4.H1() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        a2.x0.e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r4.X1(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r4.H1() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(androidx.compose.ui.e.b r2, androidx.compose.ui.e.b r3, androidx.compose.ui.e.c r4) {
        /*
            r1 = this;
            boolean r2 = r2 instanceof a2.r0
            r0 = 1
            if (r2 == 0) goto L15
            boolean r2 = r3 instanceof a2.r0
            if (r2 == 0) goto L15
            a2.r0 r3 = (a2.r0) r3
            androidx.compose.ui.node.b.c(r3, r4)
            boolean r2 = r4.H1()
            if (r2 == 0) goto L29
            goto L25
        L15:
            boolean r2 = r4 instanceof a2.c
            if (r2 == 0) goto L2d
            r2 = r4
            a2.c r2 = (a2.c) r2
            r2.f2(r3)
            boolean r2 = r4.H1()
            if (r2 == 0) goto L29
        L25:
            a2.x0.e(r4)
            goto L2c
        L29:
            r4.X1(r0)
        L2c:
            return
        L2d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unknown Modifier.Node type"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.a.F(androidx.compose.ui.e$b, androidx.compose.ui.e$b, androidx.compose.ui.e$c):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.c g(e.b bVar, e.c cVar) {
        e.c cVar2;
        if (bVar instanceof r0) {
            cVar2 = ((r0) bVar).a();
            cVar2.U1(x0.h(cVar2));
        } else {
            cVar2 = new c(bVar);
        }
        if (!(!cVar2.H1())) {
            throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
        }
        cVar2.T1(true);
        return r(cVar2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.c h(e.c cVar) {
        if (cVar.H1()) {
            x0.d(cVar);
            cVar.P1();
            cVar.J1();
        }
        return w(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        return this.f2831e.x1();
    }

    private final C0056a j(e.c cVar, int i10, d<e.b> dVar, d<e.b> dVar2, boolean z10) {
        C0056a c0056a = this.f2834h;
        if (c0056a == null) {
            C0056a c0056a2 = new C0056a(cVar, i10, dVar, dVar2, z10);
            this.f2834h = c0056a2;
            return c0056a2;
        }
        c0056a.g(cVar);
        c0056a.h(i10);
        c0056a.f(dVar);
        c0056a.e(dVar2);
        c0056a.i(z10);
        return c0056a;
    }

    private final e.c r(e.c cVar, e.c cVar2) {
        e.c cVarY1 = cVar2.y1();
        if (cVarY1 != null) {
            cVarY1.W1(cVar);
            cVar.S1(cVarY1);
        }
        cVar2.S1(cVar);
        cVar.W1(cVar2);
        return cVar;
    }

    private final e.c u() {
        if (!(this.f2831e != androidx.compose.ui.node.b.f2842a)) {
            throw new IllegalStateException("padChain called on already padded chain".toString());
        }
        e.c cVar = this.f2831e;
        cVar.W1(androidx.compose.ui.node.b.f2842a);
        androidx.compose.ui.node.b.f2842a.S1(cVar);
        return androidx.compose.ui.node.b.f2842a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(e.c cVar, u0 u0Var) {
        while (true) {
            cVar = cVar.E1();
            if (cVar == null) {
                return;
            }
            if (cVar == androidx.compose.ui.node.b.f2842a) {
                f0 f0VarK0 = this.f2827a.k0();
                u0Var.H2(f0VarK0 != null ? f0VarK0.N() : null);
                this.f2829c = u0Var;
                return;
            } else {
                if ((w0.a(2) & cVar.C1()) != 0) {
                    return;
                } else {
                    cVar.Z1(u0Var);
                }
            }
        }
    }

    private final e.c w(e.c cVar) {
        e.c cVarY1 = cVar.y1();
        e.c cVarE1 = cVar.E1();
        if (cVarY1 != null) {
            cVarY1.W1(cVarE1);
            cVar.S1(null);
        }
        if (cVarE1 != null) {
            cVarE1.S1(cVarY1);
            cVar.W1(null);
        }
        r.c(cVarE1);
        return cVarE1;
    }

    public final void C() {
        u0 b0Var;
        u0 u0Var = this.f2828b;
        e.c cVarE1 = this.f2830d;
        while (true) {
            cVarE1 = cVarE1.E1();
            if (cVarE1 == null) {
                break;
            }
            a0 a0VarD = k.d(cVarE1);
            if (a0VarD != null) {
                if (cVarE1.z1() != null) {
                    u0 u0VarZ1 = cVarE1.z1();
                    r.d(u0VarZ1, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    b0Var = (b0) u0VarZ1;
                    a0 a0VarU2 = b0Var.U2();
                    b0Var.W2(a0VarD);
                    if (a0VarU2 != cVarE1) {
                        b0Var.t2();
                    }
                } else {
                    b0Var = new b0(this.f2827a, a0VarD);
                    cVarE1.Z1(b0Var);
                }
                u0Var.H2(b0Var);
                b0Var.G2(u0Var);
                u0Var = b0Var;
            } else {
                cVarE1.Z1(u0Var);
            }
        }
        f0 f0VarK0 = this.f2827a.k0();
        u0Var.H2(f0VarK0 != null ? f0VarK0.N() : null);
        this.f2829c = u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(androidx.compose.ui.e r19) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.a.E(androidx.compose.ui.e):void");
    }

    public final e.c k() {
        return this.f2831e;
    }

    public final v l() {
        return this.f2828b;
    }

    public final f0 m() {
        return this.f2827a;
    }

    public final u0 n() {
        return this.f2829c;
    }

    public final e.c o() {
        return this.f2830d;
    }

    public final boolean p(int i10) {
        return (i10 & i()) != 0;
    }

    public final boolean q(int i10) {
        return (i10 & i()) != 0;
    }

    public final void s() {
        for (e.c cVarK = k(); cVarK != null; cVarK = cVarK.y1()) {
            cVarK.I1();
        }
    }

    public final void t() {
        for (e.c cVarO = o(); cVarO != null; cVarO = cVarO.E1()) {
            if (cVarO.H1()) {
                cVarO.J1();
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.f2831e == this.f2830d) {
            sb2.append("]");
            break;
        }
        for (e.c cVarK = k(); cVarK != null && cVarK != o(); cVarK = cVarK.y1()) {
            sb2.append(String.valueOf(cVarK));
            if (cVarK.y1() == this.f2830d) {
                sb2.append("]");
                break;
            }
            sb2.append(f.f7478a);
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void x() {
        int iO;
        for (e.c cVarO = o(); cVarO != null; cVarO = cVarO.E1()) {
            if (cVarO.H1()) {
                cVarO.N1();
            }
        }
        d<e.b> dVar = this.f2832f;
        if (dVar != null && (iO = dVar.o()) > 0) {
            int i10 = 0;
            e.b[] bVarArrN = dVar.n();
            do {
                e.b bVar = bVarArrN[i10];
                if (bVar instanceof SuspendPointerInputElement) {
                    dVar.A(i10, new ForceUpdateElement((r0) bVar));
                }
                i10++;
            } while (i10 < iO);
        }
        z();
        t();
    }

    public final void y() {
        for (e.c cVarK = k(); cVarK != null; cVarK = cVarK.y1()) {
            cVarK.O1();
            if (cVarK.B1()) {
                x0.a(cVarK);
            }
            if (cVarK.G1()) {
                x0.e(cVarK);
            }
            cVarK.T1(false);
            cVarK.X1(false);
        }
    }

    public final void z() {
        for (e.c cVarO = o(); cVarO != null; cVarO = cVarO.E1()) {
            if (cVarO.H1()) {
                cVarO.P1();
            }
        }
    }
}
