package com.revenuecat.purchases.ui.revenuecatui.fonts;

import ae.r;
import ae.s;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.ui.revenuecatui.extensions.TypographyExtensionsKt;
import md.i0;
import q0.y;
import q0.z;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallThemeKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallThemeKt$PaywallTheme$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p<l, Integer, i0> $content;
        final /* synthetic */ FontProvider $fontProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(FontProvider fontProvider, p<? super l, ? super Integer, i0> pVar, int i10) {
            super(2);
            this.$fontProvider = fontProvider;
            this.$content = pVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            PaywallThemeKt.PaywallTheme(this.$fontProvider, this.$content, lVar, e2.a(this.$$changed | 1));
        }
    }

    public static final void PaywallTheme(FontProvider fontProvider, p<? super l, ? super Integer, i0> pVar, l lVar, int i10) {
        int i11;
        r.f(pVar, "content");
        l lVarP = lVar.p(1433874321);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(fontProvider) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.k(pVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1433874321, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallTheme (PaywallTheme.kt:7)");
            }
            if (fontProvider == null) {
                lVarP.e(-1201098103);
                pVar.invoke(lVarP, Integer.valueOf((i11 >> 3) & 14));
            } else {
                lVarP.e(-1201098072);
                y yVar = y.f18928a;
                int i12 = y.f18929b;
                z.a(yVar.a(lVarP, i12 | 0), yVar.b(lVarP, i12 | 0), TypographyExtensionsKt.copyWithFontProvider(yVar.c(lVarP, i12 | 0), fontProvider), pVar, lVarP, (i11 << 6) & 7168, 0);
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
        o2VarV.a(new AnonymousClass1(fontProvider, pVar, i10));
    }
}
