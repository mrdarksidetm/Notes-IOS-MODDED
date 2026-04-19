package com.revenuecat.purchases.ui.revenuecatui.components;

import ae.r;
import ae.s;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt;
import md.i0;
import md.q;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ComponentViewKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewKt$ComponentView$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ ComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComponentStyle componentStyle, e eVar, int i10, int i11) {
            super(2);
            this.$style = componentStyle;
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
            ComponentViewKt.ComponentView(this.$style, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final /* synthetic */ void ComponentView(ComponentStyle componentStyle, e eVar, l lVar, int i10, int i11) {
        int i12;
        r.f(componentStyle, "style");
        l lVarP = lVar.p(1567117048);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.N(componentStyle) ? 4 : 2) | i10;
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
                o.U(1567117048, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.components.ComponentView (ComponentView.kt:21)");
            }
            if (componentStyle instanceof StackComponentStyle) {
                lVarP.e(-806939805);
                StackComponentViewKt.StackComponentView((StackComponentStyle) componentStyle, eVar, lVarP, i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0);
            } else if (componentStyle instanceof TextComponentStyle) {
                lVarP.e(-806939721);
                TextComponentViewKt.TextComponentView((TextComponentStyle) componentStyle, eVar, lVarP, i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0);
            } else if (componentStyle instanceof ImageComponentStyle) {
                lVarP.e(-806939637);
                ImageComponentViewKt.ImageComponentView((ImageComponentStyle) componentStyle, eVar, lVarP, i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0);
            } else {
                if (!(componentStyle instanceof ButtonComponentStyle)) {
                    lVarP.e(-806940948);
                    lVarP.K();
                    throw new q();
                }
                lVarP.e(-806939551);
                ButtonComponentViewKt.ButtonComponentView((ButtonComponentStyle) componentStyle, eVar, lVarP, i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0);
            }
            lVarP.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(componentStyle, eVar, i10, i11));
    }
}
