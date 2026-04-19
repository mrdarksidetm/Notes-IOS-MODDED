package a3;

import a2.g;
import ae.s;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import g2.v;
import g2.x;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import nd.u;
import t0.e2;
import t0.i;
import t0.i0;
import t0.j0;
import t0.o;
import t0.o2;
import t0.p3;
import t0.q2;
import t0.u3;
import t0.w;
import w2.r;
import y1.d0;
import y1.e0;
import y1.f0;
import y1.g0;
import y1.t0;
import zd.l;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a3.a$a, reason: collision with other inner class name */
    static final class C0010a extends s implements l<j0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3.f f366a;

        /* JADX INFO: renamed from: a3.a$a$a, reason: collision with other inner class name */
        public static final class C0011a implements i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a3.f f367a;

            public C0011a(a3.f fVar) {
                this.f367a = fVar;
            }

            @Override // t0.i0
            public void dispose() {
                this.f367a.dismiss();
                this.f367a.h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0010a(a3.f fVar) {
            super(1);
            this.f366a = fVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke(j0 j0Var) {
            this.f366a.show();
            return new C0011a(this.f366a);
        }
    }

    static final class b extends s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3.f f368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.a<md.i0> f369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a3.e f370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f371d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a3.f fVar, zd.a<md.i0> aVar, a3.e eVar, r rVar) {
            super(0);
            this.f368a = fVar;
            this.f369b = aVar;
            this.f370c = eVar;
            this.f371d = rVar;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f368a.l(this.f369b, this.f370c, this.f371d);
        }
    }

    static final class c extends s implements p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a<md.i0> f372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3.e f373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<t0.l, Integer, md.i0> f374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f376e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(zd.a<md.i0> aVar, a3.e eVar, p<? super t0.l, ? super Integer, md.i0> pVar, int i10, int i11) {
            super(2);
            this.f372a = aVar;
            this.f373b = eVar;
            this.f374c = pVar;
            this.f375d = i10;
            this.f376e = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            a.a(this.f372a, this.f373b, this.f374c, lVar, e2.a(this.f375d | 1), this.f376e);
        }
    }

    static final class d extends s implements p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p3<p<t0.l, Integer, md.i0>> f377a;

        /* JADX INFO: renamed from: a3.a$d$a, reason: collision with other inner class name */
        static final class C0012a extends s implements l<x, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0012a f378a = new C0012a();

            C0012a() {
                super(1);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(x xVar) {
                invoke2(xVar);
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(x xVar) {
                v.e(xVar);
            }
        }

        static final class b extends s implements p<t0.l, Integer, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p3<p<t0.l, Integer, md.i0>> f379a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(p3<? extends p<? super t0.l, ? super Integer, md.i0>> p3Var) {
                super(2);
                this.f379a = p3Var;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
                invoke(lVar, num.intValue());
                return md.i0.f15558a;
            }

            public final void invoke(t0.l lVar, int i10) {
                if ((i10 & 11) == 2 && lVar.s()) {
                    lVar.x();
                    return;
                }
                if (o.I()) {
                    o.U(-533674951, i10, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:176)");
                }
                a.b(this.f379a).invoke(lVar, 0);
                if (o.I()) {
                    o.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p3<? extends p<? super t0.l, ? super Integer, md.i0>> p3Var) {
            super(2);
            this.f377a = p3Var;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (o.I()) {
                o.U(488261145, i10, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:173)");
            }
            a.c(g2.o.d(androidx.compose.ui.e.f2662a, false, C0012a.f378a, 1, null), b1.c.b(lVar, -533674951, true, new b(this.f377a)), lVar, 48, 0);
            if (o.I()) {
                o.T();
            }
        }
    }

    static final class e extends s implements zd.a<UUID> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f380a = new e();

        e() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    static final class f implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f381a = new f();

        /* JADX INFO: renamed from: a3.a$f$a, reason: collision with other inner class name */
        static final class C0013a extends s implements l<t0.a, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<t0> f382a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0013a(List<? extends t0> list) {
                super(1);
                this.f382a = list;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
                invoke2(aVar);
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(t0.a aVar) {
                List<t0> list = this.f382a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    t0.a.j(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }
        }

        f() {
        }

        @Override // y1.e0
        public final f0 a(g0 g0Var, List<? extends d0> list, long j10) {
            Object obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).I(j10));
            }
            Object obj2 = null;
            int i11 = 1;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int iQ0 = ((t0) obj).q0();
                int iO = u.o(arrayList);
                if (1 <= iO) {
                    int i12 = 1;
                    while (true) {
                        Object obj3 = arrayList.get(i12);
                        int iQ02 = ((t0) obj3).q0();
                        if (iQ0 < iQ02) {
                            obj = obj3;
                            iQ0 = iQ02;
                        }
                        if (i12 == iO) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            t0 t0Var = (t0) obj;
            int iQ03 = t0Var != null ? t0Var.q0() : w2.b.p(j10);
            if (!arrayList.isEmpty()) {
                Object obj4 = arrayList.get(0);
                int iD0 = ((t0) obj4).d0();
                int iO2 = u.o(arrayList);
                if (1 <= iO2) {
                    while (true) {
                        Object obj5 = arrayList.get(i11);
                        int iD02 = ((t0) obj5).d0();
                        if (iD0 < iD02) {
                            obj4 = obj5;
                            iD0 = iD02;
                        }
                        if (i11 == iO2) {
                            break;
                        }
                        i11++;
                    }
                }
                obj2 = obj4;
            }
            t0 t0Var2 = (t0) obj2;
            return g0.z0(g0Var, iQ03, t0Var2 != null ? t0Var2.d0() : w2.b.o(j10), null, new C0013a(arrayList), 4, null);
        }
    }

    static final class g extends s implements p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<t0.l, Integer, md.i0> f384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f386d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.e eVar, p<? super t0.l, ? super Integer, md.i0> pVar, int i10, int i11) {
            super(2);
            this.f383a = eVar;
            this.f384b = pVar;
            this.f385c = i10;
            this.f386d = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            a.c(this.f383a, this.f384b, lVar, e2.a(this.f385c | 1), this.f386d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(zd.a<md.i0> r19, a3.e r20, zd.p<? super t0.l, ? super java.lang.Integer, md.i0> r21, t0.l r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.a.a(zd.a, a3.e, zd.p, t0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<t0.l, Integer, md.i0> b(p3<? extends p<? super t0.l, ? super Integer, md.i0>> p3Var) {
        return (p) p3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.ui.e eVar, p<? super t0.l, ? super Integer, md.i0> pVar, t0.l lVar, int i10, int i11) {
        int i12;
        t0.l lVarP = lVar.p(-1177876616);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.N(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.k(pVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f2662a;
            }
            if (o.I()) {
                o.U(-1177876616, i12, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:452)");
            }
            f fVar = f.f381a;
            int i14 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            zd.a<a2.g> aVarA = aVar.a();
            q<q2<a2.g>, t0.l, Integer, md.i0> qVarA = y1.u.a(eVar);
            int i15 = ((i14 << 9) & 7168) | 6;
            if (!(lVarP.t() instanceof t0.e)) {
                i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA);
            } else {
                lVarP.D();
            }
            t0.l lVarA = u3.a(lVarP);
            u3.b(lVarA, fVar, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            p<a2.g, Integer, md.i0> pVarB = aVar.b();
            if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, Integer.valueOf((i15 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            lVarP.e(2058660585);
            pVar.invoke(lVarP, Integer.valueOf((i15 >> 9) & 14));
            lVarP.K();
            lVarP.L();
            lVarP.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new g(eVar, pVar, i10, i11));
        }
    }
}
