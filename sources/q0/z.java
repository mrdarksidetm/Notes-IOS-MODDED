package q0;

import t0.e2;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p0.f f18930a = new p0.f(0.16f, 0.12f, 0.08f, 0.12f);

    static final class a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r0 f18931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18932b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(r0 r0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
            super(2);
            this.f18931a = r0Var;
            this.f18932b = pVar;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            if ((i10 & 3) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (t0.o.I()) {
                t0.o.U(-1066563262, i10, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:71)");
            }
            q0.a(this.f18931a.b(), this.f18932b, lVar, 0);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f18933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0 f18934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r0 f18935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f18937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f18938f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h hVar, k0 k0Var, r0 r0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar, int i10, int i11) {
            super(2);
            this.f18933a = hVar;
            this.f18934b = k0Var;
            this.f18935c = r0Var;
            this.f18936d = pVar;
            this.f18937e = i10;
            this.f18938f = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            z.a(this.f18933a, this.f18934b, this.f18935c, this.f18936d, lVar, e2.a(this.f18937e | 1), this.f18938f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(q0.h r18, q0.k0 r19, q0.r0 r20, zd.p<? super t0.l, ? super java.lang.Integer, md.i0> r21, t0.l r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.z.a(q0.h, q0.k0, q0.r0, zd.p, t0.l, int, int):void");
    }

    public static final o0.l c(h hVar, t0.l lVar, int i10) {
        lVar.e(1866455512);
        if (t0.o.I()) {
            t0.o.U(1866455512, i10, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:126)");
        }
        long jW = hVar.w();
        lVar.e(-314518050);
        boolean zI = lVar.i(jW);
        Object objF = lVar.f();
        if (zI || objF == t0.l.f20813a.a()) {
            objF = new o0.l(jW, l1.j0.u(jW, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            lVar.E(objF);
        }
        o0.l lVar2 = (o0.l) objF;
        lVar.K();
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return lVar2;
    }
}
