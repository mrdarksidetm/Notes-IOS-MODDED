package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import a2.g;
import ae.j;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import b1.c;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.FontSize;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.AlignmentKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.DistributionKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import f1.b;
import h0.b;
import h0.f0;
import h0.h0;
import h0.y;
import i1.g;
import java.util.List;
import l1.j0;
import l1.l0;
import md.i0;
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
public final /* synthetic */ class StackComponentViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView$4, reason: invalid class name */
    static final class AnonymousClass4 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ StackComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(StackComponentStyle stackComponentStyle, e eVar, int i10, int i11) {
            super(2);
            this.$style = stackComponentStyle;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            StackComponentViewKt.StackComponentView(this.$style, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Horizontal$2, reason: invalid class name */
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
            StackComponentViewKt.StackComponentView_Preview_Horizontal(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Vertical$2, reason: invalid class name and case insensitive filesystem */
    static final class C06472 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06472(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Vertical(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_ZLayer$2, reason: invalid class name and case insensitive filesystem */
    static final class C06482 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06482(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            StackComponentViewKt.StackComponentView_Preview_ZLayer(lVar, e2.a(this.$$changed | 1));
        }
    }

    public static final void StackComponentView(StackComponentStyle stackComponentStyle, e eVar, l lVar, int i10, int i11) {
        int i12;
        r.f(stackComponentStyle, "style");
        l lVarP = lVar.p(-1450071060);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.N(stackComponentStyle) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.N(eVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = e.f2662a;
            }
            if (o.I()) {
                o.U(-1450071060, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView (StackComponentView.kt:50)");
            }
            if (stackComponentStyle.getVisible()) {
                lVarP.e(1157296644);
                boolean zN = lVarP.N(stackComponentStyle);
                Object objF = lVarP.f();
                if (zN || objF == l.f20813a.a()) {
                    objF = m.h(ModifierExtensionsKt.applyIfNotNull(g.a(ModifierExtensionsKt.applyIfNotNull(ModifierExtensionsKt.applyIfNotNull(m.h(e.f2662a, stackComponentStyle.getMargin()), stackComponentStyle.getShadow(), new StackComponentViewKt$StackComponentView$commonModifier$1$1(stackComponentStyle)), stackComponentStyle.getBackground(), new StackComponentViewKt$StackComponentView$commonModifier$1$2(stackComponentStyle)), stackComponentStyle.getShape()), stackComponentStyle.getBorder(), new StackComponentViewKt$StackComponentView$commonModifier$1$3(stackComponentStyle)), stackComponentStyle.getPadding());
                    lVarP.E(objF);
                }
                lVarP.K();
                e eVar2 = (e) objF;
                List children = stackComponentStyle.getChildren();
                lVarP.e(1157296644);
                boolean zN2 = lVarP.N(children);
                Object objF2 = lVarP.f();
                if (zN2 || objF2 == l.f20813a.a()) {
                    objF2 = c.c(1241319765, true, new StackComponentViewKt$StackComponentView$content$1$1(stackComponentStyle));
                    lVarP.E(objF2);
                }
                lVarP.K();
                p pVar = (p) objF2;
                Dimension dimension = stackComponentStyle.getDimension();
                if (dimension instanceof Dimension.Horizontal) {
                    lVarP.e(-1772787834);
                    e eVarH = SizeKt.size$default(eVar, stackComponentStyle.getSize(), null, AlignmentKt.toAlignment(((Dimension.Horizontal) stackComponentStyle.getDimension()).getAlignment()), 2, null).h(eVar2);
                    b.c alignment = AlignmentKt.toAlignment(((Dimension.Horizontal) stackComponentStyle.getDimension()).getAlignment());
                    b.e eVarM86toHorizontalArrangement3ABfNKs = DistributionKt.m86toHorizontalArrangement3ABfNKs(((Dimension.Horizontal) stackComponentStyle.getDimension()).getDistribution(), stackComponentStyle.m138getSpacingD9Ej5fM());
                    lVarP.e(693286680);
                    e0 e0VarA = f0.a(eVarM86toHorizontalArrangement3ABfNKs, alignment, lVarP, 0);
                    lVarP.e(-1323940314);
                    int iA = i.a(lVarP, 0);
                    w wVarB = lVarP.B();
                    g.a aVar = a2.g.J;
                    a<a2.g> aVarA = aVar.a();
                    q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarH);
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
                    u3.b(lVarA, e0VarA, aVar.e());
                    u3.b(lVarA, wVarB, aVar.g());
                    p<a2.g, Integer, i0> pVarB = aVar.b();
                    if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                        lVarA.E(Integer.valueOf(iA));
                        lVarA.Q(Integer.valueOf(iA), pVarB);
                    }
                    qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
                    lVarP.e(2058660585);
                    h0 h0Var = h0.f11663a;
                } else if (dimension instanceof Dimension.Vertical) {
                    lVarP.e(-1772787350);
                    e eVarH2 = SizeKt.size$default(eVar, stackComponentStyle.getSize(), AlignmentKt.toAlignment(((Dimension.Vertical) stackComponentStyle.getDimension()).getAlignment()), null, 4, null).h(eVar2);
                    b.m mVarM87toVerticalArrangement3ABfNKs = DistributionKt.m87toVerticalArrangement3ABfNKs(((Dimension.Vertical) stackComponentStyle.getDimension()).getDistribution(), stackComponentStyle.m138getSpacingD9Ej5fM());
                    b.InterfaceC0266b alignment2 = AlignmentKt.toAlignment(((Dimension.Vertical) stackComponentStyle.getDimension()).getAlignment());
                    lVarP.e(-483455358);
                    e0 e0VarA2 = h0.g.a(mVarM87toVerticalArrangement3ABfNKs, alignment2, lVarP, 0);
                    lVarP.e(-1323940314);
                    int iA2 = i.a(lVarP, 0);
                    w wVarB2 = lVarP.B();
                    g.a aVar2 = a2.g.J;
                    a<a2.g> aVarA2 = aVar2.a();
                    q<q2<a2.g>, l, Integer, i0> qVarA2 = u.a(eVarH2);
                    if (!(lVarP.t() instanceof t0.e)) {
                        i.b();
                    }
                    lVarP.r();
                    if (lVarP.l()) {
                        lVarP.O(aVarA2);
                    } else {
                        lVarP.D();
                    }
                    l lVarA2 = u3.a(lVarP);
                    u3.b(lVarA2, e0VarA2, aVar2.e());
                    u3.b(lVarA2, wVarB2, aVar2.g());
                    p<a2.g, Integer, i0> pVarB2 = aVar2.b();
                    if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
                        lVarA2.E(Integer.valueOf(iA2));
                        lVarA2.Q(Integer.valueOf(iA2), pVarB2);
                    }
                    qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
                    lVarP.e(2058660585);
                    h0.i iVar = h0.i.f11664a;
                } else if (dimension instanceof Dimension.ZLayer) {
                    lVarP.e(-1772786865);
                    e eVarH3 = SizeKt.size(eVar, stackComponentStyle.getSize(), AlignmentKt.toHorizontalAlignmentOrNull(((Dimension.ZLayer) stackComponentStyle.getDimension()).getAlignment()), AlignmentKt.toVerticalAlignmentOrNull(((Dimension.ZLayer) stackComponentStyle.getDimension()).getAlignment())).h(eVar2);
                    f1.b alignment3 = AlignmentKt.toAlignment(((Dimension.ZLayer) stackComponentStyle.getDimension()).getAlignment());
                    lVarP.e(733328855);
                    e0 e0VarG = d.g(alignment3, false, lVarP, 0);
                    lVarP.e(-1323940314);
                    int iA3 = i.a(lVarP, 0);
                    w wVarB3 = lVarP.B();
                    g.a aVar3 = a2.g.J;
                    a<a2.g> aVarA3 = aVar3.a();
                    q<q2<a2.g>, l, Integer, i0> qVarA3 = u.a(eVarH3);
                    if (!(lVarP.t() instanceof t0.e)) {
                        i.b();
                    }
                    lVarP.r();
                    if (lVarP.l()) {
                        lVarP.O(aVarA3);
                    } else {
                        lVarP.D();
                    }
                    l lVarA3 = u3.a(lVarP);
                    u3.b(lVarA3, e0VarG, aVar3.e());
                    u3.b(lVarA3, wVarB3, aVar3.g());
                    p<a2.g, Integer, i0> pVarB3 = aVar3.b();
                    if (lVarA3.l() || !r.b(lVarA3.f(), Integer.valueOf(iA3))) {
                        lVarA3.E(Integer.valueOf(iA3));
                        lVarA3.Q(Integer.valueOf(iA3), pVarB3);
                    }
                    qVarA3.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
                    lVarP.e(2058660585);
                    f fVar = f.f2502a;
                } else {
                    lVarP.e(-1772786374);
                    lVarP.K();
                }
                pVar.invoke(lVarP, 0);
                lVarP.K();
                lVarP.L();
                lVarP.K();
                lVarP.K();
                lVarP.K();
            }
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass4(stackComponentStyle, eVar, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StackComponentView_Preview_Horizontal(l lVar, int i10) {
        l lVarP = lVar.p(537558075);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(537558075, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Horizontal (StackComponentView.kt:132)");
            }
            e eVarI = m.i(e.f2662a, h.m(32));
            lVarP.e(733328855);
            e0 e0VarG = d.g(f1.b.f11020a.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            a<a2.g> aVarA = aVar.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarI);
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
            u3.b(lVarA, e0VarG, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            p<a2.g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar = f.f2502a;
            List<TextComponentStyle> listPreviewChildren = previewChildren(lVarP, 0);
            Dimension.Horizontal horizontal = new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.START);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit, fit);
            float f10 = 16;
            float fM = h.m(f10);
            j0.a aVar2 = j0.f14524b;
            StackComponentView(new StackComponentStyle(true, listPreviewChildren, horizontal, size, fM, BackgroundStyle.Color.m92boximpl(BackgroundStyle.Color.m93constructorimpl(ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar2.h())))), m.a(h.m(f10)), m.a(h.m(f10)), l0.g.c(h.m(20)), new BorderStyle(h.m(2), ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar2.b())), null), new ShadowStyle(ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar2.a())), h.m(30), h.m(0), h.m(5), null), null), null, lVarP, 0, 2);
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
    public static final void StackComponentView_Preview_Vertical(l lVar, int i10) {
        l lVarP = lVar.p(1372631849);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1372631849, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Vertical (StackComponentView.kt:108)");
            }
            e eVarI = m.i(e.f2662a, h.m(32));
            lVarP.e(733328855);
            e0 e0VarG = d.g(f1.b.f11020a.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            a<a2.g> aVarA = aVar.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarI);
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
            u3.b(lVarA, e0VarG, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            p<a2.g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar = f.f2502a;
            List<TextComponentStyle> listPreviewChildren = previewChildren(lVarP, 0);
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit, fit);
            float f10 = 16;
            float fM = h.m(f10);
            j0.a aVar2 = j0.f14524b;
            StackComponentView(new StackComponentStyle(true, listPreviewChildren, vertical, size, fM, BackgroundStyle.Color.m92boximpl(BackgroundStyle.Color.m93constructorimpl(ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar2.h())))), m.a(h.m(f10)), m.a(h.m(f10)), l0.g.c(h.m(20)), new BorderStyle(h.m(2), ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar2.b())), null), new ShadowStyle(ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar2.a())), h.m(10), h.m(0), h.m(3), null), null), null, lVarP, 0, 2);
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
        o2VarV.a(new C06472(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StackComponentView_Preview_ZLayer(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(665263624);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(665263624, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_ZLayer (StackComponentView.kt:156)");
            }
            e eVarI = m.i(e.f2662a, h.m(32));
            lVarP.e(733328855);
            e0 e0VarG = d.g(f1.b.f11020a.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            a<a2.g> aVarA = aVar.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarI);
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
            u3.b(lVarA, e0VarG, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            p<a2.g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar = f.f2502a;
            TextComponentStyle.Companion companion = TextComponentStyle.Companion;
            j0.a aVar2 = j0.f14524b;
            ColorScheme colorScheme = new ColorScheme(new ColorInfo.Hex(l0.i(aVar2.a())), (ColorInfo) null, 2, (j) null);
            FontSize fontSize = FontSize.BODY_M;
            FontWeight fontWeight = FontWeight.REGULAR;
            HorizontalAlignment horizontalAlignment = HorizontalAlignment.CENTER;
            ColorScheme colorScheme2 = new ColorScheme(new ColorInfo.Hex(l0.i(aVar2.l())), (ColorInfo) null, 2, (j) null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            List listP = nd.u.p(companion.invoke(true, "Hello", colorScheme, fontSize, fontWeight, null, horizontalAlignment, horizontalAlignment, colorScheme2, new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), new Padding(0.0d, 24.0d, 0.0d, 24.0d), lVarP, 1222340150, 456), companion.invoke(true, "World", new ColorScheme(new ColorInfo.Hex(l0.i(aVar2.a())), (ColorInfo) null, 2, (j) null), fontSize, fontWeight, null, horizontalAlignment, horizontalAlignment, new ColorScheme(new ColorInfo.Hex(l0.i(aVar2.b())), (ColorInfo) null, 2, (j) null), new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), new Padding(0.0d, 0.0d, 0.0d, 0.0d), lVarP, 1222340150, 456));
            Dimension.ZLayer zLayer = new Dimension.ZLayer(TwoDimensionalAlignment.BOTTOM_TRAILING);
            Size size = new Size(fit, fit);
            float f10 = 16;
            float fM = h.m(f10);
            BackgroundStyle.Color colorM92boximpl = BackgroundStyle.Color.m92boximpl(BackgroundStyle.Color.m93constructorimpl(ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar2.h()))));
            y yVarA = m.a(h.m(f10));
            y yVarA2 = m.a(h.m(f10));
            float f11 = 20;
            l0.f fVarC = l0.g.c(h.m(f11));
            BorderStyle borderStyle = new BorderStyle(h.m(2), ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar2.b())), null);
            ColorStyle.Solid solidM117boximpl = ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar2.a()));
            float fM2 = h.m(f11);
            float f12 = 5;
            StackComponentStyle stackComponentStyle = new StackComponentStyle(true, listP, zLayer, size, fM, colorM92boximpl, yVarA, yVarA2, fVarC, borderStyle, new ShadowStyle(solidM117boximpl, fM2, h.m(f12), h.m(f12), null), null);
            lVar2 = lVarP;
            StackComponentView(stackComponentStyle, null, lVar2, 0, 2);
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
        o2VarV.a(new C06482(i10));
    }

    private static final List<TextComponentStyle> previewChildren(l lVar, int i10) {
        lVar.e(-407337990);
        if (o.I()) {
            o.U(-407337990, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.previewChildren (StackComponentView.kt:216)");
        }
        TextComponentStyle.Companion companion = TextComponentStyle.Companion;
        j0.a aVar = j0.f14524b;
        ColorScheme colorScheme = new ColorScheme(new ColorInfo.Hex(l0.i(aVar.a())), (ColorInfo) null, 2, (j) null);
        FontSize fontSize = FontSize.BODY_M;
        FontWeight fontWeight = FontWeight.REGULAR;
        HorizontalAlignment horizontalAlignment = HorizontalAlignment.CENTER;
        ColorScheme colorScheme2 = new ColorScheme(new ColorInfo.Hex(l0.i(aVar.b())), (ColorInfo) null, 2, (j) null);
        SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
        List<TextComponentStyle> listP = nd.u.p(companion.invoke(true, "Hello", colorScheme, fontSize, fontWeight, null, horizontalAlignment, horizontalAlignment, colorScheme2, new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), new Padding(0.0d, 0.0d, 0.0d, 0.0d), lVar, 1222340150, 456), companion.invoke(true, "World", new ColorScheme(new ColorInfo.Hex(l0.i(aVar.a())), (ColorInfo) null, 2, (j) null), fontSize, fontWeight, null, horizontalAlignment, horizontalAlignment, new ColorScheme(new ColorInfo.Hex(l0.i(aVar.b())), (ColorInfo) null, 2, (j) null), new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), new Padding(0.0d, 0.0d, 0.0d, 0.0d), lVar, 1222340150, 456));
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return listP;
    }
}
