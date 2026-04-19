package d0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
final class q implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f9288a = new q();

    private static final class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p3<Boolean> f9289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p3<Boolean> f9290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p3<Boolean> f9291c;

        public a(p3<Boolean> p3Var, p3<Boolean> p3Var2, p3<Boolean> p3Var3) {
            this.f9289a = p3Var;
            this.f9290b = p3Var2;
            this.f9291c = p3Var3;
        }

        @Override // d0.z
        public void a(n1.c cVar) {
            long jA;
            float f10;
            cVar.u1();
            if (this.f9289a.getValue().booleanValue()) {
                jA = l1.j0.f14524b.a();
                f10 = 0.3f;
            } else {
                if (!this.f9290b.getValue().booleanValue() && !this.f9291c.getValue().booleanValue()) {
                    return;
                }
                jA = l1.j0.f14524b.a();
                f10 = 0.1f;
            }
            n1.f.r0(cVar, l1.j0.u(jA, f10, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.c(), 0.0f, null, null, 0, R.styleable.AppCompatTheme_windowFixedWidthMajor, null);
        }
    }

    private q() {
    }

    @Override // d0.y
    public z a(g0.k kVar, t0.l lVar, int i10) {
        lVar.e(1683566979);
        if (t0.o.I()) {
            t0.o.U(1683566979, i10, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i11 = i10 & 14;
        p3<Boolean> p3VarA = g0.r.a(kVar, lVar, i11);
        p3<Boolean> p3VarA2 = g0.i.a(kVar, lVar, i11);
        p3<Boolean> p3VarA3 = g0.f.a(kVar, lVar, i11);
        lVar.e(1157296644);
        boolean zN = lVar.N(kVar);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = new a(p3VarA, p3VarA2, p3VarA3);
            lVar.E(objF);
        }
        lVar.K();
        a aVar = (a) objF;
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return aVar;
    }
}
