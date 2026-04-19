package r2;

import android.text.TextPaint;
import l1.d1;
import l1.e1;
import l1.j0;
import l1.l0;
import l1.s1;
import u2.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1 f19161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2.j f19162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s1 f19163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n1.g f19164d;

    public g(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.f19161a = l1.j.b(this);
        this.f19162b = u2.j.f21569b.b();
        this.f19163c = s1.f14570d.a();
    }

    public final int a() {
        return this.f19161a.x();
    }

    public final void b(int i10) {
        this.f19161a.f(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if ((r9 != k1.l.f14359b.a()) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(l1.z r8, long r9, float r11) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof l1.u1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            r0 = r8
            l1.u1 r0 = (l1.u1) r0
            long r3 = r0.a()
            l1.j0$a r0 = l1.j0.f14524b
            long r5 = r0.j()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 != 0) goto L2e
        L1c:
            boolean r0 = r8 instanceof l1.q1
            if (r0 == 0) goto L48
            k1.l$a r0 = k1.l.f14359b
            long r3 = r0.a()
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            if (r1 == 0) goto L48
        L2e:
            l1.d1 r0 = r7.f19161a
            boolean r1 = java.lang.Float.isNaN(r11)
            if (r1 == 0) goto L3d
            l1.d1 r11 = r7.f19161a
            float r11 = r11.a()
            goto L44
        L3d:
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r11 = ge.m.k(r11, r1, r2)
        L44:
            r8.mo292applyToPq9zytI(r9, r0, r11)
            goto L50
        L48:
            if (r8 != 0) goto L50
            l1.d1 r8 = r7.f19161a
            r9 = 0
            r8.k(r9)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.g.c(l1.z, long, float):void");
    }

    public final void d(long j10) {
        if (j10 != j0.f14524b.j()) {
            this.f19161a.t(j10);
            this.f19161a.k(null);
        }
    }

    public final void e(n1.g gVar) {
        if (gVar == null || ae.r.b(this.f19164d, gVar)) {
            return;
        }
        this.f19164d = gVar;
        if (ae.r.b(gVar, n1.j.f15736a)) {
            this.f19161a.s(e1.f14503a.a());
            return;
        }
        if (gVar instanceof n1.k) {
            this.f19161a.s(e1.f14503a.b());
            n1.k kVar = (n1.k) gVar;
            this.f19161a.v(kVar.f());
            this.f19161a.m(kVar.d());
            this.f19161a.q(kVar.c());
            this.f19161a.e(kVar.b());
            this.f19161a.r(kVar.e());
        }
    }

    public final void f(s1 s1Var) {
        if (s1Var == null || ae.r.b(this.f19163c, s1Var)) {
            return;
        }
        this.f19163c = s1Var;
        if (ae.r.b(s1Var, s1.f14570d.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(s2.e.b(this.f19163c.b()), k1.f.o(this.f19163c.d()), k1.f.p(this.f19163c.d()), l0.i(this.f19163c.c()));
        }
    }

    public final void g(u2.j jVar) {
        if (jVar == null || ae.r.b(this.f19162b, jVar)) {
            return;
        }
        this.f19162b = jVar;
        j.a aVar = u2.j.f21569b;
        setUnderlineText(jVar.d(aVar.c()));
        setStrikeThruText(this.f19162b.d(aVar.a()));
    }
}
