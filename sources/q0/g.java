package q0;

import a2.g;
import androidx.compose.ui.e;
import f1.b;
import h0.b;
import l1.t1;
import t0.e2;
import t0.q2;
import t0.u3;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    static final class a extends ae.s implements zd.l<g2.x, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18587a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(g2.x xVar) {
            invoke2(xVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g2.x xVar) {
            g2.v.y(xVar, g2.i.f11320b.a());
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f18588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.y f18589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.q<h0.g0, t0.l, Integer, md.i0> f18590c;

        static final class a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0.y f18591a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ zd.q<h0.g0, t0.l, Integer, md.i0> f18592b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(h0.y yVar, zd.q<? super h0.g0, ? super t0.l, ? super Integer, md.i0> qVar) {
                super(2);
                this.f18591a = yVar;
                this.f18592b = qVar;
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
                    t0.o.U(1327513942, i10, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:134)");
                }
                e.a aVar = androidx.compose.ui.e.f2662a;
                e eVar = e.f18552a;
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.m.h(androidx.compose.foundation.layout.p.a(aVar, eVar.h(), eVar.g()), this.f18591a);
                b.f fVarB = h0.b.f11594a.b();
                b.c cVarI = f1.b.f11020a.i();
                zd.q<h0.g0, t0.l, Integer, md.i0> qVar = this.f18592b;
                lVar.e(693286680);
                y1.e0 e0VarA = h0.f0.a(fVarB, cVarI, lVar, 54);
                lVar.e(-1323940314);
                int iA = t0.i.a(lVar, 0);
                t0.w wVarB = lVar.B();
                g.a aVar2 = a2.g.J;
                zd.a<a2.g> aVarA = aVar2.a();
                zd.q<q2<a2.g>, t0.l, Integer, md.i0> qVarA = y1.u.a(eVarH);
                if (!(lVar.t() instanceof t0.e)) {
                    t0.i.b();
                }
                lVar.r();
                if (lVar.l()) {
                    lVar.O(aVarA);
                } else {
                    lVar.D();
                }
                t0.l lVarA = u3.a(lVar);
                u3.b(lVarA, e0VarA, aVar2.e());
                u3.b(lVarA, wVarB, aVar2.g());
                zd.p<a2.g, Integer, md.i0> pVarB = aVar2.b();
                if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
                    lVarA.E(Integer.valueOf(iA));
                    lVarA.Q(Integer.valueOf(iA), pVarB);
                }
                qVarA.invoke(q2.a(q2.b(lVar)), lVar, 0);
                lVar.e(2058660585);
                qVar.invoke(h0.h0.f11663a, lVar, 6);
                lVar.K();
                lVar.L();
                lVar.K();
                lVar.K();
                if (t0.o.I()) {
                    t0.o.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j10, h0.y yVar, zd.q<? super h0.g0, ? super t0.l, ? super Integer, md.i0> qVar) {
            super(2);
            this.f18588a = j10;
            this.f18589b = yVar;
            this.f18590c = qVar;
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
                t0.o.U(956488494, i10, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:131)");
            }
            e0.a(this.f18588a, y.f18928a.c(lVar, 6).k(), b1.c.b(lVar, 1327513942, true, new a(this.f18589b, this.f18590c)), lVar, 384);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    static final class c extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a<md.i0> f18593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f18594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f18595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t1 f18596d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q0.d f18597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f18598f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d0.i f18599g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0.y f18600h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ g0.m f18601i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ zd.q<h0.g0, t0.l, Integer, md.i0> f18602j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f18603k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f18604l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(zd.a<md.i0> aVar, androidx.compose.ui.e eVar, boolean z10, t1 t1Var, q0.d dVar, f fVar, d0.i iVar, h0.y yVar, g0.m mVar, zd.q<? super h0.g0, ? super t0.l, ? super Integer, md.i0> qVar, int i10, int i11) {
            super(2);
            this.f18593a = aVar;
            this.f18594b = eVar;
            this.f18595c = z10;
            this.f18596d = t1Var;
            this.f18597e = dVar;
            this.f18598f = fVar;
            this.f18599g = iVar;
            this.f18600h = yVar;
            this.f18601i = mVar;
            this.f18602j = qVar;
            this.f18603k = i10;
            this.f18604l = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            g.a(this.f18593a, this.f18594b, this.f18595c, this.f18596d, this.f18597e, this.f18598f, this.f18599g, this.f18600h, this.f18601i, this.f18602j, lVar, e2.a(this.f18603k | 1), this.f18604l);
        }
    }

    static final class d extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a<md.i0> f18605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f18606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f18607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t1 f18608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q0.d f18609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f18610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d0.i f18611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0.y f18612h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ g0.m f18613i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ zd.q<h0.g0, t0.l, Integer, md.i0> f18614j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f18615k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f18616l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(zd.a<md.i0> aVar, androidx.compose.ui.e eVar, boolean z10, t1 t1Var, q0.d dVar, f fVar, d0.i iVar, h0.y yVar, g0.m mVar, zd.q<? super h0.g0, ? super t0.l, ? super Integer, md.i0> qVar, int i10, int i11) {
            super(2);
            this.f18605a = aVar;
            this.f18606b = eVar;
            this.f18607c = z10;
            this.f18608d = t1Var;
            this.f18609e = dVar;
            this.f18610f = fVar;
            this.f18611g = iVar;
            this.f18612h = yVar;
            this.f18613i = mVar;
            this.f18614j = qVar;
            this.f18615k = i10;
            this.f18616l = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            g.b(this.f18605a, this.f18606b, this.f18607c, this.f18608d, this.f18609e, this.f18610f, this.f18611g, this.f18612h, this.f18613i, this.f18614j, lVar, e2.a(this.f18615k | 1), this.f18616l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(zd.a<md.i0> r30, androidx.compose.ui.e r31, boolean r32, l1.t1 r33, q0.d r34, q0.f r35, d0.i r36, h0.y r37, g0.m r38, zd.q<? super h0.g0, ? super t0.l, ? super java.lang.Integer, md.i0> r39, t0.l r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.g.a(zd.a, androidx.compose.ui.e, boolean, l1.t1, q0.d, q0.f, d0.i, h0.y, g0.m, zd.q, t0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(zd.a<md.i0> r26, androidx.compose.ui.e r27, boolean r28, l1.t1 r29, q0.d r30, q0.f r31, d0.i r32, h0.y r33, g0.m r34, zd.q<? super h0.g0, ? super t0.l, ? super java.lang.Integer, md.i0> r35, t0.l r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.g.b(zd.a, androidx.compose.ui.e, boolean, l1.t1, q0.d, q0.f, d0.i, h0.y, g0.m, zd.q, t0.l, int, int):void");
    }
}
