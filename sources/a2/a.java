package a2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f21a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f26f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f28h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<y1.a, Integer> f29i;

    /* JADX INFO: renamed from: a2.a$a, reason: collision with other inner class name */
    static final class C0000a extends ae.s implements zd.l<b, md.i0> {
        C0000a() {
            super(1);
        }

        public final void a(b bVar) {
            if (!bVar.j()) {
                return;
            }
            if (bVar.d().g()) {
                bVar.T();
            }
            Map map = bVar.d().f29i;
            a aVar = a.this;
            for (Map.Entry entry : map.entrySet()) {
                aVar.c((y1.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.r());
            }
            u0 u0VarR = bVar.r();
            while (true) {
                u0VarR = u0VarR.f2();
                ae.r.c(u0VarR);
                if (ae.r.b(u0VarR, a.this.f().r())) {
                    return;
                }
                Set<y1.a> setKeySet = a.this.e(u0VarR).keySet();
                a aVar2 = a.this;
                for (y1.a aVar3 : setKeySet) {
                    aVar2.c(aVar3, aVar2.i(u0VarR, aVar3), u0VarR);
                }
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(b bVar) {
            a(bVar);
            return md.i0.f15558a;
        }
    }

    private a(b bVar) {
        this.f21a = bVar;
        this.f22b = true;
        this.f29i = new HashMap();
    }

    public /* synthetic */ a(b bVar, ae.j jVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(y1.a aVar, int i10, u0 u0Var) {
        long jA;
        loop0: while (true) {
            float f10 = i10;
            jA = k1.g.a(f10, f10);
            do {
                jA = d(u0Var, jA);
                u0Var = u0Var.f2();
                ae.r.c(u0Var);
                if (ae.r.b(u0Var, this.f21a.r())) {
                    break loop0;
                }
            } while (!e(u0Var).containsKey(aVar));
            i10 = i(u0Var, aVar);
        }
        int iD = ce.c.d(aVar instanceof y1.k ? k1.f.p(jA) : k1.f.o(jA));
        Map<y1.a, Integer> map = this.f29i;
        if (map.containsKey(aVar)) {
            iD = y1.b.c(aVar, ((Number) nd.r0.f(this.f29i, aVar)).intValue(), iD);
        }
        map.put(aVar, Integer.valueOf(iD));
    }

    protected abstract long d(u0 u0Var, long j10);

    protected abstract Map<y1.a, Integer> e(u0 u0Var);

    public final b f() {
        return this.f21a;
    }

    public final boolean g() {
        return this.f22b;
    }

    public final Map<y1.a, Integer> h() {
        return this.f29i;
    }

    protected abstract int i(u0 u0Var, y1.a aVar);

    public final boolean j() {
        return this.f23c || this.f25e || this.f26f || this.f27g;
    }

    public final boolean k() {
        o();
        return this.f28h != null;
    }

    public final boolean l() {
        return this.f24d;
    }

    public final void m() {
        this.f22b = true;
        b bVarS = this.f21a.s();
        if (bVarS == null) {
            return;
        }
        if (this.f23c) {
            bVarS.V();
        } else if (this.f25e || this.f24d) {
            bVarS.requestLayout();
        }
        if (this.f26f) {
            this.f21a.V();
        }
        if (this.f27g) {
            this.f21a.requestLayout();
        }
        bVarS.d().m();
    }

    public final void n() {
        this.f29i.clear();
        this.f21a.x(new C0000a());
        this.f29i.putAll(e(this.f21a.r()));
        this.f22b = false;
    }

    public final void o() {
        b bVar;
        a aVarD;
        a aVarD2;
        if (j()) {
            bVar = this.f21a;
        } else {
            b bVarS = this.f21a.s();
            if (bVarS == null) {
                return;
            }
            bVar = bVarS.d().f28h;
            if (bVar == null || !bVar.d().j()) {
                b bVar2 = this.f28h;
                if (bVar2 == null || bVar2.d().j()) {
                    return;
                }
                b bVarS2 = bVar2.s();
                if (bVarS2 != null && (aVarD2 = bVarS2.d()) != null) {
                    aVarD2.o();
                }
                b bVarS3 = bVar2.s();
                bVar = (bVarS3 == null || (aVarD = bVarS3.d()) == null) ? null : aVarD.f28h;
            }
        }
        this.f28h = bVar;
    }

    public final void p() {
        this.f22b = true;
        this.f23c = false;
        this.f25e = false;
        this.f24d = false;
        this.f26f = false;
        this.f27g = false;
        this.f28h = null;
    }

    public final void q(boolean z10) {
        this.f25e = z10;
    }

    public final void r(boolean z10) {
        this.f27g = z10;
    }

    public final void s(boolean z10) {
        this.f26f = z10;
    }

    public final void t(boolean z10) {
        this.f24d = z10;
    }

    public final void u(boolean z10) {
        this.f23c = z10;
    }
}
