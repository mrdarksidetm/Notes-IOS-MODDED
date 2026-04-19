package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import ae.j;
import ae.r;
import ae.s;
import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import l0.g;
import l1.j0;
import l1.l0;
import l1.m1;
import l1.t1;
import md.i0;
import md.q;
import nd.u;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import w2.h;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BorderKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_LinearGradient$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ t1 $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(t1 t1Var, int i10) {
            super(2);
            this.$shape = t1Var;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            BorderKt.Border_Preview_LinearGradient(this.$shape, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_LinearGradientCircle$1, reason: invalid class name and case insensitive filesystem */
    static final class C06271 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06271(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            BorderKt.Border_Preview_LinearGradientCircle(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_LinearGradientSquare$1, reason: invalid class name and case insensitive filesystem */
    static final class C06281 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06281(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            BorderKt.Border_Preview_LinearGradientSquare(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_RadialGradient$1, reason: invalid class name and case insensitive filesystem */
    static final class C06291 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ t1 $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06291(t1 t1Var, int i10) {
            super(2);
            this.$shape = t1Var;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            BorderKt.Border_Preview_RadialGradient(this.$shape, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_RadialGradientCircle$1, reason: invalid class name and case insensitive filesystem */
    static final class C06301 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06301(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            BorderKt.Border_Preview_RadialGradientCircle(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_RadialGradientSquare$1, reason: invalid class name and case insensitive filesystem */
    static final class C06311 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06311(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            BorderKt.Border_Preview_RadialGradientSquare(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_Solid$1, reason: invalid class name and case insensitive filesystem */
    static final class C06321 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06321(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            BorderKt.Border_Preview_Solid(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_SolidCircle$1, reason: invalid class name and case insensitive filesystem */
    static final class C06331 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06331(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            BorderKt.Border_Preview_SolidCircle(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_SolidThin$1, reason: invalid class name and case insensitive filesystem */
    static final class C06341 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06341(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            BorderKt.Border_Preview_SolidThin(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Border_Preview_LinearGradient(t1 t1Var, l lVar, int i10) {
        int i11;
        l lVarP = lVar.p(-1213727402);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(t1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1213727402, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_LinearGradient (Border.kt:113)");
            }
            e eVarL = androidx.compose.foundation.layout.p.l(e.f2662a, h.m(100));
            j0.a aVar = j0.f14524b;
            d.a(border(c.d(eVarL, aVar.h(), null, 2, null), new BorderStyle(h.m(10), ColorStyleKt.toColorStyle(new ColorScheme(new ColorInfo.Gradient.Linear(-45.0f, u.p(new ColorInfo.Gradient.Point(l0.i(aVar.c()), 0.1f), new ColorInfo.Gradient.Point(l0.i(l0.e(0, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 255, 0, 8, null)), 0.3f), new ColorInfo.Gradient.Point(l0.i(l0.e(160, 0, 160, 0, 8, null)), 0.8f))), (ColorInfo) null, 2, (j) null), lVarP, 8), null), t1Var), lVarP, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(t1Var, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Border_Preview_LinearGradientCircle(l lVar, int i10) {
        l lVarP = lVar.p(-873280999);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-873280999, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_LinearGradientCircle (Border.kt:95)");
            }
            Border_Preview_LinearGradient(g.f(), lVarP, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06271(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Border_Preview_LinearGradientSquare(l lVar, int i10) {
        l lVarP = lVar.p(328570534);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(328570534, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_LinearGradientSquare (Border.kt:89)");
            }
            Border_Preview_LinearGradient(m1.a(), lVarP, 6);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06281(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Border_Preview_RadialGradient(t1 t1Var, l lVar, int i10) {
        int i11;
        l lVarP = lVar.p(-1379549156);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(t1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1379549156, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_RadialGradient (Border.kt:148)");
            }
            e eVarL = androidx.compose.foundation.layout.p.l(e.f2662a, h.m(100));
            j0.a aVar = j0.f14524b;
            d.a(border(c.d(eVarL, aVar.h(), null, 2, null), new BorderStyle(h.m(10), ColorStyleKt.toColorStyle(new ColorScheme(new ColorInfo.Gradient.Radial(u.p(new ColorInfo.Gradient.Point(l0.i(aVar.c()), 0.8f), new ColorInfo.Gradient.Point(l0.i(l0.e(0, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 255, 0, 8, null)), 0.9f), new ColorInfo.Gradient.Point(l0.i(l0.e(160, 0, 160, 0, 8, null)), 0.96f))), (ColorInfo) null, 2, (j) null), lVarP, 8), null), t1Var), lVarP, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06291(t1Var, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Border_Preview_RadialGradientCircle(l lVar, int i10) {
        l lVarP = lVar.p(-1718788077);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1718788077, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_RadialGradientCircle (Border.kt:107)");
            }
            Border_Preview_RadialGradient(g.f(), lVarP, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06301(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Border_Preview_RadialGradientSquare(l lVar, int i10) {
        l lVarP = lVar.p(-516936544);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-516936544, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_RadialGradientSquare (Border.kt:101)");
            }
            Border_Preview_RadialGradient(m1.a(), lVarP, 6);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06311(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Border_Preview_Solid(l lVar, int i10) {
        l lVarP = lVar.p(-1171018009);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1171018009, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_Solid (Border.kt:38)");
            }
            e eVarL = androidx.compose.foundation.layout.p.l(e.f2662a, h.m(100));
            j0.a aVar = j0.f14524b;
            d.a(border$default(c.d(eVarL, aVar.h(), null, 2, null), new BorderStyle(h.m(10), ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar.b())), null), null, 2, null), lVarP, 6);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06321(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Border_Preview_SolidCircle(l lVar, int i10) {
        l lVarP = lVar.p(2094328983);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(2094328983, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_SolidCircle (Border.kt:72)");
            }
            e eVarL = androidx.compose.foundation.layout.p.l(e.f2662a, h.m(100));
            j0.a aVar = j0.f14524b;
            d.a(border(c.d(eVarL, aVar.h(), null, 2, null), new BorderStyle(h.m(10), ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar.b())), null), g.f()), lVarP, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06331(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Border_Preview_SolidThin(l lVar, int i10) {
        l lVarP = lVar.p(471558496);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(471558496, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_SolidThin (Border.kt:55)");
            }
            e eVarL = androidx.compose.foundation.layout.p.l(e.f2662a, h.m(100));
            j0.a aVar = j0.f14524b;
            d.a(border$default(c.d(eVarL, aVar.h(), null, 2, null), new BorderStyle(h.m(2), ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar.b())), null), null, 2, null), lVarP, 6);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06341(i10));
    }

    public static final /* synthetic */ e border(e eVar, BorderStyle borderStyle, t1 t1Var) {
        e eVarH;
        r.f(eVar, "<this>");
        r.f(borderStyle, "border");
        r.f(t1Var, "shape");
        ColorStyle color = borderStyle.getColor();
        if (color instanceof ColorStyle.Solid) {
            eVarH = d0.g.f(eVar, borderStyle.m109getWidthD9Ej5fM(), ((ColorStyle.Solid) borderStyle.getColor()).m124unboximpl(), t1Var);
        } else {
            if (!(color instanceof ColorStyle.Gradient)) {
                throw new q();
            }
            eVarH = d0.g.h(eVar, borderStyle.m109getWidthD9Ej5fM(), ((ColorStyle.Gradient) borderStyle.getColor()).m116unboximpl(), t1Var);
        }
        return eVar.h(eVarH);
    }

    public static /* synthetic */ e border$default(e eVar, BorderStyle borderStyle, t1 t1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            t1Var = m1.a();
        }
        return border(eVar, borderStyle, t1Var);
    }
}
