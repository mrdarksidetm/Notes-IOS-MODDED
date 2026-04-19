package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import l1.j0;
import md.i0;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class IntroEligibilityStateViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt$IntroEligibilityPreviewBothTextsEligibleMultipleOffers$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            IntroEligibilityStateViewKt.IntroEligibilityPreviewBothTextsEligibleMultipleOffers(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt$IntroEligibilityPreviewBothTextsEligibleSingleOffer$1, reason: invalid class name and case insensitive filesystem */
    static final class C06621 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06621(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            IntroEligibilityStateViewKt.IntroEligibilityPreviewBothTextsEligibleSingleOffer(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt$IntroEligibilityPreviewBothTextsIneligible$1, reason: invalid class name and case insensitive filesystem */
    static final class C06631 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06631(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            IntroEligibilityStateViewKt.IntroEligibilityPreviewBothTextsIneligible(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt$IntroEligibilityPreviewNoOffer$1, reason: invalid class name and case insensitive filesystem */
    static final class C06641 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06641(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            IntroEligibilityStateViewKt.IntroEligibilityPreviewNoOffer(lVar, e2.a(this.$$changed | 1));
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IntroOfferEligibility.values().length];
            try {
                iArr[IntroOfferEligibility.SINGLE_OFFER_ELIGIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IntroOfferEligibility.MULTIPLE_OFFERS_ELIGIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IntroEligibilityPreviewBothTextsEligibleMultipleOffers(l lVar, int i10) {
        l lVarP = lVar.p(-420223294);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-420223294, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewBothTextsEligibleMultipleOffers (IntroEligibilityStateView.kt:113)");
            }
            m154IntroEligibilityStateViewQETHhvg("$3.99/mo", "7 day trial, then $3.99/mo", "7 days for free, then $1.99 for your first month, and just $4.99/mo thereafter.", IntroOfferEligibility.MULTIPLE_OFFERS_ELIGIBLE, j0.f14524b.a(), null, null, null, false, null, lVarP, 28086, 992);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IntroEligibilityPreviewBothTextsEligibleSingleOffer(l lVar, int i10) {
        l lVarP = lVar.p(1448735195);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1448735195, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewBothTextsEligibleSingleOffer (IntroEligibilityStateView.kt:101)");
            }
            m154IntroEligibilityStateViewQETHhvg("$3.99/mo", "7 day trial, then $3.99/mo", "7 days for free, then $1.99 for your first month, and just $3.99/mo thereafter.", IntroOfferEligibility.SINGLE_OFFER_ELIGIBLE, j0.f14524b.a(), null, null, null, false, null, lVarP, 28086, 992);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06621(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IntroEligibilityPreviewBothTextsIneligible(l lVar, int i10) {
        l lVarP = lVar.p(170689540);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(170689540, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewBothTextsIneligible (IntroEligibilityStateView.kt:89)");
            }
            m154IntroEligibilityStateViewQETHhvg("$3.99/mo", "7 day trial, then $3.99/mo", "7 days for free, then $1.99 for your first month, and just $4.99/mo thereafter.", IntroOfferEligibility.INELIGIBLE, j0.f14524b.a(), null, null, null, false, null, lVarP, 28086, 992);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06631(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IntroEligibilityPreviewNoOffer(l lVar, int i10) {
        l lVarP = lVar.p(-255198870);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-255198870, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewNoOffer (IntroEligibilityStateView.kt:77)");
            }
            m154IntroEligibilityStateViewQETHhvg("$3.99/mo", null, null, IntroOfferEligibility.SINGLE_OFFER_ELIGIBLE, j0.f14524b.a(), null, null, null, false, null, lVarP, 28086, 992);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06641(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    /* JADX INFO: renamed from: IntroEligibilityStateView-QETHhvg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m154IntroEligibilityStateViewQETHhvg(java.lang.String r28, java.lang.String r29, java.lang.String r30, com.revenuecat.purchases.ui.revenuecatui.composables.IntroOfferEligibility r31, long r32, i2.g0 r34, n2.i0 r35, u2.i r36, boolean r37, androidx.compose.ui.e r38, t0.l r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt.m154IntroEligibilityStateViewQETHhvg(java.lang.String, java.lang.String, java.lang.String, com.revenuecat.purchases.ui.revenuecatui.composables.IntroOfferEligibility, long, i2.g0, n2.i0, u2.i, boolean, androidx.compose.ui.e, t0.l, int, int):void");
    }

    public static final String introEligibilityText(IntroOfferEligibility introOfferEligibility, String str, String str2, String str3) {
        r.f(introOfferEligibility, "eligibility");
        int i10 = WhenMappings.$EnumSwitchMapping$0[introOfferEligibility.ordinal()];
        if (i10 == 1) {
            str2 = str;
        } else if (i10 != 2) {
            str2 = str3;
        }
        return str2 == null ? str3 == null ? str == null ? "" : str : str3 : str2;
    }
}
