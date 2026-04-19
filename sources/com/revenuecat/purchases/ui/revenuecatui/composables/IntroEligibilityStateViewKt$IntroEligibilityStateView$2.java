package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import androidx.compose.ui.e;
import i2.g0;
import md.i0;
import t0.e2;
import t0.l;
import u2.i;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class IntroEligibilityStateViewKt$IntroEligibilityStateView$2 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ IntroOfferEligibility $eligibility;
    final /* synthetic */ n2.i0 $fontWeight;
    final /* synthetic */ e $modifier;
    final /* synthetic */ g0 $style;
    final /* synthetic */ i $textAlign;
    final /* synthetic */ String $textWithIntroOffer;
    final /* synthetic */ String $textWithMultipleIntroOffers;
    final /* synthetic */ String $textWithNoIntroOffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IntroEligibilityStateViewKt$IntroEligibilityStateView$2(String str, String str2, String str3, IntroOfferEligibility introOfferEligibility, long j10, g0 g0Var, n2.i0 i0Var, i iVar, boolean z10, e eVar, int i10, int i11) {
        super(2);
        this.$textWithNoIntroOffer = str;
        this.$textWithIntroOffer = str2;
        this.$textWithMultipleIntroOffers = str3;
        this.$eligibility = introOfferEligibility;
        this.$color = j10;
        this.$style = g0Var;
        this.$fontWeight = i0Var;
        this.$textAlign = iVar;
        this.$allowLinks = z10;
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
        IntroEligibilityStateViewKt.m154IntroEligibilityStateViewQETHhvg(this.$textWithNoIntroOffer, this.$textWithIntroOffer, this.$textWithMultipleIntroOffers, this.$eligibility, this.$color, this.$style, this.$fontWeight, this.$textAlign, this.$allowLinks, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
    }
}
