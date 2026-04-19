package v1;

import a2.j1;
import a2.r1;
import a2.s1;
import a2.t1;
import androidx.compose.ui.e;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
public final class v extends e.c implements s1, j1, a2.h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f22005n = "androidx.compose.ui.input.pointer.PointerHoverIcon";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private w f22006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f22007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f22008q;

    static final class a extends ae.s implements zd.l<v, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ae.h0<v> f22009a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ae.h0<v> h0Var) {
            super(1);
            this.f22009a = h0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(v vVar) {
            if ((this.f22009a.f712a == null && vVar.f22008q) || (this.f22009a.f712a != null && vVar.i2() && vVar.f22008q)) {
                this.f22009a.f712a = vVar;
            }
            return Boolean.TRUE;
        }
    }

    static final class b extends ae.s implements zd.l<v, r1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ae.d0 f22010a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ae.d0 d0Var) {
            super(1);
            this.f22010a = d0Var;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r1 invoke(v vVar) {
            if (!vVar.f22008q) {
                return r1.ContinueTraversal;
            }
            this.f22010a.f699a = false;
            return r1.CancelTraversal;
        }
    }

    static final class c extends ae.s implements zd.l<v, r1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ae.h0<v> f22011a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ae.h0<v> h0Var) {
            super(1);
            this.f22011a = h0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r1 invoke(v vVar) {
            r1 r1Var = r1.ContinueTraversal;
            if (!vVar.f22008q) {
                return r1Var;
            }
            this.f22011a.f712a = vVar;
            return vVar.i2() ? r1.SkipSubtreeAndContinueTraversal : r1Var;
        }
    }

    static final class d extends ae.s implements zd.l<v, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ae.h0<v> f22012a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ae.h0<v> h0Var) {
            super(1);
            this.f22012a = h0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(v vVar) {
            if (vVar.i2() && vVar.f22008q) {
                this.f22012a.f712a = vVar;
            }
            return Boolean.TRUE;
        }
    }

    public v(w wVar, boolean z10) {
        this.f22006o = wVar;
        this.f22007p = z10;
    }

    private final void b2() {
        y yVarJ2 = j2();
        if (yVarJ2 != null) {
            yVarJ2.a(null);
        }
    }

    private final void c2() {
        w wVar;
        v vVarH2 = h2();
        if (vVarH2 == null || (wVar = vVarH2.f22006o) == null) {
            wVar = this.f22006o;
        }
        y yVarJ2 = j2();
        if (yVarJ2 != null) {
            yVarJ2.a(wVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d2() {
        md.i0 i0Var;
        ae.h0 h0Var = new ae.h0();
        t1.a(this, new a(h0Var));
        v vVar = (v) h0Var.f712a;
        if (vVar != null) {
            vVar.c2();
            i0Var = md.i0.f15558a;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            b2();
        }
    }

    private final void e2() {
        v vVarG2;
        if (this.f22008q) {
            if (this.f22007p || (vVarG2 = g2()) == null) {
                vVarG2 = this;
            }
            vVarG2.c2();
        }
    }

    private final void f2() {
        ae.d0 d0Var = new ae.d0();
        d0Var.f699a = true;
        if (!this.f22007p) {
            t1.d(this, new b(d0Var));
        }
        if (d0Var.f699a) {
            c2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final v g2() {
        ae.h0 h0Var = new ae.h0();
        t1.d(this, new c(h0Var));
        return (v) h0Var.f712a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final v h2() {
        ae.h0 h0Var = new ae.h0();
        t1.a(this, new d(h0Var));
        return (v) h0Var.f712a;
    }

    private final y j2() {
        return (y) a2.i.a(this, b2.k0.g());
    }

    @Override // androidx.compose.ui.e.c
    public void L1() {
        this.f22008q = false;
        d2();
        super.L1();
    }

    @Override // a2.j1
    public void Z(p pVar, r rVar, long j10) {
        if (rVar == r.Main) {
            int iE = pVar.e();
            t.a aVar = t.f21997a;
            if (t.i(iE, aVar.a())) {
                this.f22008q = true;
                f2();
            } else if (t.i(pVar.e(), aVar.b())) {
                this.f22008q = false;
                d2();
            }
        }
    }

    @Override // a2.j1
    public void c0() {
    }

    public final boolean i2() {
        return this.f22007p;
    }

    @Override // a2.s1
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public String I() {
        return this.f22005n;
    }

    public final void l2(w wVar) {
        if (ae.r.b(this.f22006o, wVar)) {
            return;
        }
        this.f22006o = wVar;
        if (this.f22008q) {
            f2();
        }
    }

    public final void m2(boolean z10) {
        if (this.f22007p != z10) {
            this.f22007p = z10;
            if (z10) {
                if (this.f22008q) {
                    c2();
                }
            } else if (this.f22008q) {
                e2();
            }
        }
    }
}
