package androidx.compose.foundation;

import a2.q;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import l1.b1;
import l1.c1;
import l1.j0;
import l1.m1;
import l1.t1;
import l1.z;
import w2.r;

/* JADX INFO: loaded from: classes.dex */
final class d extends e.c implements q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f2237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private z f2238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f2239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private t1 f2240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private k1.l f2241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private r f2242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b1 f2243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private t1 f2244u;

    private d(long j10, z zVar, float f10, t1 t1Var) {
        this.f2237n = j10;
        this.f2238o = zVar;
        this.f2239p = f10;
        this.f2240q = t1Var;
    }

    public /* synthetic */ d(long j10, z zVar, float f10, t1 t1Var, ae.j jVar) {
        this(j10, zVar, f10, t1Var);
    }

    private final void a2(n1.c cVar) {
        b1 b1VarMo253createOutlinePq9zytI;
        if (k1.l.e(cVar.c(), this.f2241r) && cVar.getLayoutDirection() == this.f2242s && ae.r.b(this.f2244u, this.f2240q)) {
            b1VarMo253createOutlinePq9zytI = this.f2243t;
            ae.r.c(b1VarMo253createOutlinePq9zytI);
        } else {
            b1VarMo253createOutlinePq9zytI = this.f2240q.mo253createOutlinePq9zytI(cVar.c(), cVar.getLayoutDirection(), cVar);
        }
        if (!j0.w(this.f2237n, j0.f14524b.j())) {
            c1.d(cVar, b1VarMo253createOutlinePq9zytI, this.f2237n, (60 & 4) != 0 ? 1.0f : 0.0f, (60 & 8) != 0 ? n1.j.f15736a : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? n1.f.S.a() : 0);
        }
        z zVar = this.f2238o;
        if (zVar != null) {
            c1.c(cVar, b1VarMo253createOutlinePq9zytI, zVar, this.f2239p, null, null, 0, 56, null);
        }
        this.f2243t = b1VarMo253createOutlinePq9zytI;
        this.f2241r = k1.l.c(cVar.c());
        this.f2242s = cVar.getLayoutDirection();
        this.f2244u = this.f2240q;
    }

    private final void b2(n1.c cVar) {
        if (!j0.w(this.f2237n, j0.f14524b.j())) {
            n1.f.r0(cVar, this.f2237n, 0L, 0L, 0.0f, null, null, 0, R.styleable.AppCompatTheme_windowNoTitle, null);
        }
        z zVar = this.f2238o;
        if (zVar != null) {
            n1.f.H0(cVar, zVar, 0L, 0L, this.f2239p, null, null, 0, R.styleable.AppCompatTheme_windowActionBarOverlay, null);
        }
    }

    @Override // a2.q
    public void A(n1.c cVar) {
        if (this.f2240q == m1.a()) {
            b2(cVar);
        } else {
            a2(cVar);
        }
        cVar.u1();
    }

    public final void b(float f10) {
        this.f2239p = f10;
    }

    public final void c2(z zVar) {
        this.f2238o = zVar;
    }

    public final void d1(t1 t1Var) {
        this.f2240q = t1Var;
    }

    public final void d2(long j10) {
        this.f2237n = j10;
    }
}
