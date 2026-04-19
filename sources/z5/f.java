package z5;

import android.os.SystemClock;
import ge.o;
import k1.l;
import k1.m;
import l1.k0;
import t0.k1;
import t0.k3;
import y1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends o1.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o1.c f24233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o1.c f24234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y1.f f24235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f24236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f24237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f24238l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f24241o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final k1 f24239m = k3.e(0, null, 2, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f24240n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final k1 f24242p = k3.e(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final k1 f24243q = k3.e(null, null, 2, null);

    public f(o1.c cVar, o1.c cVar2, y1.f fVar, int i10, boolean z10, boolean z11) {
        this.f24233g = cVar;
        this.f24234h = cVar2;
        this.f24235i = fVar;
        this.f24236j = i10;
        this.f24237k = z10;
        this.f24238l = z11;
    }

    private final long n(long j10, long j11) {
        l.a aVar = l.f14359b;
        if (!(j10 == aVar.a()) && !l.k(j10)) {
            if (!(j11 == aVar.a()) && !l.k(j11)) {
                return z0.b(j10, this.f24235i.a(j10, j11));
            }
        }
        return j11;
    }

    private final long o() {
        o1.c cVar = this.f24233g;
        long jK = cVar != null ? cVar.k() : l.f14359b.b();
        o1.c cVar2 = this.f24234h;
        long jK2 = cVar2 != null ? cVar2.k() : l.f14359b.b();
        l.a aVar = l.f14359b;
        boolean z10 = jK != aVar.a();
        boolean z11 = jK2 != aVar.a();
        if (z10 && z11) {
            return m.a(Math.max(l.i(jK), l.i(jK2)), Math.max(l.g(jK), l.g(jK2)));
        }
        if (this.f24238l) {
            if (z10) {
                return jK;
            }
            if (z11) {
                return jK2;
            }
        }
        return aVar.a();
    }

    private final void p(n1.f fVar, o1.c cVar, float f10) {
        if (cVar == null || f10 <= 0.0f) {
            return;
        }
        long jC = fVar.c();
        long jN = n(cVar.k(), jC);
        if ((jC == l.f14359b.a()) || l.k(jC)) {
            cVar.j(fVar, jN, f10, q());
            return;
        }
        float f11 = 2;
        float fI = (l.i(jC) - l.i(jN)) / f11;
        float fG = (l.g(jC) - l.g(jN)) / f11;
        fVar.M0().a().g(fI, fG, fI, fG);
        cVar.j(fVar, jN, f10, q());
        float f12 = -fI;
        float f13 = -fG;
        fVar.M0().a().g(f12, f13, f12, f13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final k0 q() {
        return (k0) this.f24243q.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int r() {
        return ((Number) this.f24239m.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float s() {
        return ((Number) this.f24242p.getValue()).floatValue();
    }

    private final void t(k0 k0Var) {
        this.f24243q.setValue(k0Var);
    }

    private final void u(int i10) {
        this.f24239m.setValue(Integer.valueOf(i10));
    }

    private final void v(float f10) {
        this.f24242p.setValue(Float.valueOf(f10));
    }

    @Override // o1.c
    protected boolean a(float f10) {
        v(f10);
        return true;
    }

    @Override // o1.c
    protected boolean e(k0 k0Var) {
        t(k0Var);
        return true;
    }

    @Override // o1.c
    public long k() {
        return o();
    }

    @Override // o1.c
    protected void m(n1.f fVar) {
        if (this.f24241o) {
            p(fVar, this.f24234h, s());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f24240n == -1) {
            this.f24240n = jUptimeMillis;
        }
        float f10 = (jUptimeMillis - this.f24240n) / this.f24236j;
        float fK = o.k(f10, 0.0f, 1.0f) * s();
        float fS = this.f24237k ? s() - fK : s();
        this.f24241o = f10 >= 1.0f;
        p(fVar, this.f24233g, fS);
        p(fVar, this.f24234h, fK);
        if (this.f24241o) {
            this.f24233g = null;
        } else {
            u(r() + 1);
        }
    }
}
