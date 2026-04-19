package i0;

import d1.k;
import h0.b;
import i0.g0;
import java.util.ArrayList;
import java.util.List;
import le.n0;
import nd.r0;
import t0.e2;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    static final class a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f12184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f12185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0 f12186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h0.y f12187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f12189f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e0.p f12190g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f12191h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ b.m f12192i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ b.e f12193j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ zd.l<b0, md.i0> f12194k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12195l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f12196m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f12197n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.e eVar, h0 h0Var, e0 e0Var, h0.y yVar, boolean z10, boolean z11, e0.p pVar, boolean z12, b.m mVar, b.e eVar2, zd.l<? super b0, md.i0> lVar, int i10, int i11, int i12) {
            super(2);
            this.f12184a = eVar;
            this.f12185b = h0Var;
            this.f12186c = e0Var;
            this.f12187d = yVar;
            this.f12188e = z10;
            this.f12189f = z11;
            this.f12190g = pVar;
            this.f12191h = z12;
            this.f12192i = mVar;
            this.f12193j = eVar2;
            this.f12194k = lVar;
            this.f12195l = i10;
            this.f12196m = i11;
            this.f12197n = i12;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            t.a(this.f12184a, this.f12185b, this.f12186c, this.f12187d, this.f12188e, this.f12189f, this.f12190g, this.f12191h, this.f12192i, this.f12193j, this.f12194k, lVar, e2.a(this.f12195l | 1), e2.a(this.f12196m), this.f12197n);
        }
    }

    static final class b extends ae.s implements zd.p<j0.v, w2.b, w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f12198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.y f12199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.a<n> f12201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e0 f12202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0 f12203f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b.m f12204g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b.e f12205h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ n0 f12206i;

        static final class a extends ae.s implements zd.l<Integer, ArrayList<md.s<? extends Integer, ? extends w2.b>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g0 f12207a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f12208b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var, d dVar) {
                super(1);
                this.f12207a = g0Var;
                this.f12208b = dVar;
            }

            public final ArrayList<md.s<Integer, w2.b>> a(int i10) {
                g0.c cVarC = this.f12207a.c(i10);
                int iA = cVarC.a();
                ArrayList<md.s<Integer, w2.b>> arrayList = new ArrayList<>(cVarC.b().size());
                List<i0.b> listB = cVarC.b();
                d dVar = this.f12208b;
                int size = listB.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int iD = i0.b.d(listB.get(i12).g());
                    arrayList.add(md.x.a(Integer.valueOf(iA), w2.b.b(dVar.a(i11, iD))));
                    iA++;
                    i11 += iD;
                }
                return arrayList;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ ArrayList<md.s<? extends Integer, ? extends w2.b>> invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* JADX INFO: renamed from: i0.t$b$b, reason: collision with other inner class name */
        static final class C0295b extends ae.s implements zd.q<Integer, Integer, zd.l<? super t0.a, ? extends md.i0>, y1.f0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0.v f12209a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f12210b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f12211c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f12212d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0295b(j0.v vVar, long j10, int i10, int i11) {
                super(3);
                this.f12209a = vVar;
                this.f12210b = j10;
                this.f12211c = i10;
                this.f12212d = i11;
            }

            public final y1.f0 a(int i10, int i11, zd.l<? super t0.a, md.i0> lVar) {
                return this.f12209a.J0(w2.c.g(this.f12210b, i10 + this.f12211c), w2.c.f(this.f12210b, i11 + this.f12212d), r0.e(), lVar);
            }

            @Override // zd.q
            public /* bridge */ /* synthetic */ y1.f0 invoke(Integer num, Integer num2, zd.l<? super t0.a, ? extends md.i0> lVar) {
                return a(num.intValue(), num2.intValue(), lVar);
            }
        }

        public static final class c extends y {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ j0.v f12213d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ h0 f12214e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f12215f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f12216g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f12217h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f12218i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ long f12219j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(n nVar, j0.v vVar, int i10, h0 h0Var, boolean z10, boolean z11, int i11, int i12, long j10) {
                super(nVar, vVar, i10);
                this.f12213d = vVar;
                this.f12214e = h0Var;
                this.f12215f = z10;
                this.f12216g = z11;
                this.f12217h = i11;
                this.f12218i = i12;
                this.f12219j = j10;
            }

            @Override // i0.y
            public x a(int i10, Object obj, Object obj2, int i11, int i12, List<? extends t0> list) {
                return new x(i10, obj, this.f12215f, i11, i12, this.f12216g, this.f12213d.getLayoutDirection(), this.f12217h, this.f12218i, list, this.f12219j, obj2, this.f12214e.s(), null);
            }
        }

        public static final class d extends a0 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f12220g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ d0 f12221h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(boolean z10, d0 d0Var, int i10, int i11, c cVar, g0 g0Var) {
                super(z10, d0Var, i10, i11, cVar, g0Var);
                this.f12220g = z10;
                this.f12221h = d0Var;
            }

            @Override // i0.a0
            public z b(int i10, x[] xVarArr, List<i0.b> list, int i11) {
                return new z(i10, xVarArr, this.f12221h, list, this.f12220g, i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, h0.y yVar, boolean z11, zd.a<? extends n> aVar, e0 e0Var, h0 h0Var, b.m mVar, b.e eVar, n0 n0Var) {
            super(2);
            this.f12198a = z10;
            this.f12199b = yVar;
            this.f12200c = z11;
            this.f12201d = aVar;
            this.f12202e = e0Var;
            this.f12203f = h0Var;
            this.f12204g = mVar;
            this.f12205h = eVar;
            this.f12206i = n0Var;
        }

        public final w a(j0.v vVar, long j10) {
            float fA;
            int iN;
            int iD;
            d0.l.a(j10, this.f12198a ? e0.r.Vertical : e0.r.Horizontal);
            int iA1 = vVar.a1(this.f12198a ? this.f12199b.d(vVar.getLayoutDirection()) : androidx.compose.foundation.layout.m.g(this.f12199b, vVar.getLayoutDirection()));
            int iA12 = vVar.a1(this.f12198a ? this.f12199b.b(vVar.getLayoutDirection()) : androidx.compose.foundation.layout.m.f(this.f12199b, vVar.getLayoutDirection()));
            int iA13 = vVar.a1(this.f12199b.c());
            int iA14 = vVar.a1(this.f12199b.a());
            int i10 = iA13 + iA14;
            int i11 = iA1 + iA12;
            boolean z10 = this.f12198a;
            int i12 = z10 ? i10 : i11;
            int i13 = (!z10 || this.f12200c) ? (z10 && this.f12200c) ? iA14 : (z10 || this.f12200c) ? iA12 : iA1 : iA13;
            int i14 = i12 - i13;
            long jI = w2.c.i(j10, -i11, -i10);
            n nVarInvoke = this.f12201d.invoke();
            g0 g0VarG = nVarInvoke.g();
            d0 d0VarA = this.f12202e.a(vVar, j10);
            int length = d0VarA.b().length;
            g0VarG.h(length);
            this.f12203f.G(vVar);
            this.f12203f.J(length);
            if (this.f12198a) {
                b.m mVar = this.f12204g;
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                }
                fA = mVar.a();
            } else {
                b.e eVar = this.f12205h;
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                }
                fA = eVar.a();
            }
            int iA15 = vVar.a1(fA);
            int iC = nVarInvoke.c();
            int iM = this.f12198a ? w2.b.m(j10) - i10 : w2.b.n(j10) - i11;
            if (this.f12200c && iM <= 0) {
                boolean z11 = this.f12198a;
                if (!z11) {
                    iA1 += iM;
                }
                if (z11) {
                    iA13 += iM;
                }
            }
            c cVar = new c(nVarInvoke, vVar, iA15, this.f12203f, this.f12198a, this.f12200c, i13, i14, w2.o.a(iA1, iA13));
            d dVar = new d(this.f12198a, d0VarA, iC, iA15, cVar, g0VarG);
            this.f12203f.H(new a(g0VarG, dVar));
            k.a aVar = d1.k.f9368e;
            h0 h0Var = this.f12203f;
            d1.k kVarC = aVar.c();
            try {
                d1.k kVarL = kVarC.l();
                try {
                    int iM2 = h0Var.M(nVarInvoke, h0Var.m());
                    if (iM2 < iC || iC <= 0) {
                        int iD2 = g0VarG.d(iM2);
                        iN = h0Var.n();
                        iD = iD2;
                    } else {
                        iD = g0VarG.d(iC - 1);
                        iN = 0;
                    }
                    md.i0 i0Var = md.i0.f15558a;
                    kVarC.d();
                    w wVarC = v.c(iC, dVar, cVar, iM, i13, i14, iA15, iD, iN, this.f12203f.y(), jI, this.f12198a, this.f12204g, this.f12205h, this.f12200c, vVar, this.f12203f.s(), g0VarG, j0.m.a(nVarInvoke, this.f12203f.r(), this.f12203f.l()), this.f12206i, this.f12203f.t(), new C0295b(vVar, j10, i11, i10));
                    h0.i(this.f12203f, wVarC, false, 2, null);
                    return wVarC;
                } finally {
                    kVarC.s(kVarL);
                }
            } catch (Throwable th) {
                kVarC.d();
                throw th;
            }
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ w invoke(j0.v vVar, w2.b bVar) {
            return a(vVar, bVar.t());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r30, i0.h0 r31, i0.e0 r32, h0.y r33, boolean r34, boolean r35, e0.p r36, boolean r37, h0.b.m r38, h0.b.e r39, zd.l<? super i0.b0, md.i0> r40, t0.l r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.t.a(androidx.compose.ui.e, i0.h0, i0.e0, h0.y, boolean, boolean, e0.p, boolean, h0.b$m, h0.b$e, zd.l, t0.l, int, int, int):void");
    }

    private static final zd.p<j0.v, w2.b, y1.f0> b(zd.a<? extends n> aVar, h0 h0Var, e0 e0Var, h0.y yVar, boolean z10, boolean z11, b.e eVar, b.m mVar, n0 n0Var, t0.l lVar, int i10) {
        lVar.e(-2068958445);
        if (t0.o.I()) {
            t0.o.U(-2068958445, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:167)");
        }
        Object[] objArr = {h0Var, e0Var, yVar, Boolean.valueOf(z10), Boolean.valueOf(z11), eVar, mVar};
        lVar.e(-568225417);
        boolean zN = false;
        for (int i11 = 0; i11 < 7; i11++) {
            zN |= lVar.N(objArr[i11]);
        }
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = new b(z11, yVar, z10, aVar, e0Var, h0Var, mVar, eVar, n0Var);
            lVar.E(objF);
        }
        lVar.K();
        zd.p<j0.v, w2.b, y1.f0> pVar = (zd.p) objF;
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return pVar;
    }
}
