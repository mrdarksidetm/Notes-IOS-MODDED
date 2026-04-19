package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import a2.g;
import ae.r;
import ae.s;
import android.graphics.BlurMaskFilter;
import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyleKt;
import f1.b;
import h0.b;
import k1.g;
import k1.k;
import l1.b1;
import l1.d1;
import l1.f1;
import l1.j;
import l1.j0;
import l1.l0;
import l1.m1;
import l1.t1;
import md.i0;
import n1.f;
import q0.q0;
import q0.y;
import t0.e2;
import t0.i;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import w2.h;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ShadowKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt$Shadow_Preview_Circle$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            ShadowKt.Shadow_Preview_Circle(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt$Shadow_Preview_Gradient_CustomShape$2, reason: invalid class name and case insensitive filesystem */
    static final class C06352 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06352(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            ShadowKt.Shadow_Preview_Gradient_CustomShape(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt$Shadow_Preview_Margin$2, reason: invalid class name and case insensitive filesystem */
    static final class C06362 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06362(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            ShadowKt.Shadow_Preview_Margin(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt$Shadow_Preview_Square$2, reason: invalid class name and case insensitive filesystem */
    static final class C06372 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06372(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            ShadowKt.Shadow_Preview_Square(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt$shadow$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements zd.l<f, i0> {
        final /* synthetic */ ShadowStyle $shadow;
        final /* synthetic */ t1 $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(t1 t1Var, ShadowStyle shadowStyle) {
            super(1);
            this.$shape = t1Var;
            this.$shadow = shadowStyle;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(f fVar) {
            invoke2(fVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(f fVar) {
            r.f(fVar, "$this$drawBehind");
            b1 b1VarMo253createOutlinePq9zytI = this.$shape.mo253createOutlinePq9zytI(fVar.c(), fVar.getLayoutDirection(), fVar);
            long jA = g.a(fVar.G0(this.$shadow.m136getXD9Ej5fM()), fVar.G0(this.$shadow.m137getYD9Ej5fM()));
            f1 f1VarA = l1.p.a();
            ShadowKt.m91addOutline0AR0LA0(f1VarA, b1VarMo253createOutlinePq9zytI, jA);
            d1 d1VarA = j.a();
            ShadowStyle shadowStyle = this.$shadow;
            ColorStyle color = shadowStyle.getColor();
            if (color instanceof ColorStyle.Solid) {
                d1VarA.t(((ColorStyle.Solid) shadowStyle.getColor()).m124unboximpl());
            } else if (color instanceof ColorStyle.Gradient) {
                ((ColorStyle.Gradient) shadowStyle.getColor()).m116unboximpl().mo292applyToPq9zytI(fVar.c(), d1VarA, 1.0f);
            }
            if (!h.o(shadowStyle.m135getRadiusD9Ej5fM(), h.m(0))) {
                d1VarA.j().setMaskFilter(new BlurMaskFilter(fVar.G0(shadowStyle.m135getRadiusD9Ej5fM()), BlurMaskFilter.Blur.NORMAL));
            }
            fVar.M0().d().o(f1VarA, d1VarA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Shadow_Preview_Circle(l lVar, int i10) {
        l lVarP = lVar.p(1888265500);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1888265500, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_Circle (Shadow.kt:78)");
            }
            l0.f fVarF = l0.g.f();
            e.a aVar = e.f2662a;
            e eVarL = androidx.compose.foundation.layout.p.l(aVar, h.m(200));
            b bVarE = b.f11020a.e();
            lVarP.e(733328855);
            e0 e0VarG = d.g(bVarE, false, lVarP, 6);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar2 = a2.g.J;
            a<a2.g> aVarA = aVar2.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarL);
            if (!(lVarP.t() instanceof t0.e)) {
                i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA);
            } else {
                lVarP.D();
            }
            l lVarA = u3.a(lVarP);
            u3.b(lVarA, e0VarG, aVar2.e());
            u3.b(lVarA, wVarB, aVar2.g());
            p<a2.g, Integer, i0> pVarB = aVar2.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f2502a;
            e eVarL2 = androidx.compose.foundation.layout.p.l(aVar, h.m(100));
            j0.a aVar3 = j0.f14524b;
            d.a(c.c(shadow(eVarL2, ShadowStyleKt.toShadowStyle(new Shadow(new ColorScheme(new ColorInfo.Hex(l0.i(aVar3.a())), (ColorInfo) null, 2, (ae.j) null), 0.0d, 5.0d, 5.0d), lVarP, 8), fVarF), aVar3.h(), fVarF), lVarP, 0);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass2(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Shadow_Preview_Gradient_CustomShape(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(2006972301);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(2006972301, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_Gradient_CustomShape (Shadow.kt:136)");
            }
            l0.f fVarA = l0.g.a(50);
            e.a aVar = e.f2662a;
            e eVarL = androidx.compose.foundation.layout.p.l(aVar, h.m(200));
            b bVarE = b.f11020a.e();
            lVarP.e(733328855);
            e0 e0VarG = d.g(bVarE, false, lVarP, 6);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar2 = a2.g.J;
            a<a2.g> aVarA = aVar2.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarL);
            if (!(lVarP.t() instanceof t0.e)) {
                i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA);
            } else {
                lVarP.D();
            }
            l lVarA = u3.a(lVarP);
            u3.b(lVarA, e0VarG, aVar2.e());
            u3.b(lVarA, wVarB, aVar2.g());
            p<a2.g, Integer, i0> pVarB = aVar2.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f2502a;
            j0.a aVar3 = j0.f14524b;
            lVar2 = lVarP;
            q0.b("GET UNLIMITED RGB", m.j(c.c(shadow(aVar, ShadowStyleKt.toShadowStyle(new Shadow(new ColorScheme(new ColorInfo.Gradient.Linear(0.0f, nd.u.p(new ColorInfo.Gradient.Point(l0.i(aVar3.h()), 0.1f), new ColorInfo.Gradient.Point(l0.i(aVar3.f()), 0.5f), new ColorInfo.Gradient.Point(l0.i(aVar3.b()), 0.9f))), (ColorInfo) null, 2, (ae.j) null), 9.5d, 0.0d, 6.0d), lVarP, 8), fVarA), aVar3.a(), fVarA), h.m(24), h.m(16)), aVar3.k(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y.f18928a.c(lVarP, 0 | y.f18929b).p(), lVar2, 390, 0, 65528);
            lVar2.K();
            lVar2.L();
            lVar2.K();
            lVar2.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06352(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Shadow_Preview_Margin(l lVar, int i10) {
        l lVarP = lVar.p(-1769512070);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1769512070, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_Margin (Shadow.kt:184)");
            }
            float f10 = 16;
            h0.y yVarD = m.d(h.m(8), h.m(f10), h.m(4), h.m(24));
            t1 t1VarA = m1.a();
            e.a aVar = e.f2662a;
            e eVarM = androidx.compose.foundation.layout.p.m(aVar, h.m(100), h.m(200));
            b.f fVarB = h0.b.f11594a.b();
            b.InterfaceC0266b interfaceC0266bG = f1.b.f11020a.g();
            lVarP.e(-483455358);
            e0 e0VarA = h0.g.a(fVarB, interfaceC0266bG, lVarP, 54);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar2 = a2.g.J;
            a<a2.g> aVarA = aVar2.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarM);
            if (!(lVarP.t() instanceof t0.e)) {
                i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA);
            } else {
                lVarP.D();
            }
            l lVarA = u3.a(lVarP);
            u3.b(lVarA, e0VarA, aVar2.e());
            u3.b(lVarA, wVarB, aVar2.g());
            p<a2.g, Integer, i0> pVarB = aVar2.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            h0.i iVar = h0.i.f11664a;
            float f11 = 50;
            e eVarM2 = androidx.compose.foundation.layout.p.m(m.h(aVar, yVarD), h.m(f11), h.m(f11));
            j0.a aVar3 = j0.f14524b;
            float f12 = 2;
            d.a(m.i(d0.g.f(c.c(shadow(eVarM2, ShadowStyleKt.toShadowStyle(new Shadow(new ColorScheme(new ColorInfo.Hex(l0.i(aVar3.a())), (ColorInfo) null, 2, (ae.j) null), 20.0d, 0.0d, 5.0d), lVarP, 8), t1VarA), aVar3.h(), t1VarA), h.m(f12), aVar3.b(), t1VarA), h.m(f10)), lVarP, 0);
            d.a(m.i(d0.g.f(c.c(shadow(androidx.compose.foundation.layout.p.m(m.h(aVar, yVarD), h.m(f11), h.m(f11)), ShadowStyleKt.toShadowStyle(new Shadow(new ColorScheme(new ColorInfo.Hex(l0.i(aVar3.a())), (ColorInfo) null, 2, (ae.j) null), 20.0d, 0.0d, 5.0d), lVarP, 8), t1VarA), aVar3.h(), t1VarA), h.m(f12), aVar3.b(), t1VarA), h.m(f10)), lVarP, 0);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06362(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Shadow_Preview_Square(l lVar, int i10) {
        l lVarP = lVar.p(-1204850263);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1204850263, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_Square (Shadow.kt:107)");
            }
            t1 t1VarA = m1.a();
            e.a aVar = e.f2662a;
            e eVarL = androidx.compose.foundation.layout.p.l(aVar, h.m(200));
            f1.b bVarE = f1.b.f11020a.e();
            lVarP.e(733328855);
            e0 e0VarG = d.g(bVarE, false, lVarP, 6);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar2 = a2.g.J;
            a<a2.g> aVarA = aVar2.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarL);
            if (!(lVarP.t() instanceof t0.e)) {
                i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA);
            } else {
                lVarP.D();
            }
            l lVarA = u3.a(lVarP);
            u3.b(lVarA, e0VarG, aVar2.e());
            u3.b(lVarA, wVarB, aVar2.g());
            p<a2.g, Integer, i0> pVarB = aVar2.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f2502a;
            e eVarL2 = androidx.compose.foundation.layout.p.l(aVar, h.m(100));
            j0.a aVar3 = j0.f14524b;
            d.a(c.c(shadow(eVarL2, ShadowStyleKt.toShadowStyle(new Shadow(new ColorScheme(new ColorInfo.Hex(l0.i(aVar3.a())), (ColorInfo) null, 2, (ae.j) null), 20.0d, 10.0d, 5.0d), lVarP, 8), t1VarA), aVar3.h(), t1VarA), lVarP, 0);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06372(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addOutline-0AR0LA0, reason: not valid java name */
    public static final void m91addOutline0AR0LA0(f1 f1Var, b1 b1Var, long j10) {
        if (b1Var instanceof b1.b) {
            f1Var.l(((b1.b) b1Var).a().q(j10));
        } else if (b1Var instanceof b1.c) {
            f1Var.m(k.e(((b1.c) b1Var).a(), j10));
        } else if (b1Var instanceof b1.a) {
            f1Var.h(((b1.a) b1Var).a(), j10);
        }
    }

    public static final /* synthetic */ e shadow(e eVar, ShadowStyle shadowStyle, t1 t1Var) {
        r.f(eVar, "<this>");
        r.f(shadowStyle, "shadow");
        r.f(t1Var, "shape");
        return eVar.h(androidx.compose.ui.draw.b.b(eVar, new AnonymousClass1(t1Var, shadowStyle)));
    }
}
