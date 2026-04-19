package t0;

import le.a2;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j0 f20816a = new j0();

    public static final void a(Object obj, Object obj2, zd.l<? super j0, ? extends i0> lVar, l lVar2, int i10) {
        lVar2.e(1429097729);
        if (o.I()) {
            o.U(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        lVar2.e(511388516);
        boolean zN = lVar2.N(obj) | lVar2.N(obj2);
        Object objF = lVar2.f();
        if (zN || objF == l.f20813a.a()) {
            lVar2.E(new h0(lVar));
        }
        lVar2.K();
        if (o.I()) {
            o.T();
        }
        lVar2.K();
    }

    public static final void b(Object obj, zd.l<? super j0, ? extends i0> lVar, l lVar2, int i10) {
        lVar2.e(-1371986847);
        if (o.I()) {
            o.U(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        lVar2.e(1157296644);
        boolean zN = lVar2.N(obj);
        Object objF = lVar2.f();
        if (zN || objF == l.f20813a.a()) {
            lVar2.E(new h0(lVar));
        }
        lVar2.K();
        if (o.I()) {
            o.T();
        }
        lVar2.K();
    }

    public static final void c(Object obj, Object obj2, zd.p<? super le.n0, ? super qd.d<? super md.i0>, ? extends Object> pVar, l lVar, int i10) {
        lVar.e(590241125);
        if (o.I()) {
            o.U(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        qd.g gVarZ = lVar.z();
        lVar.e(511388516);
        boolean zN = lVar.N(obj) | lVar.N(obj2);
        Object objF = lVar.f();
        if (zN || objF == l.f20813a.a()) {
            lVar.E(new y0(gVarZ, pVar));
        }
        lVar.K();
        if (o.I()) {
            o.T();
        }
        lVar.K();
    }

    public static final void d(Object obj, zd.p<? super le.n0, ? super qd.d<? super md.i0>, ? extends Object> pVar, l lVar, int i10) {
        lVar.e(1179185413);
        if (o.I()) {
            o.U(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        qd.g gVarZ = lVar.z();
        lVar.e(1157296644);
        boolean zN = lVar.N(obj);
        Object objF = lVar.f();
        if (zN || objF == l.f20813a.a()) {
            lVar.E(new y0(gVarZ, pVar));
        }
        lVar.K();
        if (o.I()) {
            o.T();
        }
        lVar.K();
    }

    public static final void e(zd.a<md.i0> aVar, l lVar, int i10) {
        if (o.I()) {
            o.U(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        lVar.w(aVar);
        if (o.I()) {
            o.T();
        }
    }

    public static final le.n0 g(qd.g gVar, l lVar) {
        qd.g gVarPlus;
        a2.b bVar = le.a2.R;
        if (gVar.get(bVar) != null) {
            le.a0 a0VarB = le.g2.b(null, 1, null);
            a0VarB.a(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            gVarPlus = a0VarB;
        } else {
            qd.g gVarZ = lVar.z();
            gVarPlus = gVarZ.plus(le.e2.a((le.a2) gVarZ.get(bVar))).plus(gVar);
        }
        return le.o0.a(gVarPlus);
    }
}
