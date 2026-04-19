package com.revenuecat.purchases.ui.revenuecatui.composables;

import a.a;
import ae.r;
import ae.s;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.e;
import b2.k0;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallModeKt;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt;
import h0.c;
import md.i0;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import w2.d;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallBackgroundKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PaywallBackgroundKt$PaywallBackground$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration $templateConfiguration;
        final /* synthetic */ c $this_PaywallBackground;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(c cVar, TemplateConfiguration templateConfiguration, int i10) {
            super(2);
            this.$this_PaywallBackground = cVar;
            this.$templateConfiguration = templateConfiguration;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            PaywallBackgroundKt.PaywallBackground(this.$this_PaywallBackground, this.$templateConfiguration, lVar, e2.a(this.$$changed | 1));
        }
    }

    public static final void PaywallBackground(c cVar, TemplateConfiguration templateConfiguration, l lVar, int i10) {
        r.f(cVar, "<this>");
        r.f(templateConfiguration, "templateConfiguration");
        l lVarP = lVar.p(-1106841354);
        if (o.I()) {
            o.U(-1106841354, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallBackground (PaywallBackground.kt:23)");
        }
        boolean z10 = Build.VERSION.SDK_INT >= 31;
        boolean blurredBackgroundImage = templateConfiguration.getConfiguration().getBlurredBackgroundImage();
        float f10 = blurredBackgroundImage ? 0.7f : 1.0f;
        lVarP.e(1448806114);
        a aVar = (!blurredBackgroundImage || z10) ? null : new a((Context) lVarP.P(androidx.compose.ui.platform.r.g()), m178toFloatPx8Feqmps(BackgroundUIConstants.INSTANCE.m143getBlurSizeD9Ej5fM(), lVarP, 6));
        lVarP.K();
        e eVarConditional = ModifierExtensionsKt.conditional(cVar.a(e.f2662a), blurredBackgroundImage && z10, PaywallBackgroundKt$PaywallBackground$modifier$1.INSTANCE);
        if (r.b(templateConfiguration.getConfiguration().getImages().getBackground(), PaywallDataExtensionsKt.getDefaultBackgroundPlaceholder(PaywallData.Companion))) {
            lVarP.e(1448806670);
            RemoteImageKt.LocalImage(R.drawable.default_background, eVarConditional, BackgroundUIConstants.INSTANCE.getContentScale(), null, aVar, f10, lVarP, 33152, 8);
        } else if (templateConfiguration.getImages().getBackgroundUri() != null) {
            lVarP.e(1448807015);
            if (blurredBackgroundImage || PaywallModeKt.isFullScreen(templateConfiguration.getMode())) {
                String string = templateConfiguration.getImages().getBackgroundUri().toString();
                r.e(string, "templateConfiguration.im….backgroundUri.toString()");
                RemoteImageKt.RemoteImage(string, eVarConditional, null, BackgroundUIConstants.INSTANCE.getContentScale(), null, aVar, f10, lVarP, 265216, 20);
            }
        } else {
            lVarP.e(1448807504);
        }
        lVarP.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(cVar, templateConfiguration, i10));
    }

    /* JADX INFO: renamed from: toFloatPx-8Feqmps, reason: not valid java name */
    private static final float m178toFloatPx8Feqmps(float f10, l lVar, int i10) {
        lVar.e(452796480);
        if (o.I()) {
            o.U(452796480, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.toFloatPx (PaywallBackground.kt:73)");
        }
        float density = f10 * ((d) lVar.P(k0.c())).getDensity();
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return density;
    }
}
